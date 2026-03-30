// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CreateEntry {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CreateEntry(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CreateEntry wrap(android.service.credentials.CreateEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CreateEntry(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.CreateEntry getReal() {
        return (android.service.credentials.CreateEntry) real;
    }

    public android.service.credentials.CreateEntry unwrap() {
        return getReal();
    }

    public CreateEntry(com.micklab.dcg.wrapper.android.app.slice.Slice arg0) {
        this(new android.service.credentials.CreateEntry(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.CreateEntry) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(((android.service.credentials.CreateEntry) real).getSlice());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.CreateEntry) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
