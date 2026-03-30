// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class SyncNotedAppOp {
    private final android.app.SyncNotedAppOp real;

    public SyncNotedAppOp(android.app.SyncNotedAppOp real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.SyncNotedAppOp wrap(android.app.SyncNotedAppOp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.SyncNotedAppOp(real);
    }

    public android.app.SyncNotedAppOp unwrap() {
        return real;
    }

    public SyncNotedAppOp(int arg0, java.lang.String arg1) {
        this(new android.app.SyncNotedAppOp(arg0, arg1));
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

    public java.lang.String getOp() {
        return real.getOp();
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
