// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioDescriptor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioDescriptor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioDescriptor wrap(android.media.AudioDescriptor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioDescriptor(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioDescriptor getReal() {
        return (android.media.AudioDescriptor) real;
    }

    public android.media.AudioDescriptor unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.AudioDescriptor) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.AudioDescriptor) real).equals(arg0);
    }

    public byte[] getDescriptor() {
        return ((android.media.AudioDescriptor) real).getDescriptor();
    }

    public int getEncapsulationType() {
        return ((android.media.AudioDescriptor) real).getEncapsulationType();
    }

    public int getStandard() {
        return ((android.media.AudioDescriptor) real).getStandard();
    }

    public int hashCode() {
        return ((android.media.AudioDescriptor) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.AudioDescriptor) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioDescriptor) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STANDARD_EDID = android.media.AudioDescriptor.STANDARD_EDID;
    public static final int STANDARD_NONE = android.media.AudioDescriptor.STANDARD_NONE;
    public static final int STANDARD_SADB = android.media.AudioDescriptor.STANDARD_SADB;
    public static final int STANDARD_VSADB = android.media.AudioDescriptor.STANDARD_VSADB;

}
