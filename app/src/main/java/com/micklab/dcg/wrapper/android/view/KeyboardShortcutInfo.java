// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class KeyboardShortcutInfo {
    private final android.view.KeyboardShortcutInfo real;

    public KeyboardShortcutInfo(android.view.KeyboardShortcutInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.KeyboardShortcutInfo wrap(android.view.KeyboardShortcutInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyboardShortcutInfo(real);
    }

    public android.view.KeyboardShortcutInfo unwrap() {
        return real;
    }

    public KeyboardShortcutInfo(java.lang.CharSequence arg0, int arg1, int arg2) {
        this(new android.view.KeyboardShortcutInfo(arg0, arg1, arg2));
    }

    public KeyboardShortcutInfo(java.lang.CharSequence arg0, char arg1, int arg2) {
        this(new android.view.KeyboardShortcutInfo(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public char getBaseCharacter() {
        return real.getBaseCharacter();
    }

    public int getKeycode() {
        return real.getKeycode();
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public int getModifiers() {
        return real.getModifiers();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
