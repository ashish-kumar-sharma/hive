/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class SQLNotNullConstraint implements org.apache.thrift.TBase<SQLNotNullConstraint, SQLNotNullConstraint._Fields>, java.io.Serializable, Cloneable, Comparable<SQLNotNullConstraint> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SQLNotNullConstraint");

  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_DB_FIELD_DESC = new org.apache.thrift.protocol.TField("table_db", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COLUMN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("column_name", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("nn_name", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ENABLE_CSTR_FIELD_DESC = new org.apache.thrift.protocol.TField("enable_cstr", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField VALIDATE_CSTR_FIELD_DESC = new org.apache.thrift.protocol.TField("validate_cstr", org.apache.thrift.protocol.TType.BOOL, (short)7);
  private static final org.apache.thrift.protocol.TField RELY_CSTR_FIELD_DESC = new org.apache.thrift.protocol.TField("rely_cstr", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SQLNotNullConstraintStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SQLNotNullConstraintTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String catName; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String table_db; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String table_name; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String column_name; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String nn_name; // required
  private boolean enable_cstr; // required
  private boolean validate_cstr; // required
  private boolean rely_cstr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAT_NAME((short)1, "catName"),
    TABLE_DB((short)2, "table_db"),
    TABLE_NAME((short)3, "table_name"),
    COLUMN_NAME((short)4, "column_name"),
    NN_NAME((short)5, "nn_name"),
    ENABLE_CSTR((short)6, "enable_cstr"),
    VALIDATE_CSTR((short)7, "validate_cstr"),
    RELY_CSTR((short)8, "rely_cstr");

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
        case 1: // CAT_NAME
          return CAT_NAME;
        case 2: // TABLE_DB
          return TABLE_DB;
        case 3: // TABLE_NAME
          return TABLE_NAME;
        case 4: // COLUMN_NAME
          return COLUMN_NAME;
        case 5: // NN_NAME
          return NN_NAME;
        case 6: // ENABLE_CSTR
          return ENABLE_CSTR;
        case 7: // VALIDATE_CSTR
          return VALIDATE_CSTR;
        case 8: // RELY_CSTR
          return RELY_CSTR;
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
  private static final int __ENABLE_CSTR_ISSET_ID = 0;
  private static final int __VALIDATE_CSTR_ISSET_ID = 1;
  private static final int __RELY_CSTR_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_DB, new org.apache.thrift.meta_data.FieldMetaData("table_db", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMN_NAME, new org.apache.thrift.meta_data.FieldMetaData("column_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NN_NAME, new org.apache.thrift.meta_data.FieldMetaData("nn_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENABLE_CSTR, new org.apache.thrift.meta_data.FieldMetaData("enable_cstr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VALIDATE_CSTR, new org.apache.thrift.meta_data.FieldMetaData("validate_cstr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RELY_CSTR, new org.apache.thrift.meta_data.FieldMetaData("rely_cstr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SQLNotNullConstraint.class, metaDataMap);
  }

  public SQLNotNullConstraint() {
  }

  public SQLNotNullConstraint(
    java.lang.String catName,
    java.lang.String table_db,
    java.lang.String table_name,
    java.lang.String column_name,
    java.lang.String nn_name,
    boolean enable_cstr,
    boolean validate_cstr,
    boolean rely_cstr)
  {
    this();
    this.catName = catName;
    this.table_db = table_db;
    this.table_name = table_name;
    this.column_name = column_name;
    this.nn_name = nn_name;
    this.enable_cstr = enable_cstr;
    setEnable_cstrIsSet(true);
    this.validate_cstr = validate_cstr;
    setValidate_cstrIsSet(true);
    this.rely_cstr = rely_cstr;
    setRely_cstrIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SQLNotNullConstraint(SQLNotNullConstraint other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
    if (other.isSetTable_db()) {
      this.table_db = other.table_db;
    }
    if (other.isSetTable_name()) {
      this.table_name = other.table_name;
    }
    if (other.isSetColumn_name()) {
      this.column_name = other.column_name;
    }
    if (other.isSetNn_name()) {
      this.nn_name = other.nn_name;
    }
    this.enable_cstr = other.enable_cstr;
    this.validate_cstr = other.validate_cstr;
    this.rely_cstr = other.rely_cstr;
  }

  public SQLNotNullConstraint deepCopy() {
    return new SQLNotNullConstraint(this);
  }

  @Override
  public void clear() {
    this.catName = null;
    this.table_db = null;
    this.table_name = null;
    this.column_name = null;
    this.nn_name = null;
    setEnable_cstrIsSet(false);
    this.enable_cstr = false;
    setValidate_cstrIsSet(false);
    this.validate_cstr = false;
    setRely_cstrIsSet(false);
    this.rely_cstr = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatName() {
    return this.catName;
  }

  public void setCatName(@org.apache.thrift.annotation.Nullable java.lang.String catName) {
    this.catName = catName;
  }

  public void unsetCatName() {
    this.catName = null;
  }

  /** Returns true if field catName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatName() {
    return this.catName != null;
  }

  public void setCatNameIsSet(boolean value) {
    if (!value) {
      this.catName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTable_db() {
    return this.table_db;
  }

  public void setTable_db(@org.apache.thrift.annotation.Nullable java.lang.String table_db) {
    this.table_db = table_db;
  }

  public void unsetTable_db() {
    this.table_db = null;
  }

  /** Returns true if field table_db is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_db() {
    return this.table_db != null;
  }

  public void setTable_dbIsSet(boolean value) {
    if (!value) {
      this.table_db = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTable_name() {
    return this.table_name;
  }

  public void setTable_name(@org.apache.thrift.annotation.Nullable java.lang.String table_name) {
    this.table_name = table_name;
  }

  public void unsetTable_name() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_name() {
    return this.table_name != null;
  }

  public void setTable_nameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getColumn_name() {
    return this.column_name;
  }

  public void setColumn_name(@org.apache.thrift.annotation.Nullable java.lang.String column_name) {
    this.column_name = column_name;
  }

  public void unsetColumn_name() {
    this.column_name = null;
  }

  /** Returns true if field column_name is set (has been assigned a value) and false otherwise */
  public boolean isSetColumn_name() {
    return this.column_name != null;
  }

  public void setColumn_nameIsSet(boolean value) {
    if (!value) {
      this.column_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNn_name() {
    return this.nn_name;
  }

  public void setNn_name(@org.apache.thrift.annotation.Nullable java.lang.String nn_name) {
    this.nn_name = nn_name;
  }

  public void unsetNn_name() {
    this.nn_name = null;
  }

  /** Returns true if field nn_name is set (has been assigned a value) and false otherwise */
  public boolean isSetNn_name() {
    return this.nn_name != null;
  }

  public void setNn_nameIsSet(boolean value) {
    if (!value) {
      this.nn_name = null;
    }
  }

  public boolean isEnable_cstr() {
    return this.enable_cstr;
  }

  public void setEnable_cstr(boolean enable_cstr) {
    this.enable_cstr = enable_cstr;
    setEnable_cstrIsSet(true);
  }

  public void unsetEnable_cstr() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENABLE_CSTR_ISSET_ID);
  }

  /** Returns true if field enable_cstr is set (has been assigned a value) and false otherwise */
  public boolean isSetEnable_cstr() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENABLE_CSTR_ISSET_ID);
  }

  public void setEnable_cstrIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENABLE_CSTR_ISSET_ID, value);
  }

  public boolean isValidate_cstr() {
    return this.validate_cstr;
  }

  public void setValidate_cstr(boolean validate_cstr) {
    this.validate_cstr = validate_cstr;
    setValidate_cstrIsSet(true);
  }

  public void unsetValidate_cstr() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VALIDATE_CSTR_ISSET_ID);
  }

  /** Returns true if field validate_cstr is set (has been assigned a value) and false otherwise */
  public boolean isSetValidate_cstr() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VALIDATE_CSTR_ISSET_ID);
  }

  public void setValidate_cstrIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VALIDATE_CSTR_ISSET_ID, value);
  }

  public boolean isRely_cstr() {
    return this.rely_cstr;
  }

  public void setRely_cstr(boolean rely_cstr) {
    this.rely_cstr = rely_cstr;
    setRely_cstrIsSet(true);
  }

  public void unsetRely_cstr() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RELY_CSTR_ISSET_ID);
  }

  /** Returns true if field rely_cstr is set (has been assigned a value) and false otherwise */
  public boolean isSetRely_cstr() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RELY_CSTR_ISSET_ID);
  }

  public void setRely_cstrIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RELY_CSTR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((java.lang.String)value);
      }
      break;

    case TABLE_DB:
      if (value == null) {
        unsetTable_db();
      } else {
        setTable_db((java.lang.String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((java.lang.String)value);
      }
      break;

    case COLUMN_NAME:
      if (value == null) {
        unsetColumn_name();
      } else {
        setColumn_name((java.lang.String)value);
      }
      break;

    case NN_NAME:
      if (value == null) {
        unsetNn_name();
      } else {
        setNn_name((java.lang.String)value);
      }
      break;

    case ENABLE_CSTR:
      if (value == null) {
        unsetEnable_cstr();
      } else {
        setEnable_cstr((java.lang.Boolean)value);
      }
      break;

    case VALIDATE_CSTR:
      if (value == null) {
        unsetValidate_cstr();
      } else {
        setValidate_cstr((java.lang.Boolean)value);
      }
      break;

    case RELY_CSTR:
      if (value == null) {
        unsetRely_cstr();
      } else {
        setRely_cstr((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CAT_NAME:
      return getCatName();

    case TABLE_DB:
      return getTable_db();

    case TABLE_NAME:
      return getTable_name();

    case COLUMN_NAME:
      return getColumn_name();

    case NN_NAME:
      return getNn_name();

    case ENABLE_CSTR:
      return isEnable_cstr();

    case VALIDATE_CSTR:
      return isValidate_cstr();

    case RELY_CSTR:
      return isRely_cstr();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CAT_NAME:
      return isSetCatName();
    case TABLE_DB:
      return isSetTable_db();
    case TABLE_NAME:
      return isSetTable_name();
    case COLUMN_NAME:
      return isSetColumn_name();
    case NN_NAME:
      return isSetNn_name();
    case ENABLE_CSTR:
      return isSetEnable_cstr();
    case VALIDATE_CSTR:
      return isSetValidate_cstr();
    case RELY_CSTR:
      return isSetRely_cstr();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SQLNotNullConstraint)
      return this.equals((SQLNotNullConstraint)that);
    return false;
  }

  public boolean equals(SQLNotNullConstraint that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
        return false;
    }

    boolean this_present_table_db = true && this.isSetTable_db();
    boolean that_present_table_db = true && that.isSetTable_db();
    if (this_present_table_db || that_present_table_db) {
      if (!(this_present_table_db && that_present_table_db))
        return false;
      if (!this.table_db.equals(that.table_db))
        return false;
    }

    boolean this_present_table_name = true && this.isSetTable_name();
    boolean that_present_table_name = true && that.isSetTable_name();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_column_name = true && this.isSetColumn_name();
    boolean that_present_column_name = true && that.isSetColumn_name();
    if (this_present_column_name || that_present_column_name) {
      if (!(this_present_column_name && that_present_column_name))
        return false;
      if (!this.column_name.equals(that.column_name))
        return false;
    }

    boolean this_present_nn_name = true && this.isSetNn_name();
    boolean that_present_nn_name = true && that.isSetNn_name();
    if (this_present_nn_name || that_present_nn_name) {
      if (!(this_present_nn_name && that_present_nn_name))
        return false;
      if (!this.nn_name.equals(that.nn_name))
        return false;
    }

    boolean this_present_enable_cstr = true;
    boolean that_present_enable_cstr = true;
    if (this_present_enable_cstr || that_present_enable_cstr) {
      if (!(this_present_enable_cstr && that_present_enable_cstr))
        return false;
      if (this.enable_cstr != that.enable_cstr)
        return false;
    }

    boolean this_present_validate_cstr = true;
    boolean that_present_validate_cstr = true;
    if (this_present_validate_cstr || that_present_validate_cstr) {
      if (!(this_present_validate_cstr && that_present_validate_cstr))
        return false;
      if (this.validate_cstr != that.validate_cstr)
        return false;
    }

    boolean this_present_rely_cstr = true;
    boolean that_present_rely_cstr = true;
    if (this_present_rely_cstr || that_present_rely_cstr) {
      if (!(this_present_rely_cstr && that_present_rely_cstr))
        return false;
      if (this.rely_cstr != that.rely_cstr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCatName()) ? 131071 : 524287);
    if (isSetCatName())
      hashCode = hashCode * 8191 + catName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTable_db()) ? 131071 : 524287);
    if (isSetTable_db())
      hashCode = hashCode * 8191 + table_db.hashCode();

    hashCode = hashCode * 8191 + ((isSetTable_name()) ? 131071 : 524287);
    if (isSetTable_name())
      hashCode = hashCode * 8191 + table_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumn_name()) ? 131071 : 524287);
    if (isSetColumn_name())
      hashCode = hashCode * 8191 + column_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetNn_name()) ? 131071 : 524287);
    if (isSetNn_name())
      hashCode = hashCode * 8191 + nn_name.hashCode();

    hashCode = hashCode * 8191 + ((enable_cstr) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((validate_cstr) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((rely_cstr) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(SQLNotNullConstraint other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCatName(), other.isSetCatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catName, other.catName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTable_db(), other.isSetTable_db());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_db()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_db, other.table_db);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTable_name(), other.isSetTable_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, other.table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumn_name(), other.isSetColumn_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_name, other.column_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNn_name(), other.isSetNn_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNn_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nn_name, other.nn_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEnable_cstr(), other.isSetEnable_cstr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnable_cstr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.enable_cstr, other.enable_cstr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValidate_cstr(), other.isSetValidate_cstr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidate_cstr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validate_cstr, other.validate_cstr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRely_cstr(), other.isSetRely_cstr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRely_cstr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rely_cstr, other.rely_cstr);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SQLNotNullConstraint(");
    boolean first = true;

    sb.append("catName:");
    if (this.catName == null) {
      sb.append("null");
    } else {
      sb.append(this.catName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_db:");
    if (this.table_db == null) {
      sb.append("null");
    } else {
      sb.append(this.table_db);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("column_name:");
    if (this.column_name == null) {
      sb.append("null");
    } else {
      sb.append(this.column_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nn_name:");
    if (this.nn_name == null) {
      sb.append("null");
    } else {
      sb.append(this.nn_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("enable_cstr:");
    sb.append(this.enable_cstr);
    first = false;
    if (!first) sb.append(", ");
    sb.append("validate_cstr:");
    sb.append(this.validate_cstr);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rely_cstr:");
    sb.append(this.rely_cstr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SQLNotNullConstraintStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SQLNotNullConstraintStandardScheme getScheme() {
      return new SQLNotNullConstraintStandardScheme();
    }
  }

  private static class SQLNotNullConstraintStandardScheme extends org.apache.thrift.scheme.StandardScheme<SQLNotNullConstraint> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SQLNotNullConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_db = iprot.readString();
              struct.setTable_dbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTable_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLUMN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.column_name = iprot.readString();
              struct.setColumn_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nn_name = iprot.readString();
              struct.setNn_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ENABLE_CSTR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.enable_cstr = iprot.readBool();
              struct.setEnable_cstrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VALIDATE_CSTR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.validate_cstr = iprot.readBool();
              struct.setValidate_cstrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // RELY_CSTR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.rely_cstr = iprot.readBool();
              struct.setRely_cstrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SQLNotNullConstraint struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catName != null) {
        oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
        oprot.writeString(struct.catName);
        oprot.writeFieldEnd();
      }
      if (struct.table_db != null) {
        oprot.writeFieldBegin(TABLE_DB_FIELD_DESC);
        oprot.writeString(struct.table_db);
        oprot.writeFieldEnd();
      }
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.table_name);
        oprot.writeFieldEnd();
      }
      if (struct.column_name != null) {
        oprot.writeFieldBegin(COLUMN_NAME_FIELD_DESC);
        oprot.writeString(struct.column_name);
        oprot.writeFieldEnd();
      }
      if (struct.nn_name != null) {
        oprot.writeFieldBegin(NN_NAME_FIELD_DESC);
        oprot.writeString(struct.nn_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ENABLE_CSTR_FIELD_DESC);
      oprot.writeBool(struct.enable_cstr);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VALIDATE_CSTR_FIELD_DESC);
      oprot.writeBool(struct.validate_cstr);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RELY_CSTR_FIELD_DESC);
      oprot.writeBool(struct.rely_cstr);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SQLNotNullConstraintTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SQLNotNullConstraintTupleScheme getScheme() {
      return new SQLNotNullConstraintTupleScheme();
    }
  }

  private static class SQLNotNullConstraintTupleScheme extends org.apache.thrift.scheme.TupleScheme<SQLNotNullConstraint> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SQLNotNullConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatName()) {
        optionals.set(0);
      }
      if (struct.isSetTable_db()) {
        optionals.set(1);
      }
      if (struct.isSetTable_name()) {
        optionals.set(2);
      }
      if (struct.isSetColumn_name()) {
        optionals.set(3);
      }
      if (struct.isSetNn_name()) {
        optionals.set(4);
      }
      if (struct.isSetEnable_cstr()) {
        optionals.set(5);
      }
      if (struct.isSetValidate_cstr()) {
        optionals.set(6);
      }
      if (struct.isSetRely_cstr()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
      if (struct.isSetTable_db()) {
        oprot.writeString(struct.table_db);
      }
      if (struct.isSetTable_name()) {
        oprot.writeString(struct.table_name);
      }
      if (struct.isSetColumn_name()) {
        oprot.writeString(struct.column_name);
      }
      if (struct.isSetNn_name()) {
        oprot.writeString(struct.nn_name);
      }
      if (struct.isSetEnable_cstr()) {
        oprot.writeBool(struct.enable_cstr);
      }
      if (struct.isSetValidate_cstr()) {
        oprot.writeBool(struct.validate_cstr);
      }
      if (struct.isSetRely_cstr()) {
        oprot.writeBool(struct.rely_cstr);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SQLNotNullConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.table_db = iprot.readString();
        struct.setTable_dbIsSet(true);
      }
      if (incoming.get(2)) {
        struct.table_name = iprot.readString();
        struct.setTable_nameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.column_name = iprot.readString();
        struct.setColumn_nameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.nn_name = iprot.readString();
        struct.setNn_nameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.enable_cstr = iprot.readBool();
        struct.setEnable_cstrIsSet(true);
      }
      if (incoming.get(6)) {
        struct.validate_cstr = iprot.readBool();
        struct.setValidate_cstrIsSet(true);
      }
      if (incoming.get(7)) {
        struct.rely_cstr = iprot.readBool();
        struct.setRely_cstrIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

