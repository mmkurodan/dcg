// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ServiceConnection {
    private final android.content.ServiceConnection real;

    public ServiceConnection(android.content.ServiceConnection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ServiceConnection wrap(android.content.ServiceConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ServiceConnection(real);
    }

    public android.content.ServiceConnection unwrap() {
        return real;
    }

    public void onBindingDied(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.onBindingDied(arg0 == null ? null : arg0.unwrap());
    }

    public void onNullBinding(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.onNullBinding(arg0 == null ? null : arg0.unwrap());
    }

    public void onServiceConnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1) {
        real.onServiceConnected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onServiceDisconnected(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.onServiceDisconnected(arg0 == null ? null : arg0.unwrap());
    }

}
