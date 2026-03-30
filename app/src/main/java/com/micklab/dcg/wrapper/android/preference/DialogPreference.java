// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class DialogPreference {
    private final android.preference.DialogPreference real;

    public DialogPreference(android.preference.DialogPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.DialogPreference wrap(android.preference.DialogPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.DialogPreference(real);
    }

    public android.preference.DialogPreference unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getDialog() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(real.getDialog());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDialogIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDialogIcon());
    }

    public int getDialogLayoutResource() {
        return real.getDialogLayoutResource();
    }

    public java.lang.CharSequence getDialogMessage() {
        return real.getDialogMessage();
    }

    public java.lang.CharSequence getDialogTitle() {
        return real.getDialogTitle();
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return real.getNegativeButtonText();
    }

    public java.lang.CharSequence getPositiveButtonText() {
        return real.getPositiveButtonText();
    }

    public void onActivityDestroy() {
        real.onActivityDestroy();
    }

    public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
        real.onClick(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        real.onDismiss(arg0 == null ? null : arg0.unwrap());
    }

    public void setDialogIcon(int arg0) {
        real.setDialogIcon(arg0);
    }

    public void setDialogIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setDialogIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setDialogLayoutResource(int arg0) {
        real.setDialogLayoutResource(arg0);
    }

    public void setDialogMessage(int arg0) {
        real.setDialogMessage(arg0);
    }

    public void setDialogMessage(java.lang.CharSequence arg0) {
        real.setDialogMessage(arg0);
    }

    public void setDialogTitle(java.lang.CharSequence arg0) {
        real.setDialogTitle(arg0);
    }

    public void setDialogTitle(int arg0) {
        real.setDialogTitle(arg0);
    }

    public void setNegativeButtonText(java.lang.CharSequence arg0) {
        real.setNegativeButtonText(arg0);
    }

    public void setNegativeButtonText(int arg0) {
        real.setNegativeButtonText(arg0);
    }

    public void setPositiveButtonText(java.lang.CharSequence arg0) {
        real.setPositiveButtonText(arg0);
    }

    public void setPositiveButtonText(int arg0) {
        real.setPositiveButtonText(arg0);
    }

}
