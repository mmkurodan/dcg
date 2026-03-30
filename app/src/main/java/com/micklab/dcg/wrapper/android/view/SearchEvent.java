// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SearchEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SearchEvent wrap(android.view.SearchEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SearchEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.SearchEvent getReal() {
        return (android.view.SearchEvent) real;
    }

    public android.view.SearchEvent unwrap() {
        return getReal();
    }

    public SearchEvent(com.micklab.dcg.wrapper.android.view.InputDevice arg0) {
        this(new android.view.SearchEvent(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice getInputDevice() {
        return com.micklab.dcg.wrapper.android.view.InputDevice.wrap(((android.view.SearchEvent) real).getInputDevice());
    }

}
