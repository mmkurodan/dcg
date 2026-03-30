// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SpannableStringBuilder {
    private final android.text.SpannableStringBuilder real;

    public SpannableStringBuilder(android.text.SpannableStringBuilder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableStringBuilder wrap(android.text.SpannableStringBuilder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SpannableStringBuilder(real);
    }

    public android.text.SpannableStringBuilder unwrap() {
        return real;
    }

    public SpannableStringBuilder() {
        this(new android.text.SpannableStringBuilder());
    }

    public SpannableStringBuilder(java.lang.CharSequence arg0) {
        this(new android.text.SpannableStringBuilder(arg0));
    }

    public SpannableStringBuilder(java.lang.CharSequence arg0, int arg1, int arg2) {
        this(new android.text.SpannableStringBuilder(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(char arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(java.lang.CharSequence arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.append(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder append(java.lang.CharSequence arg0, java.lang.Object arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.append(arg0, arg1, arg2));
    }

    public char charAt(int arg0) {
        return real.charAt(arg0);
    }

    public void clear() {
        real.clear();
    }

    public void clearSpans() {
        real.clearSpans();
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder delete(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.delete(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
        real.getChars(arg0, arg1, arg2, arg3);
    }

    public android.text.InputFilter[] getFilters() {
        return real.getFilters();
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

    public int getTextRunCursor(int arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint arg5) {
        return real.getTextRunCursor(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public int getTextWatcherDepth() {
        return real.getTextWatcherDepth();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder insert(int arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.insert(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder insert(int arg0, java.lang.CharSequence arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.insert(arg0, arg1, arg2, arg3));
    }

    public int length() {
        return real.length();
    }

    public void removeSpan(java.lang.Object arg0) {
        real.removeSpan(arg0);
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder replace(int arg0, int arg1, java.lang.CharSequence arg2) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.replace(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.text.SpannableStringBuilder replace(int arg0, int arg1, java.lang.CharSequence arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(real.replace(arg0, arg1, arg2, arg3, arg4));
    }

    public void setFilters(android.text.InputFilter[] arg0) {
        real.setFilters(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        real.setSpan(arg0, arg1, arg2, arg3);
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return real.subSequence(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static com.micklab.dcg.wrapper.android.text.SpannableStringBuilder valueOf(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.SpannableStringBuilder.wrap(android.text.SpannableStringBuilder.valueOf(arg0));
    }

}
