// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class E2eeContactKeysManager {
    private final android.provider.E2eeContactKeysManager real;

    public E2eeContactKeysManager(android.provider.E2eeContactKeysManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager wrap(android.provider.E2eeContactKeysManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager(real);
    }

    public android.provider.E2eeContactKeysManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey getE2eeContactKey(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey.wrap(real.getE2eeContactKey(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey getE2eeSelfKey(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey.wrap(real.getE2eeSelfKey(arg0, arg1));
    }

    public static int getMaxKeySizeBytes() {
        return android.provider.E2eeContactKeysManager.getMaxKeySizeBytes();
    }

    public boolean removeE2eeContactKey(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return real.removeE2eeContactKey(arg0, arg1, arg2);
    }

    public boolean removeE2eeSelfKey(java.lang.String arg0, java.lang.String arg1) {
        return real.removeE2eeSelfKey(arg0, arg1);
    }

    public boolean updateE2eeContactKeyLocalVerificationState(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        return real.updateE2eeContactKeyLocalVerificationState(arg0, arg1, arg2, arg3);
    }

    public boolean updateE2eeContactKeyRemoteVerificationState(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        return real.updateE2eeContactKeyRemoteVerificationState(arg0, arg1, arg2, arg3);
    }

    public boolean updateE2eeSelfKeyRemoteVerificationState(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.updateE2eeSelfKeyRemoteVerificationState(arg0, arg1, arg2);
    }

    public void updateOrInsertE2eeContactKey(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte[] arg3) {
        real.updateOrInsertE2eeContactKey(arg0, arg1, arg2, arg3);
    }

    public boolean updateOrInsertE2eeSelfKey(java.lang.String arg0, java.lang.String arg1, byte[] arg2) {
        return real.updateOrInsertE2eeSelfKey(arg0, arg1, arg2);
    }

    public static final int VERIFICATION_STATE_UNVERIFIED = android.provider.E2eeContactKeysManager.VERIFICATION_STATE_UNVERIFIED;
    public static final int VERIFICATION_STATE_VERIFICATION_FAILED = android.provider.E2eeContactKeysManager.VERIFICATION_STATE_VERIFICATION_FAILED;
    public static final int VERIFICATION_STATE_VERIFIED = android.provider.E2eeContactKeysManager.VERIFICATION_STATE_VERIFIED;

    public static final class E2eeContactKey {
        private final android.provider.E2eeContactKeysManager.E2eeContactKey real;

        public E2eeContactKey(android.provider.E2eeContactKeysManager.E2eeContactKey real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey wrap(android.provider.E2eeContactKeysManager.E2eeContactKey real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey(real);
        }

        public android.provider.E2eeContactKeysManager.E2eeContactKey unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getAccountId() {
            return real.getAccountId();
        }

        public java.lang.String getDeviceId() {
            return real.getDeviceId();
        }

        public java.lang.String getDisplayName() {
            return real.getDisplayName();
        }

        public java.lang.String getEmailAddress() {
            return real.getEmailAddress();
        }

        public byte[] getKeyValue() {
            return real.getKeyValue();
        }

        public int getLocalVerificationState() {
            return real.getLocalVerificationState();
        }

        public java.lang.String getOwnerPackageName() {
            return real.getOwnerPackageName();
        }

        public java.lang.String getPhoneNumber() {
            return real.getPhoneNumber();
        }

        public int getRemoteVerificationState() {
            return real.getRemoteVerificationState();
        }

        public long getTimeUpdated() {
            return real.getTimeUpdated();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class E2eeSelfKey {
        private final android.provider.E2eeContactKeysManager.E2eeSelfKey real;

        public E2eeSelfKey(android.provider.E2eeContactKeysManager.E2eeSelfKey real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey wrap(android.provider.E2eeContactKeysManager.E2eeSelfKey real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey(real);
        }

        public android.provider.E2eeContactKeysManager.E2eeSelfKey unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getAccountId() {
            return real.getAccountId();
        }

        public java.lang.String getDeviceId() {
            return real.getDeviceId();
        }

        public byte[] getKeyValue() {
            return real.getKeyValue();
        }

        public java.lang.String getOwnerPackageName() {
            return real.getOwnerPackageName();
        }

        public int getRemoteVerificationState() {
            return real.getRemoteVerificationState();
        }

        public long getTimeUpdated() {
            return real.getTimeUpdated();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
