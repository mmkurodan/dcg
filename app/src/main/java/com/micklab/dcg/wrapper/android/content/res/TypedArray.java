// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class TypedArray {
    private final android.content.res.TypedArray real;

    public TypedArray(android.content.res.TypedArray real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.TypedArray wrap(android.content.res.TypedArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.TypedArray(real);
    }

    public android.content.res.TypedArray unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public boolean getBoolean(int arg0, boolean arg1) {
        return real.getBoolean(arg0, arg1);
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public int getColor(int arg0, int arg1) {
        return real.getColor(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColorStateList(int arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getColorStateList(arg0));
    }

    public float getDimension(int arg0, float arg1) {
        return real.getDimension(arg0, arg1);
    }

    public int getDimensionPixelOffset(int arg0, int arg1) {
        return real.getDimensionPixelOffset(arg0, arg1);
    }

    public int getDimensionPixelSize(int arg0, int arg1) {
        return real.getDimensionPixelSize(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDrawable(arg0));
    }

    public float getFloat(int arg0, float arg1) {
        return real.getFloat(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getFont(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.getFont(arg0));
    }

    public float getFraction(int arg0, int arg1, int arg2, float arg3) {
        return real.getFraction(arg0, arg1, arg2, arg3);
    }

    public int getIndex(int arg0) {
        return real.getIndex(arg0);
    }

    public int getIndexCount() {
        return real.getIndexCount();
    }

    public int getInt(int arg0, int arg1) {
        return real.getInt(arg0, arg1);
    }

    public int getInteger(int arg0, int arg1) {
        return real.getInteger(arg0, arg1);
    }

    public int getLayoutDimension(int arg0, java.lang.String arg1) {
        return real.getLayoutDimension(arg0, arg1);
    }

    public int getLayoutDimension(int arg0, int arg1) {
        return real.getLayoutDimension(arg0, arg1);
    }

    public java.lang.String getNonResourceString(int arg0) {
        return real.getNonResourceString(arg0);
    }

    public java.lang.String getPositionDescription() {
        return real.getPositionDescription();
    }

    public int getResourceId(int arg0, int arg1) {
        return real.getResourceId(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(real.getResources());
    }

    public int getSourceResourceId(int arg0, int arg1) {
        return real.getSourceResourceId(arg0, arg1);
    }

    public java.lang.String getString(int arg0) {
        return real.getString(arg0);
    }

    public java.lang.CharSequence getText(int arg0) {
        return real.getText(arg0);
    }

    public java.lang.CharSequence[] getTextArray(int arg0) {
        return real.getTextArray(arg0);
    }

    public int getType(int arg0) {
        return real.getType(arg0);
    }

    public boolean getValue(int arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1) {
        return real.getValue(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean hasValue(int arg0) {
        return real.hasValue(arg0);
    }

    public boolean hasValueOrEmpty(int arg0) {
        return real.hasValueOrEmpty(arg0);
    }

    public int length() {
        return real.length();
    }

    public com.micklab.dcg.wrapper.android.util.TypedValue peekValue(int arg0) {
        return com.micklab.dcg.wrapper.android.util.TypedValue.wrap(real.peekValue(arg0));
    }

    public void recycle() {
        real.recycle();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
