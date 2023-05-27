// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BonusActivityInfo.proto

package emu.grasscutter.net.proto;

public final class BonusActivityInfoOuterClass {
  private BonusActivityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BonusActivityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BonusActivityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 bonus_activity_id = 12;</code>
     * @return The bonusActivityId.
     */
    int getBonusActivityId();

    /**
     * <code>uint32 state = 1;</code>
     * @return The state.
     */
    int getState();
  }
  /**
   * <pre>
   * Obf: JOMIHJEJLBP
   * </pre>
   *
   * Protobuf type {@code BonusActivityInfo}
   */
  public static final class BonusActivityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BonusActivityInfo)
      BonusActivityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BonusActivityInfo.newBuilder() to construct.
    private BonusActivityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BonusActivityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BonusActivityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BonusActivityInfo(
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
            case 8: {

              state_ = input.readUInt32();
              break;
            }
            case 96: {

              bonusActivityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BonusActivityInfoOuterClass.internal_static_BonusActivityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BonusActivityInfoOuterClass.internal_static_BonusActivityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.class, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder.class);
    }

    public static final int BONUS_ACTIVITY_ID_FIELD_NUMBER = 12;
    private int bonusActivityId_;
    /**
     * <code>uint32 bonus_activity_id = 12;</code>
     * @return The bonusActivityId.
     */
    @java.lang.Override
    public int getBonusActivityId() {
      return bonusActivityId_;
    }

    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;
    /**
     * <code>uint32 state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public int getState() {
      return state_;
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
      if (state_ != 0) {
        output.writeUInt32(1, state_);
      }
      if (bonusActivityId_ != 0) {
        output.writeUInt32(12, bonusActivityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, state_);
      }
      if (bonusActivityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, bonusActivityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo other = (emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo) obj;

      if (getBonusActivityId()
          != other.getBonusActivityId()) return false;
      if (getState()
          != other.getState()) return false;
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
      hash = (37 * hash) + BONUS_ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBonusActivityId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo prototype) {
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
     * Obf: JOMIHJEJLBP
     * </pre>
     *
     * Protobuf type {@code BonusActivityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BonusActivityInfo)
        emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BonusActivityInfoOuterClass.internal_static_BonusActivityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BonusActivityInfoOuterClass.internal_static_BonusActivityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.class, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.newBuilder()
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
        bonusActivityId_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BonusActivityInfoOuterClass.internal_static_BonusActivityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo build() {
        emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo buildPartial() {
        emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo result = new emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo(this);
        result.bonusActivityId_ = bonusActivityId_;
        result.state_ = state_;
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
        if (other instanceof emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo other) {
        if (other == emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.getDefaultInstance()) return this;
        if (other.getBonusActivityId() != 0) {
          setBonusActivityId(other.getBonusActivityId());
        }
        if (other.getState() != 0) {
          setState(other.getState());
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
        emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bonusActivityId_ ;
      /**
       * <code>uint32 bonus_activity_id = 12;</code>
       * @return The bonusActivityId.
       */
      @java.lang.Override
      public int getBonusActivityId() {
        return bonusActivityId_;
      }
      /**
       * <code>uint32 bonus_activity_id = 12;</code>
       * @param value The bonusActivityId to set.
       * @return This builder for chaining.
       */
      public Builder setBonusActivityId(int value) {
        
        bonusActivityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bonus_activity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBonusActivityId() {
        
        bonusActivityId_ = 0;
        onChanged();
        return this;
      }

      private int state_ ;
      /**
       * <code>uint32 state = 1;</code>
       * @return The state.
       */
      @java.lang.Override
      public int getState() {
        return state_;
      }
      /**
       * <code>uint32 state = 1;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 state = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BonusActivityInfo)
    }

    // @@protoc_insertion_point(class_scope:BonusActivityInfo)
    private static final emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo();
    }

    public static emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BonusActivityInfo>
        PARSER = new com.google.protobuf.AbstractParser<BonusActivityInfo>() {
      @java.lang.Override
      public BonusActivityInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BonusActivityInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BonusActivityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BonusActivityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BonusActivityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BonusActivityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BonusActivityInfo.proto\"=\n\021BonusActivi" +
      "tyInfo\022\031\n\021bonus_activity_id\030\014 \001(\r\022\r\n\005sta" +
      "te\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BonusActivityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BonusActivityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BonusActivityInfo_descriptor,
        new java.lang.String[] { "BonusActivityId", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
