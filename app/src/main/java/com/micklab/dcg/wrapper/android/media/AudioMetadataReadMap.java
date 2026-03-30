// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMetadataReadMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioMetadataReadMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadataReadMap wrap(android.media.AudioMetadataReadMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadataReadMap(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioMetadataReadMap getReal() {
        return (android.media.AudioMetadataReadMap) real;
    }

    public android.media.AudioMetadataReadMap unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.AudioMetadataMap dup() {
        return com.micklab.dcg.wrapper.android.media.AudioMetadataMap.wrap(((android.media.AudioMetadataReadMap) real).dup());
    }

    public int size() {
        return ((android.media.AudioMetadataReadMap) real).size();
    }

}
