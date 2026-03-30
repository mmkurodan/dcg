// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.util;

public final class Rfc822Token {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Rfc822Token(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.util.Rfc822Token wrap(android.text.util.Rfc822Token real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.util.Rfc822Token(real, (__DcgwBridgeToken) null);
    }

    public android.text.util.Rfc822Token getReal() {
        return (android.text.util.Rfc822Token) real;
    }

    public android.text.util.Rfc822Token unwrap() {
        return getReal();
    }

    public Rfc822Token(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.text.util.Rfc822Token(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.text.util.Rfc822Token) real).equals(arg0);
    }

    public java.lang.String getAddress() {
        return ((android.text.util.Rfc822Token) real).getAddress();
    }

    public java.lang.String getComment() {
        return ((android.text.util.Rfc822Token) real).getComment();
    }

    public java.lang.String getName() {
        return ((android.text.util.Rfc822Token) real).getName();
    }

    public int hashCode() {
        return ((android.text.util.Rfc822Token) real).hashCode();
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
        ((android.text.util.Rfc822Token) real).setAddress(arg0);
    }

    public void setComment(java.lang.String arg0) {
        ((android.text.util.Rfc822Token) real).setComment(arg0);
    }

    public void setName(java.lang.String arg0) {
        ((android.text.util.Rfc822Token) real).setName(arg0);
    }

    public java.lang.String toString() {
        return ((android.text.util.Rfc822Token) real).toString();
    }

}
