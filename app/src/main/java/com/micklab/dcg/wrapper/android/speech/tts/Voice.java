// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class Voice {
    private final android.speech.tts.Voice real;

    public Voice(android.speech.tts.Voice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.Voice wrap(android.speech.tts.Voice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.Voice(real);
    }

    public android.speech.tts.Voice unwrap() {
        return real;
    }

    public Voice(java.lang.String arg0, java.util.Locale arg1, int arg2, int arg3, boolean arg4, java.util.Set arg5) {
        this(new android.speech.tts.Voice(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getLatency() {
        return real.getLatency();
    }

    public java.util.Locale getLocale() {
        return real.getLocale();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getQuality() {
        return real.getQuality();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isNetworkConnectionRequired() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.speech.tts.Voice#isNetworkConnectionRequired()");
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int LATENCY_HIGH = android.speech.tts.Voice.LATENCY_HIGH;
    public static final int LATENCY_LOW = android.speech.tts.Voice.LATENCY_LOW;
    public static final int LATENCY_NORMAL = android.speech.tts.Voice.LATENCY_NORMAL;
    public static final int LATENCY_VERY_HIGH = android.speech.tts.Voice.LATENCY_VERY_HIGH;
    public static final int LATENCY_VERY_LOW = android.speech.tts.Voice.LATENCY_VERY_LOW;
    public static final int QUALITY_HIGH = android.speech.tts.Voice.QUALITY_HIGH;
    public static final int QUALITY_LOW = android.speech.tts.Voice.QUALITY_LOW;
    public static final int QUALITY_NORMAL = android.speech.tts.Voice.QUALITY_NORMAL;
    public static final int QUALITY_VERY_HIGH = android.speech.tts.Voice.QUALITY_VERY_HIGH;
    public static final int QUALITY_VERY_LOW = android.speech.tts.Voice.QUALITY_VERY_LOW;

}
