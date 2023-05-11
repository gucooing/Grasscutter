// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeResourceTakeFetterExpRsp.proto

package emu.grasscutter.net.proto;

public final class HomeResourceTakeFetterExpRspOuterClass {
    private HomeResourceTakeFetterExpRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeResourceTakeFetterExpRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeResourceTakeFetterExpRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.HomeResource fetter_exp = 14;</code>
         *
         * @return Whether the fetterExp field is set.
         */
        boolean hasFetterExp();
        /**
         * <code>.HomeResource fetter_exp = 14;</code>
         *
         * @return The fetterExp.
         */
        emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getFetterExp();
        /** <code>.HomeResource fetter_exp = 14;</code> */
        emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder getFetterExpOrBuilder();

        /**
         * <code>int32 retcode = 15;</code>
         *
         * @return The retcode.
         */
        int getRetcode();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4519
     * Name: NBELLMAHLCJ
     * </pre>
     *
     * Protobuf type {@code HomeResourceTakeFetterExpRsp}
     */
    public static final class HomeResourceTakeFetterExpRsp
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeResourceTakeFetterExpRsp)
            HomeResourceTakeFetterExpRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeResourceTakeFetterExpRsp.newBuilder() to construct.
        private HomeResourceTakeFetterExpRsp(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeResourceTakeFetterExpRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeResourceTakeFetterExpRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeResourceTakeFetterExpRsp(
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
                        case 114:
                            {
                                emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder subBuilder =
                                        null;
                                if (fetterExp_ != null) {
                                    subBuilder = fetterExp_.toBuilder();
                                }
                                fetterExp_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(fetterExp_);
                                    fetterExp_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        case 120:
                            {
                                retcode_ = input.readInt32();
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
            return emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                    .internal_static_HomeResourceTakeFetterExpRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                    .internal_static_HomeResourceTakeFetterExpRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                    .HomeResourceTakeFetterExpRsp.class,
                            emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                    .HomeResourceTakeFetterExpRsp.Builder.class);
        }

        public static final int FETTER_EXP_FIELD_NUMBER = 14;
        private emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource fetterExp_;
        /**
         * <code>.HomeResource fetter_exp = 14;</code>
         *
         * @return Whether the fetterExp field is set.
         */
        @java.lang.Override
        public boolean hasFetterExp() {
            return fetterExp_ != null;
        }
        /**
         * <code>.HomeResource fetter_exp = 14;</code>
         *
         * @return The fetterExp.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getFetterExp() {
            return fetterExp_ == null
                    ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance()
                    : fetterExp_;
        }
        /** <code>.HomeResource fetter_exp = 14;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder
                getFetterExpOrBuilder() {
            return getFetterExp();
        }

        public static final int RETCODE_FIELD_NUMBER = 15;
        private int retcode_;
        /**
         * <code>int32 retcode = 15;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
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
            if (fetterExp_ != null) {
                output.writeMessage(14, getFetterExp());
            }
            if (retcode_ != 0) {
                output.writeInt32(15, retcode_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (fetterExp_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(14, getFetterExp());
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(15, retcode_);
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
                    emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                            .HomeResourceTakeFetterExpRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass.HomeResourceTakeFetterExpRsp
                    other =
                            (emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                            .HomeResourceTakeFetterExpRsp)
                                    obj;

            if (hasFetterExp() != other.hasFetterExp()) return false;
            if (hasFetterExp()) {
                if (!getFetterExp().equals(other.getFetterExp())) return false;
            }
            if (getRetcode() != other.getRetcode()) return false;
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
            if (hasFetterExp()) {
                hash = (37 * hash) + FETTER_EXP_FIELD_NUMBER;
                hash = (53 * hash) + getFetterExp().hashCode();
            }
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
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
                emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                .HomeResourceTakeFetterExpRsp
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
         * CmdId: 4519
         * Name: NBELLMAHLCJ
         * </pre>
         *
         * Protobuf type {@code HomeResourceTakeFetterExpRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeResourceTakeFetterExpRsp)
                emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .internal_static_HomeResourceTakeFetterExpRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .internal_static_HomeResourceTakeFetterExpRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                        .HomeResourceTakeFetterExpRsp.class,
                                emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                        .HomeResourceTakeFetterExpRsp.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass.HomeResourceTakeFetterExpRsp.newBuilder()
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
                if (fetterExpBuilder_ == null) {
                    fetterExp_ = null;
                } else {
                    fetterExp_ = null;
                    fetterExpBuilder_ = null;
                }
                retcode_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .internal_static_HomeResourceTakeFetterExpRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                            .HomeResourceTakeFetterExpRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                            .HomeResourceTakeFetterExpRsp
                    build() {
                emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                .HomeResourceTakeFetterExpRsp
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                            .HomeResourceTakeFetterExpRsp
                    buildPartial() {
                emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                .HomeResourceTakeFetterExpRsp
                        result =
                                new emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                        .HomeResourceTakeFetterExpRsp(this);
                if (fetterExpBuilder_ == null) {
                    result.fetterExp_ = fetterExp_;
                } else {
                    result.fetterExp_ = fetterExpBuilder_.build();
                }
                result.retcode_ = retcode_;
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
                        emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                .HomeResourceTakeFetterExpRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                            .HomeResourceTakeFetterExpRsp)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                    .HomeResourceTakeFetterExpRsp
                            other) {
                if (other
                        == emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                .HomeResourceTakeFetterExpRsp.getDefaultInstance()) return this;
                if (other.hasFetterExp()) {
                    mergeFetterExp(other.getFetterExp());
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
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
                emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                .HomeResourceTakeFetterExpRsp
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                                            .HomeResourceTakeFetterExpRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource fetterExp_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource,
                            emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder,
                            emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder>
                    fetterExpBuilder_;
            /**
             * <code>.HomeResource fetter_exp = 14;</code>
             *
             * @return Whether the fetterExp field is set.
             */
            public boolean hasFetterExp() {
                return fetterExpBuilder_ != null || fetterExp_ != null;
            }
            /**
             * <code>.HomeResource fetter_exp = 14;</code>
             *
             * @return The fetterExp.
             */
            public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource getFetterExp() {
                if (fetterExpBuilder_ == null) {
                    return fetterExp_ == null
                            ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance()
                            : fetterExp_;
                } else {
                    return fetterExpBuilder_.getMessage();
                }
            }
            /** <code>.HomeResource fetter_exp = 14;</code> */
            public Builder setFetterExp(
                    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource value) {
                if (fetterExpBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    fetterExp_ = value;
                    onChanged();
                } else {
                    fetterExpBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.HomeResource fetter_exp = 14;</code> */
            public Builder setFetterExp(
                    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder builderForValue) {
                if (fetterExpBuilder_ == null) {
                    fetterExp_ = builderForValue.build();
                    onChanged();
                } else {
                    fetterExpBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.HomeResource fetter_exp = 14;</code> */
            public Builder mergeFetterExp(
                    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource value) {
                if (fetterExpBuilder_ == null) {
                    if (fetterExp_ != null) {
                        fetterExp_ =
                                emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.newBuilder(fetterExp_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        fetterExp_ = value;
                    }
                    onChanged();
                } else {
                    fetterExpBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.HomeResource fetter_exp = 14;</code> */
            public Builder clearFetterExp() {
                if (fetterExpBuilder_ == null) {
                    fetterExp_ = null;
                    onChanged();
                } else {
                    fetterExp_ = null;
                    fetterExpBuilder_ = null;
                }

                return this;
            }
            /** <code>.HomeResource fetter_exp = 14;</code> */
            public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder
                    getFetterExpBuilder() {

                onChanged();
                return getFetterExpFieldBuilder().getBuilder();
            }
            /** <code>.HomeResource fetter_exp = 14;</code> */
            public emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder
                    getFetterExpOrBuilder() {
                if (fetterExpBuilder_ != null) {
                    return fetterExpBuilder_.getMessageOrBuilder();
                } else {
                    return fetterExp_ == null
                            ? emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.getDefaultInstance()
                            : fetterExp_;
                }
            }
            /** <code>.HomeResource fetter_exp = 14;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource,
                            emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder,
                            emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder>
                    getFetterExpFieldBuilder() {
                if (fetterExpBuilder_ == null) {
                    fetterExpBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource,
                                    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResource.Builder,
                                    emu.grasscutter.net.proto.HomeResourceOuterClass.HomeResourceOrBuilder>(
                                    getFetterExp(), getParentForChildren(), isClean());
                    fetterExp_ = null;
                }
                return fetterExpBuilder_;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 15;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 15;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
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

            // @@protoc_insertion_point(builder_scope:HomeResourceTakeFetterExpRsp)
        }

        // @@protoc_insertion_point(class_scope:HomeResourceTakeFetterExpRsp)
        private static final emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                            .HomeResourceTakeFetterExpRsp();
        }

        public static emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeResourceTakeFetterExpRsp> PARSER =
                new com.google.protobuf.AbstractParser<HomeResourceTakeFetterExpRsp>() {
                    @java.lang.Override
                    public HomeResourceTakeFetterExpRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeResourceTakeFetterExpRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeResourceTakeFetterExpRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeResourceTakeFetterExpRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeResourceTakeFetterExpRspOuterClass
                        .HomeResourceTakeFetterExpRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeResourceTakeFetterExpRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeResourceTakeFetterExpRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\"HomeResourceTakeFetterExpRsp.proto\032\022Ho"
                    + "meResource.proto\"R\n\034HomeResourceTakeFett"
                    + "erExpRsp\022!\n\nfetter_exp\030\016 \001(\0132\r.HomeResou"
                    + "rce\022\017\n\007retcode\030\017 \001(\005B!\n\031emu.grasscutter."
                    + "net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.HomeResourceOuterClass.getDescriptor(),
                        });
        internal_static_HomeResourceTakeFetterExpRsp_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_HomeResourceTakeFetterExpRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeResourceTakeFetterExpRsp_descriptor,
                        new java.lang.String[] {
                            "FetterExp", "Retcode",
                        });
        emu.grasscutter.net.proto.HomeResourceOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
