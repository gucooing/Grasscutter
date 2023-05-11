// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterAIConfigHashNotify.proto

package emu.grasscutter.net.proto;

public final class MonsterAIConfigHashNotifyOuterClass {
    private MonsterAIConfigHashNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface MonsterAIConfigHashNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:MonsterAIConfigHashNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 entity_id = 3;</code>
         *
         * @return The entityId.
         */
        int getEntityId();

        /**
         * <code>int32 hash_value = 4;</code>
         *
         * @return The hashValue.
         */
        int getHashValue();

        /**
         * <code>uint32 job_id = 8;</code>
         *
         * @return The jobId.
         */
        int getJobId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 3467
     * Name: MEGNOIJENKI
     * </pre>
     *
     * Protobuf type {@code MonsterAIConfigHashNotify}
     */
    public static final class MonsterAIConfigHashNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:MonsterAIConfigHashNotify)
            MonsterAIConfigHashNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MonsterAIConfigHashNotify.newBuilder() to construct.
        private MonsterAIConfigHashNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MonsterAIConfigHashNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new MonsterAIConfigHashNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MonsterAIConfigHashNotify(
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
                        case 24:
                            {
                                entityId_ = input.readUInt32();
                                break;
                            }
                        case 32:
                            {
                                hashValue_ = input.readInt32();
                                break;
                            }
                        case 64:
                            {
                                jobId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                    .internal_static_MonsterAIConfigHashNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                    .internal_static_MonsterAIConfigHashNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                    .MonsterAIConfigHashNotify.class,
                            emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                    .MonsterAIConfigHashNotify.Builder.class);
        }

        public static final int ENTITY_ID_FIELD_NUMBER = 3;
        private int entityId_;
        /**
         * <code>uint32 entity_id = 3;</code>
         *
         * @return The entityId.
         */
        @java.lang.Override
        public int getEntityId() {
            return entityId_;
        }

        public static final int HASH_VALUE_FIELD_NUMBER = 4;
        private int hashValue_;
        /**
         * <code>int32 hash_value = 4;</code>
         *
         * @return The hashValue.
         */
        @java.lang.Override
        public int getHashValue() {
            return hashValue_;
        }

        public static final int JOB_ID_FIELD_NUMBER = 8;
        private int jobId_;
        /**
         * <code>uint32 job_id = 8;</code>
         *
         * @return The jobId.
         */
        @java.lang.Override
        public int getJobId() {
            return jobId_;
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
            if (entityId_ != 0) {
                output.writeUInt32(3, entityId_);
            }
            if (hashValue_ != 0) {
                output.writeInt32(4, hashValue_);
            }
            if (jobId_ != 0) {
                output.writeUInt32(8, jobId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (entityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, entityId_);
            }
            if (hashValue_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, hashValue_);
            }
            if (jobId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, jobId_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                            .MonsterAIConfigHashNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                    other =
                            (emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                            .MonsterAIConfigHashNotify)
                                    obj;

            if (getEntityId() != other.getEntityId()) return false;
            if (getHashValue() != other.getHashValue()) return false;
            if (getJobId() != other.getJobId()) return false;
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
            hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getEntityId();
            hash = (37 * hash) + HASH_VALUE_FIELD_NUMBER;
            hash = (53 * hash) + getHashValue();
            hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
            hash = (53 * hash) + getJobId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                parseFrom(
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
                emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                        prototype) {
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
         * CmdId: 3467
         * Name: MEGNOIJENKI
         * </pre>
         *
         * Protobuf type {@code MonsterAIConfigHashNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:MonsterAIConfigHashNotify)
                emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .internal_static_MonsterAIConfigHashNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .internal_static_MonsterAIConfigHashNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                        .MonsterAIConfigHashNotify.class,
                                emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                        .MonsterAIConfigHashNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify.newBuilder()
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
                entityId_ = 0;

                hashValue_ = 0;

                jobId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .internal_static_MonsterAIConfigHashNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                    build() {
                emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                    buildPartial() {
                emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                        result =
                                new emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                        .MonsterAIConfigHashNotify(this);
                result.entityId_ = entityId_;
                result.hashValue_ = hashValue_;
                result.jobId_ = jobId_;
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
                if (other
                        instanceof
                        emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                .MonsterAIConfigHashNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                            .MonsterAIConfigHashNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                .MonsterAIConfigHashNotify.getDefaultInstance()) return this;
                if (other.getEntityId() != 0) {
                    setEntityId(other.getEntityId());
                }
                if (other.getHashValue() != 0) {
                    setHashValue(other.getHashValue());
                }
                if (other.getJobId() != 0) {
                    setJobId(other.getJobId());
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
                emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                                            .MonsterAIConfigHashNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int entityId_;
            /**
             * <code>uint32 entity_id = 3;</code>
             *
             * @return The entityId.
             */
            @java.lang.Override
            public int getEntityId() {
                return entityId_;
            }
            /**
             * <code>uint32 entity_id = 3;</code>
             *
             * @param value The entityId to set.
             * @return This builder for chaining.
             */
            public Builder setEntityId(int value) {

                entityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 entity_id = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntityId() {

                entityId_ = 0;
                onChanged();
                return this;
            }

            private int hashValue_;
            /**
             * <code>int32 hash_value = 4;</code>
             *
             * @return The hashValue.
             */
            @java.lang.Override
            public int getHashValue() {
                return hashValue_;
            }
            /**
             * <code>int32 hash_value = 4;</code>
             *
             * @param value The hashValue to set.
             * @return This builder for chaining.
             */
            public Builder setHashValue(int value) {

                hashValue_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 hash_value = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHashValue() {

                hashValue_ = 0;
                onChanged();
                return this;
            }

            private int jobId_;
            /**
             * <code>uint32 job_id = 8;</code>
             *
             * @return The jobId.
             */
            @java.lang.Override
            public int getJobId() {
                return jobId_;
            }
            /**
             * <code>uint32 job_id = 8;</code>
             *
             * @param value The jobId to set.
             * @return This builder for chaining.
             */
            public Builder setJobId(int value) {

                jobId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 job_id = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJobId() {

                jobId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:MonsterAIConfigHashNotify)
        }

        // @@protoc_insertion_point(class_scope:MonsterAIConfigHashNotify)
        private static final emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                            .MonsterAIConfigHashNotify();
        }

        public static emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass
                        .MonsterAIConfigHashNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MonsterAIConfigHashNotify> PARSER =
                new com.google.protobuf.AbstractParser<MonsterAIConfigHashNotify>() {
                    @java.lang.Override
                    public MonsterAIConfigHashNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new MonsterAIConfigHashNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<MonsterAIConfigHashNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MonsterAIConfigHashNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.MonsterAIConfigHashNotifyOuterClass.MonsterAIConfigHashNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_MonsterAIConfigHashNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_MonsterAIConfigHashNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\037MonsterAIConfigHashNotify.proto\"R\n\031Mon"
                    + "sterAIConfigHashNotify\022\021\n\tentity_id\030\003 \001("
                    + "\r\022\022\n\nhash_value\030\004 \001(\005\022\016\n\006job_id\030\010 \001(\rB!\n"
                    + "\031emu.grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_MonsterAIConfigHashNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MonsterAIConfigHashNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_MonsterAIConfigHashNotify_descriptor,
                        new java.lang.String[] {
                            "EntityId", "HashValue", "JobId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
