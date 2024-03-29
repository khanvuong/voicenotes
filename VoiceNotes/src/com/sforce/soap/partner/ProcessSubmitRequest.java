package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class ProcessSubmitRequest extends com.sforce.soap.partner.ProcessRequest {

  /**
   * Constructor
   */
  public ProcessSubmitRequest() {
  }
    
  
  /**
   * element  : objectId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo objectId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","objectId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean objectId__is_set = false;

  private java.lang.String objectId;

  public java.lang.String getObjectId() {
    return objectId;
  }

  

  public void setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    objectId__is_set = true;
  }
  

  /**
   */
  public void write(com.mavens.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:partner.soap.sforce.com", "ProcessSubmitRequest");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, objectId__typeInfo, objectId, objectId__is_set);
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
    if (__typeMapper.verifyElement(__in, objectId__typeInfo)) {
      setObjectId((java.lang.String)__typeMapper.readString(__in, objectId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ProcessSubmitRequest ");
    sb.append(super.toString());
    sb.append(" objectId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(objectId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}