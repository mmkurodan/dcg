// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AsyncPlayer {
    private final android.media.AsyncPlayer real;

    public AsyncPlayer(android.media.AsyncPlayer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AsyncPlayer wrap(android.media.AsyncPlayer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AsyncPlayer(real);
    }

    public android.media.AsyncPlayer unwrap() {
        return real;
    }

    public AsyncPlayer(java.lang.String arg0) {
        this(new android.media.AsyncPlayer(arg0));
    }

    public void play(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, boolean arg2, int arg3) {
        real.play(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void play(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, boolean arg2, com.micklab.dcg.wrapper.android.media.AudioAttributes arg3) throws java.lang.IllegalArgumentException {
        real.play(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void stop() {
        real.stop();
    }

}
