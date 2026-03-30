// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class KeyboardShortcutGroup {
    private final android.view.KeyboardShortcutGroup real;

    public KeyboardShortcutGroup(android.view.KeyboardShortcutGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.KeyboardShortcutGroup wrap(android.view.KeyboardShortcutGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyboardShortcutGroup(real);
    }

    public android.view.KeyboardShortcutGroup unwrap() {
        return real;
    }

    public KeyboardShortcutGroup(java.lang.CharSequence arg0) {
        this(new android.view.KeyboardShortcutGroup(arg0));
    }

    public KeyboardShortcutGroup(java.lang.CharSequence arg0, java.util.List arg1) {
        this(new android.view.KeyboardShortcutGroup(arg0, arg1));
    }

    public void addItem(com.micklab.dcg.wrapper.android.view.KeyboardShortcutInfo arg0) {
        real.addItem(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
