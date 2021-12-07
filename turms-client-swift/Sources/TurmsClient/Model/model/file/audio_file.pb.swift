// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: model/file/audio_file.proto
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

public struct AudioFile {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var description_p: AudioFile.Description {
    get {return _description_p ?? AudioFile.Description()}
    set {_description_p = newValue}
  }
  /// Returns true if `description_p` has been explicitly set.
  public var hasDescription_p: Bool {return self._description_p != nil}
  /// Clears the value of `description_p`. Subsequent reads from it will return its default value.
  public mutating func clearDescription_p() {self._description_p = nil}

  public var data: Data {
    get {return _data ?? Data()}
    set {_data = newValue}
  }
  /// Returns true if `data` has been explicitly set.
  public var hasData: Bool {return self._data != nil}
  /// Clears the value of `data`. Subsequent reads from it will return its default value.
  public mutating func clearData() {self._data = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public struct Description {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    public var url: String = String()

    public var duration: Int32 {
      get {return _duration ?? 0}
      set {_duration = newValue}
    }
    /// Returns true if `duration` has been explicitly set.
    public var hasDuration: Bool {return self._duration != nil}
    /// Clears the value of `duration`. Subsequent reads from it will return its default value.
    public mutating func clearDuration() {self._duration = nil}

    public var size: Int32 {
      get {return _size ?? 0}
      set {_size = newValue}
    }
    /// Returns true if `size` has been explicitly set.
    public var hasSize: Bool {return self._size != nil}
    /// Clears the value of `size`. Subsequent reads from it will return its default value.
    public mutating func clearSize() {self._size = nil}

    public var format: String {
      get {return _format ?? String()}
      set {_format = newValue}
    }
    /// Returns true if `format` has been explicitly set.
    public var hasFormat: Bool {return self._format != nil}
    /// Clears the value of `format`. Subsequent reads from it will return its default value.
    public mutating func clearFormat() {self._format = nil}

    public var unknownFields = SwiftProtobuf.UnknownStorage()

    public init() {}

    fileprivate var _duration: Int32? = nil
    fileprivate var _size: Int32? = nil
    fileprivate var _format: String? = nil
  }

  public init() {}

  fileprivate var _description_p: AudioFile.Description? = nil
  fileprivate var _data: Data? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "im.turms.proto"

extension AudioFile: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".AudioFile"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "description"),
    2: .same(proto: "data"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._description_p) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self._data) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try { if let v = self._description_p {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._data {
      try visitor.visitSingularBytesField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: AudioFile, rhs: AudioFile) -> Bool {
    if lhs._description_p != rhs._description_p {return false}
    if lhs._data != rhs._data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension AudioFile.Description: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = AudioFile.protoMessageName + ".Description"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "url"),
    2: .same(proto: "duration"),
    3: .same(proto: "size"),
    4: .same(proto: "format"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.url) }()
      case 2: try { try decoder.decodeSingularInt32Field(value: &self._duration) }()
      case 3: try { try decoder.decodeSingularInt32Field(value: &self._size) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self._format) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.url.isEmpty {
      try visitor.visitSingularStringField(value: self.url, fieldNumber: 1)
    }
    try { if let v = self._duration {
      try visitor.visitSingularInt32Field(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._size {
      try visitor.visitSingularInt32Field(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._format {
      try visitor.visitSingularStringField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: AudioFile.Description, rhs: AudioFile.Description) -> Bool {
    if lhs.url != rhs.url {return false}
    if lhs._duration != rhs._duration {return false}
    if lhs._size != rhs._size {return false}
    if lhs._format != rhs._format {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
