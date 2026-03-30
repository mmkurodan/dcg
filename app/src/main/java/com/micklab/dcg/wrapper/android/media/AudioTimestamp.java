// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioTimestamp {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioTimestamp(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioTimestamp wrap(android.media.AudioTimestamp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTimestamp(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioTimestamp getReal() {
        return (android.media.AudioTimestamp) real;
    }

    public android.media.AudioTimestamp unwrap() {
        return getReal();
    }

    public AudioTimestamp() {
        this(new android.media.AudioTimestamp(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.AudioTimestamp) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.media.AudioTimestamp) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioTimestamp) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TIMEBASE_BOOTTIME = android.media.AudioTimestamp.TIMEBASE_BOOTTIME;
    public static final int TIMEBASE_MONOTONIC = android.media.AudioTimestamp.TIMEBASE_MONOTONIC;

}
