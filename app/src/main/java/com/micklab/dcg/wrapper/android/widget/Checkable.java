// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Checkable {
    private final android.widget.Checkable real;

    public Checkable(android.widget.Checkable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Checkable wrap(android.widget.Checkable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Checkable(real);
    }

    public android.widget.Checkable unwrap() {
        return real;
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void toggle() {
        real.toggle();
    }

}
