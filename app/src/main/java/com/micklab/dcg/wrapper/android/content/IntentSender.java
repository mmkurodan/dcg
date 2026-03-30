// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class IntentSender {
    private final android.content.IntentSender real;

    public IntentSender(android.content.IntentSender real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.IntentSender wrap(android.content.IntentSender real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentSender(real);
    }

    public android.content.IntentSender unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getCreatorPackage() {
        return real.getCreatorPackage();
    }

    public int getCreatorUid() {
        return real.getCreatorUid();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getCreatorUserHandle() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(real.getCreatorUserHandle());
    }

    public java.lang.String getTargetPackage() {
        return real.getTargetPackage();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static com.micklab.dcg.wrapper.android.content.IntentSender readIntentSenderOrNullFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(android.content.IntentSender.readIntentSenderOrNullFromParcel(arg0 == null ? null : arg0.unwrap()));
    }

    public void sendIntent(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) throws android.content.IntentSender.SendIntentException {
        real.sendIntent(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void sendIntent(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, java.lang.String arg5) throws android.content.IntentSender.SendIntentException {
        real.sendIntent(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static void writeIntentSenderOrNullToParcel(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1) {
        android.content.IntentSender.writeIntentSenderOrNullToParcel(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class OnFinished {
        private final android.content.IntentSender.OnFinished real;

        public OnFinished(android.content.IntentSender.OnFinished real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished wrap(android.content.IntentSender.OnFinished real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentSender.OnFinished(real);
        }

        public android.content.IntentSender.OnFinished unwrap() {
            return real;
        }

        public void onSendFinished(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
            real.onSendFinished(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap());
        }

    }
    public static final class SendIntentException {
        private final android.content.IntentSender.SendIntentException real;

        public SendIntentException(android.content.IntentSender.SendIntentException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentSender.SendIntentException wrap(android.content.IntentSender.SendIntentException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentSender.SendIntentException(real);
        }

        public android.content.IntentSender.SendIntentException unwrap() {
            return real;
        }

        public SendIntentException() {
            this(new android.content.IntentSender.SendIntentException());
        }

        public SendIntentException(java.lang.String arg0) {
            this(new android.content.IntentSender.SendIntentException(arg0));
        }

        public SendIntentException(java.lang.Exception arg0) {
            this(new android.content.IntentSender.SendIntentException(arg0));
        }

    }
}
