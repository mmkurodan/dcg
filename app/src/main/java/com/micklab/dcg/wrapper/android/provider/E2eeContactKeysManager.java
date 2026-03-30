// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class E2eeContactKeysManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private E2eeContactKeysManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager wrap(android.provider.E2eeContactKeysManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager(real, (__DcgwBridgeToken) null);
    }

    public android.provider.E2eeContactKeysManager getReal() {
        return (android.provider.E2eeContactKeysManager) real;
    }

    public android.provider.E2eeContactKeysManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey getE2eeContactKey(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey.wrap(((android.provider.E2eeContactKeysManager) real).getE2eeContactKey(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey getE2eeSelfKey(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey.wrap(((android.provider.E2eeContactKeysManager) real).getE2eeSelfKey(arg0, arg1));
    }

    public static int getMaxKeySizeBytes() {
        return android.provider.E2eeContactKeysManager.getMaxKeySizeBytes();
    }

    public boolean removeE2eeContactKey(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return ((android.provider.E2eeContactKeysManager) real).removeE2eeContactKey(arg0, arg1, arg2);
    }

    public boolean removeE2eeSelfKey(java.lang.String arg0, java.lang.String arg1) {
        return ((android.provider.E2eeContactKeysManager) real).removeE2eeSelfKey(arg0, arg1);
    }

    public boolean updateE2eeContactKeyLocalVerificationState(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        return ((android.provider.E2eeContactKeysManager) real).updateE2eeContactKeyLocalVerificationState(arg0, arg1, arg2, arg3);
    }

    public boolean updateE2eeContactKeyRemoteVerificationState(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        return ((android.provider.E2eeContactKeysManager) real).updateE2eeContactKeyRemoteVerificationState(arg0, arg1, arg2, arg3);
    }

    public boolean updateE2eeSelfKeyRemoteVerificationState(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return ((android.provider.E2eeContactKeysManager) real).updateE2eeSelfKeyRemoteVerificationState(arg0, arg1, arg2);
    }

    public void updateOrInsertE2eeContactKey(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte[] arg3) {
        ((android.provider.E2eeContactKeysManager) real).updateOrInsertE2eeContactKey(arg0, arg1, arg2, arg3);
    }

    public boolean updateOrInsertE2eeSelfKey(java.lang.String arg0, java.lang.String arg1, byte[] arg2) {
        return ((android.provider.E2eeContactKeysManager) real).updateOrInsertE2eeSelfKey(arg0, arg1, arg2);
    }

    public static final int VERIFICATION_STATE_UNVERIFIED = android.provider.E2eeContactKeysManager.VERIFICATION_STATE_UNVERIFIED;
    public static final int VERIFICATION_STATE_VERIFICATION_FAILED = android.provider.E2eeContactKeysManager.VERIFICATION_STATE_VERIFICATION_FAILED;
    public static final int VERIFICATION_STATE_VERIFIED = android.provider.E2eeContactKeysManager.VERIFICATION_STATE_VERIFIED;

    public static final class E2eeContactKey {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private E2eeContactKey(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey wrap(android.provider.E2eeContactKeysManager.E2eeContactKey real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeContactKey(real, (__DcgwBridgeToken) null);
        }

        public android.provider.E2eeContactKeysManager.E2eeContactKey getReal() {
            return (android.provider.E2eeContactKeysManager.E2eeContactKey) real;
        }

        public android.provider.E2eeContactKeysManager.E2eeContactKey unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).equals(arg0);
        }

        public java.lang.String getAccountId() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getAccountId();
        }

        public java.lang.String getDeviceId() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getDeviceId();
        }

        public java.lang.String getDisplayName() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getDisplayName();
        }

        public java.lang.String getEmailAddress() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getEmailAddress();
        }

        public byte[] getKeyValue() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getKeyValue();
        }

        public int getLocalVerificationState() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getLocalVerificationState();
        }

        public java.lang.String getOwnerPackageName() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getOwnerPackageName();
        }

        public java.lang.String getPhoneNumber() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getPhoneNumber();
        }

        public int getRemoteVerificationState() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getRemoteVerificationState();
        }

        public long getTimeUpdated() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).getTimeUpdated();
        }

        public int hashCode() {
            return ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.provider.E2eeContactKeysManager.E2eeContactKey) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class E2eeSelfKey {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private E2eeSelfKey(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey wrap(android.provider.E2eeContactKeysManager.E2eeSelfKey real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.E2eeContactKeysManager.E2eeSelfKey(real, (__DcgwBridgeToken) null);
        }

        public android.provider.E2eeContactKeysManager.E2eeSelfKey getReal() {
            return (android.provider.E2eeContactKeysManager.E2eeSelfKey) real;
        }

        public android.provider.E2eeContactKeysManager.E2eeSelfKey unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).equals(arg0);
        }

        public java.lang.String getAccountId() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).getAccountId();
        }

        public java.lang.String getDeviceId() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).getDeviceId();
        }

        public byte[] getKeyValue() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).getKeyValue();
        }

        public java.lang.String getOwnerPackageName() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).getOwnerPackageName();
        }

        public int getRemoteVerificationState() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).getRemoteVerificationState();
        }

        public long getTimeUpdated() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).getTimeUpdated();
        }

        public int hashCode() {
            return ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.provider.E2eeContactKeysManager.E2eeSelfKey) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
