// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class PendingIntent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PendingIntent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent wrap(android.app.PendingIntent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.PendingIntent(real, (__DcgwBridgeToken) null);
    }

    public android.app.PendingIntent getReal() {
        return (android.app.PendingIntent) real;
    }

    public android.app.PendingIntent unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.app.PendingIntent) real).cancel();
    }

    public int describeContents() {
        return ((android.app.PendingIntent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.PendingIntent) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent getActivities(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, android.content.Intent[] arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.getActivities(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent getActivities(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, android.content.Intent[] arg2, int arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.getActivities(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent getActivity(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.getActivity(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent getActivity(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.getActivity(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent getBroadcast(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.getBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public java.lang.String getCreatorPackage() {
        return ((android.app.PendingIntent) real).getCreatorPackage();
    }

    public int getCreatorUid() {
        return ((android.app.PendingIntent) real).getCreatorUid();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getCreatorUserHandle() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(((android.app.PendingIntent) real).getCreatorUserHandle());
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent getForegroundService(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.getForegroundService(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender getIntentSender() {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(((android.app.PendingIntent) real).getIntentSender());
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent getService(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.getService(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public java.lang.String getTargetPackage() {
        return ((android.app.PendingIntent) real).getTargetPackage();
    }

    public int hashCode() {
        return ((android.app.PendingIntent) real).hashCode();
    }

    public boolean isActivity() {
        return ((android.app.PendingIntent) real).isActivity();
    }

    public boolean isBroadcast() {
        return ((android.app.PendingIntent) real).isBroadcast();
    }

    public boolean isForegroundService() {
        return ((android.app.PendingIntent) real).isForegroundService();
    }

    public boolean isImmutable() {
        return ((android.app.PendingIntent) real).isImmutable();
    }

    public boolean isService() {
        return ((android.app.PendingIntent) real).isService();
    }

    public static com.micklab.dcg.wrapper.android.app.PendingIntent readPendingIntentOrNullFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(android.app.PendingIntent.readPendingIntentOrNullFromParcel(arg0 == null ? null : arg0.getReal()));
    }

    public void send() throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send();
    }

    public void send(com.micklab.dcg.wrapper.android.os.Bundle arg0) throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send(arg0 == null ? null : arg0.getReal());
    }

    public void send(int arg0) throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send(arg0);
    }

    public void send(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void send(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent.OnFinished arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void send(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.app.PendingIntent.OnFinished arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public void send(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.app.PendingIntent.OnFinished arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, java.lang.String arg5) throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void send(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.app.PendingIntent.OnFinished arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, java.lang.String arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) throws android.app.PendingIntent.CanceledException {
        ((android.app.PendingIntent) real).send(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public java.lang.String toString() {
        return ((android.app.PendingIntent) real).toString();
    }

    public static void writePendingIntentOrNullToParcel(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1) {
        android.app.PendingIntent.writePendingIntentOrNullToParcel(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.PendingIntent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_ALLOW_UNSAFE_IMPLICIT_INTENT = android.app.PendingIntent.FLAG_ALLOW_UNSAFE_IMPLICIT_INTENT;
    public static final int FLAG_CANCEL_CURRENT = android.app.PendingIntent.FLAG_CANCEL_CURRENT;
    public static final int FLAG_IMMUTABLE = android.app.PendingIntent.FLAG_IMMUTABLE;
    public static final int FLAG_MUTABLE = android.app.PendingIntent.FLAG_MUTABLE;
    public static final int FLAG_NO_CREATE = android.app.PendingIntent.FLAG_NO_CREATE;
    public static final int FLAG_ONE_SHOT = android.app.PendingIntent.FLAG_ONE_SHOT;
    public static final int FLAG_UPDATE_CURRENT = android.app.PendingIntent.FLAG_UPDATE_CURRENT;

    public static final class CanceledException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CanceledException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.PendingIntent.CanceledException wrap(android.app.PendingIntent.CanceledException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.PendingIntent.CanceledException(real, (__DcgwBridgeToken) null);
        }

        public android.app.PendingIntent.CanceledException getReal() {
            return (android.app.PendingIntent.CanceledException) real;
        }

        public android.app.PendingIntent.CanceledException unwrap() {
            return getReal();
        }

        public CanceledException() {
            this(new android.app.PendingIntent.CanceledException(), (__DcgwBridgeToken) null);
        }

        public CanceledException(java.lang.Exception arg0) {
            this(new android.app.PendingIntent.CanceledException(arg0), (__DcgwBridgeToken) null);
        }

        public CanceledException(java.lang.String arg0) {
            this(new android.app.PendingIntent.CanceledException(arg0), (__DcgwBridgeToken) null);
        }

    }
    public static final class OnFinished {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnFinished(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.PendingIntent.OnFinished wrap(android.app.PendingIntent.OnFinished real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.PendingIntent.OnFinished(real, (__DcgwBridgeToken) null);
        }

        public android.app.PendingIntent.OnFinished getReal() {
            return (android.app.PendingIntent.OnFinished) real;
        }

        public android.app.PendingIntent.OnFinished unwrap() {
            return getReal();
        }

        public void onSendFinished(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
            ((android.app.PendingIntent.OnFinished) real).onSendFinished(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal());
        }

    }
}
