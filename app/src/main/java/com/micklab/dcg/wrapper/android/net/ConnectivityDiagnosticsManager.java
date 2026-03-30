// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class ConnectivityDiagnosticsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConnectivityDiagnosticsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager wrap(android.net.ConnectivityDiagnosticsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager(real, (__DcgwBridgeToken) null);
    }

    public android.net.ConnectivityDiagnosticsManager getReal() {
        return (android.net.ConnectivityDiagnosticsManager) real;
    }

    public android.net.ConnectivityDiagnosticsManager unwrap() {
        return getReal();
    }

    public void registerConnectivityDiagnosticsCallback(com.micklab.dcg.wrapper.android.net.NetworkRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager#registerConnectivityDiagnosticsCallback(android.net.NetworkRequest,java.util.concurrent.Executor,android.net.ConnectivityDiagnosticsManager$ConnectivityDiagnosticsCallback)");
    }

    public void unregisterConnectivityDiagnosticsCallback(com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager#unregisterConnectivityDiagnosticsCallback(android.net.ConnectivityDiagnosticsManager$ConnectivityDiagnosticsCallback)");
    }

    public static final class ConnectivityDiagnosticsCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ConnectivityDiagnosticsCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback wrap(android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback getReal() {
            return (android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback) real;
        }

        public android.net.ConnectivityDiagnosticsManager.ConnectivityDiagnosticsCallback unwrap() {
            return getReal();
        }

        public void onConnectivityReportAvailable(com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.ConnectivityReport arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityDiagnosticsCallback#onConnectivityReportAvailable(android.net.ConnectivityDiagnosticsManager$ConnectivityReport)");
        }

        public void onDataStallSuspected(com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.DataStallReport arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityDiagnosticsCallback#onDataStallSuspected(android.net.ConnectivityDiagnosticsManager$DataStallReport)");
        }

        public void onNetworkConnectivityReported(com.micklab.dcg.wrapper.android.net.Network arg0, boolean arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityDiagnosticsCallback#onNetworkConnectivityReported(android.net.Network,boolean)");
        }

    }
    public static final class ConnectivityReport {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ConnectivityReport(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.ConnectivityReport wrap(android.net.ConnectivityDiagnosticsManager.ConnectivityReport real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.ConnectivityReport(real, (__DcgwBridgeToken) null);
        }

        public android.net.ConnectivityDiagnosticsManager.ConnectivityReport getReal() {
            return (android.net.ConnectivityDiagnosticsManager.ConnectivityReport) real;
        }

        public android.net.ConnectivityDiagnosticsManager.ConnectivityReport unwrap() {
            return getReal();
        }

        public ConnectivityReport(com.micklab.dcg.wrapper.android.net.Network arg0, long arg1, com.micklab.dcg.wrapper.android.net.LinkProperties arg2, com.micklab.dcg.wrapper.android.net.NetworkCapabilities arg3, com.micklab.dcg.wrapper.android.os.PersistableBundle arg4) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#android.net.ConnectivityDiagnosticsManager$ConnectivityReport(android.net.Network,long,android.net.LinkProperties,android.net.NetworkCapabilities,android.os.PersistableBundle)");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#describeContents()");
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#equals(java.lang.Object)");
        }

        public com.micklab.dcg.wrapper.android.os.PersistableBundle getAdditionalInfo() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#getAdditionalInfo()");
        }

        public com.micklab.dcg.wrapper.android.net.LinkProperties getLinkProperties() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#getLinkProperties()");
        }

        public com.micklab.dcg.wrapper.android.net.Network getNetwork() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#getNetwork()");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkCapabilities getNetworkCapabilities() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#getNetworkCapabilities()");
        }

        public long getReportTimestamp() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#getReportTimestamp()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#hashCode()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$ConnectivityReport#writeToParcel(android.os.Parcel,int)");
        }


    }
    public static final class DataStallReport {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DataStallReport(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.DataStallReport wrap(android.net.ConnectivityDiagnosticsManager.DataStallReport real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.ConnectivityDiagnosticsManager.DataStallReport(real, (__DcgwBridgeToken) null);
        }

        public android.net.ConnectivityDiagnosticsManager.DataStallReport getReal() {
            return (android.net.ConnectivityDiagnosticsManager.DataStallReport) real;
        }

        public android.net.ConnectivityDiagnosticsManager.DataStallReport unwrap() {
            return getReal();
        }

        public DataStallReport(com.micklab.dcg.wrapper.android.net.Network arg0, long arg1, int arg2, com.micklab.dcg.wrapper.android.net.LinkProperties arg3, com.micklab.dcg.wrapper.android.net.NetworkCapabilities arg4, com.micklab.dcg.wrapper.android.os.PersistableBundle arg5) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#android.net.ConnectivityDiagnosticsManager$DataStallReport(android.net.Network,long,int,android.net.LinkProperties,android.net.NetworkCapabilities,android.os.PersistableBundle)");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#describeContents()");
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#equals(java.lang.Object)");
        }

        public int getDetectionMethod() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#getDetectionMethod()");
        }

        public com.micklab.dcg.wrapper.android.net.LinkProperties getLinkProperties() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#getLinkProperties()");
        }

        public com.micklab.dcg.wrapper.android.net.Network getNetwork() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#getNetwork()");
        }

        public com.micklab.dcg.wrapper.android.net.NetworkCapabilities getNetworkCapabilities() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#getNetworkCapabilities()");
        }

        public long getReportTimestamp() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#getReportTimestamp()");
        }

        public com.micklab.dcg.wrapper.android.os.PersistableBundle getStallDetails() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#getStallDetails()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#hashCode()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ConnectivityDiagnosticsManager$DataStallReport#writeToParcel(android.os.Parcel,int)");
        }


    }
}
