package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutSection implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeLayoutSection() {
  }
    
  
  /**
   * element  : columns of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo columns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","columns","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean columns__is_set = false;

  private int columns;

  public int getColumns() {
    return columns;
  }

  

  public void setColumns(int columns) {
    this.columns = columns;
    columns__is_set = true;
  }
  
  /**
   * element  : heading of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo heading__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","heading","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean heading__is_set = false;

  private java.lang.String heading;

  public java.lang.String getHeading() {
    return heading;
  }

  

  public void setHeading(java.lang.String heading) {
    this.heading = heading;
    heading__is_set = true;
  }
  
  /**
   * element  : layoutRows of type {urn:partner.soap.sforce.com}DescribeLayoutRow
   * java type: com.sforce.soap.partner.DescribeLayoutRow[]
   */
  private static final com.sforce.ws.bind.TypeInfo layoutRows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","layoutRows","urn:partner.soap.sforce.com","DescribeLayoutRow",1,-1,true);

  private boolean layoutRows__is_set = false;

  private com.sforce.soap.partner.DescribeLayoutRow[] layoutRows = new com.sforce.soap.partner.DescribeLayoutRow[0];

  public com.sforce.soap.partner.DescribeLayoutRow[] getLayoutRows() {
    return layoutRows;
  }

  

  public void setLayoutRows(com.sforce.soap.partner.DescribeLayoutRow[] layoutRows) {
    this.layoutRows = layoutRows;
    layoutRows__is_set = true;
  }
  
  /**
   * element  : rows of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo rows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","rows","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean rows__is_set = false;

  private int rows;

  public int getRows() {
    return rows;
  }

  

  public void setRows(int rows) {
    this.rows = rows;
    rows__is_set = true;
  }
  
  /**
   * element  : useCollapsibleSection of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo useCollapsibleSection__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","useCollapsibleSection","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean useCollapsibleSection__is_set = false;

  private boolean useCollapsibleSection;

  public boolean getUseCollapsibleSection() {
    return useCollapsibleSection;
  }

  

  public boolean isUseCollapsibleSection() {
    return useCollapsibleSection;
  }

  

  public void setUseCollapsibleSection(boolean useCollapsibleSection) {
    this.useCollapsibleSection = useCollapsibleSection;
    useCollapsibleSection__is_set = true;
  }
  
  /**
   * element  : useHeading of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo useHeading__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","useHeading","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean useHeading__is_set = false;

  private boolean useHeading;

  public boolean getUseHeading() {
    return useHeading;
  }

  

  public boolean isUseHeading() {
    return useHeading;
  }

  

  public void setUseHeading(boolean useHeading) {
    this.useHeading = useHeading;
    useHeading__is_set = true;
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
   
    __typeMapper.writeInt(__out, columns__typeInfo, columns, columns__is_set);
    __typeMapper.writeString(__out, heading__typeInfo, heading, heading__is_set);
    __typeMapper.writeObject(__out, layoutRows__typeInfo, layoutRows, layoutRows__is_set);
    __typeMapper.writeInt(__out, rows__typeInfo, rows, rows__is_set);
    __typeMapper.writeBoolean(__out, useCollapsibleSection__typeInfo, useCollapsibleSection, useCollapsibleSection__is_set);
    __typeMapper.writeBoolean(__out, useHeading__typeInfo, useHeading, useHeading__is_set);
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
    if (__typeMapper.verifyElement(__in, columns__typeInfo)) {
      setColumns((int)__typeMapper.readInt(__in, columns__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, heading__typeInfo)) {
      setHeading((java.lang.String)__typeMapper.readString(__in, heading__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, layoutRows__typeInfo)) {
      setLayoutRows((com.sforce.soap.partner.DescribeLayoutRow[])__typeMapper.readObject(__in, layoutRows__typeInfo, com.sforce.soap.partner.DescribeLayoutRow[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, rows__typeInfo)) {
      setRows((int)__typeMapper.readInt(__in, rows__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, useCollapsibleSection__typeInfo)) {
      setUseCollapsibleSection((boolean)__typeMapper.readBoolean(__in, useCollapsibleSection__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, useHeading__typeInfo)) {
      setUseHeading((boolean)__typeMapper.readBoolean(__in, useHeading__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutSection ");
    
    sb.append(" columns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(columns)+"'\n");
    sb.append(" heading=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(heading)+"'\n");
    sb.append(" layoutRows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layoutRows)+"'\n");
    sb.append(" rows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rows)+"'\n");
    sb.append(" useCollapsibleSection=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(useCollapsibleSection)+"'\n");
    sb.append(" useHeading=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(useHeading)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}