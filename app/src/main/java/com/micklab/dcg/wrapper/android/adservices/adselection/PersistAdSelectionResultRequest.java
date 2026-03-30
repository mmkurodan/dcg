// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class PersistAdSelectionResultRequest {
    private final android.adservices.adselection.PersistAdSelectionResultRequest real;

    public PersistAdSelectionResultRequest(android.adservices.adselection.PersistAdSelectionResultRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest wrap(android.adservices.adselection.PersistAdSelectionResultRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest(real);
    }

    public android.adservices.adselection.PersistAdSelectionResultRequest unwrap() {
        return real;
    }

    public long getAdSelectionDataId() {
        return real.getAdSelectionDataId();
    }

    public long getAdSelectionId() {
        return real.getAdSelectionId();
    }

    public byte[] getAdSelectionResult() {
        return real.getAdSelectionResult();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getSeller());
    }

    public static final class Builder {
        private final android.adservices.adselection.PersistAdSelectionResultRequest.Builder real;

        public Builder(android.adservices.adselection.PersistAdSelectionResultRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder wrap(android.adservices.adselection.PersistAdSelectionResultRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder(real);
        }

        public android.adservices.adselection.PersistAdSelectionResultRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.adselection.PersistAdSelectionResultRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionDataId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(real.setAdSelectionDataId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(real.setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionResult(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(real.setAdSelectionResult(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(real.setSeller(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
