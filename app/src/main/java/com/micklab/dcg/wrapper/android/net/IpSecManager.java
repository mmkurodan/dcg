// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class IpSecManager {
    private final android.net.IpSecManager real;

    public IpSecManager(android.net.IpSecManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.IpSecManager wrap(android.net.IpSecManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager(real);
    }

    public android.net.IpSecManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress arg0) throws android.net.IpSecManager.ResourceUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#allocateSecurityParameterIndex(java.net.InetAddress)");
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex allocateSecurityParameterIndex(java.net.InetAddress arg0, int arg1) throws android.net.IpSecManager.ResourceUnavailableException, android.net.IpSecManager.SpiUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#allocateSecurityParameterIndex(java.net.InetAddress,int)");
    }

    public void applyTransportModeTransform(java.net.Socket arg0, int arg1, com.micklab.dcg.wrapper.android.net.IpSecTransform arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#applyTransportModeTransform(java.net.Socket,int,android.net.IpSecTransform)");
    }

    public void applyTransportModeTransform(java.net.DatagramSocket arg0, int arg1, com.micklab.dcg.wrapper.android.net.IpSecTransform arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#applyTransportModeTransform(java.net.DatagramSocket,int,android.net.IpSecTransform)");
    }

    public void applyTransportModeTransform(java.io.FileDescriptor arg0, int arg1, com.micklab.dcg.wrapper.android.net.IpSecTransform arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#applyTransportModeTransform(java.io.FileDescriptor,int,android.net.IpSecTransform)");
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket() throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#openUdpEncapsulationSocket()");
    }

    public com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket openUdpEncapsulationSocket(int arg0) throws java.io.IOException, android.net.IpSecManager.ResourceUnavailableException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#openUdpEncapsulationSocket(int)");
    }

    public void removeTransportModeTransforms(java.io.FileDescriptor arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#removeTransportModeTransforms(java.io.FileDescriptor)");
    }

    public void removeTransportModeTransforms(java.net.Socket arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#removeTransportModeTransforms(java.net.Socket)");
    }

    public void removeTransportModeTransforms(java.net.DatagramSocket arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager#removeTransportModeTransforms(java.net.DatagramSocket)");
    }


    public static final class ResourceUnavailableException {
        private final android.net.IpSecManager.ResourceUnavailableException real;

        public ResourceUnavailableException(android.net.IpSecManager.ResourceUnavailableException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.ResourceUnavailableException wrap(android.net.IpSecManager.ResourceUnavailableException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.ResourceUnavailableException(real);
        }

        public android.net.IpSecManager.ResourceUnavailableException unwrap() {
            return real;
        }

    }
    public static final class SecurityParameterIndex {
        private final android.net.IpSecManager.SecurityParameterIndex real;

        public SecurityParameterIndex(android.net.IpSecManager.SecurityParameterIndex real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex wrap(android.net.IpSecManager.SecurityParameterIndex real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.SecurityParameterIndex(real);
        }

        public android.net.IpSecManager.SecurityParameterIndex unwrap() {
            return real;
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
        private final android.net.IpSecManager.SpiUnavailableException real;

        public SpiUnavailableException(android.net.IpSecManager.SpiUnavailableException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.SpiUnavailableException wrap(android.net.IpSecManager.SpiUnavailableException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.SpiUnavailableException(real);
        }

        public android.net.IpSecManager.SpiUnavailableException unwrap() {
            return real;
        }

        public int getSpi() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpSecManager$SpiUnavailableException#getSpi()");
        }

    }
    public static final class UdpEncapsulationSocket {
        private final android.net.IpSecManager.UdpEncapsulationSocket real;

        public UdpEncapsulationSocket(android.net.IpSecManager.UdpEncapsulationSocket real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket wrap(android.net.IpSecManager.UdpEncapsulationSocket real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket(real);
        }

        public android.net.IpSecManager.UdpEncapsulationSocket unwrap() {
            return real;
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
