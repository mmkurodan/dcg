// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class MagnificationConfig {
    private final android.accessibilityservice.MagnificationConfig real;

    public MagnificationConfig(android.accessibilityservice.MagnificationConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig wrap(android.accessibilityservice.MagnificationConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig(real);
    }

    public android.accessibilityservice.MagnificationConfig unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public float getCenterX() {
        return real.getCenterX();
    }

    public float getCenterY() {
        return real.getCenterY();
    }

    public int getMode() {
        return real.getMode();
    }

    public float getScale() {
        return real.getScale();
    }

    public boolean isActivated() {
        return real.isActivated();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int MAGNIFICATION_MODE_DEFAULT = android.accessibilityservice.MagnificationConfig.MAGNIFICATION_MODE_DEFAULT;
    public static final int MAGNIFICATION_MODE_FULLSCREEN = android.accessibilityservice.MagnificationConfig.MAGNIFICATION_MODE_FULLSCREEN;
    public static final int MAGNIFICATION_MODE_WINDOW = android.accessibilityservice.MagnificationConfig.MAGNIFICATION_MODE_WINDOW;

    public static final class Builder {
        private final android.accessibilityservice.MagnificationConfig.Builder real;

        public Builder(android.accessibilityservice.MagnificationConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder wrap(android.accessibilityservice.MagnificationConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder(real);
        }

        public android.accessibilityservice.MagnificationConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.accessibilityservice.MagnificationConfig.Builder());
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig build() {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setActivated(boolean arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(real.setActivated(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setCenterX(float arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(real.setCenterX(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setCenterY(float arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(real.setCenterY(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setMode(int arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(real.setMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder setScale(float arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.Builder.wrap(real.setScale(arg0));
        }

    }
}
