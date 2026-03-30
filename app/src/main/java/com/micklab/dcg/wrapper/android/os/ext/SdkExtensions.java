// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.ext;

public final class SdkExtensions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SdkExtensions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ext.SdkExtensions wrap(android.os.ext.SdkExtensions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ext.SdkExtensions(real, (__DcgwBridgeToken) null);
    }

    public android.os.ext.SdkExtensions getReal() {
        return (android.os.ext.SdkExtensions) real;
    }

    public android.os.ext.SdkExtensions unwrap() {
        return getReal();
    }

    public static int getExtensionVersion(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ext.SdkExtensions#getExtensionVersion(int)");
    }


}
