// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class SyncNotedAppOp {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncNotedAppOp(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.SyncNotedAppOp wrap(android.app.SyncNotedAppOp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.SyncNotedAppOp(real, (__DcgwBridgeToken) null);
    }

    public android.app.SyncNotedAppOp getReal() {
        return (android.app.SyncNotedAppOp) real;
    }

    public android.app.SyncNotedAppOp unwrap() {
        return getReal();
    }

    public SyncNotedAppOp(int arg0, java.lang.String arg1) {
        this(new android.app.SyncNotedAppOp(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.SyncNotedAppOp) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.SyncNotedAppOp) real).equals(arg0);
    }

    public java.lang.String getAttributionTag() {
        return ((android.app.SyncNotedAppOp) real).getAttributionTag();
    }

    public java.lang.String getOp() {
        return ((android.app.SyncNotedAppOp) real).getOp();
    }

    public int hashCode() {
        return ((android.app.SyncNotedAppOp) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.SyncNotedAppOp) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.SyncNotedAppOp) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
