// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.gsm;

public final class SmsMessage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SmsMessage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage wrap(android.telephony.gsm.SmsMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.gsm.SmsMessage getReal() {
        return (android.telephony.gsm.SmsMessage) real;
    }

    public android.telephony.gsm.SmsMessage unwrap() {
        return getReal();
    }

    public SmsMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#android.telephony.gsm.SmsMessage()");
    }

    public static int[] calculateLength(java.lang.CharSequence arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#calculateLength(java.lang.CharSequence,boolean)");
    }

    public static int[] calculateLength(java.lang.String arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#calculateLength(java.lang.String,boolean)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage createFromPdu(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#createFromPdu([B)");
    }

    public java.lang.String getDisplayMessageBody() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getDisplayMessageBody()");
    }

    public java.lang.String getDisplayOriginatingAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getDisplayOriginatingAddress()");
    }

    public java.lang.String getEmailBody() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getEmailBody()");
    }

    public java.lang.String getEmailFrom() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getEmailFrom()");
    }

    public int getIndexOnSim() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getIndexOnSim()");
    }

    public java.lang.String getMessageBody() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getMessageBody()");
    }

    public com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.MessageClass getMessageClass() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getMessageClass()");
    }

    public java.lang.String getOriginatingAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getOriginatingAddress()");
    }

    public byte[] getPdu() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getPdu()");
    }

    public int getProtocolIdentifier() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getProtocolIdentifier()");
    }

    public java.lang.String getPseudoSubject() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getPseudoSubject()");
    }

    public java.lang.String getServiceCenterAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getServiceCenterAddress()");
    }

    public int getStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getStatus()");
    }

    public int getStatusOnSim() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getStatusOnSim()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, boolean arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getSubmitPdu(java.lang.String,java.lang.String,java.lang.String,boolean)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg0, java.lang.String arg1, short arg2, byte[] arg3, boolean arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getSubmitPdu(java.lang.String,java.lang.String,short,[B,boolean)");
    }

    public static int getTPLayerLengthForPDU(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getTPLayerLengthForPDU(java.lang.String)");
    }

    public long getTimestampMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getTimestampMillis()");
    }

    public byte[] getUserData() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#getUserData()");
    }

    public boolean isCphsMwiMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isCphsMwiMessage()");
    }

    public boolean isEmail() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isEmail()");
    }

    public boolean isMWIClearMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isMWIClearMessage()");
    }

    public boolean isMWISetMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isMWISetMessage()");
    }

    public boolean isMwiDontStore() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isMwiDontStore()");
    }

    public boolean isReplace() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isReplace()");
    }

    public boolean isReplyPathPresent() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isReplyPathPresent()");
    }

    public boolean isStatusReportMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage#isStatusReportMessage()");
    }


    public static final class MessageClass {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MessageClass(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.MessageClass wrap(android.telephony.gsm.SmsMessage.MessageClass real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.MessageClass(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.gsm.SmsMessage.MessageClass getReal() {
            return (android.telephony.gsm.SmsMessage.MessageClass) real;
        }

        public android.telephony.gsm.SmsMessage.MessageClass unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.MessageClass valueOf(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage$MessageClass#valueOf(java.lang.String)");
        }

        public static android.telephony.gsm.SmsMessage.MessageClass[] values() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage$MessageClass#values()");
        }


    }
    public static final class SubmitPdu {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SubmitPdu(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.SubmitPdu wrap(android.telephony.gsm.SmsMessage.SubmitPdu real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.gsm.SmsMessage.SubmitPdu(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.gsm.SmsMessage.SubmitPdu getReal() {
            return (android.telephony.gsm.SmsMessage.SubmitPdu) real;
        }

        public android.telephony.gsm.SmsMessage.SubmitPdu unwrap() {
            return getReal();
        }

        public SubmitPdu() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage$SubmitPdu#android.telephony.gsm.SmsMessage$SubmitPdu()");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.gsm.SmsMessage$SubmitPdu#toString()");
        }


    }
}
