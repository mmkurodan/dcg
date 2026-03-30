// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvInputManager {
    private final android.media.tv.TvInputManager real;

    public TvInputManager(android.media.tv.TvInputManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvInputManager wrap(android.media.tv.TvInputManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputManager(real);
    }

    public android.media.tv.TvInputManager unwrap() {
        return real;
    }

    public int getInputState(java.lang.String arg0) {
        return real.getInputState(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo getTvInputInfo(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.wrap(real.getTvInputInfo(arg0));
    }

    public boolean isParentalControlsEnabled() {
        return real.isParentalControlsEnabled();
    }

    public boolean isRatingBlocked(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
        return real.isRatingBlocked(arg0 == null ? null : arg0.unwrap());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.media.tv.TvInputManager.TvInputCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.media.tv.TvInputManager.TvInputCallback arg0) {
        real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void updateTvInputInfo(com.micklab.dcg.wrapper.android.media.tv.TvInputInfo arg0) {
        real.updateTvInputInfo(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_BLOCKED_RATINGS_CHANGED = android.media.tv.TvInputManager.ACTION_BLOCKED_RATINGS_CHANGED;
    public static final java.lang.String ACTION_PARENTAL_CONTROLS_ENABLED_CHANGED = android.media.tv.TvInputManager.ACTION_PARENTAL_CONTROLS_ENABLED_CHANGED;
    public static final java.lang.String ACTION_QUERY_CONTENT_RATING_SYSTEMS = android.media.tv.TvInputManager.ACTION_QUERY_CONTENT_RATING_SYSTEMS;
    public static final java.lang.String ACTION_SETUP_INPUTS = android.media.tv.TvInputManager.ACTION_SETUP_INPUTS;
    public static final java.lang.String ACTION_VIEW_RECORDING_SCHEDULES = android.media.tv.TvInputManager.ACTION_VIEW_RECORDING_SCHEDULES;
    public static final int BROADCAST_INFO_STREAM_EVENT = android.media.tv.TvInputManager.BROADCAST_INFO_STREAM_EVENT;
    public static final int BROADCAST_INFO_TYPE_COMMAND = android.media.tv.TvInputManager.BROADCAST_INFO_TYPE_COMMAND;
    public static final int BROADCAST_INFO_TYPE_DSMCC = android.media.tv.TvInputManager.BROADCAST_INFO_TYPE_DSMCC;
    public static final int BROADCAST_INFO_TYPE_PES = android.media.tv.TvInputManager.BROADCAST_INFO_TYPE_PES;
    public static final int BROADCAST_INFO_TYPE_SECTION = android.media.tv.TvInputManager.BROADCAST_INFO_TYPE_SECTION;
    public static final int BROADCAST_INFO_TYPE_TABLE = android.media.tv.TvInputManager.BROADCAST_INFO_TYPE_TABLE;
    public static final int BROADCAST_INFO_TYPE_TIMELINE = android.media.tv.TvInputManager.BROADCAST_INFO_TYPE_TIMELINE;
    public static final int BROADCAST_INFO_TYPE_TS = android.media.tv.TvInputManager.BROADCAST_INFO_TYPE_TS;
    public static final int INPUT_STATE_CONNECTED = android.media.tv.TvInputManager.INPUT_STATE_CONNECTED;
    public static final int INPUT_STATE_CONNECTED_STANDBY = android.media.tv.TvInputManager.INPUT_STATE_CONNECTED_STANDBY;
    public static final int INPUT_STATE_DISCONNECTED = android.media.tv.TvInputManager.INPUT_STATE_DISCONNECTED;
    public static final java.lang.String META_DATA_CONTENT_RATING_SYSTEMS = android.media.tv.TvInputManager.META_DATA_CONTENT_RATING_SYSTEMS;
    public static final int RECORDING_ERROR_INSUFFICIENT_SPACE = android.media.tv.TvInputManager.RECORDING_ERROR_INSUFFICIENT_SPACE;
    public static final int RECORDING_ERROR_RESOURCE_BUSY = android.media.tv.TvInputManager.RECORDING_ERROR_RESOURCE_BUSY;
    public static final int RECORDING_ERROR_UNKNOWN = android.media.tv.TvInputManager.RECORDING_ERROR_UNKNOWN;
    public static final int SIGNAL_STRENGTH_LOST = android.media.tv.TvInputManager.SIGNAL_STRENGTH_LOST;
    public static final int SIGNAL_STRENGTH_STRONG = android.media.tv.TvInputManager.SIGNAL_STRENGTH_STRONG;
    public static final int SIGNAL_STRENGTH_WEAK = android.media.tv.TvInputManager.SIGNAL_STRENGTH_WEAK;
    public static final long TIME_SHIFT_INVALID_TIME = android.media.tv.TvInputManager.TIME_SHIFT_INVALID_TIME;
    public static final int TIME_SHIFT_MODE_AUTO = android.media.tv.TvInputManager.TIME_SHIFT_MODE_AUTO;
    public static final int TIME_SHIFT_MODE_LOCAL = android.media.tv.TvInputManager.TIME_SHIFT_MODE_LOCAL;
    public static final int TIME_SHIFT_MODE_OFF = android.media.tv.TvInputManager.TIME_SHIFT_MODE_OFF;
    public static final int TIME_SHIFT_STATUS_AVAILABLE = android.media.tv.TvInputManager.TIME_SHIFT_STATUS_AVAILABLE;
    public static final int TIME_SHIFT_STATUS_UNAVAILABLE = android.media.tv.TvInputManager.TIME_SHIFT_STATUS_UNAVAILABLE;
    public static final int TIME_SHIFT_STATUS_UNKNOWN = android.media.tv.TvInputManager.TIME_SHIFT_STATUS_UNKNOWN;
    public static final int TIME_SHIFT_STATUS_UNSUPPORTED = android.media.tv.TvInputManager.TIME_SHIFT_STATUS_UNSUPPORTED;
    public static final long TV_MESSAGE_GROUP_ID_NONE = android.media.tv.TvInputManager.TV_MESSAGE_GROUP_ID_NONE;
    public static final java.lang.String TV_MESSAGE_KEY_GROUP_ID = android.media.tv.TvInputManager.TV_MESSAGE_KEY_GROUP_ID;
    public static final java.lang.String TV_MESSAGE_KEY_RAW_DATA = android.media.tv.TvInputManager.TV_MESSAGE_KEY_RAW_DATA;
    public static final java.lang.String TV_MESSAGE_KEY_STREAM_ID = android.media.tv.TvInputManager.TV_MESSAGE_KEY_STREAM_ID;
    public static final java.lang.String TV_MESSAGE_KEY_SUBTYPE = android.media.tv.TvInputManager.TV_MESSAGE_KEY_SUBTYPE;
    public static final java.lang.String TV_MESSAGE_SUBTYPE_CC_608E = android.media.tv.TvInputManager.TV_MESSAGE_SUBTYPE_CC_608E;
    public static final java.lang.String TV_MESSAGE_SUBTYPE_WATERMARKING_A335 = android.media.tv.TvInputManager.TV_MESSAGE_SUBTYPE_WATERMARKING_A335;
    public static final int TV_MESSAGE_TYPE_CLOSED_CAPTION = android.media.tv.TvInputManager.TV_MESSAGE_TYPE_CLOSED_CAPTION;
    public static final int TV_MESSAGE_TYPE_OTHER = android.media.tv.TvInputManager.TV_MESSAGE_TYPE_OTHER;
    public static final int TV_MESSAGE_TYPE_WATERMARK = android.media.tv.TvInputManager.TV_MESSAGE_TYPE_WATERMARK;
    public static final int VIDEO_UNAVAILABLE_REASON_AUDIO_ONLY = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_AUDIO_ONLY;
    public static final int VIDEO_UNAVAILABLE_REASON_BUFFERING = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_BUFFERING;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_BLACKOUT = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_BLACKOUT;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_INVALID = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_CARD_INVALID;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_MUTE = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_CARD_MUTE;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_INSUFFICIENT_OUTPUT_PROTECTION = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_INSUFFICIENT_OUTPUT_PROTECTION;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_LICENSE_EXPIRED = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_LICENSE_EXPIRED;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_ACTIVATION = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_NEED_ACTIVATION;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_PAIRING = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_NEED_PAIRING;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NO_CARD = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_NO_CARD;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_PVR_RECORDING_NOT_ALLOWED = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_PVR_RECORDING_NOT_ALLOWED;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_REBOOTING = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_REBOOTING;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_UNKNOWN = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_CAS_UNKNOWN;
    public static final int VIDEO_UNAVAILABLE_REASON_INSUFFICIENT_RESOURCE = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_INSUFFICIENT_RESOURCE;
    public static final int VIDEO_UNAVAILABLE_REASON_NOT_CONNECTED = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_NOT_CONNECTED;
    public static final int VIDEO_UNAVAILABLE_REASON_TUNING = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_TUNING;
    public static final int VIDEO_UNAVAILABLE_REASON_UNKNOWN = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_UNKNOWN;
    public static final int VIDEO_UNAVAILABLE_REASON_WEAK_SIGNAL = android.media.tv.TvInputManager.VIDEO_UNAVAILABLE_REASON_WEAK_SIGNAL;

    public static final class TvInputCallback {
        private final android.media.tv.TvInputManager.TvInputCallback real;

        public TvInputCallback(android.media.tv.TvInputManager.TvInputCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputManager.TvInputCallback wrap(android.media.tv.TvInputManager.TvInputCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputManager.TvInputCallback(real);
        }

        public android.media.tv.TvInputManager.TvInputCallback unwrap() {
            return real;
        }

        public void onInputAdded(java.lang.String arg0) {
            real.onInputAdded(arg0);
        }

        public void onInputRemoved(java.lang.String arg0) {
            real.onInputRemoved(arg0);
        }

        public void onInputStateChanged(java.lang.String arg0, int arg1) {
            real.onInputStateChanged(arg0, arg1);
        }

        public void onInputUpdated(java.lang.String arg0) {
            real.onInputUpdated(arg0);
        }

        public void onTvInputInfoUpdated(com.micklab.dcg.wrapper.android.media.tv.TvInputInfo arg0) {
            real.onTvInputInfoUpdated(arg0 == null ? null : arg0.unwrap());
        }

    }
}
