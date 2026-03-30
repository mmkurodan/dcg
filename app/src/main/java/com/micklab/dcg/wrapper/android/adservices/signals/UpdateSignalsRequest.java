// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.signals;

public final class UpdateSignalsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UpdateSignalsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest wrap(android.adservices.signals.UpdateSignalsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.signals.UpdateSignalsRequest getReal() {
        return (android.adservices.signals.UpdateSignalsRequest) real;
    }

    public android.adservices.signals.UpdateSignalsRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.signals.UpdateSignalsRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUpdateUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.signals.UpdateSignalsRequest) real).getUpdateUri());
    }

    public int hashCode() {
        return ((android.adservices.signals.UpdateSignalsRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.signals.UpdateSignalsRequest) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder wrap(android.adservices.signals.UpdateSignalsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.signals.UpdateSignalsRequest.Builder getReal() {
            return (android.adservices.signals.UpdateSignalsRequest.Builder) real;
        }

        public android.adservices.signals.UpdateSignalsRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.signals.UpdateSignalsRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.wrap(((android.adservices.signals.UpdateSignalsRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder setUpdateUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder.wrap(((android.adservices.signals.UpdateSignalsRequest.Builder) real).setUpdateUri(arg0 == null ? null : arg0.getReal()));
        }

    }
}
