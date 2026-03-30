// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RenderInput {
    private final android.adservices.ondevicepersonalization.RenderInput real;

    public RenderInput(android.adservices.ondevicepersonalization.RenderInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderInput wrap(android.adservices.ondevicepersonalization.RenderInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderInput(real);
    }

    public android.adservices.ondevicepersonalization.RenderInput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getHeight() {
        return real.getHeight();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig getRenderingConfig() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.wrap(real.getRenderingConfig());
    }

    public int getWidth() {
        return real.getWidth();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
