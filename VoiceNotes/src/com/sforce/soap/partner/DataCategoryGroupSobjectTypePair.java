package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DataCategoryGroupSobjectTypePair implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DataCategoryGroupSobjectTypePair() {
  }
    
  
  /**
   * element  : dataCategoryGroupName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dataCategoryGroupName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","dataCategoryGroupName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean dataCategoryGroupName__is_set = false;

  private java.lang.String dataCategoryGroupName;

  public java.lang.String getDataCategoryGroupName() {
    return dataCategoryGroupName;
  }

  

  public void setDataCategoryGroupName(java.lang.String dataCategoryGroupName) {
    this.dataCategoryGroupName = dataCategoryGroupName;
    dataCategoryGroupName__is_set = true;
  }
  
  /**
   * element  : sobject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sobject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sobject","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sobject__is_set = false;

  private java.lang.String sobject;

  public java.lang.String getSobject() {
    return sobject;
  }

  

  public void setSobject(java.lang.String sobject) {
    this.sobject = sobject;
    sobject__is_set = true;
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
   
    __typeMapper.writeString(__out, dataCategoryGroupName__typeInfo, dataCategoryGroupName, dataCategoryGroupName__is_set);
    __typeMapper.writeString(__out, sobject__typeInfo, sobject, sobject__is_set);
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
    if (__typeMapper.verifyElement(__in, dataCategoryGroupName__typeInfo)) {
      setDataCategoryGroupName((java.lang.String)__typeMapper.readString(__in, dataCategoryGroupName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sobject__typeInfo)) {
      setSobject((java.lang.String)__typeMapper.readString(__in, sobject__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DataCategoryGroupSobjectTypePair ");
    
    sb.append(" dataCategoryGroupName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dataCategoryGroupName)+"'\n");
    sb.append(" sobject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobject)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}