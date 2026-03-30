// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.ext;

public final class SdkExtensions {
    private final android.os.ext.SdkExtensions real;

    public SdkExtensions(android.os.ext.SdkExtensions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ext.SdkExtensions wrap(android.os.ext.SdkExtensions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ext.SdkExtensions(real);
    }

    public android.os.ext.SdkExtensions unwrap() {
        return real;
    }

    public static int getExtensionVersion(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ext.SdkExtensions#getExtensionVersion(int)");
    }


}
