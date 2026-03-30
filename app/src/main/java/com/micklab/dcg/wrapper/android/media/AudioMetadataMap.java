// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMetadataMap {
    private final android.media.AudioMetadataMap real;

    public AudioMetadataMap(android.media.AudioMetadataMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadataMap wrap(android.media.AudioMetadataMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadataMap(real);
    }

    public android.media.AudioMetadataMap unwrap() {
        return real;
    }

}
