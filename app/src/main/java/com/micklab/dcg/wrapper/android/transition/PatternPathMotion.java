// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class PatternPathMotion {
    private final android.transition.PatternPathMotion real;

    public PatternPathMotion(android.transition.PatternPathMotion real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.PatternPathMotion wrap(android.transition.PatternPathMotion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.PatternPathMotion(real);
    }

    public android.transition.PatternPathMotion unwrap() {
        return real;
    }

    public PatternPathMotion() {
        this(new android.transition.PatternPathMotion());
    }

    public PatternPathMotion(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        this(new android.transition.PatternPathMotion(arg0 == null ? null : arg0.unwrap()));
    }

    public PatternPathMotion(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.PatternPathMotion(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getPath(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPatternPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getPatternPath());
    }

    public void setPatternPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        real.setPatternPath(arg0 == null ? null : arg0.unwrap());
    }

}
