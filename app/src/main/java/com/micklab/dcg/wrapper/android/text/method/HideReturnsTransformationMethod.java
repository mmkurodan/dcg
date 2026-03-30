// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class HideReturnsTransformationMethod {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HideReturnsTransformationMethod(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.HideReturnsTransformationMethod wrap(android.text.method.HideReturnsTransformationMethod real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.HideReturnsTransformationMethod(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.HideReturnsTransformationMethod getReal() {
        return (android.text.method.HideReturnsTransformationMethod) real;
    }

    public android.text.method.HideReturnsTransformationMethod unwrap() {
        return getReal();
    }

    public HideReturnsTransformationMethod() {
        this(new android.text.method.HideReturnsTransformationMethod(), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.text.method.HideReturnsTransformationMethod getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.HideReturnsTransformationMethod.wrap(android.text.method.HideReturnsTransformationMethod.getInstance());
    }

}
