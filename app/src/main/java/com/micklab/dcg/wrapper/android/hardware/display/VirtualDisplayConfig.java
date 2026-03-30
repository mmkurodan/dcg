// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class VirtualDisplayConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VirtualDisplayConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig wrap(android.hardware.display.VirtualDisplayConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.display.VirtualDisplayConfig getReal() {
        return (android.hardware.display.VirtualDisplayConfig) real;
    }

    public android.hardware.display.VirtualDisplayConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.display.VirtualDisplayConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.display.VirtualDisplayConfig) real).equals(arg0);
    }

    public int getDensityDpi() {
        return ((android.hardware.display.VirtualDisplayConfig) real).getDensityDpi();
    }

    public int getFlags() {
        return ((android.hardware.display.VirtualDisplayConfig) real).getFlags();
    }

    public int getHeight() {
        return ((android.hardware.display.VirtualDisplayConfig) real).getHeight();
    }

    public java.lang.String getName() {
        return ((android.hardware.display.VirtualDisplayConfig) real).getName();
    }

    public float getRequestedRefreshRate() {
        return ((android.hardware.display.VirtualDisplayConfig) real).getRequestedRefreshRate();
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.hardware.display.VirtualDisplayConfig) real).getSurface());
    }

    public int getWidth() {
        return ((android.hardware.display.VirtualDisplayConfig) real).getWidth();
    }

    public int hashCode() {
        return ((android.hardware.display.VirtualDisplayConfig) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.display.VirtualDisplayConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.display.VirtualDisplayConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder wrap(android.hardware.display.VirtualDisplayConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.display.VirtualDisplayConfig.Builder getReal() {
            return (android.hardware.display.VirtualDisplayConfig.Builder) real;
        }

        public android.hardware.display.VirtualDisplayConfig.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, int arg1, int arg2, int arg3) {
            this(new android.hardware.display.VirtualDisplayConfig.Builder(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder addDisplayCategory(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(((android.hardware.display.VirtualDisplayConfig.Builder) real).addDisplayCategory(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig build() {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.wrap(((android.hardware.display.VirtualDisplayConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(((android.hardware.display.VirtualDisplayConfig.Builder) real).setFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder setRequestedRefreshRate(float arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(((android.hardware.display.VirtualDisplayConfig.Builder) real).setRequestedRefreshRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(((android.hardware.display.VirtualDisplayConfig.Builder) real).setSurface(arg0 == null ? null : arg0.getReal()));
        }

    }
}
