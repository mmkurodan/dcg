// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AdapterViewFlipper {
    private final android.widget.AdapterViewFlipper real;

    public AdapterViewFlipper(android.widget.AdapterViewFlipper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AdapterViewFlipper wrap(android.widget.AdapterViewFlipper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AdapterViewFlipper(real);
    }

    public android.widget.AdapterViewFlipper unwrap() {
        return real;
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.unwrap()));
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public AdapterViewFlipper(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AdapterViewFlipper(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void fyiWillBeAdvancedByHostKThx() {
        real.fyiWillBeAdvancedByHostKThx();
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

    public void setAdapter(com.micklab.dcg.wrapper.android.widget.Adapter arg0) {
        real.setAdapter(arg0 == null ? null : arg0.unwrap());
    }

    public void setAutoStart(boolean arg0) {
        real.setAutoStart(arg0);
    }

    public void setFlipInterval(int arg0) {
        real.setFlipInterval(arg0);
    }

    public void showNext() {
        real.showNext();
    }

    public void showPrevious() {
        real.showPrevious();
    }

    public void startFlipping() {
        real.startFlipping();
    }

    public void stopFlipping() {
        real.stopFlipping();
    }

}
