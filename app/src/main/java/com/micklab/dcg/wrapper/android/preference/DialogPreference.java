// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class DialogPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DialogPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.DialogPreference wrap(android.preference.DialogPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.DialogPreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.DialogPreference getReal() {
        return (android.preference.DialogPreference) real;
    }

    public android.preference.DialogPreference unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getDialog() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(((android.preference.DialogPreference) real).getDialog());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDialogIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.preference.DialogPreference) real).getDialogIcon());
    }

    public int getDialogLayoutResource() {
        return ((android.preference.DialogPreference) real).getDialogLayoutResource();
    }

    public java.lang.CharSequence getDialogMessage() {
        return ((android.preference.DialogPreference) real).getDialogMessage();
    }

    public java.lang.CharSequence getDialogTitle() {
        return ((android.preference.DialogPreference) real).getDialogTitle();
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return ((android.preference.DialogPreference) real).getNegativeButtonText();
    }

    public java.lang.CharSequence getPositiveButtonText() {
        return ((android.preference.DialogPreference) real).getPositiveButtonText();
    }

    public void onActivityDestroy() {
        ((android.preference.DialogPreference) real).onActivityDestroy();
    }

    public void onClick(com.micklab.dcg.wrapper.android.content.DialogInterface arg0, int arg1) {
        ((android.preference.DialogPreference) real).onClick(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        ((android.preference.DialogPreference) real).onDismiss(arg0 == null ? null : arg0.getReal());
    }

    public void setDialogIcon(int arg0) {
        ((android.preference.DialogPreference) real).setDialogIcon(arg0);
    }

    public void setDialogIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.preference.DialogPreference) real).setDialogIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setDialogLayoutResource(int arg0) {
        ((android.preference.DialogPreference) real).setDialogLayoutResource(arg0);
    }

    public void setDialogMessage(int arg0) {
        ((android.preference.DialogPreference) real).setDialogMessage(arg0);
    }

    public void setDialogMessage(java.lang.CharSequence arg0) {
        ((android.preference.DialogPreference) real).setDialogMessage(arg0);
    }

    public void setDialogTitle(java.lang.CharSequence arg0) {
        ((android.preference.DialogPreference) real).setDialogTitle(arg0);
    }

    public void setDialogTitle(int arg0) {
        ((android.preference.DialogPreference) real).setDialogTitle(arg0);
    }

    public void setNegativeButtonText(java.lang.CharSequence arg0) {
        ((android.preference.DialogPreference) real).setNegativeButtonText(arg0);
    }

    public void setNegativeButtonText(int arg0) {
        ((android.preference.DialogPreference) real).setNegativeButtonText(arg0);
    }

    public void setPositiveButtonText(java.lang.CharSequence arg0) {
        ((android.preference.DialogPreference) real).setPositiveButtonText(arg0);
    }

    public void setPositiveButtonText(int arg0) {
        ((android.preference.DialogPreference) real).setPositiveButtonText(arg0);
    }

}
