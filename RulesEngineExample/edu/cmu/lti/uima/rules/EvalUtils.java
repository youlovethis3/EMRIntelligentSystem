package edu.cmu.lti.uima.rules;

import java.util.List;

import com.precyse.freedom.uima.types.ICD10DC;

public class EvalUtils {
	public static double calculateRecall ( List<ICD10DC> test , List<ICD10DC> gold ) {
		double total = (double)gold.size();
		if ( total == 0 ) return 1.0d;
		double totalFound = 0.0d;
		for ( ICD10DC a : gold )
			if ( findAnnotation( a , test ) ) totalFound++;
		return totalFound / total ;
	}
	public static double calculatePrecision ( List<ICD10DC> test , List<ICD10DC> gold ) {
		double total = (double)test.size();
		if ( total == 0 ) return 1.0d;
		double totalCorrect = 0.0d;
		for ( ICD10DC a : test )
			if ( findAnnotation( a , gold ) ) totalCorrect++;
		return totalCorrect / total;
	}
	public static boolean findAnnotation( ICD10DC a , List<ICD10DC> aList ) {
		for ( ICD10DC tag : aList ) 
			if ( tag.getCode().equals( a.getCode() ) )
				return true;
		return false;			
	}
}
