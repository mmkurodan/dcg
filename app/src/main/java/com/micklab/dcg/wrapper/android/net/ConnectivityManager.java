// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class ConnectivityManager {
    private final android.net.ConnectivityManager real;

    public ConnectivityManager(android.net.ConnectivityManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ConnectivityManager wrap(android.net.ConnectivityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ConnectivityManager(real);
    }

    public android.net.ConnectivityManager unwrap() {
        return real;
    }

    public void addDefaultNetworkActiveListener(com.micklab.dcg.wrapper.android.net.ConnectivityManager.OnNetworkActiveListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#addDefaultNetworkActiveListener(android.net.ConnectivityManager$OnNetworkActiveListener)");
    }

    public boolean bindProcessToNetwork(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#bindProcessToNetwork(android.net.Network)");
    }

    public com.micklab.dcg.wrapper.android.net.SocketKeepalive createSocketKeepalive(com.micklab.dcg.wrapper.android.net.Network arg0, com.micklab.dcg.wrapper.android.net.IpSecManager.UdpEncapsulationSocket arg1, java.net.InetAddress arg2, java.net.InetAddress arg3, java.util.concurrent.Executor arg4, com.micklab.dcg.wrapper.android.net.SocketKeepalive.Callback arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#createSocketKeepalive(android.net.Network,android.net.IpSecManager$UdpEncapsulationSocket,java.net.InetAddress,java.net.InetAddress,java.util.concurrent.Executor,android.net.SocketKeepalive$Callback)");
    }

    public com.micklab.dcg.wrapper.android.net.Network getActiveNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getActiveNetwork()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkInfo getActiveNetworkInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getActiveNetworkInfo()");
    }

    public android.net.NetworkInfo[] getAllNetworkInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getAllNetworkInfo()");
    }

    public android.net.Network[] getAllNetworks() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getAllNetworks()");
    }

    public boolean getBackgroundDataSetting() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getBackgroundDataSetting()");
    }

    public com.micklab.dcg.wrapper.android.net.Network getBoundNetworkForProcess() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getBoundNetworkForProcess()");
    }

    public int getConnectionOwnerUid(int arg0, java.net.InetSocketAddress arg1, java.net.InetSocketAddress arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getConnectionOwnerUid(int,java.net.InetSocketAddress,java.net.InetSocketAddress)");
    }

    public com.micklab.dcg.wrapper.android.net.ProxyInfo getDefaultProxy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getDefaultProxy()");
    }

    public com.micklab.dcg.wrapper.android.net.LinkProperties getLinkProperties(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getLinkProperties(android.net.Network)");
    }

    public int getMultipathPreference(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getMultipathPreference(android.net.Network)");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkCapabilities getNetworkCapabilities(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getNetworkCapabilities(android.net.Network)");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkInfo getNetworkInfo(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getNetworkInfo(android.net.Network)");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkInfo getNetworkInfo(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getNetworkInfo(int)");
    }

    public int getNetworkPreference() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getNetworkPreference()");
    }

    public byte[] getNetworkWatchlistConfigHash() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getNetworkWatchlistConfigHash()");
    }

    public static com.micklab.dcg.wrapper.android.net.Network getProcessDefaultNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getProcessDefaultNetwork()");
    }

    public int getRestrictBackgroundStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#getRestrictBackgroundStatus()");
    }

    public boolean isActiveNetworkMetered() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#isActiveNetworkMetered()");
    }

    public boolean isDefaultNetworkActive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#isDefaultNetworkActive()");
    }

    public static boolean isNetworkTypeValid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#isNetworkTypeValid(int)");
    }

    public void registerBestMatchingNetworkCallback(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#registerBestMatchingNetworkCallback(android.net.NetworkRequest,android.net.ConnectivityManager$NetworkCallback,android.os.Handler)");
    }

    public void registerDefaultNetworkCallback(com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#registerDefaultNetworkCallback(android.net.ConnectivityManager$NetworkCallback)");
    }

    public void registerDefaultNetworkCallback(com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#registerDefaultNetworkCallback(android.net.ConnectivityManager$NetworkCallback,android.os.Handler)");
    }

    public void registerNetworkCallback(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#registerNetworkCallback(android.net.NetworkRequest,android.app.PendingIntent)");
    }

    public void registerNetworkCallback(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#registerNetworkCallback(android.net.NetworkRequest,android.net.ConnectivityManager$NetworkCallback)");
    }

    public void registerNetworkCallback(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#registerNetworkCallback(android.net.NetworkRequest,android.net.ConnectivityManager$NetworkCallback,android.os.Handler)");
    }

    public void releaseNetworkRequest(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#releaseNetworkRequest(android.app.PendingIntent)");
    }

    public void removeDefaultNetworkActiveListener(com.micklab.dcg.wrapper.android.net.ConnectivityManager.OnNetworkActiveListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#removeDefaultNetworkActiveListener(android.net.ConnectivityManager$OnNetworkActiveListener)");
    }

    public void reportBadNetwork(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#reportBadNetwork(android.net.Network)");
    }

    public void reportNetworkConnectivity(com.micklab.dcg.wrapper.android.net.Network arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#reportNetworkConnectivity(android.net.Network,boolean)");
    }

    public boolean requestBandwidthUpdate(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#requestBandwidthUpdate(android.net.Network)");
    }

    public void requestNetwork(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#requestNetwork(android.net.NetworkRequest,android.app.PendingIntent)");
    }

    public void requestNetwork(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#requestNetwork(android.net.NetworkRequest,android.net.ConnectivityManager$NetworkCallback)");
    }

    public void requestNetwork(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#requestNetwork(android.net.NetworkRequest,android.net.ConnectivityManager$NetworkCallback,int)");
    }

    public void requestNetwork(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#requestNetwork(android.net.NetworkRequest,android.net.ConnectivityManager$NetworkCallback,android.os.Handler)");
    }

    public void requestNetwork(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#requestNetwork(android.net.NetworkRequest,android.net.ConnectivityManager$NetworkCallback,android.os.Handler,int)");
    }

    public void setNetworkPreference(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#setNetworkPreference(int)");
    }

    public static boolean setProcessDefaultNetwork(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#setProcessDefaultNetwork(android.net.Network)");
    }

    public void unregisterNetworkCallback(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#unregisterNetworkCallback(android.app.PendingIntent)");
    }

    public void unregisterNetworkCallback(com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager#unregisterNetworkCallback(android.net.ConnectivityManager$NetworkCallback)");
    }


    public static final class NetworkCallback {
        private final android.net.ConnectivityManager.NetworkCallback real;

        public NetworkCallback(android.net.ConnectivityManager.NetworkCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback wrap(android.net.ConnectivityManager.NetworkCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ConnectivityManager.NetworkCallback(real);
        }

        public android.net.ConnectivityManager.NetworkCallback unwrap() {
            return real;
        }

        public NetworkCallback() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#android.net.ConnectivityManager$NetworkCallback()");
        }

        public NetworkCallback(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#android.net.ConnectivityManager$NetworkCallback(int)");
        }

        public void onAvailable(com.micklab.dcg.wrapper.android.net.Network arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#onAvailable(android.net.Network)");
        }

        public void onBlockedStatusChanged(com.micklab.dcg.wrapper.android.net.Network arg0, boolean arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#onBlockedStatusChanged(android.net.Network,boolean)");
        }

        public void onCapabilitiesChanged(com.micklab.dcg.wrapper.android.net.Network arg0, com.micklab.dcg.wrapper.android.net.NetworkCapabilities arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#onCapabilitiesChanged(android.net.Network,android.net.NetworkCapabilities)");
        }

        public void onLinkPropertiesChanged(com.micklab.dcg.wrapper.android.net.Network arg0, com.micklab.dcg.wrapper.android.net.LinkProperties arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#onLinkPropertiesChanged(android.net.Network,android.net.LinkProperties)");
        }

        public void onLosing(com.micklab.dcg.wrapper.android.net.Network arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#onLosing(android.net.Network,int)");
        }

        public void onLost(com.micklab.dcg.wrapper.android.net.Network arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#onLost(android.net.Network)");
        }

        public void onUnavailable() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$NetworkCallback#onUnavailable()");
        }


    }
    public static final class OnNetworkActiveListener {
        private final android.net.ConnectivityManager.OnNetworkActiveListener real;

        public OnNetworkActiveListener(android.net.ConnectivityManager.OnNetworkActiveListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ConnectivityManager.OnNetworkActiveListener wrap(android.net.ConnectivityManager.OnNetworkActiveListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ConnectivityManager.OnNetworkActiveListener(real);
        }

        public android.net.ConnectivityManager.OnNetworkActiveListener unwrap() {
            return real;
        }

        public void onNetworkActive() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityManager$OnNetworkActiveListener#onNetworkActive()");
        }

    }
}
