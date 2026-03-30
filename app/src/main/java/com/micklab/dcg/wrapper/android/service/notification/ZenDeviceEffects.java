// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class ZenDeviceEffects {
    private final android.service.notification.ZenDeviceEffects real;

    public ZenDeviceEffects(android.service.notification.ZenDeviceEffects real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects wrap(android.service.notification.ZenDeviceEffects real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects(real);
    }

    public android.service.notification.ZenDeviceEffects unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean shouldDimWallpaper() {
        return real.shouldDimWallpaper();
    }

    public boolean shouldDisplayGrayscale() {
        return real.shouldDisplayGrayscale();
    }

    public boolean shouldSuppressAmbientDisplay() {
        return real.shouldSuppressAmbientDisplay();
    }

    public boolean shouldUseNightMode() {
        return real.shouldUseNightMode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.service.notification.ZenDeviceEffects.Builder real;

        public Builder(android.service.notification.ZenDeviceEffects.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder wrap(android.service.notification.ZenDeviceEffects.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder(real);
        }

        public android.service.notification.ZenDeviceEffects.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.notification.ZenDeviceEffects.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects arg0) {
            this(new android.service.notification.ZenDeviceEffects.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects build() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldDimWallpaper(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(real.setShouldDimWallpaper(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldDisplayGrayscale(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(real.setShouldDisplayGrayscale(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldSuppressAmbientDisplay(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(real.setShouldSuppressAmbientDisplay(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldUseNightMode(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(real.setShouldUseNightMode(arg0));
        }

    }
}
