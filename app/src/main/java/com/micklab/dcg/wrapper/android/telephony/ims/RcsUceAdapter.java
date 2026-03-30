// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.ims;

public final class RcsUceAdapter {
    private final android.telephony.ims.RcsUceAdapter real;

    public RcsUceAdapter(android.telephony.ims.RcsUceAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.ims.RcsUceAdapter wrap(android.telephony.ims.RcsUceAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.ims.RcsUceAdapter(real);
    }

    public android.telephony.ims.RcsUceAdapter unwrap() {
        return real;
    }

    public boolean isUceSettingEnabled() throws android.telephony.ims.ImsException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.ims.RcsUceAdapter#isUceSettingEnabled()");
    }

}
