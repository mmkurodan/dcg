// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class DebugUtils {
    private final android.util.DebugUtils real;

    public DebugUtils(android.util.DebugUtils real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.DebugUtils wrap(android.util.DebugUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.DebugUtils(real);
    }

    public android.util.DebugUtils unwrap() {
        return real;
    }

    public static boolean isObjectSelected(java.lang.Object arg0) {
        return android.util.DebugUtils.isObjectSelected(arg0);
    }

}
