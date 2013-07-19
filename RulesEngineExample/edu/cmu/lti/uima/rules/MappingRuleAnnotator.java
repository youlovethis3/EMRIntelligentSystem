package edu.cmu.lti.uima.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.precyse.freedom.uima.types.ICD10DC;
import com.precyse.freedom.uima.types.SNOMED;

public class MappingRuleAnnotator extends JCasAnnotator_ImplBase {
	
	Map<List<String>,List<String>> s2iMap;
	String[] ruleSources;
	
	private static String SOURCE_COMPONENT = "MappingRuleAnnotator";
	
	public void initialize( UimaContext aContext ) throws ResourceInitializationException {
		  super.initialize( aContext );
		  String xmlRuleFolderName = (String) aContext.getConfigParameterValue( "xmlRuleFolder" );
		  ruleSources = (String[]) aContext.getConfigParameterValue( "ruleSources" );
		  s2iMap = XMLRuleFactory.parseMappingFiles( xmlRuleFolderName ); 
	}

	public void process( JCas jcas ) throws AnalysisEngineProcessException {

		AnnotationIndex<?> smIndex = jcas.getAnnotationIndex( com.precyse.freedom.uima.types.SNOMED.type );
		FSIterator<?> iterator = smIndex.iterator();
		while ( iterator.hasNext() ) {
			SNOMED c = (SNOMED)iterator.next();
			String id = c.getConceptID();
			for ( String ruleSource : ruleSources ) {
				List<String> key = new ArrayList<String>();
				key.add( id );
				key.add( ruleSource );
				List<String> mappings = s2iMap.get( key );
				if ( mappings == null ) continue;
				for ( String m : mappings ) {
					ICD10DC i = new ICD10DC( jcas , c.getBegin(), c.getEnd() );
					if ( ruleSource.equals( "GS" ) ) {
						i.setSource( ruleSource );
					} else {
						i.setSource( SOURCE_COMPONENT );
					}
					i.setCode( m );
					i.addToIndexes();
				}
			}

		}
		
	}

	
}