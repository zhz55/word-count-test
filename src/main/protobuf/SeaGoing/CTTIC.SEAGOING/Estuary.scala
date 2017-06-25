// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package SeaGoing.CTTIC.SEAGOING



@SerialVersionUID(0L)
final case class Estuary(
    riverType: SeaGoing.CTTIC.SEAGOING.RriverType,
    vehiclePosition: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehiclePosition] = _root_.scala.collection.Seq.empty,
    vehTermReg: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehTermReg] = _root_.scala.collection.Seq.empty,
    vehicleDriverInfo: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo] = _root_.scala.collection.Seq.empty,
    vehicleEwayBill: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleEwayBill] = _root_.scala.collection.Seq.empty,
    vehBaseInfo: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehBaseInfo] = _root_.scala.collection.Seq.empty,
    providerInfo: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.ProviderInfo] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Estuary] with com.trueaccord.lenses.Updatable[Estuary] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, riverType.value)
      vehiclePosition.foreach(vehiclePosition => __size += 3 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(vehiclePosition.serializedSize) + vehiclePosition.serializedSize)
      vehTermReg.foreach(vehTermReg => __size += 3 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(vehTermReg.serializedSize) + vehTermReg.serializedSize)
      vehicleDriverInfo.foreach(vehicleDriverInfo => __size += 3 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(vehicleDriverInfo.serializedSize) + vehicleDriverInfo.serializedSize)
      vehicleEwayBill.foreach(vehicleEwayBill => __size += 3 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(vehicleEwayBill.serializedSize) + vehicleEwayBill.serializedSize)
      vehBaseInfo.foreach(vehBaseInfo => __size += 3 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(vehBaseInfo.serializedSize) + vehBaseInfo.serializedSize)
      providerInfo.foreach(providerInfo => __size += 3 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(providerInfo.serializedSize) + providerInfo.serializedSize)
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      _output__.writeEnum(1, riverType.value)
      vehiclePosition.foreach { __v =>
        _output__.writeTag(4097, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      vehTermReg.foreach { __v =>
        _output__.writeTag(4098, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      vehicleDriverInfo.foreach { __v =>
        _output__.writeTag(4099, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      vehicleEwayBill.foreach { __v =>
        _output__.writeTag(4100, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      vehBaseInfo.foreach { __v =>
        _output__.writeTag(4101, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      providerInfo.foreach { __v =>
        _output__.writeTag(4102, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): SeaGoing.CTTIC.SEAGOING.Estuary = {
      var __riverType = this.riverType
      val __vehiclePosition = (_root_.scala.collection.immutable.Vector.newBuilder[SeaGoing.CTTIC.SEAGOING.VehiclePosition] ++= this.vehiclePosition)
      val __vehTermReg = (_root_.scala.collection.immutable.Vector.newBuilder[SeaGoing.CTTIC.SEAGOING.VehTermReg] ++= this.vehTermReg)
      val __vehicleDriverInfo = (_root_.scala.collection.immutable.Vector.newBuilder[SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo] ++= this.vehicleDriverInfo)
      val __vehicleEwayBill = (_root_.scala.collection.immutable.Vector.newBuilder[SeaGoing.CTTIC.SEAGOING.VehicleEwayBill] ++= this.vehicleEwayBill)
      val __vehBaseInfo = (_root_.scala.collection.immutable.Vector.newBuilder[SeaGoing.CTTIC.SEAGOING.VehBaseInfo] ++= this.vehBaseInfo)
      val __providerInfo = (_root_.scala.collection.immutable.Vector.newBuilder[SeaGoing.CTTIC.SEAGOING.ProviderInfo] ++= this.providerInfo)
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __riverType = SeaGoing.CTTIC.SEAGOING.RriverType.fromValue(_input__.readEnum())
            __requiredFields0 &= 0xfffffffffffffffeL
          case 32778 =>
            __vehiclePosition += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, SeaGoing.CTTIC.SEAGOING.VehiclePosition.defaultInstance)
          case 32786 =>
            __vehTermReg += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, SeaGoing.CTTIC.SEAGOING.VehTermReg.defaultInstance)
          case 32794 =>
            __vehicleDriverInfo += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo.defaultInstance)
          case 32802 =>
            __vehicleEwayBill += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, SeaGoing.CTTIC.SEAGOING.VehicleEwayBill.defaultInstance)
          case 32810 =>
            __vehBaseInfo += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, SeaGoing.CTTIC.SEAGOING.VehBaseInfo.defaultInstance)
          case 32818 =>
            __providerInfo += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, SeaGoing.CTTIC.SEAGOING.ProviderInfo.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      SeaGoing.CTTIC.SEAGOING.Estuary(
          riverType = __riverType,
          vehiclePosition = __vehiclePosition.result(),
          vehTermReg = __vehTermReg.result(),
          vehicleDriverInfo = __vehicleDriverInfo.result(),
          vehicleEwayBill = __vehicleEwayBill.result(),
          vehBaseInfo = __vehBaseInfo.result(),
          providerInfo = __providerInfo.result()
      )
    }
    def withRiverType(__v: SeaGoing.CTTIC.SEAGOING.RriverType): Estuary = copy(riverType = __v)
    def clearVehiclePosition = copy(vehiclePosition = _root_.scala.collection.Seq.empty)
    def addVehiclePosition(__vs: SeaGoing.CTTIC.SEAGOING.VehiclePosition*): Estuary = addAllVehiclePosition(__vs)
    def addAllVehiclePosition(__vs: TraversableOnce[SeaGoing.CTTIC.SEAGOING.VehiclePosition]): Estuary = copy(vehiclePosition = vehiclePosition ++ __vs)
    def withVehiclePosition(__v: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehiclePosition]): Estuary = copy(vehiclePosition = __v)
    def clearVehTermReg = copy(vehTermReg = _root_.scala.collection.Seq.empty)
    def addVehTermReg(__vs: SeaGoing.CTTIC.SEAGOING.VehTermReg*): Estuary = addAllVehTermReg(__vs)
    def addAllVehTermReg(__vs: TraversableOnce[SeaGoing.CTTIC.SEAGOING.VehTermReg]): Estuary = copy(vehTermReg = vehTermReg ++ __vs)
    def withVehTermReg(__v: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehTermReg]): Estuary = copy(vehTermReg = __v)
    def clearVehicleDriverInfo = copy(vehicleDriverInfo = _root_.scala.collection.Seq.empty)
    def addVehicleDriverInfo(__vs: SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo*): Estuary = addAllVehicleDriverInfo(__vs)
    def addAllVehicleDriverInfo(__vs: TraversableOnce[SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo]): Estuary = copy(vehicleDriverInfo = vehicleDriverInfo ++ __vs)
    def withVehicleDriverInfo(__v: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo]): Estuary = copy(vehicleDriverInfo = __v)
    def clearVehicleEwayBill = copy(vehicleEwayBill = _root_.scala.collection.Seq.empty)
    def addVehicleEwayBill(__vs: SeaGoing.CTTIC.SEAGOING.VehicleEwayBill*): Estuary = addAllVehicleEwayBill(__vs)
    def addAllVehicleEwayBill(__vs: TraversableOnce[SeaGoing.CTTIC.SEAGOING.VehicleEwayBill]): Estuary = copy(vehicleEwayBill = vehicleEwayBill ++ __vs)
    def withVehicleEwayBill(__v: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleEwayBill]): Estuary = copy(vehicleEwayBill = __v)
    def clearVehBaseInfo = copy(vehBaseInfo = _root_.scala.collection.Seq.empty)
    def addVehBaseInfo(__vs: SeaGoing.CTTIC.SEAGOING.VehBaseInfo*): Estuary = addAllVehBaseInfo(__vs)
    def addAllVehBaseInfo(__vs: TraversableOnce[SeaGoing.CTTIC.SEAGOING.VehBaseInfo]): Estuary = copy(vehBaseInfo = vehBaseInfo ++ __vs)
    def withVehBaseInfo(__v: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehBaseInfo]): Estuary = copy(vehBaseInfo = __v)
    def clearProviderInfo = copy(providerInfo = _root_.scala.collection.Seq.empty)
    def addProviderInfo(__vs: SeaGoing.CTTIC.SEAGOING.ProviderInfo*): Estuary = addAllProviderInfo(__vs)
    def addAllProviderInfo(__vs: TraversableOnce[SeaGoing.CTTIC.SEAGOING.ProviderInfo]): Estuary = copy(providerInfo = providerInfo ++ __vs)
    def withProviderInfo(__v: _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.ProviderInfo]): Estuary = copy(providerInfo = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => riverType.javaValueDescriptor
        case 4097 => vehiclePosition
        case 4098 => vehTermReg
        case 4099 => vehicleDriverInfo
        case 4100 => vehicleEwayBill
        case 4101 => vehBaseInfo
        case 4102 => providerInfo
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(riverType.scalaValueDescriptor)
        case 4097 => _root_.scalapb.descriptors.PRepeated(vehiclePosition.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4098 => _root_.scalapb.descriptors.PRepeated(vehTermReg.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4099 => _root_.scalapb.descriptors.PRepeated(vehicleDriverInfo.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4100 => _root_.scalapb.descriptors.PRepeated(vehicleEwayBill.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4101 => _root_.scalapb.descriptors.PRepeated(vehBaseInfo.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4102 => _root_.scalapb.descriptors.PRepeated(providerInfo.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = SeaGoing.CTTIC.SEAGOING.Estuary
}

object Estuary extends com.trueaccord.scalapb.GeneratedMessageCompanion[SeaGoing.CTTIC.SEAGOING.Estuary] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[SeaGoing.CTTIC.SEAGOING.Estuary] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): SeaGoing.CTTIC.SEAGOING.Estuary = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    SeaGoing.CTTIC.SEAGOING.Estuary(
      SeaGoing.CTTIC.SEAGOING.RriverType.fromValue(__fieldsMap(__fields.get(0)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehiclePosition]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehTermReg]],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo]],
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleEwayBill]],
      __fieldsMap.getOrElse(__fields.get(5), Nil).asInstanceOf[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehBaseInfo]],
      __fieldsMap.getOrElse(__fields.get(6), Nil).asInstanceOf[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.ProviderInfo]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[SeaGoing.CTTIC.SEAGOING.Estuary] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      SeaGoing.CTTIC.SEAGOING.Estuary(
        SeaGoing.CTTIC.SEAGOING.RriverType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4097).get).map(_.as[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehiclePosition]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4098).get).map(_.as[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehTermReg]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4099).get).map(_.as[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4100).get).map(_.as[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleEwayBill]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4101).get).map(_.as[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehBaseInfo]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4102).get).map(_.as[_root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.ProviderInfo]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CTTICSEAGOINGProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CTTICSEAGOINGProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4097 => __out = SeaGoing.CTTIC.SEAGOING.VehiclePosition
      case 4098 => __out = SeaGoing.CTTIC.SEAGOING.VehTermReg
      case 4099 => __out = SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo
      case 4100 => __out = SeaGoing.CTTIC.SEAGOING.VehicleEwayBill
      case 4101 => __out = SeaGoing.CTTIC.SEAGOING.VehBaseInfo
      case 4102 => __out = SeaGoing.CTTIC.SEAGOING.ProviderInfo
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => SeaGoing.CTTIC.SEAGOING.RriverType
    }
  }
  lazy val defaultInstance = SeaGoing.CTTIC.SEAGOING.Estuary(
    riverType = SeaGoing.CTTIC.SEAGOING.RriverType.vehiclePosition
  )
  implicit class EstuaryLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, SeaGoing.CTTIC.SEAGOING.Estuary]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, SeaGoing.CTTIC.SEAGOING.Estuary](_l) {
    def riverType: _root_.com.trueaccord.lenses.Lens[UpperPB, SeaGoing.CTTIC.SEAGOING.RriverType] = field(_.riverType)((c_, f_) => c_.copy(riverType = f_))
    def vehiclePosition: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehiclePosition]] = field(_.vehiclePosition)((c_, f_) => c_.copy(vehiclePosition = f_))
    def vehTermReg: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehTermReg]] = field(_.vehTermReg)((c_, f_) => c_.copy(vehTermReg = f_))
    def vehicleDriverInfo: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleDriverInfo]] = field(_.vehicleDriverInfo)((c_, f_) => c_.copy(vehicleDriverInfo = f_))
    def vehicleEwayBill: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehicleEwayBill]] = field(_.vehicleEwayBill)((c_, f_) => c_.copy(vehicleEwayBill = f_))
    def vehBaseInfo: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.VehBaseInfo]] = field(_.vehBaseInfo)((c_, f_) => c_.copy(vehBaseInfo = f_))
    def providerInfo: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[SeaGoing.CTTIC.SEAGOING.ProviderInfo]] = field(_.providerInfo)((c_, f_) => c_.copy(providerInfo = f_))
  }
  final val RIVERTYPE_FIELD_NUMBER = 1
  final val VEHICLEPOSITION_FIELD_NUMBER = 4097
  final val VEHTERMREG_FIELD_NUMBER = 4098
  final val VEHICLEDRIVERINFO_FIELD_NUMBER = 4099
  final val VEHICLEEWAYBILL_FIELD_NUMBER = 4100
  final val VEHBASEINFO_FIELD_NUMBER = 4101
  final val PROVIDERINFO_FIELD_NUMBER = 4102
}
