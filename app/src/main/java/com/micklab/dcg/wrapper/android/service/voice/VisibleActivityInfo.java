// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VisibleActivityInfo {
    private final android.service.voice.VisibleActivityInfo real;

    public VisibleActivityInfo(android.service.voice.VisibleActivityInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VisibleActivityInfo wrap(android.service.voice.VisibleActivityInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VisibleActivityInfo(real);
    }

    public android.service.voice.VisibleActivityInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId getActivityId() {
        return com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId.wrap(real.getActivityId());
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


}
