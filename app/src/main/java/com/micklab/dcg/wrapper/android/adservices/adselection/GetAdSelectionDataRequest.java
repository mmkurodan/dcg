// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class GetAdSelectionDataRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetAdSelectionDataRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest wrap(android.adservices.adselection.GetAdSelectionDataRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.GetAdSelectionDataRequest getReal() {
        return (android.adservices.adselection.GetAdSelectionDataRequest) real;
    }

    public android.adservices.adselection.GetAdSelectionDataRequest unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getCoordinatorOriginUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.adselection.GetAdSelectionDataRequest) real).getCoordinatorOriginUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.GetAdSelectionDataRequest) real).getSeller());
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration getSellerConfiguration() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration.wrap(((android.adservices.adselection.GetAdSelectionDataRequest) real).getSellerConfiguration());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder wrap(android.adservices.adselection.GetAdSelectionDataRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.GetAdSelectionDataRequest.Builder getReal() {
            return (android.adservices.adselection.GetAdSelectionDataRequest.Builder) real;
        }

        public android.adservices.adselection.GetAdSelectionDataRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.GetAdSelectionDataRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.wrap(((android.adservices.adselection.GetAdSelectionDataRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder setCoordinatorOriginUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder.wrap(((android.adservices.adselection.GetAdSelectionDataRequest.Builder) real).setCoordinatorOriginUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder.wrap(((android.adservices.adselection.GetAdSelectionDataRequest.Builder) real).setSeller(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder setSellerConfiguration(com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder.wrap(((android.adservices.adselection.GetAdSelectionDataRequest.Builder) real).setSellerConfiguration(arg0 == null ? null : arg0.getReal()));
        }

    }
}
