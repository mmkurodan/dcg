// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMetadata {
    private final android.media.AudioMetadata real;

    public AudioMetadata(android.media.AudioMetadata real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadata wrap(android.media.AudioMetadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadata(real);
    }

    public android.media.AudioMetadata unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadataMap createMap() {
        return com.micklab.dcg.wrapper.android.media.AudioMetadataMap.wrap(android.media.AudioMetadata.createMap());
    }

    public static final class Format {
        private final android.media.AudioMetadata.Format real;

        public Format(android.media.AudioMetadata.Format real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioMetadata.Format wrap(android.media.AudioMetadata.Format real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadata.Format(real);
        }

        public android.media.AudioMetadata.Format unwrap() {
            return real;
        }


    }
    public static final class Key {
        private final android.media.AudioMetadata.Key real;

        public Key(android.media.AudioMetadata.Key real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioMetadata.Key wrap(android.media.AudioMetadata.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadata.Key(real);
        }

        public android.media.AudioMetadata.Key unwrap() {
            return real;
        }

        public java.lang.String getName() {
            return real.getName();
        }

    }
}
