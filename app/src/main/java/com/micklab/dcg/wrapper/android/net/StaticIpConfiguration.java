// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class StaticIpConfiguration {
    private final android.net.StaticIpConfiguration real;

    public StaticIpConfiguration(android.net.StaticIpConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.StaticIpConfiguration wrap(android.net.StaticIpConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.StaticIpConfiguration(real);
    }

    public android.net.StaticIpConfiguration unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#equals(java.lang.Object)");
    }

    public java.lang.String getDomains() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#getDomains()");
    }

    public java.net.InetAddress getGateway() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#getGateway()");
    }

    public com.micklab.dcg.wrapper.android.net.LinkAddress getIpAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#getIpAddress()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private final android.net.StaticIpConfiguration.Builder real;

        public Builder(android.net.StaticIpConfiguration.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.StaticIpConfiguration.Builder wrap(android.net.StaticIpConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.StaticIpConfiguration.Builder(real);
        }

        public android.net.StaticIpConfiguration.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration$Builder#android.net.StaticIpConfiguration$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.StaticIpConfiguration build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.StaticIpConfiguration.Builder setDomains(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration$Builder#setDomains(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.StaticIpConfiguration.Builder setGateway(java.net.InetAddress arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration$Builder#setGateway(java.net.InetAddress)");
        }

        public com.micklab.dcg.wrapper.android.net.StaticIpConfiguration.Builder setIpAddress(com.micklab.dcg.wrapper.android.net.LinkAddress arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.StaticIpConfiguration$Builder#setIpAddress(android.net.LinkAddress)");
        }

    }
}
