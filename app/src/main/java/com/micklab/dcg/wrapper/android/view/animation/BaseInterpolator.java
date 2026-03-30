// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class BaseInterpolator {
    private final android.view.animation.BaseInterpolator real;

    public BaseInterpolator(android.view.animation.BaseInterpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.BaseInterpolator wrap(android.view.animation.BaseInterpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.BaseInterpolator(real);
    }

    public android.view.animation.BaseInterpolator unwrap() {
        return real;
    }

}
