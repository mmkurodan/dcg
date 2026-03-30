// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class SoundPool {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SoundPool(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.SoundPool wrap(android.media.SoundPool real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.SoundPool(real, (__DcgwBridgeToken) null);
    }

    public android.media.SoundPool getReal() {
        return (android.media.SoundPool) real;
    }

    public android.media.SoundPool unwrap() {
        return getReal();
    }

    public SoundPool(int arg0, int arg1, int arg2) {
        this(new android.media.SoundPool(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public void autoPause() {
        ((android.media.SoundPool) real).autoPause();
    }

    public void autoResume() {
        ((android.media.SoundPool) real).autoResume();
    }

    public int load(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0, int arg1) {
        return ((android.media.SoundPool) real).load(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int load(java.lang.String arg0, int arg1) {
        return ((android.media.SoundPool) real).load(arg0, arg1);
    }

    public int load(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        return ((android.media.SoundPool) real).load(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public int load(java.io.FileDescriptor arg0, long arg1, long arg2, int arg3) {
        return ((android.media.SoundPool) real).load(arg0, arg1, arg2, arg3);
    }

    public void pause(int arg0) {
        ((android.media.SoundPool) real).pause(arg0);
    }

    public int play(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5) {
        return ((android.media.SoundPool) real).play(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void release() {
        ((android.media.SoundPool) real).release();
    }

    public void resume(int arg0) {
        ((android.media.SoundPool) real).resume(arg0);
    }

    public void setLoop(int arg0, int arg1) {
        ((android.media.SoundPool) real).setLoop(arg0, arg1);
    }

    public void setOnLoadCompleteListener(com.micklab.dcg.wrapper.android.media.SoundPool.OnLoadCompleteListener arg0) {
        ((android.media.SoundPool) real).setOnLoadCompleteListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPriority(int arg0, int arg1) {
        ((android.media.SoundPool) real).setPriority(arg0, arg1);
    }

    public void setRate(int arg0, float arg1) {
        ((android.media.SoundPool) real).setRate(arg0, arg1);
    }

    public void setVolume(int arg0, float arg1, float arg2) {
        ((android.media.SoundPool) real).setVolume(arg0, arg1, arg2);
    }

    public void stop(int arg0) {
        ((android.media.SoundPool) real).stop(arg0);
    }

    public boolean unload(int arg0) {
        return ((android.media.SoundPool) real).unload(arg0);
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.SoundPool.Builder wrap(android.media.SoundPool.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.SoundPool.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.SoundPool.Builder getReal() {
            return (android.media.SoundPool.Builder) real;
        }

        public android.media.SoundPool.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.SoundPool.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool build() {
            return com.micklab.dcg.wrapper.android.media.SoundPool.wrap(((android.media.SoundPool.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(((android.media.SoundPool.Builder) real).setAudioAttributes(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setAudioSessionId(int arg0) {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(((android.media.SoundPool.Builder) real).setAudioSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(((android.media.SoundPool.Builder) real).setContext(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setMaxStreams(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(((android.media.SoundPool.Builder) real).setMaxStreams(arg0));
        }

    }
    public static final class OnLoadCompleteListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnLoadCompleteListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.SoundPool.OnLoadCompleteListener wrap(android.media.SoundPool.OnLoadCompleteListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.SoundPool.OnLoadCompleteListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.SoundPool.OnLoadCompleteListener getReal() {
            return (android.media.SoundPool.OnLoadCompleteListener) real;
        }

        public android.media.SoundPool.OnLoadCompleteListener unwrap() {
            return getReal();
        }

        public void onLoadComplete(com.micklab.dcg.wrapper.android.media.SoundPool arg0, int arg1, int arg2) {
            ((android.media.SoundPool.OnLoadCompleteListener) real).onLoadComplete(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
