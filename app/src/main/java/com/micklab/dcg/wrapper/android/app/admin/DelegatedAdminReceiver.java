// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DelegatedAdminReceiver {
    private final android.app.admin.DelegatedAdminReceiver real;

    public DelegatedAdminReceiver(android.app.admin.DelegatedAdminReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DelegatedAdminReceiver wrap(android.app.admin.DelegatedAdminReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DelegatedAdminReceiver(real);
    }

    public android.app.admin.DelegatedAdminReceiver unwrap() {
        return real;
    }

    public DelegatedAdminReceiver() {
        this(new android.app.admin.DelegatedAdminReceiver());
    }

    public java.lang.String onChoosePrivateKeyAlias(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, java.lang.String arg4) {
        return real.onChoosePrivateKeyAlias(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4);
    }

    public void onNetworkLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, long arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DelegatedAdminReceiver#onNetworkLogsAvailable(android.content.Context,android.content.Intent,long,int)");
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onReceive(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onSecurityLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onSecurityLogsAvailable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

}
