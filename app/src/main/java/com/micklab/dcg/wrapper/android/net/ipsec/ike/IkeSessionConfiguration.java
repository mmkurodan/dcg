// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeSessionConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeSessionConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration wrap(android.net.ipsec.ike.IkeSessionConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.IkeSessionConfiguration getReal() {
        return (android.net.ipsec.ike.IkeSessionConfiguration) real;
    }

    public android.net.ipsec.ike.IkeSessionConfiguration unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.net.eap.EapInfo getEapInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration#getEapInfo()");
    }

    public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConnectionInfo getIkeSessionConnectionInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration#getIkeSessionConnectionInfo()");
    }

    public java.lang.String getRemoteApplicationVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration#getRemoteApplicationVersion()");
    }

    public boolean isIkeExtensionEnabled(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration#isIkeExtensionEnabled(int)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder wrap(android.net.ipsec.ike.IkeSessionConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.ipsec.ike.IkeSessionConfiguration.Builder getReal() {
            return (android.net.ipsec.ike.IkeSessionConfiguration.Builder) real;
        }

        public android.net.ipsec.ike.IkeSessionConfiguration.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConnectionInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#android.net.ipsec.ike.IkeSessionConfiguration$Builder(android.net.ipsec.ike.IkeSessionConnectionInfo)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder addIkeExtension(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#addIkeExtension(int)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder addRemoteVendorId(byte[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#addRemoteVendorId([B)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder clearIkeExtensions() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#clearIkeExtensions()");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder clearRemoteApplicationVersion() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#clearRemoteApplicationVersion()");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder clearRemoteVendorIds() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#clearRemoteVendorIds()");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder setEapInfo(com.micklab.dcg.wrapper.android.net.eap.EapInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#setEapInfo(android.net.eap.EapInfo)");
        }

        public com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration.Builder setRemoteApplicationVersion(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConfiguration$Builder#setRemoteApplicationVersion(java.lang.String)");
        }

    }
}
