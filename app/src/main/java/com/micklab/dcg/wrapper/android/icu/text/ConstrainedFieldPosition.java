// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class ConstrainedFieldPosition {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConstrainedFieldPosition(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition wrap(android.icu.text.ConstrainedFieldPosition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.ConstrainedFieldPosition getReal() {
        return (android.icu.text.ConstrainedFieldPosition) real;
    }

    public android.icu.text.ConstrainedFieldPosition unwrap() {
        return getReal();
    }

    public ConstrainedFieldPosition() {
        this(new android.icu.text.ConstrainedFieldPosition(), (__DcgwBridgeToken) null);
    }

    public void constrainField(java.text.Format.Field arg0) {
        ((android.icu.text.ConstrainedFieldPosition) real).constrainField(arg0);
    }

    public java.text.Format.Field getField() {
        return ((android.icu.text.ConstrainedFieldPosition) real).getField();
    }

    public java.lang.Object getFieldValue() {
        return ((android.icu.text.ConstrainedFieldPosition) real).getFieldValue();
    }

    public long getInt64IterationContext() {
        return ((android.icu.text.ConstrainedFieldPosition) real).getInt64IterationContext();
    }

    public int getLimit() {
        return ((android.icu.text.ConstrainedFieldPosition) real).getLimit();
    }

    public int getStart() {
        return ((android.icu.text.ConstrainedFieldPosition) real).getStart();
    }

    public boolean matchesField(java.text.Format.Field arg0, java.lang.Object arg1) {
        return ((android.icu.text.ConstrainedFieldPosition) real).matchesField(arg0, arg1);
    }

    public void reset() {
        ((android.icu.text.ConstrainedFieldPosition) real).reset();
    }

    public void setInt64IterationContext(long arg0) {
        ((android.icu.text.ConstrainedFieldPosition) real).setInt64IterationContext(arg0);
    }

    public void setState(java.text.Format.Field arg0, java.lang.Object arg1, int arg2, int arg3) {
        ((android.icu.text.ConstrainedFieldPosition) real).setState(arg0, arg1, arg2, arg3);
    }

    public java.lang.String toString() {
        return ((android.icu.text.ConstrainedFieldPosition) real).toString();
    }

}
