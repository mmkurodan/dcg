// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpannableStringBuilder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpannableStringBuilder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableStringBuilder wrap(android.text.SpannableStringBuilder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpannableStringBuilder(real, (__DcgwBridgeToken) null);
    }

    public android.text.SpannableStringBuilder getReal() {
        return (android.text.SpannableStringBuilder) real;
    }

    public android.text.SpannableStringBuilder unwrap() {
        return getReal();
    }

    public SpannableStringBuilder() {
        this(new android.text.SpannableStringBuilder(), (__DcgwBridgeToken) null);
    }

    public SpannableStringBuilder(java.lang.CharSequence arg0) {
        this(new android.text.SpannableStringBuilder(arg0), (__DcgwBridgeToken) null);
    }

    public SpannableStringBuilder(java.lang.CharSequence arg0, int arg1, int arg2) {
        this(new android.text.SpannableStringBuilder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(char arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(java.lang.CharSequence arg0, java.lang.Object arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).append(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(java.lang.CharSequence arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).append(arg0, arg1, arg2));
    }

    public char charAt(int arg0) {
        return ((android.text.SpannableStringBuilder) real).charAt(arg0);
    }

    public void clear() {
        ((android.text.SpannableStringBuilder) real).clear();
    }

    public void clearSpans() {
        ((android.text.SpannableStringBuilder) real).clearSpans();
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder delete(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).delete(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.text.SpannableStringBuilder) real).equals(arg0);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        ((android.text.SpannableStringBuilder) real).getChars(arg0, arg1, arg2, arg3);
    }

    public android.text.InputFilter[] getFilters() {
        return ((android.text.SpannableStringBuilder) real).getFilters();
    }

    public int getSpanEnd(java.lang.Object arg0) {
        return ((android.text.SpannableStringBuilder) real).getSpanEnd(arg0);
    }

    public int getSpanFlags(java.lang.Object arg0) {
        return ((android.text.SpannableStringBuilder) real).getSpanFlags(arg0);
    }

    public int getSpanStart(java.lang.Object arg0) {
        return ((android.text.SpannableStringBuilder) real).getSpanStart(arg0);
    }

    public int getTextRunCursor(int arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        return ((android.text.SpannableStringBuilder) real).getTextRunCursor(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public int getTextWatcherDepth() {
        return ((android.text.SpannableStringBuilder) real).getTextWatcherDepth();
    }

    public int hashCode() {
        return ((android.text.SpannableStringBuilder) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder insert(int arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).insert(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder insert(int arg0, java.lang.CharSequence arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).insert(arg0, arg1, arg2, arg3));
    }

    public int length() {
        return ((android.text.SpannableStringBuilder) real).length();
    }

    public void removeSpan(java.lang.Object arg0) {
        ((android.text.SpannableStringBuilder) real).removeSpan(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder replace(int arg0, int arg1, java.lang.CharSequence arg2) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).replace(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder replace(int arg0, int arg1, java.lang.CharSequence arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(((android.text.SpannableStringBuilder) real).replace(arg0, arg1, arg2, arg3, arg4));
    }

    public void setFilters(android.text.InputFilter[] arg0) {
        ((android.text.SpannableStringBuilder) real).setFilters(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        ((android.text.SpannableStringBuilder) real).setSpan(arg0, arg1, arg2, arg3);
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return ((android.text.SpannableStringBuilder) real).subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return ((android.text.SpannableStringBuilder) real).toString();
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableStringBuilder valueOf(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(android.text.SpannableStringBuilder.valueOf(arg0));
    }

}
