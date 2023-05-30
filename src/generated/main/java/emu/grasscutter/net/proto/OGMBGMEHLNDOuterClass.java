// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OGMBGMEHLND.proto

package emu.grasscutter.net.proto;

public final class OGMBGMEHLNDOuterClass {
    private OGMBGMEHLNDOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface OGMBGMEHLNDOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:OGMBGMEHLND)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 EBABFOLPMLI = 10;</code>
         *
         * @return The eBABFOLPMLI.
         */
        int getEBABFOLPMLI();

        /**
         * <code>uint32 score = 6;</code>
         *
         * @return The score.
         */
        int getScore();

        /**
         * <code>uint32 gallery_id = 12;</code>
         *
         * @return The galleryId.
         */
        int getGalleryId();

        /**
         * <code>bool is_success = 11;</code>
         *
         * @return The isSuccess.
         */
        boolean getIsSuccess();

        /**
         * <code>bool MPNFIDECNDH = 15;</code>
         *
         * @return The mPNFIDECNDH.
         */
        boolean getMPNFIDECNDH();

        /**
         * <code>uint32 JOICMBMCIIL = 1;</code>
         *
         * @return The jOICMBMCIIL.
         */
        int getJOICMBMCIIL();

        /**
         * <code>uint32 ADIDPCMIFLA = 3;</code>
         *
         * @return The aDIDPCMIFLA.
         */
        int getADIDPCMIFLA();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 5593
     * </pre>
     *
     * Protobuf type {@code OGMBGMEHLND}
     */
    public static final class OGMBGMEHLND extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:OGMBGMEHLND)
            OGMBGMEHLNDOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use OGMBGMEHLND.newBuilder() to construct.
        private OGMBGMEHLND(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private OGMBGMEHLND() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new OGMBGMEHLND();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OGMBGMEHLND(
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
                        case 8:
                            {
                                jOICMBMCIIL_ = input.readUInt32();
                                break;
                            }
                        case 24:
                            {
                                aDIDPCMIFLA_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                score_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                eBABFOLPMLI_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                isSuccess_ = input.readBool();
                                break;
                            }
                        case 96:
                            {
                                galleryId_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                mPNFIDECNDH_ = input.readBool();
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
            return emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.internal_static_OGMBGMEHLND_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass
                    .internal_static_OGMBGMEHLND_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND.class,
                            emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND.Builder.class);
        }

        public static final int EBABFOLPMLI_FIELD_NUMBER = 10;
        private int eBABFOLPMLI_;
        /**
         * <code>uint32 EBABFOLPMLI = 10;</code>
         *
         * @return The eBABFOLPMLI.
         */
        @java.lang.Override
        public int getEBABFOLPMLI() {
            return eBABFOLPMLI_;
        }

        public static final int SCORE_FIELD_NUMBER = 6;
        private int score_;
        /**
         * <code>uint32 score = 6;</code>
         *
         * @return The score.
         */
        @java.lang.Override
        public int getScore() {
            return score_;
        }

        public static final int GALLERY_ID_FIELD_NUMBER = 12;
        private int galleryId_;
        /**
         * <code>uint32 gallery_id = 12;</code>
         *
         * @return The galleryId.
         */
        @java.lang.Override
        public int getGalleryId() {
            return galleryId_;
        }

        public static final int IS_SUCCESS_FIELD_NUMBER = 11;
        private boolean isSuccess_;
        /**
         * <code>bool is_success = 11;</code>
         *
         * @return The isSuccess.
         */
        @java.lang.Override
        public boolean getIsSuccess() {
            return isSuccess_;
        }

        public static final int MPNFIDECNDH_FIELD_NUMBER = 15;
        private boolean mPNFIDECNDH_;
        /**
         * <code>bool MPNFIDECNDH = 15;</code>
         *
         * @return The mPNFIDECNDH.
         */
        @java.lang.Override
        public boolean getMPNFIDECNDH() {
            return mPNFIDECNDH_;
        }

        public static final int JOICMBMCIIL_FIELD_NUMBER = 1;
        private int jOICMBMCIIL_;
        /**
         * <code>uint32 JOICMBMCIIL = 1;</code>
         *
         * @return The jOICMBMCIIL.
         */
        @java.lang.Override
        public int getJOICMBMCIIL() {
            return jOICMBMCIIL_;
        }

        public static final int ADIDPCMIFLA_FIELD_NUMBER = 3;
        private int aDIDPCMIFLA_;
        /**
         * <code>uint32 ADIDPCMIFLA = 3;</code>
         *
         * @return The aDIDPCMIFLA.
         */
        @java.lang.Override
        public int getADIDPCMIFLA() {
            return aDIDPCMIFLA_;
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
            if (jOICMBMCIIL_ != 0) {
                output.writeUInt32(1, jOICMBMCIIL_);
            }
            if (aDIDPCMIFLA_ != 0) {
                output.writeUInt32(3, aDIDPCMIFLA_);
            }
            if (score_ != 0) {
                output.writeUInt32(6, score_);
            }
            if (eBABFOLPMLI_ != 0) {
                output.writeUInt32(10, eBABFOLPMLI_);
            }
            if (isSuccess_ != false) {
                output.writeBool(11, isSuccess_);
            }
            if (galleryId_ != 0) {
                output.writeUInt32(12, galleryId_);
            }
            if (mPNFIDECNDH_ != false) {
                output.writeBool(15, mPNFIDECNDH_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (jOICMBMCIIL_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, jOICMBMCIIL_);
            }
            if (aDIDPCMIFLA_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, aDIDPCMIFLA_);
            }
            if (score_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, score_);
            }
            if (eBABFOLPMLI_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, eBABFOLPMLI_);
            }
            if (isSuccess_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, isSuccess_);
            }
            if (galleryId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(12, galleryId_);
            }
            if (mPNFIDECNDH_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(15, mPNFIDECNDH_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND other =
                    (emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND) obj;

            if (getEBABFOLPMLI() != other.getEBABFOLPMLI()) return false;
            if (getScore() != other.getScore()) return false;
            if (getGalleryId() != other.getGalleryId()) return false;
            if (getIsSuccess() != other.getIsSuccess()) return false;
            if (getMPNFIDECNDH() != other.getMPNFIDECNDH()) return false;
            if (getJOICMBMCIIL() != other.getJOICMBMCIIL()) return false;
            if (getADIDPCMIFLA() != other.getADIDPCMIFLA()) return false;
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
            hash = (37 * hash) + EBABFOLPMLI_FIELD_NUMBER;
            hash = (53 * hash) + getEBABFOLPMLI();
            hash = (37 * hash) + SCORE_FIELD_NUMBER;
            hash = (53 * hash) + getScore();
            hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getGalleryId();
            hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsSuccess());
            hash = (37 * hash) + MPNFIDECNDH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getMPNFIDECNDH());
            hash = (37 * hash) + JOICMBMCIIL_FIELD_NUMBER;
            hash = (53 * hash) + getJOICMBMCIIL();
            hash = (37 * hash) + ADIDPCMIFLA_FIELD_NUMBER;
            hash = (53 * hash) + getADIDPCMIFLA();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parseFrom(
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
                emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND prototype) {
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
         * CmdId: 5593
         * </pre>
         *
         * Protobuf type {@code OGMBGMEHLND}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:OGMBGMEHLND)
                emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLNDOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass
                        .internal_static_OGMBGMEHLND_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass
                        .internal_static_OGMBGMEHLND_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND.class,
                                emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND.newBuilder()
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
                eBABFOLPMLI_ = 0;

                score_ = 0;

                galleryId_ = 0;

                isSuccess_ = false;

                mPNFIDECNDH_ = false;

                jOICMBMCIIL_ = 0;

                aDIDPCMIFLA_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass
                        .internal_static_OGMBGMEHLND_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND build() {
                emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND buildPartial() {
                emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND result =
                        new emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND(this);
                result.eBABFOLPMLI_ = eBABFOLPMLI_;
                result.score_ = score_;
                result.galleryId_ = galleryId_;
                result.isSuccess_ = isSuccess_;
                result.mPNFIDECNDH_ = mPNFIDECNDH_;
                result.jOICMBMCIIL_ = jOICMBMCIIL_;
                result.aDIDPCMIFLA_ = aDIDPCMIFLA_;
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
                if (other instanceof emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND) {
                    return mergeFrom((emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND other) {
                if (other
                        == emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND.getDefaultInstance())
                    return this;
                if (other.getEBABFOLPMLI() != 0) {
                    setEBABFOLPMLI(other.getEBABFOLPMLI());
                }
                if (other.getScore() != 0) {
                    setScore(other.getScore());
                }
                if (other.getGalleryId() != 0) {
                    setGalleryId(other.getGalleryId());
                }
                if (other.getIsSuccess() != false) {
                    setIsSuccess(other.getIsSuccess());
                }
                if (other.getMPNFIDECNDH() != false) {
                    setMPNFIDECNDH(other.getMPNFIDECNDH());
                }
                if (other.getJOICMBMCIIL() != 0) {
                    setJOICMBMCIIL(other.getJOICMBMCIIL());
                }
                if (other.getADIDPCMIFLA() != 0) {
                    setADIDPCMIFLA(other.getADIDPCMIFLA());
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
                emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int eBABFOLPMLI_;
            /**
             * <code>uint32 EBABFOLPMLI = 10;</code>
             *
             * @return The eBABFOLPMLI.
             */
            @java.lang.Override
            public int getEBABFOLPMLI() {
                return eBABFOLPMLI_;
            }
            /**
             * <code>uint32 EBABFOLPMLI = 10;</code>
             *
             * @param value The eBABFOLPMLI to set.
             * @return This builder for chaining.
             */
            public Builder setEBABFOLPMLI(int value) {

                eBABFOLPMLI_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 EBABFOLPMLI = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEBABFOLPMLI() {

                eBABFOLPMLI_ = 0;
                onChanged();
                return this;
            }

            private int score_;
            /**
             * <code>uint32 score = 6;</code>
             *
             * @return The score.
             */
            @java.lang.Override
            public int getScore() {
                return score_;
            }
            /**
             * <code>uint32 score = 6;</code>
             *
             * @param value The score to set.
             * @return This builder for chaining.
             */
            public Builder setScore(int value) {

                score_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 score = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearScore() {

                score_ = 0;
                onChanged();
                return this;
            }

            private int galleryId_;
            /**
             * <code>uint32 gallery_id = 12;</code>
             *
             * @return The galleryId.
             */
            @java.lang.Override
            public int getGalleryId() {
                return galleryId_;
            }
            /**
             * <code>uint32 gallery_id = 12;</code>
             *
             * @param value The galleryId to set.
             * @return This builder for chaining.
             */
            public Builder setGalleryId(int value) {

                galleryId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 gallery_id = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGalleryId() {

                galleryId_ = 0;
                onChanged();
                return this;
            }

            private boolean isSuccess_;
            /**
             * <code>bool is_success = 11;</code>
             *
             * @return The isSuccess.
             */
            @java.lang.Override
            public boolean getIsSuccess() {
                return isSuccess_;
            }
            /**
             * <code>bool is_success = 11;</code>
             *
             * @param value The isSuccess to set.
             * @return This builder for chaining.
             */
            public Builder setIsSuccess(boolean value) {

                isSuccess_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_success = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsSuccess() {

                isSuccess_ = false;
                onChanged();
                return this;
            }

            private boolean mPNFIDECNDH_;
            /**
             * <code>bool MPNFIDECNDH = 15;</code>
             *
             * @return The mPNFIDECNDH.
             */
            @java.lang.Override
            public boolean getMPNFIDECNDH() {
                return mPNFIDECNDH_;
            }
            /**
             * <code>bool MPNFIDECNDH = 15;</code>
             *
             * @param value The mPNFIDECNDH to set.
             * @return This builder for chaining.
             */
            public Builder setMPNFIDECNDH(boolean value) {

                mPNFIDECNDH_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool MPNFIDECNDH = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMPNFIDECNDH() {

                mPNFIDECNDH_ = false;
                onChanged();
                return this;
            }

            private int jOICMBMCIIL_;
            /**
             * <code>uint32 JOICMBMCIIL = 1;</code>
             *
             * @return The jOICMBMCIIL.
             */
            @java.lang.Override
            public int getJOICMBMCIIL() {
                return jOICMBMCIIL_;
            }
            /**
             * <code>uint32 JOICMBMCIIL = 1;</code>
             *
             * @param value The jOICMBMCIIL to set.
             * @return This builder for chaining.
             */
            public Builder setJOICMBMCIIL(int value) {

                jOICMBMCIIL_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 JOICMBMCIIL = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJOICMBMCIIL() {

                jOICMBMCIIL_ = 0;
                onChanged();
                return this;
            }

            private int aDIDPCMIFLA_;
            /**
             * <code>uint32 ADIDPCMIFLA = 3;</code>
             *
             * @return The aDIDPCMIFLA.
             */
            @java.lang.Override
            public int getADIDPCMIFLA() {
                return aDIDPCMIFLA_;
            }
            /**
             * <code>uint32 ADIDPCMIFLA = 3;</code>
             *
             * @param value The aDIDPCMIFLA to set.
             * @return This builder for chaining.
             */
            public Builder setADIDPCMIFLA(int value) {

                aDIDPCMIFLA_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 ADIDPCMIFLA = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearADIDPCMIFLA() {

                aDIDPCMIFLA_ = 0;
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

            // @@protoc_insertion_point(builder_scope:OGMBGMEHLND)
        }

        // @@protoc_insertion_point(class_scope:OGMBGMEHLND)
        private static final emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND();
        }

        public static emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<OGMBGMEHLND> PARSER =
                new com.google.protobuf.AbstractParser<OGMBGMEHLND>() {
                    @java.lang.Override
                    public OGMBGMEHLND parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new OGMBGMEHLND(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<OGMBGMEHLND> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<OGMBGMEHLND> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.OGMBGMEHLNDOuterClass.OGMBGMEHLND getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_OGMBGMEHLND_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_OGMBGMEHLND_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021OGMBGMEHLND.proto\"\230\001\n\013OGMBGMEHLND\022\023\n\013E"
                    + "BABFOLPMLI\030\n \001(\r\022\r\n\005score\030\006 \001(\r\022\022\n\ngalle"
                    + "ry_id\030\014 \001(\r\022\022\n\nis_success\030\013 \001(\010\022\023\n\013MPNFI"
                    + "DECNDH\030\017 \001(\010\022\023\n\013JOICMBMCIIL\030\001 \001(\r\022\023\n\013ADI"
                    + "DPCMIFLA\030\003 \001(\rB\033\n\031emu.grasscutter.net.pr"
                    + "otob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_OGMBGMEHLND_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_OGMBGMEHLND_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_OGMBGMEHLND_descriptor,
                        new java.lang.String[] {
                            "EBABFOLPMLI",
                            "Score",
                            "GalleryId",
                            "IsSuccess",
                            "MPNFIDECNDH",
                            "JOICMBMCIIL",
                            "ADIDPCMIFLA",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}