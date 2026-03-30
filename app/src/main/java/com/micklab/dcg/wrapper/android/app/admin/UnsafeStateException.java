// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class UnsafeStateException {
    private final android.app.admin.UnsafeStateException real;

    public UnsafeStateException(android.app.admin.UnsafeStateException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.UnsafeStateException wrap(android.app.admin.UnsafeStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.UnsafeStateException(real);
    }

    public android.app.admin.UnsafeStateException unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getMessage() {
        return real.getMessage();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
