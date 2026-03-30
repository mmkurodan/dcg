// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class Freezable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Freezable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Freezable wrap(android.icu.util.Freezable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Freezable(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.Freezable getReal() {
        return (android.icu.util.Freezable) real;
    }

    public android.icu.util.Freezable unwrap() {
        return getReal();
    }

    public java.lang.Object cloneAsThawed() {
        return ((android.icu.util.Freezable) real).cloneAsThawed();
    }

    public java.lang.Object freeze() {
        return ((android.icu.util.Freezable) real).freeze();
    }

    public boolean isFrozen() {
        return ((android.icu.util.Freezable) real).isFrozen();
    }

}
