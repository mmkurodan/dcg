// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class IpConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IpConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.IpConfiguration wrap(android.net.IpConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.net.IpConfiguration getReal() {
        return (android.net.IpConfiguration) real;
    }

    public android.net.IpConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.net.ProxyInfo getHttpProxy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration#getHttpProxy()");
    }

    public com.micklab.dcg.wrapper.android.net.StaticIpConfiguration getStaticIpConfiguration() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration#getStaticIpConfiguration()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpConfiguration.Builder wrap(android.net.IpConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpConfiguration.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.IpConfiguration.Builder getReal() {
            return (android.net.IpConfiguration.Builder) real;
        }

        public android.net.IpConfiguration.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration$Builder#android.net.IpConfiguration$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.IpConfiguration build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.IpConfiguration.Builder setHttpProxy(com.micklab.dcg.wrapper.android.net.ProxyInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration$Builder#setHttpProxy(android.net.ProxyInfo)");
        }

        public com.micklab.dcg.wrapper.android.net.IpConfiguration.Builder setStaticIpConfiguration(com.micklab.dcg.wrapper.android.net.StaticIpConfiguration arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpConfiguration$Builder#setStaticIpConfiguration(android.net.StaticIpConfiguration)");
        }

    }
}
