package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeLayoutResult() {
  }
    
  
  /**
   * element  : layouts of type {urn:partner.soap.sforce.com}DescribeLayout
   * java type: com.sforce.soap.partner.DescribeLayout[]
   */
  private static final com.sforce.ws.bind.TypeInfo layouts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","layouts","urn:partner.soap.sforce.com","DescribeLayout",1,-1,true);

  private boolean layouts__is_set = false;

  private com.sforce.soap.partner.DescribeLayout[] layouts = new com.sforce.soap.partner.DescribeLayout[0];

  public com.sforce.soap.partner.DescribeLayout[] getLayouts() {
    return layouts;
  }

  

  public void setLayouts(com.sforce.soap.partner.DescribeLayout[] layouts) {
    this.layouts = layouts;
    layouts__is_set = true;
  }
  
  /**
   * element  : recordTypeMappings of type {urn:partner.soap.sforce.com}RecordTypeMapping
   * java type: com.sforce.soap.partner.RecordTypeMapping[]
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeMappings__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","recordTypeMappings","urn:partner.soap.sforce.com","RecordTypeMapping",0,-1,true);

  private boolean recordTypeMappings__is_set = false;

  private com.sforce.soap.partner.RecordTypeMapping[] recordTypeMappings = new com.sforce.soap.partner.RecordTypeMapping[0];

  public com.sforce.soap.partner.RecordTypeMapping[] getRecordTypeMappings() {
    return recordTypeMappings;
  }

  

  public void setRecordTypeMappings(com.sforce.soap.partner.RecordTypeMapping[] recordTypeMappings) {
    this.recordTypeMappings = recordTypeMappings;
    recordTypeMappings__is_set = true;
  }
  
  /**
   * element  : recordTypeSelectorRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeSelectorRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","recordTypeSelectorRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean recordTypeSelectorRequired__is_set = false;

  private boolean recordTypeSelectorRequired;

  public boolean getRecordTypeSelectorRequired() {
    return recordTypeSelectorRequired;
  }

  

  public boolean isRecordTypeSelectorRequired() {
    return recordTypeSelectorRequired;
  }

  

  public void setRecordTypeSelectorRequired(boolean recordTypeSelectorRequired) {
    this.recordTypeSelectorRequired = recordTypeSelectorRequired;
    recordTypeSelectorRequired__is_set = true;
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
   
    __typeMapper.writeObject(__out, layouts__typeInfo, layouts, layouts__is_set);
    __typeMapper.writeObject(__out, recordTypeMappings__typeInfo, recordTypeMappings, recordTypeMappings__is_set);
    __typeMapper.writeBoolean(__out, recordTypeSelectorRequired__typeInfo, recordTypeSelectorRequired, recordTypeSelectorRequired__is_set);
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
    if (__typeMapper.verifyElement(__in, layouts__typeInfo)) {
      setLayouts((com.sforce.soap.partner.DescribeLayout[])__typeMapper.readObject(__in, layouts__typeInfo, com.sforce.soap.partner.DescribeLayout[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, recordTypeMappings__typeInfo)) {
      setRecordTypeMappings((com.sforce.soap.partner.RecordTypeMapping[])__typeMapper.readObject(__in, recordTypeMappings__typeInfo, com.sforce.soap.partner.RecordTypeMapping[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, recordTypeSelectorRequired__typeInfo)) {
      setRecordTypeSelectorRequired((boolean)__typeMapper.readBoolean(__in, recordTypeSelectorRequired__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutResult ");
    
    sb.append(" layouts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layouts)+"'\n");
    sb.append(" recordTypeMappings=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeMappings)+"'\n");
    sb.append(" recordTypeSelectorRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeSelectorRequired)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}