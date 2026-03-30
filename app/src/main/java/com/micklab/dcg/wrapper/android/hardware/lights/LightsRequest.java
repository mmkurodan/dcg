// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class LightsRequest {
    private final android.hardware.lights.LightsRequest real;

    public LightsRequest(android.hardware.lights.LightsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest wrap(android.hardware.lights.LightsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest(real);
    }

    public android.hardware.lights.LightsRequest unwrap() {
        return real;
    }

    public static final class Builder {
        private final android.hardware.lights.LightsRequest.Builder real;

        public Builder(android.hardware.lights.LightsRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder wrap(android.hardware.lights.LightsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder(real);
        }

        public android.hardware.lights.LightsRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.hardware.lights.LightsRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder addLight(com.micklab.dcg.wrapper.android.hardware.lights.Light arg0, com.micklab.dcg.wrapper.android.hardware.lights.LightState arg1) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder.wrap(real.addLight(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest build() {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder clearLight(com.micklab.dcg.wrapper.android.hardware.lights.Light arg0) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder.wrap(real.clearLight(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
