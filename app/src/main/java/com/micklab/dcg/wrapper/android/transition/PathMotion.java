// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class PathMotion {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathMotion(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.PathMotion wrap(android.transition.PathMotion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.PathMotion(real, (__DcgwBridgeToken) null);
    }

    public android.transition.PathMotion getReal() {
        return (android.transition.PathMotion) real;
    }

    public android.transition.PathMotion unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.transition.PathMotion) real).getPath(arg0, arg1, arg2, arg3));
    }

}
