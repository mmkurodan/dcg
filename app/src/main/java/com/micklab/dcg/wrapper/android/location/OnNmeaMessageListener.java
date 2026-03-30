// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class OnNmeaMessageListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnNmeaMessageListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener wrap(android.location.OnNmeaMessageListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener(real, (__DcgwBridgeToken) null);
    }

    public android.location.OnNmeaMessageListener getReal() {
        return (android.location.OnNmeaMessageListener) real;
    }

    public android.location.OnNmeaMessageListener unwrap() {
        return getReal();
    }

    public void onNmeaMessage(java.lang.String arg0, long arg1) {
        ((android.location.OnNmeaMessageListener) real).onNmeaMessage(arg0, arg1);
    }

}
