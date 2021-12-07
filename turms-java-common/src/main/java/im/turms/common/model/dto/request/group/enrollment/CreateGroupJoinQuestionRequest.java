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
// source: request/group/enrollment/create_group_join_question_request.proto

package im.turms.common.model.dto.request.group.enrollment;

/**
 * Protobuf type {@code im.turms.proto.CreateGroupJoinQuestionRequest}
 */
public final class CreateGroupJoinQuestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.CreateGroupJoinQuestionRequest)
    CreateGroupJoinQuestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateGroupJoinQuestionRequest.newBuilder() to construct.
  private CreateGroupJoinQuestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateGroupJoinQuestionRequest() {
    question_ = "";
    answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateGroupJoinQuestionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateGroupJoinQuestionRequest(
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
          case 8: {

            groupId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            question_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              answers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            answers_.add(s);
            break;
          }
          case 32: {

            score_ = input.readInt32();
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
        answers_ = answers_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_CreateGroupJoinQuestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_CreateGroupJoinQuestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest.class, im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest.Builder.class);
  }

  public static final int GROUP_ID_FIELD_NUMBER = 1;
  private long groupId_;
  /**
   * <code>int64 group_id = 1;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public long getGroupId() {
    return groupId_;
  }

  public static final int QUESTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object question_;
  /**
   * <code>string question = 2;</code>
   * @return The question.
   */
  @java.lang.Override
  public java.lang.String getQuestion() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      question_ = s;
      return s;
    }
  }
  /**
   * <code>string question = 2;</code>
   * @return The bytes for question.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuestionBytes() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      question_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANSWERS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList answers_;
  /**
   * <code>repeated string answers = 3;</code>
   * @return A list containing the answers.
   */
  public com.google.protobuf.ProtocolStringList
      getAnswersList() {
    return answers_;
  }
  /**
   * <code>repeated string answers = 3;</code>
   * @return The count of answers.
   */
  public int getAnswersCount() {
    return answers_.size();
  }
  /**
   * <code>repeated string answers = 3;</code>
   * @param index The index of the element to return.
   * @return The answers at the given index.
   */
  public java.lang.String getAnswers(int index) {
    return answers_.get(index);
  }
  /**
   * <code>repeated string answers = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the answers at the given index.
   */
  public com.google.protobuf.ByteString
      getAnswersBytes(int index) {
    return answers_.getByteString(index);
  }

  public static final int SCORE_FIELD_NUMBER = 4;
  private int score_;
  /**
   * <code>int32 score = 4;</code>
   * @return The score.
   */
  @java.lang.Override
  public int getScore() {
    return score_;
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
    if (groupId_ != 0L) {
      output.writeInt64(1, groupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(question_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, question_);
    }
    for (int i = 0; i < answers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, answers_.getRaw(i));
    }
    if (score_ != 0) {
      output.writeInt32(4, score_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, groupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(question_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, question_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < answers_.size(); i++) {
        dataSize += computeStringSizeNoTag(answers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAnswersList().size();
    }
    if (score_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, score_);
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
    if (!(obj instanceof im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest other = (im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest) obj;

    if (getGroupId()
        != other.getGroupId()) return false;
    if (!getQuestion()
        .equals(other.getQuestion())) return false;
    if (!getAnswersList()
        .equals(other.getAnswersList())) return false;
    if (getScore()
        != other.getScore()) return false;
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
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGroupId());
    hash = (37 * hash) + QUESTION_FIELD_NUMBER;
    hash = (53 * hash) + getQuestion().hashCode();
    if (getAnswersCount() > 0) {
      hash = (37 * hash) + ANSWERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersList().hashCode();
    }
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + getScore();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest prototype) {
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
   * Protobuf type {@code im.turms.proto.CreateGroupJoinQuestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.CreateGroupJoinQuestionRequest)
      im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_CreateGroupJoinQuestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_CreateGroupJoinQuestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest.class, im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupId_ = 0L;

      question_ = "";

      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      score_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_CreateGroupJoinQuestionRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest build() {
      im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest buildPartial() {
      im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest result = new im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest(this);
      int from_bitField0_ = bitField0_;
      result.groupId_ = groupId_;
      result.question_ = question_;
      if (((bitField0_ & 0x00000001) != 0)) {
        answers_ = answers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.answers_ = answers_;
      result.score_ = score_;
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
      if (other instanceof im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest) {
        return mergeFrom((im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest other) {
      if (other == im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest.getDefaultInstance()) return this;
      if (other.getGroupId() != 0L) {
        setGroupId(other.getGroupId());
      }
      if (!other.getQuestion().isEmpty()) {
        question_ = other.question_;
        onChanged();
      }
      if (!other.answers_.isEmpty()) {
        if (answers_.isEmpty()) {
          answers_ = other.answers_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAnswersIsMutable();
          answers_.addAll(other.answers_);
        }
        onChanged();
      }
      if (other.getScore() != 0) {
        setScore(other.getScore());
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
      im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long groupId_ ;
    /**
     * <code>int64 group_id = 1;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public long getGroupId() {
      return groupId_;
    }
    /**
     * <code>int64 group_id = 1;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(long value) {
      
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 group_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      
      groupId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object question_ = "";
    /**
     * <code>string question = 2;</code>
     * @return The question.
     */
    public java.lang.String getQuestion() {
      java.lang.Object ref = question_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        question_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string question = 2;</code>
     * @return The bytes for question.
     */
    public com.google.protobuf.ByteString
        getQuestionBytes() {
      java.lang.Object ref = question_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        question_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string question = 2;</code>
     * @param value The question to set.
     * @return This builder for chaining.
     */
    public Builder setQuestion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      question_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string question = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestion() {
      
      question_ = getDefaultInstance().getQuestion();
      onChanged();
      return this;
    }
    /**
     * <code>string question = 2;</code>
     * @param value The bytes for question to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      question_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAnswersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        answers_ = new com.google.protobuf.LazyStringArrayList(answers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @return A list containing the answers.
     */
    public com.google.protobuf.ProtocolStringList
        getAnswersList() {
      return answers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @return The count of answers.
     */
    public int getAnswersCount() {
      return answers_.size();
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param index The index of the element to return.
     * @return The answers at the given index.
     */
    public java.lang.String getAnswers(int index) {
      return answers_.get(index);
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the answers at the given index.
     */
    public com.google.protobuf.ByteString
        getAnswersBytes(int index) {
      return answers_.getByteString(index);
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param index The index to set the value at.
     * @param value The answers to set.
     * @return This builder for chaining.
     */
    public Builder setAnswers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param value The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param values The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnswers(
        java.lang.Iterable<java.lang.String> values) {
      ensureAnswersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, answers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswers() {
      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param value The bytes of the answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAnswersIsMutable();
      answers_.add(value);
      onChanged();
      return this;
    }

    private int score_ ;
    /**
     * <code>int32 score = 4;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }
    /**
     * <code>int32 score = 4;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(int value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 score = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      
      score_ = 0;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.CreateGroupJoinQuestionRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.CreateGroupJoinQuestionRequest)
  private static final im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest();
  }

  public static im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGroupJoinQuestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateGroupJoinQuestionRequest>() {
    @java.lang.Override
    public CreateGroupJoinQuestionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateGroupJoinQuestionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateGroupJoinQuestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGroupJoinQuestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.group.enrollment.CreateGroupJoinQuestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

