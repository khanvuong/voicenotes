package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class PicklistEntry implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public PicklistEntry() {
  }
    
  
  /**
   * element  : active of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo active__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean active__is_set = false;

  private boolean active;

  public boolean getActive() {
    return active;
  }

  

  public boolean isActive() {
    return active;
  }

  

  public void setActive(boolean active) {
    this.active = active;
    active__is_set = true;
  }
  
  /**
   * element  : defaultValue of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo defaultValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","defaultValue","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean defaultValue__is_set = false;

  private boolean defaultValue;

  public boolean getDefaultValue() {
    return defaultValue;
  }

  

  public boolean isDefaultValue() {
    return defaultValue;
  }

  

  public void setDefaultValue(boolean defaultValue) {
    this.defaultValue = defaultValue;
    defaultValue__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : validFor of type {http://www.w3.org/2001/XMLSchema}base64Binary
   * java type: byte[]
   */
  private static final com.sforce.ws.bind.TypeInfo validFor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","validFor","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true);

  private boolean validFor__is_set = false;

  private byte[] validFor;

  public byte[] getValidFor() {
    return validFor;
  }

  

  public void setValidFor(byte[] validFor) {
    this.validFor = validFor;
    validFor__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);
    __typeMapper.writeBoolean(__out, defaultValue__typeInfo, defaultValue, defaultValue__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeObject(__out, validFor__typeInfo, validFor, validFor__is_set);
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
    if (__typeMapper.verifyElement(__in, active__typeInfo)) {
      setActive((boolean)__typeMapper.readBoolean(__in, active__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, defaultValue__typeInfo)) {
      setDefaultValue((boolean)__typeMapper.readBoolean(__in, defaultValue__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, validFor__typeInfo)) {
      setValidFor((byte[])__typeMapper.readObject(__in, validFor__typeInfo, byte[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, value__typeInfo)) {
      setValue((java.lang.String)__typeMapper.readString(__in, value__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PicklistEntry ");
    
    sb.append(" active=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(active)+"'\n");
    sb.append(" defaultValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultValue)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" validFor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(validFor)+"'\n");
    sb.append(" value=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(value)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}