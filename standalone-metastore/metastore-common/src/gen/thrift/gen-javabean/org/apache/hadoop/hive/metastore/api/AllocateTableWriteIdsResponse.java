/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class AllocateTableWriteIdsResponse implements org.apache.thrift.TBase<AllocateTableWriteIdsResponse, AllocateTableWriteIdsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<AllocateTableWriteIdsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AllocateTableWriteIdsResponse");

  private static final org.apache.thrift.protocol.TField TXN_TO_WRITE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("txnToWriteIds", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AllocateTableWriteIdsResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AllocateTableWriteIdsResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<TxnToWriteId> txnToWriteIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXN_TO_WRITE_IDS((short)1, "txnToWriteIds");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TXN_TO_WRITE_IDS
          return TXN_TO_WRITE_IDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXN_TO_WRITE_IDS, new org.apache.thrift.meta_data.FieldMetaData("txnToWriteIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TxnToWriteId.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AllocateTableWriteIdsResponse.class, metaDataMap);
  }

  public AllocateTableWriteIdsResponse() {
  }

  public AllocateTableWriteIdsResponse(
    java.util.List<TxnToWriteId> txnToWriteIds)
  {
    this();
    this.txnToWriteIds = txnToWriteIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AllocateTableWriteIdsResponse(AllocateTableWriteIdsResponse other) {
    if (other.isSetTxnToWriteIds()) {
      java.util.List<TxnToWriteId> __this__txnToWriteIds = new java.util.ArrayList<TxnToWriteId>(other.txnToWriteIds.size());
      for (TxnToWriteId other_element : other.txnToWriteIds) {
        __this__txnToWriteIds.add(new TxnToWriteId(other_element));
      }
      this.txnToWriteIds = __this__txnToWriteIds;
    }
  }

  public AllocateTableWriteIdsResponse deepCopy() {
    return new AllocateTableWriteIdsResponse(this);
  }

  @Override
  public void clear() {
    this.txnToWriteIds = null;
  }

  public int getTxnToWriteIdsSize() {
    return (this.txnToWriteIds == null) ? 0 : this.txnToWriteIds.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TxnToWriteId> getTxnToWriteIdsIterator() {
    return (this.txnToWriteIds == null) ? null : this.txnToWriteIds.iterator();
  }

  public void addToTxnToWriteIds(TxnToWriteId elem) {
    if (this.txnToWriteIds == null) {
      this.txnToWriteIds = new java.util.ArrayList<TxnToWriteId>();
    }
    this.txnToWriteIds.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TxnToWriteId> getTxnToWriteIds() {
    return this.txnToWriteIds;
  }

  public void setTxnToWriteIds(@org.apache.thrift.annotation.Nullable java.util.List<TxnToWriteId> txnToWriteIds) {
    this.txnToWriteIds = txnToWriteIds;
  }

  public void unsetTxnToWriteIds() {
    this.txnToWriteIds = null;
  }

  /** Returns true if field txnToWriteIds is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnToWriteIds() {
    return this.txnToWriteIds != null;
  }

  public void setTxnToWriteIdsIsSet(boolean value) {
    if (!value) {
      this.txnToWriteIds = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TXN_TO_WRITE_IDS:
      if (value == null) {
        unsetTxnToWriteIds();
      } else {
        setTxnToWriteIds((java.util.List<TxnToWriteId>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TXN_TO_WRITE_IDS:
      return getTxnToWriteIds();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TXN_TO_WRITE_IDS:
      return isSetTxnToWriteIds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AllocateTableWriteIdsResponse)
      return this.equals((AllocateTableWriteIdsResponse)that);
    return false;
  }

  public boolean equals(AllocateTableWriteIdsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_txnToWriteIds = true && this.isSetTxnToWriteIds();
    boolean that_present_txnToWriteIds = true && that.isSetTxnToWriteIds();
    if (this_present_txnToWriteIds || that_present_txnToWriteIds) {
      if (!(this_present_txnToWriteIds && that_present_txnToWriteIds))
        return false;
      if (!this.txnToWriteIds.equals(that.txnToWriteIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTxnToWriteIds()) ? 131071 : 524287);
    if (isSetTxnToWriteIds())
      hashCode = hashCode * 8191 + txnToWriteIds.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AllocateTableWriteIdsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTxnToWriteIds()).compareTo(other.isSetTxnToWriteIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnToWriteIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnToWriteIds, other.txnToWriteIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AllocateTableWriteIdsResponse(");
    boolean first = true;

    sb.append("txnToWriteIds:");
    if (this.txnToWriteIds == null) {
      sb.append("null");
    } else {
      sb.append(this.txnToWriteIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxnToWriteIds()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txnToWriteIds' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AllocateTableWriteIdsResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AllocateTableWriteIdsResponseStandardScheme getScheme() {
      return new AllocateTableWriteIdsResponseStandardScheme();
    }
  }

  private static class AllocateTableWriteIdsResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<AllocateTableWriteIdsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AllocateTableWriteIdsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXN_TO_WRITE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list770 = iprot.readListBegin();
                struct.txnToWriteIds = new java.util.ArrayList<TxnToWriteId>(_list770.size);
                @org.apache.thrift.annotation.Nullable TxnToWriteId _elem771;
                for (int _i772 = 0; _i772 < _list770.size; ++_i772)
                {
                  _elem771 = new TxnToWriteId();
                  _elem771.read(iprot);
                  struct.txnToWriteIds.add(_elem771);
                }
                iprot.readListEnd();
              }
              struct.setTxnToWriteIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AllocateTableWriteIdsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.txnToWriteIds != null) {
        oprot.writeFieldBegin(TXN_TO_WRITE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.txnToWriteIds.size()));
          for (TxnToWriteId _iter773 : struct.txnToWriteIds)
          {
            _iter773.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AllocateTableWriteIdsResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AllocateTableWriteIdsResponseTupleScheme getScheme() {
      return new AllocateTableWriteIdsResponseTupleScheme();
    }
  }

  private static class AllocateTableWriteIdsResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<AllocateTableWriteIdsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AllocateTableWriteIdsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.txnToWriteIds.size());
        for (TxnToWriteId _iter774 : struct.txnToWriteIds)
        {
          _iter774.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AllocateTableWriteIdsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list775 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.txnToWriteIds = new java.util.ArrayList<TxnToWriteId>(_list775.size);
        @org.apache.thrift.annotation.Nullable TxnToWriteId _elem776;
        for (int _i777 = 0; _i777 < _list775.size; ++_i777)
        {
          _elem776 = new TxnToWriteId();
          _elem776.read(iprot);
          struct.txnToWriteIds.add(_elem776);
        }
      }
      struct.setTxnToWriteIdsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

