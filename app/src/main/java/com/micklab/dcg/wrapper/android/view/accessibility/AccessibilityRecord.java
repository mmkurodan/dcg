// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityRecord {
    private final android.view.accessibility.AccessibilityRecord real;

    public AccessibilityRecord(android.view.accessibility.AccessibilityRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord wrap(android.view.accessibility.AccessibilityRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord(real);
    }

    public android.view.accessibility.AccessibilityRecord unwrap() {
        return real;
    }

    public AccessibilityRecord() {
        this(new android.view.accessibility.AccessibilityRecord());
    }

    public AccessibilityRecord(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord arg0) {
        this(new android.view.accessibility.AccessibilityRecord(arg0 == null ? null : arg0.unwrap()));
    }

    public int getAddedCount() {
        return real.getAddedCount();
    }

    public java.lang.CharSequence getBeforeText() {
        return real.getBeforeText();
    }

    public java.lang.CharSequence getClassName() {
        return real.getClassName();
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public int getCurrentItemIndex() {
        return real.getCurrentItemIndex();
    }

    public int getDisplayId() {
        return real.getDisplayId();
    }

    public int getFromIndex() {
        return real.getFromIndex();
    }

    public int getItemCount() {
        return real.getItemCount();
    }

    public int getMaxScrollX() {
        return real.getMaxScrollX();
    }

    public int getMaxScrollY() {
        return real.getMaxScrollY();
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable getParcelableData() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.getParcelableData());
    }

    public int getRemovedCount() {
        return real.getRemovedCount();
    }

    public int getScrollDeltaX() {
        return real.getScrollDeltaX();
    }

    public int getScrollDeltaY() {
        return real.getScrollDeltaY();
    }

    public int getScrollX() {
        return real.getScrollX();
    }

    public int getScrollY() {
        return real.getScrollY();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getSource() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getSource());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getSource(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getSource(arg0));
    }

    public int getToIndex() {
        return real.getToIndex();
    }

    public int getWindowId() {
        return real.getWindowId();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isFullScreen() {
        return real.isFullScreen();
    }

    public boolean isPassword() {
        return real.isPassword();
    }

    public boolean isScrollable() {
        return real.isScrollable();
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord obtain() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord.wrap(android.view.accessibility.AccessibilityRecord.obtain());
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord obtain(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord.wrap(android.view.accessibility.AccessibilityRecord.obtain(arg0 == null ? null : arg0.unwrap()));
    }

    public void recycle() {
        real.recycle();
    }

    public void setAddedCount(int arg0) {
        real.setAddedCount(arg0);
    }

    public void setBeforeText(java.lang.CharSequence arg0) {
        real.setBeforeText(arg0);
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setClassName(java.lang.CharSequence arg0) {
        real.setClassName(arg0);
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        real.setContentDescription(arg0);
    }

    public void setCurrentItemIndex(int arg0) {
        real.setCurrentItemIndex(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setFromIndex(int arg0) {
        real.setFromIndex(arg0);
    }

    public void setFullScreen(boolean arg0) {
        real.setFullScreen(arg0);
    }

    public void setItemCount(int arg0) {
        real.setItemCount(arg0);
    }

    public void setMaxScrollX(int arg0) {
        real.setMaxScrollX(arg0);
    }

    public void setMaxScrollY(int arg0) {
        real.setMaxScrollY(arg0);
    }

    public void setParcelableData(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.setParcelableData(arg0 == null ? null : arg0.unwrap());
    }

    public void setPassword(boolean arg0) {
        real.setPassword(arg0);
    }

    public void setRemovedCount(int arg0) {
        real.setRemovedCount(arg0);
    }

    public void setScrollDeltaX(int arg0) {
        real.setScrollDeltaX(arg0);
    }

    public void setScrollDeltaY(int arg0) {
        real.setScrollDeltaY(arg0);
    }

    public void setScrollX(int arg0) {
        real.setScrollX(arg0);
    }

    public void setScrollY(int arg0) {
        real.setScrollY(arg0);
    }

    public void setScrollable(boolean arg0) {
        real.setScrollable(arg0);
    }

    public void setSource(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setSource(arg0 == null ? null : arg0.unwrap());
    }

    public void setSource(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.setSource(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setToIndex(int arg0) {
        real.setToIndex(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
