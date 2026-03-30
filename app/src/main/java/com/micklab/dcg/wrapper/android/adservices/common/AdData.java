// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdData wrap(android.adservices.common.AdData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdData(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.AdData getReal() {
        return (android.adservices.common.AdData) real;
    }

    public android.adservices.common.AdData unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.common.AdData) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.AdData) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdFilters getAdFilters() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.wrap(((android.adservices.common.AdData) real).getAdFilters());
    }

    public java.lang.String getAdRenderId() {
        return ((android.adservices.common.AdData) real).getAdRenderId();
    }

    public java.lang.String getMetadata() {
        return ((android.adservices.common.AdData) real).getMetadata();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRenderUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.common.AdData) real).getRenderUri());
    }

    public int hashCode() {
        return ((android.adservices.common.AdData) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.AdData) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.AdData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder wrap(android.adservices.common.AdData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.common.AdData.Builder getReal() {
            return (android.adservices.common.AdData.Builder) real;
        }

        public android.adservices.common.AdData.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.common.AdData.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData build() {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.wrap(((android.adservices.common.AdData.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setAdFilters(com.micklab.dcg.wrapper.android.adservices.common.AdFilters arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(((android.adservices.common.AdData.Builder) real).setAdFilters(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setAdRenderId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(((android.adservices.common.AdData.Builder) real).setAdRenderId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setMetadata(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(((android.adservices.common.AdData.Builder) real).setMetadata(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setRenderUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(((android.adservices.common.AdData.Builder) real).setRenderUri(arg0 == null ? null : arg0.getReal()));
        }

    }
}
