// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMetadataMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioMetadataMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMetadataMap wrap(android.media.AudioMetadataMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMetadataMap(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioMetadataMap getReal() {
        return (android.media.AudioMetadataMap) real;
    }

    public android.media.AudioMetadataMap unwrap() {
        return getReal();
    }

}
