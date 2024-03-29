package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class GetDeletedResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public GetDeletedResult() {
  }
    
  
  /**
   * element  : deletedRecords of type {urn:partner.soap.sforce.com}DeletedRecord
   * java type: com.sforce.soap.partner.DeletedRecord[]
   */
  private static final com.sforce.ws.bind.TypeInfo deletedRecords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","deletedRecords","urn:partner.soap.sforce.com","DeletedRecord",0,-1,true);

  private boolean deletedRecords__is_set = false;

  private com.sforce.soap.partner.DeletedRecord[] deletedRecords = new com.sforce.soap.partner.DeletedRecord[0];

  public com.sforce.soap.partner.DeletedRecord[] getDeletedRecords() {
    return deletedRecords;
  }

  

  public void setDeletedRecords(com.sforce.soap.partner.DeletedRecord[] deletedRecords) {
    this.deletedRecords = deletedRecords;
    deletedRecords__is_set = true;
  }
  
  /**
   * element  : earliestDateAvailable of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo earliestDateAvailable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","earliestDateAvailable","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true);

  private boolean earliestDateAvailable__is_set = false;

  private java.util.Calendar earliestDateAvailable;

  public java.util.Calendar getEarliestDateAvailable() {
    return earliestDateAvailable;
  }

  

  public void setEarliestDateAvailable(java.util.Calendar earliestDateAvailable) {
    this.earliestDateAvailable = earliestDateAvailable;
    earliestDateAvailable__is_set = true;
  }
  
  /**
   * element  : latestDateCovered of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo latestDateCovered__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","latestDateCovered","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true);

  private boolean latestDateCovered__is_set = false;

  private java.util.Calendar latestDateCovered;

  public java.util.Calendar getLatestDateCovered() {
    return latestDateCovered;
  }

  

  public void setLatestDateCovered(java.util.Calendar latestDateCovered) {
    this.latestDateCovered = latestDateCovered;
    latestDateCovered__is_set = true;
  }
  
  /**
   * element  : sforceReserved of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sforceReserved__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sforceReserved","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean sforceReserved__is_set = false;

  private java.lang.String sforceReserved;

  public java.lang.String getSforceReserved() {
    return sforceReserved;
  }

  

  public void setSforceReserved(java.lang.String sforceReserved) {
    this.sforceReserved = sforceReserved;
    sforceReserved__is_set = true;
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
   
    __typeMapper.writeObject(__out, deletedRecords__typeInfo, deletedRecords, deletedRecords__is_set);
    __typeMapper.writeObject(__out, earliestDateAvailable__typeInfo, earliestDateAvailable, earliestDateAvailable__is_set);
    __typeMapper.writeObject(__out, latestDateCovered__typeInfo, latestDateCovered, latestDateCovered__is_set);
    __typeMapper.writeString(__out, sforceReserved__typeInfo, sforceReserved, sforceReserved__is_set);
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
    if (__typeMapper.isElement(__in, deletedRecords__typeInfo)) {
      setDeletedRecords((com.sforce.soap.partner.DeletedRecord[])__typeMapper.readObject(__in, deletedRecords__typeInfo, com.sforce.soap.partner.DeletedRecord[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, earliestDateAvailable__typeInfo)) {
      setEarliestDateAvailable((java.util.Calendar)__typeMapper.readObject(__in, earliestDateAvailable__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, latestDateCovered__typeInfo)) {
      setLatestDateCovered((java.util.Calendar)__typeMapper.readObject(__in, latestDateCovered__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, sforceReserved__typeInfo)) {
      setSforceReserved((java.lang.String)__typeMapper.readString(__in, sforceReserved__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[GetDeletedResult ");
    
    sb.append(" deletedRecords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(deletedRecords)+"'\n");
    sb.append(" earliestDateAvailable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(earliestDateAvailable)+"'\n");
    sb.append(" latestDateCovered=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(latestDateCovered)+"'\n");
    sb.append(" sforceReserved=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sforceReserved)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}