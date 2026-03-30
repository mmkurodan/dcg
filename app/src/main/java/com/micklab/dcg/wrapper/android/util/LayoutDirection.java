// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LayoutDirection {
    private final android.util.LayoutDirection real;

    public LayoutDirection(android.util.LayoutDirection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LayoutDirection wrap(android.util.LayoutDirection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LayoutDirection(real);
    }

    public android.util.LayoutDirection unwrap() {
        return real;
    }

    public static final int INHERIT = android.util.LayoutDirection.INHERIT;
    public static final int LOCALE = android.util.LayoutDirection.LOCALE;
    public static final int LTR = android.util.LayoutDirection.LTR;
    public static final int RTL = android.util.LayoutDirection.RTL;

}
