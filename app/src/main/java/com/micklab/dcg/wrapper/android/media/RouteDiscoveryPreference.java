// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RouteDiscoveryPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RouteDiscoveryPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference wrap(android.media.RouteDiscoveryPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference(real, (__DcgwBridgeToken) null);
    }

    public android.media.RouteDiscoveryPreference getReal() {
        return (android.media.RouteDiscoveryPreference) real;
    }

    public android.media.RouteDiscoveryPreference unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.RouteDiscoveryPreference) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.RouteDiscoveryPreference) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.media.RouteDiscoveryPreference) real).hashCode();
    }

    public boolean shouldPerformActiveScan() {
        return ((android.media.RouteDiscoveryPreference) real).shouldPerformActiveScan();
    }

    public java.lang.String toString() {
        return ((android.media.RouteDiscoveryPreference) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.RouteDiscoveryPreference) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder wrap(android.media.RouteDiscoveryPreference.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.RouteDiscoveryPreference.Builder getReal() {
            return (android.media.RouteDiscoveryPreference.Builder) real;
        }

        public android.media.RouteDiscoveryPreference.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference arg0) {
            this(new android.media.RouteDiscoveryPreference.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(java.util.List arg0, boolean arg1) {
            this(new android.media.RouteDiscoveryPreference.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference build() {
            return com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.wrap(((android.media.RouteDiscoveryPreference.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder setShouldPerformActiveScan(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder.wrap(((android.media.RouteDiscoveryPreference.Builder) real).setShouldPerformActiveScan(arg0));
        }

    }
}
