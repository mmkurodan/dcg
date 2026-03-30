// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class MenuInflater {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MenuInflater(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.MenuInflater wrap(android.view.MenuInflater real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.MenuInflater(real, (__DcgwBridgeToken) null);
    }

    public android.view.MenuInflater getReal() {
        return (android.view.MenuInflater) real;
    }

    public android.view.MenuInflater unwrap() {
        return getReal();
    }

    public MenuInflater(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.MenuInflater(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void inflate(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        ((android.view.MenuInflater) real).inflate(arg0, arg1 == null ? null : arg1.getReal());
    }

}
