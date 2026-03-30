// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class NetworkScanRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkScanRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.NetworkScanRequest wrap(android.telephony.NetworkScanRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.NetworkScanRequest(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.NetworkScanRequest getReal() {
        return (android.telephony.NetworkScanRequest) real;
    }

    public android.telephony.NetworkScanRequest unwrap() {
        return getReal();
    }

    public NetworkScanRequest(int arg0, android.telephony.RadioAccessSpecifier[] arg1, int arg2, int arg3, boolean arg4, int arg5, java.util.ArrayList arg6) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#android.telephony.NetworkScanRequest(int,[Landroid.telephony.RadioAccessSpecifier;,int,int,boolean,int,java.util.ArrayList)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#equals(java.lang.Object)");
    }

    public boolean getIncrementalResults() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#getIncrementalResults()");
    }

    public int getIncrementalResultsPeriodicity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#getIncrementalResultsPeriodicity()");
    }

    public int getMaxSearchTime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#getMaxSearchTime()");
    }

    public int getScanType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#getScanType()");
    }

    public int getSearchPeriodicity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#getSearchPeriodicity()");
    }

    public android.telephony.RadioAccessSpecifier[] getSpecifiers() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#getSpecifiers()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#hashCode()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScanRequest#writeToParcel(android.os.Parcel,int)");
    }


}
