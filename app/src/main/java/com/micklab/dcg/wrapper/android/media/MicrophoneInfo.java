// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MicrophoneInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MicrophoneInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MicrophoneInfo wrap(android.media.MicrophoneInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MicrophoneInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.MicrophoneInfo getReal() {
        return (android.media.MicrophoneInfo) real;
    }

    public android.media.MicrophoneInfo unwrap() {
        return getReal();
    }

    public java.lang.String getAddress() {
        return ((android.media.MicrophoneInfo) real).getAddress();
    }

    public java.lang.String getDescription() {
        return ((android.media.MicrophoneInfo) real).getDescription();
    }

    public int getDirectionality() {
        return ((android.media.MicrophoneInfo) real).getDirectionality();
    }

    public int getGroup() {
        return ((android.media.MicrophoneInfo) real).getGroup();
    }

    public int getId() {
        return ((android.media.MicrophoneInfo) real).getId();
    }

    public int getIndexInTheGroup() {
        return ((android.media.MicrophoneInfo) real).getIndexInTheGroup();
    }

    public int getLocation() {
        return ((android.media.MicrophoneInfo) real).getLocation();
    }

    public float getMaxSpl() {
        return ((android.media.MicrophoneInfo) real).getMaxSpl();
    }

    public float getMinSpl() {
        return ((android.media.MicrophoneInfo) real).getMinSpl();
    }

    public com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F getOrientation() {
        return com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F.wrap(((android.media.MicrophoneInfo) real).getOrientation());
    }

    public com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F getPosition() {
        return com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F.wrap(((android.media.MicrophoneInfo) real).getPosition());
    }

    public float getSensitivity() {
        return ((android.media.MicrophoneInfo) real).getSensitivity();
    }

    public int getType() {
        return ((android.media.MicrophoneInfo) real).getType();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Coordinate3F(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F wrap(android.media.MicrophoneInfo.Coordinate3F real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MicrophoneInfo.Coordinate3F(real, (__DcgwBridgeToken) null);
        }

        public android.media.MicrophoneInfo.Coordinate3F getReal() {
            return (android.media.MicrophoneInfo.Coordinate3F) real;
        }

        public android.media.MicrophoneInfo.Coordinate3F unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.MicrophoneInfo.Coordinate3F) real).equals(arg0);
        }


    }
}
