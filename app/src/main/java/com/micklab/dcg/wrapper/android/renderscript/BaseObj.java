// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class BaseObj {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BaseObj(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.BaseObj wrap(android.renderscript.BaseObj real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.BaseObj(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.BaseObj getReal() {
        return (android.renderscript.BaseObj) real;
    }

    public android.renderscript.BaseObj unwrap() {
        return getReal();
    }

    public void destroy() {
        ((android.renderscript.BaseObj) real).destroy();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.renderscript.BaseObj) real).equals(arg0);
    }

    public java.lang.String getName() {
        return ((android.renderscript.BaseObj) real).getName();
    }

    public int hashCode() {
        return ((android.renderscript.BaseObj) real).hashCode();
    }

    public void setName(java.lang.String arg0) {
        ((android.renderscript.BaseObj) real).setName(arg0);
    }

}
