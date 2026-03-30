// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpObjectInfo {
    private final android.mtp.MtpObjectInfo real;

    public MtpObjectInfo(android.mtp.MtpObjectInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo wrap(android.mtp.MtpObjectInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo(real);
    }

    public android.mtp.MtpObjectInfo unwrap() {
        return real;
    }

    public int getAssociationDesc() {
        return real.getAssociationDesc();
    }

    public int getAssociationType() {
        return real.getAssociationType();
    }

    public int getCompressedSize() {
        return real.getCompressedSize();
    }

    public long getCompressedSizeLong() {
        return real.getCompressedSizeLong();
    }

    public long getDateCreated() {
        return real.getDateCreated();
    }

    public long getDateModified() {
        return real.getDateModified();
    }

    public int getFormat() {
        return real.getFormat();
    }

    public int getImagePixDepth() {
        return real.getImagePixDepth();
    }

    public long getImagePixDepthLong() {
        return real.getImagePixDepthLong();
    }

    public int getImagePixHeight() {
        return real.getImagePixHeight();
    }

    public long getImagePixHeightLong() {
        return real.getImagePixHeightLong();
    }

    public int getImagePixWidth() {
        return real.getImagePixWidth();
    }

    public long getImagePixWidthLong() {
        return real.getImagePixWidthLong();
    }

    public java.lang.String getKeywords() {
        return real.getKeywords();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getObjectHandle() {
        return real.getObjectHandle();
    }

    public int getParent() {
        return real.getParent();
    }

    public int getProtectionStatus() {
        return real.getProtectionStatus();
    }

    public int getSequenceNumber() {
        return real.getSequenceNumber();
    }

    public long getSequenceNumberLong() {
        return real.getSequenceNumberLong();
    }

    public int getStorageId() {
        return real.getStorageId();
    }

    public int getThumbCompressedSize() {
        return real.getThumbCompressedSize();
    }

    public long getThumbCompressedSizeLong() {
        return real.getThumbCompressedSizeLong();
    }

    public int getThumbFormat() {
        return real.getThumbFormat();
    }

    public int getThumbPixHeight() {
        return real.getThumbPixHeight();
    }

    public long getThumbPixHeightLong() {
        return real.getThumbPixHeightLong();
    }

    public int getThumbPixWidth() {
        return real.getThumbPixWidth();
    }

    public long getThumbPixWidthLong() {
        return real.getThumbPixWidthLong();
    }

    public static final class Builder {
        private final android.mtp.MtpObjectInfo.Builder real;

        public Builder(android.mtp.MtpObjectInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder wrap(android.mtp.MtpObjectInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder(real);
        }

        public android.mtp.MtpObjectInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.mtp.MtpObjectInfo.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo arg0) {
            this(new android.mtp.MtpObjectInfo.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo build() {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setAssociationDesc(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setAssociationDesc(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setAssociationType(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setAssociationType(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setCompressedSize(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setCompressedSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setDateCreated(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setDateCreated(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setDateModified(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setDateModified(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setImagePixDepth(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setImagePixDepth(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setImagePixHeight(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setImagePixHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setImagePixWidth(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setImagePixWidth(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setKeywords(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setKeywords(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setObjectHandle(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setObjectHandle(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setParent(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setParent(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setProtectionStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setProtectionStatus(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setSequenceNumber(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setSequenceNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setStorageId(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setStorageId(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbCompressedSize(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setThumbCompressedSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setThumbFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbPixHeight(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setThumbPixHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder setThumbPixWidth(long arg0) {
            return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.Builder.wrap(real.setThumbPixWidth(arg0));
        }

    }
}
