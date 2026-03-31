// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class VpnService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VpnService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.VpnService wrap(android.net.VpnService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.VpnService(real, (__DcgwBridgeToken) null);
    }

    public android.net.VpnService getReal() {
        return (android.net.VpnService) real;
    }

    public android.net.VpnService unwrap() {
        return getReal();
    }

    public VpnService() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#android.net.VpnService()");
    }

    public boolean isAlwaysOn() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#isAlwaysOn()");
    }

    public boolean isLockdownEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#isLockdownEnabled()");
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#onBind(android.content.Intent)");
    }

    public void onRevoke() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#onRevoke()");
    }

    public static com.micklab.dcg.wrapper.android.content.Intent prepare(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#prepare(android.content.Context)");
    }

    public boolean protect(java.net.Socket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#protect(java.net.Socket)");
    }

    public boolean protect(java.net.DatagramSocket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#protect(java.net.DatagramSocket)");
    }

    public boolean protect(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#protect(int)");
    }

    public boolean setUnderlyingNetworks(android.net.Network[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#setUnderlyingNetworks([Landroid.net.Network;)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.VpnService.Builder wrap(android.net.VpnService.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.VpnService.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.VpnService.Builder getReal() {
            return (android.net.VpnService.Builder) real;
        }

        public android.net.VpnService.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addAddress(java.net.InetAddress arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addAddress(java.net.InetAddress,int)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addAddress(java.lang.String arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addAddress(java.lang.String,int)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addAllowedApplication(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addAllowedApplication(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addDisallowedApplication(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addDisallowedApplication(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addDnsServer(java.net.InetAddress arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addDnsServer(java.net.InetAddress)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addDnsServer(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addDnsServer(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addRoute(com.micklab.dcg.wrapper.android.net.IpPrefix arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addRoute(android.net.IpPrefix)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addRoute(java.net.InetAddress arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addRoute(java.net.InetAddress,int)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addRoute(java.lang.String arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addRoute(java.lang.String,int)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder addSearchDomain(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#addSearchDomain(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder allowBypass() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#allowBypass()");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder allowFamily(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#allowFamily(int)");
        }

        public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor establish() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#establish()");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder excludeRoute(com.micklab.dcg.wrapper.android.net.IpPrefix arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#excludeRoute(android.net.IpPrefix)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder setBlocking(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#setBlocking(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder setConfigureIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#setConfigureIntent(android.app.PendingIntent)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder setHttpProxy(com.micklab.dcg.wrapper.android.net.ProxyInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#setHttpProxy(android.net.ProxyInfo)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder setMetered(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#setMetered(boolean)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder setMtu(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#setMtu(int)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder setSession(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#setSession(java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.net.VpnService.Builder setUnderlyingNetworks(android.net.Network[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService$Builder#setUnderlyingNetworks([Landroid.net.Network;)");
        }


    }
}
