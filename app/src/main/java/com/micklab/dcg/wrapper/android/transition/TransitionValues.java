// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionValues {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransitionValues(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionValues wrap(android.transition.TransitionValues real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionValues(real, (__DcgwBridgeToken) null);
    }

    public android.transition.TransitionValues getReal() {
        return (android.transition.TransitionValues) real;
    }

    public android.transition.TransitionValues unwrap() {
        return getReal();
    }

    public TransitionValues() {
        this(new android.transition.TransitionValues(), (__DcgwBridgeToken) null);
    }

    public TransitionValues(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.transition.TransitionValues(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.transition.TransitionValues) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.transition.TransitionValues) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.transition.TransitionValues) real).toString();
    }


}
