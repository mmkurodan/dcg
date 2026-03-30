// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AsyncNotedAppOp {
    private final android.app.AsyncNotedAppOp real;

    public AsyncNotedAppOp(android.app.AsyncNotedAppOp real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AsyncNotedAppOp wrap(android.app.AsyncNotedAppOp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AsyncNotedAppOp(real);
    }

    public android.app.AsyncNotedAppOp unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getAttributionTag() {
        return real.getAttributionTag();
    }

    public java.lang.String getMessage() {
        return real.getMessage();
    }

    public int getNotingUid() {
        return real.getNotingUid();
    }

    public java.lang.String getOp() {
        return real.getOp();
    }

    public long getTime() {
        return real.getTime();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
