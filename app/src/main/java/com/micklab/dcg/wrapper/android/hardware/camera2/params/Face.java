// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class Face {
    private final android.hardware.camera2.params.Face real;

    public Face(android.hardware.camera2.params.Face real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.Face wrap(android.hardware.camera2.params.Face real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.Face(real);
    }

    public android.hardware.camera2.params.Face unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBounds());
    }

    public int getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getLeftEyePosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getLeftEyePosition());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getMouthPosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getMouthPosition());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getRightEyePosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getRightEyePosition());
    }

    public int getScore() {
        return real.getScore();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int ID_UNSUPPORTED = android.hardware.camera2.params.Face.ID_UNSUPPORTED;
    public static final int SCORE_MAX = android.hardware.camera2.params.Face.SCORE_MAX;
    public static final int SCORE_MIN = android.hardware.camera2.params.Face.SCORE_MIN;

    public static final class Builder {
        private final android.hardware.camera2.params.Face.Builder real;

        public Builder(android.hardware.camera2.params.Face.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder wrap(android.hardware.camera2.params.Face.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder(real);
        }

        public android.hardware.camera2.params.Face.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.hardware.camera2.params.Face.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.hardware.camera2.params.Face arg0) {
            this(new android.hardware.camera2.params.Face.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face build() {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(real.setBounds(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setId(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(real.setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setLeftEyePosition(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(real.setLeftEyePosition(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setMouthPosition(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(real.setMouthPosition(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setRightEyePosition(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(real.setRightEyePosition(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setScore(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(real.setScore(arg0));
        }

    }
}
