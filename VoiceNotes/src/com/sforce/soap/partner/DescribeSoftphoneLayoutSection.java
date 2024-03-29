package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeSoftphoneLayoutSection implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeSoftphoneLayoutSection() {
  }
    
  
  /**
   * element  : entityApiName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo entityApiName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","entityApiName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean entityApiName__is_set = false;

  private java.lang.String entityApiName;

  public java.lang.String getEntityApiName() {
    return entityApiName;
  }

  

  public void setEntityApiName(java.lang.String entityApiName) {
    this.entityApiName = entityApiName;
    entityApiName__is_set = true;
  }
  
  /**
   * element  : items of type {urn:partner.soap.sforce.com}DescribeSoftphoneLayoutItem
   * java type: com.sforce.soap.partner.DescribeSoftphoneLayoutItem[]
   */
  private static final com.sforce.ws.bind.TypeInfo items__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","items","urn:partner.soap.sforce.com","DescribeSoftphoneLayoutItem",1,-1,true);

  private boolean items__is_set = false;

  private com.sforce.soap.partner.DescribeSoftphoneLayoutItem[] items = new com.sforce.soap.partner.DescribeSoftphoneLayoutItem[0];

  public com.sforce.soap.partner.DescribeSoftphoneLayoutItem[] getItems() {
    return items;
  }

  

  public void setItems(com.sforce.soap.partner.DescribeSoftphoneLayoutItem[] items) {
    this.items = items;
    items__is_set = true;
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
   
    __typeMapper.writeString(__out, entityApiName__typeInfo, entityApiName, entityApiName__is_set);
    __typeMapper.writeObject(__out, items__typeInfo, items, items__is_set);
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
    if (__typeMapper.verifyElement(__in, entityApiName__typeInfo)) {
      setEntityApiName((java.lang.String)__typeMapper.readString(__in, entityApiName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, items__typeInfo)) {
      setItems((com.sforce.soap.partner.DescribeSoftphoneLayoutItem[])__typeMapper.readObject(__in, items__typeInfo, com.sforce.soap.partner.DescribeSoftphoneLayoutItem[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSoftphoneLayoutSection ");
    
    sb.append(" entityApiName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(entityApiName)+"'\n");
    sb.append(" items=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(items)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}