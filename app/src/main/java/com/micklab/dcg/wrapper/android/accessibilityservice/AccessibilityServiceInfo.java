// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class AccessibilityServiceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo wrap(android.accessibilityservice.AccessibilityServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.AccessibilityServiceInfo getReal() {
        return (android.accessibilityservice.AccessibilityServiceInfo) real;
    }

    public android.accessibilityservice.AccessibilityServiceInfo unwrap() {
        return getReal();
    }

    public AccessibilityServiceInfo() {
        this(new android.accessibilityservice.AccessibilityServiceInfo(), (__DcgwBridgeToken) null);
    }

    public static java.lang.String capabilityToString(int arg0) {
        return android.accessibilityservice.AccessibilityServiceInfo.capabilityToString(arg0);
    }

    public int describeContents() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).equals(arg0);
    }

    public static java.lang.String feedbackTypeToString(int arg0) {
        return android.accessibilityservice.AccessibilityServiceInfo.feedbackTypeToString(arg0);
    }

    public static java.lang.String flagToString(int arg0) {
        return android.accessibilityservice.AccessibilityServiceInfo.flagToString(arg0);
    }

    public boolean getCanRetrieveWindowContent() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getCanRetrieveWindowContent();
    }

    public int getCapabilities() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getCapabilities();
    }

    public java.lang.String getDescription() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getDescription();
    }

    public java.lang.String getId() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getId();
    }

    public int getInteractiveUiTimeoutMillis() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getInteractiveUiTimeoutMillis();
    }

    public int getMotionEventSources() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getMotionEventSources();
    }

    public int getNonInteractiveUiTimeoutMillis() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getNonInteractiveUiTimeoutMillis();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ResolveInfo getResolveInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ResolveInfo.wrap(((android.accessibilityservice.AccessibilityServiceInfo) real).getResolveInfo());
    }

    public java.lang.String getSettingsActivityName() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getSettingsActivityName();
    }

    public java.lang.String getTileServiceName() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).getTileServiceName();
    }

    public int hashCode() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).hashCode();
    }

    public boolean isAccessibilityTool() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).isAccessibilityTool();
    }

    public java.lang.String loadDescription(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).loadDescription(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence loadIntro(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).loadIntro(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence loadSummary(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).loadSummary(arg0 == null ? null : arg0.getReal());
    }

    public void setInteractiveUiTimeoutMillis(int arg0) {
        ((android.accessibilityservice.AccessibilityServiceInfo) real).setInteractiveUiTimeoutMillis(arg0);
    }

    public void setMotionEventSources(int arg0) {
        ((android.accessibilityservice.AccessibilityServiceInfo) real).setMotionEventSources(arg0);
    }

    public void setNonInteractiveUiTimeoutMillis(int arg0) {
        ((android.accessibilityservice.AccessibilityServiceInfo) real).setNonInteractiveUiTimeoutMillis(arg0);
    }

    public java.lang.String toString() {
        return ((android.accessibilityservice.AccessibilityServiceInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.accessibilityservice.AccessibilityServiceInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CAPABILITY_CAN_CONTROL_MAGNIFICATION = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_CONTROL_MAGNIFICATION;
    public static final int CAPABILITY_CAN_PERFORM_GESTURES = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_PERFORM_GESTURES;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY;
    public static final int CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS;
    public static final int CAPABILITY_CAN_REQUEST_FINGERPRINT_GESTURES = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_FINGERPRINT_GESTURES;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT;
    public static final int CAPABILITY_CAN_TAKE_SCREENSHOT = android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_TAKE_SCREENSHOT;
    public static final int DEFAULT = android.accessibilityservice.AccessibilityServiceInfo.DEFAULT;
    public static final int FEEDBACK_ALL_MASK = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_ALL_MASK;
    public static final int FEEDBACK_AUDIBLE = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_AUDIBLE;
    public static final int FEEDBACK_BRAILLE = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_BRAILLE;
    public static final int FEEDBACK_GENERIC = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_GENERIC;
    public static final int FEEDBACK_HAPTIC = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_HAPTIC;
    public static final int FEEDBACK_SPOKEN = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_SPOKEN;
    public static final int FEEDBACK_VISUAL = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_VISUAL;
    public static final int FLAG_ENABLE_ACCESSIBILITY_VOLUME = android.accessibilityservice.AccessibilityServiceInfo.FLAG_ENABLE_ACCESSIBILITY_VOLUME;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = android.accessibilityservice.AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS;
    public static final int FLAG_INPUT_METHOD_EDITOR = android.accessibilityservice.AccessibilityServiceInfo.FLAG_INPUT_METHOD_EDITOR;
    public static final int FLAG_REPORT_VIEW_IDS = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REPORT_VIEW_IDS;
    public static final int FLAG_REQUEST_2_FINGER_PASSTHROUGH = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_2_FINGER_PASSTHROUGH;
    public static final int FLAG_REQUEST_ACCESSIBILITY_BUTTON = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_ACCESSIBILITY_BUTTON;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_FILTER_KEY_EVENTS;
    public static final int FLAG_REQUEST_FINGERPRINT_GESTURES = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_FINGERPRINT_GESTURES;
    public static final int FLAG_REQUEST_MULTI_FINGER_GESTURES = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_MULTI_FINGER_GESTURES;
    public static final int FLAG_REQUEST_SHORTCUT_WARNING_DIALOG_SPOKEN_FEEDBACK = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_SHORTCUT_WARNING_DIALOG_SPOKEN_FEEDBACK;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = android.accessibilityservice.AccessibilityServiceInfo.FLAG_REQUEST_TOUCH_EXPLORATION_MODE;
    public static final int FLAG_RETRIEVE_INTERACTIVE_WINDOWS = android.accessibilityservice.AccessibilityServiceInfo.FLAG_RETRIEVE_INTERACTIVE_WINDOWS;
    public static final int FLAG_SEND_MOTION_EVENTS = android.accessibilityservice.AccessibilityServiceInfo.FLAG_SEND_MOTION_EVENTS;
    public static final int FLAG_SERVICE_HANDLES_DOUBLE_TAP = android.accessibilityservice.AccessibilityServiceInfo.FLAG_SERVICE_HANDLES_DOUBLE_TAP;

}
