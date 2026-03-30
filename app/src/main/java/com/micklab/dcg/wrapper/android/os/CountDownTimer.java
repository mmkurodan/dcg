// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CountDownTimer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CountDownTimer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CountDownTimer wrap(android.os.CountDownTimer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CountDownTimer(real, (__DcgwBridgeToken) null);
    }

    public android.os.CountDownTimer getReal() {
        return (android.os.CountDownTimer) real;
    }

    public android.os.CountDownTimer unwrap() {
        return getReal();
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
