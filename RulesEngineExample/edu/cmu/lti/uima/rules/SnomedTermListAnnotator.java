package edu.cmu.lti.uima.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import com.precyse.freedom.uima.types.SNOMED;

public class SnomedTermListAnnotator  extends JCasAnnotator_ImplBase {
	
	private static String SOURCE_COMPONENT = "SnomedTermListAnnotator";
	
	public void annotateSM( JCas jcas , String text , String pattern , String id ) {
		Pattern p = Pattern.compile( pattern );
		Matcher m = p.matcher( text );
		while ( m.find() ) {
			SNOMED a = new SNOMED( jcas , m.start(), m.end() );
			a.setSource( SOURCE_COMPONENT );
			a.setConceptID( id );
			a.addToIndexes();
		}
	}

	@Override
	public void process( JCas jcas ) throws AnalysisEngineProcessException {
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
	}

}
