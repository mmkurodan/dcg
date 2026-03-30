// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class WifiDeviceFilter {
    private final android.companion.WifiDeviceFilter real;

    public WifiDeviceFilter(android.companion.WifiDeviceFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter wrap(android.companion.WifiDeviceFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter(real);
    }

    public android.companion.WifiDeviceFilter unwrap() {
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

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.companion.WifiDeviceFilter.Builder real;

        public Builder(android.companion.WifiDeviceFilter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder wrap(android.companion.WifiDeviceFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder(real);
        }

        public android.companion.WifiDeviceFilter.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.companion.WifiDeviceFilter.Builder());
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter build() {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder setBssid(com.micklab.dcg.wrapper.android.net.MacAddress arg0) {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder.wrap(real.setBssid(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder setBssidMask(com.micklab.dcg.wrapper.android.net.MacAddress arg0) {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder.wrap(real.setBssidMask(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder setNamePattern(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder.wrap(real.setNamePattern(arg0));
        }

    }
}
