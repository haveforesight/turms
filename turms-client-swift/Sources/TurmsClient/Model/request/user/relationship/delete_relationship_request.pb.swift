// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: request/user/relationship/delete_relationship_request.proto
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

public struct DeleteRelationshipRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int64 = 0

  public var groupIndex: Int32 {
    get {return _groupIndex ?? 0}
    set {_groupIndex = newValue}
  }
  /// Returns true if `groupIndex` has been explicitly set.
  public var hasGroupIndex: Bool {return self._groupIndex != nil}
  /// Clears the value of `groupIndex`. Subsequent reads from it will return its default value.
  public mutating func clearGroupIndex() {self._groupIndex = nil}

  public var targetGroupIndex: Int32 {
    get {return _targetGroupIndex ?? 0}
    set {_targetGroupIndex = newValue}
  }
  /// Returns true if `targetGroupIndex` has been explicitly set.
  public var hasTargetGroupIndex: Bool {return self._targetGroupIndex != nil}
  /// Clears the value of `targetGroupIndex`. Subsequent reads from it will return its default value.
  public mutating func clearTargetGroupIndex() {self._targetGroupIndex = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _groupIndex: Int32? = nil
  fileprivate var _targetGroupIndex: Int32? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "im.turms.proto"

extension DeleteRelationshipRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".DeleteRelationshipRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "user_id"),
    2: .standard(proto: "group_index"),
    3: .standard(proto: "target_group_index"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.userID) }()
      case 2: try { try decoder.decodeSingularInt32Field(value: &self._groupIndex) }()
      case 3: try { try decoder.decodeSingularInt32Field(value: &self._targetGroupIndex) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.userID != 0 {
      try visitor.visitSingularInt64Field(value: self.userID, fieldNumber: 1)
    }
    try { if let v = self._groupIndex {
      try visitor.visitSingularInt32Field(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._targetGroupIndex {
      try visitor.visitSingularInt32Field(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: DeleteRelationshipRequest, rhs: DeleteRelationshipRequest) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs._groupIndex != rhs._groupIndex {return false}
    if lhs._targetGroupIndex != rhs._targetGroupIndex {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
