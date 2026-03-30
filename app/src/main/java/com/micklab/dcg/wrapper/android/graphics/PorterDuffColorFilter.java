// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PorterDuffColorFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PorterDuffColorFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PorterDuffColorFilter wrap(android.graphics.PorterDuffColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PorterDuffColorFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PorterDuffColorFilter getReal() {
        return (android.graphics.PorterDuffColorFilter) real;
    }

    public android.graphics.PorterDuffColorFilter unwrap() {
        return getReal();
    }

    public PorterDuffColorFilter(int arg0, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg1) {
        this(new android.graphics.PorterDuffColorFilter(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.PorterDuffColorFilter) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.graphics.PorterDuffColorFilter) real).hashCode();
    }

}
