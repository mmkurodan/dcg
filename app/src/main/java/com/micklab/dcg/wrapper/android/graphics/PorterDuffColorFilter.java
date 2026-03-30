// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PorterDuffColorFilter {
    private final android.graphics.PorterDuffColorFilter real;

    public PorterDuffColorFilter(android.graphics.PorterDuffColorFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PorterDuffColorFilter wrap(android.graphics.PorterDuffColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PorterDuffColorFilter(real);
    }

    public android.graphics.PorterDuffColorFilter unwrap() {
        return real;
    }

    public PorterDuffColorFilter(int arg0, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg1) {
        this(new android.graphics.PorterDuffColorFilter(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

}
