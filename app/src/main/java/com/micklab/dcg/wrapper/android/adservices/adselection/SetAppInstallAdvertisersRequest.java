// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class SetAppInstallAdvertisersRequest {
    private final android.adservices.adselection.SetAppInstallAdvertisersRequest real;

    public SetAppInstallAdvertisersRequest(android.adservices.adselection.SetAppInstallAdvertisersRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest wrap(android.adservices.adselection.SetAppInstallAdvertisersRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest(real);
    }

    public android.adservices.adselection.SetAppInstallAdvertisersRequest unwrap() {
        return real;
    }

    public static final class Builder {
        private final android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder real;

        public Builder(android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder wrap(android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder(real);
        }

        public android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.adselection.SetAppInstallAdvertisersRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SetAppInstallAdvertisersRequest.wrap(real.build());
        }

    }
}
