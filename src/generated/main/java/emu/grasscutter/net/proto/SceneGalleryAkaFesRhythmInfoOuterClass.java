// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryAkaFesRhythmInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryAkaFesRhythmInfoOuterClass {
    private SceneGalleryAkaFesRhythmInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SceneGalleryAkaFesRhythmInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:SceneGalleryAkaFesRhythmInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string transaction = 13;</code>
         *
         * @return The transaction.
         */
        java.lang.String getTransaction();
        /**
         * <code>string transaction = 13;</code>
         *
         * @return The bytes for transaction.
         */
        com.google.protobuf.ByteString getTransactionBytes();

        /**
         * <code>bool GEFPKPGFGIG = 5;</code>
         *
         * @return The gEFPKPGFGIG.
         */
        boolean getGEFPKPGFGIG();
    }
    /**
     *
     *
     * <pre>
     * Obf: IMAAAEPOLLC
     * </pre>
     *
     * Protobuf type {@code SceneGalleryAkaFesRhythmInfo}
     */
    public static final class SceneGalleryAkaFesRhythmInfo
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:SceneGalleryAkaFesRhythmInfo)
            SceneGalleryAkaFesRhythmInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use SceneGalleryAkaFesRhythmInfo.newBuilder() to construct.
        private SceneGalleryAkaFesRhythmInfo(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SceneGalleryAkaFesRhythmInfo() {
            transaction_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new SceneGalleryAkaFesRhythmInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SceneGalleryAkaFesRhythmInfo(
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
                        case 40:
                            {
                                gEFPKPGFGIG_ = input.readBool();
                                break;
                            }
                        case 106:
                            {
                                java.lang.String s = input.readStringRequireUtf8();

                                transaction_ = s;
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
            return emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                    .internal_static_SceneGalleryAkaFesRhythmInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                    .internal_static_SceneGalleryAkaFesRhythmInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                    .SceneGalleryAkaFesRhythmInfo.class,
                            emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                    .SceneGalleryAkaFesRhythmInfo.Builder.class);
        }

        public static final int TRANSACTION_FIELD_NUMBER = 13;
        private volatile java.lang.Object transaction_;
        /**
         * <code>string transaction = 13;</code>
         *
         * @return The transaction.
         */
        @java.lang.Override
        public java.lang.String getTransaction() {
            java.lang.Object ref = transaction_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                transaction_ = s;
                return s;
            }
        }
        /**
         * <code>string transaction = 13;</code>
         *
         * @return The bytes for transaction.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString getTransactionBytes() {
            java.lang.Object ref = transaction_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                transaction_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int GEFPKPGFGIG_FIELD_NUMBER = 5;
        private boolean gEFPKPGFGIG_;
        /**
         * <code>bool GEFPKPGFGIG = 5;</code>
         *
         * @return The gEFPKPGFGIG.
         */
        @java.lang.Override
        public boolean getGEFPKPGFGIG() {
            return gEFPKPGFGIG_;
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
            if (gEFPKPGFGIG_ != false) {
                output.writeBool(5, gEFPKPGFGIG_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 13, transaction_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (gEFPKPGFGIG_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, gEFPKPGFGIG_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, transaction_);
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
                    emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                            .SceneGalleryAkaFesRhythmInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass.SceneGalleryAkaFesRhythmInfo
                    other =
                            (emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                            .SceneGalleryAkaFesRhythmInfo)
                                    obj;

            if (!getTransaction().equals(other.getTransaction())) return false;
            if (getGEFPKPGFGIG() != other.getGEFPKPGFGIG()) return false;
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
            hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
            hash = (53 * hash) + getTransaction().hashCode();
            hash = (37 * hash) + GEFPKPGFGIG_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getGEFPKPGFGIG());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
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
                emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                .SceneGalleryAkaFesRhythmInfo
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
         * Obf: IMAAAEPOLLC
         * </pre>
         *
         * Protobuf type {@code SceneGalleryAkaFesRhythmInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:SceneGalleryAkaFesRhythmInfo)
                emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .internal_static_SceneGalleryAkaFesRhythmInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .internal_static_SceneGalleryAkaFesRhythmInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                        .SceneGalleryAkaFesRhythmInfo.class,
                                emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                        .SceneGalleryAkaFesRhythmInfo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass.SceneGalleryAkaFesRhythmInfo.newBuilder()
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
                transaction_ = "";

                gEFPKPGFGIG_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .internal_static_SceneGalleryAkaFesRhythmInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                            .SceneGalleryAkaFesRhythmInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                            .SceneGalleryAkaFesRhythmInfo
                    build() {
                emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                .SceneGalleryAkaFesRhythmInfo
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                            .SceneGalleryAkaFesRhythmInfo
                    buildPartial() {
                emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                .SceneGalleryAkaFesRhythmInfo
                        result =
                                new emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                        .SceneGalleryAkaFesRhythmInfo(this);
                result.transaction_ = transaction_;
                result.gEFPKPGFGIG_ = gEFPKPGFGIG_;
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
                        emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                .SceneGalleryAkaFesRhythmInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                            .SceneGalleryAkaFesRhythmInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                    .SceneGalleryAkaFesRhythmInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                .SceneGalleryAkaFesRhythmInfo.getDefaultInstance()) return this;
                if (!other.getTransaction().isEmpty()) {
                    transaction_ = other.transaction_;
                    onChanged();
                }
                if (other.getGEFPKPGFGIG() != false) {
                    setGEFPKPGFGIG(other.getGEFPKPGFGIG());
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
                emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                .SceneGalleryAkaFesRhythmInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                                            .SceneGalleryAkaFesRhythmInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object transaction_ = "";
            /**
             * <code>string transaction = 13;</code>
             *
             * @return The transaction.
             */
            public java.lang.String getTransaction() {
                java.lang.Object ref = transaction_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    transaction_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string transaction = 13;</code>
             *
             * @return The bytes for transaction.
             */
            public com.google.protobuf.ByteString getTransactionBytes() {
                java.lang.Object ref = transaction_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                    transaction_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string transaction = 13;</code>
             *
             * @param value The transaction to set.
             * @return This builder for chaining.
             */
            public Builder setTransaction(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                transaction_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string transaction = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTransaction() {

                transaction_ = getDefaultInstance().getTransaction();
                onChanged();
                return this;
            }
            /**
             * <code>string transaction = 13;</code>
             *
             * @param value The bytes for transaction to set.
             * @return This builder for chaining.
             */
            public Builder setTransactionBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                transaction_ = value;
                onChanged();
                return this;
            }

            private boolean gEFPKPGFGIG_;
            /**
             * <code>bool GEFPKPGFGIG = 5;</code>
             *
             * @return The gEFPKPGFGIG.
             */
            @java.lang.Override
            public boolean getGEFPKPGFGIG() {
                return gEFPKPGFGIG_;
            }
            /**
             * <code>bool GEFPKPGFGIG = 5;</code>
             *
             * @param value The gEFPKPGFGIG to set.
             * @return This builder for chaining.
             */
            public Builder setGEFPKPGFGIG(boolean value) {

                gEFPKPGFGIG_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool GEFPKPGFGIG = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGEFPKPGFGIG() {

                gEFPKPGFGIG_ = false;
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

            // @@protoc_insertion_point(builder_scope:SceneGalleryAkaFesRhythmInfo)
        }

        // @@protoc_insertion_point(class_scope:SceneGalleryAkaFesRhythmInfo)
        private static final emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                            .SceneGalleryAkaFesRhythmInfo();
        }

        public static emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SceneGalleryAkaFesRhythmInfo> PARSER =
                new com.google.protobuf.AbstractParser<SceneGalleryAkaFesRhythmInfo>() {
                    @java.lang.Override
                    public SceneGalleryAkaFesRhythmInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SceneGalleryAkaFesRhythmInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<SceneGalleryAkaFesRhythmInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SceneGalleryAkaFesRhythmInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.SceneGalleryAkaFesRhythmInfoOuterClass
                        .SceneGalleryAkaFesRhythmInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_SceneGalleryAkaFesRhythmInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_SceneGalleryAkaFesRhythmInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\"SceneGalleryAkaFesRhythmInfo.proto\"H\n\034"
                    + "SceneGalleryAkaFesRhythmInfo\022\023\n\013transact"
                    + "ion\030\r \001(\t\022\023\n\013GEFPKPGFGIG\030\005 \001(\010B\033\n\031emu.gr"
                    + "asscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_SceneGalleryAkaFesRhythmInfo_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_SceneGalleryAkaFesRhythmInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_SceneGalleryAkaFesRhythmInfo_descriptor,
                        new java.lang.String[] {
                            "Transaction", "GEFPKPGFGIG",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}