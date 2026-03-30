// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDataSource {
    private final android.media.MediaDataSource real;

    public MediaDataSource(android.media.MediaDataSource real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDataSource wrap(android.media.MediaDataSource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDataSource(real);
    }

    public android.media.MediaDataSource unwrap() {
        return real;
    }

    public long getSize() throws java.io.IOException {
        return real.getSize();
    }

    public int readAt(long arg0, byte[] arg1, int arg2, int arg3) throws java.io.IOException {
        return real.readAt(arg0, arg1, arg2, arg3);
    }

}
