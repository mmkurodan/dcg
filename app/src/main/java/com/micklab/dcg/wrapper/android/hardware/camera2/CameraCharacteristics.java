// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraCharacteristics {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraCharacteristics(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics wrap(android.hardware.camera2.CameraCharacteristics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraCharacteristics getReal() {
        return (android.hardware.camera2.CameraCharacteristics) real;
    }

    public android.hardware.camera2.CameraCharacteristics unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap getRecommendedStreamConfigurationMap(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap.wrap(((android.hardware.camera2.CameraCharacteristics) real).getRecommendedStreamConfigurationMap(arg0));
    }


    public static final class Key {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Key(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.Key wrap(android.hardware.camera2.CameraCharacteristics.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.Key(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraCharacteristics.Key getReal() {
            return (android.hardware.camera2.CameraCharacteristics.Key) real;
        }

        public android.hardware.camera2.CameraCharacteristics.Key unwrap() {
            return getReal();
        }

        public Key(java.lang.String arg0, java.lang.Class arg1) {
            this(new android.hardware.camera2.CameraCharacteristics.Key(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.hardware.camera2.CameraCharacteristics.Key) real).equals(arg0);
        }

        public java.lang.String getName() {
            return ((android.hardware.camera2.CameraCharacteristics.Key) real).getName();
        }

        public int hashCode() {
            return ((android.hardware.camera2.CameraCharacteristics.Key) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.hardware.camera2.CameraCharacteristics.Key) real).toString();
        }

    }
}
