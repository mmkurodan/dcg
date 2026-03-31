// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.annotation;

public final class SuppressLint {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SuppressLint(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.annotation.SuppressLint wrap(android.annotation.SuppressLint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.annotation.SuppressLint(real, (__DcgwBridgeToken) null);
    }

    public android.annotation.SuppressLint getReal() {
        return (android.annotation.SuppressLint) real;
    }

    public android.annotation.SuppressLint unwrap() {
        return getReal();
    }

    public java.lang.String[] value() {
        return ((android.annotation.SuppressLint) real).value();
    }

}
