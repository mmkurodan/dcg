// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class BaseInterpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BaseInterpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.BaseInterpolator wrap(android.view.animation.BaseInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.BaseInterpolator(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.BaseInterpolator getReal() {
        return (android.view.animation.BaseInterpolator) real;
    }

    public android.view.animation.BaseInterpolator unwrap() {
        return getReal();
    }

}
