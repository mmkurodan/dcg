// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager wrap(android.view.accessibility.AccessibilityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.accessibility.AccessibilityManager getReal() {
        return (android.view.accessibility.AccessibilityManager) real;
    }

    public android.view.accessibility.AccessibilityManager unwrap() {
        return getReal();
    }

    public void addAccessibilityRequestPreparer(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer arg0) {
        ((android.view.accessibility.AccessibilityManager) real).addAccessibilityRequestPreparer(arg0 == null ? null : arg0.getReal());
    }

    public void addAccessibilityServicesStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener arg0) {
        ((android.view.accessibility.AccessibilityManager) real).addAccessibilityServicesStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addAccessibilityServicesStateChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener arg1) {
        ((android.view.accessibility.AccessibilityManager) real).addAccessibilityServicesStateChangeListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean addAccessibilityStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener arg0) {
        return ((android.view.accessibility.AccessibilityManager) real).addAccessibilityStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addAccessibilityStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.view.accessibility.AccessibilityManager) real).addAccessibilityStateChangeListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addAudioDescriptionRequestedChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener arg1) {
        ((android.view.accessibility.AccessibilityManager) real).addAudioDescriptionRequestedChangeListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void addHighContrastTextStateChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener arg1) {
        ((android.view.accessibility.AccessibilityManager) real).addHighContrastTextStateChangeListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean addTouchExplorationStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener arg0) {
        return ((android.view.accessibility.AccessibilityManager) real).addTouchExplorationStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addTouchExplorationStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.view.accessibility.AccessibilityManager) real).addTouchExplorationStateChangeListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int getAccessibilityFocusColor() {
        return ((android.view.accessibility.AccessibilityManager) real).getAccessibilityFocusColor();
    }

    public int getAccessibilityFocusStrokeWidth() {
        return ((android.view.accessibility.AccessibilityManager) real).getAccessibilityFocusStrokeWidth();
    }

    public int getRecommendedTimeoutMillis(int arg0, int arg1) {
        return ((android.view.accessibility.AccessibilityManager) real).getRecommendedTimeoutMillis(arg0, arg1);
    }

    public void interrupt() {
        ((android.view.accessibility.AccessibilityManager) real).interrupt();
    }

    public static boolean isAccessibilityButtonSupported() {
        return android.view.accessibility.AccessibilityManager.isAccessibilityButtonSupported();
    }

    public boolean isAudioDescriptionRequested() {
        return ((android.view.accessibility.AccessibilityManager) real).isAudioDescriptionRequested();
    }

    public boolean isEnabled() {
        return ((android.view.accessibility.AccessibilityManager) real).isEnabled();
    }

    public boolean isHighContrastTextEnabled() {
        return ((android.view.accessibility.AccessibilityManager) real).isHighContrastTextEnabled();
    }

    public boolean isRequestFromAccessibilityTool() {
        return ((android.view.accessibility.AccessibilityManager) real).isRequestFromAccessibilityTool();
    }

    public boolean isTouchExplorationEnabled() {
        return ((android.view.accessibility.AccessibilityManager) real).isTouchExplorationEnabled();
    }

    public void removeAccessibilityRequestPreparer(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer arg0) {
        ((android.view.accessibility.AccessibilityManager) real).removeAccessibilityRequestPreparer(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeAccessibilityServicesStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener arg0) {
        return ((android.view.accessibility.AccessibilityManager) real).removeAccessibilityServicesStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeAccessibilityStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener arg0) {
        return ((android.view.accessibility.AccessibilityManager) real).removeAccessibilityStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeAudioDescriptionRequestedChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener arg0) {
        return ((android.view.accessibility.AccessibilityManager) real).removeAudioDescriptionRequestedChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeHighContrastTextStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener arg0) {
        ((android.view.accessibility.AccessibilityManager) real).removeHighContrastTextStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeTouchExplorationStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener arg0) {
        return ((android.view.accessibility.AccessibilityManager) real).removeTouchExplorationStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void sendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        ((android.view.accessibility.AccessibilityManager) real).sendAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public static final int FLAG_CONTENT_CONTROLS = android.view.accessibility.AccessibilityManager.FLAG_CONTENT_CONTROLS;
    public static final int FLAG_CONTENT_ICONS = android.view.accessibility.AccessibilityManager.FLAG_CONTENT_ICONS;
    public static final int FLAG_CONTENT_TEXT = android.view.accessibility.AccessibilityManager.FLAG_CONTENT_TEXT;

    public static final class AccessibilityServicesStateChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AccessibilityServicesStateChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener wrap(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener getReal() {
            return (android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener) real;
        }

        public android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener unwrap() {
            return getReal();
        }

        public void onAccessibilityServicesStateChanged(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager arg0) {
            ((android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener) real).onAccessibilityServicesStateChanged(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class AccessibilityStateChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AccessibilityStateChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener wrap(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener getReal() {
            return (android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener) real;
        }

        public android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener unwrap() {
            return getReal();
        }

        public void onAccessibilityStateChanged(boolean arg0) {
            ((android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener) real).onAccessibilityStateChanged(arg0);
        }

    }
    public static final class AudioDescriptionRequestedChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AudioDescriptionRequestedChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener wrap(android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener getReal() {
            return (android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener) real;
        }

        public android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener unwrap() {
            return getReal();
        }

        public void onAudioDescriptionRequestedChanged(boolean arg0) {
            ((android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener) real).onAudioDescriptionRequestedChanged(arg0);
        }

    }
    public static final class HighContrastTextStateChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HighContrastTextStateChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener wrap(android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener getReal() {
            return (android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener) real;
        }

        public android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener unwrap() {
            return getReal();
        }

        public void onHighContrastTextStateChanged(boolean arg0) {
            ((android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener) real).onHighContrastTextStateChanged(arg0);
        }

    }
    public static final class TouchExplorationStateChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TouchExplorationStateChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener wrap(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener getReal() {
            return (android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener) real;
        }

        public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener unwrap() {
            return getReal();
        }

        public void onTouchExplorationStateChanged(boolean arg0) {
            ((android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener) real).onTouchExplorationStateChanged(arg0);
        }

    }
}
