// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class OpenableColumns {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OpenableColumns(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.OpenableColumns wrap(android.provider.OpenableColumns real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.OpenableColumns(real, (__DcgwBridgeToken) null);
    }

    public android.provider.OpenableColumns getReal() {
        return (android.provider.OpenableColumns) real;
    }

    public android.provider.OpenableColumns unwrap() {
        return getReal();
    }

    public static final java.lang.String DISPLAY_NAME = android.provider.OpenableColumns.DISPLAY_NAME;
    public static final java.lang.String SIZE = android.provider.OpenableColumns.SIZE;

}
