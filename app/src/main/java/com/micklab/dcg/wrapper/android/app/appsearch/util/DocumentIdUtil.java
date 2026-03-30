// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.util;

public final class DocumentIdUtil {
    private final android.app.appsearch.util.DocumentIdUtil real;

    public DocumentIdUtil(android.app.appsearch.util.DocumentIdUtil real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.util.DocumentIdUtil wrap(android.app.appsearch.util.DocumentIdUtil real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.util.DocumentIdUtil(real);
    }

    public android.app.appsearch.util.DocumentIdUtil unwrap() {
        return real;
    }

    public static java.lang.String createQualifiedId(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg2) {
        return android.app.appsearch.util.DocumentIdUtil.createQualifiedId(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static java.lang.String createQualifiedId(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        return android.app.appsearch.util.DocumentIdUtil.createQualifiedId(arg0, arg1, arg2, arg3);
    }

}
