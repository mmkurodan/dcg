// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ImageSwitcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImageSwitcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ImageSwitcher wrap(android.widget.ImageSwitcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ImageSwitcher(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ImageSwitcher getReal() {
        return (android.widget.ImageSwitcher) real;
    }

    public android.widget.ImageSwitcher unwrap() {
        return getReal();
    }

    public ImageSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ImageSwitcher(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ImageSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ImageSwitcher(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ImageSwitcher) real).getAccessibilityClassName();
    }

    public void setImageDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ImageSwitcher) real).setImageDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setImageResource(int arg0) {
        ((android.widget.ImageSwitcher) real).setImageResource(arg0);
    }

    public void setImageURI(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.widget.ImageSwitcher) real).setImageURI(arg0 == null ? null : arg0.getReal());
    }

}
