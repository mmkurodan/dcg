// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class WifiManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager wrap(android.net.wifi.WifiManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.WifiManager getReal() {
        return (android.net.wifi.WifiManager) real;
    }

    public android.net.wifi.WifiManager unwrap() {
        return getReal();
    }

    public void addLocalOnlyConnectionFailureListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#addLocalOnlyConnectionFailureListener(java.util.concurrent.Executor,android.net.wifi.WifiManager$LocalOnlyConnectionFailureListener)");
    }

    public int addNetwork(com.micklab.dcg.wrapper.android.net.wifi.WifiConfiguration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#addNetwork(android.net.wifi.WifiConfiguration)");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.WifiManager.AddNetworkResult addNetworkPrivileged(com.micklab.dcg.wrapper.android.net.wifi.WifiConfiguration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#addNetworkPrivileged(android.net.wifi.WifiConfiguration)");
    }

    public void addOrUpdatePasspointConfiguration(com.micklab.dcg.wrapper.android.net.wifi.hotspot2.PasspointConfiguration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#addOrUpdatePasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration)");
    }

    public void addSuggestionConnectionStatusListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionConnectionStatusListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#addSuggestionConnectionStatusListener(java.util.concurrent.Executor,android.net.wifi.WifiManager$SuggestionConnectionStatusListener)");
    }

    public void addSuggestionUserApprovalStatusListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#addSuggestionUserApprovalStatusListener(java.util.concurrent.Executor,android.net.wifi.WifiManager$SuggestionUserApprovalStatusListener)");
    }

    public void addWifiStateChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiStateChangedListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#addWifiStateChangedListener(java.util.concurrent.Executor,android.net.wifi.WifiManager$WifiStateChangedListener)");
    }

    public void allowAutojoinGlobal(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#allowAutojoinGlobal(boolean)");
    }

    public int calculateSignalLevel(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#calculateSignalLevel(int)");
    }

    public static int calculateSignalLevel(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#calculateSignalLevel(int,int)");
    }

    public void cancelWps(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WpsCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#cancelWps(android.net.wifi.WifiManager$WpsCallback)");
    }

    public static int compareSignalLevel(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#compareSignalLevel(int,int)");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.WifiManager.MulticastLock createMulticastLock(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#createMulticastLock(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiLock createWifiLock(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#createWifiLock(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiLock createWifiLock(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#createWifiLock(int,java.lang.String)");
    }

    public boolean disableNetwork(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#disableNetwork(int)");
    }

    public void disallowCurrentSuggestedNetwork(com.micklab.dcg.wrapper.android.net.wifi.BlockingOption arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#disallowCurrentSuggestedNetwork(android.net.wifi.BlockingOption)");
    }

    public boolean disconnect() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#disconnect()");
    }

    public boolean enableNetwork(int arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#enableNetwork(int,boolean)");
    }

    public void flushPasspointAnqpCache() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#flushPasspointAnqpCache()");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.WifiInfo getConnectionInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#getConnectionInfo()");
    }

    public com.micklab.dcg.wrapper.android.net.DhcpInfo getDhcpInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#getDhcpInfo()");
    }

    public int getMaxNumberOfChannelsPerNetworkSpecifierRequest() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#getMaxNumberOfChannelsPerNetworkSpecifierRequest()");
    }

    public int getMaxNumberOfNetworkSuggestionsPerApp() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#getMaxNumberOfNetworkSuggestionsPerApp()");
    }

    public int getMaxSignalLevel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#getMaxSignalLevel()");
    }

    public int getStaConcurrencyForMultiInternetMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#getStaConcurrencyForMultiInternetMode()");
    }

    public int getWifiState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#getWifiState()");
    }

    public boolean is24GHzBandSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#is24GHzBandSupported()");
    }

    public boolean is5GHzBandSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#is5GHzBandSupported()");
    }

    public boolean is60GHzBandSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#is60GHzBandSupported()");
    }

    public boolean is6GHzBandSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#is6GHzBandSupported()");
    }

    public boolean isAggressiveRoamingModeSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isAggressiveRoamingModeSupported()");
    }

    public boolean isAutoWakeupEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isAutoWakeupEnabled()");
    }

    public boolean isBridgedApConcurrencySupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isBridgedApConcurrencySupported()");
    }

    public boolean isCarrierNetworkOffloadEnabled(int arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isCarrierNetworkOffloadEnabled(int,boolean)");
    }

    public boolean isD2dSupportedWhenInfraStaDisabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isD2dSupportedWhenInfraStaDisabled()");
    }

    public boolean isDecoratedIdentitySupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isDecoratedIdentitySupported()");
    }

    public boolean isDeviceToApRttSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isDeviceToApRttSupported()");
    }

    public boolean isDualBandSimultaneousSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isDualBandSimultaneousSupported()");
    }

    public boolean isEasyConnectDppAkmSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isEasyConnectDppAkmSupported()");
    }

    public boolean isEasyConnectEnrolleeResponderModeSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isEasyConnectEnrolleeResponderModeSupported()");
    }

    public boolean isEasyConnectSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isEasyConnectSupported()");
    }

    public boolean isEnhancedOpenSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isEnhancedOpenSupported()");
    }

    public boolean isEnhancedPowerReportingSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isEnhancedPowerReportingSupported()");
    }

    public boolean isMakeBeforeBreakWifiSwitchingSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isMakeBeforeBreakWifiSwitchingSupported()");
    }

    public boolean isP2pSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isP2pSupported()");
    }

    public boolean isPasspointTermsAndConditionsSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isPasspointTermsAndConditionsSupported()");
    }

    public boolean isPreferredNetworkOffloadSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isPreferredNetworkOffloadSupported()");
    }

    public boolean isScanAlwaysAvailable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isScanAlwaysAvailable()");
    }

    public boolean isScanThrottleEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isScanThrottleEnabled()");
    }

    public boolean isStaApConcurrencySupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isStaApConcurrencySupported()");
    }

    public boolean isStaBridgedApConcurrencySupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isStaBridgedApConcurrencySupported()");
    }

    public boolean isStaConcurrencyForLocalOnlyConnectionsSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isStaConcurrencyForLocalOnlyConnectionsSupported()");
    }

    public boolean isStaConcurrencyForMultiInternetSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isStaConcurrencyForMultiInternetSupported()");
    }

    public boolean isTdlsSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isTdlsSupported()");
    }

    public boolean isTidToLinkMappingNegotiationSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isTidToLinkMappingNegotiationSupported()");
    }

    public boolean isTlsMinimumVersionSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isTlsMinimumVersionSupported()");
    }

    public boolean isTlsV13Supported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isTlsV13Supported()");
    }

    public boolean isTrustOnFirstUseSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isTrustOnFirstUseSupported()");
    }

    public boolean isWapiSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWapiSupported()");
    }

    public boolean isWepSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWepSupported()");
    }

    public boolean isWifiDisplayR2Supported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWifiDisplayR2Supported()");
    }

    public boolean isWifiEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWifiEnabled()");
    }

    public boolean isWifiPasspointEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWifiPasspointEnabled()");
    }

    public boolean isWifiStandardSupported(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWifiStandardSupported(int)");
    }

    public boolean isWpa3SaeH2eSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWpa3SaeH2eSupported()");
    }

    public boolean isWpa3SaePublicKeySupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWpa3SaePublicKeySupported()");
    }

    public boolean isWpa3SaeSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWpa3SaeSupported()");
    }

    public boolean isWpa3SuiteBSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWpa3SuiteBSupported()");
    }

    public boolean isWpaPersonalSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#isWpaPersonalSupported()");
    }

    public boolean pingSupplicant() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#pingSupplicant()");
    }

    public void querySendDhcpHostnameRestriction(java.util.concurrent.Executor arg0, java.util.function.IntConsumer arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#querySendDhcpHostnameRestriction(java.util.concurrent.Executor,java.util.function.IntConsumer)");
    }

    public boolean reassociate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#reassociate()");
    }

    public boolean reconnect() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#reconnect()");
    }

    public void registerScanResultsCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.ScanResultsCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#registerScanResultsCallback(java.util.concurrent.Executor,android.net.wifi.WifiManager$ScanResultsCallback)");
    }

    public void registerSubsystemRestartTrackingCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SubsystemRestartTrackingCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#registerSubsystemRestartTrackingCallback(java.util.concurrent.Executor,android.net.wifi.WifiManager$SubsystemRestartTrackingCallback)");
    }

    public void removeLocalOnlyConnectionFailureListener(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removeLocalOnlyConnectionFailureListener(android.net.wifi.WifiManager$LocalOnlyConnectionFailureListener)");
    }

    public boolean removeNetwork(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removeNetwork(int)");
    }

    public boolean removeNonCallerConfiguredNetworks() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removeNonCallerConfiguredNetworks()");
    }

    public void removePasspointConfiguration(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removePasspointConfiguration(java.lang.String)");
    }

    public void removePerSsidRoamingMode(com.micklab.dcg.wrapper.android.net.wifi.WifiSsid arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removePerSsidRoamingMode(android.net.wifi.WifiSsid)");
    }

    public void removeSuggestionConnectionStatusListener(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionConnectionStatusListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removeSuggestionConnectionStatusListener(android.net.wifi.WifiManager$SuggestionConnectionStatusListener)");
    }

    public void removeSuggestionUserApprovalStatusListener(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removeSuggestionUserApprovalStatusListener(android.net.wifi.WifiManager$SuggestionUserApprovalStatusListener)");
    }

    public void removeWifiStateChangedListener(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiStateChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#removeWifiStateChangedListener(android.net.wifi.WifiManager$WifiStateChangedListener)");
    }

    public boolean saveConfiguration() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#saveConfiguration()");
    }

    public void setPerSsidRoamingMode(com.micklab.dcg.wrapper.android.net.wifi.WifiSsid arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#setPerSsidRoamingMode(android.net.wifi.WifiSsid,int)");
    }

    public void setSendDhcpHostnameRestriction(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#setSendDhcpHostnameRestriction(int)");
    }

    public void setTdlsEnabled(java.net.InetAddress arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#setTdlsEnabled(java.net.InetAddress,boolean)");
    }

    public void setTdlsEnabledWithMacAddress(java.lang.String arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#setTdlsEnabledWithMacAddress(java.lang.String,boolean)");
    }

    public boolean setWifiEnabled(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#setWifiEnabled(boolean)");
    }

    public void startLocalOnlyHotspot(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyHotspotCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#startLocalOnlyHotspot(android.net.wifi.WifiManager$LocalOnlyHotspotCallback,android.os.Handler)");
    }

    public void startLocalOnlyHotspotWithConfiguration(com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyHotspotCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#startLocalOnlyHotspotWithConfiguration(android.net.wifi.SoftApConfiguration,java.util.concurrent.Executor,android.net.wifi.WifiManager$LocalOnlyHotspotCallback)");
    }

    public boolean startScan() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#startScan()");
    }

    public void startWps(com.micklab.dcg.wrapper.android.net.wifi.WpsInfo arg0, com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WpsCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#startWps(android.net.wifi.WpsInfo,android.net.wifi.WifiManager$WpsCallback)");
    }

    public void unregisterScanResultsCallback(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.ScanResultsCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#unregisterScanResultsCallback(android.net.wifi.WifiManager$ScanResultsCallback)");
    }

    public void unregisterSubsystemRestartTrackingCallback(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SubsystemRestartTrackingCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#unregisterSubsystemRestartTrackingCallback(android.net.wifi.WifiManager$SubsystemRestartTrackingCallback)");
    }

    public int updateNetwork(com.micklab.dcg.wrapper.android.net.wifi.WifiConfiguration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#updateNetwork(android.net.wifi.WifiConfiguration)");
    }

    public boolean validateSoftApConfiguration(com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager#validateSoftApConfiguration(android.net.wifi.SoftApConfiguration)");
    }


    public static final class AddNetworkResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AddNetworkResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.AddNetworkResult wrap(android.net.wifi.WifiManager.AddNetworkResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.AddNetworkResult(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.AddNetworkResult getReal() {
            return (android.net.wifi.WifiManager.AddNetworkResult) real;
        }

        public android.net.wifi.WifiManager.AddNetworkResult unwrap() {
            return getReal();
        }

        public AddNetworkResult(int arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$AddNetworkResult#android.net.wifi.WifiManager$AddNetworkResult(int,int)");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$AddNetworkResult#describeContents()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$AddNetworkResult#writeToParcel(android.os.Parcel,int)");
        }


    }
    public static final class InterfaceCreationImpact {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InterfaceCreationImpact(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.InterfaceCreationImpact wrap(android.net.wifi.WifiManager.InterfaceCreationImpact real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.InterfaceCreationImpact(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.InterfaceCreationImpact getReal() {
            return (android.net.wifi.WifiManager.InterfaceCreationImpact) real;
        }

        public android.net.wifi.WifiManager.InterfaceCreationImpact unwrap() {
            return getReal();
        }

        public InterfaceCreationImpact(int arg0, java.util.Set arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$InterfaceCreationImpact#android.net.wifi.WifiManager$InterfaceCreationImpact(int,java.util.Set)");
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$InterfaceCreationImpact#equals(java.lang.Object)");
        }

        public int getInterfaceType() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$InterfaceCreationImpact#getInterfaceType()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$InterfaceCreationImpact#hashCode()");
        }

    }
    public static final class LocalOnlyConnectionFailureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LocalOnlyConnectionFailureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener wrap(android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener getReal() {
            return (android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener) real;
        }

        public android.net.wifi.WifiManager.LocalOnlyConnectionFailureListener unwrap() {
            return getReal();
        }

        public void onConnectionFailed(com.micklab.dcg.wrapper.android.net.wifi.WifiNetworkSpecifier arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyConnectionFailureListener#onConnectionFailed(android.net.wifi.WifiNetworkSpecifier,int)");
        }

    }
    public static final class LocalOnlyHotspotCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LocalOnlyHotspotCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyHotspotCallback wrap(android.net.wifi.WifiManager.LocalOnlyHotspotCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyHotspotCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.LocalOnlyHotspotCallback getReal() {
            return (android.net.wifi.WifiManager.LocalOnlyHotspotCallback) real;
        }

        public android.net.wifi.WifiManager.LocalOnlyHotspotCallback unwrap() {
            return getReal();
        }

        public LocalOnlyHotspotCallback() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyHotspotCallback#android.net.wifi.WifiManager$LocalOnlyHotspotCallback()");
        }

        public void onFailed(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyHotspotCallback#onFailed(int)");
        }

        public void onStarted(com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyHotspotReservation arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyHotspotCallback#onStarted(android.net.wifi.WifiManager$LocalOnlyHotspotReservation)");
        }

        public void onStopped() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyHotspotCallback#onStopped()");
        }


    }
    public static final class LocalOnlyHotspotReservation {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LocalOnlyHotspotReservation(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyHotspotReservation wrap(android.net.wifi.WifiManager.LocalOnlyHotspotReservation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.LocalOnlyHotspotReservation(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.LocalOnlyHotspotReservation getReal() {
            return (android.net.wifi.WifiManager.LocalOnlyHotspotReservation) real;
        }

        public android.net.wifi.WifiManager.LocalOnlyHotspotReservation unwrap() {
            return getReal();
        }

        public void close() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyHotspotReservation#close()");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.SoftApConfiguration getSoftApConfiguration() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyHotspotReservation#getSoftApConfiguration()");
        }

        public com.micklab.dcg.wrapper.android.net.wifi.WifiConfiguration getWifiConfiguration() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$LocalOnlyHotspotReservation#getWifiConfiguration()");
        }


    }
    public static final class MulticastLock {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MulticastLock(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.MulticastLock wrap(android.net.wifi.WifiManager.MulticastLock real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.MulticastLock(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.MulticastLock getReal() {
            return (android.net.wifi.WifiManager.MulticastLock) real;
        }

        public android.net.wifi.WifiManager.MulticastLock unwrap() {
            return getReal();
        }

        public void acquire() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$MulticastLock#acquire()");
        }

        public boolean isHeld() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$MulticastLock#isHeld()");
        }

        public void release() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$MulticastLock#release()");
        }

        public void setReferenceCounted(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$MulticastLock#setReferenceCounted(boolean)");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$MulticastLock#toString()");
        }


    }
    public static final class ScanResultsCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ScanResultsCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.ScanResultsCallback wrap(android.net.wifi.WifiManager.ScanResultsCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.ScanResultsCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.ScanResultsCallback getReal() {
            return (android.net.wifi.WifiManager.ScanResultsCallback) real;
        }

        public android.net.wifi.WifiManager.ScanResultsCallback unwrap() {
            return getReal();
        }

        public void onScanResultsAvailable() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$ScanResultsCallback#onScanResultsAvailable()");
        }

    }
    public static final class SubsystemRestartTrackingCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SubsystemRestartTrackingCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SubsystemRestartTrackingCallback wrap(android.net.wifi.WifiManager.SubsystemRestartTrackingCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SubsystemRestartTrackingCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.SubsystemRestartTrackingCallback getReal() {
            return (android.net.wifi.WifiManager.SubsystemRestartTrackingCallback) real;
        }

        public android.net.wifi.WifiManager.SubsystemRestartTrackingCallback unwrap() {
            return getReal();
        }

        public void onSubsystemRestarted() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$SubsystemRestartTrackingCallback#onSubsystemRestarted()");
        }

        public void onSubsystemRestarting() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$SubsystemRestartTrackingCallback#onSubsystemRestarting()");
        }

    }
    public static final class SuggestionConnectionStatusListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SuggestionConnectionStatusListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionConnectionStatusListener wrap(android.net.wifi.WifiManager.SuggestionConnectionStatusListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionConnectionStatusListener(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.SuggestionConnectionStatusListener getReal() {
            return (android.net.wifi.WifiManager.SuggestionConnectionStatusListener) real;
        }

        public android.net.wifi.WifiManager.SuggestionConnectionStatusListener unwrap() {
            return getReal();
        }

        public void onConnectionStatus(com.micklab.dcg.wrapper.android.net.wifi.WifiNetworkSuggestion arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$SuggestionConnectionStatusListener#onConnectionStatus(android.net.wifi.WifiNetworkSuggestion,int)");
        }

    }
    public static final class SuggestionUserApprovalStatusListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SuggestionUserApprovalStatusListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener wrap(android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener getReal() {
            return (android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener) real;
        }

        public android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener unwrap() {
            return getReal();
        }

        public void onUserApprovalStatusChange(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$SuggestionUserApprovalStatusListener#onUserApprovalStatusChange(int)");
        }

    }
    public static final class WifiLock {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WifiLock(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiLock wrap(android.net.wifi.WifiManager.WifiLock real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiLock(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.WifiLock getReal() {
            return (android.net.wifi.WifiManager.WifiLock) real;
        }

        public android.net.wifi.WifiManager.WifiLock unwrap() {
            return getReal();
        }

        public void acquire() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WifiLock#acquire()");
        }

        public boolean isHeld() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WifiLock#isHeld()");
        }

        public void release() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WifiLock#release()");
        }

        public void setReferenceCounted(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WifiLock#setReferenceCounted(boolean)");
        }

        public void setWorkSource(com.micklab.dcg.wrapper.android.os.WorkSource arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WifiLock#setWorkSource(android.os.WorkSource)");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WifiLock#toString()");
        }


    }
    public static final class WifiStateChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WifiStateChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiStateChangedListener wrap(android.net.wifi.WifiManager.WifiStateChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WifiStateChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.WifiStateChangedListener getReal() {
            return (android.net.wifi.WifiManager.WifiStateChangedListener) real;
        }

        public android.net.wifi.WifiManager.WifiStateChangedListener unwrap() {
            return getReal();
        }

        public void onWifiStateChanged() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WifiStateChangedListener#onWifiStateChanged()");
        }

    }
    public static final class WpsCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WpsCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WpsCallback wrap(android.net.wifi.WifiManager.WpsCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiManager.WpsCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.wifi.WifiManager.WpsCallback getReal() {
            return (android.net.wifi.WifiManager.WpsCallback) real;
        }

        public android.net.wifi.WifiManager.WpsCallback unwrap() {
            return getReal();
        }

        public void onFailed(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WpsCallback#onFailed(int)");
        }

        public void onStarted(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WpsCallback#onStarted(java.lang.String)");
        }

        public void onSucceeded() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiManager$WpsCallback#onSucceeded()");
        }

    }
}
