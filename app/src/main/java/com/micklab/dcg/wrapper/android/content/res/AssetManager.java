// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class AssetManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssetManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.AssetManager wrap(android.content.res.AssetManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.AssetManager(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.AssetManager getReal() {
        return (android.content.res.AssetManager) real;
    }

    public android.content.res.AssetManager unwrap() {
        return getReal();
    }

    public void close() {
        ((android.content.res.AssetManager) real).close();
    }

    public java.lang.String[] getLocales() {
        return ((android.content.res.AssetManager) real).getLocales();
    }

    public java.lang.String[] list(java.lang.String arg0) throws java.io.IOException {
        return ((android.content.res.AssetManager) real).list(arg0);
    }

    public java.io.InputStream open(java.lang.String arg0) throws java.io.IOException {
        return ((android.content.res.AssetManager) real).open(arg0);
    }

    public java.io.InputStream open(java.lang.String arg0, int arg1) throws java.io.IOException {
        return ((android.content.res.AssetManager) real).open(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openFd(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(((android.content.res.AssetManager) real).openFd(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openNonAssetFd(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(((android.content.res.AssetManager) real).openNonAssetFd(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openNonAssetFd(int arg0, java.lang.String arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(((android.content.res.AssetManager) real).openNonAssetFd(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.res.XmlResourceParser openXmlResourceParser(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.XmlResourceParser.wrap(((android.content.res.AssetManager) real).openXmlResourceParser(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.XmlResourceParser openXmlResourceParser(int arg0, java.lang.String arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.XmlResourceParser.wrap(((android.content.res.AssetManager) real).openXmlResourceParser(arg0, arg1));
    }

    public static final int ACCESS_BUFFER = android.content.res.AssetManager.ACCESS_BUFFER;
    public static final int ACCESS_RANDOM = android.content.res.AssetManager.ACCESS_RANDOM;
    public static final int ACCESS_STREAMING = android.content.res.AssetManager.ACCESS_STREAMING;
    public static final int ACCESS_UNKNOWN = android.content.res.AssetManager.ACCESS_UNKNOWN;

}
