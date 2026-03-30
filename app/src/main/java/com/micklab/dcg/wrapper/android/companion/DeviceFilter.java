// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class DeviceFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.DeviceFilter wrap(android.companion.DeviceFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.DeviceFilter(real, (__DcgwBridgeToken) null);
    }

    public android.companion.DeviceFilter getReal() {
        return (android.companion.DeviceFilter) real;
    }

    public android.companion.DeviceFilter unwrap() {
        return getReal();
    }

}
