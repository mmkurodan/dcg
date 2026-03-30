// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AttributeSet {
    private final android.util.AttributeSet real;

    public AttributeSet(android.util.AttributeSet real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AttributeSet wrap(android.util.AttributeSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AttributeSet(real);
    }

    public android.util.AttributeSet unwrap() {
        return real;
    }

    public boolean getAttributeBooleanValue(int arg0, boolean arg1) {
        return real.getAttributeBooleanValue(arg0, arg1);
    }

    public boolean getAttributeBooleanValue(java.lang.String arg0, java.lang.String arg1, boolean arg2) {
        return real.getAttributeBooleanValue(arg0, arg1, arg2);
    }

    public int getAttributeCount() {
        return real.getAttributeCount();
    }

    public float getAttributeFloatValue(int arg0, float arg1) {
        return real.getAttributeFloatValue(arg0, arg1);
    }

    public float getAttributeFloatValue(java.lang.String arg0, java.lang.String arg1, float arg2) {
        return real.getAttributeFloatValue(arg0, arg1, arg2);
    }

    public int getAttributeIntValue(int arg0, int arg1) {
        return real.getAttributeIntValue(arg0, arg1);
    }

    public int getAttributeIntValue(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.getAttributeIntValue(arg0, arg1, arg2);
    }

    public int getAttributeListValue(int arg0, java.lang.String[] arg1, int arg2) {
        return real.getAttributeListValue(arg0, arg1, arg2);
    }

    public int getAttributeListValue(java.lang.String arg0, java.lang.String arg1, java.lang.String[] arg2, int arg3) {
        return real.getAttributeListValue(arg0, arg1, arg2, arg3);
    }

    public java.lang.String getAttributeName(int arg0) {
        return real.getAttributeName(arg0);
    }

    public int getAttributeNameResource(int arg0) {
        return real.getAttributeNameResource(arg0);
    }

    public java.lang.String getAttributeNamespace(int arg0) {
        return real.getAttributeNamespace(arg0);
    }

    public int getAttributeResourceValue(int arg0, int arg1) {
        return real.getAttributeResourceValue(arg0, arg1);
    }

    public int getAttributeResourceValue(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.getAttributeResourceValue(arg0, arg1, arg2);
    }

    public int getAttributeUnsignedIntValue(int arg0, int arg1) {
        return real.getAttributeUnsignedIntValue(arg0, arg1);
    }

    public int getAttributeUnsignedIntValue(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.getAttributeUnsignedIntValue(arg0, arg1, arg2);
    }

    public java.lang.String getAttributeValue(int arg0) {
        return real.getAttributeValue(arg0);
    }

    public java.lang.String getAttributeValue(java.lang.String arg0, java.lang.String arg1) {
        return real.getAttributeValue(arg0, arg1);
    }

    public java.lang.String getClassAttribute() {
        return real.getClassAttribute();
    }

    public java.lang.String getIdAttribute() {
        return real.getIdAttribute();
    }

    public int getIdAttributeResourceValue(int arg0) {
        return real.getIdAttributeResourceValue(arg0);
    }

    public java.lang.String getPositionDescription() {
        return real.getPositionDescription();
    }

    public int getStyleAttribute() {
        return real.getStyleAttribute();
    }

}
