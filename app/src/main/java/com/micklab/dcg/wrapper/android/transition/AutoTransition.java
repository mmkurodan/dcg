// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class AutoTransition {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutoTransition(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.AutoTransition wrap(android.transition.AutoTransition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.AutoTransition(real, (__DcgwBridgeToken) null);
    }

    public android.transition.AutoTransition getReal() {
        return (android.transition.AutoTransition) real;
    }

    public android.transition.AutoTransition unwrap() {
        return getReal();
    }

    public AutoTransition() {
        this(new android.transition.AutoTransition(), (__DcgwBridgeToken) null);
    }

    public AutoTransition(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.AutoTransition(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

}
