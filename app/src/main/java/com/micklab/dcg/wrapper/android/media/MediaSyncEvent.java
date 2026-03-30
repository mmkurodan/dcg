// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSyncEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaSyncEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSyncEvent wrap(android.media.MediaSyncEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSyncEvent(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaSyncEvent getReal() {
        return (android.media.MediaSyncEvent) real;
    }

    public android.media.MediaSyncEvent unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSyncEvent createEvent(int arg0) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaSyncEvent.wrap(android.media.MediaSyncEvent.createEvent(arg0));
    }

    public int describeContents() {
        return ((android.media.MediaSyncEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.MediaSyncEvent) real).equals(arg0);
    }

    public int getAudioSessionId() {
        return ((android.media.MediaSyncEvent) real).getAudioSessionId();
    }

    public int getType() {
        return ((android.media.MediaSyncEvent) real).getType();
    }

    public int hashCode() {
        return ((android.media.MediaSyncEvent) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.media.MediaSyncEvent setAudioSessionId(int arg0) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaSyncEvent.wrap(((android.media.MediaSyncEvent) real).setAudioSessionId(arg0));
    }

    public java.lang.String toString() {
        return ((android.media.MediaSyncEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.MediaSyncEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SYNC_EVENT_NONE = android.media.MediaSyncEvent.SYNC_EVENT_NONE;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = android.media.MediaSyncEvent.SYNC_EVENT_PRESENTATION_COMPLETE;

}
