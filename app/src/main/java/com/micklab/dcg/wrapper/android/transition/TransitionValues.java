// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionValues {
    private final android.transition.TransitionValues real;

    public TransitionValues(android.transition.TransitionValues real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionValues wrap(android.transition.TransitionValues real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionValues(real);
    }

    public android.transition.TransitionValues unwrap() {
        return real;
    }

    public TransitionValues() {
        this(new android.transition.TransitionValues());
    }

    public TransitionValues(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.transition.TransitionValues(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }


}
