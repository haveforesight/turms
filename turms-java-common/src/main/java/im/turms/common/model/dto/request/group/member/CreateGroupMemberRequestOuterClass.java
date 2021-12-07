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
// source: request/group/member/create_group_member_request.proto

package im.turms.common.model.dto.request.group.member;

public final class CreateGroupMemberRequestOuterClass {
  private CreateGroupMemberRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_CreateGroupMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_CreateGroupMemberRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6request/group/member/create_group_memb" +
      "er_request.proto\022\016im.turms.proto\032 consta" +
      "nt/group_member_role.proto\"\266\001\n\030CreateGro" +
      "upMemberRequest\022\020\n\010group_id\030\001 \001(\003\022\017\n\007use" +
      "r_id\030\002 \001(\003\022\021\n\004name\030\003 \001(\tH\000\210\001\001\022-\n\004role\030\004 " +
      "\001(\0162\037.im.turms.proto.GroupMemberRole\022\032\n\r" +
      "mute_end_date\030\005 \001(\003H\001\210\001\001B\007\n\005_nameB\020\n\016_mu" +
      "te_end_dateB5\n.im.turms.common.model.dto" +
      ".request.group.memberP\001\272\002\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          im.turms.common.constant.GroupMemberRoleOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_CreateGroupMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_CreateGroupMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_CreateGroupMemberRequest_descriptor,
        new java.lang.String[] { "GroupId", "UserId", "Name", "Role", "MuteEndDate", "Name", "MuteEndDate", });
    im.turms.common.constant.GroupMemberRoleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
