// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class LightState {
    private final android.hardware.lights.LightState real;

    public LightState(android.hardware.lights.LightState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.LightState wrap(android.hardware.lights.LightState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightState(real);
    }

    public android.hardware.lights.LightState unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getColor() {
        return real.getColor();
    }

    public int getPlayerId() {
        return real.getPlayerId();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.hardware.lights.LightState.Builder real;

        public Builder(android.hardware.lights.LightState.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder wrap(android.hardware.lights.LightState.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder(real);
        }

        public android.hardware.lights.LightState.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.hardware.lights.LightState.Builder());
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightState build() {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightState.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder setColor(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder.wrap(real.setColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder setPlayerId(int arg0) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightState.Builder.wrap(real.setPlayerId(arg0));
        }

    }
}
