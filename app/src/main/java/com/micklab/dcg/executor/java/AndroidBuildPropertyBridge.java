package com.micklab.dcg.executor.java;

import android.os.Build;

public final class AndroidBuildPropertyBridge {
    private AndroidBuildPropertyBridge() {
    }

    public static void install() {
        installIfMissing("ro.product.model", Build.MODEL);
        installIfMissing("ro.product.manufacturer", Build.MANUFACTURER);
        installIfMissing("ro.product.brand", Build.BRAND);
        installIfMissing("ro.product.device", Build.DEVICE);
        installIfMissing("ro.product.name", Build.PRODUCT);
        installIfMissing("ro.hardware", Build.HARDWARE);
        installIfMissing("ro.product.board", Build.BOARD);
        installIfMissing("ro.bootloader", Build.BOOTLOADER);
        installIfMissing("ro.build.display.id", Build.DISPLAY);
        installIfMissing("ro.build.fingerprint", Build.FINGERPRINT);
        installIfMissing("ro.build.host", Build.HOST);
        installIfMissing("ro.build.id", Build.ID);
        installIfMissing("ro.build.tags", Build.TAGS);
        installIfMissing("ro.build.type", Build.TYPE);
        installIfMissing("ro.build.user", Build.USER);
        installIfMissing("ro.build.version.release", Build.VERSION.RELEASE);
        installIfMissing("ro.build.version.codename", Build.VERSION.CODENAME);
        installIfMissing("ro.build.version.sdk", String.valueOf(Build.VERSION.SDK_INT));
    }

    static void installIfMissing(String key, String value) {
        String current = normalize(System.getProperty(key));
        if (current != null) {
            return;
        }
        String normalizedValue = normalize(value);
        if (normalizedValue == null) {
            return;
        }
        System.setProperty(key, normalizedValue);
    }

    private static String normalize(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }
}
