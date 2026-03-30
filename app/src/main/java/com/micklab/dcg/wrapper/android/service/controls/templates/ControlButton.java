// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.templates;

public final class ControlButton {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ControlButton(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton wrap(android.service.controls.templates.ControlButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.templates.ControlButton(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.templates.ControlButton getReal() {
        return (android.service.controls.templates.ControlButton) real;
    }

    public android.service.controls.templates.ControlButton unwrap() {
        return getReal();
    }

    public ControlButton(boolean arg0, java.lang.CharSequence arg1) {
        this(new android.service.controls.templates.ControlButton(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.controls.templates.ControlButton) real).describeContents();
    }

    public java.lang.CharSequence getActionDescription() {
        return ((android.service.controls.templates.ControlButton) real).getActionDescription();
    }

    public boolean isChecked() {
        return ((android.service.controls.templates.ControlButton) real).isChecked();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.controls.templates.ControlButton) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
