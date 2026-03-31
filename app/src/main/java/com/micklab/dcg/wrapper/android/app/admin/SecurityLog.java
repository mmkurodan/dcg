// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class SecurityLog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SecurityLog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SecurityLog wrap(android.app.admin.SecurityLog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SecurityLog(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.SecurityLog getReal() {
        return (android.app.admin.SecurityLog) real;
    }

    public android.app.admin.SecurityLog unwrap() {
        return getReal();
    }

    public SecurityLog() {
        this(new android.app.admin.SecurityLog(), (__DcgwBridgeToken) null);
    }

    public static final int LEVEL_ERROR = android.app.admin.SecurityLog.LEVEL_ERROR;
    public static final int LEVEL_INFO = android.app.admin.SecurityLog.LEVEL_INFO;
    public static final int LEVEL_WARNING = android.app.admin.SecurityLog.LEVEL_WARNING;
    public static final int TAG_ADB_SHELL_CMD = android.app.admin.SecurityLog.TAG_ADB_SHELL_CMD;
    public static final int TAG_ADB_SHELL_INTERACTIVE = android.app.admin.SecurityLog.TAG_ADB_SHELL_INTERACTIVE;
    public static final int TAG_APP_PROCESS_START = android.app.admin.SecurityLog.TAG_APP_PROCESS_START;
    public static final int TAG_BACKUP_SERVICE_TOGGLED = android.app.admin.SecurityLog.TAG_BACKUP_SERVICE_TOGGLED;
    public static final int TAG_BLUETOOTH_CONNECTION = android.app.admin.SecurityLog.TAG_BLUETOOTH_CONNECTION;
    public static final int TAG_BLUETOOTH_DISCONNECTION = android.app.admin.SecurityLog.TAG_BLUETOOTH_DISCONNECTION;
    public static final int TAG_CAMERA_POLICY_SET = android.app.admin.SecurityLog.TAG_CAMERA_POLICY_SET;
    public static final int TAG_CERT_AUTHORITY_INSTALLED = android.app.admin.SecurityLog.TAG_CERT_AUTHORITY_INSTALLED;
    public static final int TAG_CERT_AUTHORITY_REMOVED = android.app.admin.SecurityLog.TAG_CERT_AUTHORITY_REMOVED;
    public static final int TAG_CERT_VALIDATION_FAILURE = android.app.admin.SecurityLog.TAG_CERT_VALIDATION_FAILURE;
    public static final int TAG_CRYPTO_SELF_TEST_COMPLETED = android.app.admin.SecurityLog.TAG_CRYPTO_SELF_TEST_COMPLETED;
    public static final int TAG_KEYGUARD_DISABLED_FEATURES_SET = android.app.admin.SecurityLog.TAG_KEYGUARD_DISABLED_FEATURES_SET;
    public static final int TAG_KEYGUARD_DISMISSED = android.app.admin.SecurityLog.TAG_KEYGUARD_DISMISSED;
    public static final int TAG_KEYGUARD_DISMISS_AUTH_ATTEMPT = android.app.admin.SecurityLog.TAG_KEYGUARD_DISMISS_AUTH_ATTEMPT;
    public static final int TAG_KEYGUARD_SECURED = android.app.admin.SecurityLog.TAG_KEYGUARD_SECURED;
    public static final int TAG_KEY_DESTRUCTION = android.app.admin.SecurityLog.TAG_KEY_DESTRUCTION;
    public static final int TAG_KEY_GENERATED = android.app.admin.SecurityLog.TAG_KEY_GENERATED;
    public static final int TAG_KEY_IMPORT = android.app.admin.SecurityLog.TAG_KEY_IMPORT;
    public static final int TAG_KEY_INTEGRITY_VIOLATION = android.app.admin.SecurityLog.TAG_KEY_INTEGRITY_VIOLATION;
    public static final int TAG_LOGGING_STARTED = android.app.admin.SecurityLog.TAG_LOGGING_STARTED;
    public static final int TAG_LOGGING_STOPPED = android.app.admin.SecurityLog.TAG_LOGGING_STOPPED;
    public static final int TAG_LOG_BUFFER_SIZE_CRITICAL = android.app.admin.SecurityLog.TAG_LOG_BUFFER_SIZE_CRITICAL;
    public static final int TAG_MAX_PASSWORD_ATTEMPTS_SET = android.app.admin.SecurityLog.TAG_MAX_PASSWORD_ATTEMPTS_SET;
    public static final int TAG_MAX_SCREEN_LOCK_TIMEOUT_SET = android.app.admin.SecurityLog.TAG_MAX_SCREEN_LOCK_TIMEOUT_SET;
    public static final int TAG_MEDIA_MOUNT = android.app.admin.SecurityLog.TAG_MEDIA_MOUNT;
    public static final int TAG_MEDIA_UNMOUNT = android.app.admin.SecurityLog.TAG_MEDIA_UNMOUNT;
    public static final int TAG_NFC_DISABLED = android.app.admin.SecurityLog.TAG_NFC_DISABLED;
    public static final int TAG_NFC_ENABLED = android.app.admin.SecurityLog.TAG_NFC_ENABLED;
    public static final int TAG_OS_SHUTDOWN = android.app.admin.SecurityLog.TAG_OS_SHUTDOWN;
    public static final int TAG_OS_STARTUP = android.app.admin.SecurityLog.TAG_OS_STARTUP;
    public static final int TAG_PACKAGE_INSTALLED = android.app.admin.SecurityLog.TAG_PACKAGE_INSTALLED;
    public static final int TAG_PACKAGE_UNINSTALLED = android.app.admin.SecurityLog.TAG_PACKAGE_UNINSTALLED;
    public static final int TAG_PACKAGE_UPDATED = android.app.admin.SecurityLog.TAG_PACKAGE_UPDATED;
    public static final int TAG_PASSWORD_CHANGED = android.app.admin.SecurityLog.TAG_PASSWORD_CHANGED;
    public static final int TAG_PASSWORD_COMPLEXITY_REQUIRED = android.app.admin.SecurityLog.TAG_PASSWORD_COMPLEXITY_REQUIRED;
    public static final int TAG_PASSWORD_COMPLEXITY_SET = android.app.admin.SecurityLog.TAG_PASSWORD_COMPLEXITY_SET;
    public static final int TAG_PASSWORD_EXPIRATION_SET = android.app.admin.SecurityLog.TAG_PASSWORD_EXPIRATION_SET;
    public static final int TAG_PASSWORD_HISTORY_LENGTH_SET = android.app.admin.SecurityLog.TAG_PASSWORD_HISTORY_LENGTH_SET;
    public static final int TAG_REMOTE_LOCK = android.app.admin.SecurityLog.TAG_REMOTE_LOCK;
    public static final int TAG_USER_RESTRICTION_ADDED = android.app.admin.SecurityLog.TAG_USER_RESTRICTION_ADDED;
    public static final int TAG_USER_RESTRICTION_REMOVED = android.app.admin.SecurityLog.TAG_USER_RESTRICTION_REMOVED;
    public static final int TAG_WIFI_CONNECTION = android.app.admin.SecurityLog.TAG_WIFI_CONNECTION;
    public static final int TAG_WIFI_DISCONNECTION = android.app.admin.SecurityLog.TAG_WIFI_DISCONNECTION;
    public static final int TAG_WIPE_FAILURE = android.app.admin.SecurityLog.TAG_WIPE_FAILURE;

    public static final class SecurityEvent {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SecurityEvent(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.SecurityLog.SecurityEvent wrap(android.app.admin.SecurityLog.SecurityEvent real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SecurityLog.SecurityEvent(real, (__DcgwBridgeToken) null);
        }

        public android.app.admin.SecurityLog.SecurityEvent getReal() {
            return (android.app.admin.SecurityLog.SecurityEvent) real;
        }

        public android.app.admin.SecurityLog.SecurityEvent unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).equals(arg0);
        }

        public java.lang.Object getData() {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).getData();
        }

        public long getId() {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).getId();
        }

        public int getLogLevel() {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).getLogLevel();
        }

        public int getTag() {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).getTag();
        }

        public long getTimeNanos() {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).getTimeNanos();
        }

        public int hashCode() {
            return ((android.app.admin.SecurityLog.SecurityEvent) real).hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.admin.SecurityLog.SecurityEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
