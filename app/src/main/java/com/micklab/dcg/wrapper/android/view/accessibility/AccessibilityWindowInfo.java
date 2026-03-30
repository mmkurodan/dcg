// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityWindowInfo {
    private final android.view.accessibility.AccessibilityWindowInfo real;

    public AccessibilityWindowInfo(android.view.accessibility.AccessibilityWindowInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo wrap(android.view.accessibility.AccessibilityWindowInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo(real);
    }

    public android.view.accessibility.AccessibilityWindowInfo unwrap() {
        return real;
    }

    public AccessibilityWindowInfo() {
        this(new android.view.accessibility.AccessibilityWindowInfo());
    }

    public AccessibilityWindowInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo arg0) {
        this(new android.view.accessibility.AccessibilityWindowInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getAnchor() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getAnchor());
    }

    public void getBoundsInScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getBoundsInScreen(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo getChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(real.getChild(arg0));
    }

    public int getChildCount() {
        return real.getChildCount();
    }

    public int getDisplayId() {
        return real.getDisplayId();
    }

    public int getId() {
        return real.getId();
    }

    public int getLayer() {
        return real.getLayer();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getLocales());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo getParent() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(real.getParent());
    }

    public void getRegionInScreen(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        real.getRegionInScreen(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRoot() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getRoot());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRoot(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getRoot(arg0));
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public long getTransitionTimeMillis() {
        return real.getTransitionTimeMillis();
    }

    public int getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return real.isAccessibilityFocused();
    }

    public boolean isActive() {
        return real.isActive();
    }

    public boolean isFocused() {
        return real.isFocused();
    }

    public boolean isInPictureInPictureMode() {
        return real.isInPictureInPictureMode();
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo obtain() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(android.view.accessibility.AccessibilityWindowInfo.obtain());
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo obtain(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(android.view.accessibility.AccessibilityWindowInfo.obtain(arg0 == null ? null : arg0.unwrap()));
    }

    public void recycle() {
        real.recycle();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_ACCESSIBILITY_OVERLAY = android.view.accessibility.AccessibilityWindowInfo.TYPE_ACCESSIBILITY_OVERLAY;
    public static final int TYPE_APPLICATION = android.view.accessibility.AccessibilityWindowInfo.TYPE_APPLICATION;
    public static final int TYPE_INPUT_METHOD = android.view.accessibility.AccessibilityWindowInfo.TYPE_INPUT_METHOD;
    public static final int TYPE_MAGNIFICATION_OVERLAY = android.view.accessibility.AccessibilityWindowInfo.TYPE_MAGNIFICATION_OVERLAY;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = android.view.accessibility.AccessibilityWindowInfo.TYPE_SPLIT_SCREEN_DIVIDER;
    public static final int TYPE_SYSTEM = android.view.accessibility.AccessibilityWindowInfo.TYPE_SYSTEM;

}
