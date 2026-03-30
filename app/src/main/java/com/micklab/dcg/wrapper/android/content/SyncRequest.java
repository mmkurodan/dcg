// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncRequest {
    private final android.content.SyncRequest real;

    public SyncRequest(android.content.SyncRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncRequest wrap(android.content.SyncRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncRequest(real);
    }

    public android.content.SyncRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.content.SyncRequest.Builder real;

        public Builder(android.content.SyncRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.SyncRequest.Builder wrap(android.content.SyncRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncRequest.Builder(real);
        }

        public android.content.SyncRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.content.SyncRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest build() {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setDisallowMetered(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setDisallowMetered(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setExpedited(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setExpedited(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setIgnoreBackoff(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setIgnoreBackoff(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setIgnoreSettings(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setIgnoreSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setManual(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setManual(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setNoRetry(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setNoRetry(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setRequiresCharging(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setRequiresCharging(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setScheduleAsExpeditedJob(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setScheduleAsExpeditedJob(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setSyncAdapter(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.setSyncAdapter(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder syncOnce() {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.syncOnce());
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder syncPeriodic(long arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(real.syncPeriodic(arg0, arg1));
        }

    }
}
