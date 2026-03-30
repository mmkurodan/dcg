// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class LightsManager {
    private final android.hardware.lights.LightsManager real;

    public LightsManager(android.hardware.lights.LightsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.LightsManager wrap(android.hardware.lights.LightsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsManager(real);
    }

    public android.hardware.lights.LightsManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.hardware.lights.LightState getLightState(com.micklab.dcg.wrapper.android.hardware.lights.Light arg0) {
        return com.micklab.dcg.wrapper.android.hardware.lights.LightState.wrap(real.getLightState(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession openSession() {
        return com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession.wrap(real.openSession());
    }

    public static final class LightsSession {
        private final android.hardware.lights.LightsManager.LightsSession real;

        public LightsSession(android.hardware.lights.LightsManager.LightsSession real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession wrap(android.hardware.lights.LightsManager.LightsSession real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession(real);
        }

        public android.hardware.lights.LightsManager.LightsSession unwrap() {
            return real;
        }

        public void close() {
            real.close();
        }

        public void requestLights(com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest arg0) {
            real.requestLights(arg0 == null ? null : arg0.unwrap());
        }

    }
}
