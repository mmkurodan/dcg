// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionOutcome {
    private final android.adservices.adselection.AdSelectionOutcome real;

    public AdSelectionOutcome(android.adservices.adselection.AdSelectionOutcome real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome wrap(android.adservices.adselection.AdSelectionOutcome real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome(real);
    }

    public android.adservices.adselection.AdSelectionOutcome unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getAdSelectionId() {
        return real.getAdSelectionId();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRenderUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getRenderUri());
    }

    public boolean hasOutcome() {
        return real.hasOutcome();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome NO_OUTCOME = com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.wrap(android.adservices.adselection.AdSelectionOutcome.NO_OUTCOME);

    public static final class Builder {
        private final android.adservices.adselection.AdSelectionOutcome.Builder real;

        public Builder(android.adservices.adselection.AdSelectionOutcome.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder wrap(android.adservices.adselection.AdSelectionOutcome.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder(real);
        }

        public android.adservices.adselection.AdSelectionOutcome.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.adselection.AdSelectionOutcome.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder.wrap(real.setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder setRenderUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder.wrap(real.setRenderUri(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
