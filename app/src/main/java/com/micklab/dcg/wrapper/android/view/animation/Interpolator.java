// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class Interpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Interpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Interpolator wrap(android.view.animation.Interpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Interpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.Interpolator getReal() {
        return (android.view.animation.Interpolator) real;
    }

    public android.view.animation.Interpolator unwrap() {
        return getReal();
    }

}
