// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RenderInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderInput wrap(android.adservices.ondevicepersonalization.RenderInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.RenderInput getReal() {
        return (android.adservices.ondevicepersonalization.RenderInput) real;
    }

    public android.adservices.ondevicepersonalization.RenderInput unwrap() {
        return getReal();
    }

    public RenderInput(int arg0, int arg1, com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig arg2) {
        this(new android.adservices.ondevicepersonalization.RenderInput(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.RenderInput) real).equals(arg0);
    }

    public int getHeight() {
        return ((android.adservices.ondevicepersonalization.RenderInput) real).getHeight();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig getRenderingConfig() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.wrap(((android.adservices.ondevicepersonalization.RenderInput) real).getRenderingConfig());
    }

    public int getWidth() {
        return ((android.adservices.ondevicepersonalization.RenderInput) real).getWidth();
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.RenderInput) real).hashCode();
    }

}
