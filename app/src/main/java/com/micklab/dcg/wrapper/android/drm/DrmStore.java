// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class DrmStore {
    private final android.drm.DrmStore real;

    public DrmStore(android.drm.DrmStore real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.DrmStore wrap(android.drm.DrmStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmStore(real);
    }

    public android.drm.DrmStore unwrap() {
        return real;
    }

    public DrmStore() {
        this(new android.drm.DrmStore());
    }

    public static final class Action {
        private final android.drm.DrmStore.Action real;

        public Action(android.drm.DrmStore.Action real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmStore.Action wrap(android.drm.DrmStore.Action real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmStore.Action(real);
        }

        public android.drm.DrmStore.Action unwrap() {
            return real;
        }

        public Action() {
            this(new android.drm.DrmStore.Action());
        }

        public static final int DEFAULT = android.drm.DrmStore.Action.DEFAULT;
        public static final int DISPLAY = android.drm.DrmStore.Action.DISPLAY;
        public static final int EXECUTE = android.drm.DrmStore.Action.EXECUTE;
        public static final int OUTPUT = android.drm.DrmStore.Action.OUTPUT;
        public static final int PLAY = android.drm.DrmStore.Action.PLAY;
        public static final int PREVIEW = android.drm.DrmStore.Action.PREVIEW;
        public static final int RINGTONE = android.drm.DrmStore.Action.RINGTONE;
        public static final int TRANSFER = android.drm.DrmStore.Action.TRANSFER;

    }
    public static final class ConstraintsColumns {
        private final android.drm.DrmStore.ConstraintsColumns real;

        public ConstraintsColumns(android.drm.DrmStore.ConstraintsColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmStore.ConstraintsColumns wrap(android.drm.DrmStore.ConstraintsColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmStore.ConstraintsColumns(real);
        }

        public android.drm.DrmStore.ConstraintsColumns unwrap() {
            return real;
        }

        public static final java.lang.String EXTENDED_METADATA = android.drm.DrmStore.ConstraintsColumns.EXTENDED_METADATA;
        public static final java.lang.String LICENSE_AVAILABLE_TIME = android.drm.DrmStore.ConstraintsColumns.LICENSE_AVAILABLE_TIME;
        public static final java.lang.String LICENSE_EXPIRY_TIME = android.drm.DrmStore.ConstraintsColumns.LICENSE_EXPIRY_TIME;
        public static final java.lang.String LICENSE_START_TIME = android.drm.DrmStore.ConstraintsColumns.LICENSE_START_TIME;
        public static final java.lang.String MAX_REPEAT_COUNT = android.drm.DrmStore.ConstraintsColumns.MAX_REPEAT_COUNT;
        public static final java.lang.String REMAINING_REPEAT_COUNT = android.drm.DrmStore.ConstraintsColumns.REMAINING_REPEAT_COUNT;

    }
    public static final class DrmObjectType {
        private final android.drm.DrmStore.DrmObjectType real;

        public DrmObjectType(android.drm.DrmStore.DrmObjectType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmStore.DrmObjectType wrap(android.drm.DrmStore.DrmObjectType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmStore.DrmObjectType(real);
        }

        public android.drm.DrmStore.DrmObjectType unwrap() {
            return real;
        }

        public DrmObjectType() {
            this(new android.drm.DrmStore.DrmObjectType());
        }

        public static final int CONTENT = android.drm.DrmStore.DrmObjectType.CONTENT;
        public static final int RIGHTS_OBJECT = android.drm.DrmStore.DrmObjectType.RIGHTS_OBJECT;
        public static final int TRIGGER_OBJECT = android.drm.DrmStore.DrmObjectType.TRIGGER_OBJECT;
        public static final int UNKNOWN = android.drm.DrmStore.DrmObjectType.UNKNOWN;

    }
    public static final class Playback {
        private final android.drm.DrmStore.Playback real;

        public Playback(android.drm.DrmStore.Playback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmStore.Playback wrap(android.drm.DrmStore.Playback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmStore.Playback(real);
        }

        public android.drm.DrmStore.Playback unwrap() {
            return real;
        }

        public Playback() {
            this(new android.drm.DrmStore.Playback());
        }

        public static final int PAUSE = android.drm.DrmStore.Playback.PAUSE;
        public static final int RESUME = android.drm.DrmStore.Playback.RESUME;
        public static final int START = android.drm.DrmStore.Playback.START;
        public static final int STOP = android.drm.DrmStore.Playback.STOP;

    }
    public static final class RightsStatus {
        private final android.drm.DrmStore.RightsStatus real;

        public RightsStatus(android.drm.DrmStore.RightsStatus real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.drm.DrmStore.RightsStatus wrap(android.drm.DrmStore.RightsStatus real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.drm.DrmStore.RightsStatus(real);
        }

        public android.drm.DrmStore.RightsStatus unwrap() {
            return real;
        }

        public RightsStatus() {
            this(new android.drm.DrmStore.RightsStatus());
        }

        public static final int RIGHTS_EXPIRED = android.drm.DrmStore.RightsStatus.RIGHTS_EXPIRED;
        public static final int RIGHTS_INVALID = android.drm.DrmStore.RightsStatus.RIGHTS_INVALID;
        public static final int RIGHTS_NOT_ACQUIRED = android.drm.DrmStore.RightsStatus.RIGHTS_NOT_ACQUIRED;
        public static final int RIGHTS_VALID = android.drm.DrmStore.RightsStatus.RIGHTS_VALID;

    }
}
