// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ViewFlipper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewFlipper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ViewFlipper wrap(android.widget.ViewFlipper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewFlipper(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ViewFlipper getReal() {
        return (android.widget.ViewFlipper) real;
    }

    public android.widget.ViewFlipper unwrap() {
        return getReal();
    }

    public ViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ViewFlipper(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ViewFlipper(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ViewFlipper) real).getAccessibilityClassName();
    }

    public int getFlipInterval() {
        return ((android.widget.ViewFlipper) real).getFlipInterval();
    }

    public boolean isAutoStart() {
        return ((android.widget.ViewFlipper) real).isAutoStart();
    }

    public boolean isFlipping() {
        return ((android.widget.ViewFlipper) real).isFlipping();
    }

    public void setAutoStart(boolean arg0) {
        ((android.widget.ViewFlipper) real).setAutoStart(arg0);
    }

    public void setFlipInterval(int arg0) {
        ((android.widget.ViewFlipper) real).setFlipInterval(arg0);
    }

    public void startFlipping() {
        ((android.widget.ViewFlipper) real).startFlipping();
    }

    public void stopFlipping() {
        ((android.widget.ViewFlipper) real).stopFlipping();
    }

}
