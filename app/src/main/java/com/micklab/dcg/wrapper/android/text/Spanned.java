// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Spanned {
    private final android.text.Spanned real;

    public Spanned(android.text.Spanned real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Spanned wrap(android.text.Spanned real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Spanned(real);
    }

    public android.text.Spanned unwrap() {
        return real;
    }

    public int getSpanEnd(java.lang.Object arg0) {
        return real.getSpanEnd(arg0);
    }

    public int getSpanFlags(java.lang.Object arg0) {
        return real.getSpanFlags(arg0);
    }

    public int getSpanStart(java.lang.Object arg0) {
        return real.getSpanStart(arg0);
    }

    public static final int SPAN_COMPOSING = android.text.Spanned.SPAN_COMPOSING;
    public static final int SPAN_EXCLUSIVE_EXCLUSIVE = android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
    public static final int SPAN_EXCLUSIVE_INCLUSIVE = android.text.Spanned.SPAN_EXCLUSIVE_INCLUSIVE;
    public static final int SPAN_INCLUSIVE_EXCLUSIVE = android.text.Spanned.SPAN_INCLUSIVE_EXCLUSIVE;
    public static final int SPAN_INCLUSIVE_INCLUSIVE = android.text.Spanned.SPAN_INCLUSIVE_INCLUSIVE;
    public static final int SPAN_INTERMEDIATE = android.text.Spanned.SPAN_INTERMEDIATE;
    public static final int SPAN_MARK_MARK = android.text.Spanned.SPAN_MARK_MARK;
    public static final int SPAN_MARK_POINT = android.text.Spanned.SPAN_MARK_POINT;
    public static final int SPAN_PARAGRAPH = android.text.Spanned.SPAN_PARAGRAPH;
    public static final int SPAN_POINT_MARK = android.text.Spanned.SPAN_POINT_MARK;
    public static final int SPAN_POINT_MARK_MASK = android.text.Spanned.SPAN_POINT_MARK_MASK;
    public static final int SPAN_POINT_POINT = android.text.Spanned.SPAN_POINT_POINT;
    public static final int SPAN_PRIORITY = android.text.Spanned.SPAN_PRIORITY;
    public static final int SPAN_PRIORITY_SHIFT = android.text.Spanned.SPAN_PRIORITY_SHIFT;
    public static final int SPAN_USER = android.text.Spanned.SPAN_USER;
    public static final int SPAN_USER_SHIFT = android.text.Spanned.SPAN_USER_SHIFT;

}
