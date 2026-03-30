// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.restrictions;

public final class RestrictionsReceiver {
    private final android.service.restrictions.RestrictionsReceiver real;

    public RestrictionsReceiver(android.service.restrictions.RestrictionsReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.restrictions.RestrictionsReceiver wrap(android.service.restrictions.RestrictionsReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.restrictions.RestrictionsReceiver(real);
    }

    public android.service.restrictions.RestrictionsReceiver unwrap() {
        return real;
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onReceive(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onRequestPermission(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.os.PersistableBundle arg4) {
        real.onRequestPermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

}
