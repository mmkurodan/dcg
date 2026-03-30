// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DevicePolicyResources {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DevicePolicyResources(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResources wrap(android.app.admin.DevicePolicyResources real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResources(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.DevicePolicyResources getReal() {
        return (android.app.admin.DevicePolicyResources) real;
    }

    public android.app.admin.DevicePolicyResources unwrap() {
        return getReal();
    }

    public static final java.lang.String UNDEFINED = android.app.admin.DevicePolicyResources.UNDEFINED;

}
