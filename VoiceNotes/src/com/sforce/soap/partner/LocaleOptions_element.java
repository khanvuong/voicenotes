package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class LocaleOptions_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public LocaleOptions_element() {
  }
    
  
  /**
   * element  : language of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo language__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","language","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean language__is_set = false;

  private java.lang.String language;

  public java.lang.String getLanguage() {
    return language;
  }

  

  public void setLanguage(java.lang.String language) {
    this.language = language;
    language__is_set = true;
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
    __typeMapper.writeString(__out, language__typeInfo, language, language__is_set);
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
    if (__typeMapper.isElement(__in, language__typeInfo)) {
      setLanguage((java.lang.String)__typeMapper.readString(__in, language__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LocaleOptions_element ");
    sb.append(super.toString());
    sb.append(" language=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(language)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}