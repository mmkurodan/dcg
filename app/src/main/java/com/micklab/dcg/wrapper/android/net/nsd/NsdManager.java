// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.nsd;

public final class NsdManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NsdManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.nsd.NsdManager wrap(android.net.nsd.NsdManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.NsdManager(real, (__DcgwBridgeToken) null);
    }

    public android.net.nsd.NsdManager getReal() {
        return (android.net.nsd.NsdManager) real;
    }

    public android.net.nsd.NsdManager unwrap() {
        return getReal();
    }

    public void discoverServices(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.DiscoveryListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#discoverServices(java.lang.String,int,android.net.nsd.NsdManager$DiscoveryListener)");
    }

    public void discoverServices(com.micklab.dcg.wrapper.android.net.nsd.DiscoveryRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.DiscoveryListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#discoverServices(android.net.nsd.DiscoveryRequest,java.util.concurrent.Executor,android.net.nsd.NsdManager$DiscoveryListener)");
    }

    public void discoverServices(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.net.Network arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.DiscoveryListener arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#discoverServices(java.lang.String,int,android.net.Network,java.util.concurrent.Executor,android.net.nsd.NsdManager$DiscoveryListener)");
    }

    public void discoverServices(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.net.NetworkRequest arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.DiscoveryListener arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#discoverServices(java.lang.String,int,android.net.NetworkRequest,java.util.concurrent.Executor,android.net.nsd.NsdManager$DiscoveryListener)");
    }

    public void registerService(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, int arg1, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.RegistrationListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#registerService(android.net.nsd.NsdServiceInfo,int,android.net.nsd.NsdManager$RegistrationListener)");
    }

    public void registerService(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, int arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.RegistrationListener arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#registerService(android.net.nsd.NsdServiceInfo,int,java.util.concurrent.Executor,android.net.nsd.NsdManager$RegistrationListener)");
    }

    public void registerServiceInfoCallback(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ServiceInfoCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#registerServiceInfoCallback(android.net.nsd.NsdServiceInfo,java.util.concurrent.Executor,android.net.nsd.NsdManager$ServiceInfoCallback)");
    }

    public void resolveService(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ResolveListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#resolveService(android.net.nsd.NsdServiceInfo,android.net.nsd.NsdManager$ResolveListener)");
    }

    public void resolveService(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ResolveListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#resolveService(android.net.nsd.NsdServiceInfo,java.util.concurrent.Executor,android.net.nsd.NsdManager$ResolveListener)");
    }

    public void stopServiceDiscovery(com.micklab.dcg.wrapper.android.net.nsd.NsdManager.DiscoveryListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#stopServiceDiscovery(android.net.nsd.NsdManager$DiscoveryListener)");
    }

    public void stopServiceResolution(com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ResolveListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#stopServiceResolution(android.net.nsd.NsdManager$ResolveListener)");
    }

    public void unregisterService(com.micklab.dcg.wrapper.android.net.nsd.NsdManager.RegistrationListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#unregisterService(android.net.nsd.NsdManager$RegistrationListener)");
    }

    public void unregisterServiceInfoCallback(com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ServiceInfoCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager#unregisterServiceInfoCallback(android.net.nsd.NsdManager$ServiceInfoCallback)");
    }


    public static final class DiscoveryListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DiscoveryListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.nsd.NsdManager.DiscoveryListener wrap(android.net.nsd.NsdManager.DiscoveryListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.NsdManager.DiscoveryListener(real, (__DcgwBridgeToken) null);
        }

        public android.net.nsd.NsdManager.DiscoveryListener getReal() {
            return (android.net.nsd.NsdManager.DiscoveryListener) real;
        }

        public android.net.nsd.NsdManager.DiscoveryListener unwrap() {
            return getReal();
        }

        public void onDiscoveryStarted(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$DiscoveryListener#onDiscoveryStarted(java.lang.String)");
        }

        public void onDiscoveryStopped(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$DiscoveryListener#onDiscoveryStopped(java.lang.String)");
        }

        public void onServiceFound(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$DiscoveryListener#onServiceFound(android.net.nsd.NsdServiceInfo)");
        }

        public void onServiceLost(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$DiscoveryListener#onServiceLost(android.net.nsd.NsdServiceInfo)");
        }

        public void onStartDiscoveryFailed(java.lang.String arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$DiscoveryListener#onStartDiscoveryFailed(java.lang.String,int)");
        }

        public void onStopDiscoveryFailed(java.lang.String arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$DiscoveryListener#onStopDiscoveryFailed(java.lang.String,int)");
        }

    }
    public static final class RegistrationListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RegistrationListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.nsd.NsdManager.RegistrationListener wrap(android.net.nsd.NsdManager.RegistrationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.NsdManager.RegistrationListener(real, (__DcgwBridgeToken) null);
        }

        public android.net.nsd.NsdManager.RegistrationListener getReal() {
            return (android.net.nsd.NsdManager.RegistrationListener) real;
        }

        public android.net.nsd.NsdManager.RegistrationListener unwrap() {
            return getReal();
        }

        public void onRegistrationFailed(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$RegistrationListener#onRegistrationFailed(android.net.nsd.NsdServiceInfo,int)");
        }

        public void onServiceRegistered(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$RegistrationListener#onServiceRegistered(android.net.nsd.NsdServiceInfo)");
        }

        public void onServiceUnregistered(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$RegistrationListener#onServiceUnregistered(android.net.nsd.NsdServiceInfo)");
        }

        public void onUnregistrationFailed(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$RegistrationListener#onUnregistrationFailed(android.net.nsd.NsdServiceInfo,int)");
        }

    }
    public static final class ResolveListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ResolveListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ResolveListener wrap(android.net.nsd.NsdManager.ResolveListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ResolveListener(real, (__DcgwBridgeToken) null);
        }

        public android.net.nsd.NsdManager.ResolveListener getReal() {
            return (android.net.nsd.NsdManager.ResolveListener) real;
        }

        public android.net.nsd.NsdManager.ResolveListener unwrap() {
            return getReal();
        }

        public void onResolutionStopped(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ResolveListener#onResolutionStopped(android.net.nsd.NsdServiceInfo)");
        }

        public void onResolveFailed(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ResolveListener#onResolveFailed(android.net.nsd.NsdServiceInfo,int)");
        }

        public void onServiceResolved(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ResolveListener#onServiceResolved(android.net.nsd.NsdServiceInfo)");
        }

        public void onStopResolutionFailed(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ResolveListener#onStopResolutionFailed(android.net.nsd.NsdServiceInfo,int)");
        }

    }
    public static final class ServiceInfoCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ServiceInfoCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ServiceInfoCallback wrap(android.net.nsd.NsdManager.ServiceInfoCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.nsd.NsdManager.ServiceInfoCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.nsd.NsdManager.ServiceInfoCallback getReal() {
            return (android.net.nsd.NsdManager.ServiceInfoCallback) real;
        }

        public android.net.nsd.NsdManager.ServiceInfoCallback unwrap() {
            return getReal();
        }

        public void onServiceInfoCallbackRegistrationFailed(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ServiceInfoCallback#onServiceInfoCallbackRegistrationFailed(int)");
        }

        public void onServiceInfoCallbackUnregistered() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ServiceInfoCallback#onServiceInfoCallbackUnregistered()");
        }

        public void onServiceLost() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ServiceInfoCallback#onServiceLost()");
        }

        public void onServiceUpdated(com.micklab.dcg.wrapper.android.net.nsd.NsdServiceInfo arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.nsd.NsdManager$ServiceInfoCallback#onServiceUpdated(android.net.nsd.NsdServiceInfo)");
        }

    }
}
