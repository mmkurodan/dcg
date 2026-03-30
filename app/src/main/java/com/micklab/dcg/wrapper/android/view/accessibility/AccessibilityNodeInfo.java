// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityNodeInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityNodeInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo wrap(android.view.accessibility.AccessibilityNodeInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.accessibility.AccessibilityNodeInfo getReal() {
        return (android.view.accessibility.AccessibilityNodeInfo) real;
    }

    public android.view.accessibility.AccessibilityNodeInfo unwrap() {
        return getReal();
    }

    public AccessibilityNodeInfo() {
        this(new android.view.accessibility.AccessibilityNodeInfo(), (__DcgwBridgeToken) null);
    }

    public AccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        this(new android.view.accessibility.AccessibilityNodeInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.view.accessibility.AccessibilityNodeInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        this(new android.view.accessibility.AccessibilityNodeInfo(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void addAction(int arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).addAction(arg0);
    }

    public void addAction(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).addAction(arg0 == null ? null : arg0.getReal());
    }

    public void addChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).addChild(arg0 == null ? null : arg0.getReal());
    }

    public void addChild(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).addChild(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean canOpenPopup() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).canOpenPopup();
    }

    public int describeContents() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo findFocus(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).findFocus(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo focusSearch(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).focusSearch(arg0));
    }

    public int getActions() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getActions();
    }

    public void getBoundsInParent(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).getBoundsInParent(arg0 == null ? null : arg0.getReal());
    }

    public void getBoundsInScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).getBoundsInScreen(arg0 == null ? null : arg0.getReal());
    }

    public void getBoundsInWindow(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).getBoundsInWindow(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getChild(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getChild(arg0, arg1));
    }

    public int getChildCount() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getChildCount();
    }

    public java.lang.CharSequence getClassName() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getClassName();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo getCollectionInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getCollectionInfo());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo getCollectionItemInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getCollectionItemInfo());
    }

    public java.lang.CharSequence getContainerTitle() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getContainerTitle();
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getContentDescription();
    }

    public int getDrawingOrder() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getDrawingOrder();
    }

    public java.lang.CharSequence getError() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getError();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getExtraRenderingInfo());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getExtras());
    }

    public java.lang.CharSequence getHintText() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getHintText();
    }

    public int getInputType() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getInputType();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getLabelFor() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getLabelFor());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getLabeledBy() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getLabeledBy());
    }

    public int getLiveRegion() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getLiveRegion();
    }

    public int getMaxTextLength() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getMaxTextLength();
    }

    public java.time.Duration getMinDurationBetweenContentChanges() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getMinDurationBetweenContentChanges();
    }

    public int getMovementGranularities() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getMovementGranularities();
    }

    public java.lang.CharSequence getPackageName() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getPackageName();
    }

    public java.lang.CharSequence getPaneTitle() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getPaneTitle();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getParent() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getParent());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getParent(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getParent(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo getRangeInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getRangeInfo());
    }

    public java.lang.CharSequence getStateDescription() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getStateDescription();
    }

    public java.lang.CharSequence getText() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getText();
    }

    public int getTextSelectionEnd() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getTextSelectionStart();
    }

    public java.lang.CharSequence getTooltipText() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getTooltipText();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getTouchDelegateInfo());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getTraversalAfter() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getTraversalAfter());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getTraversalBefore() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getTraversalBefore());
    }

    public java.lang.String getUniqueId() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getUniqueId();
    }

    public java.lang.String getViewIdResourceName() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getViewIdResourceName();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo getWindow() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo) real).getWindow());
    }

    public int getWindowId() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).getWindowId();
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).hasRequestInitialAccessibilityFocus();
    }

    public int hashCode() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isAccessibilityDataSensitive();
    }

    public boolean isAccessibilityFocused() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isCheckable();
    }

    public boolean isChecked() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isChecked();
    }

    public boolean isClickable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isClickable();
    }

    public boolean isContentInvalid() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isContentInvalid();
    }

    public boolean isContextClickable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isContextClickable();
    }

    public boolean isDismissable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isDismissable();
    }

    public boolean isEditable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isEditable();
    }

    public boolean isEnabled() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isEnabled();
    }

    public boolean isFocusable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isFocusable();
    }

    public boolean isFocused() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isGranularScrollingSupported();
    }

    public boolean isHeading() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isHeading();
    }

    public boolean isImportantForAccessibility() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isImportantForAccessibility();
    }

    public boolean isLongClickable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isLongClickable();
    }

    public boolean isMultiLine() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isMultiLine();
    }

    public boolean isPassword() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isScreenReaderFocusable();
    }

    public boolean isScrollable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isScrollable();
    }

    public boolean isSelected() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isSelected();
    }

    public boolean isShowingHintText() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isShowingHintText();
    }

    public boolean isTextEntryKey() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isTextEntryKey();
    }

    public boolean isTextSelectable() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isTextSelectable();
    }

    public boolean isVisibleToUser() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).isVisibleToUser();
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain());
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public boolean performAction(int arg0) {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).performAction(arg0);
    }

    public boolean performAction(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).performAction(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void recycle() {
        ((android.view.accessibility.AccessibilityNodeInfo) real).recycle();
    }

    public boolean refresh() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).refresh();
    }

    public boolean refreshWithExtraData(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).refreshWithExtraData(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean removeAction(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction arg0) {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).removeAction(arg0 == null ? null : arg0.getReal());
    }

    public void removeAction(int arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).removeAction(arg0);
    }

    public boolean removeChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).removeChild(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeChild(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).removeChild(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setAccessibilityDataSensitive(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setAccessibilityDataSensitive(arg0);
    }

    public void setAccessibilityFocused(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setAccessibilityFocused(arg0);
    }

    public void setBoundsInParent(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setBoundsInParent(arg0 == null ? null : arg0.getReal());
    }

    public void setBoundsInScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setBoundsInScreen(arg0 == null ? null : arg0.getReal());
    }

    public void setBoundsInWindow(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setBoundsInWindow(arg0 == null ? null : arg0.getReal());
    }

    public void setCanOpenPopup(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setCanOpenPopup(arg0);
    }

    public void setCheckable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setCheckable(arg0);
    }

    public void setChecked(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setChecked(arg0);
    }

    public void setClassName(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setClassName(arg0);
    }

    public void setClickable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setClickable(arg0);
    }

    public void setCollectionInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setCollectionInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setCollectionItemInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setCollectionItemInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setContainerTitle(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setContainerTitle(arg0);
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setContentDescription(arg0);
    }

    public void setContentInvalid(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setContentInvalid(arg0);
    }

    public void setContextClickable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setContextClickable(arg0);
    }

    public void setDismissable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setDismissable(arg0);
    }

    public void setDrawingOrder(int arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setDrawingOrder(arg0);
    }

    public void setEditable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setEditable(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setEnabled(arg0);
    }

    public void setError(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setError(arg0);
    }

    public void setFocusable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setFocusable(arg0);
    }

    public void setFocused(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setFocused(arg0);
    }

    public void setGranularScrollingSupported(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setGranularScrollingSupported(arg0);
    }

    public void setHeading(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setHeading(arg0);
    }

    public void setHintText(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setHintText(arg0);
    }

    public void setImportantForAccessibility(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setImportantForAccessibility(arg0);
    }

    public void setInputType(int arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setInputType(arg0);
    }

    public void setLabelFor(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setLabelFor(arg0 == null ? null : arg0.getReal());
    }

    public void setLabelFor(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setLabelFor(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setLabeledBy(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setLabeledBy(arg0 == null ? null : arg0.getReal());
    }

    public void setLabeledBy(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setLabeledBy(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setLiveRegion(int arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setLiveRegion(arg0);
    }

    public void setLongClickable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setLongClickable(arg0);
    }

    public void setMaxTextLength(int arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setMaxTextLength(arg0);
    }

    public void setMinDurationBetweenContentChanges(java.time.Duration arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setMinDurationBetweenContentChanges(arg0);
    }

    public void setMovementGranularities(int arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setMovementGranularities(arg0);
    }

    public void setMultiLine(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setMultiLine(arg0);
    }

    public void setPackageName(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setPackageName(arg0);
    }

    public void setPaneTitle(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setPaneTitle(arg0);
    }

    public void setParent(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setParent(arg0 == null ? null : arg0.getReal());
    }

    public void setParent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setParent(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setPassword(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setPassword(arg0);
    }

    public void setQueryFromAppProcessEnabled(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setQueryFromAppProcessEnabled(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setRangeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setRangeInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setRequestInitialAccessibilityFocus(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setRequestInitialAccessibilityFocus(arg0);
    }

    public void setScreenReaderFocusable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setScreenReaderFocusable(arg0);
    }

    public void setScrollable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setScrollable(arg0);
    }

    public void setSelected(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setSelected(arg0);
    }

    public void setShowingHintText(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setShowingHintText(arg0);
    }

    public void setSource(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setSource(arg0 == null ? null : arg0.getReal());
    }

    public void setSource(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setSource(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setStateDescription(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setText(arg0);
    }

    public void setTextEntryKey(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTextEntryKey(arg0);
    }

    public void setTextSelectable(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTextSelectable(arg0);
    }

    public void setTextSelection(int arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTextSelection(arg0, arg1);
    }

    public void setTooltipText(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTooltipText(arg0);
    }

    public void setTouchDelegateInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTouchDelegateInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setTraversalAfter(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTraversalAfter(arg0 == null ? null : arg0.getReal());
    }

    public void setTraversalAfter(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTraversalAfter(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setTraversalBefore(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTraversalBefore(arg0 == null ? null : arg0.getReal());
    }

    public void setTraversalBefore(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setTraversalBefore(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setUniqueId(java.lang.String arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setUniqueId(arg0);
    }

    public void setViewIdResourceName(java.lang.String arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setViewIdResourceName(arg0);
    }

    public void setVisibleToUser(boolean arg0) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).setVisibleToUser(arg0);
    }

    public java.lang.String toString() {
        return ((android.view.accessibility.AccessibilityNodeInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.accessibility.AccessibilityNodeInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ACTION_ACCESSIBILITY_FOCUS = android.view.accessibility.AccessibilityNodeInfo.ACTION_ACCESSIBILITY_FOCUS;
    public static final java.lang.String ACTION_ARGUMENT_COLUMN_INT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_COLUMN_INT;
    public static final java.lang.String ACTION_ARGUMENT_DIRECTION_INT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_DIRECTION_INT;
    public static final java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN;
    public static final java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_HTML_ELEMENT_STRING;
    public static final java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT;
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_X = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_MOVE_WINDOW_X;
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_Y = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_MOVE_WINDOW_Y;
    public static final java.lang.String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT;
    public static final java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_PROGRESS_VALUE;
    public static final java.lang.String ACTION_ARGUMENT_ROW_INT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_ROW_INT;
    public static final java.lang.String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT;
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_END_INT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_SELECTION_END_INT;
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_START_INT = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_SELECTION_START_INT;
    public static final java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = android.view.accessibility.AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE;
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = android.view.accessibility.AccessibilityNodeInfo.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
    public static final int ACTION_CLEAR_FOCUS = android.view.accessibility.AccessibilityNodeInfo.ACTION_CLEAR_FOCUS;
    public static final int ACTION_CLEAR_SELECTION = android.view.accessibility.AccessibilityNodeInfo.ACTION_CLEAR_SELECTION;
    public static final int ACTION_CLICK = android.view.accessibility.AccessibilityNodeInfo.ACTION_CLICK;
    public static final int ACTION_COLLAPSE = android.view.accessibility.AccessibilityNodeInfo.ACTION_COLLAPSE;
    public static final int ACTION_COPY = android.view.accessibility.AccessibilityNodeInfo.ACTION_COPY;
    public static final int ACTION_CUT = android.view.accessibility.AccessibilityNodeInfo.ACTION_CUT;
    public static final int ACTION_DISMISS = android.view.accessibility.AccessibilityNodeInfo.ACTION_DISMISS;
    public static final int ACTION_EXPAND = android.view.accessibility.AccessibilityNodeInfo.ACTION_EXPAND;
    public static final int ACTION_FOCUS = android.view.accessibility.AccessibilityNodeInfo.ACTION_FOCUS;
    public static final int ACTION_LONG_CLICK = android.view.accessibility.AccessibilityNodeInfo.ACTION_LONG_CLICK;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = android.view.accessibility.AccessibilityNodeInfo.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
    public static final int ACTION_NEXT_HTML_ELEMENT = android.view.accessibility.AccessibilityNodeInfo.ACTION_NEXT_HTML_ELEMENT;
    public static final int ACTION_PASTE = android.view.accessibility.AccessibilityNodeInfo.ACTION_PASTE;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = android.view.accessibility.AccessibilityNodeInfo.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = android.view.accessibility.AccessibilityNodeInfo.ACTION_PREVIOUS_HTML_ELEMENT;
    public static final int ACTION_SCROLL_BACKWARD = android.view.accessibility.AccessibilityNodeInfo.ACTION_SCROLL_BACKWARD;
    public static final int ACTION_SCROLL_FORWARD = android.view.accessibility.AccessibilityNodeInfo.ACTION_SCROLL_FORWARD;
    public static final int ACTION_SELECT = android.view.accessibility.AccessibilityNodeInfo.ACTION_SELECT;
    public static final int ACTION_SET_SELECTION = android.view.accessibility.AccessibilityNodeInfo.ACTION_SET_SELECTION;
    public static final int ACTION_SET_TEXT = android.view.accessibility.AccessibilityNodeInfo.ACTION_SET_TEXT;
    public static final java.lang.String EXTRA_DATA_RENDERING_INFO_KEY = android.view.accessibility.AccessibilityNodeInfo.EXTRA_DATA_RENDERING_INFO_KEY;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = android.view.accessibility.AccessibilityNodeInfo.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH;
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = android.view.accessibility.AccessibilityNodeInfo.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = android.view.accessibility.AccessibilityNodeInfo.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = android.view.accessibility.AccessibilityNodeInfo.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY;
    public static final int FLAG_PREFETCH_ANCESTORS = android.view.accessibility.AccessibilityNodeInfo.FLAG_PREFETCH_ANCESTORS;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = android.view.accessibility.AccessibilityNodeInfo.FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = android.view.accessibility.AccessibilityNodeInfo.FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = android.view.accessibility.AccessibilityNodeInfo.FLAG_PREFETCH_DESCENDANTS_HYBRID;
    public static final int FLAG_PREFETCH_SIBLINGS = android.view.accessibility.AccessibilityNodeInfo.FLAG_PREFETCH_SIBLINGS;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = android.view.accessibility.AccessibilityNodeInfo.FLAG_PREFETCH_UNINTERRUPTIBLE;
    public static final int FOCUS_ACCESSIBILITY = android.view.accessibility.AccessibilityNodeInfo.FOCUS_ACCESSIBILITY;
    public static final int FOCUS_INPUT = android.view.accessibility.AccessibilityNodeInfo.FOCUS_INPUT;
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = android.view.accessibility.AccessibilityNodeInfo.MAX_NUMBER_OF_PREFETCHED_NODES;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = android.view.accessibility.AccessibilityNodeInfo.MOVEMENT_GRANULARITY_CHARACTER;
    public static final int MOVEMENT_GRANULARITY_LINE = android.view.accessibility.AccessibilityNodeInfo.MOVEMENT_GRANULARITY_LINE;
    public static final int MOVEMENT_GRANULARITY_PAGE = android.view.accessibility.AccessibilityNodeInfo.MOVEMENT_GRANULARITY_PAGE;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = android.view.accessibility.AccessibilityNodeInfo.MOVEMENT_GRANULARITY_PARAGRAPH;
    public static final int MOVEMENT_GRANULARITY_WORD = android.view.accessibility.AccessibilityNodeInfo.MOVEMENT_GRANULARITY_WORD;

    public static final class AccessibilityAction {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AccessibilityAction(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getReal() {
            return (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real;
        }

        public android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction unwrap() {
            return getReal();
        }

        public AccessibilityAction(int arg0, java.lang.CharSequence arg1) {
            this(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real).equals(arg0);
        }

        public int getId() {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real).getId();
        }

        public java.lang.CharSequence getLabel() {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real).getLabel();
        }

        public int hashCode() {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_ACCESSIBILITY_FOCUS = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_ACCESSIBILITY_FOCUS = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_FOCUS = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_FOCUS);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_SELECTION = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_SELECTION);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLICK = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COLLAPSE = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_COLLAPSE);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CONTEXT_CLICK = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COPY = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_COPY);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CUT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CUT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DISMISS = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DISMISS);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_CANCEL = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_DROP = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_START = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_EXPAND = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_EXPAND);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_FOCUS = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_FOCUS);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_HIDE_TOOLTIP = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_IME_ENTER = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_LONG_CLICK = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_MOVE_WINDOW = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_AT_MOVEMENT_GRANULARITY = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_HTML_ELEMENT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_NEXT_HTML_ELEMENT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_DOWN = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_LEFT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_RIGHT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_UP = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PASTE = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PASTE);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PRESS_AND_HOLD = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_HTML_ELEMENT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PREVIOUS_HTML_ELEMENT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_BACKWARD = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_DOWN = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_FORWARD = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_IN_DIRECTION = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_LEFT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_RIGHT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_TO_POSITION = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_UP = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SELECT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SELECT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_PROGRESS = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_SELECTION = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_SELECTION);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_TEXT = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_TEXT);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_ON_SCREEN = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_TEXT_SUGGESTIONS = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS);
        public static final com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_TOOLTIP = com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP);

    }
    public static final class CollectionInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CollectionInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo getReal() {
            return (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) real;
        }

        public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo unwrap() {
            return getReal();
        }

        public CollectionInfo(int arg0, int arg1, boolean arg2) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public CollectionInfo(int arg0, int arg1, boolean arg2, int arg3) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionInfo(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public int getColumnCount() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) real).getColumnCount();
        }

        public int getImportantForAccessibilityItemCount() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) real).getImportantForAccessibilityItemCount();
        }

        public int getItemCount() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) real).getItemCount();
        }

        public int getRowCount() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) real).getRowCount();
        }

        public int getSelectionMode() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) real).getSelectionMode();
        }

        public boolean isHierarchical() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) real).isHierarchical();
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int arg0, int arg1, boolean arg2) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(arg0, arg1, arg2));
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int arg0, int arg1, boolean arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(arg0, arg1, arg2, arg3));
        }

        public static final int SELECTION_MODE_MULTIPLE = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.SELECTION_MODE_MULTIPLE;
        public static final int SELECTION_MODE_NONE = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.SELECTION_MODE_NONE;
        public static final int SELECTION_MODE_SINGLE = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.SELECTION_MODE_SINGLE;
        public static final int UNDEFINED = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.UNDEFINED;

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder getReal() {
                return (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real;
            }

            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo build() {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setColumnCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real).setColumnCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setHierarchical(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real).setHierarchical(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setImportantForAccessibilityItemCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real).setImportantForAccessibilityItemCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setItemCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real).setItemCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setRowCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real).setRowCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setSelectionMode(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder) real).setSelectionMode(arg0));
            }

        }
    }
    public static final class CollectionItemInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CollectionItemInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo getReal() {
            return (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real;
        }

        public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo unwrap() {
            return getReal();
        }

        public CollectionItemInfo(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
        }

        public CollectionItemInfo(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
        }

        public int getColumnIndex() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).getColumnIndex();
        }

        public int getColumnSpan() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).getColumnSpan();
        }

        public java.lang.String getColumnTitle() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).getColumnTitle();
        }

        public int getRowIndex() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).getRowIndex();
        }

        public int getRowSpan() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).getRowSpan();
        }

        public java.lang.String getRowTitle() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).getRowTitle();
        }

        public boolean isHeading() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).isHeading();
        }

        public boolean isSelected() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) real).isSelected();
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(arg0, arg1, arg2, arg3, arg4));
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(arg0, arg1, arg2, arg3, arg4, arg5));
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder getReal() {
                return (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real;
            }

            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo build() {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setColumnIndex(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnSpan(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setColumnSpan(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnTitle(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setColumnTitle(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setHeading(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setHeading(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setRowIndex(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowSpan(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setRowSpan(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowTitle(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setRowTitle(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setSelected(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder) real).setSelected(arg0));
            }

        }
    }
    public static final class ExtraRenderingInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ExtraRenderingInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo wrap(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getReal() {
            return (android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo) real;
        }

        public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.util.Size getLayoutSize() {
            return com.micklab.dcg.wrapper.android.util.Size.wrap(((android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo) real).getLayoutSize());
        }

        public float getTextSizeInPx() {
            return ((android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo) real).getTextSizeInPx();
        }

        public int getTextSizeUnit() {
            return ((android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo) real).getTextSizeUnit();
        }

    }
    public static final class RangeInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RangeInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo wrap(android.view.accessibility.AccessibilityNodeInfo.RangeInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityNodeInfo.RangeInfo getReal() {
            return (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) real;
        }

        public android.view.accessibility.AccessibilityNodeInfo.RangeInfo unwrap() {
            return getReal();
        }

        public RangeInfo(int arg0, float arg1, float arg2, float arg3) {
            this(new android.view.accessibility.AccessibilityNodeInfo.RangeInfo(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public float getCurrent() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) real).getCurrent();
        }

        public float getMax() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) real).getMax();
        }

        public float getMin() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) real).getMin();
        }

        public int getType() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) real).getType();
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo obtain(int arg0, float arg1, float arg2, float arg3) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(arg0, arg1, arg2, arg3));
        }

        public static final int RANGE_TYPE_FLOAT = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.RANGE_TYPE_FLOAT;
        public static final int RANGE_TYPE_INT = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.RANGE_TYPE_INT;
        public static final int RANGE_TYPE_PERCENT = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.RANGE_TYPE_PERCENT;

    }
    public static final class TouchDelegateInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TouchDelegateInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo wrap(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getReal() {
            return (android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo) real;
        }

        public android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo unwrap() {
            return getReal();
        }

        public TouchDelegateInfo(java.util.Map arg0) {
            this(new android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo(arg0), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.graphics.Region getRegionAt(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Region.wrap(((android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo) real).getRegionAt(arg0));
        }

        public int getRegionCount() {
            return ((android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo) real).getRegionCount();
        }

        public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getTargetForRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo) real).getTargetForRegion(arg0 == null ? null : arg0.getReal()));
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
