// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class InputEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.InputEvent wrap(android.view.InputEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.InputEvent getReal() {
        return (android.view.InputEvent) real;
    }

    public android.view.InputEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.InputEvent) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice getDevice() {
        return com.micklab.dcg.wrapper.android.view.InputDevice.wrap(((android.view.InputEvent) real).getDevice());
    }

    public int getDeviceId() {
        return ((android.view.InputEvent) real).getDeviceId();
    }

    public long getEventTime() {
        return ((android.view.InputEvent) real).getEventTime();
    }

    public int getSource() {
        return ((android.view.InputEvent) real).getSource();
    }

    public boolean isFromSource(int arg0) {
        return ((android.view.InputEvent) real).isFromSource(arg0);
    }


}
