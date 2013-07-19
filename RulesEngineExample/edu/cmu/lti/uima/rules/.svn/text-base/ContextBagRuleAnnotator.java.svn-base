package edu.cmu.lti.uima.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.TypeSystem;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import com.precyse.freedom.uima.types.ICD10DC;
import com.precyse.freedom.uima.types.SNOMED;

public class ContextBagRuleAnnotator extends JCasAnnotator_ImplBase {
	
	Map<List<String>,List<String>> s2iMap;
	String[] ruleSources;
	String contextType;
	
	private static String SOURCE_COMPONENT = "ContextBagRuleAnnotator";
	
	public void initialize( UimaContext aContext ) throws ResourceInitializationException {
		  super.initialize( aContext );
		  String xmlRuleFolderName = (String) aContext.getConfigParameterValue( "xmlRuleFolder" );
		  s2iMap = XMLRuleFactory.parseRuleFiles( xmlRuleFolderName ); 
		  contextType = (String) aContext.getConfigParameterValue( "contextType" );
	}

	public void process( JCas jcas ) throws AnalysisEngineProcessException {

		// Iterate over CAS to find SNOMED codes.
		AnnotationIndex<?> smIndex = jcas.getAnnotationIndex( com.precyse.freedom.uima.types.SNOMED.type );
		FSIterator<?> iterator = smIndex.iterator();
		List<Annotation> smCodes = new ArrayList<Annotation>();
		while ( iterator.hasNext() ) {
			Annotation c = (Annotation)iterator.next();
			smCodes.add( c );
		}
		// Iterate over CAS to find match contexts.
		TypeSystem ts = jcas.getTypeSystem();
		Type type = ts.getType( contextType );
		AnnotationIndex<?> cIndex = jcas.getAnnotationIndex( type );
		if ( cIndex == null ) return;
		FSIterator<?> iterator2 = cIndex.iterator();
		while ( iterator2.hasNext() ) {
			Annotation a = (Annotation)iterator2.next();
			int begin = a.getBegin();
			int end = a.getEnd();
			List<Annotation> inContext = annotationsInSpan( smCodes ,  begin , end );
			for ( List<String> key : s2iMap.keySet() ) {
				if ( matchSMCodes( key , inContext ) ) {
					for ( String i10id : s2iMap.get( key ) ) {
						ICD10DC i10 = new ICD10DC( jcas , 0 , jcas.getDocumentText().length() );
						i10.setCode( i10id );
						i10.setSource( SOURCE_COMPONENT );
						i10.addToIndexes(); 
					}
				}
			}
		}
	}
	
	private List<Annotation> annotationsInSpan( List<Annotation> codes , int begin , int end ) {
		List<Annotation> result = new ArrayList<Annotation>();
		for ( Annotation a : codes )
			if ( a.getBegin() >= begin && a.getEnd() <= end )
				result.add( a );
		return result;
	}
	private boolean matchSMCodes( List<String> smIds , List<Annotation> smCodes ) {
		for ( String id : smIds )
			if ( ! matchSMCode( id , smCodes ) ) return false;
		return true;
	}
	private boolean matchSMCode( String id , List<Annotation> smCodes ) {
		for ( Annotation a : smCodes ) 
			if ( id.equals( ((SNOMED)a).getConceptID() ) ) return true;
		return false;			
	}
}