// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class SmsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SmsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsManager wrap(android.telephony.SmsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SmsManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.SmsManager getReal() {
        return (android.telephony.SmsManager) real;
    }

    public android.telephony.SmsManager unwrap() {
        return getReal();
    }

    public java.lang.String createAppSpecificSmsToken(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#createAppSpecificSmsToken(android.app.PendingIntent)");
    }

    public java.lang.String createAppSpecificSmsTokenWithPackageInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#createAppSpecificSmsTokenWithPackageInfo(java.lang.String,android.app.PendingIntent)");
    }

    public com.micklab.dcg.wrapper.android.telephony.SmsManager createForSubscriptionId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#createForSubscriptionId(int)");
    }

    public void downloadMultimediaMessage(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#downloadMultimediaMessage(android.content.Context,java.lang.String,android.net.Uri,android.os.Bundle,android.app.PendingIntent)");
    }

    public void downloadMultimediaMessage(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4, long arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#downloadMultimediaMessage(android.content.Context,java.lang.String,android.net.Uri,android.os.Bundle,android.app.PendingIntent,long)");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCarrierConfigValues() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getCarrierConfigValues()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsManager getDefault() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getDefault()");
    }

    public static int getDefaultSmsSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getDefaultSmsSubscriptionId()");
    }

    public int getSmsCapacityOnIcc() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getSmsCapacityOnIcc()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsManager getSmsManagerForSubscriptionId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getSmsManagerForSubscriptionId(int)");
    }

    public void getSmsMessagesForFinancialApp(com.micklab.dcg.wrapper.android.os.Bundle arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.SmsManager.FinancialSmsCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getSmsMessagesForFinancialApp(android.os.Bundle,java.util.concurrent.Executor,android.telephony.SmsManager$FinancialSmsCallback)");
    }

    public java.lang.String getSmscAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getSmscAddress()");
    }

    public int getSubscriptionId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#getSubscriptionId()");
    }

    public void injectSmsPdu(byte[] arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#injectSmsPdu([B,java.lang.String,android.app.PendingIntent)");
    }

    public void sendDataMessage(java.lang.String arg0, java.lang.String arg1, short arg2, byte[] arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4, com.micklab.dcg.wrapper.android.app.PendingIntent arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#sendDataMessage(java.lang.String,java.lang.String,short,[B,android.app.PendingIntent,android.app.PendingIntent)");
    }

    public void sendMultimediaMessage(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#sendMultimediaMessage(android.content.Context,android.net.Uri,java.lang.String,android.os.Bundle,android.app.PendingIntent)");
    }

    public void sendMultimediaMessage(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4, long arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#sendMultimediaMessage(android.content.Context,android.net.Uri,java.lang.String,android.os.Bundle,android.app.PendingIntent,long)");
    }

    public void sendTextMessage(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)");
    }

    public void sendTextMessage(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4, long arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent,long)");
    }

    public void sendTextMessageWithoutPersisting(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3, com.micklab.dcg.wrapper.android.app.PendingIntent arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#sendTextMessageWithoutPersisting(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)");
    }

    public boolean setSmscAddress(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager#setSmscAddress(java.lang.String)");
    }


    public static final class FinancialSmsCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FinancialSmsCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SmsManager.FinancialSmsCallback wrap(android.telephony.SmsManager.FinancialSmsCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SmsManager.FinancialSmsCallback(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.SmsManager.FinancialSmsCallback getReal() {
            return (android.telephony.SmsManager.FinancialSmsCallback) real;
        }

        public android.telephony.SmsManager.FinancialSmsCallback unwrap() {
            return getReal();
        }

        public void onFinancialSmsMessages(com.micklab.dcg.wrapper.android.database.CursorWindow arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsManager$FinancialSmsCallback#onFinancialSmsMessages(android.database.CursorWindow)");
        }

    }
}
