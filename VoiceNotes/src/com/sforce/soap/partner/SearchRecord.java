package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class SearchRecord implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SearchRecord() {
  }
    
  
  /**
   * element  : record of type {urn:sobject.partner.soap.sforce.com}sObject
   * java type: com.sforce.soap.partner.sobject.SObject
   */
  private static final com.sforce.ws.bind.TypeInfo record__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","record","urn:sobject.partner.soap.sforce.com","sObject",1,1,true);

  private boolean record__is_set = false;

  private com.sforce.soap.partner.sobject.SObject record;

  public com.sforce.soap.partner.sobject.SObject getRecord() {
    return record;
  }

  

  public void setRecord(com.sforce.soap.partner.sobject.SObject record) {
    this.record = record;
    record__is_set = true;
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
   
    __typeMapper.writeObject(__out, record__typeInfo, record, record__is_set);
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
    if (__typeMapper.verifyElement(__in, record__typeInfo)) {
      setRecord((com.sforce.soap.partner.sobject.SObject)__typeMapper.readObject(__in, record__typeInfo, com.sforce.soap.partner.sobject.SObject.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchRecord ");
    
    sb.append(" record=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(record)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}