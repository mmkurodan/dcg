// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class PlaybackState {
    private final android.media.session.PlaybackState real;

    public PlaybackState(android.media.session.PlaybackState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.PlaybackState wrap(android.media.session.PlaybackState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState(real);
    }

    public android.media.session.PlaybackState unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getActions() {
        return real.getActions();
    }

    public long getActiveQueueItemId() {
        return real.getActiveQueueItemId();
    }

    public long getBufferedPosition() {
        return real.getBufferedPosition();
    }

    public java.lang.CharSequence getErrorMessage() {
        return real.getErrorMessage();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public long getLastPositionUpdateTime() {
        return real.getLastPositionUpdateTime();
    }

    public float getPlaybackSpeed() {
        return real.getPlaybackSpeed();
    }

    public long getPosition() {
        return real.getPosition();
    }

    public int getState() {
        return real.getState();
    }

    public boolean isActive() {
        return real.isActive();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.media.session.PlaybackState.Builder real;

        public Builder(android.media.session.PlaybackState.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder wrap(android.media.session.PlaybackState.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder(real);
        }

        public android.media.session.PlaybackState.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.session.PlaybackState.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.media.session.PlaybackState arg0) {
            this(new android.media.session.PlaybackState.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder addCustomAction(com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.addCustomAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder addCustomAction(java.lang.String arg0, java.lang.String arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.addCustomAction(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState build() {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setActions(long arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.setActions(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setActiveQueueItemId(long arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.setActiveQueueItemId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setBufferedPosition(long arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.setBufferedPosition(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setErrorMessage(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.setErrorMessage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setState(int arg0, long arg1, float arg2) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.setState(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder setState(int arg0, long arg1, float arg2, long arg3) {
            return com.micklab.dcg.wrapper.android.media.session.PlaybackState.Builder.wrap(real.setState(arg0, arg1, arg2, arg3));
        }

    }
    public static final class CustomAction {
        private final android.media.session.PlaybackState.CustomAction real;

        public CustomAction(android.media.session.PlaybackState.CustomAction real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction wrap(android.media.session.PlaybackState.CustomAction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction(real);
        }

        public android.media.session.PlaybackState.CustomAction unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.String getAction() {
            return real.getAction();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public int getIcon() {
            return real.getIcon();
        }

        public java.lang.CharSequence getName() {
            return real.getName();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.media.session.PlaybackState.CustomAction.Builder real;

            public Builder(android.media.session.PlaybackState.CustomAction.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder wrap(android.media.session.PlaybackState.CustomAction.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder(real);
            }

            public android.media.session.PlaybackState.CustomAction.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.String arg0, java.lang.CharSequence arg1, int arg2) {
                this(new android.media.session.PlaybackState.CustomAction.Builder(arg0, arg1, arg2));
            }

            public com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction build() {
                return com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.media.session.PlaybackState.CustomAction.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
}
