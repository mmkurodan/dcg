// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdData {
    private final android.adservices.common.AdData real;

    public AdData(android.adservices.common.AdData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdData wrap(android.adservices.common.AdData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdData(real);
    }

    public android.adservices.common.AdData unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdFilters getAdFilters() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.wrap(real.getAdFilters());
    }

    public java.lang.String getAdRenderId() {
        return real.getAdRenderId();
    }

    public java.lang.String getMetadata() {
        return real.getMetadata();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRenderUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getRenderUri());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.common.AdData.Builder real;

        public Builder(android.adservices.common.AdData.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder wrap(android.adservices.common.AdData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder(real);
        }

        public android.adservices.common.AdData.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.common.AdData.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData build() {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setAdFilters(com.micklab.dcg.wrapper.android.adservices.common.AdFilters arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(real.setAdFilters(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setAdRenderId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(real.setAdRenderId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setMetadata(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(real.setMetadata(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder setRenderUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdData.Builder.wrap(real.setRenderUri(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
