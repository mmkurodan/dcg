// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class SingleLineTransformationMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SingleLineTransformationMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod wrap(android.text.method.SingleLineTransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.SingleLineTransformationMethod getReal() {
        return (android.text.method.SingleLineTransformationMethod) real;
    }

    public android.text.method.SingleLineTransformationMethod unwrap() {
        return getReal();
    }

    public SingleLineTransformationMethod() {
        this(new android.text.method.SingleLineTransformationMethod(), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.SingleLineTransformationMethod.wrap(android.text.method.SingleLineTransformationMethod.getInstance());
    }

}
