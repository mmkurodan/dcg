// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class ConstrainedFieldPosition {
    private final android.icu.text.ConstrainedFieldPosition real;

    public ConstrainedFieldPosition(android.icu.text.ConstrainedFieldPosition real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition wrap(android.icu.text.ConstrainedFieldPosition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition(real);
    }

    public android.icu.text.ConstrainedFieldPosition unwrap() {
        return real;
    }

    public ConstrainedFieldPosition() {
        this(new android.icu.text.ConstrainedFieldPosition());
    }

    public void constrainField(java.text.Format.Field arg0) {
        real.constrainField(arg0);
    }

    public java.text.Format.Field getField() {
        return real.getField();
    }

    public java.lang.Object getFieldValue() {
        return real.getFieldValue();
    }

    public long getInt64IterationContext() {
        return real.getInt64IterationContext();
    }

    public int getLimit() {
        return real.getLimit();
    }

    public int getStart() {
        return real.getStart();
    }

    public boolean matchesField(java.text.Format.Field arg0, java.lang.Object arg1) {
        return real.matchesField(arg0, arg1);
    }

    public void reset() {
        real.reset();
    }

    public void setInt64IterationContext(long arg0) {
        real.setInt64IterationContext(arg0);
    }

    public void setState(java.text.Format.Field arg0, java.lang.Object arg1, int arg2, int arg3) {
        real.setState(arg0, arg1, arg2, arg3);
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
