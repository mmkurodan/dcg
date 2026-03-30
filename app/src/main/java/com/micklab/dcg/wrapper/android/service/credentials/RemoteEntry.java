// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class RemoteEntry {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteEntry(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry wrap(android.service.credentials.RemoteEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.RemoteEntry getReal() {
        return (android.service.credentials.RemoteEntry) real;
    }

    public android.service.credentials.RemoteEntry unwrap() {
        return getReal();
    }

    public RemoteEntry(com.micklab.dcg.wrapper.android.app.slice.Slice arg0) {
        this(new android.service.credentials.RemoteEntry(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.RemoteEntry) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(((android.service.credentials.RemoteEntry) real).getSlice());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.RemoteEntry) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
