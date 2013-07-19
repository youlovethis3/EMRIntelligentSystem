
/* First created by JCasGen Sun Oct 21 20:03:24 EDT 2012 */
package edu.cmu.lti.oacb;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 23 23:15:22 EDT 2012
 * @generated */
public class SNOMED_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SNOMED_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SNOMED_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SNOMED(addr, SNOMED_Type.this);
  			   SNOMED_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SNOMED(addr, SNOMED_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SNOMED.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.oacb.SNOMED");



  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "edu.cmu.lti.oacb.SNOMED");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "edu.cmu.lti.oacb.SNOMED");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_concept_id;
  /** @generated */
  final int     casFeatCode_concept_id;
  /** @generated */ 
  public int getConcept_id(int addr) {
        if (featOkTst && casFeat_concept_id == null)
      jcas.throwFeatMissing("concept_id", "edu.cmu.lti.oacb.SNOMED");
    return ll_cas.ll_getIntValue(addr, casFeatCode_concept_id);
  }
  /** @generated */    
  public void setConcept_id(int addr, int v) {
        if (featOkTst && casFeat_concept_id == null)
      jcas.throwFeatMissing("concept_id", "edu.cmu.lti.oacb.SNOMED");
    ll_cas.ll_setIntValue(addr, casFeatCode_concept_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fully_specified_name;
  /** @generated */
  final int     casFeatCode_fully_specified_name;
  /** @generated */ 
  public String getFully_specified_name(int addr) {
        if (featOkTst && casFeat_fully_specified_name == null)
      jcas.throwFeatMissing("fully_specified_name", "edu.cmu.lti.oacb.SNOMED");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fully_specified_name);
  }
  /** @generated */    
  public void setFully_specified_name(int addr, String v) {
        if (featOkTst && casFeat_fully_specified_name == null)
      jcas.throwFeatMissing("fully_specified_name", "edu.cmu.lti.oacb.SNOMED");
    ll_cas.ll_setStringValue(addr, casFeatCode_fully_specified_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_preferred_term_id;
  /** @generated */
  final int     casFeatCode_preferred_term_id;
  /** @generated */ 
  public int getPreferred_term_id(int addr) {
        if (featOkTst && casFeat_preferred_term_id == null)
      jcas.throwFeatMissing("preferred_term_id", "edu.cmu.lti.oacb.SNOMED");
    return ll_cas.ll_getIntValue(addr, casFeatCode_preferred_term_id);
  }
  /** @generated */    
  public void setPreferred_term_id(int addr, int v) {
        if (featOkTst && casFeat_preferred_term_id == null)
      jcas.throwFeatMissing("preferred_term_id", "edu.cmu.lti.oacb.SNOMED");
    ll_cas.ll_setIntValue(addr, casFeatCode_preferred_term_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_preferred_term_description;
  /** @generated */
  final int     casFeatCode_preferred_term_description;
  /** @generated */ 
  public String getPreferred_term_description(int addr) {
        if (featOkTst && casFeat_preferred_term_description == null)
      jcas.throwFeatMissing("preferred_term_description", "edu.cmu.lti.oacb.SNOMED");
    return ll_cas.ll_getStringValue(addr, casFeatCode_preferred_term_description);
  }
  /** @generated */    
  public void setPreferred_term_description(int addr, String v) {
        if (featOkTst && casFeat_preferred_term_description == null)
      jcas.throwFeatMissing("preferred_term_description", "edu.cmu.lti.oacb.SNOMED");
    ll_cas.ll_setStringValue(addr, casFeatCode_preferred_term_description, v);}
    
  
 
  /** @generated */
  final Feature casFeat_synonyms;
  /** @generated */
  final int     casFeatCode_synonyms;
  /** @generated */ 
  public int getSynonyms(int addr) {
        if (featOkTst && casFeat_synonyms == null)
      jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    return ll_cas.ll_getRefValue(addr, casFeatCode_synonyms);
  }
  /** @generated */    
  public void setSynonyms(int addr, int v) {
        if (featOkTst && casFeat_synonyms == null)
      jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    ll_cas.ll_setRefValue(addr, casFeatCode_synonyms, v);}
    
   /** @generated */
  public String getSynonyms(int addr, int i) {
        if (featOkTst && casFeat_synonyms == null)
      jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_synonyms), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_synonyms), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_synonyms), i);
  }
   
  /** @generated */ 
  public void setSynonyms(int addr, int i, String v) {
        if (featOkTst && casFeat_synonyms == null)
      jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_synonyms), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_synonyms), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_synonyms), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SNOMED_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_concept_id = jcas.getRequiredFeatureDE(casType, "concept_id", "uima.cas.Integer", featOkTst);
    casFeatCode_concept_id  = (null == casFeat_concept_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_concept_id).getCode();

 
    casFeat_fully_specified_name = jcas.getRequiredFeatureDE(casType, "fully_specified_name", "uima.cas.String", featOkTst);
    casFeatCode_fully_specified_name  = (null == casFeat_fully_specified_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fully_specified_name).getCode();

 
    casFeat_preferred_term_id = jcas.getRequiredFeatureDE(casType, "preferred_term_id", "uima.cas.Integer", featOkTst);
    casFeatCode_preferred_term_id  = (null == casFeat_preferred_term_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_preferred_term_id).getCode();

 
    casFeat_preferred_term_description = jcas.getRequiredFeatureDE(casType, "preferred_term_description", "uima.cas.String", featOkTst);
    casFeatCode_preferred_term_description  = (null == casFeat_preferred_term_description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_preferred_term_description).getCode();

 
    casFeat_synonyms = jcas.getRequiredFeatureDE(casType, "synonyms", "uima.cas.StringArray", featOkTst);
    casFeatCode_synonyms  = (null == casFeat_synonyms) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_synonyms).getCode();

  }
}



    