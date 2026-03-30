// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LayoutDirection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LayoutDirection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LayoutDirection wrap(android.util.LayoutDirection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LayoutDirection(real, (__DcgwBridgeToken) null);
    }

    public android.util.LayoutDirection getReal() {
        return (android.util.LayoutDirection) real;
    }

    public android.util.LayoutDirection unwrap() {
        return getReal();
    }

    public static final int INHERIT = android.util.LayoutDirection.INHERIT;
    public static final int LOCALE = android.util.LayoutDirection.LOCALE;
    public static final int LTR = android.util.LayoutDirection.LTR;
    public static final int RTL = android.util.LayoutDirection.RTL;

}
