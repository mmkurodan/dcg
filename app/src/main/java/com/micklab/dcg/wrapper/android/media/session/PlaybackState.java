// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class PlaybackState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PlaybackState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.PlaybackState wrap(android.media.session.PlaybackState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState(real, (__DcgwBridgeToken) null);
    }

    public android.media.session.PlaybackState getReal() {
        return (android.media.session.PlaybackState) real;
    }

    public android.media.session.PlaybackState unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.session.PlaybackState) real).describeContents();
    }

    public long getActions() {
        return ((android.media.session.PlaybackState) real).getActions();
    }

    public long getActiveQueueItemId() {
        return ((android.media.session.PlaybackState) real).getActiveQueueItemId();
    }

    public long getBufferedPosition() {
        return ((android.media.session.PlaybackState) real).getBufferedPosition();
    }

    public java.lang.CharSequence getErrorMessage() {
        return ((android.media.session.PlaybackState) real).getErrorMessage();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.session.PlaybackState) real).getExtras());
    }

    public long getLastPositionUpdateTime() {
        return ((android.media.session.PlaybackState) real).getLastPositionUpdateTime();
    }

    public float getPlaybackSpeed() {
        return ((android.media.session.PlaybackState) real).getPlaybackSpeed();
    }

    public long getPosition() {
        return ((android.media.session.PlaybackState) real).getPosition();
    }

    public int getState() {
        return ((android.media.session.PlaybackState) real).getState();
    }

    public boolean isActive() {
        return ((android.media.session.PlaybackState) real).isActive();
    }

    public java.lang.String toString() {
        return ((android.media.session.PlaybackState) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.session.PlaybackState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final long ACTION_FAST_FORWARD = android.media.session.PlaybackState.ACTION_FAST_FORWARD;
    public static final long ACTION_PAUSE = android.media.session.PlaybackState.ACTION_PAUSE;
    public static final long ACTION_PLAY = android.media.session.PlaybackState.ACTION_PLAY;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = android.media.session.PlaybackState.ACTION_PLAY_FROM_MEDIA_ID;
    public static final long ACTION_PLAY_FROM_SEARCH = android.media.session.PlaybackState.ACTION_PLAY_FROM_SEARCH;
    public static final long ACTION_PLAY_FROM_URI = android.media.session.PlaybackState.ACTION_PLAY_FROM_URI;
    public static final long ACTION_PLAY_PAUSE = android.media.session.PlaybackState.ACTION_PLAY_PAUSE;
    public static final long ACTION_PREPARE = android.media.session.PlaybackState.ACTION_PREPARE;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = android.media.session.PlaybackState.ACTION_PREPARE_FROM_MEDIA_ID;
    public static final long ACTION_PREPARE_FROM_SEARCH = android.media.session.PlaybackState.ACTION_PREPARE_FROM_SEARCH;
    public static final long ACTION_PREPARE_FROM_URI = android.media.session.PlaybackState.ACTION_PREPARE_FROM_URI;
    public static final long ACTION_REWIND = android.media.session.PlaybackState.ACTION_REWIND;
    public static final long ACTION_SEEK_TO = android.media.session.PlaybackState.ACTION_SEEK_TO;
    public static final long ACTION_SET_PLAYBACK_SPEED = android.media.session.PlaybackState.ACTION_SET_PLAYBACK_SPEED;
    public static final long ACTION_SET_RATING = android.media.session.PlaybackState.ACTION_SET_RATING;
    public static final long ACTION_SKIP_TO_NEXT = android.media.session.PlaybackState.ACTION_SKIP_TO_NEXT;
    public static final long ACTION_SKIP_TO_PREVIOUS = android.media.session.PlaybackState.ACTION_SKIP_TO_PREVIOUS;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = android.media.session.PlaybackState.ACTION_SKIP_TO_QUEUE_ITEM;
    public static final long ACTION_STOP = android.media.session.PlaybackState.ACTION_STOP;
    public static final long PLAYBACK_POSITION_UNKNOWN = android.media.session.PlaybackState.PLAYBACK_POSITION_UNKNOWN;
    public static final int STATE_BUFFERING = android.media.session.PlaybackState.STATE_BUFFERING;
    public static final int STATE_CONNECTING = android.media.session.PlaybackState.STATE_CONNECTING;
    public static final int STATE_ERROR = android.media.session.PlaybackState.STATE_ERROR;
    public static final int STATE_FAST_FORWARDING = android.media.session.PlaybackState.STATE_FAST_FORWARDING;
    public static final int STATE_NONE = android.media.session.PlaybackState.STATE_NONE;
    public static final int STATE_PAUSED = android.media.session.PlaybackState.STATE_PAUSED;
    public static final int STATE_PLAYING = android.media.session.PlaybackState.STATE_PLAYING;
    public static final int STATE_REWINDING = android.media.session.PlaybackState.STATE_REWINDING;
    public static final int STATE_SKIPPING_TO_NEXT = android.media.session.PlaybackState.STATE_SKIPPING_TO_NEXT;
    public static final int STATE_SKIPPING_TO_PREVIOUS = android.media.session.PlaybackState.STATE_SKIPPING_TO_PREVIOUS;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = android.media.session.PlaybackState.STATE_SKIPPING_TO_QUEUE_ITEM;
    public static final int STATE_STOPPED = android.media.session.PlaybackState.STATE_STOPPED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder wrap(android.media.session.PlaybackState.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.PlaybackState.Builder getReal() {
            return (android.media.session.PlaybackState.Builder) real;
        }

        public android.media.session.PlaybackState.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.session.PlaybackState.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.media.session.PlaybackState arg0) {
            this(new android.media.session.PlaybackState.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder addCustomAction(com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).addCustomAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder addCustomAction(java.lang.String arg0, java.lang.String arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).addCustomAction(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState build() {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.wrap(((android.media.session.PlaybackState.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setActions(long arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).setActions(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setActiveQueueItemId(long arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).setActiveQueueItemId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setBufferedPosition(long arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).setBufferedPosition(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setErrorMessage(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).setErrorMessage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setState(int arg0, long arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).setState(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setState(int arg0, long arg1, float arg2, long arg3) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(((android.media.session.PlaybackState.Builder) real).setState(arg0, arg1, arg2, arg3));
        }

    }
    public static final class CustomAction {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CustomAction(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction wrap(android.media.session.PlaybackState.CustomAction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.PlaybackState.CustomAction getReal() {
            return (android.media.session.PlaybackState.CustomAction) real;
        }

        public android.media.session.PlaybackState.CustomAction unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.media.session.PlaybackState.CustomAction) real).describeContents();
        }

        public java.lang.String getAction() {
            return ((android.media.session.PlaybackState.CustomAction) real).getAction();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.session.PlaybackState.CustomAction) real).getExtras());
        }

        public int getIcon() {
            return ((android.media.session.PlaybackState.CustomAction) real).getIcon();
        }

        public java.lang.CharSequence getName() {
            return ((android.media.session.PlaybackState.CustomAction) real).getName();
        }

        public java.lang.String toString() {
            return ((android.media.session.PlaybackState.CustomAction) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.session.PlaybackState.CustomAction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder wrap(android.media.session.PlaybackState.CustomAction.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.media.session.PlaybackState.CustomAction.Builder getReal() {
                return (android.media.session.PlaybackState.CustomAction.Builder) real;
            }

            public android.media.session.PlaybackState.CustomAction.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.String arg0, java.lang.CharSequence arg1, int arg2) {
                this(new android.media.session.PlaybackState.CustomAction.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction build() {
                return com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.wrap(((android.media.session.PlaybackState.CustomAction.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder.wrap(((android.media.session.PlaybackState.CustomAction.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
}
