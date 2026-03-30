// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class ReplacementTransformationMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReplacementTransformationMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.ReplacementTransformationMethod wrap(android.text.method.ReplacementTransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.ReplacementTransformationMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.ReplacementTransformationMethod getReal() {
        return (android.text.method.ReplacementTransformationMethod) real;
    }

    public android.text.method.ReplacementTransformationMethod unwrap() {
        return getReal();
    }

    public java.lang.CharSequence getTransformation(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return ((android.text.method.ReplacementTransformationMethod) real).getTransformation(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.CharSequence arg1, boolean arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        ((android.text.method.ReplacementTransformationMethod) real).onFocusChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

}
