// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class MagnificationConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MagnificationConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig wrap(android.accessibilityservice.MagnificationConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.MagnificationConfig getReal() {
        return (android.accessibilityservice.MagnificationConfig) real;
    }

    public android.accessibilityservice.MagnificationConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.accessibilityservice.MagnificationConfig) real).describeContents();
    }

    public float getCenterX() {
        return ((android.accessibilityservice.MagnificationConfig) real).getCenterX();
    }

    public float getCenterY() {
        return ((android.accessibilityservice.MagnificationConfig) real).getCenterY();
    }

    public int getMode() {
        return ((android.accessibilityservice.MagnificationConfig) real).getMode();
    }

    public float getScale() {
        return ((android.accessibilityservice.MagnificationConfig) real).getScale();
    }

    public boolean isActivated() {
        return ((android.accessibilityservice.MagnificationConfig) real).isActivated();
    }

    public java.lang.String toString() {
        return ((android.accessibilityservice.MagnificationConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.accessibilityservice.MagnificationConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int MAGNIFICATION_MODE_DEFAULT = android.accessibilityservice.MagnificationConfig.MAGNIFICATION_MODE_DEFAULT;
    public static final int MAGNIFICATION_MODE_FULLSCREEN = android.accessibilityservice.MagnificationConfig.MAGNIFICATION_MODE_FULLSCREEN;
    public static final int MAGNIFICATION_MODE_WINDOW = android.accessibilityservice.MagnificationConfig.MAGNIFICATION_MODE_WINDOW;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder wrap(android.accessibilityservice.MagnificationConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.MagnificationConfig.Builder getReal() {
            return (android.accessibilityservice.MagnificationConfig.Builder) real;
        }

        public android.accessibilityservice.MagnificationConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.accessibilityservice.MagnificationConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig build() {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.wrap(((android.accessibilityservice.MagnificationConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setActivated(boolean arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(((android.accessibilityservice.MagnificationConfig.Builder) real).setActivated(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setCenterX(float arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(((android.accessibilityservice.MagnificationConfig.Builder) real).setCenterX(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setCenterY(float arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(((android.accessibilityservice.MagnificationConfig.Builder) real).setCenterY(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setMode(int arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(((android.accessibilityservice.MagnificationConfig.Builder) real).setMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setScale(float arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(((android.accessibilityservice.MagnificationConfig.Builder) real).setScale(arg0));
        }

    }
}
