// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class KeyboardShortcutInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyboardShortcutInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.KeyboardShortcutInfo wrap(android.view.KeyboardShortcutInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyboardShortcutInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.KeyboardShortcutInfo getReal() {
        return (android.view.KeyboardShortcutInfo) real;
    }

    public android.view.KeyboardShortcutInfo unwrap() {
        return getReal();
    }

    public KeyboardShortcutInfo(java.lang.CharSequence arg0, int arg1, int arg2) {
        this(new android.view.KeyboardShortcutInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public KeyboardShortcutInfo(java.lang.CharSequence arg0, char arg1, int arg2) {
        this(new android.view.KeyboardShortcutInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.KeyboardShortcutInfo) real).describeContents();
    }

    public char getBaseCharacter() {
        return ((android.view.KeyboardShortcutInfo) real).getBaseCharacter();
    }

    public int getKeycode() {
        return ((android.view.KeyboardShortcutInfo) real).getKeycode();
    }

    public java.lang.CharSequence getLabel() {
        return ((android.view.KeyboardShortcutInfo) real).getLabel();
    }

    public int getModifiers() {
        return ((android.view.KeyboardShortcutInfo) real).getModifiers();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.KeyboardShortcutInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
