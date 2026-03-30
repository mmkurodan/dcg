// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.displayhash;

public final class VerifiedDisplayHash {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VerifiedDisplayHash(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash wrap(android.view.displayhash.VerifiedDisplayHash real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash(real, (__DcgwBridgeToken) null);
    }

    public android.view.displayhash.VerifiedDisplayHash getReal() {
        return (android.view.displayhash.VerifiedDisplayHash) real;
    }

    public android.view.displayhash.VerifiedDisplayHash unwrap() {
        return getReal();
    }

    public VerifiedDisplayHash(long arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, java.lang.String arg2, byte[] arg3) {
        this(new android.view.displayhash.VerifiedDisplayHash(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.displayhash.VerifiedDisplayHash) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundsInWindow() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.displayhash.VerifiedDisplayHash) real).getBoundsInWindow());
    }

    public java.lang.String getHashAlgorithm() {
        return ((android.view.displayhash.VerifiedDisplayHash) real).getHashAlgorithm();
    }

    public byte[] getImageHash() {
        return ((android.view.displayhash.VerifiedDisplayHash) real).getImageHash();
    }

    public long getTimeMillis() {
        return ((android.view.displayhash.VerifiedDisplayHash) real).getTimeMillis();
    }

    public java.lang.String toString() {
        return ((android.view.displayhash.VerifiedDisplayHash) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.displayhash.VerifiedDisplayHash) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
