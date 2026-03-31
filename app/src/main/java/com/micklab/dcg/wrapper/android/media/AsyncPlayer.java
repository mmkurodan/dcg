// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AsyncPlayer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AsyncPlayer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AsyncPlayer wrap(android.media.AsyncPlayer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AsyncPlayer(real, (__DcgwBridgeToken) null);
    }

    public android.media.AsyncPlayer getReal() {
        return (android.media.AsyncPlayer) real;
    }

    public android.media.AsyncPlayer unwrap() {
        return getReal();
    }

    public AsyncPlayer(java.lang.String arg0) {
        this(new android.media.AsyncPlayer(arg0), (__DcgwBridgeToken) null);
    }

    public void play(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, boolean arg2, com.micklab.dcg.wrapper.android.media.AudioAttributes arg3) throws java.lang.IllegalArgumentException {
        ((android.media.AsyncPlayer) real).play(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void play(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, boolean arg2, int arg3) {
        ((android.media.AsyncPlayer) real).play(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void stop() {
        ((android.media.AsyncPlayer) real).stop();
    }

}
