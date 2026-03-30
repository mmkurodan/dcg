// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class WifiDeviceFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiDeviceFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter wrap(android.companion.WifiDeviceFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter(real, (__DcgwBridgeToken) null);
    }

    public android.companion.WifiDeviceFilter getReal() {
        return (android.companion.WifiDeviceFilter) real;
    }

    public android.companion.WifiDeviceFilter unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.WifiDeviceFilter) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.WifiDeviceFilter) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.companion.WifiDeviceFilter) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.WifiDeviceFilter) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder wrap(android.companion.WifiDeviceFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.companion.WifiDeviceFilter.Builder getReal() {
            return (android.companion.WifiDeviceFilter.Builder) real;
        }

        public android.companion.WifiDeviceFilter.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.companion.WifiDeviceFilter.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter build() {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.wrap(((android.companion.WifiDeviceFilter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder setBssid(com.micklab.dcg.wrapper.android.net.MacAddress arg0) {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder.wrap(((android.companion.WifiDeviceFilter.Builder) real).setBssid(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder setBssidMask(com.micklab.dcg.wrapper.android.net.MacAddress arg0) {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder.wrap(((android.companion.WifiDeviceFilter.Builder) real).setBssidMask(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder setNamePattern(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.companion.WifiDeviceFilter.Builder.wrap(((android.companion.WifiDeviceFilter.Builder) real).setNamePattern(arg0));
        }

    }
}
