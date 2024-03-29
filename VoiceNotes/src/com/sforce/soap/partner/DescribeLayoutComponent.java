package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutComponent implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeLayoutComponent() {
  }
    
  
  /**
   * element  : displayLines of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo displayLines__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","displayLines","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean displayLines__is_set = false;

  private int displayLines;

  public int getDisplayLines() {
    return displayLines;
  }

  

  public void setDisplayLines(int displayLines) {
    this.displayLines = displayLines;
    displayLines__is_set = true;
  }
  
  /**
   * element  : tabOrder of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo tabOrder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","tabOrder","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean tabOrder__is_set = false;

  private int tabOrder;

  public int getTabOrder() {
    return tabOrder;
  }

  

  public void setTabOrder(int tabOrder) {
    this.tabOrder = tabOrder;
    tabOrder__is_set = true;
  }
  
  /**
   * element  : type of type {urn:partner.soap.sforce.com}layoutComponentType
   * java type: com.sforce.soap.partner.LayoutComponentType
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","type","urn:partner.soap.sforce.com","layoutComponentType",1,1,true);

  private boolean type__is_set = false;

  private com.sforce.soap.partner.LayoutComponentType type;

  public com.sforce.soap.partner.LayoutComponentType getType() {
    return type;
  }

  

  public void setType(com.sforce.soap.partner.LayoutComponentType type) {
    this.type = type;
    type__is_set = true;
  }
  
  /**
   * element  : value of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo value__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean value__is_set = false;

  private java.lang.String value;

  public java.lang.String getValue() {
    return value;
  }

  

  public void setValue(java.lang.String value) {
    this.value = value;
    value__is_set = true;
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
   
    __typeMapper.writeInt(__out, displayLines__typeInfo, displayLines, displayLines__is_set);
    __typeMapper.writeInt(__out, tabOrder__typeInfo, tabOrder, tabOrder__is_set);
    __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);
    __typeMapper.writeString(__out, value__typeInfo, value, value__is_set);
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
    if (__typeMapper.verifyElement(__in, displayLines__typeInfo)) {
      setDisplayLines((int)__typeMapper.readInt(__in, displayLines__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, tabOrder__typeInfo)) {
      setTabOrder((int)__typeMapper.readInt(__in, tabOrder__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((com.sforce.soap.partner.LayoutComponentType)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.partner.LayoutComponentType.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, value__typeInfo)) {
      setValue((java.lang.String)__typeMapper.readString(__in, value__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutComponent ");
    
    sb.append(" displayLines=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(displayLines)+"'\n");
    sb.append(" tabOrder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(tabOrder)+"'\n");
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append(" value=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(value)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}