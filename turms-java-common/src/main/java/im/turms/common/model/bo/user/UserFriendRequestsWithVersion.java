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
// source: model/user/user_friend_requests_with_version.proto

package im.turms.common.model.bo.user;

/**
 * Protobuf type {@code im.turms.proto.UserFriendRequestsWithVersion}
 */
public final class UserFriendRequestsWithVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UserFriendRequestsWithVersion)
    UserFriendRequestsWithVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserFriendRequestsWithVersion.newBuilder() to construct.
  private UserFriendRequestsWithVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserFriendRequestsWithVersion() {
    userFriendRequests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserFriendRequestsWithVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserFriendRequestsWithVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              userFriendRequests_ = new java.util.ArrayList<im.turms.common.model.bo.user.UserFriendRequest>();
              mutable_bitField0_ |= 0x00000001;
            }
            userFriendRequests_.add(
                input.readMessage(im.turms.common.model.bo.user.UserFriendRequest.parser(), extensionRegistry));
            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            lastUpdatedDate_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        userFriendRequests_ = java.util.Collections.unmodifiableList(userFriendRequests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.bo.user.UserFriendRequestsWithVersionOuterClass.internal_static_im_turms_proto_UserFriendRequestsWithVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.bo.user.UserFriendRequestsWithVersionOuterClass.internal_static_im_turms_proto_UserFriendRequestsWithVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.bo.user.UserFriendRequestsWithVersion.class, im.turms.common.model.bo.user.UserFriendRequestsWithVersion.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FRIEND_REQUESTS_FIELD_NUMBER = 1;
  private java.util.List<im.turms.common.model.bo.user.UserFriendRequest> userFriendRequests_;
  /**
   * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
   */
  @java.lang.Override
  public java.util.List<im.turms.common.model.bo.user.UserFriendRequest> getUserFriendRequestsList() {
    return userFriendRequests_;
  }
  /**
   * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends im.turms.common.model.bo.user.UserFriendRequestOrBuilder> 
      getUserFriendRequestsOrBuilderList() {
    return userFriendRequests_;
  }
  /**
   * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
   */
  @java.lang.Override
  public int getUserFriendRequestsCount() {
    return userFriendRequests_.size();
  }
  /**
   * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
   */
  @java.lang.Override
  public im.turms.common.model.bo.user.UserFriendRequest getUserFriendRequests(int index) {
    return userFriendRequests_.get(index);
  }
  /**
   * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
   */
  @java.lang.Override
  public im.turms.common.model.bo.user.UserFriendRequestOrBuilder getUserFriendRequestsOrBuilder(
      int index) {
    return userFriendRequests_.get(index);
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private long lastUpdatedDate_;
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdatedDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  @java.lang.Override
  public long getLastUpdatedDate() {
    return lastUpdatedDate_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < userFriendRequests_.size(); i++) {
      output.writeMessage(1, userFriendRequests_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, lastUpdatedDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userFriendRequests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userFriendRequests_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, lastUpdatedDate_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.turms.common.model.bo.user.UserFriendRequestsWithVersion)) {
      return super.equals(obj);
    }
    im.turms.common.model.bo.user.UserFriendRequestsWithVersion other = (im.turms.common.model.bo.user.UserFriendRequestsWithVersion) obj;

    if (!getUserFriendRequestsList()
        .equals(other.getUserFriendRequestsList())) return false;
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (getLastUpdatedDate()
          != other.getLastUpdatedDate()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUserFriendRequestsCount() > 0) {
      hash = (37 * hash) + USER_FRIEND_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getUserFriendRequestsList().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastUpdatedDate());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.common.model.bo.user.UserFriendRequestsWithVersion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.UserFriendRequestsWithVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UserFriendRequestsWithVersion)
      im.turms.common.model.bo.user.UserFriendRequestsWithVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.bo.user.UserFriendRequestsWithVersionOuterClass.internal_static_im_turms_proto_UserFriendRequestsWithVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.bo.user.UserFriendRequestsWithVersionOuterClass.internal_static_im_turms_proto_UserFriendRequestsWithVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.bo.user.UserFriendRequestsWithVersion.class, im.turms.common.model.bo.user.UserFriendRequestsWithVersion.Builder.class);
    }

    // Construct using im.turms.common.model.bo.user.UserFriendRequestsWithVersion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getUserFriendRequestsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userFriendRequestsBuilder_ == null) {
        userFriendRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userFriendRequestsBuilder_.clear();
      }
      lastUpdatedDate_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.bo.user.UserFriendRequestsWithVersionOuterClass.internal_static_im_turms_proto_UserFriendRequestsWithVersion_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.bo.user.UserFriendRequestsWithVersion getDefaultInstanceForType() {
      return im.turms.common.model.bo.user.UserFriendRequestsWithVersion.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.bo.user.UserFriendRequestsWithVersion build() {
      im.turms.common.model.bo.user.UserFriendRequestsWithVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.bo.user.UserFriendRequestsWithVersion buildPartial() {
      im.turms.common.model.bo.user.UserFriendRequestsWithVersion result = new im.turms.common.model.bo.user.UserFriendRequestsWithVersion(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (userFriendRequestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userFriendRequests_ = java.util.Collections.unmodifiableList(userFriendRequests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userFriendRequests_ = userFriendRequests_;
      } else {
        result.userFriendRequests_ = userFriendRequestsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.common.model.bo.user.UserFriendRequestsWithVersion) {
        return mergeFrom((im.turms.common.model.bo.user.UserFriendRequestsWithVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.bo.user.UserFriendRequestsWithVersion other) {
      if (other == im.turms.common.model.bo.user.UserFriendRequestsWithVersion.getDefaultInstance()) return this;
      if (userFriendRequestsBuilder_ == null) {
        if (!other.userFriendRequests_.isEmpty()) {
          if (userFriendRequests_.isEmpty()) {
            userFriendRequests_ = other.userFriendRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserFriendRequestsIsMutable();
            userFriendRequests_.addAll(other.userFriendRequests_);
          }
          onChanged();
        }
      } else {
        if (!other.userFriendRequests_.isEmpty()) {
          if (userFriendRequestsBuilder_.isEmpty()) {
            userFriendRequestsBuilder_.dispose();
            userFriendRequestsBuilder_ = null;
            userFriendRequests_ = other.userFriendRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userFriendRequestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserFriendRequestsFieldBuilder() : null;
          } else {
            userFriendRequestsBuilder_.addAllMessages(other.userFriendRequests_);
          }
        }
      }
      if (other.hasLastUpdatedDate()) {
        setLastUpdatedDate(other.getLastUpdatedDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.common.model.bo.user.UserFriendRequestsWithVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.bo.user.UserFriendRequestsWithVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<im.turms.common.model.bo.user.UserFriendRequest> userFriendRequests_ =
      java.util.Collections.emptyList();
    private void ensureUserFriendRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userFriendRequests_ = new java.util.ArrayList<im.turms.common.model.bo.user.UserFriendRequest>(userFriendRequests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.user.UserFriendRequest, im.turms.common.model.bo.user.UserFriendRequest.Builder, im.turms.common.model.bo.user.UserFriendRequestOrBuilder> userFriendRequestsBuilder_;

    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.user.UserFriendRequest> getUserFriendRequestsList() {
      if (userFriendRequestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userFriendRequests_);
      } else {
        return userFriendRequestsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public int getUserFriendRequestsCount() {
      if (userFriendRequestsBuilder_ == null) {
        return userFriendRequests_.size();
      } else {
        return userFriendRequestsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public im.turms.common.model.bo.user.UserFriendRequest getUserFriendRequests(int index) {
      if (userFriendRequestsBuilder_ == null) {
        return userFriendRequests_.get(index);
      } else {
        return userFriendRequestsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder setUserFriendRequests(
        int index, im.turms.common.model.bo.user.UserFriendRequest value) {
      if (userFriendRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.set(index, value);
        onChanged();
      } else {
        userFriendRequestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder setUserFriendRequests(
        int index, im.turms.common.model.bo.user.UserFriendRequest.Builder builderForValue) {
      if (userFriendRequestsBuilder_ == null) {
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.set(index, builderForValue.build());
        onChanged();
      } else {
        userFriendRequestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder addUserFriendRequests(im.turms.common.model.bo.user.UserFriendRequest value) {
      if (userFriendRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.add(value);
        onChanged();
      } else {
        userFriendRequestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder addUserFriendRequests(
        int index, im.turms.common.model.bo.user.UserFriendRequest value) {
      if (userFriendRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.add(index, value);
        onChanged();
      } else {
        userFriendRequestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder addUserFriendRequests(
        im.turms.common.model.bo.user.UserFriendRequest.Builder builderForValue) {
      if (userFriendRequestsBuilder_ == null) {
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.add(builderForValue.build());
        onChanged();
      } else {
        userFriendRequestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder addUserFriendRequests(
        int index, im.turms.common.model.bo.user.UserFriendRequest.Builder builderForValue) {
      if (userFriendRequestsBuilder_ == null) {
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.add(index, builderForValue.build());
        onChanged();
      } else {
        userFriendRequestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder addAllUserFriendRequests(
        java.lang.Iterable<? extends im.turms.common.model.bo.user.UserFriendRequest> values) {
      if (userFriendRequestsBuilder_ == null) {
        ensureUserFriendRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userFriendRequests_);
        onChanged();
      } else {
        userFriendRequestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder clearUserFriendRequests() {
      if (userFriendRequestsBuilder_ == null) {
        userFriendRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userFriendRequestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public Builder removeUserFriendRequests(int index) {
      if (userFriendRequestsBuilder_ == null) {
        ensureUserFriendRequestsIsMutable();
        userFriendRequests_.remove(index);
        onChanged();
      } else {
        userFriendRequestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public im.turms.common.model.bo.user.UserFriendRequest.Builder getUserFriendRequestsBuilder(
        int index) {
      return getUserFriendRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public im.turms.common.model.bo.user.UserFriendRequestOrBuilder getUserFriendRequestsOrBuilder(
        int index) {
      if (userFriendRequestsBuilder_ == null) {
        return userFriendRequests_.get(index);  } else {
        return userFriendRequestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public java.util.List<? extends im.turms.common.model.bo.user.UserFriendRequestOrBuilder> 
         getUserFriendRequestsOrBuilderList() {
      if (userFriendRequestsBuilder_ != null) {
        return userFriendRequestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userFriendRequests_);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public im.turms.common.model.bo.user.UserFriendRequest.Builder addUserFriendRequestsBuilder() {
      return getUserFriendRequestsFieldBuilder().addBuilder(
          im.turms.common.model.bo.user.UserFriendRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public im.turms.common.model.bo.user.UserFriendRequest.Builder addUserFriendRequestsBuilder(
        int index) {
      return getUserFriendRequestsFieldBuilder().addBuilder(
          index, im.turms.common.model.bo.user.UserFriendRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserFriendRequest user_friend_requests = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.user.UserFriendRequest.Builder> 
         getUserFriendRequestsBuilderList() {
      return getUserFriendRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.user.UserFriendRequest, im.turms.common.model.bo.user.UserFriendRequest.Builder, im.turms.common.model.bo.user.UserFriendRequestOrBuilder> 
        getUserFriendRequestsFieldBuilder() {
      if (userFriendRequestsBuilder_ == null) {
        userFriendRequestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            im.turms.common.model.bo.user.UserFriendRequest, im.turms.common.model.bo.user.UserFriendRequest.Builder, im.turms.common.model.bo.user.UserFriendRequestOrBuilder>(
                userFriendRequests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userFriendRequests_ = null;
      }
      return userFriendRequestsBuilder_;
    }

    private long lastUpdatedDate_ ;
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    @java.lang.Override
    public boolean hasLastUpdatedDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    @java.lang.Override
    public long getLastUpdatedDate() {
      return lastUpdatedDate_;
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @param value The lastUpdatedDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastUpdatedDate(long value) {
      bitField0_ |= 0x00000002;
      lastUpdatedDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastUpdatedDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastUpdatedDate_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UserFriendRequestsWithVersion)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UserFriendRequestsWithVersion)
  private static final im.turms.common.model.bo.user.UserFriendRequestsWithVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.bo.user.UserFriendRequestsWithVersion();
  }

  public static im.turms.common.model.bo.user.UserFriendRequestsWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserFriendRequestsWithVersion>
      PARSER = new com.google.protobuf.AbstractParser<UserFriendRequestsWithVersion>() {
    @java.lang.Override
    public UserFriendRequestsWithVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserFriendRequestsWithVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserFriendRequestsWithVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserFriendRequestsWithVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.bo.user.UserFriendRequestsWithVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

