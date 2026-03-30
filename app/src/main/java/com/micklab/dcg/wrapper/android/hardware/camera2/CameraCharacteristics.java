// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraCharacteristics {
    private final android.hardware.camera2.CameraCharacteristics real;

    public CameraCharacteristics(android.hardware.camera2.CameraCharacteristics real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics wrap(android.hardware.camera2.CameraCharacteristics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics(real);
    }

    public android.hardware.camera2.CameraCharacteristics unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap getRecommendedStreamConfigurationMap(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap.wrap(real.getRecommendedStreamConfigurationMap(arg0));
    }


    public static final class Key {
        private final android.hardware.camera2.CameraCharacteristics.Key real;

        public Key(android.hardware.camera2.CameraCharacteristics.Key real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.Key wrap(android.hardware.camera2.CameraCharacteristics.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.Key(real);
        }

        public android.hardware.camera2.CameraCharacteristics.Key unwrap() {
            return real;
        }

        public Key(java.lang.String arg0, java.lang.Class arg1) {
            this(new android.hardware.camera2.CameraCharacteristics.Key(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getName() {
            return real.getName();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
