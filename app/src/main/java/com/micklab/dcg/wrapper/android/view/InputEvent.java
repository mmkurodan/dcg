// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class InputEvent {
    private final android.view.InputEvent real;

    public InputEvent(android.view.InputEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.InputEvent wrap(android.view.InputEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputEvent(real);
    }

    public android.view.InputEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice getDevice() {
        return com.micklab.dcg.wrapper.android.view.InputDevice.wrap(real.getDevice());
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public long getEventTime() {
        return real.getEventTime();
    }

    public int getSource() {
        return real.getSource();
    }

    public boolean isFromSource(int arg0) {
        return real.isFromSource(arg0);
    }


}
