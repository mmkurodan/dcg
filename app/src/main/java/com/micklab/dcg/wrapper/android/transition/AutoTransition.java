// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class AutoTransition {
    private final android.transition.AutoTransition real;

    public AutoTransition(android.transition.AutoTransition real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.AutoTransition wrap(android.transition.AutoTransition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.AutoTransition(real);
    }

    public android.transition.AutoTransition unwrap() {
        return real;
    }

    public AutoTransition() {
        this(new android.transition.AutoTransition());
    }

    public AutoTransition(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.AutoTransition(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

}
