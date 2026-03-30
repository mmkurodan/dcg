// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrinterId {
    private final android.print.PrinterId real;

    public PrinterId(android.print.PrinterId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrinterId wrap(android.print.PrinterId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterId(real);
    }

    public android.print.PrinterId unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getLocalId() {
        return real.getLocalId();
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
