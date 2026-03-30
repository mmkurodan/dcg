// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Checkable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Checkable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Checkable wrap(android.widget.Checkable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Checkable(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Checkable getReal() {
        return (android.widget.Checkable) real;
    }

    public android.widget.Checkable unwrap() {
        return getReal();
    }

    public boolean isChecked() {
        return ((android.widget.Checkable) real).isChecked();
    }

    public void setChecked(boolean arg0) {
        ((android.widget.Checkable) real).setChecked(arg0);
    }

    public void toggle() {
        ((android.widget.Checkable) real).toggle();
    }

}
