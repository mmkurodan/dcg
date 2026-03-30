// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class OnNmeaMessageListener {
    private final android.location.OnNmeaMessageListener real;

    public OnNmeaMessageListener(android.location.OnNmeaMessageListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener wrap(android.location.OnNmeaMessageListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.OnNmeaMessageListener(real);
    }

    public android.location.OnNmeaMessageListener unwrap() {
        return real;
    }

    public void onNmeaMessage(java.lang.String arg0, long arg1) {
        real.onNmeaMessage(arg0, arg1);
    }

}
