// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ServiceConnection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceConnection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ServiceConnection wrap(android.content.ServiceConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ServiceConnection(real, (__DcgwBridgeToken) null);
    }

    public android.content.ServiceConnection getReal() {
        return (android.content.ServiceConnection) real;
    }

    public android.content.ServiceConnection unwrap() {
        return getReal();
    }

    public void onBindingDied(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.content.ServiceConnection) real).onBindingDied(arg0 == null ? null : arg0.getReal());
    }

    public void onNullBinding(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.content.ServiceConnection) real).onNullBinding(arg0 == null ? null : arg0.getReal());
    }

    public void onServiceConnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1) {
        ((android.content.ServiceConnection) real).onServiceConnected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onServiceDisconnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.content.ServiceConnection) real).onServiceDisconnected(arg0 == null ? null : arg0.getReal());
    }

}
