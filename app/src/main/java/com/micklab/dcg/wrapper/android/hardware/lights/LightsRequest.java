// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class LightsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LightsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest wrap(android.hardware.lights.LightsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.lights.LightsRequest getReal() {
        return (android.hardware.lights.LightsRequest) real;
    }

    public android.hardware.lights.LightsRequest unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder wrap(android.hardware.lights.LightsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.lights.LightsRequest.Builder getReal() {
            return (android.hardware.lights.LightsRequest.Builder) real;
        }

        public android.hardware.lights.LightsRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.hardware.lights.LightsRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder addLight(com.micklab.dcg.wrapper.android.hardware.lights.Light arg0, com.micklab.dcg.wrapper.android.hardware.lights.LightState arg1) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder.wrap(((android.hardware.lights.LightsRequest.Builder) real).addLight(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest build() {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.wrap(((android.hardware.lights.LightsRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder clearLight(com.micklab.dcg.wrapper.android.hardware.lights.Light arg0) {
            return com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest.Builder.wrap(((android.hardware.lights.LightsRequest.Builder) real).clearLight(arg0 == null ? null : arg0.getReal()));
        }

    }
}
