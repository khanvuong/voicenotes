package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeSoftphoneLayoutCallType implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeSoftphoneLayoutCallType() {
  }
    
  
  /**
   * element  : infoFields of type {urn:partner.soap.sforce.com}DescribeSoftphoneLayoutInfoField
   * java type: com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField[]
   */
  private static final com.sforce.ws.bind.TypeInfo infoFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","infoFields","urn:partner.soap.sforce.com","DescribeSoftphoneLayoutInfoField",1,-1,true);

  private boolean infoFields__is_set = false;

  private com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField[] infoFields = new com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField[0];

  public com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField[] getInfoFields() {
    return infoFields;
  }

  

  public void setInfoFields(com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField[] infoFields) {
    this.infoFields = infoFields;
    infoFields__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : screenPopOptions of type {urn:partner.soap.sforce.com}DescribeSoftphoneScreenPopOption
   * java type: com.sforce.soap.partner.DescribeSoftphoneScreenPopOption[]
   */
  private static final com.sforce.ws.bind.TypeInfo screenPopOptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","screenPopOptions","urn:partner.soap.sforce.com","DescribeSoftphoneScreenPopOption",0,-1,true);

  private boolean screenPopOptions__is_set = false;

  private com.sforce.soap.partner.DescribeSoftphoneScreenPopOption[] screenPopOptions = new com.sforce.soap.partner.DescribeSoftphoneScreenPopOption[0];

  public com.sforce.soap.partner.DescribeSoftphoneScreenPopOption[] getScreenPopOptions() {
    return screenPopOptions;
  }

  

  public void setScreenPopOptions(com.sforce.soap.partner.DescribeSoftphoneScreenPopOption[] screenPopOptions) {
    this.screenPopOptions = screenPopOptions;
    screenPopOptions__is_set = true;
  }
  
  /**
   * element  : screenPopsOpenWithin of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo screenPopsOpenWithin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","screenPopsOpenWithin","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean screenPopsOpenWithin__is_set = false;

  private java.lang.String screenPopsOpenWithin;

  public java.lang.String getScreenPopsOpenWithin() {
    return screenPopsOpenWithin;
  }

  

  public void setScreenPopsOpenWithin(java.lang.String screenPopsOpenWithin) {
    this.screenPopsOpenWithin = screenPopsOpenWithin;
    screenPopsOpenWithin__is_set = true;
  }
  
  /**
   * element  : sections of type {urn:partner.soap.sforce.com}DescribeSoftphoneLayoutSection
   * java type: com.sforce.soap.partner.DescribeSoftphoneLayoutSection[]
   */
  private static final com.sforce.ws.bind.TypeInfo sections__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sections","urn:partner.soap.sforce.com","DescribeSoftphoneLayoutSection",0,-1,true);

  private boolean sections__is_set = false;

  private com.sforce.soap.partner.DescribeSoftphoneLayoutSection[] sections = new com.sforce.soap.partner.DescribeSoftphoneLayoutSection[0];

  public com.sforce.soap.partner.DescribeSoftphoneLayoutSection[] getSections() {
    return sections;
  }

  

  public void setSections(com.sforce.soap.partner.DescribeSoftphoneLayoutSection[] sections) {
    this.sections = sections;
    sections__is_set = true;
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
   
    __typeMapper.writeObject(__out, infoFields__typeInfo, infoFields, infoFields__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeObject(__out, screenPopOptions__typeInfo, screenPopOptions, screenPopOptions__is_set);
    __typeMapper.writeString(__out, screenPopsOpenWithin__typeInfo, screenPopsOpenWithin, screenPopsOpenWithin__is_set);
    __typeMapper.writeObject(__out, sections__typeInfo, sections, sections__is_set);
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
    if (__typeMapper.verifyElement(__in, infoFields__typeInfo)) {
      setInfoFields((com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField[])__typeMapper.readObject(__in, infoFields__typeInfo, com.sforce.soap.partner.DescribeSoftphoneLayoutInfoField[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, screenPopOptions__typeInfo)) {
      setScreenPopOptions((com.sforce.soap.partner.DescribeSoftphoneScreenPopOption[])__typeMapper.readObject(__in, screenPopOptions__typeInfo, com.sforce.soap.partner.DescribeSoftphoneScreenPopOption[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, screenPopsOpenWithin__typeInfo)) {
      setScreenPopsOpenWithin((java.lang.String)__typeMapper.readString(__in, screenPopsOpenWithin__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, sections__typeInfo)) {
      setSections((com.sforce.soap.partner.DescribeSoftphoneLayoutSection[])__typeMapper.readObject(__in, sections__typeInfo, com.sforce.soap.partner.DescribeSoftphoneLayoutSection[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSoftphoneLayoutCallType ");
    
    sb.append(" infoFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(infoFields)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" screenPopOptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(screenPopOptions)+"'\n");
    sb.append(" screenPopsOpenWithin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(screenPopsOpenWithin)+"'\n");
    sb.append(" sections=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sections)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}