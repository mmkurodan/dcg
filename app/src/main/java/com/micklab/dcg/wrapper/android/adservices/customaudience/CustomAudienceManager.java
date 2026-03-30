// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class CustomAudienceManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CustomAudienceManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager wrap(android.adservices.customaudience.CustomAudienceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.CustomAudienceManager getReal() {
        return (android.adservices.customaudience.CustomAudienceManager) real;
    }

    public android.adservices.customaudience.CustomAudienceManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudienceManager.wrap(android.adservices.customaudience.CustomAudienceManager.get(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.adservices.customaudience.TestCustomAudienceManager getTestCustomAudienceManager() {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.TestCustomAudienceManager.wrap(((android.adservices.customaudience.CustomAudienceManager) real).getTestCustomAudienceManager());
    }

}
