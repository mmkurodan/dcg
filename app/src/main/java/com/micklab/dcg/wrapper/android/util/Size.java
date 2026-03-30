// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Size {
    private final android.util.Size real;

    public Size(android.util.Size real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Size wrap(android.util.Size real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Size(real);
    }

    public android.util.Size unwrap() {
        return real;
    }

    public Size(int arg0, int arg1) {
        this(new android.util.Size(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static com.micklab.dcg.wrapper.android.util.Size parseSize(java.lang.String arg0) throws java.lang.NumberFormatException {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(android.util.Size.parseSize(arg0));
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
