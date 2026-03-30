// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class LightState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LightState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.LightState wrap(android.hardware.lights.LightState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightState(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.lights.LightState getReal() {
        return (android.hardware.lights.LightState) real;
    }

    public android.hardware.lights.LightState unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.lights.LightState) real).describeContents();
    }

    public int getColor() {
        return ((android.hardware.lights.LightState) real).getColor();
    }

    public int getPlayerId() {
        return ((android.hardware.lights.LightState) real).getPlayerId();
    }

    public java.lang.String toString() {
        return ((android.hardware.lights.LightState) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.lights.LightState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder wrap(android.hardware.lights.LightState.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.lights.LightState.Builder getReal() {
            return (android.hardware.lights.LightState.Builder) real;
        }

        public android.hardware.lights.LightState.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.hardware.lights.LightState.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightState build() {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightState.wrap(((android.hardware.lights.LightState.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder setColor(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder.wrap(((android.hardware.lights.LightState.Builder) real).setColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder setPlayerId(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder.wrap(((android.hardware.lights.LightState.Builder) real).setPlayerId(arg0));
        }

    }
}
