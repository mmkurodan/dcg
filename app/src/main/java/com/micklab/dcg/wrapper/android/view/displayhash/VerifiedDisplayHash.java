// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.displayhash;

public final class VerifiedDisplayHash {
    private final android.view.displayhash.VerifiedDisplayHash real;

    public VerifiedDisplayHash(android.view.displayhash.VerifiedDisplayHash real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash wrap(android.view.displayhash.VerifiedDisplayHash real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.displayhash.VerifiedDisplayHash(real);
    }

    public android.view.displayhash.VerifiedDisplayHash unwrap() {
        return real;
    }

    public VerifiedDisplayHash(long arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, java.lang.String arg2, byte[] arg3) {
        this(new android.view.displayhash.VerifiedDisplayHash(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBoundsInWindow() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBoundsInWindow());
    }

    public java.lang.String getHashAlgorithm() {
        return real.getHashAlgorithm();
    }

    public byte[] getImageHash() {
        return real.getImageHash();
    }

    public long getTimeMillis() {
        return real.getTimeMillis();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
