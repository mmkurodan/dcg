// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class TransformationMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransformationMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.TransformationMethod wrap(android.text.method.TransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.TransformationMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.TransformationMethod getReal() {
        return (android.text.method.TransformationMethod) real;
    }

    public android.text.method.TransformationMethod unwrap() {
        return getReal();
    }

    public java.lang.CharSequence getTransformation(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return ((android.text.method.TransformationMethod) real).getTransformation(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.CharSequence arg1, boolean arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        ((android.text.method.TransformationMethod) real).onFocusChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

}
