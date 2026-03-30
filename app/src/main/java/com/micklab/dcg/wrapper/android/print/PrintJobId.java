// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintJobId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintJobId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintJobId wrap(android.print.PrintJobId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJobId(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrintJobId getReal() {
        return (android.print.PrintJobId) real;
    }

    public android.print.PrintJobId unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.print.PrintJobId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PrintJobId) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.print.PrintJobId) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PrintJobId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
