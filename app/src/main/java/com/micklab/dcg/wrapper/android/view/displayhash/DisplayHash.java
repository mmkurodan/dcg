// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.displayhash;

public final class DisplayHash {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayHash(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.displayhash.DisplayHash wrap(android.view.displayhash.DisplayHash real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.displayhash.DisplayHash(real, (__DcgwBridgeToken) null);
    }

    public android.view.displayhash.DisplayHash getReal() {
        return (android.view.displayhash.DisplayHash) real;
    }

    public android.view.displayhash.DisplayHash unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.displayhash.DisplayHash) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.view.displayhash.DisplayHash) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.displayhash.DisplayHash) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
