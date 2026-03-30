// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncRequest wrap(android.content.SyncRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncRequest(real, (__DcgwBridgeToken) null);
    }

    public android.content.SyncRequest getReal() {
        return (android.content.SyncRequest) real;
    }

    public android.content.SyncRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.SyncRequest) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.SyncRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.SyncRequest.Builder wrap(android.content.SyncRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.content.SyncRequest.Builder getReal() {
            return (android.content.SyncRequest.Builder) real;
        }

        public android.content.SyncRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.content.SyncRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest build() {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.wrap(((android.content.SyncRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setDisallowMetered(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setDisallowMetered(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setExpedited(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setExpedited(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setIgnoreBackoff(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setIgnoreBackoff(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setIgnoreSettings(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setIgnoreSettings(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setManual(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setManual(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setNoRetry(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setNoRetry(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setRequiresCharging(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setRequiresCharging(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setScheduleAsExpeditedJob(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setScheduleAsExpeditedJob(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder setSyncAdapter(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).setSyncAdapter(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder syncOnce() {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).syncOnce());
        }

        public com.micklab.dcg.wrapper.android.content.SyncRequest.Builder syncPeriodic(long arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.content.SyncRequest.Builder.wrap(((android.content.SyncRequest.Builder) real).syncPeriodic(arg0, arg1));
        }

    }
}
