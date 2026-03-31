// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityWindowInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityWindowInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo wrap(android.view.accessibility.AccessibilityWindowInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.accessibility.AccessibilityWindowInfo getReal() {
        return (android.view.accessibility.AccessibilityWindowInfo) real;
    }

    public android.view.accessibility.AccessibilityWindowInfo unwrap() {
        return getReal();
    }

    public AccessibilityWindowInfo() {
        this(new android.view.accessibility.AccessibilityWindowInfo(), (__DcgwBridgeToken) null);
    }

    public AccessibilityWindowInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo arg0) {
        this(new android.view.accessibility.AccessibilityWindowInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getAnchor() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityWindowInfo) real).getAnchor());
    }

    public void getBoundsInScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.accessibility.AccessibilityWindowInfo) real).getBoundsInScreen(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo getChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(((android.view.accessibility.AccessibilityWindowInfo) real).getChild(arg0));
    }

    public int getChildCount() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).getChildCount();
    }

    public int getDisplayId() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).getDisplayId();
    }

    public int getId() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).getId();
    }

    public int getLayer() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).getLayer();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.view.accessibility.AccessibilityWindowInfo) real).getLocales());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo getParent() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(((android.view.accessibility.AccessibilityWindowInfo) real).getParent());
    }

    public void getRegionInScreen(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        ((android.view.accessibility.AccessibilityWindowInfo) real).getRegionInScreen(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRoot() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityWindowInfo) real).getRoot());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRoot(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityWindowInfo) real).getRoot(arg0));
    }

    public java.lang.CharSequence getTitle() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).getTitle();
    }

    public long getTransitionTimeMillis() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).getTransitionTimeMillis();
    }

    public int getType() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).getType();
    }

    public int hashCode() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).hashCode();
    }

    public boolean isAccessibilityFocused() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).isAccessibilityFocused();
    }

    public boolean isActive() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).isActive();
    }

    public boolean isFocused() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).isFocused();
    }

    public boolean isInPictureInPictureMode() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).isInPictureInPictureMode();
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo obtain() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(android.view.accessibility.AccessibilityWindowInfo.obtain());
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo obtain(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(android.view.accessibility.AccessibilityWindowInfo.obtain(arg0 == null ? null : arg0.getReal()));
    }

    public void recycle() {
        ((android.view.accessibility.AccessibilityWindowInfo) real).recycle();
    }

    public java.lang.String toString() {
        return ((android.view.accessibility.AccessibilityWindowInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.accessibility.AccessibilityWindowInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_ACCESSIBILITY_OVERLAY = android.view.accessibility.AccessibilityWindowInfo.TYPE_ACCESSIBILITY_OVERLAY;
    public static final int TYPE_APPLICATION = android.view.accessibility.AccessibilityWindowInfo.TYPE_APPLICATION;
    public static final int TYPE_INPUT_METHOD = android.view.accessibility.AccessibilityWindowInfo.TYPE_INPUT_METHOD;
    public static final int TYPE_MAGNIFICATION_OVERLAY = android.view.accessibility.AccessibilityWindowInfo.TYPE_MAGNIFICATION_OVERLAY;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = android.view.accessibility.AccessibilityWindowInfo.TYPE_SPLIT_SCREEN_DIVIDER;
    public static final int TYPE_SYSTEM = android.view.accessibility.AccessibilityWindowInfo.TYPE_SYSTEM;
    public static final int TYPE_WINDOW_CONTROL = android.view.accessibility.AccessibilityWindowInfo.TYPE_WINDOW_CONTROL;

}
