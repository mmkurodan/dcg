// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionOutcome {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdSelectionOutcome(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome wrap(android.adservices.adselection.AdSelectionOutcome real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.AdSelectionOutcome getReal() {
        return (android.adservices.adselection.AdSelectionOutcome) real;
    }

    public android.adservices.adselection.AdSelectionOutcome unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.AdSelectionOutcome) real).equals(arg0);
    }

    public long getAdSelectionId() {
        return ((android.adservices.adselection.AdSelectionOutcome) real).getAdSelectionId();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRenderUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.adselection.AdSelectionOutcome) real).getRenderUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getWinningSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.AdSelectionOutcome) real).getWinningSeller());
    }

    public boolean hasOutcome() {
        return ((android.adservices.adselection.AdSelectionOutcome) real).hasOutcome();
    }

    public int hashCode() {
        return ((android.adservices.adselection.AdSelectionOutcome) real).hashCode();
    }

    public static final com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome NO_OUTCOME = com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.wrap(android.adservices.adselection.AdSelectionOutcome.NO_OUTCOME);

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder wrap(android.adservices.adselection.AdSelectionOutcome.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.AdSelectionOutcome.Builder getReal() {
            return (android.adservices.adselection.AdSelectionOutcome.Builder) real;
        }

        public android.adservices.adselection.AdSelectionOutcome.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.AdSelectionOutcome.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.wrap(((android.adservices.adselection.AdSelectionOutcome.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder.wrap(((android.adservices.adselection.AdSelectionOutcome.Builder) real).setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder setRenderUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionOutcome.Builder.wrap(((android.adservices.adselection.AdSelectionOutcome.Builder) real).setRenderUri(arg0 == null ? null : arg0.getReal()));
        }

    }
}
