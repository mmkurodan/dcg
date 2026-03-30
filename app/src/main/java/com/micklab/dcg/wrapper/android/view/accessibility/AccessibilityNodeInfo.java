// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityNodeInfo {
    private final android.view.accessibility.AccessibilityNodeInfo real;

    public AccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo wrap(android.view.accessibility.AccessibilityNodeInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo(real);
    }

    public android.view.accessibility.AccessibilityNodeInfo unwrap() {
        return real;
    }

    public AccessibilityNodeInfo() {
        this(new android.view.accessibility.AccessibilityNodeInfo());
    }

    public AccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        this(new android.view.accessibility.AccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public AccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.view.accessibility.AccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public AccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        this(new android.view.accessibility.AccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void addAction(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction arg0) {
        real.addAction(arg0 == null ? null : arg0.unwrap());
    }

    public void addAction(int arg0) {
        real.addAction(arg0);
    }

    public void addChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addChild(arg0 == null ? null : arg0.unwrap());
    }

    public void addChild(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.addChild(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean canOpenPopup() {
        return real.canOpenPopup();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo findFocus(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.findFocus(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo focusSearch(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.focusSearch(arg0));
    }

    public int getActions() {
        return real.getActions();
    }

    public void getBoundsInParent(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getBoundsInParent(arg0 == null ? null : arg0.unwrap());
    }

    public void getBoundsInScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getBoundsInScreen(arg0 == null ? null : arg0.unwrap());
    }

    public void getBoundsInWindow(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getBoundsInWindow(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getChild(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getChild(arg0, arg1));
    }

    public int getChildCount() {
        return real.getChildCount();
    }

    public java.lang.CharSequence getClassName() {
        return real.getClassName();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo getCollectionInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.wrap(real.getCollectionInfo());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo getCollectionItemInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(real.getCollectionItemInfo());
    }

    public java.lang.CharSequence getContainerTitle() {
        return real.getContainerTitle();
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public int getDrawingOrder() {
        return real.getDrawingOrder();
    }

    public java.lang.CharSequence getError() {
        return real.getError();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.wrap(real.getExtraRenderingInfo());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.CharSequence getHintText() {
        return real.getHintText();
    }

    public int getInputType() {
        return real.getInputType();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getLabelFor() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getLabelFor());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getLabeledBy() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getLabeledBy());
    }

    public int getLiveRegion() {
        return real.getLiveRegion();
    }

    public int getMaxTextLength() {
        return real.getMaxTextLength();
    }

    public java.time.Duration getMinDurationBetweenContentChanges() {
        return real.getMinDurationBetweenContentChanges();
    }

    public int getMovementGranularities() {
        return real.getMovementGranularities();
    }

    public java.lang.CharSequence getPackageName() {
        return real.getPackageName();
    }

    public java.lang.CharSequence getPaneTitle() {
        return real.getPaneTitle();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getParent() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getParent());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getParent(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getParent(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo getRangeInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo.wrap(real.getRangeInfo());
    }

    public java.lang.CharSequence getStateDescription() {
        return real.getStateDescription();
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public int getTextSelectionEnd() {
        return real.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return real.getTextSelectionStart();
    }

    public java.lang.CharSequence getTooltipText() {
        return real.getTooltipText();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo.wrap(real.getTouchDelegateInfo());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getTraversalAfter() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getTraversalAfter());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getTraversalBefore() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getTraversalBefore());
    }

    public java.lang.String getUniqueId() {
        return real.getUniqueId();
    }

    public java.lang.String getViewIdResourceName() {
        return real.getViewIdResourceName();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo getWindow() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityWindowInfo.wrap(real.getWindow());
    }

    public int getWindowId() {
        return real.getWindowId();
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        return real.hasRequestInitialAccessibilityFocus();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return real.isAccessibilityDataSensitive();
    }

    public boolean isAccessibilityFocused() {
        return real.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return real.isCheckable();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public boolean isClickable() {
        return real.isClickable();
    }

    public boolean isContentInvalid() {
        return real.isContentInvalid();
    }

    public boolean isContextClickable() {
        return real.isContextClickable();
    }

    public boolean isDismissable() {
        return real.isDismissable();
    }

    public boolean isEditable() {
        return real.isEditable();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isFocusable() {
        return real.isFocusable();
    }

    public boolean isFocused() {
        return real.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return real.isGranularScrollingSupported();
    }

    public boolean isHeading() {
        return real.isHeading();
    }

    public boolean isImportantForAccessibility() {
        return real.isImportantForAccessibility();
    }

    public boolean isLongClickable() {
        return real.isLongClickable();
    }

    public boolean isMultiLine() {
        return real.isMultiLine();
    }

    public boolean isPassword() {
        return real.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return real.isScreenReaderFocusable();
    }

    public boolean isScrollable() {
        return real.isScrollable();
    }

    public boolean isSelected() {
        return real.isSelected();
    }

    public boolean isShowingHintText() {
        return real.isShowingHintText();
    }

    public boolean isTextEntryKey() {
        return real.isTextEntryKey();
    }

    public boolean isTextSelectable() {
        return real.isTextSelectable();
    }

    public boolean isVisibleToUser() {
        return real.isVisibleToUser();
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain());
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo obtain(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public boolean performAction(int arg0) {
        return real.performAction(arg0);
    }

    public boolean performAction(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.performAction(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void recycle() {
        real.recycle();
    }

    public boolean refresh() {
        return real.refresh();
    }

    public boolean refreshWithExtraData(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.refreshWithExtraData(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean removeAction(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction arg0) {
        return real.removeAction(arg0 == null ? null : arg0.unwrap());
    }

    public void removeAction(int arg0) {
        real.removeAction(arg0);
    }

    public boolean removeChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.removeChild(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeChild(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return real.removeChild(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setAccessibilityDataSensitive(boolean arg0) {
        real.setAccessibilityDataSensitive(arg0);
    }

    public void setAccessibilityFocused(boolean arg0) {
        real.setAccessibilityFocused(arg0);
    }

    public void setBoundsInParent(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setBoundsInParent(arg0 == null ? null : arg0.unwrap());
    }

    public void setBoundsInScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setBoundsInScreen(arg0 == null ? null : arg0.unwrap());
    }

    public void setBoundsInWindow(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setBoundsInWindow(arg0 == null ? null : arg0.unwrap());
    }

    public void setCanOpenPopup(boolean arg0) {
        real.setCanOpenPopup(arg0);
    }

    public void setCheckable(boolean arg0) {
        real.setCheckable(arg0);
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setClassName(java.lang.CharSequence arg0) {
        real.setClassName(arg0);
    }

    public void setClickable(boolean arg0) {
        real.setClickable(arg0);
    }

    public void setCollectionInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo arg0) {
        real.setCollectionInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setCollectionItemInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo arg0) {
        real.setCollectionItemInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setContainerTitle(java.lang.CharSequence arg0) {
        real.setContainerTitle(arg0);
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        real.setContentDescription(arg0);
    }

    public void setContentInvalid(boolean arg0) {
        real.setContentInvalid(arg0);
    }

    public void setContextClickable(boolean arg0) {
        real.setContextClickable(arg0);
    }

    public void setDismissable(boolean arg0) {
        real.setDismissable(arg0);
    }

    public void setDrawingOrder(int arg0) {
        real.setDrawingOrder(arg0);
    }

    public void setEditable(boolean arg0) {
        real.setEditable(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setError(java.lang.CharSequence arg0) {
        real.setError(arg0);
    }

    public void setFocusable(boolean arg0) {
        real.setFocusable(arg0);
    }

    public void setFocused(boolean arg0) {
        real.setFocused(arg0);
    }

    public void setGranularScrollingSupported(boolean arg0) {
        real.setGranularScrollingSupported(arg0);
    }

    public void setHeading(boolean arg0) {
        real.setHeading(arg0);
    }

    public void setHintText(java.lang.CharSequence arg0) {
        real.setHintText(arg0);
    }

    public void setImportantForAccessibility(boolean arg0) {
        real.setImportantForAccessibility(arg0);
    }

    public void setInputType(int arg0) {
        real.setInputType(arg0);
    }

    public void setLabelFor(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setLabelFor(arg0 == null ? null : arg0.unwrap());
    }

    public void setLabelFor(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.setLabelFor(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setLabeledBy(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setLabeledBy(arg0 == null ? null : arg0.unwrap());
    }

    public void setLabeledBy(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.setLabeledBy(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setLiveRegion(int arg0) {
        real.setLiveRegion(arg0);
    }

    public void setLongClickable(boolean arg0) {
        real.setLongClickable(arg0);
    }

    public void setMaxTextLength(int arg0) {
        real.setMaxTextLength(arg0);
    }

    public void setMinDurationBetweenContentChanges(java.time.Duration arg0) {
        real.setMinDurationBetweenContentChanges(arg0);
    }

    public void setMovementGranularities(int arg0) {
        real.setMovementGranularities(arg0);
    }

    public void setMultiLine(boolean arg0) {
        real.setMultiLine(arg0);
    }

    public void setPackageName(java.lang.CharSequence arg0) {
        real.setPackageName(arg0);
    }

    public void setPaneTitle(java.lang.CharSequence arg0) {
        real.setPaneTitle(arg0);
    }

    public void setParent(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setParent(arg0 == null ? null : arg0.unwrap());
    }

    public void setParent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.setParent(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPassword(boolean arg0) {
        real.setPassword(arg0);
    }

    public void setQueryFromAppProcessEnabled(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        real.setQueryFromAppProcessEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setRangeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo arg0) {
        real.setRangeInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setRequestInitialAccessibilityFocus(boolean arg0) {
        real.setRequestInitialAccessibilityFocus(arg0);
    }

    public void setScreenReaderFocusable(boolean arg0) {
        real.setScreenReaderFocusable(arg0);
    }

    public void setScrollable(boolean arg0) {
        real.setScrollable(arg0);
    }

    public void setSelected(boolean arg0) {
        real.setSelected(arg0);
    }

    public void setShowingHintText(boolean arg0) {
        real.setShowingHintText(arg0);
    }

    public void setSource(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setSource(arg0 == null ? null : arg0.unwrap());
    }

    public void setSource(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.setSource(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        real.setStateDescription(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        real.setText(arg0);
    }

    public void setTextEntryKey(boolean arg0) {
        real.setTextEntryKey(arg0);
    }

    public void setTextSelectable(boolean arg0) {
        real.setTextSelectable(arg0);
    }

    public void setTextSelection(int arg0, int arg1) {
        real.setTextSelection(arg0, arg1);
    }

    public void setTooltipText(java.lang.CharSequence arg0) {
        real.setTooltipText(arg0);
    }

    public void setTouchDelegateInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo arg0) {
        real.setTouchDelegateInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setTraversalAfter(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setTraversalAfter(arg0 == null ? null : arg0.unwrap());
    }

    public void setTraversalAfter(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.setTraversalAfter(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setTraversalBefore(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setTraversalBefore(arg0 == null ? null : arg0.unwrap());
    }

    public void setTraversalBefore(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.setTraversalBefore(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setUniqueId(java.lang.String arg0) {
        real.setUniqueId(arg0);
    }

    public void setViewIdResourceName(java.lang.String arg0) {
        real.setViewIdResourceName(arg0);
    }

    public void setVisibleToUser(boolean arg0) {
        real.setVisibleToUser(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction real;

        public AccessibilityAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction wrap(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(real);
        }

        public android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction unwrap() {
            return real;
        }

        public AccessibilityAction(int arg0, java.lang.CharSequence arg1) {
            this(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(arg0, arg1));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getId() {
            return real.getId();
        }

        public java.lang.CharSequence getLabel() {
            return real.getLabel();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.view.accessibility.AccessibilityNodeInfo.CollectionInfo real;

        public CollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo(real);
        }

        public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo unwrap() {
            return real;
        }

        public CollectionInfo(int arg0, int arg1, boolean arg2) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionInfo(arg0, arg1, arg2));
        }

        public CollectionInfo(int arg0, int arg1, boolean arg2, int arg3) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionInfo(arg0, arg1, arg2, arg3));
        }

        public int getColumnCount() {
            return real.getColumnCount();
        }

        public int getImportantForAccessibilityItemCount() {
            return real.getImportantForAccessibilityItemCount();
        }

        public int getItemCount() {
            return real.getItemCount();
        }

        public int getRowCount() {
            return real.getRowCount();
        }

        public int getSelectionMode() {
            return real.getSelectionMode();
        }

        public boolean isHierarchical() {
            return real.isHierarchical();
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
            private final android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder real;

            public Builder(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder(real);
            }

            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder());
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo build() {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setColumnCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(real.setColumnCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setHierarchical(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(real.setHierarchical(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setImportantForAccessibilityItemCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(real.setImportantForAccessibilityItemCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setItemCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(real.setItemCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setRowCount(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(real.setRowCount(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setSelectionMode(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder.wrap(real.setSelectionMode(arg0));
            }

        }
    }
    public static final class CollectionItemInfo {
        private final android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo real;

        public CollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo(real);
        }

        public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo unwrap() {
            return real;
        }

        public CollectionItemInfo(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo(arg0, arg1, arg2, arg3, arg4));
        }

        public CollectionItemInfo(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
            this(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo(arg0, arg1, arg2, arg3, arg4, arg5));
        }

        public int getColumnIndex() {
            return real.getColumnIndex();
        }

        public int getColumnSpan() {
            return real.getColumnSpan();
        }

        public java.lang.String getColumnTitle() {
            return real.getColumnTitle();
        }

        public int getRowIndex() {
            return real.getRowIndex();
        }

        public int getRowSpan() {
            return real.getRowSpan();
        }

        public java.lang.String getRowTitle() {
            return real.getRowTitle();
        }

        public boolean isHeading() {
            return real.isHeading();
        }

        public boolean isSelected() {
            return real.isSelected();
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(arg0, arg1, arg2, arg3, arg4));
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(arg0, arg1, arg2, arg3, arg4, arg5));
        }

        public static final class Builder {
            private final android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder real;

            public Builder(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder wrap(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder(real);
            }

            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder());
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo build() {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setColumnIndex(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnSpan(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setColumnSpan(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnTitle(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setColumnTitle(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setHeading(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setHeading(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowIndex(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setRowIndex(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowSpan(int arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setRowSpan(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowTitle(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setRowTitle(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setSelected(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder.wrap(real.setSelected(arg0));
            }

        }
    }
    public static final class ExtraRenderingInfo {
        private final android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo real;

        public ExtraRenderingInfo(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo wrap(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo(real);
        }

        public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.util.Size getLayoutSize() {
            return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getLayoutSize());
        }

        public float getTextSizeInPx() {
            return real.getTextSizeInPx();
        }

        public int getTextSizeUnit() {
            return real.getTextSizeUnit();
        }

    }
    public static final class RangeInfo {
        private final android.view.accessibility.AccessibilityNodeInfo.RangeInfo real;

        public RangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo wrap(android.view.accessibility.AccessibilityNodeInfo.RangeInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo(real);
        }

        public android.view.accessibility.AccessibilityNodeInfo.RangeInfo unwrap() {
            return real;
        }

        public RangeInfo(int arg0, float arg1, float arg2, float arg3) {
            this(new android.view.accessibility.AccessibilityNodeInfo.RangeInfo(arg0, arg1, arg2, arg3));
        }

        public float getCurrent() {
            return real.getCurrent();
        }

        public float getMax() {
            return real.getMax();
        }

        public float getMin() {
            return real.getMin();
        }

        public int getType() {
            return real.getType();
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo obtain(int arg0, float arg1, float arg2, float arg3) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.RangeInfo.wrap(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(arg0, arg1, arg2, arg3));
        }

        public static final int RANGE_TYPE_FLOAT = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.RANGE_TYPE_FLOAT;
        public static final int RANGE_TYPE_INT = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.RANGE_TYPE_INT;
        public static final int RANGE_TYPE_PERCENT = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.RANGE_TYPE_PERCENT;

    }
    public static final class TouchDelegateInfo {
        private final android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo real;

        public TouchDelegateInfo(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo wrap(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo(real);
        }

        public android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo unwrap() {
            return real;
        }

        public TouchDelegateInfo(java.util.Map arg0) {
            this(new android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo(arg0));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.graphics.Region getRegionAt(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Region.wrap(real.getRegionAt(arg0));
        }

        public int getRegionCount() {
            return real.getRegionCount();
        }

        public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getTargetForRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.getTargetForRegion(arg0 == null ? null : arg0.unwrap()));
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
