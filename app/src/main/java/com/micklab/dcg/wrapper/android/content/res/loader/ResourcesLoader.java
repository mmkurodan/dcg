// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res.loader;

public final class ResourcesLoader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ResourcesLoader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesLoader wrap(android.content.res.loader.ResourcesLoader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.loader.ResourcesLoader(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.loader.ResourcesLoader getReal() {
        return (android.content.res.loader.ResourcesLoader) real;
    }

    public android.content.res.loader.ResourcesLoader unwrap() {
        return getReal();
    }

    public ResourcesLoader() {
        this(new android.content.res.loader.ResourcesLoader(), (__DcgwBridgeToken) null);
    }

    public void addProvider(com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider arg0) {
        ((android.content.res.loader.ResourcesLoader) real).addProvider(arg0 == null ? null : arg0.getReal());
    }

    public void clearProviders() {
        ((android.content.res.loader.ResourcesLoader) real).clearProviders();
    }

    public void removeProvider(com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider arg0) {
        ((android.content.res.loader.ResourcesLoader) real).removeProvider(arg0 == null ? null : arg0.getReal());
    }

}
