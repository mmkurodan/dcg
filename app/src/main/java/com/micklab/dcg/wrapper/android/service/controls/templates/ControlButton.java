// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ControlButton {
    private final android.service.controls.templates.ControlButton real;

    public ControlButton(android.service.controls.templates.ControlButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton wrap(android.service.controls.templates.ControlButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton(real);
    }

    public android.service.controls.templates.ControlButton unwrap() {
        return real;
    }

    public ControlButton(boolean arg0, java.lang.CharSequence arg1) {
        this(new android.service.controls.templates.ControlButton(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.CharSequence getActionDescription() {
        return real.getActionDescription();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
