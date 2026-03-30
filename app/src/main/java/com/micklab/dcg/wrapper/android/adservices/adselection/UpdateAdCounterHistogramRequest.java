// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class UpdateAdCounterHistogramRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UpdateAdCounterHistogramRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest wrap(android.adservices.adselection.UpdateAdCounterHistogramRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.UpdateAdCounterHistogramRequest getReal() {
        return (android.adservices.adselection.UpdateAdCounterHistogramRequest) real;
    }

    public android.adservices.adselection.UpdateAdCounterHistogramRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.UpdateAdCounterHistogramRequest) real).equals(arg0);
    }

    public int getAdEventType() {
        return ((android.adservices.adselection.UpdateAdCounterHistogramRequest) real).getAdEventType();
    }

    public long getAdSelectionId() {
        return ((android.adservices.adselection.UpdateAdCounterHistogramRequest) real).getAdSelectionId();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getCallerAdTech() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.UpdateAdCounterHistogramRequest) real).getCallerAdTech());
    }

    public int hashCode() {
        return ((android.adservices.adselection.UpdateAdCounterHistogramRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.adselection.UpdateAdCounterHistogramRequest) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder wrap(android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder getReal() {
            return (android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder) real;
        }

        public android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(long arg0, int arg1, com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg2) {
            this(new android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.wrap(((android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setAdEventType(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder.wrap(((android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder) real).setAdEventType(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder.wrap(((android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder) real).setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setCallerAdTech(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder.wrap(((android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder) real).setCallerAdTech(arg0 == null ? null : arg0.getReal()));
        }

    }
}
