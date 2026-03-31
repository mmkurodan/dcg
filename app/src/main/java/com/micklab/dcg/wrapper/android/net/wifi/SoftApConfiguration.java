// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class SoftApConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SoftApConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration wrap(android.net.wifi.SoftApConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.SoftApConfiguration getReal() {
        return (android.net.wifi.SoftApConfiguration) real;
    }

    public android.net.wifi.SoftApConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.net.MacAddress getBssid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#getBssid()");
    }

    public com.micklab.dcg.wrapper.android.util.SparseIntArray getChannels() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#getChannels()");
    }

    public java.lang.String getPassphrase() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#getPassphrase()");
    }

    public int getSecurityType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#getSecurityType()");
    }

    public java.lang.String getSsid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#getSsid()");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.WifiSsid getWifiSsid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#getWifiSsid()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#hashCode()");
    }

    public boolean isHiddenSsid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#isHiddenSsid()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration.Builder wrap(android.net.wifi.SoftApConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.SoftApConfiguration.Builder getReal() {
            return (android.net.wifi.SoftApConfiguration.Builder) real;
        }

        public android.net.wifi.SoftApConfiguration.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration$Builder#android.net.wifi.SoftApConfiguration$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration.Builder setChannels(com.micklab.dcg.wrapper.android.util.SparseIntArray arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.SoftApConfiguration$Builder#setChannels(android.util.SparseIntArray)");
        }

    }
}
