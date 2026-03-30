// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.gsm;

public final class SmsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SmsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsManager wrap(android.telephony.gsm.SmsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.gsm.SmsManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.gsm.SmsManager getReal() {
        return (android.telephony.gsm.SmsManager) real;
    }

    public android.telephony.gsm.SmsManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsManager getDefault() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsManager#getDefault()");
    }

    public void sendDataMessage(java.lang.String arg0, java.lang.String arg1, short arg2, byte[] arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4, com.micklab.dcg.wrapper.android.app.PendingIntent arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsManager#sendDataMessage(java.lang.String,java.lang.String,short,[B,android.app.PendingIntent,android.app.PendingIntent)");
    }

    public void sendTextMessage(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsManager#sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)");
    }


}
