// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class Interpolator {
    private final android.view.animation.Interpolator real;

    public Interpolator(android.view.animation.Interpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Interpolator wrap(android.view.animation.Interpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Interpolator(real);
    }

    public android.view.animation.Interpolator unwrap() {
        return real;
    }

}
