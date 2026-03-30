// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.util;

public final class DocumentIdUtil {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DocumentIdUtil(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.util.DocumentIdUtil wrap(android.app.appsearch.util.DocumentIdUtil real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.util.DocumentIdUtil(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.util.DocumentIdUtil getReal() {
        return (android.app.appsearch.util.DocumentIdUtil) real;
    }

    public android.app.appsearch.util.DocumentIdUtil unwrap() {
        return getReal();
    }

    public static java.lang.String createQualifiedId(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg2) {
        return android.app.appsearch.util.DocumentIdUtil.createQualifiedId(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public static java.lang.String createQualifiedId(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        return android.app.appsearch.util.DocumentIdUtil.createQualifiedId(arg0, arg1, arg2, arg3);
    }

}
