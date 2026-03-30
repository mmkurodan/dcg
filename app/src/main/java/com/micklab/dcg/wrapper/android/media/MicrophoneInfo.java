// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MicrophoneInfo {
    private final android.media.MicrophoneInfo real;

    public MicrophoneInfo(android.media.MicrophoneInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MicrophoneInfo wrap(android.media.MicrophoneInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MicrophoneInfo(real);
    }

    public android.media.MicrophoneInfo unwrap() {
        return real;
    }

    public java.lang.String getAddress() {
        return real.getAddress();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public int getDirectionality() {
        return real.getDirectionality();
    }

    public int getGroup() {
        return real.getGroup();
    }

    public int getId() {
        return real.getId();
    }

    public int getIndexInTheGroup() {
        return real.getIndexInTheGroup();
    }

    public int getLocation() {
        return real.getLocation();
    }

    public float getMaxSpl() {
        return real.getMaxSpl();
    }

    public float getMinSpl() {
        return real.getMinSpl();
    }

    public com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F getOrientation() {
        return com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F.wrap(real.getOrientation());
    }

    public com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F getPosition() {
        return com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F.wrap(real.getPosition());
    }

    public float getSensitivity() {
        return real.getSensitivity();
    }

    public int getType() {
        return real.getType();
    }

    public static final int CHANNEL_MAPPING_DIRECT = android.media.MicrophoneInfo.CHANNEL_MAPPING_DIRECT;
    public static final int CHANNEL_MAPPING_PROCESSED = android.media.MicrophoneInfo.CHANNEL_MAPPING_PROCESSED;
    public static final int DIRECTIONALITY_BI_DIRECTIONAL = android.media.MicrophoneInfo.DIRECTIONALITY_BI_DIRECTIONAL;
    public static final int DIRECTIONALITY_CARDIOID = android.media.MicrophoneInfo.DIRECTIONALITY_CARDIOID;
    public static final int DIRECTIONALITY_HYPER_CARDIOID = android.media.MicrophoneInfo.DIRECTIONALITY_HYPER_CARDIOID;
    public static final int DIRECTIONALITY_OMNI = android.media.MicrophoneInfo.DIRECTIONALITY_OMNI;
    public static final int DIRECTIONALITY_SUPER_CARDIOID = android.media.MicrophoneInfo.DIRECTIONALITY_SUPER_CARDIOID;
    public static final int DIRECTIONALITY_UNKNOWN = android.media.MicrophoneInfo.DIRECTIONALITY_UNKNOWN;
    public static final int GROUP_UNKNOWN = android.media.MicrophoneInfo.GROUP_UNKNOWN;
    public static final int INDEX_IN_THE_GROUP_UNKNOWN = android.media.MicrophoneInfo.INDEX_IN_THE_GROUP_UNKNOWN;
    public static final int LOCATION_MAINBODY = android.media.MicrophoneInfo.LOCATION_MAINBODY;
    public static final int LOCATION_MAINBODY_MOVABLE = android.media.MicrophoneInfo.LOCATION_MAINBODY_MOVABLE;
    public static final int LOCATION_PERIPHERAL = android.media.MicrophoneInfo.LOCATION_PERIPHERAL;
    public static final int LOCATION_UNKNOWN = android.media.MicrophoneInfo.LOCATION_UNKNOWN;
    public static final com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F ORIENTATION_UNKNOWN = com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F.wrap(android.media.MicrophoneInfo.ORIENTATION_UNKNOWN);
    public static final com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F POSITION_UNKNOWN = com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F.wrap(android.media.MicrophoneInfo.POSITION_UNKNOWN);
    public static final float SENSITIVITY_UNKNOWN = android.media.MicrophoneInfo.SENSITIVITY_UNKNOWN;
    public static final float SPL_UNKNOWN = android.media.MicrophoneInfo.SPL_UNKNOWN;

    public static final class Coordinate3F {
        private final android.media.MicrophoneInfo.Coordinate3F real;

        public Coordinate3F(android.media.MicrophoneInfo.Coordinate3F real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F wrap(android.media.MicrophoneInfo.Coordinate3F real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F(real);
        }

        public android.media.MicrophoneInfo.Coordinate3F unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }


    }
}
