// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class PeriodicSync {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PeriodicSync(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.PeriodicSync wrap(android.content.PeriodicSync real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.PeriodicSync(real, (__DcgwBridgeToken) null);
    }

    public android.content.PeriodicSync getReal() {
        return (android.content.PeriodicSync) real;
    }

    public android.content.PeriodicSync unwrap() {
        return getReal();
    }

    public PeriodicSync(com.micklab.dcg.wrapper.android.accounts.Account arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, long arg3) {
        this(new android.content.PeriodicSync(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.content.PeriodicSync) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.PeriodicSync) real).equals(arg0);
    }

    public java.lang.String toString() {
        return ((android.content.PeriodicSync) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.PeriodicSync) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
