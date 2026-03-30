// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.vcn;

public final class VcnConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VcnConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.vcn.VcnConfig wrap(android.net.vcn.VcnConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.vcn.VcnConfig(real, (__DcgwBridgeToken) null);
    }

    public android.net.vcn.VcnConfig getReal() {
        return (android.net.vcn.VcnConfig) real;
    }

    public android.net.vcn.VcnConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnConfig#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnConfig#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnConfig#hashCode()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnConfig#writeToParcel(android.os.Parcel,int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.vcn.VcnConfig.Builder wrap(android.net.vcn.VcnConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.vcn.VcnConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.vcn.VcnConfig.Builder getReal() {
            return (android.net.vcn.VcnConfig.Builder) real;
        }

        public android.net.vcn.VcnConfig.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnConfig$Builder#android.net.vcn.VcnConfig$Builder(android.content.Context)");
        }

        public com.micklab.dcg.wrapper.android.net.vcn.VcnConfig.Builder addGatewayConnectionConfig(com.micklab.dcg.wrapper.android.net.vcn.VcnGatewayConnectionConfig arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnConfig$Builder#addGatewayConnectionConfig(android.net.vcn.VcnGatewayConnectionConfig)");
        }

        public com.micklab.dcg.wrapper.android.net.vcn.VcnConfig build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnConfig$Builder#build()");
        }

    }
}
