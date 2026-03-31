// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.annotation;

public final class TargetApi {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TargetApi(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.annotation.TargetApi wrap(android.annotation.TargetApi real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.annotation.TargetApi(real, (__DcgwBridgeToken) null);
    }

    public android.annotation.TargetApi getReal() {
        return (android.annotation.TargetApi) real;
    }

    public android.annotation.TargetApi unwrap() {
        return getReal();
    }

    public int value() {
        return ((android.annotation.TargetApi) real).value();
    }

}
