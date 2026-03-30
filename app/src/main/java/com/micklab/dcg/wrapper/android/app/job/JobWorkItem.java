// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.job;

public final class JobWorkItem {
    private final android.app.job.JobWorkItem real;

    public JobWorkItem(android.app.job.JobWorkItem real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.job.JobWorkItem wrap(android.app.job.JobWorkItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobWorkItem(real);
    }

    public android.app.job.JobWorkItem unwrap() {
        return real;
    }

    public JobWorkItem(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        this(new android.app.job.JobWorkItem(arg0 == null ? null : arg0.unwrap()));
    }

    public JobWorkItem(com.micklab.dcg.wrapper.android.content.Intent arg0, long arg1, long arg2) {
        this(new android.app.job.JobWorkItem(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public JobWorkItem(com.micklab.dcg.wrapper.android.content.Intent arg0, long arg1, long arg2, long arg3) {
        this(new android.app.job.JobWorkItem(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getDeliveryCount() {
        return real.getDeliveryCount();
    }

    public long getEstimatedNetworkDownloadBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem#getEstimatedNetworkDownloadBytes()");
    }

    public long getEstimatedNetworkUploadBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem#getEstimatedNetworkUploadBytes()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
    }

    public long getMinimumNetworkChunkBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem#getMinimumNetworkChunkBytes()");
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.job.JobWorkItem.Builder real;

        public Builder(android.app.job.JobWorkItem.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder wrap(android.app.job.JobWorkItem.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder(real);
        }

        public android.app.job.JobWorkItem.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.job.JobWorkItem.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem build() {
            return com.micklab.dcg.wrapper.android.app.job.JobWorkItem.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setEstimatedNetworkBytes(long arg0, long arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem$Builder#setEstimatedNetworkBytes(long,long)");
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setExtras(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder.wrap(real.setIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.job.JobWorkItem.Builder setMinimumNetworkChunkBytes(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.job.JobWorkItem$Builder#setMinimumNetworkChunkBytes(long)");
        }

    }
}
