// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class VisualVoicemailService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VisualVoicemailService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService wrap(android.telephony.VisualVoicemailService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.VisualVoicemailService getReal() {
        return (android.telephony.VisualVoicemailService) real;
    }

    public android.telephony.VisualVoicemailService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService#onBind(android.content.Intent)");
    }

    public void onCellServiceConnected(com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService.VisualVoicemailTask arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService#onCellServiceConnected(android.telephony.VisualVoicemailService$VisualVoicemailTask,android.telecom.PhoneAccountHandle)");
    }

    public void onSimRemoved(com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService.VisualVoicemailTask arg0, com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService#onSimRemoved(android.telephony.VisualVoicemailService$VisualVoicemailTask,android.telecom.PhoneAccountHandle)");
    }

    public void onSmsReceived(com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService.VisualVoicemailTask arg0, com.micklab.dcg.wrapper.android.telephony.VisualVoicemailSms arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService#onSmsReceived(android.telephony.VisualVoicemailService$VisualVoicemailTask,android.telephony.VisualVoicemailSms)");
    }

    public void onStopped(com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService.VisualVoicemailTask arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService#onStopped(android.telephony.VisualVoicemailService$VisualVoicemailTask)");
    }


    public static final class VisualVoicemailTask {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VisualVoicemailTask(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService.VisualVoicemailTask wrap(android.telephony.VisualVoicemailService.VisualVoicemailTask real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.VisualVoicemailService.VisualVoicemailTask(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.VisualVoicemailService.VisualVoicemailTask getReal() {
            return (android.telephony.VisualVoicemailService.VisualVoicemailTask) real;
        }

        public android.telephony.VisualVoicemailService.VisualVoicemailTask unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService$VisualVoicemailTask#equals(java.lang.Object)");
        }

        public void finish() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService$VisualVoicemailTask#finish()");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.VisualVoicemailService$VisualVoicemailTask#hashCode()");
        }

    }
}
