// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrinterId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrinterId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrinterId wrap(android.print.PrinterId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterId(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrinterId getReal() {
        return (android.print.PrinterId) real;
    }

    public android.print.PrinterId unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.print.PrinterId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PrinterId) real).equals(arg0);
    }

    public java.lang.String getLocalId() {
        return ((android.print.PrinterId) real).getLocalId();
    }

    public int hashCode() {
        return ((android.print.PrinterId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.print.PrinterId) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PrinterId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
