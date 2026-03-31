// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class IpSecManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IpSecManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.IpSecManager wrap(android.net.IpSecManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager(real, (__DcgwBridgeToken) null);
    }

    public android.net.IpSecManager getReal() {
        return (android.net.IpSecManager) real;
    }

    public android.net.IpSecManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress arg0) throws android.net.IpSecManager.ResourceUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#allocateSecurityParameterIndex(java.net.InetAddress)");
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress arg0, int arg1) throws android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#allocateSecurityParameterIndex(java.net.InetAddress,int)");
    }

    public void applyTransportModeTransform(java.io.FileDescriptor arg0, int arg1, com.micklab.dcg.wrapper.android.net.IpSecTransform arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#applyTransportModeTransform(java.io.FileDescriptor,int,android.net.IpSecTransform)");
    }

    public void applyTransportModeTransform(java.net.DatagramSocket arg0, int arg1, com.micklab.dcg.wrapper.android.net.IpSecTransform arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#applyTransportModeTransform(java.net.DatagramSocket,int,android.net.IpSecTransform)");
    }

    public void applyTransportModeTransform(java.net.Socket arg0, int arg1, com.micklab.dcg.wrapper.android.net.IpSecTransform arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#applyTransportModeTransform(java.net.Socket,int,android.net.IpSecTransform)");
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket() throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#openUdpEncapsulationSocket()");
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket(int arg0) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#openUdpEncapsulationSocket(int)");
    }

    public void removeTransportModeTransforms(java.net.DatagramSocket arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#removeTransportModeTransforms(java.net.DatagramSocket)");
    }

    public void removeTransportModeTransforms(java.io.FileDescriptor arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#removeTransportModeTransforms(java.io.FileDescriptor)");
    }

    public void removeTransportModeTransforms(java.net.Socket arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#removeTransportModeTransforms(java.net.Socket)");
    }


    public static final class ResourceUnavailableException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ResourceUnavailableException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.ResourceUnavailableException wrap(android.net.IpSecManager.ResourceUnavailableException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.ResourceUnavailableException(real, (__DcgwBridgeToken) null);
        }

        public android.net.IpSecManager.ResourceUnavailableException getReal() {
            return (android.net.IpSecManager.ResourceUnavailableException) real;
        }

        public android.net.IpSecManager.ResourceUnavailableException unwrap() {
            return getReal();
        }

    }
    public static final class SecurityParameterIndex {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SecurityParameterIndex(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex wrap(android.net.IpSecManager.SecurityParameterIndex real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex(real, (__DcgwBridgeToken) null);
        }

        public android.net.IpSecManager.SecurityParameterIndex getReal() {
            return (android.net.IpSecManager.SecurityParameterIndex) real;
        }

        public android.net.IpSecManager.SecurityParameterIndex unwrap() {
            return getReal();
        }

        public void close() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$SecurityParameterIndex#close()");
        }

        public int getSpi() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$SecurityParameterIndex#getSpi()");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$SecurityParameterIndex#toString()");
        }

    }
    public static final class SpiUnavailableException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SpiUnavailableException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.SpiUnavailableException wrap(android.net.IpSecManager.SpiUnavailableException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.SpiUnavailableException(real, (__DcgwBridgeToken) null);
        }

        public android.net.IpSecManager.SpiUnavailableException getReal() {
            return (android.net.IpSecManager.SpiUnavailableException) real;
        }

        public android.net.IpSecManager.SpiUnavailableException unwrap() {
            return getReal();
        }

        public int getSpi() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$SpiUnavailableException#getSpi()");
        }

    }
    public static final class UdpEncapsulationSocket {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UdpEncapsulationSocket(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket wrap(android.net.IpSecManager.UdpEncapsulationSocket real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket(real, (__DcgwBridgeToken) null);
        }

        public android.net.IpSecManager.UdpEncapsulationSocket getReal() {
            return (android.net.IpSecManager.UdpEncapsulationSocket) real;
        }

        public android.net.IpSecManager.UdpEncapsulationSocket unwrap() {
            return getReal();
        }

        public void close() throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$UdpEncapsulationSocket#close()");
        }

        public java.io.FileDescriptor getFileDescriptor() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$UdpEncapsulationSocket#getFileDescriptor()");
        }

        public int getPort() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$UdpEncapsulationSocket#getPort()");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$UdpEncapsulationSocket#toString()");
        }

    }
}
