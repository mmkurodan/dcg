// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class PopupWindow {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PopupWindow(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.PopupWindow wrap(android.widget.PopupWindow real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupWindow(real, (__DcgwBridgeToken) null);
    }

    public android.widget.PopupWindow getReal() {
        return (android.widget.PopupWindow) real;
    }

    public android.widget.PopupWindow unwrap() {
        return getReal();
    }

    public PopupWindow() {
        this(new android.widget.PopupWindow(), (__DcgwBridgeToken) null);
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PopupWindow(int arg0, int arg1) {
        this(new android.widget.PopupWindow(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, boolean arg3) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public PopupWindow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.PopupWindow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void dismiss() {
        ((android.widget.PopupWindow) real).dismiss();
    }

    public int getAnimationStyle() {
        return ((android.widget.PopupWindow) real).getAnimationStyle();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.PopupWindow) real).getBackground());
    }

    public com.micklab.dcg.wrapper.android.view.View getContentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.PopupWindow) real).getContentView());
    }

    public float getElevation() {
        return ((android.widget.PopupWindow) real).getElevation();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.widget.PopupWindow) real).getEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getEpicenterBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.widget.PopupWindow) real).getEpicenterBounds());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.widget.PopupWindow) real).getExitTransition());
    }

    public int getHeight() {
        return ((android.widget.PopupWindow) real).getHeight();
    }

    public int getInputMethodMode() {
        return ((android.widget.PopupWindow) real).getInputMethodMode();
    }

    public int getMaxAvailableHeight(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.PopupWindow) real).getMaxAvailableHeight(arg0 == null ? null : arg0.getReal());
    }

    public int getMaxAvailableHeight(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return ((android.widget.PopupWindow) real).getMaxAvailableHeight(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int getMaxAvailableHeight(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, boolean arg2) {
        return ((android.widget.PopupWindow) real).getMaxAvailableHeight(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean getOverlapAnchor() {
        return ((android.widget.PopupWindow) real).getOverlapAnchor();
    }

    public int getSoftInputMode() {
        return ((android.widget.PopupWindow) real).getSoftInputMode();
    }

    public int getWidth() {
        return ((android.widget.PopupWindow) real).getWidth();
    }

    public int getWindowLayoutType() {
        return ((android.widget.PopupWindow) real).getWindowLayoutType();
    }

    public boolean isAboveAnchor() {
        return ((android.widget.PopupWindow) real).isAboveAnchor();
    }

    public boolean isAttachedInDecor() {
        return ((android.widget.PopupWindow) real).isAttachedInDecor();
    }

    public boolean isClippedToScreen() {
        return ((android.widget.PopupWindow) real).isClippedToScreen();
    }

    public boolean isClippingEnabled() {
        return ((android.widget.PopupWindow) real).isClippingEnabled();
    }

    public boolean isFocusable() {
        return ((android.widget.PopupWindow) real).isFocusable();
    }

    public boolean isLaidOutInScreen() {
        return ((android.widget.PopupWindow) real).isLaidOutInScreen();
    }

    public boolean isOutsideTouchable() {
        return ((android.widget.PopupWindow) real).isOutsideTouchable();
    }

    public boolean isShowing() {
        return ((android.widget.PopupWindow) real).isShowing();
    }

    public boolean isSplitTouchEnabled() {
        return ((android.widget.PopupWindow) real).isSplitTouchEnabled();
    }

    public boolean isTouchModal() {
        return ((android.widget.PopupWindow) real).isTouchModal();
    }

    public boolean isTouchable() {
        return ((android.widget.PopupWindow) real).isTouchable();
    }

    public void setAnimationStyle(int arg0) {
        ((android.widget.PopupWindow) real).setAnimationStyle(arg0);
    }

    public void setAttachedInDecor(boolean arg0) {
        ((android.widget.PopupWindow) real).setAttachedInDecor(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.PopupWindow) real).setBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setClippingEnabled(boolean arg0) {
        ((android.widget.PopupWindow) real).setClippingEnabled(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.PopupWindow) real).setContentView(arg0 == null ? null : arg0.getReal());
    }

    public void setElevation(float arg0) {
        ((android.widget.PopupWindow) real).setElevation(arg0);
    }

    public void setEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.widget.PopupWindow) real).setEnterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setEpicenterBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.widget.PopupWindow) real).setEpicenterBounds(arg0 == null ? null : arg0.getReal());
    }

    public void setExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.widget.PopupWindow) real).setExitTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setFocusable(boolean arg0) {
        ((android.widget.PopupWindow) real).setFocusable(arg0);
    }

    public void setHeight(int arg0) {
        ((android.widget.PopupWindow) real).setHeight(arg0);
    }

    public void setIgnoreCheekPress() {
        ((android.widget.PopupWindow) real).setIgnoreCheekPress();
    }

    public void setInputMethodMode(int arg0) {
        ((android.widget.PopupWindow) real).setInputMethodMode(arg0);
    }

    public void setIsClippedToScreen(boolean arg0) {
        ((android.widget.PopupWindow) real).setIsClippedToScreen(arg0);
    }

    public void setIsLaidOutInScreen(boolean arg0) {
        ((android.widget.PopupWindow) real).setIsLaidOutInScreen(arg0);
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener arg0) {
        ((android.widget.PopupWindow) real).setOnDismissListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOutsideTouchable(boolean arg0) {
        ((android.widget.PopupWindow) real).setOutsideTouchable(arg0);
    }

    public void setOverlapAnchor(boolean arg0) {
        ((android.widget.PopupWindow) real).setOverlapAnchor(arg0);
    }

    public void setSoftInputMode(int arg0) {
        ((android.widget.PopupWindow) real).setSoftInputMode(arg0);
    }

    public void setSplitTouchEnabled(boolean arg0) {
        ((android.widget.PopupWindow) real).setSplitTouchEnabled(arg0);
    }

    public void setTouchInterceptor(com.micklab.dcg.wrapper.android.view.View.OnTouchListener arg0) {
        ((android.widget.PopupWindow) real).setTouchInterceptor(arg0 == null ? null : arg0.getReal());
    }

    public void setTouchModal(boolean arg0) {
        ((android.widget.PopupWindow) real).setTouchModal(arg0);
    }

    public void setTouchable(boolean arg0) {
        ((android.widget.PopupWindow) real).setTouchable(arg0);
    }

    public void setWidth(int arg0) {
        ((android.widget.PopupWindow) real).setWidth(arg0);
    }

    public void setWindowLayoutMode(int arg0, int arg1) {
        ((android.widget.PopupWindow) real).setWindowLayoutMode(arg0, arg1);
    }

    public void setWindowLayoutType(int arg0) {
        ((android.widget.PopupWindow) real).setWindowLayoutType(arg0);
    }

    public void showAsDropDown(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.PopupWindow) real).showAsDropDown(arg0 == null ? null : arg0.getReal());
    }

    public void showAsDropDown(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        ((android.widget.PopupWindow) real).showAsDropDown(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void showAsDropDown(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3) {
        ((android.widget.PopupWindow) real).showAsDropDown(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void showAtLocation(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3) {
        ((android.widget.PopupWindow) real).showAtLocation(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void update() {
        ((android.widget.PopupWindow) real).update();
    }

    public void update(int arg0, int arg1) {
        ((android.widget.PopupWindow) real).update(arg0, arg1);
    }

    public void update(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        ((android.widget.PopupWindow) real).update(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void update(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.PopupWindow) real).update(arg0, arg1, arg2, arg3);
    }

    public void update(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.PopupWindow) real).update(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void update(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ((android.widget.PopupWindow) real).update(arg0, arg1, arg2, arg3, arg4);
    }

    public static final int INPUT_METHOD_FROM_FOCUSABLE = android.widget.PopupWindow.INPUT_METHOD_FROM_FOCUSABLE;
    public static final int INPUT_METHOD_NEEDED = android.widget.PopupWindow.INPUT_METHOD_NEEDED;
    public static final int INPUT_METHOD_NOT_NEEDED = android.widget.PopupWindow.INPUT_METHOD_NOT_NEEDED;

    public static final class OnDismissListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDismissListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener wrap(android.widget.PopupWindow.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.PopupWindow.OnDismissListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.PopupWindow.OnDismissListener getReal() {
            return (android.widget.PopupWindow.OnDismissListener) real;
        }

        public android.widget.PopupWindow.OnDismissListener unwrap() {
            return getReal();
        }

        public void onDismiss() {
            ((android.widget.PopupWindow.OnDismissListener) real).onDismiss();
        }

    }
}
