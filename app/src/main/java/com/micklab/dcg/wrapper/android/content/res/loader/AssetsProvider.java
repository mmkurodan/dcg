// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res.loader;

public final class AssetsProvider {
    private final android.content.res.loader.AssetsProvider real;

    public AssetsProvider(android.content.res.loader.AssetsProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider wrap(android.content.res.loader.AssetsProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider(real);
    }

    public android.content.res.loader.AssetsProvider unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor loadAssetFd(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(real.loadAssetFd(arg0, arg1));
    }

}
