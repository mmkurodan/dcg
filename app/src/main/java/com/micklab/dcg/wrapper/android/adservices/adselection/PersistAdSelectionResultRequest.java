// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class PersistAdSelectionResultRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PersistAdSelectionResultRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest wrap(android.adservices.adselection.PersistAdSelectionResultRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.PersistAdSelectionResultRequest getReal() {
        return (android.adservices.adselection.PersistAdSelectionResultRequest) real;
    }

    public android.adservices.adselection.PersistAdSelectionResultRequest unwrap() {
        return getReal();
    }

    public long getAdSelectionDataId() {
        return ((android.adservices.adselection.PersistAdSelectionResultRequest) real).getAdSelectionDataId();
    }

    public long getAdSelectionId() {
        return ((android.adservices.adselection.PersistAdSelectionResultRequest) real).getAdSelectionId();
    }

    public byte[] getAdSelectionResult() {
        return ((android.adservices.adselection.PersistAdSelectionResultRequest) real).getAdSelectionResult();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.PersistAdSelectionResultRequest) real).getSeller());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder wrap(android.adservices.adselection.PersistAdSelectionResultRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.PersistAdSelectionResultRequest.Builder getReal() {
            return (android.adservices.adselection.PersistAdSelectionResultRequest.Builder) real;
        }

        public android.adservices.adselection.PersistAdSelectionResultRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.PersistAdSelectionResultRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.wrap(((android.adservices.adselection.PersistAdSelectionResultRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionDataId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(((android.adservices.adselection.PersistAdSelectionResultRequest.Builder) real).setAdSelectionDataId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(((android.adservices.adselection.PersistAdSelectionResultRequest.Builder) real).setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionResult(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(((android.adservices.adselection.PersistAdSelectionResultRequest.Builder) real).setAdSelectionResult(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PersistAdSelectionResultRequest.Builder.wrap(((android.adservices.adselection.PersistAdSelectionResultRequest.Builder) real).setSeller(arg0 == null ? null : arg0.getReal()));
        }

    }
}
