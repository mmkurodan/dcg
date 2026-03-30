// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class ReplacementTransformationMethod {
    private final android.text.method.ReplacementTransformationMethod real;

    public ReplacementTransformationMethod(android.text.method.ReplacementTransformationMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.ReplacementTransformationMethod wrap(android.text.method.ReplacementTransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.ReplacementTransformationMethod(real);
    }

    public android.text.method.ReplacementTransformationMethod unwrap() {
        return real;
    }

    public java.lang.CharSequence getTransformation(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return real.getTransformation(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.CharSequence arg1, boolean arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        real.onFocusChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

}
