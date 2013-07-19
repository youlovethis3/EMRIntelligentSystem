package edu.cmu.lti.uima.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.precyse.freedom.uima.types.ICD10DC;
import com.precyse.freedom.uima.types.SNOMED;

public class BagRuleAnnotator extends JCasAnnotator_ImplBase {
	
	Map<List<String>,List<String>> s2iMap;
	String[] ruleSources;
	
	public void initialize( UimaContext aContext ) throws ResourceInitializationException {
		  super.initialize( aContext );
		  String xmlRuleFolderName = (String) aContext.getConfigParameterValue( "xmlRuleFolder" );
		  s2iMap = XMLRuleFactory.parseRuleFiles( xmlRuleFolderName ); 
	}
	
	public void annotateSM( JCas jcas , String text , String pattern , String id ) {
		Pattern p = Pattern.compile( pattern );
		Matcher m = p.matcher( text );
		while ( m.find() ) {
			SNOMED a = new SNOMED( jcas , m.start(), m.end() );
			a.setConceptID( id );
			a.addToIndexes();
		}
	}

	public void process( JCas jcas ) throws AnalysisEngineProcessException {

		System.out.println( "BagRuleAnnotator.process()" );
		
		// Annotate source codes for rules.
		String text = jcas.getDocumentText();
		annotateSM( jcas , text , "postinfectious hypothyroidism" , "123976001" );
		annotateSM( jcas , text , "hypothyroidism" , "40930008" );
		annotateSM( jcas , text , "maxillary sinusitis" , "88348008" );
		annotateSM( jcas , text , "recurrent" , "255227004" );
		annotateSM( jcas , text , "pain" , "22253000" );
		annotateSM( jcas , text , "limb" , "243996003" );
		annotateSM( jcas , text , "neoplasm" , "55342001" );
		annotateSM( jcas , text , "fatigue" , "84229001" );

		// Iterate over CAS to fire bag rules.
		AnnotationIndex<?> smIndex = jcas.getAnnotationIndex( com.precyse.freedom.uima.types.SNOMED.type );
		FSIterator<?> iterator = smIndex.iterator();
		List<String> smCodes = new ArrayList<String>();
		while ( iterator.hasNext() ) {
			SNOMED c = (SNOMED)iterator.next();
			String id = c.getConceptID();
			System.out.println( "SNOMED id: " + id );
			smCodes.add( id );
		}
		for ( List<String> key : s2iMap.keySet() ) {
			if ( matchSMCodes( key , smCodes ) ) {
				for ( String i10id : s2iMap.get( key ) ) {
					ICD10DC i10 = new ICD10DC( jcas , 0 , text.length() );
					i10.setCode( i10id );
					System.out.println( "Matched, adding I10 code: " + i10id );
					i10.addToIndexes();
				}
			}
		}
		
	}
	
	private boolean matchSMCodes( List<String> smIds , List<String> smCodes ) {
		System.out.println( "Looking for rule codes: " + smIds +  " in bag: " + smCodes );
		for ( String id : smIds )
			if ( ! smCodes.contains( id ) )
				return false;
		return true;

	}
}