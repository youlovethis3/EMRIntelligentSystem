package edu.cmu.lti.uima.rules;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;

import com.precyse.freedom.uima.types.ICD10DC;

public class MetricsAnnotator extends JCasAnnotator_ImplBase {
	
	@Override
	public void process( JCas jcas ) throws AnalysisEngineProcessException {
		Type type = jcas.getTypeSystem().getType( "com.precyse.freedom.uima.types.ICD10DC" );
		AnnotationIndex<?> index = jcas.getAnnotationIndex( type );
		FSIterator<?> iterator = index.iterator();
		List<ICD10DC> goldLabels = new ArrayList<ICD10DC>();
		List<ICD10DC> testLabels = new ArrayList<ICD10DC>();
		while ( iterator.hasNext() ) {
			ICD10DC c = (ICD10DC)iterator.next();
			if ( c.getSource() != null && c.getSource().equals( "GS" ) ) {
				goldLabels.add( c );
			} else if ( c.getSource() != null && c.getSource().equals( "DRG" ) ) {
				testLabels.add( c );
			}
		}
		double precision = EvalUtils.calculatePrecision( testLabels , goldLabels );
		double recall = EvalUtils.calculateRecall( testLabels , goldLabels );
		System.out.println( "Precision: " + precision );
		System.out.println( "Recall: " + recall );
	}

}
