// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class CustomAudienceManager {
    private final android.adservices.customaudience.CustomAudienceManager real;

    public CustomAudienceManager(android.adservices.customaudience.CustomAudienceManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager wrap(android.adservices.customaudience.CustomAudienceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager(real);
    }

    public android.adservices.customaudience.CustomAudienceManager unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager.wrap(android.adservices.customaudience.CustomAudienceManager.get(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.customaudience.TestCustomAudienceManager getTestCustomAudienceManager() {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.TestCustomAudienceManager.wrap(real.getTestCustomAudienceManager());
    }

}
