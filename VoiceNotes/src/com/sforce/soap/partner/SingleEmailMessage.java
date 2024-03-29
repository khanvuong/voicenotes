package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class SingleEmailMessage extends com.sforce.soap.partner.Email {

  /**
   * Constructor
   */
  public SingleEmailMessage() {
  }
    
  
  /**
   * element  : bccAddresses of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo bccAddresses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","bccAddresses","http://www.w3.org/2001/XMLSchema","string",0,25,true);

  private boolean bccAddresses__is_set = false;

  private java.lang.String[] bccAddresses = new java.lang.String[0];

  public java.lang.String[] getBccAddresses() {
    return bccAddresses;
  }

  

  public void setBccAddresses(java.lang.String[] bccAddresses) {
    this.bccAddresses = bccAddresses;
    bccAddresses__is_set = true;
  }
  
  /**
   * element  : ccAddresses of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo ccAddresses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","ccAddresses","http://www.w3.org/2001/XMLSchema","string",0,25,true);

  private boolean ccAddresses__is_set = false;

  private java.lang.String[] ccAddresses = new java.lang.String[0];

  public java.lang.String[] getCcAddresses() {
    return ccAddresses;
  }

  

  public void setCcAddresses(java.lang.String[] ccAddresses) {
    this.ccAddresses = ccAddresses;
    ccAddresses__is_set = true;
  }
  
  /**
   * element  : charset of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo charset__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","charset","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean charset__is_set = false;

  private java.lang.String charset;

  public java.lang.String getCharset() {
    return charset;
  }

  

  public void setCharset(java.lang.String charset) {
    this.charset = charset;
    charset__is_set = true;
  }
  
  /**
   * element  : documentAttachments of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo documentAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","documentAttachments","urn:partner.soap.sforce.com","ID",0,-1,true);

  private boolean documentAttachments__is_set = false;

  private java.lang.String[] documentAttachments = new java.lang.String[0];

  public java.lang.String[] getDocumentAttachments() {
    return documentAttachments;
  }

  

  public void setDocumentAttachments(java.lang.String[] documentAttachments) {
    this.documentAttachments = documentAttachments;
    documentAttachments__is_set = true;
  }
  
  /**
   * element  : htmlBody of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo htmlBody__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","htmlBody","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean htmlBody__is_set = false;

  private java.lang.String htmlBody;

  public java.lang.String getHtmlBody() {
    return htmlBody;
  }

  

  public void setHtmlBody(java.lang.String htmlBody) {
    this.htmlBody = htmlBody;
    htmlBody__is_set = true;
  }
  
  /**
   * element  : inReplyTo of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo inReplyTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","inReplyTo","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean inReplyTo__is_set = false;

  private java.lang.String inReplyTo;

  public java.lang.String getInReplyTo() {
    return inReplyTo;
  }

  

  public void setInReplyTo(java.lang.String inReplyTo) {
    this.inReplyTo = inReplyTo;
    inReplyTo__is_set = true;
  }
  
  /**
   * element  : fileAttachments of type {urn:partner.soap.sforce.com}EmailFileAttachment
   * java type: com.sforce.soap.partner.EmailFileAttachment[]
   */
  private static final com.sforce.ws.bind.TypeInfo fileAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","fileAttachments","urn:partner.soap.sforce.com","EmailFileAttachment",0,-1,true);

  private boolean fileAttachments__is_set = false;

  private com.sforce.soap.partner.EmailFileAttachment[] fileAttachments = new com.sforce.soap.partner.EmailFileAttachment[0];

  public com.sforce.soap.partner.EmailFileAttachment[] getFileAttachments() {
    return fileAttachments;
  }

  

  public void setFileAttachments(com.sforce.soap.partner.EmailFileAttachment[] fileAttachments) {
    this.fileAttachments = fileAttachments;
    fileAttachments__is_set = true;
  }
  
  /**
   * element  : orgWideEmailAddressId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo orgWideEmailAddressId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","orgWideEmailAddressId","urn:partner.soap.sforce.com","ID",0,1,true);

  private boolean orgWideEmailAddressId__is_set = false;

  private java.lang.String orgWideEmailAddressId;

  public java.lang.String getOrgWideEmailAddressId() {
    return orgWideEmailAddressId;
  }

  

  public void setOrgWideEmailAddressId(java.lang.String orgWideEmailAddressId) {
    this.orgWideEmailAddressId = orgWideEmailAddressId;
    orgWideEmailAddressId__is_set = true;
  }
  
  /**
   * element  : plainTextBody of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo plainTextBody__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","plainTextBody","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean plainTextBody__is_set = false;

  private java.lang.String plainTextBody;

  public java.lang.String getPlainTextBody() {
    return plainTextBody;
  }

  

  public void setPlainTextBody(java.lang.String plainTextBody) {
    this.plainTextBody = plainTextBody;
    plainTextBody__is_set = true;
  }
  
  /**
   * element  : references of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo references__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","references","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean references__is_set = false;

  private java.lang.String references;

  public java.lang.String getReferences() {
    return references;
  }

  

  public void setReferences(java.lang.String references) {
    this.references = references;
    references__is_set = true;
  }
  
  /**
   * element  : targetObjectId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo targetObjectId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","targetObjectId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean targetObjectId__is_set = false;

  private java.lang.String targetObjectId;

  public java.lang.String getTargetObjectId() {
    return targetObjectId;
  }

  

  public void setTargetObjectId(java.lang.String targetObjectId) {
    this.targetObjectId = targetObjectId;
    targetObjectId__is_set = true;
  }
  
  /**
   * element  : templateId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo templateId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","templateId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean templateId__is_set = false;

  private java.lang.String templateId;

  public java.lang.String getTemplateId() {
    return templateId;
  }

  

  public void setTemplateId(java.lang.String templateId) {
    this.templateId = templateId;
    templateId__is_set = true;
  }
  
  /**
   * element  : toAddresses of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo toAddresses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","toAddresses","http://www.w3.org/2001/XMLSchema","string",0,100,true);

  private boolean toAddresses__is_set = false;

  private java.lang.String[] toAddresses = new java.lang.String[0];

  public java.lang.String[] getToAddresses() {
    return toAddresses;
  }

  

  public void setToAddresses(java.lang.String[] toAddresses) {
    this.toAddresses = toAddresses;
    toAddresses__is_set = true;
  }
  
  /**
   * element  : whatId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo whatId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","whatId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean whatId__is_set = false;

  private java.lang.String whatId;

  public java.lang.String getWhatId() {
    return whatId;
  }

  

  public void setWhatId(java.lang.String whatId) {
    this.whatId = whatId;
    whatId__is_set = true;
  }
  

  /**
   */
  public void write(com.mavens.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:partner.soap.sforce.com", "SingleEmailMessage");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, bccAddresses__typeInfo, bccAddresses, bccAddresses__is_set);
    __typeMapper.writeObject(__out, ccAddresses__typeInfo, ccAddresses, ccAddresses__is_set);
    __typeMapper.writeString(__out, charset__typeInfo, charset, charset__is_set);
    __typeMapper.writeObject(__out, documentAttachments__typeInfo, documentAttachments, documentAttachments__is_set);
    __typeMapper.writeString(__out, htmlBody__typeInfo, htmlBody, htmlBody__is_set);
    __typeMapper.writeString(__out, inReplyTo__typeInfo, inReplyTo, inReplyTo__is_set);
    __typeMapper.writeObject(__out, fileAttachments__typeInfo, fileAttachments, fileAttachments__is_set);
    __typeMapper.writeString(__out, orgWideEmailAddressId__typeInfo, orgWideEmailAddressId, orgWideEmailAddressId__is_set);
    __typeMapper.writeString(__out, plainTextBody__typeInfo, plainTextBody, plainTextBody__is_set);
    __typeMapper.writeString(__out, references__typeInfo, references, references__is_set);
    __typeMapper.writeString(__out, targetObjectId__typeInfo, targetObjectId, targetObjectId__is_set);
    __typeMapper.writeString(__out, templateId__typeInfo, templateId, templateId__is_set);
    __typeMapper.writeObject(__out, toAddresses__typeInfo, toAddresses, toAddresses__is_set);
    __typeMapper.writeString(__out, whatId__typeInfo, whatId, whatId__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, bccAddresses__typeInfo)) {
      setBccAddresses((java.lang.String[])__typeMapper.readObject(__in, bccAddresses__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ccAddresses__typeInfo)) {
      setCcAddresses((java.lang.String[])__typeMapper.readObject(__in, ccAddresses__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, charset__typeInfo)) {
      setCharset((java.lang.String)__typeMapper.readString(__in, charset__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, documentAttachments__typeInfo)) {
      setDocumentAttachments((java.lang.String[])__typeMapper.readObject(__in, documentAttachments__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, htmlBody__typeInfo)) {
      setHtmlBody((java.lang.String)__typeMapper.readString(__in, htmlBody__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, inReplyTo__typeInfo)) {
      setInReplyTo((java.lang.String)__typeMapper.readString(__in, inReplyTo__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, fileAttachments__typeInfo)) {
      setFileAttachments((com.sforce.soap.partner.EmailFileAttachment[])__typeMapper.readObject(__in, fileAttachments__typeInfo, com.sforce.soap.partner.EmailFileAttachment[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, orgWideEmailAddressId__typeInfo)) {
      setOrgWideEmailAddressId((java.lang.String)__typeMapper.readString(__in, orgWideEmailAddressId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, plainTextBody__typeInfo)) {
      setPlainTextBody((java.lang.String)__typeMapper.readString(__in, plainTextBody__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, references__typeInfo)) {
      setReferences((java.lang.String)__typeMapper.readString(__in, references__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, targetObjectId__typeInfo)) {
      setTargetObjectId((java.lang.String)__typeMapper.readString(__in, targetObjectId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, templateId__typeInfo)) {
      setTemplateId((java.lang.String)__typeMapper.readString(__in, templateId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, toAddresses__typeInfo)) {
      setToAddresses((java.lang.String[])__typeMapper.readObject(__in, toAddresses__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, whatId__typeInfo)) {
      setWhatId((java.lang.String)__typeMapper.readString(__in, whatId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SingleEmailMessage ");
    sb.append(super.toString());
    sb.append(" bccAddresses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(bccAddresses)+"'\n");
    sb.append(" ccAddresses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ccAddresses)+"'\n");
    sb.append(" charset=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(charset)+"'\n");
    sb.append(" documentAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(documentAttachments)+"'\n");
    sb.append(" htmlBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(htmlBody)+"'\n");
    sb.append(" inReplyTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(inReplyTo)+"'\n");
    sb.append(" fileAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fileAttachments)+"'\n");
    sb.append(" orgWideEmailAddressId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(orgWideEmailAddressId)+"'\n");
    sb.append(" plainTextBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(plainTextBody)+"'\n");
    sb.append(" references=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(references)+"'\n");
    sb.append(" targetObjectId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(targetObjectId)+"'\n");
    sb.append(" templateId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(templateId)+"'\n");
    sb.append(" toAddresses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(toAddresses)+"'\n");
    sb.append(" whatId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(whatId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}