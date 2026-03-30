// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class UnsafeStateException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnsafeStateException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.UnsafeStateException wrap(android.app.admin.UnsafeStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.UnsafeStateException(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.UnsafeStateException getReal() {
        return (android.app.admin.UnsafeStateException) real;
    }

    public android.app.admin.UnsafeStateException unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.admin.UnsafeStateException) real).describeContents();
    }

    public java.lang.String getMessage() {
        return ((android.app.admin.UnsafeStateException) real).getMessage();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.UnsafeStateException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
