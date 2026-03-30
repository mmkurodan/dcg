// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class TestCustomAudienceManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TestCustomAudienceManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.TestCustomAudienceManager wrap(android.adservices.customaudience.TestCustomAudienceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.TestCustomAudienceManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.TestCustomAudienceManager getReal() {
        return (android.adservices.customaudience.TestCustomAudienceManager) real;
    }

    public android.adservices.customaudience.TestCustomAudienceManager unwrap() {
        return getReal();
    }

}
