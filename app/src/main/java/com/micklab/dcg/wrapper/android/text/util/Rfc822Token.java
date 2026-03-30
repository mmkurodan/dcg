// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.util;

public final class Rfc822Token {
    private final android.text.util.Rfc822Token real;

    public Rfc822Token(android.text.util.Rfc822Token real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.util.Rfc822Token wrap(android.text.util.Rfc822Token real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.util.Rfc822Token(real);
    }

    public android.text.util.Rfc822Token unwrap() {
        return real;
    }

    public Rfc822Token(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.text.util.Rfc822Token(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getAddress() {
        return real.getAddress();
    }

    public java.lang.String getComment() {
        return real.getComment();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static java.lang.String quoteComment(java.lang.String arg0) {
        return android.text.util.Rfc822Token.quoteComment(arg0);
    }

    public static java.lang.String quoteName(java.lang.String arg0) {
        return android.text.util.Rfc822Token.quoteName(arg0);
    }

    public static java.lang.String quoteNameIfNecessary(java.lang.String arg0) {
        return android.text.util.Rfc822Token.quoteNameIfNecessary(arg0);
    }

    public void setAddress(java.lang.String arg0) {
        real.setAddress(arg0);
    }

    public void setComment(java.lang.String arg0) {
        real.setComment(arg0);
    }

    public void setName(java.lang.String arg0) {
        real.setName(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
