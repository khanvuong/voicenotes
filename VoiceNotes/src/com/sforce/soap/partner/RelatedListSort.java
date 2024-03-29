package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class RelatedListSort implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public RelatedListSort() {
  }
    
  
  /**
   * element  : ascending of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ascending__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","ascending","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean ascending__is_set = false;

  private boolean ascending;

  public boolean getAscending() {
    return ascending;
  }

  

  public boolean isAscending() {
    return ascending;
  }

  

  public void setAscending(boolean ascending) {
    this.ascending = ascending;
    ascending__is_set = true;
  }
  
  /**
   * element  : column of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo column__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","column","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean column__is_set = false;

  private java.lang.String column;

  public java.lang.String getColumn() {
    return column;
  }

  

  public void setColumn(java.lang.String column) {
    this.column = column;
    column__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, ascending__typeInfo, ascending, ascending__is_set);
    __typeMapper.writeString(__out, column__typeInfo, column, column__is_set);
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
    if (__typeMapper.verifyElement(__in, ascending__typeInfo)) {
      setAscending((boolean)__typeMapper.readBoolean(__in, ascending__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, column__typeInfo)) {
      setColumn((java.lang.String)__typeMapper.readString(__in, column__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RelatedListSort ");
    
    sb.append(" ascending=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ascending)+"'\n");
    sb.append(" column=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(column)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}