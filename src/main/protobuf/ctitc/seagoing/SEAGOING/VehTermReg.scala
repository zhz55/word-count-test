// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package ctitc.seagoing.SEAGOING



/** 终端注册信息
  *
  * @param vehicleNo
  *   车牌号码
  * @param plateColor
  *   车牌颜色	
  * @param accessCode
  *   车辆归属省行政区域编码
  * @param platformId
  *   平台编码
  * @param producerId
  *   车载终端厂商编码
  * @param producerName
  *   车载终端厂商名称
  * @param terminalModelType
  *   车载终端型号
  * @param terminalId
  *   车载终端编号
  * @param terminalSim
  *   车载终端SIM卡电话号码
  * @param reserved
  *   备注
  */
@SerialVersionUID(0L)
final case class VehTermReg(
    vehicleNo: String,
    plateColor: scala.Option[Int] = None,
    accessCode: scala.Option[Int] = None,
    platformId: scala.Option[String] = None,
    producerId: scala.Option[String] = None,
    producerName: scala.Option[String] = None,
    terminalModelType: scala.Option[String] = None,
    terminalId: scala.Option[String] = None,
    terminalSim: scala.Option[String] = None,
    reserved: scala.Option[String] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[VehTermReg] with com.trueaccord.lenses.Updatable[VehTermReg] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, vehicleNo)
      if (plateColor.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, plateColor.get) }
      if (accessCode.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(3, accessCode.get) }
      if (platformId.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, platformId.get) }
      if (producerId.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, producerId.get) }
      if (producerName.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, producerName.get) }
      if (terminalModelType.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, terminalModelType.get) }
      if (terminalId.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, terminalId.get) }
      if (terminalSim.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(9, terminalSim.get) }
      if (reserved.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, reserved.get) }
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
      _output__.writeString(1, vehicleNo)
      plateColor.foreach { __v =>
        _output__.writeInt32(2, __v)
      };
      accessCode.foreach { __v =>
        _output__.writeUInt32(3, __v)
      };
      platformId.foreach { __v =>
        _output__.writeString(4, __v)
      };
      producerId.foreach { __v =>
        _output__.writeString(5, __v)
      };
      producerName.foreach { __v =>
        _output__.writeString(6, __v)
      };
      terminalModelType.foreach { __v =>
        _output__.writeString(7, __v)
      };
      terminalId.foreach { __v =>
        _output__.writeString(8, __v)
      };
      terminalSim.foreach { __v =>
        _output__.writeString(9, __v)
      };
      reserved.foreach { __v =>
        _output__.writeString(10, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): ctitc.seagoing.SEAGOING.VehTermReg = {
      var __vehicleNo = this.vehicleNo
      var __plateColor = this.plateColor
      var __accessCode = this.accessCode
      var __platformId = this.platformId
      var __producerId = this.producerId
      var __producerName = this.producerName
      var __terminalModelType = this.terminalModelType
      var __terminalId = this.terminalId
      var __terminalSim = this.terminalSim
      var __reserved = this.reserved
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __vehicleNo = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __plateColor = Some(_input__.readInt32())
          case 24 =>
            __accessCode = Some(_input__.readUInt32())
          case 34 =>
            __platformId = Some(_input__.readString())
          case 42 =>
            __producerId = Some(_input__.readString())
          case 50 =>
            __producerName = Some(_input__.readString())
          case 58 =>
            __terminalModelType = Some(_input__.readString())
          case 66 =>
            __terminalId = Some(_input__.readString())
          case 74 =>
            __terminalSim = Some(_input__.readString())
          case 82 =>
            __reserved = Some(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      ctitc.seagoing.SEAGOING.VehTermReg(
          vehicleNo = __vehicleNo,
          plateColor = __plateColor,
          accessCode = __accessCode,
          platformId = __platformId,
          producerId = __producerId,
          producerName = __producerName,
          terminalModelType = __terminalModelType,
          terminalId = __terminalId,
          terminalSim = __terminalSim,
          reserved = __reserved
      )
    }
    def withVehicleNo(__v: String): VehTermReg = copy(vehicleNo = __v)
    def getPlateColor: Int = plateColor.getOrElse(0)
    def clearPlateColor: VehTermReg = copy(plateColor = None)
    def withPlateColor(__v: Int): VehTermReg = copy(plateColor = Some(__v))
    def getAccessCode: Int = accessCode.getOrElse(0)
    def clearAccessCode: VehTermReg = copy(accessCode = None)
    def withAccessCode(__v: Int): VehTermReg = copy(accessCode = Some(__v))
    def getPlatformId: String = platformId.getOrElse("")
    def clearPlatformId: VehTermReg = copy(platformId = None)
    def withPlatformId(__v: String): VehTermReg = copy(platformId = Some(__v))
    def getProducerId: String = producerId.getOrElse("")
    def clearProducerId: VehTermReg = copy(producerId = None)
    def withProducerId(__v: String): VehTermReg = copy(producerId = Some(__v))
    def getProducerName: String = producerName.getOrElse("")
    def clearProducerName: VehTermReg = copy(producerName = None)
    def withProducerName(__v: String): VehTermReg = copy(producerName = Some(__v))
    def getTerminalModelType: String = terminalModelType.getOrElse("")
    def clearTerminalModelType: VehTermReg = copy(terminalModelType = None)
    def withTerminalModelType(__v: String): VehTermReg = copy(terminalModelType = Some(__v))
    def getTerminalId: String = terminalId.getOrElse("")
    def clearTerminalId: VehTermReg = copy(terminalId = None)
    def withTerminalId(__v: String): VehTermReg = copy(terminalId = Some(__v))
    def getTerminalSim: String = terminalSim.getOrElse("")
    def clearTerminalSim: VehTermReg = copy(terminalSim = None)
    def withTerminalSim(__v: String): VehTermReg = copy(terminalSim = Some(__v))
    def getReserved: String = reserved.getOrElse("")
    def clearReserved: VehTermReg = copy(reserved = None)
    def withReserved(__v: String): VehTermReg = copy(reserved = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => vehicleNo
        case 2 => plateColor.orNull
        case 3 => accessCode.orNull
        case 4 => platformId.orNull
        case 5 => producerId.orNull
        case 6 => producerName.orNull
        case 7 => terminalModelType.orNull
        case 8 => terminalId.orNull
        case 9 => terminalSim.orNull
        case 10 => reserved.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(vehicleNo)
        case 2 => plateColor.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => accessCode.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => platformId.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => producerId.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => producerName.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => terminalModelType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => terminalId.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => terminalSim.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => reserved.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = ctitc.seagoing.SEAGOING.VehTermReg
}

object VehTermReg extends com.trueaccord.scalapb.GeneratedMessageCompanion[ctitc.seagoing.SEAGOING.VehTermReg] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[ctitc.seagoing.SEAGOING.VehTermReg] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): ctitc.seagoing.SEAGOING.VehTermReg = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    ctitc.seagoing.SEAGOING.VehTermReg(
      __fieldsMap(__fields.get(0)).asInstanceOf[String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(9)).asInstanceOf[scala.Option[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[ctitc.seagoing.SEAGOING.VehTermReg] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      ctitc.seagoing.SEAGOING.VehTermReg(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[scala.Option[String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SEAGOINGProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SEAGOINGProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = ctitc.seagoing.SEAGOING.VehTermReg(
    vehicleNo = ""
  )
  implicit class VehTermRegLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, ctitc.seagoing.SEAGOING.VehTermReg]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, ctitc.seagoing.SEAGOING.VehTermReg](_l) {
    def vehicleNo: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.vehicleNo)((c_, f_) => c_.copy(vehicleNo = f_))
    def plateColor: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getPlateColor)((c_, f_) => c_.copy(plateColor = Some(f_)))
    def optionalPlateColor: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.plateColor)((c_, f_) => c_.copy(plateColor = f_))
    def accessCode: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getAccessCode)((c_, f_) => c_.copy(accessCode = Some(f_)))
    def optionalAccessCode: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.accessCode)((c_, f_) => c_.copy(accessCode = f_))
    def platformId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getPlatformId)((c_, f_) => c_.copy(platformId = Some(f_)))
    def optionalPlatformId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.platformId)((c_, f_) => c_.copy(platformId = f_))
    def producerId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getProducerId)((c_, f_) => c_.copy(producerId = Some(f_)))
    def optionalProducerId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.producerId)((c_, f_) => c_.copy(producerId = f_))
    def producerName: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getProducerName)((c_, f_) => c_.copy(producerName = Some(f_)))
    def optionalProducerName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.producerName)((c_, f_) => c_.copy(producerName = f_))
    def terminalModelType: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getTerminalModelType)((c_, f_) => c_.copy(terminalModelType = Some(f_)))
    def optionalTerminalModelType: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.terminalModelType)((c_, f_) => c_.copy(terminalModelType = f_))
    def terminalId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getTerminalId)((c_, f_) => c_.copy(terminalId = Some(f_)))
    def optionalTerminalId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.terminalId)((c_, f_) => c_.copy(terminalId = f_))
    def terminalSim: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getTerminalSim)((c_, f_) => c_.copy(terminalSim = Some(f_)))
    def optionalTerminalSim: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.terminalSim)((c_, f_) => c_.copy(terminalSim = f_))
    def reserved: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getReserved)((c_, f_) => c_.copy(reserved = Some(f_)))
    def optionalReserved: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.reserved)((c_, f_) => c_.copy(reserved = f_))
  }
  final val VEHICLENO_FIELD_NUMBER = 1
  final val PLATECOLOR_FIELD_NUMBER = 2
  final val ACCESSCODE_FIELD_NUMBER = 3
  final val PLATFORMID_FIELD_NUMBER = 4
  final val PRODUCERID_FIELD_NUMBER = 5
  final val PRODUCERNAME_FIELD_NUMBER = 6
  final val TERMINALMODELTYPE_FIELD_NUMBER = 7
  final val TERMINALID_FIELD_NUMBER = 8
  final val TERMINALSIM_FIELD_NUMBER = 9
  final val RESERVED_FIELD_NUMBER = 10
}