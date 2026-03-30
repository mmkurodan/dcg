// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class GetAdSelectionDataRequest {
    private final android.adservices.adselection.GetAdSelectionDataRequest real;

    public GetAdSelectionDataRequest(android.adservices.adselection.GetAdSelectionDataRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest wrap(android.adservices.adselection.GetAdSelectionDataRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest(real);
    }

    public android.adservices.adselection.GetAdSelectionDataRequest unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.net.Uri getCoordinatorOriginUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getCoordinatorOriginUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getSeller());
    }

    public static final class Builder {
        private final android.adservices.adselection.GetAdSelectionDataRequest.Builder real;

        public Builder(android.adservices.adselection.GetAdSelectionDataRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder wrap(android.adservices.adselection.GetAdSelectionDataRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder(real);
        }

        public android.adservices.adselection.GetAdSelectionDataRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.adselection.GetAdSelectionDataRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder setCoordinatorOriginUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder.wrap(real.setCoordinatorOriginUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataRequest.Builder.wrap(real.setSeller(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
