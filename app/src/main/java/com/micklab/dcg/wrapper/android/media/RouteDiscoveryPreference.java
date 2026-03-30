// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RouteDiscoveryPreference {
    private final android.media.RouteDiscoveryPreference real;

    public RouteDiscoveryPreference(android.media.RouteDiscoveryPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference wrap(android.media.RouteDiscoveryPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference(real);
    }

    public android.media.RouteDiscoveryPreference unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean shouldPerformActiveScan() {
        return real.shouldPerformActiveScan();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.media.RouteDiscoveryPreference.Builder real;

        public Builder(android.media.RouteDiscoveryPreference.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder wrap(android.media.RouteDiscoveryPreference.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder(real);
        }

        public android.media.RouteDiscoveryPreference.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference arg0) {
            this(new android.media.RouteDiscoveryPreference.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(java.util.List arg0, boolean arg1) {
            this(new android.media.RouteDiscoveryPreference.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference build() {
            return com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder setShouldPerformActiveScan(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference.Builder.wrap(real.setShouldPerformActiveScan(arg0));
        }

    }
}
