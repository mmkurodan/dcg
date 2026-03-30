// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class UiAutomation {
    private final android.app.UiAutomation real;

    public UiAutomation(android.app.UiAutomation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.UiAutomation wrap(android.app.UiAutomation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiAutomation(real);
    }

    public android.app.UiAutomation unwrap() {
        return real;
    }

    public void adoptShellPermissionIdentity() {
        real.adoptShellPermissionIdentity();
    }

    public void adoptShellPermissionIdentity(java.lang.String... arg0) {
        real.adoptShellPermissionIdentity(arg0);
    }

    public boolean clearCache() {
        return real.clearCache();
    }

    public void clearWindowAnimationFrameStats() {
        real.clearWindowAnimationFrameStats();
    }

    public boolean clearWindowContentFrameStats(int arg0) {
        return real.clearWindowContentFrameStats(arg0);
    }

    public void dropShellPermissionIdentity() {
        real.dropShellPermissionIdentity();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent executeAndWaitForEvent(java.lang.Runnable arg0, com.micklab.dcg.wrapper.android.app.UiAutomation.AccessibilityEventFilter arg1, long arg2) throws java.util.concurrent.TimeoutException {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent.wrap(real.executeAndWaitForEvent(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor executeShellCommand(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.executeShellCommand(arg0));
    }

    public android.os.ParcelFileDescriptor[] executeShellCommandRw(java.lang.String arg0) {
        return real.executeShellCommandRw(arg0);
    }

    public android.os.ParcelFileDescriptor[] executeShellCommandRwe(java.lang.String arg0) {
        return real.executeShellCommandRwe(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo findFocus(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.findFocus(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getRootInActiveWindow());
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo.wrap(real.getServiceInfo());
    }

    public com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() {
        return com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats.wrap(real.getWindowAnimationFrameStats());
    }

    public com.micklab.dcg.wrapper.android.view.WindowContentFrameStats getWindowContentFrameStats(int arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowContentFrameStats.wrap(real.getWindowContentFrameStats(arg0));
    }

    public void grantRuntimePermission(java.lang.String arg0, java.lang.String arg1) {
        real.grantRuntimePermission(arg0, arg1);
    }

    public void grantRuntimePermissionAsUser(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.grantRuntimePermissionAsUser(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean injectInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0, boolean arg1) {
        return real.injectInputEvent(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean performGlobalAction(int arg0) {
        return real.performGlobalAction(arg0);
    }

    public void revokeRuntimePermission(java.lang.String arg0, java.lang.String arg1) {
        real.revokeRuntimePermission(arg0, arg1);
    }

    public void revokeRuntimePermissionAsUser(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.revokeRuntimePermissionAsUser(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setAnimationScale(float arg0) {
        real.setAnimationScale(arg0);
    }

    public void setOnAccessibilityEventListener(com.micklab.dcg.wrapper.android.app.UiAutomation.OnAccessibilityEventListener arg0) {
        real.setOnAccessibilityEventListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setRotation(int arg0) {
        return real.setRotation(arg0);
    }

    public void setRunAsMonkey(boolean arg0) {
        real.setRunAsMonkey(arg0);
    }

    public void setServiceInfo(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo arg0) {
        real.setServiceInfo(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap takeScreenshot() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.takeScreenshot());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap takeScreenshot(com.micklab.dcg.wrapper.android.view.Window arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.takeScreenshot(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void waitForIdle(long arg0, long arg1) throws java.util.concurrent.TimeoutException {
        real.waitForIdle(arg0, arg1);
    }

    public static final int FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES = android.app.UiAutomation.FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES;
    public static final int FLAG_DONT_USE_ACCESSIBILITY = android.app.UiAutomation.FLAG_DONT_USE_ACCESSIBILITY;
    public static final int ROTATION_FREEZE_0 = android.app.UiAutomation.ROTATION_FREEZE_0;
    public static final int ROTATION_FREEZE_180 = android.app.UiAutomation.ROTATION_FREEZE_180;
    public static final int ROTATION_FREEZE_270 = android.app.UiAutomation.ROTATION_FREEZE_270;
    public static final int ROTATION_FREEZE_90 = android.app.UiAutomation.ROTATION_FREEZE_90;
    public static final int ROTATION_FREEZE_CURRENT = android.app.UiAutomation.ROTATION_FREEZE_CURRENT;
    public static final int ROTATION_UNFREEZE = android.app.UiAutomation.ROTATION_UNFREEZE;

    public static final class AccessibilityEventFilter {
        private final android.app.UiAutomation.AccessibilityEventFilter real;

        public AccessibilityEventFilter(android.app.UiAutomation.AccessibilityEventFilter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.UiAutomation.AccessibilityEventFilter wrap(android.app.UiAutomation.AccessibilityEventFilter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiAutomation.AccessibilityEventFilter(real);
        }

        public android.app.UiAutomation.AccessibilityEventFilter unwrap() {
            return real;
        }

        public boolean accept(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
            return real.accept(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnAccessibilityEventListener {
        private final android.app.UiAutomation.OnAccessibilityEventListener real;

        public OnAccessibilityEventListener(android.app.UiAutomation.OnAccessibilityEventListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.UiAutomation.OnAccessibilityEventListener wrap(android.app.UiAutomation.OnAccessibilityEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiAutomation.OnAccessibilityEventListener(real);
        }

        public android.app.UiAutomation.OnAccessibilityEventListener unwrap() {
            return real;
        }

        public void onAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
            real.onAccessibilityEvent(arg0 == null ? null : arg0.unwrap());
        }

    }
}
