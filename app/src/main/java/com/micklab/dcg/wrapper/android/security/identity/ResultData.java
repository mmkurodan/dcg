// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class ResultData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ResultData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.ResultData wrap(android.security.identity.ResultData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.ResultData(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.ResultData getReal() {
        return (android.security.identity.ResultData) real;
    }

    public android.security.identity.ResultData unwrap() {
        return getReal();
    }

    public byte[] getAuthenticatedData() {
        return ((android.security.identity.ResultData) real).getAuthenticatedData();
    }

    public byte[] getEntry(java.lang.String arg0, java.lang.String arg1) {
        return ((android.security.identity.ResultData) real).getEntry(arg0, arg1);
    }

    public byte[] getMessageAuthenticationCode() {
        return ((android.security.identity.ResultData) real).getMessageAuthenticationCode();
    }

    public byte[] getStaticAuthenticationData() {
        return ((android.security.identity.ResultData) real).getStaticAuthenticationData();
    }

    public int getStatus(java.lang.String arg0, java.lang.String arg1) {
        return ((android.security.identity.ResultData) real).getStatus(arg0, arg1);
    }

    public static final int STATUS_NOT_IN_REQUEST_MESSAGE = android.security.identity.ResultData.STATUS_NOT_IN_REQUEST_MESSAGE;
    public static final int STATUS_NOT_REQUESTED = android.security.identity.ResultData.STATUS_NOT_REQUESTED;
    public static final int STATUS_NO_SUCH_ENTRY = android.security.identity.ResultData.STATUS_NO_SUCH_ENTRY;
    public static final int STATUS_OK = android.security.identity.ResultData.STATUS_OK;
    public static final int STATUS_READER_AUTHENTICATION_FAILED = android.security.identity.ResultData.STATUS_READER_AUTHENTICATION_FAILED;
    public static final int STATUS_USER_AUTHENTICATION_FAILED = android.security.identity.ResultData.STATUS_USER_AUTHENTICATION_FAILED;

}
