// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class StorageInfo {
    private final android.app.appsearch.StorageInfo real;

    public StorageInfo(android.app.appsearch.StorageInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo wrap(android.app.appsearch.StorageInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo(real);
    }

    public android.app.appsearch.StorageInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAliveDocumentsCount() {
        return real.getAliveDocumentsCount();
    }

    public int getAliveNamespacesCount() {
        return real.getAliveNamespacesCount();
    }

    public long getSizeBytes() {
        return real.getSizeBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.StorageInfo.Builder real;

        public Builder(android.app.appsearch.StorageInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder wrap(android.app.appsearch.StorageInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder(real);
        }

        public android.app.appsearch.StorageInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.StorageInfo.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setAliveDocumentsCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(real.setAliveDocumentsCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setAliveNamespacesCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(real.setAliveNamespacesCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder setSizeBytes(long arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.StorageInfo.Builder.wrap(real.setSizeBytes(arg0));
        }

    }
}
