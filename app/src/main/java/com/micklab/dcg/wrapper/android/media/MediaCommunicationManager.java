// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCommunicationManager {
    private final android.media.MediaCommunicationManager real;

    public MediaCommunicationManager(android.media.MediaCommunicationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCommunicationManager wrap(android.media.MediaCommunicationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCommunicationManager(real);
    }

    public android.media.MediaCommunicationManager unwrap() {
        return real;
    }

    public int getVersion() {
        return real.getVersion();
    }

}
