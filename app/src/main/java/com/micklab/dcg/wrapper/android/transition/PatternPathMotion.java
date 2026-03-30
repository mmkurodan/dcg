// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class PatternPathMotion {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PatternPathMotion(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.PatternPathMotion wrap(android.transition.PatternPathMotion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.PatternPathMotion(real, (__DcgwBridgeToken) null);
    }

    public android.transition.PatternPathMotion getReal() {
        return (android.transition.PatternPathMotion) real;
    }

    public android.transition.PatternPathMotion unwrap() {
        return getReal();
    }

    public PatternPathMotion() {
        this(new android.transition.PatternPathMotion(), (__DcgwBridgeToken) null);
    }

    public PatternPathMotion(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        this(new android.transition.PatternPathMotion(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PatternPathMotion(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.PatternPathMotion(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.transition.PatternPathMotion) real).getPath(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPatternPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.transition.PatternPathMotion) real).getPatternPath());
    }

    public void setPatternPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        ((android.transition.PatternPathMotion) real).setPatternPath(arg0 == null ? null : arg0.getReal());
    }

}
