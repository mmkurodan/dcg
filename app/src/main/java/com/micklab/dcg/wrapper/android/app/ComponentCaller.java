// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ComponentCaller {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ComponentCaller(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ComponentCaller wrap(android.app.ComponentCaller real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ComponentCaller(real, (__DcgwBridgeToken) null);
    }

    public android.app.ComponentCaller getReal() {
        return (android.app.ComponentCaller) real;
    }

    public android.app.ComponentCaller unwrap() {
        return getReal();
    }

    public int checkContentUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return ((android.app.ComponentCaller) real).checkContentUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.ComponentCaller) real).equals(arg0);
    }

    public java.lang.String getPackage() {
        return ((android.app.ComponentCaller) real).getPackage();
    }

    public int getUid() {
        return ((android.app.ComponentCaller) real).getUid();
    }

    public int hashCode() {
        return ((android.app.ComponentCaller) real).hashCode();
    }

}
