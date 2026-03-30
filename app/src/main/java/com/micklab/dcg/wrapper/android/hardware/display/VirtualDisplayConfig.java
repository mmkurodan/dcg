// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class VirtualDisplayConfig {
    private final android.hardware.display.VirtualDisplayConfig real;

    public VirtualDisplayConfig(android.hardware.display.VirtualDisplayConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig wrap(android.hardware.display.VirtualDisplayConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig(real);
    }

    public android.hardware.display.VirtualDisplayConfig unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getDensityDpi() {
        return real.getDensityDpi();
    }

    public int getFlags() {
        return real.getFlags();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public float getRequestedRefreshRate() {
        return real.getRequestedRefreshRate();
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

    public int getWidth() {
        return real.getWidth();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.hardware.display.VirtualDisplayConfig.Builder real;

        public Builder(android.hardware.display.VirtualDisplayConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder wrap(android.hardware.display.VirtualDisplayConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder(real);
        }

        public android.hardware.display.VirtualDisplayConfig.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, int arg1, int arg2, int arg3) {
            this(new android.hardware.display.VirtualDisplayConfig.Builder(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder addDisplayCategory(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(real.addDisplayCategory(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig build() {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(real.setFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder setRequestedRefreshRate(float arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(real.setRequestedRefreshRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig.Builder.wrap(real.setSurface(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
