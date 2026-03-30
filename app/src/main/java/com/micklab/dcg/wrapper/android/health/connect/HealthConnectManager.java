// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class HealthConnectManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HealthConnectManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.HealthConnectManager wrap(android.health.connect.HealthConnectManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.HealthConnectManager(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.HealthConnectManager getReal() {
        return (android.health.connect.HealthConnectManager) real;
    }

    public android.health.connect.HealthConnectManager unwrap() {
        return getReal();
    }

    public static final java.lang.String ACTION_MANAGE_HEALTH_PERMISSIONS = android.health.connect.HealthConnectManager.ACTION_MANAGE_HEALTH_PERMISSIONS;
    public static final java.lang.String ACTION_REQUEST_EXERCISE_ROUTE = android.health.connect.HealthConnectManager.ACTION_REQUEST_EXERCISE_ROUTE;
    public static final java.lang.String CATEGORY_HEALTH_PERMISSIONS = android.health.connect.HealthConnectManager.CATEGORY_HEALTH_PERMISSIONS;
    public static final java.lang.String EXTRA_EXERCISE_ROUTE = android.health.connect.HealthConnectManager.EXTRA_EXERCISE_ROUTE;
    public static final java.lang.String EXTRA_SESSION_ID = android.health.connect.HealthConnectManager.EXTRA_SESSION_ID;

}
