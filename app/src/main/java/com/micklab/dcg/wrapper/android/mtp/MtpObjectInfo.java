// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpObjectInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MtpObjectInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo wrap(android.mtp.MtpObjectInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo(real, (__DcgwBridgeToken) null);
    }

    public android.mtp.MtpObjectInfo getReal() {
        return (android.mtp.MtpObjectInfo) real;
    }

    public android.mtp.MtpObjectInfo unwrap() {
        return getReal();
    }

    public int getAssociationDesc() {
        return ((android.mtp.MtpObjectInfo) real).getAssociationDesc();
    }

    public int getAssociationType() {
        return ((android.mtp.MtpObjectInfo) real).getAssociationType();
    }

    public int getCompressedSize() {
        return ((android.mtp.MtpObjectInfo) real).getCompressedSize();
    }

    public long getCompressedSizeLong() {
        return ((android.mtp.MtpObjectInfo) real).getCompressedSizeLong();
    }

    public long getDateCreated() {
        return ((android.mtp.MtpObjectInfo) real).getDateCreated();
    }

    public long getDateModified() {
        return ((android.mtp.MtpObjectInfo) real).getDateModified();
    }

    public int getFormat() {
        return ((android.mtp.MtpObjectInfo) real).getFormat();
    }

    public int getImagePixDepth() {
        return ((android.mtp.MtpObjectInfo) real).getImagePixDepth();
    }

    public long getImagePixDepthLong() {
        return ((android.mtp.MtpObjectInfo) real).getImagePixDepthLong();
    }

    public int getImagePixHeight() {
        return ((android.mtp.MtpObjectInfo) real).getImagePixHeight();
    }

    public long getImagePixHeightLong() {
        return ((android.mtp.MtpObjectInfo) real).getImagePixHeightLong();
    }

    public int getImagePixWidth() {
        return ((android.mtp.MtpObjectInfo) real).getImagePixWidth();
    }

    public long getImagePixWidthLong() {
        return ((android.mtp.MtpObjectInfo) real).getImagePixWidthLong();
    }

    public java.lang.String getKeywords() {
        return ((android.mtp.MtpObjectInfo) real).getKeywords();
    }

    public java.lang.String getName() {
        return ((android.mtp.MtpObjectInfo) real).getName();
    }

    public int getObjectHandle() {
        return ((android.mtp.MtpObjectInfo) real).getObjectHandle();
    }

    public int getParent() {
        return ((android.mtp.MtpObjectInfo) real).getParent();
    }

    public int getProtectionStatus() {
        return ((android.mtp.MtpObjectInfo) real).getProtectionStatus();
    }

    public int getSequenceNumber() {
        return ((android.mtp.MtpObjectInfo) real).getSequenceNumber();
    }

    public long getSequenceNumberLong() {
        return ((android.mtp.MtpObjectInfo) real).getSequenceNumberLong();
    }

    public int getStorageId() {
        return ((android.mtp.MtpObjectInfo) real).getStorageId();
    }

    public int getThumbCompressedSize() {
        return ((android.mtp.MtpObjectInfo) real).getThumbCompressedSize();
    }

    public long getThumbCompressedSizeLong() {
        return ((android.mtp.MtpObjectInfo) real).getThumbCompressedSizeLong();
    }

    public int getThumbFormat() {
        return ((android.mtp.MtpObjectInfo) real).getThumbFormat();
    }

    public int getThumbPixHeight() {
        return ((android.mtp.MtpObjectInfo) real).getThumbPixHeight();
    }

    public long getThumbPixHeightLong() {
        return ((android.mtp.MtpObjectInfo) real).getThumbPixHeightLong();
    }

    public int getThumbPixWidth() {
        return ((android.mtp.MtpObjectInfo) real).getThumbPixWidth();
    }

    public long getThumbPixWidthLong() {
        return ((android.mtp.MtpObjectInfo) real).getThumbPixWidthLong();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder wrap(android.mtp.MtpObjectInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.mtp.MtpObjectInfo.Builder getReal() {
            return (android.mtp.MtpObjectInfo.Builder) real;
        }

        public android.mtp.MtpObjectInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.mtp.MtpObjectInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo arg0) {
            this(new android.mtp.MtpObjectInfo.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo build() {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.wrap(((android.mtp.MtpObjectInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setAssociationDesc(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setAssociationDesc(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setAssociationType(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setAssociationType(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setCompressedSize(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setCompressedSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setDateCreated(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setDateCreated(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setDateModified(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setDateModified(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setImagePixDepth(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setImagePixDepth(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setImagePixHeight(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setImagePixHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setImagePixWidth(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setImagePixWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setKeywords(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setKeywords(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setObjectHandle(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setObjectHandle(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setParent(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setParent(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setProtectionStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setProtectionStatus(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setSequenceNumber(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setSequenceNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setStorageId(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setStorageId(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbCompressedSize(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setThumbCompressedSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setThumbFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbPixHeight(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setThumbPixHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbPixWidth(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(((android.mtp.MtpObjectInfo.Builder) real).setThumbPixWidth(arg0));
        }

    }
}
