// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpActivityInfo.proto

package emu.grasscutter.net.proto;

public final class OpActivityInfoOuterClass {
  private OpActivityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpActivityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpActivityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>uint32 end_time = 1;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 activity_id = 12;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>bool is_has_change = 14;</code>
     * @return The isHasChange.
     */
    boolean getIsHasChange();

    /**
     * <code>uint32 begin_time = 6;</code>
     * @return The beginTime.
     */
    int getBeginTime();

    /**
     * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
     * @return Whether the bonusInfo field is set.
     */
    boolean hasBonusInfo();
    /**
     * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
     * @return The bonusInfo.
     */
    emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getBonusInfo();
    /**
     * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
     */
    emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder getBonusInfoOrBuilder();
  }
  /**
   * <pre>
   * Obf: FIIPHGJMGEB
   * </pre>
   *
   * Protobuf type {@code OpActivityInfo}
   */
  public static final class OpActivityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpActivityInfo)
      OpActivityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpActivityInfo.newBuilder() to construct.
    private OpActivityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpActivityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpActivityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpActivityInfo(
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

              endTime_ = input.readUInt32();
              break;
            }
            case 48: {

              beginTime_ = input.readUInt32();
              break;
            }
            case 74: {
              emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = bonusInfo_.toBuilder();
              }
              bonusInfo_ = input.readMessage(emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bonusInfo_);
                bonusInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 80: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 96: {

              activityId_ = input.readUInt32();
              break;
            }
            case 112: {

              isHasChange_ = input.readBool();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.class, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder.class);
    }

    private int bitField0_;
    public static final int SCHEDULE_ID_FIELD_NUMBER = 10;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int END_TIME_FIELD_NUMBER = 1;
    private int endTime_;
    /**
     * <code>uint32 end_time = 1;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 12;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 12;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int IS_HAS_CHANGE_FIELD_NUMBER = 14;
    private boolean isHasChange_;
    /**
     * <code>bool is_has_change = 14;</code>
     * @return The isHasChange.
     */
    @java.lang.Override
    public boolean getIsHasChange() {
      return isHasChange_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 6;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 6;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }

    public static final int BONUS_INFO_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo bonusInfo_;
    /**
     * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
     * @return Whether the bonusInfo field is set.
     */
    @java.lang.Override
    public boolean hasBonusInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
     * @return The bonusInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getBonusInfo() {
      return bonusInfo_ == null ? emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance() : bonusInfo_;
    }
    /**
     * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder getBonusInfoOrBuilder() {
      return bonusInfo_ == null ? emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance() : bonusInfo_;
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
      if (endTime_ != 0) {
        output.writeUInt32(1, endTime_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(6, beginTime_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(9, getBonusInfo());
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(10, scheduleId_);
      }
      if (activityId_ != 0) {
        output.writeUInt32(12, activityId_);
      }
      if (isHasChange_ != false) {
        output.writeBool(14, isHasChange_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, endTime_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, beginTime_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getBonusInfo());
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, scheduleId_);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, activityId_);
      }
      if (isHasChange_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isHasChange_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo other = (emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
      if (getIsHasChange()
          != other.getIsHasChange()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (hasBonusInfo() != other.hasBonusInfo()) return false;
      if (hasBonusInfo()) {
        if (!getBonusInfo()
            .equals(other.getBonusInfo())) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (37 * hash) + IS_HAS_CHANGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHasChange());
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      if (hasBonusInfo()) {
        hash = (37 * hash) + BONUS_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBonusInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo prototype) {
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
     * <pre>
     * Obf: FIIPHGJMGEB
     * </pre>
     *
     * Protobuf type {@code OpActivityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpActivityInfo)
        emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.class, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.newBuilder()
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
          getBonusInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        scheduleId_ = 0;

        endTime_ = 0;

        activityId_ = 0;

        isHasChange_ = false;

        beginTime_ = 0;

        if (bonusInfoBuilder_ == null) {
          bonusInfo_ = null;
        } else {
          bonusInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo build() {
        emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo buildPartial() {
        emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo result = new emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.scheduleId_ = scheduleId_;
        result.endTime_ = endTime_;
        result.activityId_ = activityId_;
        result.isHasChange_ = isHasChange_;
        result.beginTime_ = beginTime_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (bonusInfoBuilder_ == null) {
            result.bonusInfo_ = bonusInfo_;
          } else {
            result.bonusInfo_ = bonusInfoBuilder_.build();
          }
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
        if (other instanceof emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo) {
          return mergeFrom((emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo other) {
        if (other == emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (other.getIsHasChange() != false) {
          setIsHasChange(other.getIsHasChange());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
        }
        if (other.hasBonusInfo()) {
          mergeBonusInfo(other.getBonusInfo());
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
        emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 1;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 1;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 12;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 12;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private boolean isHasChange_ ;
      /**
       * <code>bool is_has_change = 14;</code>
       * @return The isHasChange.
       */
      @java.lang.Override
      public boolean getIsHasChange() {
        return isHasChange_;
      }
      /**
       * <code>bool is_has_change = 14;</code>
       * @param value The isHasChange to set.
       * @return This builder for chaining.
       */
      public Builder setIsHasChange(boolean value) {
        
        isHasChange_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_has_change = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHasChange() {
        
        isHasChange_ = false;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 6;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 6;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo bonusInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder> bonusInfoBuilder_;
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       * @return Whether the bonusInfo field is set.
       */
      public boolean hasBonusInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       * @return The bonusInfo.
       */
      public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getBonusInfo() {
        if (bonusInfoBuilder_ == null) {
          return bonusInfo_ == null ? emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance() : bonusInfo_;
        } else {
          return bonusInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       */
      public Builder setBonusInfo(emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo value) {
        if (bonusInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bonusInfo_ = value;
          onChanged();
        } else {
          bonusInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       */
      public Builder setBonusInfo(
          emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder builderForValue) {
        if (bonusInfoBuilder_ == null) {
          bonusInfo_ = builderForValue.build();
          onChanged();
        } else {
          bonusInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       */
      public Builder mergeBonusInfo(emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo value) {
        if (bonusInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              bonusInfo_ != null &&
              bonusInfo_ != emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance()) {
            bonusInfo_ =
              emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.newBuilder(bonusInfo_).mergeFrom(value).buildPartial();
          } else {
            bonusInfo_ = value;
          }
          onChanged();
        } else {
          bonusInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       */
      public Builder clearBonusInfo() {
        if (bonusInfoBuilder_ == null) {
          bonusInfo_ = null;
          onChanged();
        } else {
          bonusInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       */
      public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder getBonusInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBonusInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       */
      public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder getBonusInfoOrBuilder() {
        if (bonusInfoBuilder_ != null) {
          return bonusInfoBuilder_.getMessageOrBuilder();
        } else {
          return bonusInfo_ == null ?
              emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance() : bonusInfo_;
        }
      }
      /**
       * <code>optional .BonusOpActivityInfo bonus_info = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder> 
          getBonusInfoFieldBuilder() {
        if (bonusInfoBuilder_ == null) {
          bonusInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder>(
                  getBonusInfo(),
                  getParentForChildren(),
                  isClean());
          bonusInfo_ = null;
        }
        return bonusInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:OpActivityInfo)
    }

    // @@protoc_insertion_point(class_scope:OpActivityInfo)
    private static final emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo();
    }

    public static emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpActivityInfo>
        PARSER = new com.google.protobuf.AbstractParser<OpActivityInfo>() {
      @java.lang.Override
      public OpActivityInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpActivityInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OpActivityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpActivityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpActivityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpActivityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024OpActivityInfo.proto\032\031BonusOpActivityI" +
      "nfo.proto\"\265\001\n\016OpActivityInfo\022\023\n\013schedule" +
      "_id\030\n \001(\r\022\020\n\010end_time\030\001 \001(\r\022\023\n\013activity_" +
      "id\030\014 \001(\r\022\025\n\ris_has_change\030\016 \001(\010\022\022\n\nbegin" +
      "_time\030\006 \001(\r\022-\n\nbonus_info\030\t \001(\0132\024.BonusO" +
      "pActivityInfoH\000\210\001\001B\r\n\013_bonus_infoB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.getDescriptor(),
        });
    internal_static_OpActivityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpActivityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpActivityInfo_descriptor,
        new java.lang.String[] { "ScheduleId", "EndTime", "ActivityId", "IsHasChange", "BeginTime", "BonusInfo", "BonusInfo", });
    emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
