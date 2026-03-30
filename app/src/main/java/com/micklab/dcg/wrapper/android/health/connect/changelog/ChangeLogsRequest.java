// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeLogsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest wrap(android.health.connect.changelog.ChangeLogsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.changelog.ChangeLogsRequest getReal() {
        return (android.health.connect.changelog.ChangeLogsRequest) real;
    }

    public android.health.connect.changelog.ChangeLogsRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.changelog.ChangeLogsRequest) real).describeContents();
    }

    public int getPageSize() {
        return ((android.health.connect.changelog.ChangeLogsRequest) real).getPageSize();
    }

    public java.lang.String getToken() {
        return ((android.health.connect.changelog.ChangeLogsRequest) real).getToken();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.changelog.ChangeLogsRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder wrap(android.health.connect.changelog.ChangeLogsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.changelog.ChangeLogsRequest.Builder getReal() {
            return (android.health.connect.changelog.ChangeLogsRequest.Builder) real;
        }

        public android.health.connect.changelog.ChangeLogsRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.health.connect.changelog.ChangeLogsRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.wrap(((android.health.connect.changelog.ChangeLogsRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder setPageSize(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder.wrap(((android.health.connect.changelog.ChangeLogsRequest.Builder) real).setPageSize(arg0));
        }

    }
}
