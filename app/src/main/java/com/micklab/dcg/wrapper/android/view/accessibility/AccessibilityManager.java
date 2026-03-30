// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityManager {
    private final android.view.accessibility.AccessibilityManager real;

    public AccessibilityManager(android.view.accessibility.AccessibilityManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager wrap(android.view.accessibility.AccessibilityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager(real);
    }

    public android.view.accessibility.AccessibilityManager unwrap() {
        return real;
    }

    public void addAccessibilityRequestPreparer(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer arg0) {
        real.addAccessibilityRequestPreparer(arg0 == null ? null : arg0.unwrap());
    }

    public void addAccessibilityServicesStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener arg0) {
        real.addAccessibilityServicesStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addAccessibilityServicesStateChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener arg1) {
        real.addAccessibilityServicesStateChangeListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean addAccessibilityStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener arg0) {
        return real.addAccessibilityStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addAccessibilityStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addAccessibilityStateChangeListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addAudioDescriptionRequestedChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener arg1) {
        real.addAudioDescriptionRequestedChangeListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean addTouchExplorationStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener arg0) {
        return real.addTouchExplorationStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addTouchExplorationStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addTouchExplorationStateChangeListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int getAccessibilityFocusColor() {
        return real.getAccessibilityFocusColor();
    }

    public int getAccessibilityFocusStrokeWidth() {
        return real.getAccessibilityFocusStrokeWidth();
    }

    public int getRecommendedTimeoutMillis(int arg0, int arg1) {
        return real.getRecommendedTimeoutMillis(arg0, arg1);
    }

    public void interrupt() {
        real.interrupt();
    }

    public static boolean isAccessibilityButtonSupported() {
        return android.view.accessibility.AccessibilityManager.isAccessibilityButtonSupported();
    }

    public boolean isAudioDescriptionRequested() {
        return real.isAudioDescriptionRequested();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isRequestFromAccessibilityTool() {
        return real.isRequestFromAccessibilityTool();
    }

    public boolean isTouchExplorationEnabled() {
        return real.isTouchExplorationEnabled();
    }

    public void removeAccessibilityRequestPreparer(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRequestPreparer arg0) {
        real.removeAccessibilityRequestPreparer(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeAccessibilityServicesStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener arg0) {
        return real.removeAccessibilityServicesStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeAccessibilityStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener arg0) {
        return real.removeAccessibilityStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeAudioDescriptionRequestedChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener arg0) {
        return real.removeAudioDescriptionRequestedChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeTouchExplorationStateChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener arg0) {
        return real.removeTouchExplorationStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void sendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        real.sendAccessibilityEvent(arg0 == null ? null : arg0.unwrap());
    }

    public static final int FLAG_CONTENT_CONTROLS = android.view.accessibility.AccessibilityManager.FLAG_CONTENT_CONTROLS;
    public static final int FLAG_CONTENT_ICONS = android.view.accessibility.AccessibilityManager.FLAG_CONTENT_ICONS;
    public static final int FLAG_CONTENT_TEXT = android.view.accessibility.AccessibilityManager.FLAG_CONTENT_TEXT;

    public static final class AccessibilityServicesStateChangeListener {
        private final android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener real;

        public AccessibilityServicesStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener wrap(android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener(real);
        }

        public android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener unwrap() {
            return real;
        }

        public void onAccessibilityServicesStateChanged(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager arg0) {
            real.onAccessibilityServicesStateChanged(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class AccessibilityStateChangeListener {
        private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener real;

        public AccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener wrap(android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener(real);
        }

        public android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener unwrap() {
            return real;
        }

        public void onAccessibilityStateChanged(boolean arg0) {
            real.onAccessibilityStateChanged(arg0);
        }

    }
    public static final class AudioDescriptionRequestedChangeListener {
        private final android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener real;

        public AudioDescriptionRequestedChangeListener(android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener wrap(android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener(real);
        }

        public android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener unwrap() {
            return real;
        }

        public void onAudioDescriptionRequestedChanged(boolean arg0) {
            real.onAudioDescriptionRequestedChanged(arg0);
        }

    }
    public static final class TouchExplorationStateChangeListener {
        private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener real;

        public TouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener wrap(android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener(real);
        }

        public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener unwrap() {
            return real;
        }

        public void onTouchExplorationStateChanged(boolean arg0) {
            real.onTouchExplorationStateChanged(arg0);
        }

    }
}
