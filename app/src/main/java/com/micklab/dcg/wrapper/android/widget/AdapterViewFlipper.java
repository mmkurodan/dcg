// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AdapterViewFlipper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdapterViewFlipper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AdapterViewFlipper wrap(android.widget.AdapterViewFlipper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterViewFlipper(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AdapterViewFlipper getReal() {
        return (android.widget.AdapterViewFlipper) real;
    }

    public android.widget.AdapterViewFlipper unwrap() {
        return getReal();
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void fyiWillBeAdvancedByHostKThx() {
        ((android.widget.AdapterViewFlipper) real).fyiWillBeAdvancedByHostKThx();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.AdapterViewFlipper) real).getAccessibilityClassName();
    }

    public int getFlipInterval() {
        return ((android.widget.AdapterViewFlipper) real).getFlipInterval();
    }

    public boolean isAutoStart() {
        return ((android.widget.AdapterViewFlipper) real).isAutoStart();
    }

    public boolean isFlipping() {
        return ((android.widget.AdapterViewFlipper) real).isFlipping();
    }

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.Adapter arg0) {
        ((android.widget.AdapterViewFlipper) real).setAdapter(arg0 == null ? null : arg0.getReal());
    }

    public void setAutoStart(boolean arg0) {
        ((android.widget.AdapterViewFlipper) real).setAutoStart(arg0);
    }

    public void setFlipInterval(int arg0) {
        ((android.widget.AdapterViewFlipper) real).setFlipInterval(arg0);
    }

    public void showNext() {
        ((android.widget.AdapterViewFlipper) real).showNext();
    }

    public void showPrevious() {
        ((android.widget.AdapterViewFlipper) real).showPrevious();
    }

    public void startFlipping() {
        ((android.widget.AdapterViewFlipper) real).startFlipping();
    }

    public void stopFlipping() {
        ((android.widget.AdapterViewFlipper) real).stopFlipping();
    }

}
