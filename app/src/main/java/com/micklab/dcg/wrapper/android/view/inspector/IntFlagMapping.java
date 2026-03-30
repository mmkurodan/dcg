// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class IntFlagMapping {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntFlagMapping(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.IntFlagMapping wrap(android.view.inspector.IntFlagMapping real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.IntFlagMapping(real, (__DcgwBridgeToken) null);
    }

    public android.view.inspector.IntFlagMapping getReal() {
        return (android.view.inspector.IntFlagMapping) real;
    }

    public android.view.inspector.IntFlagMapping unwrap() {
        return getReal();
    }

    public IntFlagMapping() {
        this(new android.view.inspector.IntFlagMapping(), (__DcgwBridgeToken) null);
    }

    public void add(int arg0, int arg1, java.lang.String arg2) {
        ((android.view.inspector.IntFlagMapping) real).add(arg0, arg1, arg2);
    }

}
