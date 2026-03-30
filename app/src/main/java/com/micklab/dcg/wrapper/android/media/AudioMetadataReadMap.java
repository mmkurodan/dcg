// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMetadataReadMap {
    private final android.media.AudioMetadataReadMap real;

    public AudioMetadataReadMap(android.media.AudioMetadataReadMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadataReadMap wrap(android.media.AudioMetadataReadMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadataReadMap(real);
    }

    public android.media.AudioMetadataReadMap unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.AudioMetadataMap dup() {
        return com.micklab.dcg.wrapper.android.media.AudioMetadataMap.wrap(real.dup());
    }

    public int size() {
        return real.size();
    }

}
