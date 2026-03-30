// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ListPopupWindow {
    private final android.widget.ListPopupWindow real;

    public ListPopupWindow(android.widget.ListPopupWindow real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ListPopupWindow wrap(android.widget.ListPopupWindow real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ListPopupWindow(real);
    }

    public android.widget.ListPopupWindow unwrap() {
        return real;
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.unwrap()));
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ListPopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ListPopupWindow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void clearListSelection() {
        real.clearListSelection();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnTouchListener createDragToOpenListener(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.View.OnTouchListener.wrap(real.createDragToOpenListener(arg0 == null ? null : arg0.unwrap()));
    }

    public void dismiss() {
        real.dismiss();
    }

    public com.micklab.dcg.wrapper.android.view.View getAnchorView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getAnchorView());
    }

    public int getAnimationStyle() {
        return real.getAnimationStyle();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getBackground());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getEpicenterBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getEpicenterBounds());
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getHorizontalOffset() {
        return real.getHorizontalOffset();
    }

    public int getInputMethodMode() {
        return real.getInputMethodMode();
    }

    public com.micklab.dcg.wrapper.android.widget.ListView getListView() {
        return com.micklab.dcg.wrapper.android.widget.ListView.wrap(real.getListView());
    }

    public int getPromptPosition() {
        return real.getPromptPosition();
    }

    public java.lang.Object getSelectedItem() {
        return real.getSelectedItem();
    }

    public long getSelectedItemId() {
        return real.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return real.getSelectedItemPosition();
    }

    public com.micklab.dcg.wrapper.android.view.View getSelectedView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getSelectedView());
    }

    public int getSoftInputMode() {
        return real.getSoftInputMode();
    }

    public int getVerticalOffset() {
        return real.getVerticalOffset();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean isInputMethodNotNeeded() {
        return real.isInputMethodNotNeeded();
    }

    public boolean isModal() {
        return real.isModal();
    }

    public boolean isShowing() {
        return real.isShowing();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyPreIme(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean performItemClick(int arg0) {
        return real.performItemClick(arg0);
    }

    public void postShow() {
        real.postShow();
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.ListAdapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnchorView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setAnchorView(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnimationStyle(int arg0) {
        real.setAnimationStyle(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setContentWidth(int arg0) {
        real.setContentWidth(arg0);
    }

    public void setDropDownGravity(int arg0) {
        real.setDropDownGravity(arg0);
    }

    public void setEpicenterBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setEpicenterBounds(arg0 == null ? null : arg0.unwrap());
    }

    public void setHeight(int arg0) {
        real.setHeight(arg0);
    }

    public void setHorizontalOffset(int arg0) {
        real.setHorizontalOffset(arg0);
    }

    public void setInputMethodMode(int arg0) {
        real.setInputMethodMode(arg0);
    }

    public void setListSelector(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setListSelector(arg0 == null ? null : arg0.unwrap());
    }

    public void setModal(boolean arg0) {
        real.setModal(arg0);
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener arg0) {
        real.setOnDismissListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        real.setOnItemClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
        real.setOnItemSelectedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPromptPosition(int arg0) {
        real.setPromptPosition(arg0);
    }

    public void setPromptView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setPromptView(arg0 == null ? null : arg0.unwrap());
    }

    public void setSelection(int arg0) {
        real.setSelection(arg0);
    }

    public void setSoftInputMode(int arg0) {
        real.setSoftInputMode(arg0);
    }

    public void setVerticalOffset(int arg0) {
        real.setVerticalOffset(arg0);
    }

    public void setWidth(int arg0) {
        real.setWidth(arg0);
    }

    public void setWindowLayoutType(int arg0) {
        real.setWindowLayoutType(arg0);
    }

    public void show() {
        real.show();
    }

    public static final int INPUT_METHOD_FROM_FOCUSABLE = android.widget.ListPopupWindow.INPUT_METHOD_FROM_FOCUSABLE;
    public static final int INPUT_METHOD_NEEDED = android.widget.ListPopupWindow.INPUT_METHOD_NEEDED;
    public static final int INPUT_METHOD_NOT_NEEDED = android.widget.ListPopupWindow.INPUT_METHOD_NOT_NEEDED;
    public static final int MATCH_PARENT = android.widget.ListPopupWindow.MATCH_PARENT;
    public static final int POSITION_PROMPT_ABOVE = android.widget.ListPopupWindow.POSITION_PROMPT_ABOVE;
    public static final int POSITION_PROMPT_BELOW = android.widget.ListPopupWindow.POSITION_PROMPT_BELOW;
    public static final int WRAP_CONTENT = android.widget.ListPopupWindow.WRAP_CONTENT;

}
