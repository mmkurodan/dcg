// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSyncEvent {
    private final android.media.MediaSyncEvent real;

    public MediaSyncEvent(android.media.MediaSyncEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSyncEvent wrap(android.media.MediaSyncEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSyncEvent(real);
    }

    public android.media.MediaSyncEvent unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSyncEvent createEvent(int arg0) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaSyncEvent.wrap(android.media.MediaSyncEvent.createEvent(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAudioSessionId() {
        return real.getAudioSessionId();
    }

    public int getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public com.micklab.dcg.wrapper.android.media.MediaSyncEvent setAudioSessionId(int arg0) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaSyncEvent.wrap(real.setAudioSessionId(arg0));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int SYNC_EVENT_NONE = android.media.MediaSyncEvent.SYNC_EVENT_NONE;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = android.media.MediaSyncEvent.SYNC_EVENT_PRESENTATION_COMPLETE;

}
