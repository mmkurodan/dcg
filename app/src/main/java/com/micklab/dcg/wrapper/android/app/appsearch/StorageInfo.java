// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class StorageInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StorageInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo wrap(android.app.appsearch.StorageInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.StorageInfo getReal() {
        return (android.app.appsearch.StorageInfo) real;
    }

    public android.app.appsearch.StorageInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.StorageInfo) real).describeContents();
    }

    public int getAliveDocumentsCount() {
        return ((android.app.appsearch.StorageInfo) real).getAliveDocumentsCount();
    }

    public int getAliveNamespacesCount() {
        return ((android.app.appsearch.StorageInfo) real).getAliveNamespacesCount();
    }

    public int getBlobsCount() {
        return ((android.app.appsearch.StorageInfo) real).getBlobsCount();
    }

    public long getBlobsSizeBytes() {
        return ((android.app.appsearch.StorageInfo) real).getBlobsSizeBytes();
    }

    public long getSizeBytes() {
        return ((android.app.appsearch.StorageInfo) real).getSizeBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.StorageInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder wrap(android.app.appsearch.StorageInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.StorageInfo.Builder getReal() {
            return (android.app.appsearch.StorageInfo.Builder) real;
        }

        public android.app.appsearch.StorageInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.StorageInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.wrap(((android.app.appsearch.StorageInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setAliveDocumentsCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(((android.app.appsearch.StorageInfo.Builder) real).setAliveDocumentsCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setAliveNamespacesCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(((android.app.appsearch.StorageInfo.Builder) real).setAliveNamespacesCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setBlobsCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(((android.app.appsearch.StorageInfo.Builder) real).setBlobsCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setBlobsSizeBytes(long arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(((android.app.appsearch.StorageInfo.Builder) real).setBlobsSizeBytes(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setSizeBytes(long arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(((android.app.appsearch.StorageInfo.Builder) real).setSizeBytes(arg0));
        }

    }
}
