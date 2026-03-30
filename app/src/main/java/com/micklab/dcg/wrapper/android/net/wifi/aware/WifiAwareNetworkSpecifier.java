// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class WifiAwareNetworkSpecifier {
    private final android.net.wifi.aware.WifiAwareNetworkSpecifier real;

    public WifiAwareNetworkSpecifier(android.net.wifi.aware.WifiAwareNetworkSpecifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier wrap(android.net.wifi.aware.WifiAwareNetworkSpecifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier(real);
    }

    public android.net.wifi.aware.WifiAwareNetworkSpecifier unwrap() {
        return real;
    }

    public boolean canBeSatisfiedBy(com.micklab.dcg.wrapper.android.net.NetworkSpecifier arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#canBeSatisfiedBy(android.net.NetworkSpecifier)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#equals(java.lang.Object)");
    }

    public int getChannelFrequencyMhz() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#getChannelFrequencyMhz()");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareDataPathSecurityConfig getWifiAwareDataPathSecurityConfig() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#getWifiAwareDataPathSecurityConfig()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#hashCode()");
    }

    public boolean isChannelRequired() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#isChannelRequired()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private final android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder real;

        public Builder(android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder wrap(android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder(real);
        }

        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.net.wifi.aware.PublishDiscoverySession arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder(android.net.wifi.aware.PublishDiscoverySession)");
        }

        public Builder(com.micklab.dcg.wrapper.android.net.wifi.aware.DiscoverySession arg0, com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder(android.net.wifi.aware.DiscoverySession,android.net.wifi.aware.PeerHandle)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setChannelFrequencyMhz(int arg0, boolean arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#setChannelFrequencyMhz(int,boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setDataPathSecurityConfig(com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareDataPathSecurityConfig arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#setDataPathSecurityConfig(android.net.wifi.aware.WifiAwareDataPathSecurityConfig)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPmk(byte[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#setPmk([B)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPort(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#setPort(int)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPskPassphrase(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#setPskPassphrase(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setTransportProtocol(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareNetworkSpecifier$Builder#setTransportProtocol(int)");
        }

    }
}
