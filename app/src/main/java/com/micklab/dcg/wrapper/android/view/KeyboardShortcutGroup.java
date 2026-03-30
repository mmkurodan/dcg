// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class KeyboardShortcutGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyboardShortcutGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.KeyboardShortcutGroup wrap(android.view.KeyboardShortcutGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyboardShortcutGroup(real, (__DcgwBridgeToken) null);
    }

    public android.view.KeyboardShortcutGroup getReal() {
        return (android.view.KeyboardShortcutGroup) real;
    }

    public android.view.KeyboardShortcutGroup unwrap() {
        return getReal();
    }

    public KeyboardShortcutGroup(java.lang.CharSequence arg0) {
        this(new android.view.KeyboardShortcutGroup(arg0), (__DcgwBridgeToken) null);
    }

    public KeyboardShortcutGroup(java.lang.CharSequence arg0, java.util.List arg1) {
        this(new android.view.KeyboardShortcutGroup(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public void addItem(com.micklab.dcg.wrapper.android.view.KeyboardShortcutInfo arg0) {
        ((android.view.KeyboardShortcutGroup) real).addItem(arg0 == null ? null : arg0.getReal());
    }

    public int describeContents() {
        return ((android.view.KeyboardShortcutGroup) real).describeContents();
    }

    public java.lang.CharSequence getLabel() {
        return ((android.view.KeyboardShortcutGroup) real).getLabel();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.KeyboardShortcutGroup) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
