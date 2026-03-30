// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class DataRemovalRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataRemovalRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest wrap(android.view.contentcapture.DataRemovalRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.DataRemovalRequest getReal() {
        return (android.view.contentcapture.DataRemovalRequest) real;
    }

    public android.view.contentcapture.DataRemovalRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.contentcapture.DataRemovalRequest) real).describeContents();
    }

    public java.lang.String getPackageName() {
        return ((android.view.contentcapture.DataRemovalRequest) real).getPackageName();
    }

    public boolean isForEverything() {
        return ((android.view.contentcapture.DataRemovalRequest) real).isForEverything();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.contentcapture.DataRemovalRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_IS_PREFIX = android.view.contentcapture.DataRemovalRequest.FLAG_IS_PREFIX;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder wrap(android.view.contentcapture.DataRemovalRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.contentcapture.DataRemovalRequest.Builder getReal() {
            return (android.view.contentcapture.DataRemovalRequest.Builder) real;
        }

        public android.view.contentcapture.DataRemovalRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.contentcapture.DataRemovalRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder addLocusId(com.micklab.dcg.wrapper.android.content.LocusId arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder.wrap(((android.view.contentcapture.DataRemovalRequest.Builder) real).addLocusId(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest build() {
            return com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.wrap(((android.view.contentcapture.DataRemovalRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder forEverything() {
            return com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder.wrap(((android.view.contentcapture.DataRemovalRequest.Builder) real).forEverything());
        }

    }
}
