// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SearchEvent {
    private final android.view.SearchEvent real;

    public SearchEvent(android.view.SearchEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SearchEvent wrap(android.view.SearchEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SearchEvent(real);
    }

    public android.view.SearchEvent unwrap() {
        return real;
    }

    public SearchEvent(com.micklab.dcg.wrapper.android.view.InputDevice arg0) {
        this(new android.view.SearchEvent(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice getInputDevice() {
        return com.micklab.dcg.wrapper.android.view.InputDevice.wrap(real.getInputDevice());
    }

}
