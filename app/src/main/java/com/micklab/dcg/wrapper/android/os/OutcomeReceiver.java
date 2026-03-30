// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class OutcomeReceiver {
    private final android.os.OutcomeReceiver real;

    public OutcomeReceiver(android.os.OutcomeReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.OutcomeReceiver wrap(android.os.OutcomeReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.OutcomeReceiver(real);
    }

    public android.os.OutcomeReceiver unwrap() {
        return real;
    }

    public void onError(java.lang.Throwable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OutcomeReceiver#onError(java.lang.Throwable)");
    }

    public void onResult(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OutcomeReceiver#onResult(java.lang.Object)");
    }

}
