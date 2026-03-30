// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class PopupWindow {
    private final android.widget.PopupWindow real;

    public PopupWindow(android.widget.PopupWindow real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.PopupWindow wrap(android.widget.PopupWindow real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupWindow(real);
    }

    public android.widget.PopupWindow unwrap() {
        return real;
    }

    public PopupWindow() {
        this(new android.widget.PopupWindow());
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.unwrap()));
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.unwrap()));
    }

    public PopupWindow(int arg0, int arg1) {
        this(new android.widget.PopupWindow(arg0, arg1));
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, boolean arg3) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void dismiss() {
        real.dismiss();
    }

    public int getAnimationStyle() {
        return real.getAnimationStyle();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getBackground());
    }

    public com.micklab.dcg.wrapper.android.view.View getContentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getContentView());
    }

    public float getElevation() {
        return real.getElevation();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getEpicenterBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getEpicenterBounds());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getExitTransition());
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getInputMethodMode() {
        return real.getInputMethodMode();
    }

    public int getMaxAvailableHeight(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.getMaxAvailableHeight(arg0 == null ? null : arg0.unwrap());
    }

    public int getMaxAvailableHeight(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return real.getMaxAvailableHeight(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int getMaxAvailableHeight(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, boolean arg2) {
        return real.getMaxAvailableHeight(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean getOverlapAnchor() {
        return real.getOverlapAnchor();
    }

    public int getSoftInputMode() {
        return real.getSoftInputMode();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public int getWindowLayoutType() {
        return real.getWindowLayoutType();
    }

    public boolean isAboveAnchor() {
        return real.isAboveAnchor();
    }

    public boolean isAttachedInDecor() {
        return real.isAttachedInDecor();
    }

    public boolean isClippedToScreen() {
        return real.isClippedToScreen();
    }

    public boolean isClippingEnabled() {
        return real.isClippingEnabled();
    }

    public boolean isFocusable() {
        return real.isFocusable();
    }

    public boolean isLaidOutInScreen() {
        return real.isLaidOutInScreen();
    }

    public boolean isOutsideTouchable() {
        return real.isOutsideTouchable();
    }

    public boolean isShowing() {
        return real.isShowing();
    }

    public boolean isSplitTouchEnabled() {
        return real.isSplitTouchEnabled();
    }

    public boolean isTouchModal() {
        return real.isTouchModal();
    }

    public boolean isTouchable() {
        return real.isTouchable();
    }

    public void setAnimationStyle(int arg0) {
        real.setAnimationStyle(arg0);
    }

    public void setAttachedInDecor(boolean arg0) {
        real.setAttachedInDecor(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setClippingEnabled(boolean arg0) {
        real.setClippingEnabled(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setContentView(arg0 == null ? null : arg0.unwrap());
    }

    public void setElevation(float arg0) {
        real.setElevation(arg0);
    }

    public void setEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setEnterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setEpicenterBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setEpicenterBounds(arg0 == null ? null : arg0.unwrap());
    }

    public void setExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setExitTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setFocusable(boolean arg0) {
        real.setFocusable(arg0);
    }

    public void setHeight(int arg0) {
        real.setHeight(arg0);
    }

    public void setIgnoreCheekPress() {
        real.setIgnoreCheekPress();
    }

    public void setInputMethodMode(int arg0) {
        real.setInputMethodMode(arg0);
    }

    public void setIsClippedToScreen(boolean arg0) {
        real.setIsClippedToScreen(arg0);
    }

    public void setIsLaidOutInScreen(boolean arg0) {
        real.setIsLaidOutInScreen(arg0);
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener arg0) {
        real.setOnDismissListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOutsideTouchable(boolean arg0) {
        real.setOutsideTouchable(arg0);
    }

    public void setOverlapAnchor(boolean arg0) {
        real.setOverlapAnchor(arg0);
    }

    public void setSoftInputMode(int arg0) {
        real.setSoftInputMode(arg0);
    }

    public void setSplitTouchEnabled(boolean arg0) {
        real.setSplitTouchEnabled(arg0);
    }

    public void setTouchInterceptor(com.micklab.dcg.wrapper.android.view.View.OnTouchListener arg0) {
        real.setTouchInterceptor(arg0 == null ? null : arg0.unwrap());
    }

    public void setTouchModal(boolean arg0) {
        real.setTouchModal(arg0);
    }

    public void setTouchable(boolean arg0) {
        real.setTouchable(arg0);
    }

    public void setWidth(int arg0) {
        real.setWidth(arg0);
    }

    public void setWindowLayoutMode(int arg0, int arg1) {
        real.setWindowLayoutMode(arg0, arg1);
    }

    public void setWindowLayoutType(int arg0) {
        real.setWindowLayoutType(arg0);
    }

    public void showAsDropDown(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.showAsDropDown(arg0 == null ? null : arg0.unwrap());
    }

    public void showAsDropDown(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        real.showAsDropDown(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void showAsDropDown(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3) {
        real.showAsDropDown(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void showAtLocation(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3) {
        real.showAtLocation(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void update() {
        real.update();
    }

    public void update(int arg0, int arg1) {
        real.update(arg0, arg1);
    }

    public void update(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        real.update(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void update(int arg0, int arg1, int arg2, int arg3) {
        real.update(arg0, arg1, arg2, arg3);
    }

    public void update(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        real.update(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void update(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        real.update(arg0, arg1, arg2, arg3, arg4);
    }

    public static final int INPUT_METHOD_FROM_FOCUSABLE = android.widget.PopupWindow.INPUT_METHOD_FROM_FOCUSABLE;
    public static final int INPUT_METHOD_NEEDED = android.widget.PopupWindow.INPUT_METHOD_NEEDED;
    public static final int INPUT_METHOD_NOT_NEEDED = android.widget.PopupWindow.INPUT_METHOD_NOT_NEEDED;

    public static final class OnDismissListener {
        private final android.widget.PopupWindow.OnDismissListener real;

        public OnDismissListener(android.widget.PopupWindow.OnDismissListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener wrap(android.widget.PopupWindow.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener(real);
        }

        public android.widget.PopupWindow.OnDismissListener unwrap() {
            return real;
        }

        public void onDismiss() {
            real.onDismiss();
        }

    }
}
