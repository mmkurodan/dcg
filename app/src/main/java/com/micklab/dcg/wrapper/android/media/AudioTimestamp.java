// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioTimestamp {
    private final android.media.AudioTimestamp real;

    public AudioTimestamp(android.media.AudioTimestamp real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioTimestamp wrap(android.media.AudioTimestamp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioTimestamp(real);
    }

    public android.media.AudioTimestamp unwrap() {
        return real;
    }

    public AudioTimestamp() {
        this(new android.media.AudioTimestamp());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TIMEBASE_BOOTTIME = android.media.AudioTimestamp.TIMEBASE_BOOTTIME;
    public static final int TIMEBASE_MONOTONIC = android.media.AudioTimestamp.TIMEBASE_MONOTONIC;

}
