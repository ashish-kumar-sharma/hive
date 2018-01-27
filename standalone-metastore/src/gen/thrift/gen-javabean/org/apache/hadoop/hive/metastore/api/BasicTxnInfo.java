/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class BasicTxnInfo implements org.apache.thrift.TBase<BasicTxnInfo, BasicTxnInfo._Fields>, java.io.Serializable, Cloneable, Comparable<BasicTxnInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BasicTxnInfo");

  private static final org.apache.thrift.protocol.TField ISNULL_FIELD_DESC = new org.apache.thrift.protocol.TField("isnull", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("time", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TXNID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnid", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField DBNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbname", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TABLENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tablename", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PARTITIONNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionname", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BasicTxnInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BasicTxnInfoTupleSchemeFactory());
  }

  private boolean isnull; // required
  private long id; // optional
  private long time; // optional
  private long txnid; // optional
  private String dbname; // optional
  private String tablename; // optional
  private String partitionname; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ISNULL((short)1, "isnull"),
    ID((short)2, "id"),
    TIME((short)3, "time"),
    TXNID((short)4, "txnid"),
    DBNAME((short)5, "dbname"),
    TABLENAME((short)6, "tablename"),
    PARTITIONNAME((short)7, "partitionname");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ISNULL
          return ISNULL;
        case 2: // ID
          return ID;
        case 3: // TIME
          return TIME;
        case 4: // TXNID
          return TXNID;
        case 5: // DBNAME
          return DBNAME;
        case 6: // TABLENAME
          return TABLENAME;
        case 7: // PARTITIONNAME
          return PARTITIONNAME;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISNULL_ISSET_ID = 0;
  private static final int __ID_ISSET_ID = 1;
  private static final int __TIME_ISSET_ID = 2;
  private static final int __TXNID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.TIME,_Fields.TXNID,_Fields.DBNAME,_Fields.TABLENAME,_Fields.PARTITIONNAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ISNULL, new org.apache.thrift.meta_data.FieldMetaData("isnull", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TXNID, new org.apache.thrift.meta_data.FieldMetaData("txnid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DBNAME, new org.apache.thrift.meta_data.FieldMetaData("dbname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLENAME, new org.apache.thrift.meta_data.FieldMetaData("tablename", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONNAME, new org.apache.thrift.meta_data.FieldMetaData("partitionname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BasicTxnInfo.class, metaDataMap);
  }

  public BasicTxnInfo() {
  }

  public BasicTxnInfo(
    boolean isnull)
  {
    this();
    this.isnull = isnull;
    setIsnullIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BasicTxnInfo(BasicTxnInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isnull = other.isnull;
    this.id = other.id;
    this.time = other.time;
    this.txnid = other.txnid;
    if (other.isSetDbname()) {
      this.dbname = other.dbname;
    }
    if (other.isSetTablename()) {
      this.tablename = other.tablename;
    }
    if (other.isSetPartitionname()) {
      this.partitionname = other.partitionname;
    }
  }

  public BasicTxnInfo deepCopy() {
    return new BasicTxnInfo(this);
  }

  @Override
  public void clear() {
    setIsnullIsSet(false);
    this.isnull = false;
    setIdIsSet(false);
    this.id = 0;
    setTimeIsSet(false);
    this.time = 0;
    setTxnidIsSet(false);
    this.txnid = 0;
    this.dbname = null;
    this.tablename = null;
    this.partitionname = null;
  }

  public boolean isIsnull() {
    return this.isnull;
  }

  public void setIsnull(boolean isnull) {
    this.isnull = isnull;
    setIsnullIsSet(true);
  }

  public void unsetIsnull() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISNULL_ISSET_ID);
  }

  /** Returns true if field isnull is set (has been assigned a value) and false otherwise */
  public boolean isSetIsnull() {
    return EncodingUtils.testBit(__isset_bitfield, __ISNULL_ISSET_ID);
  }

  public void setIsnullIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISNULL_ISSET_ID, value);
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
    setIdIsSet(true);
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public long getTime() {
    return this.time;
  }

  public void setTime(long time) {
    this.time = time;
    setTimeIsSet(true);
  }

  public void unsetTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  /** Returns true if field time is set (has been assigned a value) and false otherwise */
  public boolean isSetTime() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  public void setTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
  }

  public long getTxnid() {
    return this.txnid;
  }

  public void setTxnid(long txnid) {
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  public void unsetTxnid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnid is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnid() {
    return EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public String getDbname() {
    return this.dbname;
  }

  public void setDbname(String dbname) {
    this.dbname = dbname;
  }

  public void unsetDbname() {
    this.dbname = null;
  }

  /** Returns true if field dbname is set (has been assigned a value) and false otherwise */
  public boolean isSetDbname() {
    return this.dbname != null;
  }

  public void setDbnameIsSet(boolean value) {
    if (!value) {
      this.dbname = null;
    }
  }

  public String getTablename() {
    return this.tablename;
  }

  public void setTablename(String tablename) {
    this.tablename = tablename;
  }

  public void unsetTablename() {
    this.tablename = null;
  }

  /** Returns true if field tablename is set (has been assigned a value) and false otherwise */
  public boolean isSetTablename() {
    return this.tablename != null;
  }

  public void setTablenameIsSet(boolean value) {
    if (!value) {
      this.tablename = null;
    }
  }

  public String getPartitionname() {
    return this.partitionname;
  }

  public void setPartitionname(String partitionname) {
    this.partitionname = partitionname;
  }

  public void unsetPartitionname() {
    this.partitionname = null;
  }

  /** Returns true if field partitionname is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionname() {
    return this.partitionname != null;
  }

  public void setPartitionnameIsSet(boolean value) {
    if (!value) {
      this.partitionname = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ISNULL:
      if (value == null) {
        unsetIsnull();
      } else {
        setIsnull((Boolean)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((Long)value);
      }
      break;

    case TXNID:
      if (value == null) {
        unsetTxnid();
      } else {
        setTxnid((Long)value);
      }
      break;

    case DBNAME:
      if (value == null) {
        unsetDbname();
      } else {
        setDbname((String)value);
      }
      break;

    case TABLENAME:
      if (value == null) {
        unsetTablename();
      } else {
        setTablename((String)value);
      }
      break;

    case PARTITIONNAME:
      if (value == null) {
        unsetPartitionname();
      } else {
        setPartitionname((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ISNULL:
      return isIsnull();

    case ID:
      return getId();

    case TIME:
      return getTime();

    case TXNID:
      return getTxnid();

    case DBNAME:
      return getDbname();

    case TABLENAME:
      return getTablename();

    case PARTITIONNAME:
      return getPartitionname();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ISNULL:
      return isSetIsnull();
    case ID:
      return isSetId();
    case TIME:
      return isSetTime();
    case TXNID:
      return isSetTxnid();
    case DBNAME:
      return isSetDbname();
    case TABLENAME:
      return isSetTablename();
    case PARTITIONNAME:
      return isSetPartitionname();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BasicTxnInfo)
      return this.equals((BasicTxnInfo)that);
    return false;
  }

  public boolean equals(BasicTxnInfo that) {
    if (that == null)
      return false;

    boolean this_present_isnull = true;
    boolean that_present_isnull = true;
    if (this_present_isnull || that_present_isnull) {
      if (!(this_present_isnull && that_present_isnull))
        return false;
      if (this.isnull != that.isnull)
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_time = true && this.isSetTime();
    boolean that_present_time = true && that.isSetTime();
    if (this_present_time || that_present_time) {
      if (!(this_present_time && that_present_time))
        return false;
      if (this.time != that.time)
        return false;
    }

    boolean this_present_txnid = true && this.isSetTxnid();
    boolean that_present_txnid = true && that.isSetTxnid();
    if (this_present_txnid || that_present_txnid) {
      if (!(this_present_txnid && that_present_txnid))
        return false;
      if (this.txnid != that.txnid)
        return false;
    }

    boolean this_present_dbname = true && this.isSetDbname();
    boolean that_present_dbname = true && that.isSetDbname();
    if (this_present_dbname || that_present_dbname) {
      if (!(this_present_dbname && that_present_dbname))
        return false;
      if (!this.dbname.equals(that.dbname))
        return false;
    }

    boolean this_present_tablename = true && this.isSetTablename();
    boolean that_present_tablename = true && that.isSetTablename();
    if (this_present_tablename || that_present_tablename) {
      if (!(this_present_tablename && that_present_tablename))
        return false;
      if (!this.tablename.equals(that.tablename))
        return false;
    }

    boolean this_present_partitionname = true && this.isSetPartitionname();
    boolean that_present_partitionname = true && that.isSetPartitionname();
    if (this_present_partitionname || that_present_partitionname) {
      if (!(this_present_partitionname && that_present_partitionname))
        return false;
      if (!this.partitionname.equals(that.partitionname))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_isnull = true;
    list.add(present_isnull);
    if (present_isnull)
      list.add(isnull);

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_time = true && (isSetTime());
    list.add(present_time);
    if (present_time)
      list.add(time);

    boolean present_txnid = true && (isSetTxnid());
    list.add(present_txnid);
    if (present_txnid)
      list.add(txnid);

    boolean present_dbname = true && (isSetDbname());
    list.add(present_dbname);
    if (present_dbname)
      list.add(dbname);

    boolean present_tablename = true && (isSetTablename());
    list.add(present_tablename);
    if (present_tablename)
      list.add(tablename);

    boolean present_partitionname = true && (isSetPartitionname());
    list.add(present_partitionname);
    if (present_partitionname)
      list.add(partitionname);

    return list.hashCode();
  }

  @Override
  public int compareTo(BasicTxnInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIsnull()).compareTo(other.isSetIsnull());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsnull()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isnull, other.isnull);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime()).compareTo(other.isSetTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time, other.time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTxnid()).compareTo(other.isSetTxnid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnid, other.txnid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbname()).compareTo(other.isSetDbname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbname, other.dbname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTablename()).compareTo(other.isSetTablename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablename, other.tablename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionname()).compareTo(other.isSetPartitionname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionname, other.partitionname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BasicTxnInfo(");
    boolean first = true;

    sb.append("isnull:");
    sb.append(this.isnull);
    first = false;
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetTime()) {
      if (!first) sb.append(", ");
      sb.append("time:");
      sb.append(this.time);
      first = false;
    }
    if (isSetTxnid()) {
      if (!first) sb.append(", ");
      sb.append("txnid:");
      sb.append(this.txnid);
      first = false;
    }
    if (isSetDbname()) {
      if (!first) sb.append(", ");
      sb.append("dbname:");
      if (this.dbname == null) {
        sb.append("null");
      } else {
        sb.append(this.dbname);
      }
      first = false;
    }
    if (isSetTablename()) {
      if (!first) sb.append(", ");
      sb.append("tablename:");
      if (this.tablename == null) {
        sb.append("null");
      } else {
        sb.append(this.tablename);
      }
      first = false;
    }
    if (isSetPartitionname()) {
      if (!first) sb.append(", ");
      sb.append("partitionname:");
      if (this.partitionname == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionname);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetIsnull()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'isnull' is unset! Struct:" + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BasicTxnInfoStandardSchemeFactory implements SchemeFactory {
    public BasicTxnInfoStandardScheme getScheme() {
      return new BasicTxnInfoStandardScheme();
    }
  }

  private static class BasicTxnInfoStandardScheme extends StandardScheme<BasicTxnInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BasicTxnInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ISNULL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isnull = iprot.readBool();
              struct.setIsnullIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time = iprot.readI64();
              struct.setTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TXNID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnid = iprot.readI64();
              struct.setTxnidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DBNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbname = iprot.readString();
              struct.setDbnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TABLENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tablename = iprot.readString();
              struct.setTablenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PARTITIONNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partitionname = iprot.readString();
              struct.setPartitionnameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BasicTxnInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ISNULL_FIELD_DESC);
      oprot.writeBool(struct.isnull);
      oprot.writeFieldEnd();
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTime()) {
        oprot.writeFieldBegin(TIME_FIELD_DESC);
        oprot.writeI64(struct.time);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTxnid()) {
        oprot.writeFieldBegin(TXNID_FIELD_DESC);
        oprot.writeI64(struct.txnid);
        oprot.writeFieldEnd();
      }
      if (struct.dbname != null) {
        if (struct.isSetDbname()) {
          oprot.writeFieldBegin(DBNAME_FIELD_DESC);
          oprot.writeString(struct.dbname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tablename != null) {
        if (struct.isSetTablename()) {
          oprot.writeFieldBegin(TABLENAME_FIELD_DESC);
          oprot.writeString(struct.tablename);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partitionname != null) {
        if (struct.isSetPartitionname()) {
          oprot.writeFieldBegin(PARTITIONNAME_FIELD_DESC);
          oprot.writeString(struct.partitionname);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BasicTxnInfoTupleSchemeFactory implements SchemeFactory {
    public BasicTxnInfoTupleScheme getScheme() {
      return new BasicTxnInfoTupleScheme();
    }
  }

  private static class BasicTxnInfoTupleScheme extends TupleScheme<BasicTxnInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BasicTxnInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.isnull);
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTime()) {
        optionals.set(1);
      }
      if (struct.isSetTxnid()) {
        optionals.set(2);
      }
      if (struct.isSetDbname()) {
        optionals.set(3);
      }
      if (struct.isSetTablename()) {
        optionals.set(4);
      }
      if (struct.isSetPartitionname()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetTime()) {
        oprot.writeI64(struct.time);
      }
      if (struct.isSetTxnid()) {
        oprot.writeI64(struct.txnid);
      }
      if (struct.isSetDbname()) {
        oprot.writeString(struct.dbname);
      }
      if (struct.isSetTablename()) {
        oprot.writeString(struct.tablename);
      }
      if (struct.isSetPartitionname()) {
        oprot.writeString(struct.partitionname);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BasicTxnInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.isnull = iprot.readBool();
      struct.setIsnullIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.time = iprot.readI64();
        struct.setTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.txnid = iprot.readI64();
        struct.setTxnidIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dbname = iprot.readString();
        struct.setDbnameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.tablename = iprot.readString();
        struct.setTablenameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.partitionname = iprot.readString();
        struct.setPartitionnameIsSet(true);
      }
    }
  }

}
