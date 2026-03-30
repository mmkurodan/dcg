// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AsyncNotedAppOp {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AsyncNotedAppOp(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AsyncNotedAppOp wrap(android.app.AsyncNotedAppOp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AsyncNotedAppOp(real, (__DcgwBridgeToken) null);
    }

    public android.app.AsyncNotedAppOp getReal() {
        return (android.app.AsyncNotedAppOp) real;
    }

    public android.app.AsyncNotedAppOp unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.AsyncNotedAppOp) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.AsyncNotedAppOp) real).equals(arg0);
    }

    public java.lang.String getAttributionTag() {
        return ((android.app.AsyncNotedAppOp) real).getAttributionTag();
    }

    public java.lang.String getMessage() {
        return ((android.app.AsyncNotedAppOp) real).getMessage();
    }

    public int getNotingUid() {
        return ((android.app.AsyncNotedAppOp) real).getNotingUid();
    }

    public java.lang.String getOp() {
        return ((android.app.AsyncNotedAppOp) real).getOp();
    }

    public long getTime() {
        return ((android.app.AsyncNotedAppOp) real).getTime();
    }

    public int hashCode() {
        return ((android.app.AsyncNotedAppOp) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.AsyncNotedAppOp) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.AsyncNotedAppOp) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
