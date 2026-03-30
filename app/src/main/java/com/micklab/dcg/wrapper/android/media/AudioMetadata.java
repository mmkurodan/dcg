// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMetadata {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioMetadata(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadata wrap(android.media.AudioMetadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadata(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioMetadata getReal() {
        return (android.media.AudioMetadata) real;
    }

    public android.media.AudioMetadata unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadataMap createMap() {
        return com.micklab.dcg.wrapper.android.media.AudioMetadataMap.wrap(android.media.AudioMetadata.createMap());
    }

    public static final class Format {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Format(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioMetadata.Format wrap(android.media.AudioMetadata.Format real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadata.Format(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioMetadata.Format getReal() {
            return (android.media.AudioMetadata.Format) real;
        }

        public android.media.AudioMetadata.Format unwrap() {
            return getReal();
        }


    }
    public static final class Key {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Key(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioMetadata.Key wrap(android.media.AudioMetadata.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadata.Key(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioMetadata.Key getReal() {
            return (android.media.AudioMetadata.Key) real;
        }

        public android.media.AudioMetadata.Key unwrap() {
            return getReal();
        }

        public java.lang.String getName() {
            return ((android.media.AudioMetadata.Key) real).getName();
        }

    }
}
