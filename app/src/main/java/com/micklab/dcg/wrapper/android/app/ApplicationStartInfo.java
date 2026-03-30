// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ApplicationStartInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ApplicationStartInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ApplicationStartInfo wrap(android.app.ApplicationStartInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationStartInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.ApplicationStartInfo getReal() {
        return (android.app.ApplicationStartInfo) real;
    }

    public android.app.ApplicationStartInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.ApplicationStartInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.ApplicationStartInfo) real).equals(arg0);
    }

    public int getDefiningUid() {
        return ((android.app.ApplicationStartInfo) real).getDefiningUid();
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.ApplicationStartInfo) real).getIntent());
    }

    public int getLaunchMode() {
        return ((android.app.ApplicationStartInfo) real).getLaunchMode();
    }

    public int getPackageUid() {
        return ((android.app.ApplicationStartInfo) real).getPackageUid();
    }

    public int getPid() {
        return ((android.app.ApplicationStartInfo) real).getPid();
    }

    public java.lang.String getProcessName() {
        return ((android.app.ApplicationStartInfo) real).getProcessName();
    }

    public int getRealUid() {
        return ((android.app.ApplicationStartInfo) real).getRealUid();
    }

    public int getReason() {
        return ((android.app.ApplicationStartInfo) real).getReason();
    }

    public int getStartType() {
        return ((android.app.ApplicationStartInfo) real).getStartType();
    }

    public int getStartupState() {
        return ((android.app.ApplicationStartInfo) real).getStartupState();
    }

    public int hashCode() {
        return ((android.app.ApplicationStartInfo) real).hashCode();
    }

    public boolean wasForceStopped() {
        return ((android.app.ApplicationStartInfo) real).wasForceStopped();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.ApplicationStartInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int LAUNCH_MODE_SINGLE_INSTANCE = android.app.ApplicationStartInfo.LAUNCH_MODE_SINGLE_INSTANCE;
    public static final int LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK = android.app.ApplicationStartInfo.LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK;
    public static final int LAUNCH_MODE_SINGLE_TASK = android.app.ApplicationStartInfo.LAUNCH_MODE_SINGLE_TASK;
    public static final int LAUNCH_MODE_SINGLE_TOP = android.app.ApplicationStartInfo.LAUNCH_MODE_SINGLE_TOP;
    public static final int LAUNCH_MODE_STANDARD = android.app.ApplicationStartInfo.LAUNCH_MODE_STANDARD;
    public static final int STARTUP_STATE_ERROR = android.app.ApplicationStartInfo.STARTUP_STATE_ERROR;
    public static final int STARTUP_STATE_FIRST_FRAME_DRAWN = android.app.ApplicationStartInfo.STARTUP_STATE_FIRST_FRAME_DRAWN;
    public static final int STARTUP_STATE_STARTED = android.app.ApplicationStartInfo.STARTUP_STATE_STARTED;
    public static final int START_REASON_ALARM = android.app.ApplicationStartInfo.START_REASON_ALARM;
    public static final int START_REASON_BACKUP = android.app.ApplicationStartInfo.START_REASON_BACKUP;
    public static final int START_REASON_BOOT_COMPLETE = android.app.ApplicationStartInfo.START_REASON_BOOT_COMPLETE;
    public static final int START_REASON_BROADCAST = android.app.ApplicationStartInfo.START_REASON_BROADCAST;
    public static final int START_REASON_CONTENT_PROVIDER = android.app.ApplicationStartInfo.START_REASON_CONTENT_PROVIDER;
    public static final int START_REASON_JOB = android.app.ApplicationStartInfo.START_REASON_JOB;
    public static final int START_REASON_LAUNCHER = android.app.ApplicationStartInfo.START_REASON_LAUNCHER;
    public static final int START_REASON_LAUNCHER_RECENTS = android.app.ApplicationStartInfo.START_REASON_LAUNCHER_RECENTS;
    public static final int START_REASON_OTHER = android.app.ApplicationStartInfo.START_REASON_OTHER;
    public static final int START_REASON_PUSH = android.app.ApplicationStartInfo.START_REASON_PUSH;
    public static final int START_REASON_SERVICE = android.app.ApplicationStartInfo.START_REASON_SERVICE;
    public static final int START_REASON_START_ACTIVITY = android.app.ApplicationStartInfo.START_REASON_START_ACTIVITY;
    public static final int START_TIMESTAMP_APPLICATION_ONCREATE = android.app.ApplicationStartInfo.START_TIMESTAMP_APPLICATION_ONCREATE;
    public static final int START_TIMESTAMP_BIND_APPLICATION = android.app.ApplicationStartInfo.START_TIMESTAMP_BIND_APPLICATION;
    public static final int START_TIMESTAMP_FIRST_FRAME = android.app.ApplicationStartInfo.START_TIMESTAMP_FIRST_FRAME;
    public static final int START_TIMESTAMP_FORK = android.app.ApplicationStartInfo.START_TIMESTAMP_FORK;
    public static final int START_TIMESTAMP_FULLY_DRAWN = android.app.ApplicationStartInfo.START_TIMESTAMP_FULLY_DRAWN;
    public static final int START_TIMESTAMP_INITIAL_RENDERTHREAD_FRAME = android.app.ApplicationStartInfo.START_TIMESTAMP_INITIAL_RENDERTHREAD_FRAME;
    public static final int START_TIMESTAMP_LAUNCH = android.app.ApplicationStartInfo.START_TIMESTAMP_LAUNCH;
    public static final int START_TIMESTAMP_RESERVED_RANGE_DEVELOPER = android.app.ApplicationStartInfo.START_TIMESTAMP_RESERVED_RANGE_DEVELOPER;
    public static final int START_TIMESTAMP_RESERVED_RANGE_DEVELOPER_START = android.app.ApplicationStartInfo.START_TIMESTAMP_RESERVED_RANGE_DEVELOPER_START;
    public static final int START_TIMESTAMP_RESERVED_RANGE_SYSTEM = android.app.ApplicationStartInfo.START_TIMESTAMP_RESERVED_RANGE_SYSTEM;
    public static final int START_TIMESTAMP_SURFACEFLINGER_COMPOSITION_COMPLETE = android.app.ApplicationStartInfo.START_TIMESTAMP_SURFACEFLINGER_COMPOSITION_COMPLETE;
    public static final int START_TYPE_COLD = android.app.ApplicationStartInfo.START_TYPE_COLD;
    public static final int START_TYPE_HOT = android.app.ApplicationStartInfo.START_TYPE_HOT;
    public static final int START_TYPE_UNSET = android.app.ApplicationStartInfo.START_TYPE_UNSET;
    public static final int START_TYPE_WARM = android.app.ApplicationStartInfo.START_TYPE_WARM;

}
