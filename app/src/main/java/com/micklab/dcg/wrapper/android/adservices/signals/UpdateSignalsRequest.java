// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.signals;

public final class UpdateSignalsRequest {
    private final android.adservices.signals.UpdateSignalsRequest real;

    public UpdateSignalsRequest(android.adservices.signals.UpdateSignalsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest wrap(android.adservices.signals.UpdateSignalsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest(real);
    }

    public android.adservices.signals.UpdateSignalsRequest unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUpdateUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUpdateUri());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.adservices.signals.UpdateSignalsRequest.Builder real;

        public Builder(android.adservices.signals.UpdateSignalsRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder wrap(android.adservices.signals.UpdateSignalsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder(real);
        }

        public android.adservices.signals.UpdateSignalsRequest.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.adservices.signals.UpdateSignalsRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder setUpdateUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.signals.UpdateSignalsRequest.Builder.wrap(real.setUpdateUri(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
