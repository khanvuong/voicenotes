package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class PackageVersion implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public PackageVersion() {
  }
    
  
  /**
   * element  : majorNumber of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo majorNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","majorNumber","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean majorNumber__is_set = false;

  private int majorNumber;

  public int getMajorNumber() {
    return majorNumber;
  }

  

  public void setMajorNumber(int majorNumber) {
    this.majorNumber = majorNumber;
    majorNumber__is_set = true;
  }
  
  /**
   * element  : minorNumber of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo minorNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","minorNumber","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean minorNumber__is_set = false;

  private int minorNumber;

  public int getMinorNumber() {
    return minorNumber;
  }

  

  public void setMinorNumber(int minorNumber) {
    this.minorNumber = minorNumber;
    minorNumber__is_set = true;
  }
  
  /**
   * element  : namespace of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo namespace__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","namespace","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean namespace__is_set = false;

  private java.lang.String namespace;

  public java.lang.String getNamespace() {
    return namespace;
  }

  

  public void setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    namespace__is_set = true;
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
   
    __typeMapper.writeInt(__out, majorNumber__typeInfo, majorNumber, majorNumber__is_set);
    __typeMapper.writeInt(__out, minorNumber__typeInfo, minorNumber, minorNumber__is_set);
    __typeMapper.writeString(__out, namespace__typeInfo, namespace, namespace__is_set);
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
    if (__typeMapper.verifyElement(__in, majorNumber__typeInfo)) {
      setMajorNumber((int)__typeMapper.readInt(__in, majorNumber__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, minorNumber__typeInfo)) {
      setMinorNumber((int)__typeMapper.readInt(__in, minorNumber__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, namespace__typeInfo)) {
      setNamespace((java.lang.String)__typeMapper.readString(__in, namespace__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PackageVersion ");
    
    sb.append(" majorNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(majorNumber)+"'\n");
    sb.append(" minorNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(minorNumber)+"'\n");
    sb.append(" namespace=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(namespace)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}