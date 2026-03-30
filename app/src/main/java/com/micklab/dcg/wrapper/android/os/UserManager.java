// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class UserManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UserManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.UserManager wrap(android.os.UserManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.UserManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.UserManager getReal() {
        return (android.os.UserManager) real;
    }

    public android.os.UserManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.content.Intent createUserCreationIntent(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.PersistableBundle arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#createUserCreationIntent(java.lang.String,java.lang.String,java.lang.String,android.os.PersistableBundle)");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getApplicationRestrictions(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getApplicationRestrictions(java.lang.String)");
    }

    public long getSerialNumberForUser(com.micklab.dcg.wrapper.android.os.UserHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getSerialNumberForUser(android.os.UserHandle)");
    }

    public int getUserCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getUserCount()");
    }

    public long getUserCreationTime(com.micklab.dcg.wrapper.android.os.UserHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getUserCreationTime(android.os.UserHandle)");
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUserForSerialNumber(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getUserForSerialNumber(long)");
    }

    public java.lang.String getUserName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getUserName()");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getUserRestrictions() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getUserRestrictions()");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getUserRestrictions(com.micklab.dcg.wrapper.android.os.UserHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#getUserRestrictions(android.os.UserHandle)");
    }

    public boolean hasUserRestriction(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#hasUserRestriction(java.lang.String)");
    }

    public boolean isAdminUser() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isAdminUser()");
    }

    public boolean isDemoUser() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isDemoUser()");
    }

    public static boolean isHeadlessSystemUserMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isHeadlessSystemUserMode()");
    }

    public boolean isManagedProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isManagedProfile()");
    }

    public boolean isProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isProfile()");
    }

    public boolean isQuietModeEnabled(com.micklab.dcg.wrapper.android.os.UserHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isQuietModeEnabled(android.os.UserHandle)");
    }

    public boolean isSystemUser() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isSystemUser()");
    }

    public boolean isUserAGoat() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isUserAGoat()");
    }

    public boolean isUserForeground() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isUserForeground()");
    }

    public boolean isUserRunning(com.micklab.dcg.wrapper.android.os.UserHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isUserRunning(android.os.UserHandle)");
    }

    public boolean isUserRunningOrStopping(com.micklab.dcg.wrapper.android.os.UserHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isUserRunningOrStopping(android.os.UserHandle)");
    }

    public boolean isUserUnlocked() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isUserUnlocked()");
    }

    public boolean isUserUnlocked(com.micklab.dcg.wrapper.android.os.UserHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#isUserUnlocked(android.os.UserHandle)");
    }

    public boolean requestQuietModeEnabled(boolean arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#requestQuietModeEnabled(boolean,android.os.UserHandle)");
    }

    public boolean requestQuietModeEnabled(boolean arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#requestQuietModeEnabled(boolean,android.os.UserHandle,int)");
    }

    public boolean setRestrictionsChallenge(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#setRestrictionsChallenge(java.lang.String)");
    }

    public void setUserRestriction(java.lang.String arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#setUserRestriction(java.lang.String,boolean)");
    }

    public void setUserRestrictions(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#setUserRestrictions(android.os.Bundle)");
    }

    public void setUserRestrictions(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#setUserRestrictions(android.os.Bundle,android.os.UserHandle)");
    }

    public static boolean supportsMultipleUsers() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager#supportsMultipleUsers()");
    }


    public static final class UserOperationException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UserOperationException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.UserManager.UserOperationException wrap(android.os.UserManager.UserOperationException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.UserManager.UserOperationException(real, (__DcgwBridgeToken) null);
        }

        public android.os.UserManager.UserOperationException getReal() {
            return (android.os.UserManager.UserOperationException) real;
        }

        public android.os.UserManager.UserOperationException unwrap() {
            return getReal();
        }

        public int getUserOperationResult() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.UserManager$UserOperationException#getUserOperationResult()");
        }

    }
}
