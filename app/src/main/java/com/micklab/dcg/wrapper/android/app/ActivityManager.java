// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActivityManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActivityManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityManager wrap(android.app.ActivityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.ActivityManager getReal() {
        return (android.app.ActivityManager) real;
    }

    public android.app.ActivityManager unwrap() {
        return getReal();
    }

    public int addAppTask(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap arg3) {
        return ((android.app.ActivityManager) real).addAppTask(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void addStartInfoTimestamp(int arg0, long arg1) {
        ((android.app.ActivityManager) real).addStartInfoTimestamp(arg0, arg1);
    }

    public void appNotResponding(java.lang.String arg0) {
        ((android.app.ActivityManager) real).appNotResponding(arg0);
    }

    public boolean clearApplicationUserData() {
        return ((android.app.ActivityManager) real).clearApplicationUserData();
    }

    public void clearWatchHeapLimit() {
        ((android.app.ActivityManager) real).clearWatchHeapLimit();
    }

    public void dumpPackageState(java.io.FileDescriptor arg0, java.lang.String arg1) {
        ((android.app.ActivityManager) real).dumpPackageState(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.util.Size getAppTaskThumbnailSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(((android.app.ActivityManager) real).getAppTaskThumbnailSize());
    }

    public com.micklab.dcg.wrapper.android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ConfigurationInfo.wrap(((android.app.ActivityManager) real).getDeviceConfigurationInfo());
    }

    public int getLargeMemoryClass() {
        return ((android.app.ActivityManager) real).getLargeMemoryClass();
    }

    public int getLauncherLargeIconDensity() {
        return ((android.app.ActivityManager) real).getLauncherLargeIconDensity();
    }

    public int getLauncherLargeIconSize() {
        return ((android.app.ActivityManager) real).getLauncherLargeIconSize();
    }

    public int getLockTaskModeState() {
        return ((android.app.ActivityManager) real).getLockTaskModeState();
    }

    public int getMemoryClass() {
        return ((android.app.ActivityManager) real).getMemoryClass();
    }

    public void getMemoryInfo(com.micklab.dcg.wrapper.android.app.ActivityManager.MemoryInfo arg0) {
        ((android.app.ActivityManager) real).getMemoryInfo(arg0 == null ? null : arg0.getReal());
    }

    public static void getMyMemoryState(com.micklab.dcg.wrapper.android.app.ActivityManager.RunningAppProcessInfo arg0) {
        android.app.ActivityManager.getMyMemoryState(arg0 == null ? null : arg0.getReal());
    }

    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] arg0) {
        return ((android.app.ActivityManager) real).getProcessMemoryInfo(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getRunningServiceControlPanel(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.ActivityManager) real).getRunningServiceControlPanel(arg0 == null ? null : arg0.getReal()));
    }

    public boolean isActivityStartAllowedOnDisplay(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        return ((android.app.ActivityManager) real).isActivityStartAllowedOnDisplay(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean isBackgroundRestricted() {
        return ((android.app.ActivityManager) real).isBackgroundRestricted();
    }

    public boolean isInLockTaskMode() {
        return ((android.app.ActivityManager) real).isInLockTaskMode();
    }

    public static boolean isLowMemoryKillReportSupported() {
        return android.app.ActivityManager.isLowMemoryKillReportSupported();
    }

    public boolean isLowRamDevice() {
        return ((android.app.ActivityManager) real).isLowRamDevice();
    }

    public static boolean isRunningInTestHarness() {
        return android.app.ActivityManager.isRunningInTestHarness();
    }

    public static boolean isRunningInUserTestHarness() {
        return android.app.ActivityManager.isRunningInUserTestHarness();
    }

    public static boolean isUserAMonkey() {
        return android.app.ActivityManager.isUserAMonkey();
    }

    public void killBackgroundProcesses(java.lang.String arg0) {
        ((android.app.ActivityManager) real).killBackgroundProcesses(arg0);
    }

    public void moveTaskToFront(int arg0, int arg1) {
        ((android.app.ActivityManager) real).moveTaskToFront(arg0, arg1);
    }

    public void moveTaskToFront(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.app.ActivityManager) real).moveTaskToFront(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void restartPackage(java.lang.String arg0) {
        ((android.app.ActivityManager) real).restartPackage(arg0);
    }

    public void setProcessStateSummary(byte[] arg0) {
        ((android.app.ActivityManager) real).setProcessStateSummary(arg0);
    }

    public static void setVrThread(int arg0) {
        android.app.ActivityManager.setVrThread(arg0);
    }

    public void setWatchHeapLimit(long arg0) {
        ((android.app.ActivityManager) real).setWatchHeapLimit(arg0);
    }

    public static final java.lang.String ACTION_REPORT_HEAP_LIMIT = android.app.ActivityManager.ACTION_REPORT_HEAP_LIMIT;
    public static final int LOCK_TASK_MODE_LOCKED = android.app.ActivityManager.LOCK_TASK_MODE_LOCKED;
    public static final int LOCK_TASK_MODE_NONE = android.app.ActivityManager.LOCK_TASK_MODE_NONE;
    public static final int LOCK_TASK_MODE_PINNED = android.app.ActivityManager.LOCK_TASK_MODE_PINNED;
    public static final java.lang.String META_HOME_ALTERNATE = android.app.ActivityManager.META_HOME_ALTERNATE;
    public static final int MOVE_TASK_NO_USER_ACTION = android.app.ActivityManager.MOVE_TASK_NO_USER_ACTION;
    public static final int MOVE_TASK_WITH_HOME = android.app.ActivityManager.MOVE_TASK_WITH_HOME;
    public static final int RECENT_IGNORE_UNAVAILABLE = android.app.ActivityManager.RECENT_IGNORE_UNAVAILABLE;
    public static final int RECENT_WITH_EXCLUDED = android.app.ActivityManager.RECENT_WITH_EXCLUDED;

    public static final class AppTask {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AppTask(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.AppTask wrap(android.app.ActivityManager.AppTask real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.AppTask(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.AppTask getReal() {
            return (android.app.ActivityManager.AppTask) real;
        }

        public android.app.ActivityManager.AppTask unwrap() {
            return getReal();
        }

        public void finishAndRemoveTask() {
            ((android.app.ActivityManager.AppTask) real).finishAndRemoveTask();
        }

        public com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo getTaskInfo() {
            return com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo.wrap(((android.app.ActivityManager.AppTask) real).getTaskInfo());
        }

        public void moveToFront() {
            ((android.app.ActivityManager.AppTask) real).moveToFront();
        }

        public void setExcludeFromRecents(boolean arg0) {
            ((android.app.ActivityManager.AppTask) real).setExcludeFromRecents(arg0);
        }

        public void startActivity(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.app.ActivityManager.AppTask) real).startActivity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

    }
    public static final class MemoryInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MemoryInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.MemoryInfo wrap(android.app.ActivityManager.MemoryInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.MemoryInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.MemoryInfo getReal() {
            return (android.app.ActivityManager.MemoryInfo) real;
        }

        public android.app.ActivityManager.MemoryInfo unwrap() {
            return getReal();
        }

        public MemoryInfo() {
            this(new android.app.ActivityManager.MemoryInfo(), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.ActivityManager.MemoryInfo) real).describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.app.ActivityManager.MemoryInfo) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ActivityManager.MemoryInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class ProcessErrorStateInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ProcessErrorStateInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.ProcessErrorStateInfo wrap(android.app.ActivityManager.ProcessErrorStateInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.ProcessErrorStateInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.ProcessErrorStateInfo getReal() {
            return (android.app.ActivityManager.ProcessErrorStateInfo) real;
        }

        public android.app.ActivityManager.ProcessErrorStateInfo unwrap() {
            return getReal();
        }

        public ProcessErrorStateInfo() {
            this(new android.app.ActivityManager.ProcessErrorStateInfo(), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.ActivityManager.ProcessErrorStateInfo) real).describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.app.ActivityManager.ProcessErrorStateInfo) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ActivityManager.ProcessErrorStateInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int CRASHED = android.app.ActivityManager.ProcessErrorStateInfo.CRASHED;
        public static final int NOT_RESPONDING = android.app.ActivityManager.ProcessErrorStateInfo.NOT_RESPONDING;
        public static final int NO_ERROR = android.app.ActivityManager.ProcessErrorStateInfo.NO_ERROR;

    }
    public static final class RecentTaskInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RecentTaskInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo wrap(android.app.ActivityManager.RecentTaskInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.RecentTaskInfo getReal() {
            return (android.app.ActivityManager.RecentTaskInfo) real;
        }

        public android.app.ActivityManager.RecentTaskInfo unwrap() {
            return getReal();
        }

        public RecentTaskInfo() {
            this(new android.app.ActivityManager.RecentTaskInfo(), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.ActivityManager.RecentTaskInfo) real).describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.app.ActivityManager.RecentTaskInfo) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ActivityManager.RecentTaskInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class RunningAppProcessInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RunningAppProcessInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RunningAppProcessInfo wrap(android.app.ActivityManager.RunningAppProcessInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RunningAppProcessInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.RunningAppProcessInfo getReal() {
            return (android.app.ActivityManager.RunningAppProcessInfo) real;
        }

        public android.app.ActivityManager.RunningAppProcessInfo unwrap() {
            return getReal();
        }

        public RunningAppProcessInfo() {
            this(new android.app.ActivityManager.RunningAppProcessInfo(), (__DcgwBridgeToken) null);
        }

        public RunningAppProcessInfo(java.lang.String arg0, int arg1, java.lang.String[] arg2) {
            this(new android.app.ActivityManager.RunningAppProcessInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.ActivityManager.RunningAppProcessInfo) real).describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.app.ActivityManager.RunningAppProcessInfo) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ActivityManager.RunningAppProcessInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int IMPORTANCE_BACKGROUND = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_BACKGROUND;
        public static final int IMPORTANCE_CACHED = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_CACHED;
        public static final int IMPORTANCE_CANT_SAVE_STATE = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_CANT_SAVE_STATE;
        public static final int IMPORTANCE_EMPTY = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_EMPTY;
        public static final int IMPORTANCE_FOREGROUND = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND;
        public static final int IMPORTANCE_FOREGROUND_SERVICE = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND_SERVICE;
        public static final int IMPORTANCE_GONE = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_GONE;
        public static final int IMPORTANCE_PERCEPTIBLE = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_PERCEPTIBLE;
        public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_PERCEPTIBLE_PRE_26;
        public static final int IMPORTANCE_SERVICE = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_SERVICE;
        public static final int IMPORTANCE_TOP_SLEEPING = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_TOP_SLEEPING;
        public static final int IMPORTANCE_TOP_SLEEPING_PRE_28 = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_TOP_SLEEPING_PRE_28;
        public static final int IMPORTANCE_VISIBLE = android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE;
        public static final int REASON_PROVIDER_IN_USE = android.app.ActivityManager.RunningAppProcessInfo.REASON_PROVIDER_IN_USE;
        public static final int REASON_SERVICE_IN_USE = android.app.ActivityManager.RunningAppProcessInfo.REASON_SERVICE_IN_USE;
        public static final int REASON_UNKNOWN = android.app.ActivityManager.RunningAppProcessInfo.REASON_UNKNOWN;

    }
    public static final class RunningServiceInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RunningServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RunningServiceInfo wrap(android.app.ActivityManager.RunningServiceInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RunningServiceInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.RunningServiceInfo getReal() {
            return (android.app.ActivityManager.RunningServiceInfo) real;
        }

        public android.app.ActivityManager.RunningServiceInfo unwrap() {
            return getReal();
        }

        public RunningServiceInfo() {
            this(new android.app.ActivityManager.RunningServiceInfo(), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.ActivityManager.RunningServiceInfo) real).describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.app.ActivityManager.RunningServiceInfo) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ActivityManager.RunningServiceInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int FLAG_FOREGROUND = android.app.ActivityManager.RunningServiceInfo.FLAG_FOREGROUND;
        public static final int FLAG_PERSISTENT_PROCESS = android.app.ActivityManager.RunningServiceInfo.FLAG_PERSISTENT_PROCESS;
        public static final int FLAG_STARTED = android.app.ActivityManager.RunningServiceInfo.FLAG_STARTED;
        public static final int FLAG_SYSTEM_PROCESS = android.app.ActivityManager.RunningServiceInfo.FLAG_SYSTEM_PROCESS;

    }
    public static final class RunningTaskInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RunningTaskInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RunningTaskInfo wrap(android.app.ActivityManager.RunningTaskInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RunningTaskInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.RunningTaskInfo getReal() {
            return (android.app.ActivityManager.RunningTaskInfo) real;
        }

        public android.app.ActivityManager.RunningTaskInfo unwrap() {
            return getReal();
        }

        public RunningTaskInfo() {
            this(new android.app.ActivityManager.RunningTaskInfo(), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.ActivityManager.RunningTaskInfo) real).describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.app.ActivityManager.RunningTaskInfo) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ActivityManager.RunningTaskInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class TaskDescription {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TaskDescription(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription wrap(android.app.ActivityManager.TaskDescription real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription(real, (__DcgwBridgeToken) null);
        }

        public android.app.ActivityManager.TaskDescription getReal() {
            return (android.app.ActivityManager.TaskDescription) real;
        }

        public android.app.ActivityManager.TaskDescription unwrap() {
            return getReal();
        }

        public TaskDescription() {
            this(new android.app.ActivityManager.TaskDescription(), (__DcgwBridgeToken) null);
        }

        public TaskDescription(com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription arg0) {
            this(new android.app.ActivityManager.TaskDescription(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public TaskDescription(java.lang.String arg0) {
            this(new android.app.ActivityManager.TaskDescription(arg0), (__DcgwBridgeToken) null);
        }

        public TaskDescription(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public TaskDescription(java.lang.String arg0, int arg1) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public TaskDescription(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, int arg2) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
        }

        public TaskDescription(java.lang.String arg0, int arg1, int arg2) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.app.ActivityManager.TaskDescription) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.app.ActivityManager.TaskDescription) real).equals(arg0);
        }

        public int getBackgroundColor() {
            return ((android.app.ActivityManager.TaskDescription) real).getBackgroundColor();
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.app.ActivityManager.TaskDescription) real).getIcon());
        }

        public java.lang.String getLabel() {
            return ((android.app.ActivityManager.TaskDescription) real).getLabel();
        }

        public int getNavigationBarColor() {
            return ((android.app.ActivityManager.TaskDescription) real).getNavigationBarColor();
        }

        public int getPrimaryColor() {
            return ((android.app.ActivityManager.TaskDescription) real).getPrimaryColor();
        }

        public int getStatusBarColor() {
            return ((android.app.ActivityManager.TaskDescription) real).getStatusBarColor();
        }

        public int hashCode() {
            return ((android.app.ActivityManager.TaskDescription) real).hashCode();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.app.ActivityManager.TaskDescription) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.String toString() {
            return ((android.app.ActivityManager.TaskDescription) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ActivityManager.TaskDescription) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder wrap(android.app.ActivityManager.TaskDescription.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.app.ActivityManager.TaskDescription.Builder getReal() {
                return (android.app.ActivityManager.TaskDescription.Builder) real;
            }

            public android.app.ActivityManager.TaskDescription.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.app.ActivityManager.TaskDescription.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription build() {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.wrap(((android.app.ActivityManager.TaskDescription.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setBackgroundColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(((android.app.ActivityManager.TaskDescription.Builder) real).setBackgroundColor(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setIcon(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(((android.app.ActivityManager.TaskDescription.Builder) real).setIcon(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setLabel(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(((android.app.ActivityManager.TaskDescription.Builder) real).setLabel(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setNavigationBarColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(((android.app.ActivityManager.TaskDescription.Builder) real).setNavigationBarColor(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setPrimaryColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(((android.app.ActivityManager.TaskDescription.Builder) real).setPrimaryColor(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setStatusBarColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(((android.app.ActivityManager.TaskDescription.Builder) real).setStatusBarColor(arg0));
            }

        }
    }
}
