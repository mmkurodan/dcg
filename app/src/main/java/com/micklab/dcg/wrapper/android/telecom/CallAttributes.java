// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallAttributes {
    private final android.telecom.CallAttributes real;

    public CallAttributes(android.telecom.CallAttributes real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallAttributes wrap(android.telecom.CallAttributes real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallAttributes(real);
    }

    public android.telecom.CallAttributes unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getAddress());
    }

    public int getCallCapabilities() {
        return real.getCallCapabilities();
    }

    public int getCallType() {
        return real.getCallType();
    }

    public int getDirection() {
        return real.getDirection();
    }

    public java.lang.CharSequence getDisplayName() {
        return real.getDisplayName();
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getPhoneAccountHandle() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(real.getPhoneAccountHandle());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int AUDIO_CALL = android.telecom.CallAttributes.AUDIO_CALL;
    public static final int DIRECTION_INCOMING = android.telecom.CallAttributes.DIRECTION_INCOMING;
    public static final int DIRECTION_OUTGOING = android.telecom.CallAttributes.DIRECTION_OUTGOING;
    public static final int SUPPORTS_SET_INACTIVE = android.telecom.CallAttributes.SUPPORTS_SET_INACTIVE;
    public static final int SUPPORTS_STREAM = android.telecom.CallAttributes.SUPPORTS_STREAM;
    public static final int SUPPORTS_TRANSFER = android.telecom.CallAttributes.SUPPORTS_TRANSFER;
    public static final int SUPPORTS_VIDEO_CALLING = android.telecom.CallAttributes.SUPPORTS_VIDEO_CALLING;
    public static final int VIDEO_CALL = android.telecom.CallAttributes.VIDEO_CALL;

    public static final class Builder {
        private final android.telecom.CallAttributes.Builder real;

        public Builder(android.telecom.CallAttributes.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.CallAttributes.Builder wrap(android.telecom.CallAttributes.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallAttributes.Builder(real);
        }

        public android.telecom.CallAttributes.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, int arg1, java.lang.CharSequence arg2, com.micklab.dcg.wrapper.android.net.Uri arg3) {
            this(new android.telecom.CallAttributes.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.telecom.CallAttributes build() {
            return com.micklab.dcg.wrapper.android.telecom.CallAttributes.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.telecom.CallAttributes.Builder setCallCapabilities(int arg0) {
            return com.micklab.dcg.wrapper.android.telecom.CallAttributes.Builder.wrap(real.setCallCapabilities(arg0));
        }

        public com.micklab.dcg.wrapper.android.telecom.CallAttributes.Builder setCallType(int arg0) {
            return com.micklab.dcg.wrapper.android.telecom.CallAttributes.Builder.wrap(real.setCallType(arg0));
        }

    }
}
