// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CompoundButton {
    private final android.widget.CompoundButton real;

    public CompoundButton(android.widget.CompoundButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CompoundButton wrap(android.widget.CompoundButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CompoundButton(real);
    }

    public android.widget.CompoundButton unwrap() {
        return real;
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        real.autofill(arg0 == null ? null : arg0.unwrap());
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getAutofillType() {
        return real.getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getAutofillValue());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getButtonDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getButtonDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getButtonTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getButtonTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getButtonTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getButtonTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getButtonTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getButtonTintMode());
    }

    public int getCompoundPaddingLeft() {
        return real.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        return real.getCompoundPaddingRight();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public boolean performClick() {
        return real.performClick();
    }

    public void setButtonDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setButtonDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setButtonDrawable(int arg0) {
        real.setButtonDrawable(arg0);
    }

    public void setButtonIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setButtonIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setButtonTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setButtonTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setButtonTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setButtonTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setButtonTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setButtonTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setOnCheckedChangeListener(com.micklab.dcg.wrapper.android.widget.CompoundButton.OnCheckedChangeListener arg0) {
        real.setOnCheckedChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        real.setStateDescription(arg0);
    }

    public void toggle() {
        real.toggle();
    }

    public static final class OnCheckedChangeListener {
        private final android.widget.CompoundButton.OnCheckedChangeListener real;

        public OnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.CompoundButton.OnCheckedChangeListener wrap(android.widget.CompoundButton.OnCheckedChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CompoundButton.OnCheckedChangeListener(real);
        }

        public android.widget.CompoundButton.OnCheckedChangeListener unwrap() {
            return real;
        }

        public void onCheckedChanged(com.micklab.dcg.wrapper.android.widget.CompoundButton arg0, boolean arg1) {
            real.onCheckedChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
