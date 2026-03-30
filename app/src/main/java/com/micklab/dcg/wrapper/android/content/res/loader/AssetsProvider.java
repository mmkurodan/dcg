// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res.loader;

public final class AssetsProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssetsProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider wrap(android.content.res.loader.AssetsProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.loader.AssetsProvider getReal() {
        return (android.content.res.loader.AssetsProvider) real;
    }

    public android.content.res.loader.AssetsProvider unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor loadAssetFd(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(((android.content.res.loader.AssetsProvider) real).loadAssetFd(arg0, arg1));
    }

}
