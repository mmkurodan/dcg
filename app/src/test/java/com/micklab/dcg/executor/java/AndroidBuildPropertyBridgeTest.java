package com.micklab.dcg.executor.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndroidBuildPropertyBridgeTest {
    @Test
    public void installKeepsExistingAndroidProperties() {
        String original = System.getProperty("ro.product.model");
        try {
            System.setProperty("ro.product.model", "Preset Model");

            AndroidBuildPropertyBridge.install();

            assertEquals("Preset Model", System.getProperty("ro.product.model"));
        } finally {
            restore("ro.product.model", original);
        }
    }

    private void restore(String key, String value) {
        if (value == null) {
            System.clearProperty(key);
            return;
        }
        System.setProperty(key, value);
    }
}
