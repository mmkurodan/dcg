// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CompoundButton {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CompoundButton(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CompoundButton wrap(android.widget.CompoundButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CompoundButton(real, (__DcgwBridgeToken) null);
    }

    public android.widget.CompoundButton getReal() {
        return (android.widget.CompoundButton) real;
    }

    public android.widget.CompoundButton unwrap() {
        return getReal();
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.widget.CompoundButton) real).autofill(arg0 == null ? null : arg0.getReal());
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        ((android.widget.CompoundButton) real).drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.CompoundButton) real).getAccessibilityClassName();
    }

    public int getAutofillType() {
        return ((android.widget.CompoundButton) real).getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.widget.CompoundButton) real).getAutofillValue());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getButtonDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.CompoundButton) real).getButtonDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getButtonTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.CompoundButton) real).getButtonTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getButtonTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.CompoundButton) real).getButtonTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getButtonTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(((android.widget.CompoundButton) real).getButtonTintMode());
    }

    public int getCompoundPaddingLeft() {
        return ((android.widget.CompoundButton) real).getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        return ((android.widget.CompoundButton) real).getCompoundPaddingRight();
    }

    public boolean isChecked() {
        return ((android.widget.CompoundButton) real).isChecked();
    }

    public void jumpDrawablesToCurrentState() {
        ((android.widget.CompoundButton) real).jumpDrawablesToCurrentState();
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        ((android.widget.CompoundButton) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.widget.CompoundButton) real).onSaveInstanceState());
    }

    public boolean performClick() {
        return ((android.widget.CompoundButton) real).performClick();
    }

    public void setButtonDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.CompoundButton) real).setButtonDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setButtonDrawable(int arg0) {
        ((android.widget.CompoundButton) real).setButtonDrawable(arg0);
    }

    public void setButtonIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        ((android.widget.CompoundButton) real).setButtonIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setButtonTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.CompoundButton) real).setButtonTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setButtonTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.CompoundButton) real).setButtonTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setButtonTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        ((android.widget.CompoundButton) real).setButtonTintMode(arg0 == null ? null : arg0.getReal());
    }

    public void setChecked(boolean arg0) {
        ((android.widget.CompoundButton) real).setChecked(arg0);
    }

    public void setOnCheckedChangeListener(com.micklab.dcg.wrapper.android.widget.CompoundButton.OnCheckedChangeListener arg0) {
        ((android.widget.CompoundButton) real).setOnCheckedChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        ((android.widget.CompoundButton) real).setStateDescription(arg0);
    }

    public void toggle() {
        ((android.widget.CompoundButton) real).toggle();
    }

    public static final class OnCheckedChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCheckedChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.CompoundButton.OnCheckedChangeListener wrap(android.widget.CompoundButton.OnCheckedChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CompoundButton.OnCheckedChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.CompoundButton.OnCheckedChangeListener getReal() {
            return (android.widget.CompoundButton.OnCheckedChangeListener) real;
        }

        public android.widget.CompoundButton.OnCheckedChangeListener unwrap() {
            return getReal();
        }

        public void onCheckedChanged(com.micklab.dcg.wrapper.android.widget.CompoundButton arg0, boolean arg1) {
            ((android.widget.CompoundButton.OnCheckedChangeListener) real).onCheckedChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
