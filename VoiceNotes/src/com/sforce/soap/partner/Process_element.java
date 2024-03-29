package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class Process_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Process_element() {
  }
    
  
  /**
   * element  : actions of type {urn:partner.soap.sforce.com}ProcessRequest
   * java type: com.sforce.soap.partner.ProcessRequest[]
   */
  private static final com.sforce.ws.bind.TypeInfo actions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","actions","urn:partner.soap.sforce.com","ProcessRequest",0,-1,true);

  private boolean actions__is_set = false;

  private com.sforce.soap.partner.ProcessRequest[] actions = new com.sforce.soap.partner.ProcessRequest[0];

  public com.sforce.soap.partner.ProcessRequest[] getActions() {
    return actions;
  }

  

  public void setActions(com.sforce.soap.partner.ProcessRequest[] actions) {
    this.actions = actions;
    actions__is_set = true;
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
   
    __typeMapper.writeObject(__out, actions__typeInfo, actions, actions__is_set);
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
    if (__typeMapper.isElement(__in, actions__typeInfo)) {
      setActions((com.sforce.soap.partner.ProcessRequest[])__typeMapper.readObject(__in, actions__typeInfo, com.sforce.soap.partner.ProcessRequest[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Process_element ");
    
    sb.append(" actions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(actions)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}