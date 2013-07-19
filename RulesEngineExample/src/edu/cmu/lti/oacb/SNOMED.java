

/* First created by JCasGen Sun Oct 21 20:03:24 EDT 2012 */
package edu.cmu.lti.oacb;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Tue Oct 23 23:15:22 EDT 2012
 * XML source: /Users/yangjarydu/Documents/workspace/EMRCoding/desc/ICD/ICDannotator.xml
 * @generated */
public class SNOMED extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SNOMED.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SNOMED() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SNOMED(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SNOMED(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SNOMED(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: id

  /** getter for id - gets ID of SNOMED coding
   * @generated */
  public String getId() {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.oacb.SNOMED");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SNOMED_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets ID of SNOMED coding 
   * @generated */
  public void setId(String v) {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.oacb.SNOMED");
    jcasType.ll_cas.ll_setStringValue(addr, ((SNOMED_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: concept_id

  /** getter for concept_id - gets Concept ID of SNOMED coding
   * @generated */
  public int getConcept_id() {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_concept_id == null)
      jcasType.jcas.throwFeatMissing("concept_id", "edu.cmu.lti.oacb.SNOMED");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SNOMED_Type)jcasType).casFeatCode_concept_id);}
    
  /** setter for concept_id - sets Concept ID of SNOMED coding 
   * @generated */
  public void setConcept_id(int v) {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_concept_id == null)
      jcasType.jcas.throwFeatMissing("concept_id", "edu.cmu.lti.oacb.SNOMED");
    jcasType.ll_cas.ll_setIntValue(addr, ((SNOMED_Type)jcasType).casFeatCode_concept_id, v);}    
   
    
  //*--------------*
  //* Feature: fully_specified_name

  /** getter for fully_specified_name - gets Fully specified name of SNOMED coding
   * @generated */
  public String getFully_specified_name() {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_fully_specified_name == null)
      jcasType.jcas.throwFeatMissing("fully_specified_name", "edu.cmu.lti.oacb.SNOMED");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SNOMED_Type)jcasType).casFeatCode_fully_specified_name);}
    
  /** setter for fully_specified_name - sets Fully specified name of SNOMED coding 
   * @generated */
  public void setFully_specified_name(String v) {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_fully_specified_name == null)
      jcasType.jcas.throwFeatMissing("fully_specified_name", "edu.cmu.lti.oacb.SNOMED");
    jcasType.ll_cas.ll_setStringValue(addr, ((SNOMED_Type)jcasType).casFeatCode_fully_specified_name, v);}    
   
    
  //*--------------*
  //* Feature: preferred_term_id

  /** getter for preferred_term_id - gets Preferred term description ID of SNOMED coding
   * @generated */
  public int getPreferred_term_id() {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_preferred_term_id == null)
      jcasType.jcas.throwFeatMissing("preferred_term_id", "edu.cmu.lti.oacb.SNOMED");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SNOMED_Type)jcasType).casFeatCode_preferred_term_id);}
    
  /** setter for preferred_term_id - sets Preferred term description ID of SNOMED coding 
   * @generated */
  public void setPreferred_term_id(int v) {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_preferred_term_id == null)
      jcasType.jcas.throwFeatMissing("preferred_term_id", "edu.cmu.lti.oacb.SNOMED");
    jcasType.ll_cas.ll_setIntValue(addr, ((SNOMED_Type)jcasType).casFeatCode_preferred_term_id, v);}    
   
    
  //*--------------*
  //* Feature: preferred_term_description

  /** getter for preferred_term_description - gets Preferred term description of SNOMED coding
   * @generated */
  public String getPreferred_term_description() {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_preferred_term_description == null)
      jcasType.jcas.throwFeatMissing("preferred_term_description", "edu.cmu.lti.oacb.SNOMED");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SNOMED_Type)jcasType).casFeatCode_preferred_term_description);}
    
  /** setter for preferred_term_description - sets Preferred term description of SNOMED coding 
   * @generated */
  public void setPreferred_term_description(String v) {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_preferred_term_description == null)
      jcasType.jcas.throwFeatMissing("preferred_term_description", "edu.cmu.lti.oacb.SNOMED");
    jcasType.ll_cas.ll_setStringValue(addr, ((SNOMED_Type)jcasType).casFeatCode_preferred_term_description, v);}    
   
    
  //*--------------*
  //* Feature: synonyms

  /** getter for synonyms - gets synonyms of SNOMED code
   * @generated */
  public StringArray getSynonyms() {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SNOMED_Type)jcasType).casFeatCode_synonyms)));}
    
  /** setter for synonyms - sets synonyms of SNOMED code 
   * @generated */
  public void setSynonyms(StringArray v) {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    jcasType.ll_cas.ll_setRefValue(addr, ((SNOMED_Type)jcasType).casFeatCode_synonyms, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for synonyms - gets an indexed value - synonyms of SNOMED code
   * @generated */
  public String getSynonyms(int i) {
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SNOMED_Type)jcasType).casFeatCode_synonyms), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SNOMED_Type)jcasType).casFeatCode_synonyms), i);}

  /** indexed setter for synonyms - sets an indexed value - synonyms of SNOMED code
   * @generated */
  public void setSynonyms(int i, String v) { 
    if (SNOMED_Type.featOkTst && ((SNOMED_Type)jcasType).casFeat_synonyms == null)
      jcasType.jcas.throwFeatMissing("synonyms", "edu.cmu.lti.oacb.SNOMED");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SNOMED_Type)jcasType).casFeatCode_synonyms), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SNOMED_Type)jcasType).casFeatCode_synonyms), i, v);}
  }

    