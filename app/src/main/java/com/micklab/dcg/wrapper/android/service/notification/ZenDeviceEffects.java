// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class ZenDeviceEffects {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ZenDeviceEffects(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects wrap(android.service.notification.ZenDeviceEffects real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects(real, (__DcgwBridgeToken) null);
    }

    public android.service.notification.ZenDeviceEffects getReal() {
        return (android.service.notification.ZenDeviceEffects) real;
    }

    public android.service.notification.ZenDeviceEffects unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.notification.ZenDeviceEffects) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.notification.ZenDeviceEffects) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.service.notification.ZenDeviceEffects) real).hashCode();
    }

    public boolean shouldDimWallpaper() {
        return ((android.service.notification.ZenDeviceEffects) real).shouldDimWallpaper();
    }

    public boolean shouldDisplayGrayscale() {
        return ((android.service.notification.ZenDeviceEffects) real).shouldDisplayGrayscale();
    }

    public boolean shouldSuppressAmbientDisplay() {
        return ((android.service.notification.ZenDeviceEffects) real).shouldSuppressAmbientDisplay();
    }

    public boolean shouldUseNightMode() {
        return ((android.service.notification.ZenDeviceEffects) real).shouldUseNightMode();
    }

    public java.lang.String toString() {
        return ((android.service.notification.ZenDeviceEffects) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.notification.ZenDeviceEffects) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder wrap(android.service.notification.ZenDeviceEffects.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.notification.ZenDeviceEffects.Builder getReal() {
            return (android.service.notification.ZenDeviceEffects.Builder) real;
        }

        public android.service.notification.ZenDeviceEffects.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.notification.ZenDeviceEffects.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects arg0) {
            this(new android.service.notification.ZenDeviceEffects.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects build() {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.wrap(((android.service.notification.ZenDeviceEffects.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldDimWallpaper(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(((android.service.notification.ZenDeviceEffects.Builder) real).setShouldDimWallpaper(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldDisplayGrayscale(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(((android.service.notification.ZenDeviceEffects.Builder) real).setShouldDisplayGrayscale(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldSuppressAmbientDisplay(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(((android.service.notification.ZenDeviceEffects.Builder) real).setShouldSuppressAmbientDisplay(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder setShouldUseNightMode(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.Builder.wrap(((android.service.notification.ZenDeviceEffects.Builder) real).setShouldUseNightMode(arg0));
        }

    }
}
