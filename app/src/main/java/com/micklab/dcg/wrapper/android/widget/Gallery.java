// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Gallery {
    private final android.widget.Gallery real;

    public Gallery(android.widget.Gallery real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Gallery wrap(android.widget.Gallery real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Gallery(real);
    }

    public android.widget.Gallery unwrap() {
        return real;
    }

    public Gallery(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Gallery(arg0 == null ? null : arg0.unwrap()));
    }

    public Gallery(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Gallery(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Gallery(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Gallery(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public Gallery(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Gallery(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchSetSelected(boolean arg0) {
        real.dispatchSetSelected(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean onDown(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onDown(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onFling(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
        return real.onFling(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onLongPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.onLongPress(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onScroll(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
        return real.onScroll(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void onShowPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.onShowPress(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onSingleTapUp(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onSingleTapUp(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnimationDuration(int arg0) {
        real.setAnimationDuration(arg0);
    }

    public void setCallbackDuringFling(boolean arg0) {
        real.setCallbackDuringFling(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setSpacing(int arg0) {
        real.setSpacing(arg0);
    }

    public void setUnselectedAlpha(float arg0) {
        real.setUnselectedAlpha(arg0);
    }

    public boolean showContextMenu() {
        return real.showContextMenu();
    }

    public boolean showContextMenu(float arg0, float arg1) {
        return real.showContextMenu(arg0, arg1);
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.showContextMenuForChild(arg0 == null ? null : arg0.unwrap());
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return real.showContextMenuForChild(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static final class LayoutParams {
        private final android.widget.Gallery.LayoutParams real;

        public LayoutParams(android.widget.Gallery.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.Gallery.LayoutParams wrap(android.widget.Gallery.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Gallery.LayoutParams(real);
        }

        public android.widget.Gallery.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.Gallery.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.Gallery.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.Gallery.LayoutParams(arg0, arg1));
        }

    }
}
