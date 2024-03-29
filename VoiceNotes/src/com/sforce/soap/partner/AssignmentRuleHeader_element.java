package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class AssignmentRuleHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public AssignmentRuleHeader_element() {
  }
    
  
  /**
   * element  : assignmentRuleId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo assignmentRuleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","assignmentRuleId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean assignmentRuleId__is_set = false;

  private java.lang.String assignmentRuleId;

  public java.lang.String getAssignmentRuleId() {
    return assignmentRuleId;
  }

  

  public void setAssignmentRuleId(java.lang.String assignmentRuleId) {
    this.assignmentRuleId = assignmentRuleId;
    assignmentRuleId__is_set = true;
  }
  
  /**
   * element  : useDefaultRule of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo useDefaultRule__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","useDefaultRule","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean useDefaultRule__is_set = false;

  private java.lang.Boolean useDefaultRule;

  public java.lang.Boolean getUseDefaultRule() {
    return useDefaultRule;
  }

  

  public void setUseDefaultRule(java.lang.Boolean useDefaultRule) {
    this.useDefaultRule = useDefaultRule;
    useDefaultRule__is_set = true;
  }
  

  /**
   */
  public void write(com.mavens.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, assignmentRuleId__typeInfo, assignmentRuleId, assignmentRuleId__is_set);
    __typeMapper.writeObject(__out, useDefaultRule__typeInfo, useDefaultRule, useDefaultRule__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, assignmentRuleId__typeInfo)) {
      setAssignmentRuleId((java.lang.String)__typeMapper.readString(__in, assignmentRuleId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, useDefaultRule__typeInfo)) {
      setUseDefaultRule((java.lang.Boolean)__typeMapper.readObject(__in, useDefaultRule__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AssignmentRuleHeader_element ");
    sb.append(super.toString());
    sb.append(" assignmentRuleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(assignmentRuleId)+"'\n");
    sb.append(" useDefaultRule=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(useDefaultRule)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}