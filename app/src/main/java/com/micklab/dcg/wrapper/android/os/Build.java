// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Build {
    public static final String UNKNOWN = "unknown";

    public static final String MODEL;
    public static final String MANUFACTURER;
    public static final String BRAND;
    public static final String DEVICE;
    public static final String PRODUCT;
    public static final String HARDWARE;
    public static final String BOARD;
    public static final String BOOTLOADER;
    public static final String DISPLAY;
    public static final String FINGERPRINT;
    public static final String HOST;
    public static final String ID;
    public static final String TAGS;
    public static final String TYPE;
    public static final String USER;

    static {
        MODEL = get("ro.product.model", "os.name", "java.runtime.name");
        MANUFACTURER = get("ro.product.manufacturer", "java.vendor");
        BRAND = get("ro.product.brand", "java.vendor");
        DEVICE = get("ro.product.device", "os.arch");
        PRODUCT = get("ro.product.name", "java.runtime.name", "os.name");
        HARDWARE = get("ro.hardware", "os.arch");
        BOARD = get("ro.product.board", "os.arch");
        BOOTLOADER = get("ro.bootloader", "os.version");
        DISPLAY = get("ro.build.display.id", "os.version", "java.vm.version");
        FINGERPRINT = get("ro.build.fingerprint", "java.vm.name", "os.name", "os.arch");
        HOST = get("ro.build.host", "user.name", "os.name");
        ID = get("ro.build.id", "java.vm.version", "os.version");
        TAGS = get("ro.build.tags", "java.vendor");
        TYPE = get("ro.build.type", "java.vm.name", "os.name");
        USER = get("ro.build.user", "user.name");
    }

    private Build() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#android.os.Build()");
    }

    public static int getMajorSdkVersion(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#getMajorSdkVersion(int)");
    }

    public static int getMinorSdkVersion(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#getMinorSdkVersion(int)");
    }

    public static java.lang.String getRadioVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#getRadioVersion()");
    }

    public static java.lang.String getSerial() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build#getSerial()");
    }

    private static String get(String androidPropertyKey, String... fallbackPropertyKeys) {
        String value = normalize(System.getProperty(androidPropertyKey));
        if (value != null) {
            return value;
        }
        if (fallbackPropertyKeys != null) {
            for (String fallbackPropertyKey : fallbackPropertyKeys) {
                value = normalize(System.getProperty(fallbackPropertyKey));
                if (value != null) {
                    return value;
                }
            }
        }
        return UNKNOWN;
    }

    private static String getSdkInt() {
        String propertyValue = normalize(System.getProperty("ro.build.version.sdk"));
        if (propertyValue != null) {
            return propertyValue;
        }
        try {
            int sdkInt = android.os.Build.VERSION.SDK_INT;
            if (sdkInt > 0) {
                return String.valueOf(sdkInt);
            }
        } catch (Throwable ignored) {
        }
        return UNKNOWN;
    }

    private static String normalize(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }

    public static final class VERSION {
        public static final String RELEASE;
        public static final String SDK_INT;
        public static final String CODENAME;

        static {
            RELEASE = get("ro.build.version.release", "os.version", "java.vm.version");
            SDK_INT = getSdkInt();
            CODENAME = get("ro.build.version.codename", "java.vm.name");
        }

        private VERSION() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Build$VERSION#android.os.Build$VERSION()");
        }
    }
}
