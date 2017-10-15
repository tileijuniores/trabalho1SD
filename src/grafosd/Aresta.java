/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package grafosd;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aresta implements org.apache.thrift.TBase<Aresta, Aresta._Fields>, java.io.Serializable, Cloneable, Comparable<Aresta> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Aresta");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ORIGEM_FIELD_DESC = new org.apache.thrift.protocol.TField("origem", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DESTINO_FIELD_DESC = new org.apache.thrift.protocol.TField("destino", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PESO_FIELD_DESC = new org.apache.thrift.protocol.TField("peso", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("flag", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField DESCRICAO_FIELD_DESC = new org.apache.thrift.protocol.TField("descricao", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ArestaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ArestaTupleSchemeFactory());
  }

  public int id; // required
  public int origem; // required
  public int destino; // required
  public double peso; // required
  public int flag; // required
  public String descricao; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    ORIGEM((short)2, "origem"),
    DESTINO((short)3, "destino"),
    PESO((short)4, "peso"),
    FLAG((short)5, "flag"),
    DESCRICAO((short)6, "descricao");

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
        case 1: // ID
          return ID;
        case 2: // ORIGEM
          return ORIGEM;
        case 3: // DESTINO
          return DESTINO;
        case 4: // PESO
          return PESO;
        case 5: // FLAG
          return FLAG;
        case 6: // DESCRICAO
          return DESCRICAO;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __ORIGEM_ISSET_ID = 1;
  private static final int __DESTINO_ISSET_ID = 2;
  private static final int __PESO_ISSET_ID = 3;
  private static final int __FLAG_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ORIGEM, new org.apache.thrift.meta_data.FieldMetaData("origem", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESTINO, new org.apache.thrift.meta_data.FieldMetaData("destino", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PESO, new org.apache.thrift.meta_data.FieldMetaData("peso", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.FLAG, new org.apache.thrift.meta_data.FieldMetaData("flag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCRICAO, new org.apache.thrift.meta_data.FieldMetaData("descricao", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Aresta.class, metaDataMap);
  }

  public Aresta() {
  }

  public Aresta(
    int id,
    int origem,
    int destino,
    double peso,
    int flag,
    String descricao)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.origem = origem;
    setOrigemIsSet(true);
    this.destino = destino;
    setDestinoIsSet(true);
    this.peso = peso;
    setPesoIsSet(true);
    this.flag = flag;
    setFlagIsSet(true);
    this.descricao = descricao;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Aresta(Aresta other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.origem = other.origem;
    this.destino = other.destino;
    this.peso = other.peso;
    this.flag = other.flag;
    if (other.isSetDescricao()) {
      this.descricao = other.descricao;
    }
  }

  public Aresta deepCopy() {
    return new Aresta(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setOrigemIsSet(false);
    this.origem = 0;
    setDestinoIsSet(false);
    this.destino = 0;
    setPesoIsSet(false);
    this.peso = 0.0;
    setFlagIsSet(false);
    this.flag = 0;
    this.descricao = null;
  }

  public int getId() {
    return this.id;
  }

  public Aresta setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
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

  public int getOrigem() {
    return this.origem;
  }

  public Aresta setOrigem(int origem) {
    this.origem = origem;
    setOrigemIsSet(true);
    return this;
  }

  public void unsetOrigem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ORIGEM_ISSET_ID);
  }

  /** Returns true if field origem is set (has been assigned a value) and false otherwise */
  public boolean isSetOrigem() {
    return EncodingUtils.testBit(__isset_bitfield, __ORIGEM_ISSET_ID);
  }

  public void setOrigemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ORIGEM_ISSET_ID, value);
  }

  public int getDestino() {
    return this.destino;
  }

  public Aresta setDestino(int destino) {
    this.destino = destino;
    setDestinoIsSet(true);
    return this;
  }

  public void unsetDestino() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DESTINO_ISSET_ID);
  }

  /** Returns true if field destino is set (has been assigned a value) and false otherwise */
  public boolean isSetDestino() {
    return EncodingUtils.testBit(__isset_bitfield, __DESTINO_ISSET_ID);
  }

  public void setDestinoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DESTINO_ISSET_ID, value);
  }

  public double getPeso() {
    return this.peso;
  }

  public Aresta setPeso(double peso) {
    this.peso = peso;
    setPesoIsSet(true);
    return this;
  }

  public void unsetPeso() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  /** Returns true if field peso is set (has been assigned a value) and false otherwise */
  public boolean isSetPeso() {
    return EncodingUtils.testBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  public void setPesoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PESO_ISSET_ID, value);
  }

  public int getFlag() {
    return this.flag;
  }

  public Aresta setFlag(int flag) {
    this.flag = flag;
    setFlagIsSet(true);
    return this;
  }

  public void unsetFlag() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  /** Returns true if field flag is set (has been assigned a value) and false otherwise */
  public boolean isSetFlag() {
    return EncodingUtils.testBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  public void setFlagIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FLAG_ISSET_ID, value);
  }

  public String getDescricao() {
    return this.descricao;
  }

  public Aresta setDescricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  public void unsetDescricao() {
    this.descricao = null;
  }

  /** Returns true if field descricao is set (has been assigned a value) and false otherwise */
  public boolean isSetDescricao() {
    return this.descricao != null;
  }

  public void setDescricaoIsSet(boolean value) {
    if (!value) {
      this.descricao = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case ORIGEM:
      if (value == null) {
        unsetOrigem();
      } else {
        setOrigem((Integer)value);
      }
      break;

    case DESTINO:
      if (value == null) {
        unsetDestino();
      } else {
        setDestino((Integer)value);
      }
      break;

    case PESO:
      if (value == null) {
        unsetPeso();
      } else {
        setPeso((Double)value);
      }
      break;

    case FLAG:
      if (value == null) {
        unsetFlag();
      } else {
        setFlag((Integer)value);
      }
      break;

    case DESCRICAO:
      if (value == null) {
        unsetDescricao();
      } else {
        setDescricao((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case ORIGEM:
      return Integer.valueOf(getOrigem());

    case DESTINO:
      return Integer.valueOf(getDestino());

    case PESO:
      return Double.valueOf(getPeso());

    case FLAG:
      return Integer.valueOf(getFlag());

    case DESCRICAO:
      return getDescricao();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case ORIGEM:
      return isSetOrigem();
    case DESTINO:
      return isSetDestino();
    case PESO:
      return isSetPeso();
    case FLAG:
      return isSetFlag();
    case DESCRICAO:
      return isSetDescricao();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Aresta)
      return this.equals((Aresta)that);
    return false;
  }

  public boolean equals(Aresta that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_origem = true;
    boolean that_present_origem = true;
    if (this_present_origem || that_present_origem) {
      if (!(this_present_origem && that_present_origem))
        return false;
      if (this.origem != that.origem)
        return false;
    }

    boolean this_present_destino = true;
    boolean that_present_destino = true;
    if (this_present_destino || that_present_destino) {
      if (!(this_present_destino && that_present_destino))
        return false;
      if (this.destino != that.destino)
        return false;
    }

    boolean this_present_peso = true;
    boolean that_present_peso = true;
    if (this_present_peso || that_present_peso) {
      if (!(this_present_peso && that_present_peso))
        return false;
      if (this.peso != that.peso)
        return false;
    }

    boolean this_present_flag = true;
    boolean that_present_flag = true;
    if (this_present_flag || that_present_flag) {
      if (!(this_present_flag && that_present_flag))
        return false;
      if (this.flag != that.flag)
        return false;
    }

    boolean this_present_descricao = true && this.isSetDescricao();
    boolean that_present_descricao = true && that.isSetDescricao();
    if (this_present_descricao || that_present_descricao) {
      if (!(this_present_descricao && that_present_descricao))
        return false;
      if (!this.descricao.equals(that.descricao))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Aresta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetOrigem()).compareTo(other.isSetOrigem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrigem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.origem, other.origem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDestino()).compareTo(other.isSetDestino());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestino()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destino, other.destino);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeso()).compareTo(other.isSetPeso());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeso()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peso, other.peso);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFlag()).compareTo(other.isSetFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.flag, other.flag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescricao()).compareTo(other.isSetDescricao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescricao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descricao, other.descricao);
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
    StringBuilder sb = new StringBuilder("Aresta(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("origem:");
    sb.append(this.origem);
    first = false;
    if (!first) sb.append(", ");
    sb.append("destino:");
    sb.append(this.destino);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peso:");
    sb.append(this.peso);
    first = false;
    if (!first) sb.append(", ");
    sb.append("flag:");
    sb.append(this.flag);
    first = false;
    if (!first) sb.append(", ");
    sb.append("descricao:");
    if (this.descricao == null) {
      sb.append("null");
    } else {
      sb.append(this.descricao);
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ArestaStandardSchemeFactory implements SchemeFactory {
    public ArestaStandardScheme getScheme() {
      return new ArestaStandardScheme();
    }
  }

  private static class ArestaStandardScheme extends StandardScheme<Aresta> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Aresta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORIGEM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.origem = iprot.readI32();
              struct.setOrigemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESTINO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.destino = iprot.readI32();
              struct.setDestinoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PESO
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.peso = iprot.readDouble();
              struct.setPesoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.flag = iprot.readI32();
              struct.setFlagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DESCRICAO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descricao = iprot.readString();
              struct.setDescricaoIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Aresta struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ORIGEM_FIELD_DESC);
      oprot.writeI32(struct.origem);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DESTINO_FIELD_DESC);
      oprot.writeI32(struct.destino);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PESO_FIELD_DESC);
      oprot.writeDouble(struct.peso);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FLAG_FIELD_DESC);
      oprot.writeI32(struct.flag);
      oprot.writeFieldEnd();
      if (struct.descricao != null) {
        oprot.writeFieldBegin(DESCRICAO_FIELD_DESC);
        oprot.writeString(struct.descricao);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ArestaTupleSchemeFactory implements SchemeFactory {
    public ArestaTupleScheme getScheme() {
      return new ArestaTupleScheme();
    }
  }

  private static class ArestaTupleScheme extends TupleScheme<Aresta> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Aresta struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetOrigem()) {
        optionals.set(1);
      }
      if (struct.isSetDestino()) {
        optionals.set(2);
      }
      if (struct.isSetPeso()) {
        optionals.set(3);
      }
      if (struct.isSetFlag()) {
        optionals.set(4);
      }
      if (struct.isSetDescricao()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetOrigem()) {
        oprot.writeI32(struct.origem);
      }
      if (struct.isSetDestino()) {
        oprot.writeI32(struct.destino);
      }
      if (struct.isSetPeso()) {
        oprot.writeDouble(struct.peso);
      }
      if (struct.isSetFlag()) {
        oprot.writeI32(struct.flag);
      }
      if (struct.isSetDescricao()) {
        oprot.writeString(struct.descricao);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Aresta struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.origem = iprot.readI32();
        struct.setOrigemIsSet(true);
      }
      if (incoming.get(2)) {
        struct.destino = iprot.readI32();
        struct.setDestinoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.peso = iprot.readDouble();
        struct.setPesoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.flag = iprot.readI32();
        struct.setFlagIsSet(true);
      }
      if (incoming.get(5)) {
        struct.descricao = iprot.readString();
        struct.setDescricaoIsSet(true);
      }
    }
  }

}

