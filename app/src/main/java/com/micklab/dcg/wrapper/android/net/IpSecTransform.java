// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class IpSecTransform {
    private final android.net.IpSecTransform real;

    public IpSecTransform(android.net.IpSecTransform real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.IpSecTransform wrap(android.net.IpSecTransform real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecTransform(real);
    }

    public android.net.IpSecTransform unwrap() {
        return real;
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform#close()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform#equals(java.lang.Object)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform#toString()");
    }

    public static final class Builder {
        private final android.net.IpSecTransform.Builder real;

        public Builder(android.net.IpSecTransform.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecTransform.Builder wrap(android.net.IpSecTransform.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecTransform.Builder(real);
        }

        public android.net.IpSecTransform.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform$Builder#android.net.IpSecTransform$Builder(android.content.Context)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransform buildTransportModeTransform(java.net.InetAddress arg0, com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex arg1) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform$Builder#buildTransportModeTransform(java.net.InetAddress,android.net.IpSecManager$SecurityParameterIndex)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransform.Builder setAuthenticatedEncryption(com.micklab.dcg.wrapper.android.net.IpSecAlgorithm arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform$Builder#setAuthenticatedEncryption(android.net.IpSecAlgorithm)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransform.Builder setAuthentication(com.micklab.dcg.wrapper.android.net.IpSecAlgorithm arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform$Builder#setAuthentication(android.net.IpSecAlgorithm)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransform.Builder setEncryption(com.micklab.dcg.wrapper.android.net.IpSecAlgorithm arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform$Builder#setEncryption(android.net.IpSecAlgorithm)");
        }

        public com.micklab.dcg.wrapper.android.net.IpSecTransform.Builder setIpv4Encapsulation(com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecTransform$Builder#setIpv4Encapsulation(android.net.IpSecManager$UdpEncapsulationSocket,int)");
        }

    }
}
