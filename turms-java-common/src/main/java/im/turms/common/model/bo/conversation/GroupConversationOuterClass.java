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
// source: model/conversation/group_conversation.proto

package im.turms.common.model.bo.conversation;

public final class GroupConversationOuterClass {
  private GroupConversationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_GroupConversation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_GroupConversation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_GroupConversation_MemberIdAndReadDateEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_GroupConversation_MemberIdAndReadDateEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+model/conversation/group_conversation." +
      "proto\022\016im.turms.proto\"\276\001\n\021GroupConversat" +
      "ion\022\020\n\010group_id\030\001 \001(\003\022[\n\027member_id_and_r" +
      "ead_date\030\002 \003(\0132:.im.turms.proto.GroupCon" +
      "versation.MemberIdAndReadDateEntry\032:\n\030Me" +
      "mberIdAndReadDateEntry\022\013\n\003key\030\001 \001(\003\022\r\n\005v" +
      "alue\030\002 \001(\003:\0028\001B,\n%im.turms.common.model." +
      "bo.conversationP\001\272\002\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_im_turms_proto_GroupConversation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_GroupConversation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_GroupConversation_descriptor,
        new java.lang.String[] { "GroupId", "MemberIdAndReadDate", });
    internal_static_im_turms_proto_GroupConversation_MemberIdAndReadDateEntry_descriptor =
      internal_static_im_turms_proto_GroupConversation_descriptor.getNestedTypes().get(0);
    internal_static_im_turms_proto_GroupConversation_MemberIdAndReadDateEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_GroupConversation_MemberIdAndReadDateEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
