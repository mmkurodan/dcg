// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class PackageInstaller {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PackageInstaller(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller wrap(android.content.pm.PackageInstaller real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.PackageInstaller getReal() {
        return (android.content.pm.PackageInstaller) real;
    }

    public android.content.pm.PackageInstaller unwrap() {
        return getReal();
    }

    public void abandonSession(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#abandonSession(int)");
    }

    public void commitSessionAfterInstallConstraintsAreMet(int arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints arg2, long arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#commitSessionAfterInstallConstraintsAreMet(int,android.content.IntentSender,android.content.pm.PackageInstaller$InstallConstraints,long)");
    }

    public int createSession(com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionParams arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#createSession(android.content.pm.PackageInstaller$SessionParams)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionInfo getActiveStagedSession() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#getActiveStagedSession()");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#getSessionInfo(int)");
    }

    public void installExistingPackage(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.content.IntentSender arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#installExistingPackage(java.lang.String,int,android.content.IntentSender)");
    }

    public void installPackageArchived(com.micklab.dcg.wrapper.android.content.pm.ArchivedPackageInfo arg0, com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionParams arg1, com.micklab.dcg.wrapper.android.content.IntentSender arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#installPackageArchived(android.content.pm.ArchivedPackageInfo,android.content.pm.PackageInstaller$SessionParams,android.content.IntentSender)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.Session openSession(int arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#openSession(int)");
    }

    public void registerSessionCallback(com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#registerSessionCallback(android.content.pm.PackageInstaller$SessionCallback)");
    }

    public void registerSessionCallback(com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#registerSessionCallback(android.content.pm.PackageInstaller$SessionCallback,android.os.Handler)");
    }

    public void reportUnarchivalState(com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#reportUnarchivalState(android.content.pm.PackageInstaller$UnarchivalState)");
    }

    public void reportUnarchivalStatus(int arg0, int arg1, long arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#reportUnarchivalStatus(int,int,long,android.app.PendingIntent)");
    }

    public void requestArchive(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#requestArchive(java.lang.String,android.content.IntentSender)");
    }

    public void requestUnarchive(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#requestUnarchive(java.lang.String,android.content.IntentSender)");
    }

    public void uninstall(com.micklab.dcg.wrapper.android.content.pm.VersionedPackage arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#uninstall(android.content.pm.VersionedPackage,android.content.IntentSender)");
    }

    public void uninstall(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#uninstall(java.lang.String,android.content.IntentSender)");
    }

    public void uninstall(com.micklab.dcg.wrapper.android.content.pm.VersionedPackage arg0, int arg1, com.micklab.dcg.wrapper.android.content.IntentSender arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#uninstall(android.content.pm.VersionedPackage,int,android.content.IntentSender)");
    }

    public void uninstallExistingPackage(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#uninstallExistingPackage(java.lang.String,android.content.IntentSender)");
    }

    public void unregisterSessionCallback(com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#unregisterSessionCallback(android.content.pm.PackageInstaller$SessionCallback)");
    }

    public void updateSessionAppIcon(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#updateSessionAppIcon(int,android.graphics.Bitmap)");
    }

    public void updateSessionAppLabel(int arg0, java.lang.CharSequence arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller#updateSessionAppLabel(int,java.lang.CharSequence)");
    }


    public static final class InstallConstraints {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InstallConstraints(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints wrap(android.content.pm.PackageInstaller.InstallConstraints real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.InstallConstraints getReal() {
            return (android.content.pm.PackageInstaller.InstallConstraints) real;
        }

        public android.content.pm.PackageInstaller.InstallConstraints unwrap() {
            return getReal();
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#describeContents()");
        }

        public boolean equals(java.lang.Object arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#equals(java.lang.Object)");
        }

        public int hashCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#hashCode()");
        }

        public boolean isAppNotForegroundRequired() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#isAppNotForegroundRequired()");
        }

        public boolean isAppNotInteractingRequired() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#isAppNotInteractingRequired()");
        }

        public boolean isAppNotTopVisibleRequired() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#isAppNotTopVisibleRequired()");
        }

        public boolean isDeviceIdleRequired() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#isDeviceIdleRequired()");
        }

        public boolean isNotInCallRequired() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#isNotInCallRequired()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints#writeToParcel(android.os.Parcel,int)");
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints.Builder wrap(android.content.pm.PackageInstaller.InstallConstraints.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.content.pm.PackageInstaller.InstallConstraints.Builder getReal() {
                return (android.content.pm.PackageInstaller.InstallConstraints.Builder) real;
            }

            public android.content.pm.PackageInstaller.InstallConstraints.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints$Builder#android.content.pm.PackageInstaller$InstallConstraints$Builder()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints build() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints$Builder#build()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotForegroundRequired() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints$Builder#setAppNotForegroundRequired()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotInteractingRequired() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints$Builder#setAppNotInteractingRequired()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotTopVisibleRequired() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints$Builder#setAppNotTopVisibleRequired()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints.Builder setDeviceIdleRequired() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints$Builder#setDeviceIdleRequired()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraints.Builder setNotInCallRequired() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraints$Builder#setNotInCallRequired()");
            }

        }
    }
    public static final class InstallConstraintsResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InstallConstraintsResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraintsResult wrap(android.content.pm.PackageInstaller.InstallConstraintsResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.InstallConstraintsResult(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.InstallConstraintsResult getReal() {
            return (android.content.pm.PackageInstaller.InstallConstraintsResult) real;
        }

        public android.content.pm.PackageInstaller.InstallConstraintsResult unwrap() {
            return getReal();
        }

        public boolean areAllConstraintsSatisfied() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraintsResult#areAllConstraintsSatisfied()");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraintsResult#describeContents()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$InstallConstraintsResult#writeToParcel(android.os.Parcel,int)");
        }


    }
    public static final class PreapprovalDetails {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PreapprovalDetails(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails wrap(android.content.pm.PackageInstaller.PreapprovalDetails real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.PreapprovalDetails getReal() {
            return (android.content.pm.PackageInstaller.PreapprovalDetails) real;
        }

        public android.content.pm.PackageInstaller.PreapprovalDetails unwrap() {
            return getReal();
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails#describeContents()");
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getIcon() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails#getIcon()");
        }

        public java.lang.CharSequence getLabel() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails#getLabel()");
        }

        public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails#getLocale()");
        }

        public java.lang.String getPackageName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails#getPackageName()");
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails#toString()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails#writeToParcel(android.os.Parcel,int)");
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails.Builder wrap(android.content.pm.PackageInstaller.PreapprovalDetails.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder getReal() {
                return (android.content.pm.PackageInstaller.PreapprovalDetails.Builder) real;
            }

            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails$Builder#android.content.pm.PackageInstaller$PreapprovalDetails$Builder()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails build() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails$Builder#build()");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails$Builder#setIcon(android.graphics.Bitmap)");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails.Builder setLabel(java.lang.CharSequence arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails$Builder#setLabel(java.lang.CharSequence)");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails.Builder setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails$Builder#setLocale(android.icu.util.ULocale)");
            }

            public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails.Builder setPackageName(java.lang.String arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$PreapprovalDetails$Builder#setPackageName(java.lang.String)");
            }

        }
    }
    public static final class Session {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Session(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.Session wrap(android.content.pm.PackageInstaller.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.Session(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.Session getReal() {
            return (android.content.pm.PackageInstaller.Session) real;
        }

        public android.content.pm.PackageInstaller.Session unwrap() {
            return getReal();
        }

        public void abandon() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#abandon()");
        }

        public void addChildSessionId(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#addChildSessionId(int)");
        }

        public void close() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#close()");
        }

        public void commit(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#commit(android.content.IntentSender)");
        }

        public void fsync(java.io.OutputStream arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#fsync(java.io.OutputStream)");
        }

        public com.micklab.dcg.wrapper.android.os.PersistableBundle getAppMetadata() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#getAppMetadata()");
        }

        public int[] getChildSessionIds() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#getChildSessionIds()");
        }

        public java.lang.String[] getNames() throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#getNames()");
        }

        public int getParentSessionId() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#getParentSessionId()");
        }

        public boolean isApplicationEnabledSettingPersistent() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#isApplicationEnabledSettingPersistent()");
        }

        public boolean isMultiPackage() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#isMultiPackage()");
        }

        public boolean isRequestUpdateOwnership() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#isRequestUpdateOwnership()");
        }

        public boolean isStaged() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#isStaged()");
        }

        public java.io.InputStream openRead(java.lang.String arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#openRead(java.lang.String)");
        }

        public java.io.OutputStream openWrite(java.lang.String arg0, long arg1, long arg2) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#openWrite(java.lang.String,long,long)");
        }

        public void removeChildSessionId(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#removeChildSessionId(int)");
        }

        public void removeSplit(java.lang.String arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#removeSplit(java.lang.String)");
        }

        public void requestUserPreapproval(com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.PreapprovalDetails arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#requestUserPreapproval(android.content.pm.PackageInstaller$PreapprovalDetails,android.content.IntentSender)");
        }

        public void setAppMetadata(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#setAppMetadata(android.os.PersistableBundle)");
        }

        public void setStagingProgress(float arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#setStagingProgress(float)");
        }

        public void transfer(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$Session#transfer(java.lang.String)");
        }

    }
    public static final class SessionCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SessionCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionCallback wrap(android.content.pm.PackageInstaller.SessionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionCallback(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.SessionCallback getReal() {
            return (android.content.pm.PackageInstaller.SessionCallback) real;
        }

        public android.content.pm.PackageInstaller.SessionCallback unwrap() {
            return getReal();
        }

        public void onActiveChanged(int arg0, boolean arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionCallback#onActiveChanged(int,boolean)");
        }

        public void onBadgingChanged(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionCallback#onBadgingChanged(int)");
        }

        public void onCreated(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionCallback#onCreated(int)");
        }

        public void onFinished(int arg0, boolean arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionCallback#onFinished(int,boolean)");
        }

        public void onProgressChanged(int arg0, float arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionCallback#onProgressChanged(int,float)");
        }

    }
    public static final class SessionInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SessionInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionInfo wrap(android.content.pm.PackageInstaller.SessionInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionInfo(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.SessionInfo getReal() {
            return (android.content.pm.PackageInstaller.SessionInfo) real;
        }

        public android.content.pm.PackageInstaller.SessionInfo unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.content.Intent createDetailsIntent() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#createDetailsIntent()");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#describeContents()");
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getAppIcon() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getAppIcon()");
        }

        public java.lang.CharSequence getAppLabel() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getAppLabel()");
        }

        public java.lang.String getAppPackageName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getAppPackageName()");
        }

        public int[] getChildSessionIds() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getChildSessionIds()");
        }

        public long getCreatedMillis() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getCreatedMillis()");
        }

        public boolean getDontKillApp() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getDontKillApp()");
        }

        public int getInstallLocation() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getInstallLocation()");
        }

        public int getInstallReason() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getInstallReason()");
        }

        public java.lang.String getInstallerAttributionTag() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getInstallerAttributionTag()");
        }

        public java.lang.String getInstallerPackageName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getInstallerPackageName()");
        }

        public int getInstallerUid() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getInstallerUid()");
        }

        public int getMode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getMode()");
        }

        public int getOriginatingUid() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getOriginatingUid()");
        }

        public com.micklab.dcg.wrapper.android.net.Uri getOriginatingUri() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getOriginatingUri()");
        }

        public int getPackageSource() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getPackageSource()");
        }

        public int getParentSessionId() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getParentSessionId()");
        }

        public float getProgress() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getProgress()");
        }

        public com.micklab.dcg.wrapper.android.net.Uri getReferrerUri() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getReferrerUri()");
        }

        public int getRequireUserAction() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getRequireUserAction()");
        }

        public int getSessionId() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getSessionId()");
        }

        public long getSize() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getSize()");
        }

        public int getStagedSessionErrorCode() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getStagedSessionErrorCode()");
        }

        public java.lang.String getStagedSessionErrorMessage() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getStagedSessionErrorMessage()");
        }

        public long getUpdatedMillis() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getUpdatedMillis()");
        }

        public com.micklab.dcg.wrapper.android.os.UserHandle getUser() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#getUser()");
        }

        public boolean hasParentSessionId() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#hasParentSessionId()");
        }

        public boolean isActive() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isActive()");
        }

        public boolean isApplicationEnabledSettingPersistent() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isApplicationEnabledSettingPersistent()");
        }

        public boolean isAutoInstallDependenciesEnabled() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isAutoInstallDependenciesEnabled()");
        }

        public boolean isCommitted() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isCommitted()");
        }

        public boolean isMultiPackage() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isMultiPackage()");
        }

        public boolean isPreApprovalRequested() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isPreApprovalRequested()");
        }

        public boolean isRequestUpdateOwnership() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isRequestUpdateOwnership()");
        }

        public boolean isSealed() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isSealed()");
        }

        public boolean isStaged() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isStaged()");
        }

        public boolean isStagedSessionActive() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isStagedSessionActive()");
        }

        public boolean isStagedSessionApplied() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isStagedSessionApplied()");
        }

        public boolean isStagedSessionFailed() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isStagedSessionFailed()");
        }

        public boolean isStagedSessionReady() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isStagedSessionReady()");
        }

        public boolean isUnarchival() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#isUnarchival()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionInfo#writeToParcel(android.os.Parcel,int)");
        }


    }
    public static final class SessionParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SessionParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionParams wrap(android.content.pm.PackageInstaller.SessionParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionParams(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.SessionParams getReal() {
            return (android.content.pm.PackageInstaller.SessionParams) real;
        }

        public android.content.pm.PackageInstaller.SessionParams unwrap() {
            return getReal();
        }

        public SessionParams(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#android.content.pm.PackageInstaller$SessionParams(int)");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#describeContents()");
        }

        public void setAppIcon(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setAppIcon(android.graphics.Bitmap)");
        }

        public void setAppLabel(java.lang.CharSequence arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setAppLabel(java.lang.CharSequence)");
        }

        public void setAppPackageName(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setAppPackageName(java.lang.String)");
        }

        public void setApplicationEnabledSettingPersistent() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setApplicationEnabledSettingPersistent()");
        }

        public void setAutoInstallDependenciesEnabled(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setAutoInstallDependenciesEnabled(boolean)");
        }

        public void setAutoRevokePermissionsMode(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setAutoRevokePermissionsMode(boolean)");
        }

        public void setDontKillApp(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setDontKillApp(boolean)");
        }

        public void setInstallLocation(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setInstallLocation(int)");
        }

        public void setInstallReason(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setInstallReason(int)");
        }

        public void setInstallScenario(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setInstallScenario(int)");
        }

        public void setInstallerPackageName(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setInstallerPackageName(java.lang.String)");
        }

        public void setMultiPackage() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setMultiPackage()");
        }

        public void setOriginatingUid(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setOriginatingUid(int)");
        }

        public void setOriginatingUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setOriginatingUri(android.net.Uri)");
        }

        public void setPackageSource(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setPackageSource(int)");
        }

        public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.SessionParams setPermissionState(java.lang.String arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setPermissionState(java.lang.String,int)");
        }

        public void setReferrerUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setReferrerUri(android.net.Uri)");
        }

        public void setRequestUpdateOwnership(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setRequestUpdateOwnership(boolean)");
        }

        public void setRequireUserAction(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setRequireUserAction(int)");
        }

        public void setSize(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setSize(long)");
        }

        public void setUnarchiveId(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#setUnarchiveId(int)");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$SessionParams#writeToParcel(android.os.Parcel,int)");
        }


    }
    public static final class UnarchivalState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UnarchivalState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState wrap(android.content.pm.PackageInstaller.UnarchivalState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.PackageInstaller.UnarchivalState getReal() {
            return (android.content.pm.PackageInstaller.UnarchivalState) real;
        }

        public android.content.pm.PackageInstaller.UnarchivalState unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState createGenericErrorState(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$UnarchivalState#createGenericErrorState(int)");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState createInsufficientStorageState(int arg0, long arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$UnarchivalState#createInsufficientStorageState(int,long,android.app.PendingIntent)");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState createNoConnectivityState(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$UnarchivalState#createNoConnectivityState(int)");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState createOkState(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$UnarchivalState#createOkState(int)");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageInstaller.UnarchivalState createUserActionRequiredState(int arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageInstaller$UnarchivalState#createUserActionRequiredState(int,android.app.PendingIntent)");
        }

    }
}
