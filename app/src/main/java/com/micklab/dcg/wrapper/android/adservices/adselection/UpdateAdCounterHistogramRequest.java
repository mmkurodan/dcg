// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class UpdateAdCounterHistogramRequest {
    private final android.adservices.adselection.UpdateAdCounterHistogramRequest real;

    public UpdateAdCounterHistogramRequest(android.adservices.adselection.UpdateAdCounterHistogramRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest wrap(android.adservices.adselection.UpdateAdCounterHistogramRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest(real);
    }

    public android.adservices.adselection.UpdateAdCounterHistogramRequest unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAdEventType() {
        return real.getAdEventType();
    }

    public long getAdSelectionId() {
        return real.getAdSelectionId();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getCallerAdTech() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getCallerAdTech());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder real;

        public Builder(android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder wrap(android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder(real);
        }

        public android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder unwrap() {
            return real;
        }

        public Builder(long arg0, int arg1, com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg2) {
            this(new android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setAdEventType(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder.wrap(real.setAdEventType(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder.wrap(real.setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setCallerAdTech(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder.wrap(real.setCallerAdTech(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
