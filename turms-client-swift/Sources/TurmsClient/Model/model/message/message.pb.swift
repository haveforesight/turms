// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: model/message/message.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public struct Message {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var id: Int64 {
    get {return _id ?? 0}
    set {_id = newValue}
  }
  /// Returns true if `id` has been explicitly set.
  public var hasID: Bool {return self._id != nil}
  /// Clears the value of `id`. Subsequent reads from it will return its default value.
  public mutating func clearID() {self._id = nil}

  public var deliveryDate: Int64 {
    get {return _deliveryDate ?? 0}
    set {_deliveryDate = newValue}
  }
  /// Returns true if `deliveryDate` has been explicitly set.
  public var hasDeliveryDate: Bool {return self._deliveryDate != nil}
  /// Clears the value of `deliveryDate`. Subsequent reads from it will return its default value.
  public mutating func clearDeliveryDate() {self._deliveryDate = nil}

  public var modificationDate: Int64 {
    get {return _modificationDate ?? 0}
    set {_modificationDate = newValue}
  }
  /// Returns true if `modificationDate` has been explicitly set.
  public var hasModificationDate: Bool {return self._modificationDate != nil}
  /// Clears the value of `modificationDate`. Subsequent reads from it will return its default value.
  public mutating func clearModificationDate() {self._modificationDate = nil}

  public var text: String {
    get {return _text ?? String()}
    set {_text = newValue}
  }
  /// Returns true if `text` has been explicitly set.
  public var hasText: Bool {return self._text != nil}
  /// Clears the value of `text`. Subsequent reads from it will return its default value.
  public mutating func clearText() {self._text = nil}

  public var senderID: Int64 {
    get {return _senderID ?? 0}
    set {_senderID = newValue}
  }
  /// Returns true if `senderID` has been explicitly set.
  public var hasSenderID: Bool {return self._senderID != nil}
  /// Clears the value of `senderID`. Subsequent reads from it will return its default value.
  public mutating func clearSenderID() {self._senderID = nil}

  public var groupID: Int64 {
    get {return _groupID ?? 0}
    set {_groupID = newValue}
  }
  /// Returns true if `groupID` has been explicitly set.
  public var hasGroupID: Bool {return self._groupID != nil}
  /// Clears the value of `groupID`. Subsequent reads from it will return its default value.
  public mutating func clearGroupID() {self._groupID = nil}

  public var isSystemMessage: Bool {
    get {return _isSystemMessage ?? false}
    set {_isSystemMessage = newValue}
  }
  /// Returns true if `isSystemMessage` has been explicitly set.
  public var hasIsSystemMessage: Bool {return self._isSystemMessage != nil}
  /// Clears the value of `isSystemMessage`. Subsequent reads from it will return its default value.
  public mutating func clearIsSystemMessage() {self._isSystemMessage = nil}

  public var recipientID: Int64 {
    get {return _recipientID ?? 0}
    set {_recipientID = newValue}
  }
  /// Returns true if `recipientID` has been explicitly set.
  public var hasRecipientID: Bool {return self._recipientID != nil}
  /// Clears the value of `recipientID`. Subsequent reads from it will return its default value.
  public mutating func clearRecipientID() {self._recipientID = nil}

  public var records: [Data] = []

  public var sequenceID: Int32 {
    get {return _sequenceID ?? 0}
    set {_sequenceID = newValue}
  }
  /// Returns true if `sequenceID` has been explicitly set.
  public var hasSequenceID: Bool {return self._sequenceID != nil}
  /// Clears the value of `sequenceID`. Subsequent reads from it will return its default value.
  public mutating func clearSequenceID() {self._sequenceID = nil}

  public var preMessageID: Int32 {
    get {return _preMessageID ?? 0}
    set {_preMessageID = newValue}
  }
  /// Returns true if `preMessageID` has been explicitly set.
  public var hasPreMessageID: Bool {return self._preMessageID != nil}
  /// Clears the value of `preMessageID`. Subsequent reads from it will return its default value.
  public mutating func clearPreMessageID() {self._preMessageID = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _id: Int64? = nil
  fileprivate var _deliveryDate: Int64? = nil
  fileprivate var _modificationDate: Int64? = nil
  fileprivate var _text: String? = nil
  fileprivate var _senderID: Int64? = nil
  fileprivate var _groupID: Int64? = nil
  fileprivate var _isSystemMessage: Bool? = nil
  fileprivate var _recipientID: Int64? = nil
  fileprivate var _sequenceID: Int32? = nil
  fileprivate var _preMessageID: Int32? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "im.turms.proto"

extension Message: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Message"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "delivery_date"),
    3: .standard(proto: "modification_date"),
    4: .same(proto: "text"),
    5: .standard(proto: "sender_id"),
    6: .standard(proto: "group_id"),
    7: .standard(proto: "is_system_message"),
    8: .standard(proto: "recipient_id"),
    9: .same(proto: "records"),
    10: .standard(proto: "sequence_id"),
    11: .standard(proto: "pre_message_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self._id) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self._deliveryDate) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self._modificationDate) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self._text) }()
      case 5: try { try decoder.decodeSingularInt64Field(value: &self._senderID) }()
      case 6: try { try decoder.decodeSingularInt64Field(value: &self._groupID) }()
      case 7: try { try decoder.decodeSingularBoolField(value: &self._isSystemMessage) }()
      case 8: try { try decoder.decodeSingularInt64Field(value: &self._recipientID) }()
      case 9: try { try decoder.decodeRepeatedBytesField(value: &self.records) }()
      case 10: try { try decoder.decodeSingularInt32Field(value: &self._sequenceID) }()
      case 11: try { try decoder.decodeSingularInt32Field(value: &self._preMessageID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try { if let v = self._id {
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._deliveryDate {
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._modificationDate {
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._text {
      try visitor.visitSingularStringField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._senderID {
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._groupID {
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 6)
    } }()
    try { if let v = self._isSystemMessage {
      try visitor.visitSingularBoolField(value: v, fieldNumber: 7)
    } }()
    try { if let v = self._recipientID {
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 8)
    } }()
    if !self.records.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.records, fieldNumber: 9)
    }
    try { if let v = self._sequenceID {
      try visitor.visitSingularInt32Field(value: v, fieldNumber: 10)
    } }()
    try { if let v = self._preMessageID {
      try visitor.visitSingularInt32Field(value: v, fieldNumber: 11)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Message, rhs: Message) -> Bool {
    if lhs._id != rhs._id {return false}
    if lhs._deliveryDate != rhs._deliveryDate {return false}
    if lhs._modificationDate != rhs._modificationDate {return false}
    if lhs._text != rhs._text {return false}
    if lhs._senderID != rhs._senderID {return false}
    if lhs._groupID != rhs._groupID {return false}
    if lhs._isSystemMessage != rhs._isSystemMessage {return false}
    if lhs._recipientID != rhs._recipientID {return false}
    if lhs.records != rhs.records {return false}
    if lhs._sequenceID != rhs._sequenceID {return false}
    if lhs._preMessageID != rhs._preMessageID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
