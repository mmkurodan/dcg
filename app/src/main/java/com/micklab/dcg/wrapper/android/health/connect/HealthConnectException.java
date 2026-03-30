// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class HealthConnectException {
    private final android.health.connect.HealthConnectException real;

    public HealthConnectException(android.health.connect.HealthConnectException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.HealthConnectException wrap(android.health.connect.HealthConnectException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.HealthConnectException(real);
    }

    public android.health.connect.HealthConnectException unwrap() {
        return real;
    }

    public int getErrorCode() {
        return real.getErrorCode();
    }

    public static final int ERROR_DATA_SYNC_IN_PROGRESS = android.health.connect.HealthConnectException.ERROR_DATA_SYNC_IN_PROGRESS;
    public static final int ERROR_INTERNAL = android.health.connect.HealthConnectException.ERROR_INTERNAL;
    public static final int ERROR_INVALID_ARGUMENT = android.health.connect.HealthConnectException.ERROR_INVALID_ARGUMENT;
    public static final int ERROR_IO = android.health.connect.HealthConnectException.ERROR_IO;
    public static final int ERROR_RATE_LIMIT_EXCEEDED = android.health.connect.HealthConnectException.ERROR_RATE_LIMIT_EXCEEDED;
    public static final int ERROR_REMOTE = android.health.connect.HealthConnectException.ERROR_REMOTE;
    public static final int ERROR_SECURITY = android.health.connect.HealthConnectException.ERROR_SECURITY;
    public static final int ERROR_UNKNOWN = android.health.connect.HealthConnectException.ERROR_UNKNOWN;
    public static final int ERROR_UNSUPPORTED_OPERATION = android.health.connect.HealthConnectException.ERROR_UNSUPPORTED_OPERATION;

}
