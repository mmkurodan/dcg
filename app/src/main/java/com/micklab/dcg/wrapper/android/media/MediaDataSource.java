// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDataSource {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaDataSource(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDataSource wrap(android.media.MediaDataSource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDataSource(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaDataSource getReal() {
        return (android.media.MediaDataSource) real;
    }

    public android.media.MediaDataSource unwrap() {
        return getReal();
    }

    public long getSize() throws java.io.IOException {
        return ((android.media.MediaDataSource) real).getSize();
    }

    public int readAt(long arg0, byte[] arg1, int arg2, int arg3) throws java.io.IOException {
        return ((android.media.MediaDataSource) real).readAt(arg0, arg1, arg2, arg3);
    }

}
