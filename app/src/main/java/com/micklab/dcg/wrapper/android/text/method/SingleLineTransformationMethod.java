// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class SingleLineTransformationMethod {
    private final android.text.method.SingleLineTransformationMethod real;

    public SingleLineTransformationMethod(android.text.method.SingleLineTransformationMethod real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod wrap(android.text.method.SingleLineTransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod(real);
    }

    public android.text.method.SingleLineTransformationMethod unwrap() {
        return real;
    }

    public SingleLineTransformationMethod() {
        this(new android.text.method.SingleLineTransformationMethod());
    }

    public static com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod.wrap(android.text.method.SingleLineTransformationMethod.getInstance());
    }

}
