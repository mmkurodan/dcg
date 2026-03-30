// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class MutableContextWrapper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableContextWrapper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.MutableContextWrapper wrap(android.content.MutableContextWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.MutableContextWrapper(real, (__DcgwBridgeToken) null);
    }

    public android.content.MutableContextWrapper getReal() {
        return (android.content.MutableContextWrapper) real;
    }

    public android.content.MutableContextWrapper unwrap() {
        return getReal();
    }

    public MutableContextWrapper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.MutableContextWrapper(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void setBaseContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
        ((android.content.MutableContextWrapper) real).setBaseContext(arg0 == null ? null : arg0.getReal());
    }

}
