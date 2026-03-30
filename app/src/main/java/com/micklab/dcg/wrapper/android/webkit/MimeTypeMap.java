// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class MimeTypeMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MimeTypeMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.MimeTypeMap wrap(android.webkit.MimeTypeMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.MimeTypeMap(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.MimeTypeMap getReal() {
        return (android.webkit.MimeTypeMap) real;
    }

    public android.webkit.MimeTypeMap unwrap() {
        return getReal();
    }

    public java.lang.String getExtensionFromMimeType(java.lang.String arg0) {
        return ((android.webkit.MimeTypeMap) real).getExtensionFromMimeType(arg0);
    }

    public static java.lang.String getFileExtensionFromUrl(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.MimeTypeMap#getFileExtensionFromUrl(java.lang.String)");
    }

    public java.lang.String getMimeTypeFromExtension(java.lang.String arg0) {
        return ((android.webkit.MimeTypeMap) real).getMimeTypeFromExtension(arg0);
    }

    public static com.micklab.dcg.wrapper.android.webkit.MimeTypeMap getSingleton() {
        return com.micklab.dcg.wrapper.android.webkit.MimeTypeMap.wrap(android.webkit.MimeTypeMap.getSingleton());
    }

    public boolean hasExtension(java.lang.String arg0) {
        return ((android.webkit.MimeTypeMap) real).hasExtension(arg0);
    }

    public boolean hasMimeType(java.lang.String arg0) {
        return ((android.webkit.MimeTypeMap) real).hasMimeType(arg0);
    }

}
