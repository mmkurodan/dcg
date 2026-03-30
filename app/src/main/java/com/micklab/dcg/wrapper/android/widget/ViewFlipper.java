// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ViewFlipper {
    private final android.widget.ViewFlipper real;

    public ViewFlipper(android.widget.ViewFlipper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ViewFlipper wrap(android.widget.ViewFlipper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewFlipper(real);
    }

    public android.widget.ViewFlipper unwrap() {
        return real;
    }

    public ViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ViewFlipper(arg0 == null ? null : arg0.unwrap()));
    }

    public ViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ViewFlipper(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getFlipInterval() {
        return real.getFlipInterval();
    }

    public boolean isAutoStart() {
        return real.isAutoStart();
    }

    public boolean isFlipping() {
        return real.isFlipping();
    }

    public void setAutoStart(boolean arg0) {
        real.setAutoStart(arg0);
    }

    public void setFlipInterval(int arg0) {
        real.setFlipInterval(arg0);
    }

    public void startFlipping() {
        real.startFlipping();
    }

    public void stopFlipping() {
        real.stopFlipping();
    }

}
