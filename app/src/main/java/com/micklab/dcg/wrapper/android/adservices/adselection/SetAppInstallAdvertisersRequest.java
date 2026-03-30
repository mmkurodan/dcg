// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class SetAppInstallAdvertisersRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SetAppInstallAdvertisersRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest wrap(android.adservices.adselection.SetAppInstallAdvertisersRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.SetAppInstallAdvertisersRequest getReal() {
        return (android.adservices.adselection.SetAppInstallAdvertisersRequest) real;
    }

    public android.adservices.adselection.SetAppInstallAdvertisersRequest unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder wrap(android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder getReal() {
            return (android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder) real;
        }

        public android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest.wrap(((android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder) real).build());
        }

    }
}
