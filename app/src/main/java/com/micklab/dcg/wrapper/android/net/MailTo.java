// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class MailTo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MailTo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.MailTo wrap(android.net.MailTo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.MailTo(real, (__DcgwBridgeToken) null);
    }

    public android.net.MailTo getReal() {
        return (android.net.MailTo) real;
    }

    public android.net.MailTo unwrap() {
        return getReal();
    }

    public java.lang.String getBody() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MailTo#getBody()");
    }

    public java.lang.String getCc() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MailTo#getCc()");
    }

    public java.lang.String getSubject() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MailTo#getSubject()");
    }

    public java.lang.String getTo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MailTo#getTo()");
    }

    public static boolean isMailTo(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MailTo#isMailTo(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.net.MailTo parse(java.lang.String arg0) throws android.net.ParseException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MailTo#parse(java.lang.String)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.MailTo#toString()");
    }


}
