// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ProfilingResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProfilingResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ProfilingResult wrap(android.os.ProfilingResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ProfilingResult(real, (__DcgwBridgeToken) null);
    }

    public android.os.ProfilingResult getReal() {
        return (android.os.ProfilingResult) real;
    }

    public android.os.ProfilingResult unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingResult#describeContents()");
    }

    public int getErrorCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingResult#getErrorCode()");
    }

    public java.lang.String getErrorMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingResult#getErrorMessage()");
    }

    public java.lang.String getResultFilePath() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingResult#getResultFilePath()");
    }

    public java.lang.String getTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingResult#getTag()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ProfilingResult#writeToParcel(android.os.Parcel,int)");
    }


}
