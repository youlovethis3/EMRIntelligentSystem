package edu.cmu.lti.uima.rules;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLRuleFactory {
	private static boolean VERBOSE = true;
	public static Map<List<String>,List<String>> parseRuleFiles ( String dirpath ) {
		int totalFiles = 0;
		int totalRules = 0;
		int skipTotal = 0;
		Map<List<String>,List<String>> result = new HashMap<List<String>,List<String>>();
		File d = new File( dirpath );
		if (! d.isDirectory() ) throw new RuntimeException( "Not a directory: " + dirpath );
		if (! d.canRead() ) throw new RuntimeException( "Directory can't be read: " + dirpath );
		String[] files = d.list();
		for ( String file : files ) {
			totalFiles++;
			File ruleFile = new File( d , file );
			List<BagRule> rules = XMLRuleFactory.parseRuleFile( ruleFile );
			if ( rules == null ) {
				System.out.println( "Error parsing file, skipping: " + file );
				skipTotal++;
			} else {
				if ( VERBOSE ) System.out.println( "Read " + rules.size() + " rules from " + file );
				totalRules += rules.size() ;
				XMLRuleFactory.addBagRules( rules , result );
			}
		}
		System.out.println( "Read " + totalRules + " rule(s) from " + totalFiles + " file(s), skipped " + skipTotal + " file(s) with exceptions." );
		return result;
	}
	public static Map<List<String>,List<String>> parseMappingFiles ( String dirpath ) {
		int totalFiles = 0;
		int totalRules = 0;
		int skipTotal = 0;
		Map<List<String>,List<String>> result = new HashMap<List<String>,List<String>>();
		File d = new File( dirpath );
		if (! d.isDirectory() ) throw new RuntimeException( "Not a directory: " + dirpath );
		if (! d.canRead() ) throw new RuntimeException( "Directory can't be read: " + dirpath );
		String[] files = d.list();
		for ( String file : files ) {
			totalFiles++;
			File ruleFile = new File( d , file );
			String ruleCode = ruleFile.getName().replace( ".txt.xml" , "" );
			List<Rule> rules = XMLRuleFactory.parseMappingFile( ruleFile , ruleCode );
			if ( rules == null ) {
				System.out.println( "Error parsing file, skipping: " + file );
				skipTotal++;
			} else {
				if ( VERBOSE ) System.out.println( "Read " + rules.size() + " rules from " + file );
				totalRules += rules.size();
				XMLRuleFactory.addMappingRules( rules , result );
			}
		}
		System.out.println( "Read " + totalRules + " mappings from " + totalFiles + " files, skipped " + skipTotal + " files with exceptions." );
		return result;
	}
	private static void addMappingRules ( List<Rule> rules , Map<List<String>,List<String>> map ) {
		for ( Rule r : rules ) {
			String smCode = r.smCode;
			String i10Code = r.i10Code;
			String source = r.source;
			List<String> key = new ArrayList<String>();
			key.add( smCode );
			key.add( source );
			List<String> currentValue = map.get( key );
			if ( currentValue == null ) {
				currentValue = new ArrayList<String>();
				currentValue.add( i10Code );
				map.put( key , currentValue );
			} else {
				if (! currentValue.contains( i10Code ) ) currentValue.add( i10Code );
			}
		}
	}
	private static void addBagRules ( List<BagRule> rules , Map<List<String>,List<String>> map ) {
		for ( BagRule r : rules ) {
			List<String> smCodes = r.smCodes;
			String i10Code = r.i10Code;
			List<String> key = smCodes;
			List<String> currentValue = map.get( key );
			if ( currentValue == null ) {
				currentValue = new ArrayList<String>();
				currentValue.add( i10Code );
				map.put( key , currentValue );
			} else {
				if (! currentValue.contains( i10Code ) ) currentValue.add( i10Code );
			}
		}
	}
	public static List<Rule> parseMappingFile ( File file , String ruleCode ) {
		Element rootNode = getXMLElement( file );
		if ( rootNode == null ) return null;
		List<Rule> result = parseMappingXMLElement( rootNode , ruleCode );		
		return result;		
	}
	public static List<BagRule> parseRuleFile ( File file ) {
		Element rootNode = getXMLElement( file );
		if ( rootNode == null ) return null;
		List<BagRule> result = parseRuleXMLElement( rootNode );		
		return result;		
	}
	private static List<Rule> parseMappingXMLElement( Element rootNode , String ruleCode ) {
		List<String> smCodes = new ArrayList<String>();
		List<String> i10Codes = new ArrayList<String>();
		List<Rule> result = new ArrayList<Rule>();
		Element smNode = getFirstChild( rootNode , "SNOMED" );
		NodeList smCodeNodes = smNode.getElementsByTagName( "SNOMEDCode");
		for ( int i = 0 ; i < smCodeNodes.getLength(); i++ ) {
			Element smCodeNode = (Element)smCodeNodes.item( i );
			String id = smCodeNode.getAttribute( "ID" );
			if ( smCodes.contains( id ) ) continue;
			smCodes.add( id );
		}
		Element i10Node = getFirstChild( rootNode , "ICD10" );
		NodeList i10CodeNodes = i10Node.getElementsByTagName( "ICD10Code");
		for ( int i = 0 ; i < i10CodeNodes.getLength() ; i++ ) {
			Element i10CodeNode = (Element)i10CodeNodes.item( i );
			String id = i10CodeNode.getAttribute( "ID" );
			// add the decimal point left out in current rule mappings...
			id = fixI10Id( id );
			if ( i10Codes.contains( id ) ) continue;
			i10Codes.add( id );
		}
		for ( String smCode : smCodes ) {
			result.add( new Rule( smCode , ruleCode , "GS"  ) );
			for ( String i10Code : i10Codes )
				result.add( new Rule( smCode , i10Code , "CLIX" ) );
		}
		return result;
	}
	private static List<BagRule> parseRuleXMLElement( Element rootNode ) {
		List<BagRule> result = new ArrayList<BagRule>();
		NodeList ruleNodes = rootNode.getElementsByTagName( "Rule" );
		for ( int i = 0 ; i < ruleNodes.getLength() ; i ++ ) {
			List<String> smCodes = new ArrayList<String>();
			List<String> i10Codes = new ArrayList<String>();
			Element ruleNode = (Element)ruleNodes.item( i );
			Element smNode = getFirstChild( ruleNode , "LHS" );
			NodeList smCodeNodes = smNode.getElementsByTagName( "SNOMEDCode");
			for ( int j = 0 ; j < smCodeNodes.getLength(); j++ ) {
				Element smCodeNode = (Element)smCodeNodes.item( j );
				String id = smCodeNode.getAttribute( "ID" );
				if ( smCodes.contains( id ) ) continue;
				smCodes.add( id );
			}
			Element i10Node = getFirstChild( rootNode , "RHS" );
			NodeList i10CodeNodes = i10Node.getElementsByTagName( "ICD10Code");
			for ( int k = 0 ; k < i10CodeNodes.getLength() ; k++ ) {
				Element i10CodeNode = (Element)i10CodeNodes.item( k );
				String id = i10CodeNode.getAttribute( "ID" );
				if ( i10Codes.contains( id ) ) continue;
				i10Codes.add( id );
			}
			for ( String i10Code : i10Codes )
				result.add( new BagRule( smCodes , i10Code , "RulesFile" ) );
		}
		System.out.println( "Rules initialized: " );
		 for ( BagRule r : result )
			 System.out.println( r );
		return result;
	}
	private static String fixI10Id ( String code ) {
		if ( code.length() < 4 ) return code;
		return code.substring( 0 , 3 ) + "." + code.substring ( 3 );
	}
	private static Element getXMLElement ( File file ) {
		try {
			Element node =  DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.parse( new FileInputStream( file ) )
				    .getDocumentElement();
			return node;
		} catch ( Exception e ) {
			return null;
		}
	}
	public static Element getFirstChild( Element e, String childElementName ) {
		if ( e == null ) return null;
		return (Element) e.getElementsByTagName( childElementName ).item(0);
	}
	public static void main ( String[] args ) {
		String dirpath = "data/ICD10-code-list-output";		
		Map<List<String>,List<String>> s2iMap = XMLRuleFactory.parseMappingFiles( dirpath );
		System.out.println( "s2i map has " + s2iMap.keySet().size() + " entries." );
	}
}
