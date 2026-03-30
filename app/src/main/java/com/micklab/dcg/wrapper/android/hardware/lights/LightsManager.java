// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.lights;

public final class LightsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LightsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.lights.LightsManager wrap(android.hardware.lights.LightsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.lights.LightsManager getReal() {
        return (android.hardware.lights.LightsManager) real;
    }

    public android.hardware.lights.LightsManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.hardware.lights.LightState getLightState(com.micklab.dcg.wrapper.android.hardware.lights.Light arg0) {
        return com.micklab.dcg.wrapper.android.hardware.lights.LightState.wrap(((android.hardware.lights.LightsManager) real).getLightState(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession openSession() {
        return com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession.wrap(((android.hardware.lights.LightsManager) real).openSession());
    }

    public static final class LightsSession {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LightsSession(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession wrap(android.hardware.lights.LightsManager.LightsSession real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.LightsSession(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.lights.LightsManager.LightsSession getReal() {
            return (android.hardware.lights.LightsManager.LightsSession) real;
        }

        public android.hardware.lights.LightsManager.LightsSession unwrap() {
            return getReal();
        }

        public void close() {
            ((android.hardware.lights.LightsManager.LightsSession) real).close();
        }

        public void requestLights(com.micklab.dcg.wrapper.android.hardware.lights.LightsRequest arg0) {
            ((android.hardware.lights.LightsManager.LightsSession) real).requestLights(arg0 == null ? null : arg0.getReal());
        }

    }
}
