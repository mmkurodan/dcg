// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class Face {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Face(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.Face wrap(android.hardware.camera2.params.Face real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.Face(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.Face getReal() {
        return (android.hardware.camera2.params.Face) real;
    }

    public android.hardware.camera2.params.Face unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.hardware.camera2.params.Face) real).getBounds());
    }

    public int getId() {
        return ((android.hardware.camera2.params.Face) real).getId();
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getLeftEyePosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.hardware.camera2.params.Face) real).getLeftEyePosition());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getMouthPosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.hardware.camera2.params.Face) real).getMouthPosition());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getRightEyePosition() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.hardware.camera2.params.Face) real).getRightEyePosition());
    }

    public int getScore() {
        return ((android.hardware.camera2.params.Face) real).getScore();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.Face) real).toString();
    }

    public static final int ID_UNSUPPORTED = android.hardware.camera2.params.Face.ID_UNSUPPORTED;
    public static final int SCORE_MAX = android.hardware.camera2.params.Face.SCORE_MAX;
    public static final int SCORE_MIN = android.hardware.camera2.params.Face.SCORE_MIN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder wrap(android.hardware.camera2.params.Face.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.params.Face.Builder getReal() {
            return (android.hardware.camera2.params.Face.Builder) real;
        }

        public android.hardware.camera2.params.Face.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.hardware.camera2.params.Face.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.hardware.camera2.params.Face arg0) {
            this(new android.hardware.camera2.params.Face.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face build() {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.wrap(((android.hardware.camera2.params.Face.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(((android.hardware.camera2.params.Face.Builder) real).setBounds(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setId(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(((android.hardware.camera2.params.Face.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setLeftEyePosition(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(((android.hardware.camera2.params.Face.Builder) real).setLeftEyePosition(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setMouthPosition(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(((android.hardware.camera2.params.Face.Builder) real).setMouthPosition(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setRightEyePosition(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(((android.hardware.camera2.params.Face.Builder) real).setRightEyePosition(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder setScore(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.camera2.params.Face.Builder.wrap(((android.hardware.camera2.params.Face.Builder) real).setScore(arg0));
        }

    }
}
