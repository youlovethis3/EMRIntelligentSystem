package edu.cmu.lti.uima.rules;

import java.util.List;

public class BagRule {
	String i10Code , source ;
	List<String> smCodes;
	public BagRule( List<String> smCodes , String i10Code , String source ) {
		this.smCodes = smCodes;
		this.i10Code = i10Code;
		this.source = source;
	}
	public String toString() {
		return "(" + smCodes + ") => " + i10Code;
	}
	
}
