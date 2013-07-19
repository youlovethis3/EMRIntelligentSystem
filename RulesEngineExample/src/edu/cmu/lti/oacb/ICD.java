

/* First created by JCasGen Sun Oct 21 20:03:24 EDT 2012 */
package edu.cmu.lti.oacb;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 23 23:15:22 EDT 2012
 * XML source: /Users/yangjarydu/Documents/workspace/EMRCoding/desc/ICD/ICDannotator.xml
 * @generated */
public class ICD extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ICD.class);
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
  protected ICD() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ICD(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ICD(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ICD(JCas jcas, int begin, int end) {
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
  //* Feature: code

  /** getter for code - gets Full code of ICD-9-CM
   * @generated */
  public String getCode() {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_code == null)
      jcasType.jcas.throwFeatMissing("code", "edu.cmu.lti.oacb.ICD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ICD_Type)jcasType).casFeatCode_code);}
    
  /** setter for code - sets Full code of ICD-9-CM 
   * @generated */
  public void setCode(String v) {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_code == null)
      jcasType.jcas.throwFeatMissing("code", "edu.cmu.lti.oacb.ICD");
    jcasType.ll_cas.ll_setStringValue(addr, ((ICD_Type)jcasType).casFeatCode_code, v);}    
   
    
  //*--------------*
  //* Feature: code_type

  /** getter for code_type - gets Type of ICD-9-CM coding: 
1. null
2. E
3. V
   * @generated */
  public String getCode_type() {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_code_type == null)
      jcasType.jcas.throwFeatMissing("code_type", "edu.cmu.lti.oacb.ICD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ICD_Type)jcasType).casFeatCode_code_type);}
    
  /** setter for code_type - sets Type of ICD-9-CM coding: 
1. null
2. E
3. V 
   * @generated */
  public void setCode_type(String v) {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_code_type == null)
      jcasType.jcas.throwFeatMissing("code_type", "edu.cmu.lti.oacb.ICD");
    jcasType.ll_cas.ll_setStringValue(addr, ((ICD_Type)jcasType).casFeatCode_code_type, v);}    
   
    
  //*--------------*
  //* Feature: main_category_code

  /** getter for main_category_code - gets Main category cod of full ICD-9-CM code
   * @generated */
  public int getMain_category_code() {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_main_category_code == null)
      jcasType.jcas.throwFeatMissing("main_category_code", "edu.cmu.lti.oacb.ICD");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ICD_Type)jcasType).casFeatCode_main_category_code);}
    
  /** setter for main_category_code - sets Main category cod of full ICD-9-CM code 
   * @generated */
  public void setMain_category_code(int v) {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_main_category_code == null)
      jcasType.jcas.throwFeatMissing("main_category_code", "edu.cmu.lti.oacb.ICD");
    jcasType.ll_cas.ll_setIntValue(addr, ((ICD_Type)jcasType).casFeatCode_main_category_code, v);}    
   
    
  //*--------------*
  //* Feature: sub_category_I

  /** getter for sub_category_I - gets Subdivided category-I code of full ICD-9-CM coding
   * @generated */
  public int getSub_category_I() {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_sub_category_I == null)
      jcasType.jcas.throwFeatMissing("sub_category_I", "edu.cmu.lti.oacb.ICD");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ICD_Type)jcasType).casFeatCode_sub_category_I);}
    
  /** setter for sub_category_I - sets Subdivided category-I code of full ICD-9-CM coding 
   * @generated */
  public void setSub_category_I(int v) {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_sub_category_I == null)
      jcasType.jcas.throwFeatMissing("sub_category_I", "edu.cmu.lti.oacb.ICD");
    jcasType.ll_cas.ll_setIntValue(addr, ((ICD_Type)jcasType).casFeatCode_sub_category_I, v);}    
   
    
  //*--------------*
  //* Feature: sub_category_II

  /** getter for sub_category_II - gets Subdivided category-II code of full ICD-9-CM coding
   * @generated */
  public int getSub_category_II() {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_sub_category_II == null)
      jcasType.jcas.throwFeatMissing("sub_category_II", "edu.cmu.lti.oacb.ICD");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ICD_Type)jcasType).casFeatCode_sub_category_II);}
    
  /** setter for sub_category_II - sets Subdivided category-II code of full ICD-9-CM coding 
   * @generated */
  public void setSub_category_II(int v) {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_sub_category_II == null)
      jcasType.jcas.throwFeatMissing("sub_category_II", "edu.cmu.lti.oacb.ICD");
    jcasType.ll_cas.ll_setIntValue(addr, ((ICD_Type)jcasType).casFeatCode_sub_category_II, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets Description of ICD-9-CM code
   * @generated */
  public String getDescription() {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "edu.cmu.lti.oacb.ICD");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ICD_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets Description of ICD-9-CM code 
   * @generated */
  public void setDescription(String v) {
    if (ICD_Type.featOkTst && ((ICD_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "edu.cmu.lti.oacb.ICD");
    jcasType.ll_cas.ll_setStringValue(addr, ((ICD_Type)jcasType).casFeatCode_description, v);}    
  }

    