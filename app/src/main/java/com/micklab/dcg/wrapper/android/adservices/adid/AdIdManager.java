// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adid;

public final class AdIdManager {
    private final android.adservices.adid.AdIdManager real;

    public AdIdManager(android.adservices.adid.AdIdManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager wrap(android.adservices.adid.AdIdManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager(real);
    }

    public android.adservices.adid.AdIdManager unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager.wrap(android.adservices.adid.AdIdManager.get(arg0 == null ? null : arg0.unwrap()));
    }

}
