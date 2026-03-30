// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class JetPlayer {
    private final android.media.JetPlayer real;

    public JetPlayer(android.media.JetPlayer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.JetPlayer wrap(android.media.JetPlayer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.JetPlayer(real);
    }

    public android.media.JetPlayer unwrap() {
        return real;
    }

    public boolean clearQueue() {
        return real.clearQueue();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return real.clone();
    }

    public boolean closeJetFile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.JetPlayer#closeJetFile()");
    }

    public static com.micklab.dcg.wrapper.android.media.JetPlayer getJetPlayer() {
        return com.micklab.dcg.wrapper.android.media.JetPlayer.wrap(android.media.JetPlayer.getJetPlayer());
    }

    public static int getMaxTracks() {
        return android.media.JetPlayer.getMaxTracks();
    }

    public boolean loadJetFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.JetPlayer#loadJetFile(java.lang.String)");
    }

    public boolean loadJetFile(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.JetPlayer#loadJetFile(android.content.res.AssetFileDescriptor)");
    }

    public boolean pause() {
        return real.pause();
    }

    public boolean play() {
        return real.play();
    }

    public boolean queueJetSegment(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        return real.queueJetSegment(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public boolean queueJetSegmentMuteArray(int arg0, int arg1, int arg2, int arg3, boolean[] arg4, byte arg5) {
        return real.queueJetSegmentMuteArray(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void release() {
        real.release();
    }

    public void setEventListener(com.micklab.dcg.wrapper.android.media.JetPlayer.OnJetEventListener arg0) {
        real.setEventListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setEventListener(com.micklab.dcg.wrapper.android.media.JetPlayer.OnJetEventListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setEventListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean setMuteArray(boolean[] arg0, boolean arg1) {
        return real.setMuteArray(arg0, arg1);
    }

    public boolean setMuteFlag(int arg0, boolean arg1, boolean arg2) {
        return real.setMuteFlag(arg0, arg1, arg2);
    }

    public boolean setMuteFlags(int arg0, boolean arg1) {
        return real.setMuteFlags(arg0, arg1);
    }

    public boolean triggerClip(int arg0) {
        return real.triggerClip(arg0);
    }

    public static final class OnJetEventListener {
        private final android.media.JetPlayer.OnJetEventListener real;

        public OnJetEventListener(android.media.JetPlayer.OnJetEventListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.JetPlayer.OnJetEventListener wrap(android.media.JetPlayer.OnJetEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.JetPlayer.OnJetEventListener(real);
        }

        public android.media.JetPlayer.OnJetEventListener unwrap() {
            return real;
        }

        public void onJetEvent(com.micklab.dcg.wrapper.android.media.JetPlayer arg0, short arg1, byte arg2, byte arg3, byte arg4, byte arg5) {
            real.onJetEvent(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5);
        }

        public void onJetNumQueuedSegmentUpdate(com.micklab.dcg.wrapper.android.media.JetPlayer arg0, int arg1) {
            real.onJetNumQueuedSegmentUpdate(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onJetPauseUpdate(com.micklab.dcg.wrapper.android.media.JetPlayer arg0, int arg1) {
            real.onJetPauseUpdate(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onJetUserIdUpdate(com.micklab.dcg.wrapper.android.media.JetPlayer arg0, int arg1, int arg2) {
            real.onJetUserIdUpdate(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
