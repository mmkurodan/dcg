// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res.loader;

public final class ResourcesProvider {
    private final android.content.res.loader.ResourcesProvider real;

    public ResourcesProvider(android.content.res.loader.ResourcesProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider wrap(android.content.res.loader.ResourcesProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider(real);
    }

    public android.content.res.loader.ResourcesProvider unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider empty(com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider arg0) {
        return com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider.wrap(android.content.res.loader.ResourcesProvider.empty(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider loadFromApk(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider.wrap(android.content.res.loader.ResourcesProvider.loadFromApk(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider loadFromApk(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider.wrap(android.content.res.loader.ResourcesProvider.loadFromApk(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider loadFromDirectory(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider.wrap(android.content.res.loader.ResourcesProvider.loadFromDirectory(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider loadFromSplit(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider.wrap(android.content.res.loader.ResourcesProvider.loadFromSplit(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider loadFromTable(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.content.res.loader.AssetsProvider arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider.wrap(android.content.res.loader.ResourcesProvider.loadFromTable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider loadOverlay(com.micklab.dcg.wrapper.android.content.om.OverlayInfo arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider.wrap(android.content.res.loader.ResourcesProvider.loadOverlay(arg0 == null ? null : arg0.unwrap()));
    }

}
