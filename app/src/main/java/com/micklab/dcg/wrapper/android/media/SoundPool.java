// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class SoundPool {
    private final android.media.SoundPool real;

    public SoundPool(android.media.SoundPool real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.SoundPool wrap(android.media.SoundPool real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.SoundPool(real);
    }

    public android.media.SoundPool unwrap() {
        return real;
    }

    public SoundPool(int arg0, int arg1, int arg2) {
        this(new android.media.SoundPool(arg0, arg1, arg2));
    }

    public void autoPause() {
        real.autoPause();
    }

    public void autoResume() {
        real.autoResume();
    }

    public int load(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0, int arg1) {
        return real.load(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int load(java.lang.String arg0, int arg1) {
        return real.load(arg0, arg1);
    }

    public int load(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        return real.load(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public int load(java.io.FileDescriptor arg0, long arg1, long arg2, int arg3) {
        return real.load(arg0, arg1, arg2, arg3);
    }

    public void pause(int arg0) {
        real.pause(arg0);
    }

    public int play(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5) {
        return real.play(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void release() {
        real.release();
    }

    public void resume(int arg0) {
        real.resume(arg0);
    }

    public void setLoop(int arg0, int arg1) {
        real.setLoop(arg0, arg1);
    }

    public void setOnLoadCompleteListener(com.micklab.dcg.wrapper.android.media.SoundPool.OnLoadCompleteListener arg0) {
        real.setOnLoadCompleteListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPriority(int arg0, int arg1) {
        real.setPriority(arg0, arg1);
    }

    public void setRate(int arg0, float arg1) {
        real.setRate(arg0, arg1);
    }

    public void setVolume(int arg0, float arg1, float arg2) {
        real.setVolume(arg0, arg1, arg2);
    }

    public void stop(int arg0) {
        real.stop(arg0);
    }

    public boolean unload(int arg0) {
        return real.unload(arg0);
    }

    public static final class Builder {
        private final android.media.SoundPool.Builder real;

        public Builder(android.media.SoundPool.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.SoundPool.Builder wrap(android.media.SoundPool.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.SoundPool.Builder(real);
        }

        public android.media.SoundPool.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.SoundPool.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool build() {
            return com.micklab.dcg.wrapper.android.media.SoundPool.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(real.setAudioAttributes(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setAudioSessionId(int arg0) {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(real.setAudioSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(real.setContext(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.SoundPool.Builder setMaxStreams(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.SoundPool.Builder.wrap(real.setMaxStreams(arg0));
        }

    }
    public static final class OnLoadCompleteListener {
        private final android.media.SoundPool.OnLoadCompleteListener real;

        public OnLoadCompleteListener(android.media.SoundPool.OnLoadCompleteListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.SoundPool.OnLoadCompleteListener wrap(android.media.SoundPool.OnLoadCompleteListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.SoundPool.OnLoadCompleteListener(real);
        }

        public android.media.SoundPool.OnLoadCompleteListener unwrap() {
            return real;
        }

        public void onLoadComplete(com.micklab.dcg.wrapper.android.media.SoundPool arg0, int arg1, int arg2) {
            real.onLoadComplete(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
