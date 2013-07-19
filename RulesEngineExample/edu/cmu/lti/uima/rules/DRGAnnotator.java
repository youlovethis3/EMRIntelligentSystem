package edu.cmu.lti.uima.rules;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;

import com.precyse.freedom.uima.types.ICD10DC;

public class DRGAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process( JCas  jcas ) throws AnalysisEngineProcessException {
		AnnotationIndex<?> index = jcas.getAnnotationIndex( com.precyse.freedom.uima.types.ICD10DC.type );
		FSIterator<?> iterator = index.iterator();
		List<ICD10DC> goldStandard = new ArrayList<ICD10DC>();
		List<ICD10DC> testLabels = new ArrayList<ICD10DC>();
		while ( iterator.hasNext() ) {
			ICD10DC c = (ICD10DC)iterator.next();
			if ( c.getSource() != null && c.getSource().equals( "GS" ) ) {
				goldStandard.add( c );
			} else {
				System.out.println( "Source: " + c.getSource() + " Output Code: " + c.getCode() );
				testLabels.add( c );
			}
		}
		// Simple algorithm: All non-GS labels are output as DRG.
		for ( ICD10DC a : testLabels ) {
			ICD10DC output = new ICD10DC( jcas , a.getBegin() , a.getEnd() );
			output.setSource( "DRG" );
			output.setCode( a.getCode() );
			output.addToIndexes();			
		}
		
	}

}
