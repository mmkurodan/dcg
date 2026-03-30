// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class DebugUtils {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DebugUtils(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.DebugUtils wrap(android.util.DebugUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.DebugUtils(real, (__DcgwBridgeToken) null);
    }

    public android.util.DebugUtils getReal() {
        return (android.util.DebugUtils) real;
    }

    public android.util.DebugUtils unwrap() {
        return getReal();
    }

    public static boolean isObjectSelected(java.lang.Object arg0) {
        return android.util.DebugUtils.isObjectSelected(arg0);
    }

}
