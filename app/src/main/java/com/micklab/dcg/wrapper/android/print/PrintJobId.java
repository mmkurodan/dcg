// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintJobId {
    private final android.print.PrintJobId real;

    public PrintJobId(android.print.PrintJobId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintJobId wrap(android.print.PrintJobId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJobId(real);
    }

    public android.print.PrintJobId unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
