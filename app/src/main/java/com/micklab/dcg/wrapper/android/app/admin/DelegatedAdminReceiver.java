// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DelegatedAdminReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DelegatedAdminReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DelegatedAdminReceiver wrap(android.app.admin.DelegatedAdminReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DelegatedAdminReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.DelegatedAdminReceiver getReal() {
        return (android.app.admin.DelegatedAdminReceiver) real;
    }

    public android.app.admin.DelegatedAdminReceiver unwrap() {
        return getReal();
    }

    public DelegatedAdminReceiver() {
        this(new android.app.admin.DelegatedAdminReceiver(), (__DcgwBridgeToken) null);
    }

    public java.lang.String onChoosePrivateKeyAlias(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, java.lang.String arg4) {
        return ((android.app.admin.DelegatedAdminReceiver) real).onChoosePrivateKeyAlias(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4);
    }

    public void onNetworkLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, long arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DelegatedAdminReceiver#onNetworkLogsAvailable(android.content.Context,android.content.Intent,long,int)");
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DelegatedAdminReceiver) real).onReceive(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onSecurityLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DelegatedAdminReceiver) real).onSecurityLogsAvailable(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

}
