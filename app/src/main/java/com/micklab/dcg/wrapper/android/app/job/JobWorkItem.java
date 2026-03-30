// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobWorkItem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JobWorkItem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobWorkItem wrap(android.app.job.JobWorkItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobWorkItem(real, (__DcgwBridgeToken) null);
    }

    public android.app.job.JobWorkItem getReal() {
        return (android.app.job.JobWorkItem) real;
    }

    public android.app.job.JobWorkItem unwrap() {
        return getReal();
    }

    public JobWorkItem(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        this(new android.app.job.JobWorkItem(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public JobWorkItem(com.micklab.dcg.wrapper.android.content.Intent arg0, long arg1, long arg2) {
        this(new android.app.job.JobWorkItem(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public JobWorkItem(com.micklab.dcg.wrapper.android.content.Intent arg0, long arg1, long arg2, long arg3) {
        this(new android.app.job.JobWorkItem(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.job.JobWorkItem) real).describeContents();
    }

    public int getDeliveryCount() {
        return ((android.app.job.JobWorkItem) real).getDeliveryCount();
    }

    public long getEstimatedNetworkDownloadBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem#getEstimatedNetworkDownloadBytes()");
    }

    public long getEstimatedNetworkUploadBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem#getEstimatedNetworkUploadBytes()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.app.job.JobWorkItem) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.job.JobWorkItem) real).getIntent());
    }

    public long getMinimumNetworkChunkBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem#getMinimumNetworkChunkBytes()");
    }

    public java.lang.String toString() {
        return ((android.app.job.JobWorkItem) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.job.JobWorkItem) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder wrap(android.app.job.JobWorkItem.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.job.JobWorkItem.Builder getReal() {
            return (android.app.job.JobWorkItem.Builder) real;
        }

        public android.app.job.JobWorkItem.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.job.JobWorkItem.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem build() {
            return com.micklab.dcg.wrapper.android.app.job.JobWorkItem.wrap(((android.app.job.JobWorkItem.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setEstimatedNetworkBytes(long arg0, long arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem$Builder#setEstimatedNetworkBytes(long,long)");
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setExtras(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder.wrap(((android.app.job.JobWorkItem.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder.wrap(((android.app.job.JobWorkItem.Builder) real).setIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setMinimumNetworkChunkBytes(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem$Builder#setMinimumNetworkChunkBytes(long)");
        }

    }
}
