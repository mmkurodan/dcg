// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCommunicationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaCommunicationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCommunicationManager wrap(android.media.MediaCommunicationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCommunicationManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaCommunicationManager getReal() {
        return (android.media.MediaCommunicationManager) real;
    }

    public android.media.MediaCommunicationManager unwrap() {
        return getReal();
    }

    public int getVersion() {
        return ((android.media.MediaCommunicationManager) real).getVersion();
    }

}
