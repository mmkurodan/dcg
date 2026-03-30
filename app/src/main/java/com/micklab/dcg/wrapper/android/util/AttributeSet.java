// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AttributeSet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AttributeSet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AttributeSet wrap(android.util.AttributeSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AttributeSet(real, (__DcgwBridgeToken) null);
    }

    public android.util.AttributeSet getReal() {
        return (android.util.AttributeSet) real;
    }

    public android.util.AttributeSet unwrap() {
        return getReal();
    }

    public boolean getAttributeBooleanValue(int arg0, boolean arg1) {
        return ((android.util.AttributeSet) real).getAttributeBooleanValue(arg0, arg1);
    }

    public boolean getAttributeBooleanValue(java.lang.String arg0, java.lang.String arg1, boolean arg2) {
        return ((android.util.AttributeSet) real).getAttributeBooleanValue(arg0, arg1, arg2);
    }

    public int getAttributeCount() {
        return ((android.util.AttributeSet) real).getAttributeCount();
    }

    public float getAttributeFloatValue(int arg0, float arg1) {
        return ((android.util.AttributeSet) real).getAttributeFloatValue(arg0, arg1);
    }

    public float getAttributeFloatValue(java.lang.String arg0, java.lang.String arg1, float arg2) {
        return ((android.util.AttributeSet) real).getAttributeFloatValue(arg0, arg1, arg2);
    }

    public int getAttributeIntValue(int arg0, int arg1) {
        return ((android.util.AttributeSet) real).getAttributeIntValue(arg0, arg1);
    }

    public int getAttributeIntValue(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return ((android.util.AttributeSet) real).getAttributeIntValue(arg0, arg1, arg2);
    }

    public int getAttributeListValue(int arg0, java.lang.String[] arg1, int arg2) {
        return ((android.util.AttributeSet) real).getAttributeListValue(arg0, arg1, arg2);
    }

    public int getAttributeListValue(java.lang.String arg0, java.lang.String arg1, java.lang.String[] arg2, int arg3) {
        return ((android.util.AttributeSet) real).getAttributeListValue(arg0, arg1, arg2, arg3);
    }

    public java.lang.String getAttributeName(int arg0) {
        return ((android.util.AttributeSet) real).getAttributeName(arg0);
    }

    public int getAttributeNameResource(int arg0) {
        return ((android.util.AttributeSet) real).getAttributeNameResource(arg0);
    }

    public java.lang.String getAttributeNamespace(int arg0) {
        return ((android.util.AttributeSet) real).getAttributeNamespace(arg0);
    }

    public int getAttributeResourceValue(int arg0, int arg1) {
        return ((android.util.AttributeSet) real).getAttributeResourceValue(arg0, arg1);
    }

    public int getAttributeResourceValue(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return ((android.util.AttributeSet) real).getAttributeResourceValue(arg0, arg1, arg2);
    }

    public int getAttributeUnsignedIntValue(int arg0, int arg1) {
        return ((android.util.AttributeSet) real).getAttributeUnsignedIntValue(arg0, arg1);
    }

    public int getAttributeUnsignedIntValue(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return ((android.util.AttributeSet) real).getAttributeUnsignedIntValue(arg0, arg1, arg2);
    }

    public java.lang.String getAttributeValue(int arg0) {
        return ((android.util.AttributeSet) real).getAttributeValue(arg0);
    }

    public java.lang.String getAttributeValue(java.lang.String arg0, java.lang.String arg1) {
        return ((android.util.AttributeSet) real).getAttributeValue(arg0, arg1);
    }

    public java.lang.String getClassAttribute() {
        return ((android.util.AttributeSet) real).getClassAttribute();
    }

    public java.lang.String getIdAttribute() {
        return ((android.util.AttributeSet) real).getIdAttribute();
    }

    public int getIdAttributeResourceValue(int arg0) {
        return ((android.util.AttributeSet) real).getIdAttributeResourceValue(arg0);
    }

    public java.lang.String getPositionDescription() {
        return ((android.util.AttributeSet) real).getPositionDescription();
    }

    public int getStyleAttribute() {
        return ((android.util.AttributeSet) real).getStyleAttribute();
    }

}
