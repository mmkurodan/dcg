// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioDescriptor {
    private final android.media.AudioDescriptor real;

    public AudioDescriptor(android.media.AudioDescriptor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioDescriptor wrap(android.media.AudioDescriptor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioDescriptor(real);
    }

    public android.media.AudioDescriptor unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public byte[] getDescriptor() {
        return real.getDescriptor();
    }

    public int getEncapsulationType() {
        return real.getEncapsulationType();
    }

    public int getStandard() {
        return real.getStandard();
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

    public static final int STANDARD_EDID = android.media.AudioDescriptor.STANDARD_EDID;
    public static final int STANDARD_NONE = android.media.AudioDescriptor.STANDARD_NONE;
    public static final int STANDARD_SADB = android.media.AudioDescriptor.STANDARD_SADB;
    public static final int STANDARD_VSADB = android.media.AudioDescriptor.STANDARD_VSADB;

}
