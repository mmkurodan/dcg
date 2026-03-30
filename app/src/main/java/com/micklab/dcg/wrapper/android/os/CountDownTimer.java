// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CountDownTimer {
    private final android.os.CountDownTimer real;

    public CountDownTimer(android.os.CountDownTimer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CountDownTimer wrap(android.os.CountDownTimer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CountDownTimer(real);
    }

    public android.os.CountDownTimer unwrap() {
        return real;
    }

    public void cancel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CountDownTimer#cancel()");
    }

    public void onFinish() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CountDownTimer#onFinish()");
    }

    public void onTick(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CountDownTimer#onTick(long)");
    }

    public com.micklab.dcg.wrapper.android.os.CountDownTimer start() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CountDownTimer#start()");
    }

}
