// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res.loader;

public final class ResourcesLoader {
    private final android.content.res.loader.ResourcesLoader real;

    public ResourcesLoader(android.content.res.loader.ResourcesLoader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.loader.ResourcesLoader wrap(android.content.res.loader.ResourcesLoader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.loader.ResourcesLoader(real);
    }

    public android.content.res.loader.ResourcesLoader unwrap() {
        return real;
    }

    public ResourcesLoader() {
        this(new android.content.res.loader.ResourcesLoader());
    }

    public void addProvider(com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider arg0) {
        real.addProvider(arg0 == null ? null : arg0.unwrap());
    }

    public void clearProviders() {
        real.clearProviders();
    }

    public void removeProvider(com.micklab.dcg.wrapper.android.content.res.loader.ResourcesProvider arg0) {
        real.removeProvider(arg0 == null ? null : arg0.unwrap());
    }

}
