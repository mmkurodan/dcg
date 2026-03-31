// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class IntentSender {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntentSender(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.IntentSender wrap(android.content.IntentSender real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentSender(real, (__DcgwBridgeToken) null);
    }

    public android.content.IntentSender getReal() {
        return (android.content.IntentSender) real;
    }

    public android.content.IntentSender unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.IntentSender) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.IntentSender) real).equals(arg0);
    }

    public java.lang.String getCreatorPackage() {
        return ((android.content.IntentSender) real).getCreatorPackage();
    }

    public int getCreatorUid() {
        return ((android.content.IntentSender) real).getCreatorUid();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getCreatorUserHandle() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(((android.content.IntentSender) real).getCreatorUserHandle());
    }

    public java.lang.String getTargetPackage() {
        return ((android.content.IntentSender) real).getTargetPackage();
    }

    public int hashCode() {
        return ((android.content.IntentSender) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.content.IntentSender readIntentSenderOrNullFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(android.content.IntentSender.readIntentSenderOrNullFromParcel(arg0 == null ? null : arg0.getReal()));
    }

    public void sendIntent(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) throws android.content.IntentSender.SendIntentException {
        ((android.content.IntentSender) real).sendIntent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void sendIntent(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, java.lang.String arg5) throws android.content.IntentSender.SendIntentException {
        ((android.content.IntentSender) real).sendIntent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void sendIntent(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4, java.util.concurrent.Executor arg5, com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished arg6) throws android.content.IntentSender.SendIntentException {
        ((android.content.IntentSender) real).sendIntent(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public java.lang.String toString() {
        return ((android.content.IntentSender) real).toString();
    }

    public static void writeIntentSenderOrNullToParcel(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1) {
        android.content.IntentSender.writeIntentSenderOrNullToParcel(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.IntentSender) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class OnFinished {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnFinished(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished wrap(android.content.IntentSender.OnFinished real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished(real, (__DcgwBridgeToken) null);
        }

        public android.content.IntentSender.OnFinished getReal() {
            return (android.content.IntentSender.OnFinished) real;
        }

        public android.content.IntentSender.OnFinished unwrap() {
            return getReal();
        }

        public void onSendFinished(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
            ((android.content.IntentSender.OnFinished) real).onSendFinished(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal());
        }

    }
    public static final class SendIntentException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SendIntentException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentSender.SendIntentException wrap(android.content.IntentSender.SendIntentException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentSender.SendIntentException(real, (__DcgwBridgeToken) null);
        }

        public android.content.IntentSender.SendIntentException getReal() {
            return (android.content.IntentSender.SendIntentException) real;
        }

        public android.content.IntentSender.SendIntentException unwrap() {
            return getReal();
        }

        public SendIntentException() {
            this(new android.content.IntentSender.SendIntentException(), (__DcgwBridgeToken) null);
        }

        public SendIntentException(java.lang.Exception arg0) {
            this(new android.content.IntentSender.SendIntentException(arg0), (__DcgwBridgeToken) null);
        }

        public SendIntentException(java.lang.String arg0) {
            this(new android.content.IntentSender.SendIntentException(arg0), (__DcgwBridgeToken) null);
        }

    }
}
