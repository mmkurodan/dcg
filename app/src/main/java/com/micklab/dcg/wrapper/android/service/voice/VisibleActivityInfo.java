// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VisibleActivityInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VisibleActivityInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VisibleActivityInfo wrap(android.service.voice.VisibleActivityInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VisibleActivityInfo(real, (__DcgwBridgeToken) null);
    }

    public android.service.voice.VisibleActivityInfo getReal() {
        return (android.service.voice.VisibleActivityInfo) real;
    }

    public android.service.voice.VisibleActivityInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.voice.VisibleActivityInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.voice.VisibleActivityInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId getActivityId() {
        return com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId.wrap(((android.service.voice.VisibleActivityInfo) real).getActivityId());
    }

    public int hashCode() {
        return ((android.service.voice.VisibleActivityInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.service.voice.VisibleActivityInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.voice.VisibleActivityInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
