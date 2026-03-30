// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class RcsUceAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RcsUceAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.RcsUceAdapter wrap(android.telephony.ims.RcsUceAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.RcsUceAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.ims.RcsUceAdapter getReal() {
        return (android.telephony.ims.RcsUceAdapter) real;
    }

    public android.telephony.ims.RcsUceAdapter unwrap() {
        return getReal();
    }

    public boolean isUceSettingEnabled() throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RcsUceAdapter#isUceSettingEnabled()");
    }

}
