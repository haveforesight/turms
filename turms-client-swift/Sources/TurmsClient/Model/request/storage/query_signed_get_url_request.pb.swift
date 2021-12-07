// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: request/storage/query_signed_get_url_request.proto
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

public struct QuerySignedGetUrlRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var contentType: ContentType = .profile

  public var keyStr: String {
    get {return _keyStr ?? String()}
    set {_keyStr = newValue}
  }
  /// Returns true if `keyStr` has been explicitly set.
  public var hasKeyStr: Bool {return self._keyStr != nil}
  /// Clears the value of `keyStr`. Subsequent reads from it will return its default value.
  public mutating func clearKeyStr() {self._keyStr = nil}

  public var keyNum: Int64 {
    get {return _keyNum ?? 0}
    set {_keyNum = newValue}
  }
  /// Returns true if `keyNum` has been explicitly set.
  public var hasKeyNum: Bool {return self._keyNum != nil}
  /// Clears the value of `keyNum`. Subsequent reads from it will return its default value.
  public mutating func clearKeyNum() {self._keyNum = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _keyStr: String? = nil
  fileprivate var _keyNum: Int64? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "im.turms.proto"

extension QuerySignedGetUrlRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".QuerySignedGetUrlRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "content_type"),
    2: .standard(proto: "key_str"),
    3: .standard(proto: "key_num"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.contentType) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self._keyStr) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self._keyNum) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.contentType != .profile {
      try visitor.visitSingularEnumField(value: self.contentType, fieldNumber: 1)
    }
    try { if let v = self._keyStr {
      try visitor.visitSingularStringField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._keyNum {
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: QuerySignedGetUrlRequest, rhs: QuerySignedGetUrlRequest) -> Bool {
    if lhs.contentType != rhs.contentType {return false}
    if lhs._keyStr != rhs._keyStr {return false}
    if lhs._keyNum != rhs._keyNum {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
