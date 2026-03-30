// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ImageSwitcher {
    private final android.widget.ImageSwitcher real;

    public ImageSwitcher(android.widget.ImageSwitcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ImageSwitcher wrap(android.widget.ImageSwitcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ImageSwitcher(real);
    }

    public android.widget.ImageSwitcher unwrap() {
        return real;
    }

    public ImageSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ImageSwitcher(arg0 == null ? null : arg0.unwrap()));
    }

    public ImageSwitcher(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ImageSwitcher(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public void setImageDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setImageDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setImageResource(int arg0) {
        real.setImageResource(arg0);
    }

    public void setImageURI(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.setImageURI(arg0 == null ? null : arg0.unwrap());
    }

}
