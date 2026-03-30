// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class Freezable {
    private final android.icu.util.Freezable real;

    public Freezable(android.icu.util.Freezable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Freezable wrap(android.icu.util.Freezable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Freezable(real);
    }

    public android.icu.util.Freezable unwrap() {
        return real;
    }

    public java.lang.Object cloneAsThawed() {
        return real.cloneAsThawed();
    }

    public java.lang.Object freeze() {
        return real.freeze();
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

}
