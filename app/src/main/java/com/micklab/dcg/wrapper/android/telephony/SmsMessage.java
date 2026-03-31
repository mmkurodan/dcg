// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class SmsMessage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SmsMessage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsMessage wrap(android.telephony.SmsMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SmsMessage(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.SmsMessage getReal() {
        return (android.telephony.SmsMessage) real;
    }

    public android.telephony.SmsMessage unwrap() {
        return getReal();
    }

    public static int[] calculateLength(java.lang.CharSequence arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#calculateLength(java.lang.CharSequence,boolean)");
    }

    public static int[] calculateLength(java.lang.String arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#calculateLength(java.lang.String,boolean)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsMessage createFromPdu(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#createFromPdu([B)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsMessage createFromPdu(byte[] arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#createFromPdu([B,java.lang.String)");
    }

    public java.lang.String getDisplayMessageBody() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getDisplayMessageBody()");
    }

    public java.lang.String getDisplayOriginatingAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getDisplayOriginatingAddress()");
    }

    public java.lang.String getEmailBody() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getEmailBody()");
    }

    public java.lang.String getEmailFrom() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getEmailFrom()");
    }

    public int getIndexOnIcc() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getIndexOnIcc()");
    }

    public int getIndexOnSim() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getIndexOnSim()");
    }

    public java.lang.String getMessageBody() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getMessageBody()");
    }

    public com.micklab.dcg.wrapper.android.telephony.SmsMessage.MessageClass getMessageClass() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getMessageClass()");
    }

    public java.lang.String getOriginatingAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getOriginatingAddress()");
    }

    public byte[] getPdu() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getPdu()");
    }

    public int getProtocolIdentifier() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getProtocolIdentifier()");
    }

    public java.lang.String getPseudoSubject() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getPseudoSubject()");
    }

    public java.lang.String getRecipientAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getRecipientAddress()");
    }

    public java.lang.String getServiceCenterAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getServiceCenterAddress()");
    }

    public int getStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getStatus()");
    }

    public int getStatusOnIcc() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getStatusOnIcc()");
    }

    public int getStatusOnSim() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getStatusOnSim()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, boolean arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getSubmitPdu(java.lang.String,java.lang.String,java.lang.String,boolean)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg0, java.lang.String arg1, short arg2, byte[] arg3, boolean arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getSubmitPdu(java.lang.String,java.lang.String,short,[B,boolean)");
    }

    public static int getTPLayerLengthForPDU(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getTPLayerLengthForPDU(java.lang.String)");
    }

    public long getTimestampMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getTimestampMillis()");
    }

    public byte[] getUserData() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#getUserData()");
    }

    public boolean isCphsMwiMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isCphsMwiMessage()");
    }

    public boolean isEmail() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isEmail()");
    }

    public boolean isMWIClearMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isMWIClearMessage()");
    }

    public boolean isMWISetMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isMWISetMessage()");
    }

    public boolean isMwiDontStore() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isMwiDontStore()");
    }

    public boolean isReplace() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isReplace()");
    }

    public boolean isReplyPathPresent() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isReplyPathPresent()");
    }

    public boolean isStatusReportMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage#isStatusReportMessage()");
    }


    public static final class MessageClass {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MessageClass(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SmsMessage.MessageClass wrap(android.telephony.SmsMessage.MessageClass real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SmsMessage.MessageClass(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.SmsMessage.MessageClass getReal() {
            return (android.telephony.SmsMessage.MessageClass) real;
        }

        public android.telephony.SmsMessage.MessageClass unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.telephony.SmsMessage.MessageClass valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage$MessageClass#valueOf(java.lang.String)");
        }

        public static android.telephony.SmsMessage.MessageClass[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage$MessageClass#values()");
        }


    }
    public static final class SubmitPdu {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SubmitPdu(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.SmsMessage.SubmitPdu wrap(android.telephony.SmsMessage.SubmitPdu real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.SmsMessage.SubmitPdu(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.SmsMessage.SubmitPdu getReal() {
            return (android.telephony.SmsMessage.SubmitPdu) real;
        }

        public android.telephony.SmsMessage.SubmitPdu unwrap() {
            return getReal();
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.SmsMessage$SubmitPdu#toString()");
        }


    }
}
