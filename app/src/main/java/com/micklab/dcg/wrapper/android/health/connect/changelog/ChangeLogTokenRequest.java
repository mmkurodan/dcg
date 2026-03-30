// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogTokenRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeLogTokenRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest wrap(android.health.connect.changelog.ChangeLogTokenRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.changelog.ChangeLogTokenRequest getReal() {
        return (android.health.connect.changelog.ChangeLogTokenRequest) real;
    }

    public android.health.connect.changelog.ChangeLogTokenRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.changelog.ChangeLogTokenRequest) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.changelog.ChangeLogTokenRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder wrap(android.health.connect.changelog.ChangeLogTokenRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.changelog.ChangeLogTokenRequest.Builder getReal() {
            return (android.health.connect.changelog.ChangeLogTokenRequest.Builder) real;
        }

        public android.health.connect.changelog.ChangeLogTokenRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.health.connect.changelog.ChangeLogTokenRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder addDataOriginFilter(com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder.wrap(((android.health.connect.changelog.ChangeLogTokenRequest.Builder) real).addDataOriginFilter(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.wrap(((android.health.connect.changelog.ChangeLogTokenRequest.Builder) real).build());
        }

    }
}
