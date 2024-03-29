package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class ChildRelationship implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ChildRelationship() {
  }
    
  
  /**
   * element  : cascadeDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo cascadeDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","cascadeDelete","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean cascadeDelete__is_set = false;

  private boolean cascadeDelete;

  public boolean getCascadeDelete() {
    return cascadeDelete;
  }

  

  public boolean isCascadeDelete() {
    return cascadeDelete;
  }

  

  public void setCascadeDelete(boolean cascadeDelete) {
    this.cascadeDelete = cascadeDelete;
    cascadeDelete__is_set = true;
  }
  
  /**
   * element  : childSObject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo childSObject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","childSObject","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean childSObject__is_set = false;

  private java.lang.String childSObject;

  public java.lang.String getChildSObject() {
    return childSObject;
  }

  

  public void setChildSObject(java.lang.String childSObject) {
    this.childSObject = childSObject;
    childSObject__is_set = true;
  }
  
  /**
   * element  : deprecatedAndHidden of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo deprecatedAndHidden__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","deprecatedAndHidden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean deprecatedAndHidden__is_set = false;

  private boolean deprecatedAndHidden;

  public boolean getDeprecatedAndHidden() {
    return deprecatedAndHidden;
  }

  

  public boolean isDeprecatedAndHidden() {
    return deprecatedAndHidden;
  }

  

  public void setDeprecatedAndHidden(boolean deprecatedAndHidden) {
    this.deprecatedAndHidden = deprecatedAndHidden;
    deprecatedAndHidden__is_set = true;
  }
  
  /**
   * element  : field of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean field__is_set = false;

  private java.lang.String field;

  public java.lang.String getField() {
    return field;
  }

  

  public void setField(java.lang.String field) {
    this.field = field;
    field__is_set = true;
  }
  
  /**
   * element  : relationshipName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo relationshipName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","relationshipName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean relationshipName__is_set = false;

  private java.lang.String relationshipName;

  public java.lang.String getRelationshipName() {
    return relationshipName;
  }

  

  public void setRelationshipName(java.lang.String relationshipName) {
    this.relationshipName = relationshipName;
    relationshipName__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, cascadeDelete__typeInfo, cascadeDelete, cascadeDelete__is_set);
    __typeMapper.writeString(__out, childSObject__typeInfo, childSObject, childSObject__is_set);
    __typeMapper.writeBoolean(__out, deprecatedAndHidden__typeInfo, deprecatedAndHidden, deprecatedAndHidden__is_set);
    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);
    __typeMapper.writeString(__out, relationshipName__typeInfo, relationshipName, relationshipName__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, cascadeDelete__typeInfo)) {
      setCascadeDelete((boolean)__typeMapper.readBoolean(__in, cascadeDelete__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, childSObject__typeInfo)) {
      setChildSObject((java.lang.String)__typeMapper.readString(__in, childSObject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, deprecatedAndHidden__typeInfo)) {
      setDeprecatedAndHidden((boolean)__typeMapper.readBoolean(__in, deprecatedAndHidden__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, field__typeInfo)) {
      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, relationshipName__typeInfo)) {
      setRelationshipName((java.lang.String)__typeMapper.readString(__in, relationshipName__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ChildRelationship ");
    
    sb.append(" cascadeDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(cascadeDelete)+"'\n");
    sb.append(" childSObject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(childSObject)+"'\n");
    sb.append(" deprecatedAndHidden=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(deprecatedAndHidden)+"'\n");
    sb.append(" field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");
    sb.append(" relationshipName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(relationshipName)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}