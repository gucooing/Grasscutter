// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaStageData.proto

package emu.grasscutter.net.proto;

public final class GachaStageDataOuterClass {
    private GachaStageDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GachaStageDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GachaStageData)
            com.google.protobuf.MessageOrBuilder {

        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        int getTargetNumMapCount();
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        boolean containsTargetNumMap(int key);
        /** Use {@link #getTargetNumMapMap()} instead. */
        @java.lang.Deprecated
        java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMap();
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMapMap();
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        int getTargetNumMapOrDefault(int key, int defaultValue);
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        int getTargetNumMapOrThrow(int key);

        /**
         * <code>uint32 stage_id = 2;</code>
         *
         * @return The stageId.
         */
        int getStageId();

        /**
         * <code>bool is_open = 7;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();
    }
    /**
     *
     *
     * <pre>
     * Name: ICONCJCFCIG
     * </pre>
     *
     * Protobuf type {@code GachaStageData}
     */
    public static final class GachaStageData extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GachaStageData)
            GachaStageDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GachaStageData.newBuilder() to construct.
        private GachaStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GachaStageData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GachaStageData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GachaStageData(
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
                        case 16:
                            {
                                stageId_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                isOpen_ = input.readBool();
                                break;
                            }
                        case 98:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    targetNumMap_ =
                                            com.google.protobuf.MapField.newMapField(
                                                    TargetNumMapDefaultEntryHolder.defaultEntry);
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer> targetNumMap__ =
                                        input.readMessage(
                                                TargetNumMapDefaultEntryHolder.defaultEntry.getParserForType(),
                                                extensionRegistry);
                                targetNumMap_
                                        .getMutableMap()
                                        .put(targetNumMap__.getKey(), targetNumMap__.getValue());
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.GachaStageDataOuterClass
                    .internal_static_GachaStageData_descriptor;
        }

        @SuppressWarnings({"rawtypes"})
        @java.lang.Override
        protected com.google.protobuf.MapField internalGetMapField(int number) {
            switch (number) {
                case 12:
                    return internalGetTargetNumMap();
                default:
                    throw new RuntimeException("Invalid map field number: " + number);
            }
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GachaStageDataOuterClass
                    .internal_static_GachaStageData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData.class,
                            emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData.Builder.class);
        }

        public static final int TARGET_NUM_MAP_FIELD_NUMBER = 12;

        private static final class TargetNumMapDefaultEntryHolder {
            static final com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer> defaultEntry =
                    com.google.protobuf.MapEntry.<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                            emu.grasscutter.net.proto.GachaStageDataOuterClass
                                    .internal_static_GachaStageData_TargetNumMapEntry_descriptor,
                            com.google.protobuf.WireFormat.FieldType.UINT32,
                            0,
                            com.google.protobuf.WireFormat.FieldType.UINT32,
                            0);
        }

        private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer> targetNumMap_;

        private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
                internalGetTargetNumMap() {
            if (targetNumMap_ == null) {
                return com.google.protobuf.MapField.emptyMapField(
                        TargetNumMapDefaultEntryHolder.defaultEntry);
            }
            return targetNumMap_;
        }

        public int getTargetNumMapCount() {
            return internalGetTargetNumMap().getMap().size();
        }
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        @java.lang.Override
        public boolean containsTargetNumMap(int key) {

            return internalGetTargetNumMap().getMap().containsKey(key);
        }
        /** Use {@link #getTargetNumMapMap()} instead. */
        @java.lang.Override
        @java.lang.Deprecated
        public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMap() {
            return getTargetNumMapMap();
        }
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        @java.lang.Override
        public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMapMap() {
            return internalGetTargetNumMap().getMap();
        }
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        @java.lang.Override
        public int getTargetNumMapOrDefault(int key, int defaultValue) {

            java.util.Map<java.lang.Integer, java.lang.Integer> map = internalGetTargetNumMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
        @java.lang.Override
        public int getTargetNumMapOrThrow(int key) {

            java.util.Map<java.lang.Integer, java.lang.Integer> map = internalGetTargetNumMap().getMap();
            if (!map.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return map.get(key);
        }

        public static final int STAGE_ID_FIELD_NUMBER = 2;
        private int stageId_;
        /**
         * <code>uint32 stage_id = 2;</code>
         *
         * @return The stageId.
         */
        @java.lang.Override
        public int getStageId() {
            return stageId_;
        }

        public static final int IS_OPEN_FIELD_NUMBER = 7;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 7;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (stageId_ != 0) {
                output.writeUInt32(2, stageId_);
            }
            if (isOpen_ != false) {
                output.writeBool(7, isOpen_);
            }
            com.google.protobuf.GeneratedMessageV3.serializeIntegerMapTo(
                    output, internalGetTargetNumMap(), TargetNumMapDefaultEntryHolder.defaultEntry, 12);
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (stageId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, stageId_);
            }
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, isOpen_);
            }
            for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry :
                    internalGetTargetNumMap().getMap().entrySet()) {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer> targetNumMap__ =
                        TargetNumMapDefaultEntryHolder.defaultEntry
                                .newBuilderForType()
                                .setKey(entry.getKey())
                                .setValue(entry.getValue())
                                .build();
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(12, targetNumMap__);
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
            if (!(obj instanceof emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData other =
                    (emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData) obj;

            if (!internalGetTargetNumMap().equals(other.internalGetTargetNumMap())) return false;
            if (getStageId() != other.getStageId()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
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
            if (!internalGetTargetNumMap().getMap().isEmpty()) {
                hash = (37 * hash) + TARGET_NUM_MAP_FIELD_NUMBER;
                hash = (53 * hash) + internalGetTargetNumMap().hashCode();
            }
            hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getStageId();
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Name: ICONCJCFCIG
         * </pre>
         *
         * Protobuf type {@code GachaStageData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GachaStageData)
                emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GachaStageDataOuterClass
                        .internal_static_GachaStageData_descriptor;
            }

            @SuppressWarnings({"rawtypes"})
            protected com.google.protobuf.MapField internalGetMapField(int number) {
                switch (number) {
                    case 12:
                        return internalGetTargetNumMap();
                    default:
                        throw new RuntimeException("Invalid map field number: " + number);
                }
            }

            @SuppressWarnings({"rawtypes"})
            protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
                switch (number) {
                    case 12:
                        return internalGetMutableTargetNumMap();
                    default:
                        throw new RuntimeException("Invalid map field number: " + number);
                }
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GachaStageDataOuterClass
                        .internal_static_GachaStageData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData.class,
                                emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                internalGetMutableTargetNumMap().clear();
                stageId_ = 0;

                isOpen_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GachaStageDataOuterClass
                        .internal_static_GachaStageData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData build() {
                emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData buildPartial() {
                emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData result =
                        new emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData(this);
                int from_bitField0_ = bitField0_;
                result.targetNumMap_ = internalGetTargetNumMap();
                result.targetNumMap_.makeImmutable();
                result.stageId_ = stageId_;
                result.isOpen_ = isOpen_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData other) {
                if (other
                        == emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                                .getDefaultInstance()) return this;
                internalGetMutableTargetNumMap().mergeFrom(other.internalGetTargetNumMap());
                if (other.getStageId() != 0) {
                    setStageId(other.getStageId());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
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
                emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer> targetNumMap_;

            private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
                    internalGetTargetNumMap() {
                if (targetNumMap_ == null) {
                    return com.google.protobuf.MapField.emptyMapField(
                            TargetNumMapDefaultEntryHolder.defaultEntry);
                }
                return targetNumMap_;
            }

            private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
                    internalGetMutableTargetNumMap() {
                onChanged();
                ;
                if (targetNumMap_ == null) {
                    targetNumMap_ =
                            com.google.protobuf.MapField.newMapField(TargetNumMapDefaultEntryHolder.defaultEntry);
                }
                if (!targetNumMap_.isMutable()) {
                    targetNumMap_ = targetNumMap_.copy();
                }
                return targetNumMap_;
            }

            public int getTargetNumMapCount() {
                return internalGetTargetNumMap().getMap().size();
            }
            /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
            @java.lang.Override
            public boolean containsTargetNumMap(int key) {

                return internalGetTargetNumMap().getMap().containsKey(key);
            }
            /** Use {@link #getTargetNumMapMap()} instead. */
            @java.lang.Override
            @java.lang.Deprecated
            public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMap() {
                return getTargetNumMapMap();
            }
            /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
            @java.lang.Override
            public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMapMap() {
                return internalGetTargetNumMap().getMap();
            }
            /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
            @java.lang.Override
            public int getTargetNumMapOrDefault(int key, int defaultValue) {

                java.util.Map<java.lang.Integer, java.lang.Integer> map =
                        internalGetTargetNumMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
            @java.lang.Override
            public int getTargetNumMapOrThrow(int key) {

                java.util.Map<java.lang.Integer, java.lang.Integer> map =
                        internalGetTargetNumMap().getMap();
                if (!map.containsKey(key)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return map.get(key);
            }

            public Builder clearTargetNumMap() {
                internalGetMutableTargetNumMap().getMutableMap().clear();
                return this;
            }
            /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
            public Builder removeTargetNumMap(int key) {

                internalGetMutableTargetNumMap().getMutableMap().remove(key);
                return this;
            }
            /** Use alternate mutation accessors instead. */
            @java.lang.Deprecated
            public java.util.Map<java.lang.Integer, java.lang.Integer> getMutableTargetNumMap() {
                return internalGetMutableTargetNumMap().getMutableMap();
            }
            /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
            public Builder putTargetNumMap(int key, int value) {

                internalGetMutableTargetNumMap().getMutableMap().put(key, value);
                return this;
            }
            /** <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code> */
            public Builder putAllTargetNumMap(
                    java.util.Map<java.lang.Integer, java.lang.Integer> values) {
                internalGetMutableTargetNumMap().getMutableMap().putAll(values);
                return this;
            }

            private int stageId_;
            /**
             * <code>uint32 stage_id = 2;</code>
             *
             * @return The stageId.
             */
            @java.lang.Override
            public int getStageId() {
                return stageId_;
            }
            /**
             * <code>uint32 stage_id = 2;</code>
             *
             * @param value The stageId to set.
             * @return This builder for chaining.
             */
            public Builder setStageId(int value) {

                stageId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 stage_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStageId() {

                stageId_ = 0;
                onChanged();
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 7;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 7;</code>
             *
             * @param value The isOpen to set.
             * @return This builder for chaining.
             */
            public Builder setIsOpen(boolean value) {

                isOpen_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_open = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
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

            // @@protoc_insertion_point(builder_scope:GachaStageData)
        }

        // @@protoc_insertion_point(class_scope:GachaStageData)
        private static final emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData();
        }

        public static emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GachaStageData> PARSER =
                new com.google.protobuf.AbstractParser<GachaStageData>() {
                    @java.lang.Override
                    public GachaStageData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GachaStageData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GachaStageData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GachaStageData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GachaStageDataOuterClass.GachaStageData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GachaStageData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GachaStageData_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GachaStageData_TargetNumMapEntry_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GachaStageData_TargetNumMapEntry_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\024GachaStageData.proto\"\243\001\n\016GachaStageDat"
                    + "a\0229\n\016target_num_map\030\014 \003(\0132!.GachaStageDa"
                    + "ta.TargetNumMapEntry\022\020\n\010stage_id\030\002 \001(\r\022\017"
                    + "\n\007is_open\030\007 \001(\010\0323\n\021TargetNumMapEntry\022\013\n\003"
                    + "key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B!\n\031emu.gras"
                    + "scutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GachaStageData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GachaStageData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GachaStageData_descriptor,
                        new java.lang.String[] {
                            "TargetNumMap", "StageId", "IsOpen",
                        });
        internal_static_GachaStageData_TargetNumMapEntry_descriptor =
                internal_static_GachaStageData_descriptor.getNestedTypes().get(0);
        internal_static_GachaStageData_TargetNumMapEntry_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GachaStageData_TargetNumMapEntry_descriptor,
                        new java.lang.String[] {
                            "Key", "Value",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
