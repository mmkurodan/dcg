// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class PathMotion {
    private final android.transition.PathMotion real;

    public PathMotion(android.transition.PathMotion real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.PathMotion wrap(android.transition.PathMotion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.PathMotion(real);
    }

    public android.transition.PathMotion unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getPath(arg0, arg1, arg2, arg3));
    }

}
