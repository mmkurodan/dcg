// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class TypedArray {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TypedArray(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.TypedArray wrap(android.content.res.TypedArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.TypedArray(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.TypedArray getReal() {
        return (android.content.res.TypedArray) real;
    }

    public android.content.res.TypedArray unwrap() {
        return getReal();
    }

    public void close() {
        ((android.content.res.TypedArray) real).close();
    }

    public boolean getBoolean(int arg0, boolean arg1) {
        return ((android.content.res.TypedArray) real).getBoolean(arg0, arg1);
    }

    public int getChangingConfigurations() {
        return ((android.content.res.TypedArray) real).getChangingConfigurations();
    }

    public int getColor(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getColor(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColorStateList(int arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.content.res.TypedArray) real).getColorStateList(arg0));
    }

    public float getDimension(int arg0, float arg1) {
        return ((android.content.res.TypedArray) real).getDimension(arg0, arg1);
    }

    public int getDimensionPixelOffset(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getDimensionPixelOffset(arg0, arg1);
    }

    public int getDimensionPixelSize(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getDimensionPixelSize(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.res.TypedArray) real).getDrawable(arg0));
    }

    public float getFloat(int arg0, float arg1) {
        return ((android.content.res.TypedArray) real).getFloat(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getFont(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.content.res.TypedArray) real).getFont(arg0));
    }

    public float getFraction(int arg0, int arg1, int arg2, float arg3) {
        return ((android.content.res.TypedArray) real).getFraction(arg0, arg1, arg2, arg3);
    }

    public int getIndex(int arg0) {
        return ((android.content.res.TypedArray) real).getIndex(arg0);
    }

    public int getIndexCount() {
        return ((android.content.res.TypedArray) real).getIndexCount();
    }

    public int getInt(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getInt(arg0, arg1);
    }

    public int getInteger(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getInteger(arg0, arg1);
    }

    public int getLayoutDimension(int arg0, java.lang.String arg1) {
        return ((android.content.res.TypedArray) real).getLayoutDimension(arg0, arg1);
    }

    public int getLayoutDimension(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getLayoutDimension(arg0, arg1);
    }

    public java.lang.String getNonResourceString(int arg0) {
        return ((android.content.res.TypedArray) real).getNonResourceString(arg0);
    }

    public java.lang.String getPositionDescription() {
        return ((android.content.res.TypedArray) real).getPositionDescription();
    }

    public int getResourceId(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getResourceId(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(((android.content.res.TypedArray) real).getResources());
    }

    public int getSourceResourceId(int arg0, int arg1) {
        return ((android.content.res.TypedArray) real).getSourceResourceId(arg0, arg1);
    }

    public java.lang.String getString(int arg0) {
        return ((android.content.res.TypedArray) real).getString(arg0);
    }

    public java.lang.CharSequence getText(int arg0) {
        return ((android.content.res.TypedArray) real).getText(arg0);
    }

    public java.lang.CharSequence[] getTextArray(int arg0) {
        return ((android.content.res.TypedArray) real).getTextArray(arg0);
    }

    public int getType(int arg0) {
        return ((android.content.res.TypedArray) real).getType(arg0);
    }

    public boolean getValue(int arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1) {
        return ((android.content.res.TypedArray) real).getValue(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean hasValue(int arg0) {
        return ((android.content.res.TypedArray) real).hasValue(arg0);
    }

    public boolean hasValueOrEmpty(int arg0) {
        return ((android.content.res.TypedArray) real).hasValueOrEmpty(arg0);
    }

    public int length() {
        return ((android.content.res.TypedArray) real).length();
    }

    public com.micklab.dcg.wrapper.android.util.TypedValue peekValue(int arg0) {
        return com.micklab.dcg.wrapper.android.util.TypedValue.wrap(((android.content.res.TypedArray) real).peekValue(arg0));
    }

    public void recycle() {
        ((android.content.res.TypedArray) real).recycle();
    }

    public java.lang.String toString() {
        return ((android.content.res.TypedArray) real).toString();
    }

}
