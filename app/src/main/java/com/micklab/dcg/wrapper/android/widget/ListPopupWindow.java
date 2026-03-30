// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ListPopupWindow {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListPopupWindow(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ListPopupWindow wrap(android.widget.ListPopupWindow real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ListPopupWindow(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ListPopupWindow getReal() {
        return (android.widget.ListPopupWindow) real;
    }

    public android.widget.ListPopupWindow unwrap() {
        return getReal();
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void clearListSelection() {
        ((android.widget.ListPopupWindow) real).clearListSelection();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnTouchListener createDragToOpenListener(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.View.OnTouchListener.wrap(((android.widget.ListPopupWindow) real).createDragToOpenListener(arg0 == null ? null : arg0.getReal()));
    }

    public void dismiss() {
        ((android.widget.ListPopupWindow) real).dismiss();
    }

    public com.micklab.dcg.wrapper.android.view.View getAnchorView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ListPopupWindow) real).getAnchorView());
    }

    public int getAnimationStyle() {
        return ((android.widget.ListPopupWindow) real).getAnimationStyle();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.ListPopupWindow) real).getBackground());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getEpicenterBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.widget.ListPopupWindow) real).getEpicenterBounds());
    }

    public int getHeight() {
        return ((android.widget.ListPopupWindow) real).getHeight();
    }

    public int getHorizontalOffset() {
        return ((android.widget.ListPopupWindow) real).getHorizontalOffset();
    }

    public int getInputMethodMode() {
        return ((android.widget.ListPopupWindow) real).getInputMethodMode();
    }

    public com.micklab.dcg.wrapper.android.widget.ListView getListView() {
        return com.micklab.dcg.wrapper.android.widget.ListView.wrap(((android.widget.ListPopupWindow) real).getListView());
    }

    public int getPromptPosition() {
        return ((android.widget.ListPopupWindow) real).getPromptPosition();
    }

    public java.lang.Object getSelectedItem() {
        return ((android.widget.ListPopupWindow) real).getSelectedItem();
    }

    public long getSelectedItemId() {
        return ((android.widget.ListPopupWindow) real).getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return ((android.widget.ListPopupWindow) real).getSelectedItemPosition();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ListPopupWindow) real).getSelectedView());
    }

    public int getSoftInputMode() {
        return ((android.widget.ListPopupWindow) real).getSoftInputMode();
    }

    public int getVerticalOffset() {
        return ((android.widget.ListPopupWindow) real).getVerticalOffset();
    }

    public int getWidth() {
        return ((android.widget.ListPopupWindow) real).getWidth();
    }

    public boolean isInputMethodNotNeeded() {
        return ((android.widget.ListPopupWindow) real).isInputMethodNotNeeded();
    }

    public boolean isModal() {
        return ((android.widget.ListPopupWindow) real).isModal();
    }

    public boolean isShowing() {
        return ((android.widget.ListPopupWindow) real).isShowing();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.ListPopupWindow) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.ListPopupWindow) real).onKeyPreIme(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.ListPopupWindow) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean performItemClick(int arg0) {
        return ((android.widget.ListPopupWindow) real).performItemClick(arg0);
    }

    public void postShow() {
        ((android.widget.ListPopupWindow) real).postShow();
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        ((android.widget.ListPopupWindow) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setAnchorView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ListPopupWindow) real).setAnchorView(arg0 == null ? null : arg0.getReal());
    }

    public void setAnimationStyle(int arg0) {
        ((android.widget.ListPopupWindow) real).setAnimationStyle(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ListPopupWindow) real).setBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setContentWidth(int arg0) {
        ((android.widget.ListPopupWindow) real).setContentWidth(arg0);
    }

    public void setDropDownGravity(int arg0) {
        ((android.widget.ListPopupWindow) real).setDropDownGravity(arg0);
    }

    public void setEpicenterBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.widget.ListPopupWindow) real).setEpicenterBounds(arg0 == null ? null : arg0.getReal());
    }

    public void setHeight(int arg0) {
        ((android.widget.ListPopupWindow) real).setHeight(arg0);
    }

    public void setHorizontalOffset(int arg0) {
        ((android.widget.ListPopupWindow) real).setHorizontalOffset(arg0);
    }

    public void setInputMethodMode(int arg0) {
        ((android.widget.ListPopupWindow) real).setInputMethodMode(arg0);
    }

    public void setListSelector(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ListPopupWindow) real).setListSelector(arg0 == null ? null : arg0.getReal());
    }

    public void setModal(boolean arg0) {
        ((android.widget.ListPopupWindow) real).setModal(arg0);
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener arg0) {
        ((android.widget.ListPopupWindow) real).setOnDismissListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        ((android.widget.ListPopupWindow) real).setOnItemClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
        ((android.widget.ListPopupWindow) real).setOnItemSelectedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPromptPosition(int arg0) {
        ((android.widget.ListPopupWindow) real).setPromptPosition(arg0);
    }

    public void setPromptView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ListPopupWindow) real).setPromptView(arg0 == null ? null : arg0.getReal());
    }

    public void setSelection(int arg0) {
        ((android.widget.ListPopupWindow) real).setSelection(arg0);
    }

    public void setSoftInputMode(int arg0) {
        ((android.widget.ListPopupWindow) real).setSoftInputMode(arg0);
    }

    public void setVerticalOffset(int arg0) {
        ((android.widget.ListPopupWindow) real).setVerticalOffset(arg0);
    }

    public void setWidth(int arg0) {
        ((android.widget.ListPopupWindow) real).setWidth(arg0);
    }

    public void setWindowLayoutType(int arg0) {
        ((android.widget.ListPopupWindow) real).setWindowLayoutType(arg0);
    }

    public void show() {
        ((android.widget.ListPopupWindow) real).show();
    }

    public static final int INPUT_METHOD_FROM_FOCUSABLE = android.widget.ListPopupWindow.INPUT_METHOD_FROM_FOCUSABLE;
    public static final int INPUT_METHOD_NEEDED = android.widget.ListPopupWindow.INPUT_METHOD_NEEDED;
    public static final int INPUT_METHOD_NOT_NEEDED = android.widget.ListPopupWindow.INPUT_METHOD_NOT_NEEDED;
    public static final int MATCH_PARENT = android.widget.ListPopupWindow.MATCH_PARENT;
    public static final int POSITION_PROMPT_ABOVE = android.widget.ListPopupWindow.POSITION_PROMPT_ABOVE;
    public static final int POSITION_PROMPT_BELOW = android.widget.ListPopupWindow.POSITION_PROMPT_BELOW;
    public static final int WRAP_CONTENT = android.widget.ListPopupWindow.WRAP_CONTENT;

}
