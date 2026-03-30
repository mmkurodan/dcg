// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class UiAutomation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UiAutomation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.UiAutomation wrap(android.app.UiAutomation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiAutomation(real, (__DcgwBridgeToken) null);
    }

    public android.app.UiAutomation getReal() {
        return (android.app.UiAutomation) real;
    }

    public android.app.UiAutomation unwrap() {
        return getReal();
    }

    public void adoptShellPermissionIdentity() {
        ((android.app.UiAutomation) real).adoptShellPermissionIdentity();
    }

    public void adoptShellPermissionIdentity(java.lang.String... arg0) {
        ((android.app.UiAutomation) real).adoptShellPermissionIdentity(arg0);
    }

    public boolean clearCache() {
        return ((android.app.UiAutomation) real).clearCache();
    }

    public void clearWindowAnimationFrameStats() {
        ((android.app.UiAutomation) real).clearWindowAnimationFrameStats();
    }

    public boolean clearWindowContentFrameStats(int arg0) {
        return ((android.app.UiAutomation) real).clearWindowContentFrameStats(arg0);
    }

    public void dropShellPermissionIdentity() {
        ((android.app.UiAutomation) real).dropShellPermissionIdentity();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent executeAndWaitForEvent(java.lang.Runnable arg0, com.micklab.dcg.wrapper.android.app.UiAutomation.AccessibilityEventFilter arg1, long arg2) throws java.util.concurrent.TimeoutException {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent.wrap(((android.app.UiAutomation) real).executeAndWaitForEvent(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor executeShellCommand(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(((android.app.UiAutomation) real).executeShellCommand(arg0));
    }

    public android.os.ParcelFileDescriptor[] executeShellCommandRw(java.lang.String arg0) {
        return ((android.app.UiAutomation) real).executeShellCommandRw(arg0);
    }

    public android.os.ParcelFileDescriptor[] executeShellCommandRwe(java.lang.String arg0) {
        return ((android.app.UiAutomation) real).executeShellCommandRwe(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo findFocus(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.app.UiAutomation) real).findFocus(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.app.UiAutomation) real).getRootInActiveWindow());
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo.wrap(((android.app.UiAutomation) real).getServiceInfo());
    }

    public com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() {
        return com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats.wrap(((android.app.UiAutomation) real).getWindowAnimationFrameStats());
    }

    public com.micklab.dcg.wrapper.android.view.WindowContentFrameStats getWindowContentFrameStats(int arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowContentFrameStats.wrap(((android.app.UiAutomation) real).getWindowContentFrameStats(arg0));
    }

    public void grantRuntimePermission(java.lang.String arg0, java.lang.String arg1) {
        ((android.app.UiAutomation) real).grantRuntimePermission(arg0, arg1);
    }

    public void grantRuntimePermissionAsUser(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.UiAutomation) real).grantRuntimePermissionAsUser(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean injectInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0, boolean arg1) {
        return ((android.app.UiAutomation) real).injectInputEvent(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean performGlobalAction(int arg0) {
        return ((android.app.UiAutomation) real).performGlobalAction(arg0);
    }

    public void revokeRuntimePermission(java.lang.String arg0, java.lang.String arg1) {
        ((android.app.UiAutomation) real).revokeRuntimePermission(arg0, arg1);
    }

    public void revokeRuntimePermissionAsUser(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.UiAutomation) real).revokeRuntimePermissionAsUser(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setAnimationScale(float arg0) {
        ((android.app.UiAutomation) real).setAnimationScale(arg0);
    }

    public void setOnAccessibilityEventListener(com.micklab.dcg.wrapper.android.app.UiAutomation.OnAccessibilityEventListener arg0) {
        ((android.app.UiAutomation) real).setOnAccessibilityEventListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean setRotation(int arg0) {
        return ((android.app.UiAutomation) real).setRotation(arg0);
    }

    public void setRunAsMonkey(boolean arg0) {
        ((android.app.UiAutomation) real).setRunAsMonkey(arg0);
    }

    public void setServiceInfo(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo arg0) {
        ((android.app.UiAutomation) real).setServiceInfo(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap takeScreenshot() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.app.UiAutomation) real).takeScreenshot());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap takeScreenshot(com.micklab.dcg.wrapper.android.view.Window arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.app.UiAutomation) real).takeScreenshot(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String toString() {
        return ((android.app.UiAutomation) real).toString();
    }

    public void waitForIdle(long arg0, long arg1) throws java.util.concurrent.TimeoutException {
        ((android.app.UiAutomation) real).waitForIdle(arg0, arg1);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AccessibilityEventFilter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.UiAutomation.AccessibilityEventFilter wrap(android.app.UiAutomation.AccessibilityEventFilter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiAutomation.AccessibilityEventFilter(real, (__DcgwBridgeToken) null);
        }

        public android.app.UiAutomation.AccessibilityEventFilter getReal() {
            return (android.app.UiAutomation.AccessibilityEventFilter) real;
        }

        public android.app.UiAutomation.AccessibilityEventFilter unwrap() {
            return getReal();
        }

        public boolean accept(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
            return ((android.app.UiAutomation.AccessibilityEventFilter) real).accept(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnAccessibilityEventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnAccessibilityEventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.UiAutomation.OnAccessibilityEventListener wrap(android.app.UiAutomation.OnAccessibilityEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiAutomation.OnAccessibilityEventListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.UiAutomation.OnAccessibilityEventListener getReal() {
            return (android.app.UiAutomation.OnAccessibilityEventListener) real;
        }

        public android.app.UiAutomation.OnAccessibilityEventListener unwrap() {
            return getReal();
        }

        public void onAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
            ((android.app.UiAutomation.OnAccessibilityEventListener) real).onAccessibilityEvent(arg0 == null ? null : arg0.getReal());
        }

    }
}
