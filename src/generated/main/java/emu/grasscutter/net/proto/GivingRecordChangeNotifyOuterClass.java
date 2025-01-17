// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GivingRecordChangeNotify.proto

package emu.grasscutter.net.proto;

public final class GivingRecordChangeNotifyOuterClass {
  private GivingRecordChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GivingRecordChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GivingRecordChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_deactive = 6;</code>
     * @return The isDeactive.
     */
    boolean getIsDeactive();

    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return Whether the givingRecord field is set.
     */
    boolean hasGivingRecord();
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return The givingRecord.
     */
    emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord getGivingRecord();
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     */
    emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 117
   * Obf: MGDPGOLLHFB
   * </pre>
   *
   * Protobuf type {@code GivingRecordChangeNotify}
   */
  public static final class GivingRecordChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GivingRecordChangeNotify)
      GivingRecordChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GivingRecordChangeNotify.newBuilder() to construct.
    private GivingRecordChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GivingRecordChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GivingRecordChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GivingRecordChangeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 48: {

              isDeactive_ = input.readBool();
              break;
            }
            case 74: {
              emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder subBuilder = null;
              if (givingRecord_ != null) {
                subBuilder = givingRecord_.toBuilder();
              }
              givingRecord_ = input.readMessage(emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(givingRecord_);
                givingRecord_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.class, emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.Builder.class);
    }

    public static final int IS_DEACTIVE_FIELD_NUMBER = 6;
    private boolean isDeactive_;
    /**
     * <code>bool is_deactive = 6;</code>
     * @return The isDeactive.
     */
    @java.lang.Override
    public boolean getIsDeactive() {
      return isDeactive_;
    }

    public static final int GIVING_RECORD_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord givingRecord_;
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return Whether the givingRecord field is set.
     */
    @java.lang.Override
    public boolean hasGivingRecord() {
      return givingRecord_ != null;
    }
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     * @return The givingRecord.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord getGivingRecord() {
      return givingRecord_ == null ? emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
    }
    /**
     * <code>.GivingRecord giving_record = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder() {
      return getGivingRecord();
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
      if (isDeactive_ != false) {
        output.writeBool(6, isDeactive_);
      }
      if (givingRecord_ != null) {
        output.writeMessage(9, getGivingRecord());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDeactive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isDeactive_);
      }
      if (givingRecord_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getGivingRecord());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify other = (emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify) obj;

      if (getIsDeactive()
          != other.getIsDeactive()) return false;
      if (hasGivingRecord() != other.hasGivingRecord()) return false;
      if (hasGivingRecord()) {
        if (!getGivingRecord()
            .equals(other.getGivingRecord())) return false;
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
      hash = (37 * hash) + IS_DEACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDeactive());
      if (hasGivingRecord()) {
        hash = (37 * hash) + GIVING_RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getGivingRecord().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify prototype) {
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
     * CmdId: 117
     * Obf: MGDPGOLLHFB
     * </pre>
     *
     * Protobuf type {@code GivingRecordChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GivingRecordChangeNotify)
        emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.class, emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.newBuilder()
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
        isDeactive_ = false;

        if (givingRecordBuilder_ == null) {
          givingRecord_ = null;
        } else {
          givingRecord_ = null;
          givingRecordBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify build() {
        emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify buildPartial() {
        emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify result = new emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify(this);
        result.isDeactive_ = isDeactive_;
        if (givingRecordBuilder_ == null) {
          result.givingRecord_ = givingRecord_;
        } else {
          result.givingRecord_ = givingRecordBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify other) {
        if (other == emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.getDefaultInstance()) return this;
        if (other.getIsDeactive() != false) {
          setIsDeactive(other.getIsDeactive());
        }
        if (other.hasGivingRecord()) {
          mergeGivingRecord(other.getGivingRecord());
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
        emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isDeactive_ ;
      /**
       * <code>bool is_deactive = 6;</code>
       * @return The isDeactive.
       */
      @java.lang.Override
      public boolean getIsDeactive() {
        return isDeactive_;
      }
      /**
       * <code>bool is_deactive = 6;</code>
       * @param value The isDeactive to set.
       * @return This builder for chaining.
       */
      public Builder setIsDeactive(boolean value) {
        
        isDeactive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_deactive = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDeactive() {
        
        isDeactive_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord givingRecord_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder> givingRecordBuilder_;
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       * @return Whether the givingRecord field is set.
       */
      public boolean hasGivingRecord() {
        return givingRecordBuilder_ != null || givingRecord_ != null;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       * @return The givingRecord.
       */
      public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord getGivingRecord() {
        if (givingRecordBuilder_ == null) {
          return givingRecord_ == null ? emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
        } else {
          return givingRecordBuilder_.getMessage();
        }
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder setGivingRecord(emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord value) {
        if (givingRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          givingRecord_ = value;
          onChanged();
        } else {
          givingRecordBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder setGivingRecord(
          emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder builderForValue) {
        if (givingRecordBuilder_ == null) {
          givingRecord_ = builderForValue.build();
          onChanged();
        } else {
          givingRecordBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder mergeGivingRecord(emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord value) {
        if (givingRecordBuilder_ == null) {
          if (givingRecord_ != null) {
            givingRecord_ =
              emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.newBuilder(givingRecord_).mergeFrom(value).buildPartial();
          } else {
            givingRecord_ = value;
          }
          onChanged();
        } else {
          givingRecordBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public Builder clearGivingRecord() {
        if (givingRecordBuilder_ == null) {
          givingRecord_ = null;
          onChanged();
        } else {
          givingRecord_ = null;
          givingRecordBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder getGivingRecordBuilder() {
        
        onChanged();
        return getGivingRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      public emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder() {
        if (givingRecordBuilder_ != null) {
          return givingRecordBuilder_.getMessageOrBuilder();
        } else {
          return givingRecord_ == null ?
              emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
        }
      }
      /**
       * <code>.GivingRecord giving_record = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder> 
          getGivingRecordFieldBuilder() {
        if (givingRecordBuilder_ == null) {
          givingRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.proto.GivingRecordOuterClass.GivingRecordOrBuilder>(
                  getGivingRecord(),
                  getParentForChildren(),
                  isClean());
          givingRecord_ = null;
        }
        return givingRecordBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GivingRecordChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:GivingRecordChangeNotify)
    private static final emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify();
    }

    public static emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GivingRecordChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<GivingRecordChangeNotify>() {
      @java.lang.Override
      public GivingRecordChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GivingRecordChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GivingRecordChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GivingRecordChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GivingRecordChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GivingRecordChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GivingRecordChangeNotify.proto\032\022Giving" +
      "Record.proto\"U\n\030GivingRecordChangeNotify" +
      "\022\023\n\013is_deactive\030\006 \001(\010\022$\n\rgiving_record\030\t" +
      " \001(\0132\r.GivingRecordB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GivingRecordOuterClass.getDescriptor(),
        });
    internal_static_GivingRecordChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GivingRecordChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GivingRecordChangeNotify_descriptor,
        new java.lang.String[] { "IsDeactive", "GivingRecord", });
    emu.grasscutter.net.proto.GivingRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
