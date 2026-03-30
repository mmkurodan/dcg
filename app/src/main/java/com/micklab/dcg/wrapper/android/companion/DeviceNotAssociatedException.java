// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class DeviceNotAssociatedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceNotAssociatedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.DeviceNotAssociatedException wrap(android.companion.DeviceNotAssociatedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.DeviceNotAssociatedException(real, (__DcgwBridgeToken) null);
    }

    public android.companion.DeviceNotAssociatedException getReal() {
        return (android.companion.DeviceNotAssociatedException) real;
    }

    public android.companion.DeviceNotAssociatedException unwrap() {
        return getReal();
    }

}
