// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class Action {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Action(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.Action wrap(android.service.credentials.Action real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.Action(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.Action getReal() {
        return (android.service.credentials.Action) real;
    }

    public android.service.credentials.Action unwrap() {
        return getReal();
    }

    public Action(com.micklab.dcg.wrapper.android.app.slice.Slice arg0) {
        this(new android.service.credentials.Action(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.Action) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(((android.service.credentials.Action) real).getSlice());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.Action) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
