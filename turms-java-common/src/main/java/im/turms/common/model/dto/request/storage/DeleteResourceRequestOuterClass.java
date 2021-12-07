/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/storage/delete_resource_request.proto

package im.turms.common.model.dto.request.storage;

public final class DeleteResourceRequestOuterClass {
  private DeleteResourceRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_DeleteResourceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_DeleteResourceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-request/storage/delete_resource_reques" +
      "t.proto\022\016im.turms.proto\032\033constant/conten" +
      "t_type.proto\"\216\001\n\025DeleteResourceRequest\0221" +
      "\n\014content_type\030\001 \001(\0162\033.im.turms.proto.Co" +
      "ntentType\022\024\n\007key_str\030\002 \001(\tH\000\210\001\001\022\024\n\007key_n" +
      "um\030\003 \001(\003H\001\210\001\001B\n\n\010_key_strB\n\n\010_key_numB0\n" +
      ")im.turms.common.model.dto.request.stora" +
      "geP\001\272\002\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          im.turms.common.constant.ContentTypeOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_DeleteResourceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_DeleteResourceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_DeleteResourceRequest_descriptor,
        new java.lang.String[] { "ContentType", "KeyStr", "KeyNum", "KeyStr", "KeyNum", });
    im.turms.common.constant.ContentTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
