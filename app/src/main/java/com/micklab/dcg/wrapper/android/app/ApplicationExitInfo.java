// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ApplicationExitInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ApplicationExitInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ApplicationExitInfo wrap(android.app.ApplicationExitInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationExitInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.ApplicationExitInfo getReal() {
        return (android.app.ApplicationExitInfo) real;
    }

    public android.app.ApplicationExitInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.ApplicationExitInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.ApplicationExitInfo) real).equals(arg0);
    }

    public int getDefiningUid() {
        return ((android.app.ApplicationExitInfo) real).getDefiningUid();
    }

    public java.lang.String getDescription() {
        return ((android.app.ApplicationExitInfo) real).getDescription();
    }

    public int getImportance() {
        return ((android.app.ApplicationExitInfo) real).getImportance();
    }

    public int getPackageUid() {
        return ((android.app.ApplicationExitInfo) real).getPackageUid();
    }

    public int getPid() {
        return ((android.app.ApplicationExitInfo) real).getPid();
    }

    public java.lang.String getProcessName() {
        return ((android.app.ApplicationExitInfo) real).getProcessName();
    }

    public byte[] getProcessStateSummary() {
        return ((android.app.ApplicationExitInfo) real).getProcessStateSummary();
    }

    public long getPss() {
        return ((android.app.ApplicationExitInfo) real).getPss();
    }

    public int getRealUid() {
        return ((android.app.ApplicationExitInfo) real).getRealUid();
    }

    public int getReason() {
        return ((android.app.ApplicationExitInfo) real).getReason();
    }

    public long getRss() {
        return ((android.app.ApplicationExitInfo) real).getRss();
    }

    public int getStatus() {
        return ((android.app.ApplicationExitInfo) real).getStatus();
    }

    public long getTimestamp() {
        return ((android.app.ApplicationExitInfo) real).getTimestamp();
    }

    public java.io.InputStream getTraceInputStream() throws java.io.IOException {
        return ((android.app.ApplicationExitInfo) real).getTraceInputStream();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUserHandle() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(((android.app.ApplicationExitInfo) real).getUserHandle());
    }

    public int hashCode() {
        return ((android.app.ApplicationExitInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.ApplicationExitInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.ApplicationExitInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int REASON_ANR = android.app.ApplicationExitInfo.REASON_ANR;
    public static final int REASON_CRASH = android.app.ApplicationExitInfo.REASON_CRASH;
    public static final int REASON_CRASH_NATIVE = android.app.ApplicationExitInfo.REASON_CRASH_NATIVE;
    public static final int REASON_DEPENDENCY_DIED = android.app.ApplicationExitInfo.REASON_DEPENDENCY_DIED;
    public static final int REASON_EXCESSIVE_RESOURCE_USAGE = android.app.ApplicationExitInfo.REASON_EXCESSIVE_RESOURCE_USAGE;
    public static final int REASON_EXIT_SELF = android.app.ApplicationExitInfo.REASON_EXIT_SELF;
    public static final int REASON_FREEZER = android.app.ApplicationExitInfo.REASON_FREEZER;
    public static final int REASON_INITIALIZATION_FAILURE = android.app.ApplicationExitInfo.REASON_INITIALIZATION_FAILURE;
    public static final int REASON_LOW_MEMORY = android.app.ApplicationExitInfo.REASON_LOW_MEMORY;
    public static final int REASON_OTHER = android.app.ApplicationExitInfo.REASON_OTHER;
    public static final int REASON_PACKAGE_STATE_CHANGE = android.app.ApplicationExitInfo.REASON_PACKAGE_STATE_CHANGE;
    public static final int REASON_PACKAGE_UPDATED = android.app.ApplicationExitInfo.REASON_PACKAGE_UPDATED;
    public static final int REASON_PERMISSION_CHANGE = android.app.ApplicationExitInfo.REASON_PERMISSION_CHANGE;
    public static final int REASON_SIGNALED = android.app.ApplicationExitInfo.REASON_SIGNALED;
    public static final int REASON_UNKNOWN = android.app.ApplicationExitInfo.REASON_UNKNOWN;
    public static final int REASON_USER_REQUESTED = android.app.ApplicationExitInfo.REASON_USER_REQUESTED;
    public static final int REASON_USER_STOPPED = android.app.ApplicationExitInfo.REASON_USER_STOPPED;

}
