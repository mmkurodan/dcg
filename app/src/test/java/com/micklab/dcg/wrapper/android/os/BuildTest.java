package com.micklab.dcg.wrapper.android.os;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class BuildTest {
    @Test
    public void buildFieldsPreferAndroidPropertiesAndFallbackToJavaProperties() throws Exception {
        String originalModel = System.getProperty("ro.product.model");
        String originalManufacturer = System.getProperty("ro.product.manufacturer");
        String originalRelease = System.getProperty("ro.build.version.release");
        String originalCodename = System.getProperty("ro.build.version.codename");
        String originalSdk = System.getProperty("ro.build.version.sdk");
        String originalHardware = System.getProperty("ro.hardware");

        try {
            System.setProperty("ro.product.model", "Copilot Phone");
            System.setProperty("ro.product.manufacturer", "GitHub Devices");
            System.setProperty("ro.build.version.release", "42");
            System.setProperty("ro.build.version.codename", "Nebula");
            System.clearProperty("ro.build.version.sdk");
            System.clearProperty("ro.hardware");

            Class<?> buildClass = Class.forName("com.micklab.dcg.wrapper.android.os.Build", true, BuildTest.class.getClassLoader());
            Class<?> versionClass = Class.forName("com.micklab.dcg.wrapper.android.os.Build$VERSION", true, BuildTest.class.getClassLoader());

            assertEquals("Copilot Phone", readStringField(buildClass, "MODEL"));
            assertEquals("GitHub Devices", readStringField(buildClass, "MANUFACTURER"));
            assertEquals(expectedHardwareFallback(), readStringField(buildClass, "HARDWARE"));
            assertEquals("42", readStringField(versionClass, "RELEASE"));
            assertEquals("Nebula", readStringField(versionClass, "CODENAME"));
            assertEquals(expectedSdkString(), readStringField(versionClass, "SDK_INT"));
        } finally {
            restore("ro.product.model", originalModel);
            restore("ro.product.manufacturer", originalManufacturer);
            restore("ro.build.version.release", originalRelease);
            restore("ro.build.version.codename", originalCodename);
            restore("ro.build.version.sdk", originalSdk);
            restore("ro.hardware", originalHardware);
        }
    }

    private String readStringField(Class<?> owner, String fieldName) throws Exception {
        Field field = owner.getField(fieldName);
        return String.valueOf(field.get(null));
    }

    private String expectedHardwareFallback() {
        String value = System.getProperty("os.arch");
        if (value == null || value.trim().isEmpty()) {
            return "unknown";
        }
        return value.trim();
    }

    private String expectedSdkString() {
        if (android.os.Build.VERSION.SDK_INT > 0) {
            return String.valueOf(android.os.Build.VERSION.SDK_INT);
        }
        return "unknown";
    }

    private void restore(String key, String value) {
        if (value == null) {
            System.clearProperty(key);
            return;
        }
        System.setProperty(key, value);
    }
}
