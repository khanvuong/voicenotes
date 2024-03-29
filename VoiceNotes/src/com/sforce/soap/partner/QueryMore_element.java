package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class QueryMore_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public QueryMore_element() {
  }
    
  
  /**
   * element  : queryLocator of type {urn:partner.soap.sforce.com}QueryLocator
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo queryLocator__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","queryLocator","urn:partner.soap.sforce.com","QueryLocator",1,1,true);

  private boolean queryLocator__is_set = false;

  private java.lang.String queryLocator;

  public java.lang.String getQueryLocator() {
    return queryLocator;
  }

  

  public void setQueryLocator(java.lang.String queryLocator) {
    this.queryLocator = queryLocator;
    queryLocator__is_set = true;
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
   
    __typeMapper.writeString(__out, queryLocator__typeInfo, queryLocator, queryLocator__is_set);
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
    if (__typeMapper.verifyElement(__in, queryLocator__typeInfo)) {
      setQueryLocator((java.lang.String)__typeMapper.readString(__in, queryLocator__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[QueryMore_element ");
    
    sb.append(" queryLocator=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(queryLocator)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}