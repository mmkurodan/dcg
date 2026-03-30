// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActivityManager {
    private final android.app.ActivityManager real;

    public ActivityManager(android.app.ActivityManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityManager wrap(android.app.ActivityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager(real);
    }

    public android.app.ActivityManager unwrap() {
        return real;
    }

    public int addAppTask(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap arg3) {
        return real.addAppTask(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void addStartInfoTimestamp(int arg0, long arg1) {
        real.addStartInfoTimestamp(arg0, arg1);
    }

    public void appNotResponding(java.lang.String arg0) {
        real.appNotResponding(arg0);
    }

    public boolean clearApplicationUserData() {
        return real.clearApplicationUserData();
    }

    public void clearWatchHeapLimit() {
        real.clearWatchHeapLimit();
    }

    public void dumpPackageState(java.io.FileDescriptor arg0, java.lang.String arg1) {
        real.dumpPackageState(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.util.Size getAppTaskThumbnailSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getAppTaskThumbnailSize());
    }

    public com.micklab.dcg.wrapper.android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ConfigurationInfo.wrap(real.getDeviceConfigurationInfo());
    }

    public int getLargeMemoryClass() {
        return real.getLargeMemoryClass();
    }

    public int getLauncherLargeIconDensity() {
        return real.getLauncherLargeIconDensity();
    }

    public int getLauncherLargeIconSize() {
        return real.getLauncherLargeIconSize();
    }

    public int getLockTaskModeState() {
        return real.getLockTaskModeState();
    }

    public int getMemoryClass() {
        return real.getMemoryClass();
    }

    public void getMemoryInfo(com.micklab.dcg.wrapper.android.app.ActivityManager.MemoryInfo arg0) {
        real.getMemoryInfo(arg0 == null ? null : arg0.unwrap());
    }

    public static void getMyMemoryState(com.micklab.dcg.wrapper.android.app.ActivityManager.RunningAppProcessInfo arg0) {
        android.app.ActivityManager.getMyMemoryState(arg0 == null ? null : arg0.unwrap());
    }

    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] arg0) {
        return real.getProcessMemoryInfo(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getRunningServiceControlPanel(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getRunningServiceControlPanel(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean isActivityStartAllowedOnDisplay(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        return real.isActivityStartAllowedOnDisplay(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean isBackgroundRestricted() {
        return real.isBackgroundRestricted();
    }

    public boolean isInLockTaskMode() {
        return real.isInLockTaskMode();
    }

    public static boolean isLowMemoryKillReportSupported() {
        return android.app.ActivityManager.isLowMemoryKillReportSupported();
    }

    public boolean isLowRamDevice() {
        return real.isLowRamDevice();
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
        real.killBackgroundProcesses(arg0);
    }

    public void moveTaskToFront(int arg0, int arg1) {
        real.moveTaskToFront(arg0, arg1);
    }

    public void moveTaskToFront(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.moveTaskToFront(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void restartPackage(java.lang.String arg0) {
        real.restartPackage(arg0);
    }

    public void setProcessStateSummary(byte[] arg0) {
        real.setProcessStateSummary(arg0);
    }

    public static void setVrThread(int arg0) {
        android.app.ActivityManager.setVrThread(arg0);
    }

    public void setWatchHeapLimit(long arg0) {
        real.setWatchHeapLimit(arg0);
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
        private final android.app.ActivityManager.AppTask real;

        public AppTask(android.app.ActivityManager.AppTask real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.AppTask wrap(android.app.ActivityManager.AppTask real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.AppTask(real);
        }

        public android.app.ActivityManager.AppTask unwrap() {
            return real;
        }

        public void finishAndRemoveTask() {
            real.finishAndRemoveTask();
        }

        public com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo getTaskInfo() {
            return com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo.wrap(real.getTaskInfo());
        }

        public void moveToFront() {
            real.moveToFront();
        }

        public void setExcludeFromRecents(boolean arg0) {
            real.setExcludeFromRecents(arg0);
        }

        public void startActivity(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.startActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class MemoryInfo {
        private final android.app.ActivityManager.MemoryInfo real;

        public MemoryInfo(android.app.ActivityManager.MemoryInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.MemoryInfo wrap(android.app.ActivityManager.MemoryInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.MemoryInfo(real);
        }

        public android.app.ActivityManager.MemoryInfo unwrap() {
            return real;
        }

        public MemoryInfo() {
            this(new android.app.ActivityManager.MemoryInfo());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class ProcessErrorStateInfo {
        private final android.app.ActivityManager.ProcessErrorStateInfo real;

        public ProcessErrorStateInfo(android.app.ActivityManager.ProcessErrorStateInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.ProcessErrorStateInfo wrap(android.app.ActivityManager.ProcessErrorStateInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.ProcessErrorStateInfo(real);
        }

        public android.app.ActivityManager.ProcessErrorStateInfo unwrap() {
            return real;
        }

        public ProcessErrorStateInfo() {
            this(new android.app.ActivityManager.ProcessErrorStateInfo());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int CRASHED = android.app.ActivityManager.ProcessErrorStateInfo.CRASHED;
        public static final int NOT_RESPONDING = android.app.ActivityManager.ProcessErrorStateInfo.NOT_RESPONDING;
        public static final int NO_ERROR = android.app.ActivityManager.ProcessErrorStateInfo.NO_ERROR;

    }
    public static final class RecentTaskInfo {
        private final android.app.ActivityManager.RecentTaskInfo real;

        public RecentTaskInfo(android.app.ActivityManager.RecentTaskInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo wrap(android.app.ActivityManager.RecentTaskInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RecentTaskInfo(real);
        }

        public android.app.ActivityManager.RecentTaskInfo unwrap() {
            return real;
        }

        public RecentTaskInfo() {
            this(new android.app.ActivityManager.RecentTaskInfo());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class RunningAppProcessInfo {
        private final android.app.ActivityManager.RunningAppProcessInfo real;

        public RunningAppProcessInfo(android.app.ActivityManager.RunningAppProcessInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RunningAppProcessInfo wrap(android.app.ActivityManager.RunningAppProcessInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RunningAppProcessInfo(real);
        }

        public android.app.ActivityManager.RunningAppProcessInfo unwrap() {
            return real;
        }

        public RunningAppProcessInfo() {
            this(new android.app.ActivityManager.RunningAppProcessInfo());
        }

        public RunningAppProcessInfo(java.lang.String arg0, int arg1, java.lang.String[] arg2) {
            this(new android.app.ActivityManager.RunningAppProcessInfo(arg0, arg1, arg2));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.app.ActivityManager.RunningServiceInfo real;

        public RunningServiceInfo(android.app.ActivityManager.RunningServiceInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RunningServiceInfo wrap(android.app.ActivityManager.RunningServiceInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RunningServiceInfo(real);
        }

        public android.app.ActivityManager.RunningServiceInfo unwrap() {
            return real;
        }

        public RunningServiceInfo() {
            this(new android.app.ActivityManager.RunningServiceInfo());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int FLAG_FOREGROUND = android.app.ActivityManager.RunningServiceInfo.FLAG_FOREGROUND;
        public static final int FLAG_PERSISTENT_PROCESS = android.app.ActivityManager.RunningServiceInfo.FLAG_PERSISTENT_PROCESS;
        public static final int FLAG_STARTED = android.app.ActivityManager.RunningServiceInfo.FLAG_STARTED;
        public static final int FLAG_SYSTEM_PROCESS = android.app.ActivityManager.RunningServiceInfo.FLAG_SYSTEM_PROCESS;

    }
    public static final class RunningTaskInfo {
        private final android.app.ActivityManager.RunningTaskInfo real;

        public RunningTaskInfo(android.app.ActivityManager.RunningTaskInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.RunningTaskInfo wrap(android.app.ActivityManager.RunningTaskInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.RunningTaskInfo(real);
        }

        public android.app.ActivityManager.RunningTaskInfo unwrap() {
            return real;
        }

        public RunningTaskInfo() {
            this(new android.app.ActivityManager.RunningTaskInfo());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class TaskDescription {
        private final android.app.ActivityManager.TaskDescription real;

        public TaskDescription(android.app.ActivityManager.TaskDescription real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription wrap(android.app.ActivityManager.TaskDescription real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription(real);
        }

        public android.app.ActivityManager.TaskDescription unwrap() {
            return real;
        }

        public TaskDescription() {
            this(new android.app.ActivityManager.TaskDescription());
        }

        public TaskDescription(com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription arg0) {
            this(new android.app.ActivityManager.TaskDescription(arg0 == null ? null : arg0.unwrap()));
        }

        public TaskDescription(java.lang.String arg0) {
            this(new android.app.ActivityManager.TaskDescription(arg0));
        }

        public TaskDescription(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public TaskDescription(java.lang.String arg0, int arg1) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1));
        }

        public TaskDescription(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, int arg2) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public TaskDescription(java.lang.String arg0, int arg1, int arg2) {
            this(new android.app.ActivityManager.TaskDescription(arg0, arg1, arg2));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getBackgroundColor() {
            return real.getBackgroundColor();
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getIcon() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getIcon());
        }

        public java.lang.String getLabel() {
            return real.getLabel();
        }

        public int getNavigationBarColor() {
            return real.getNavigationBarColor();
        }

        public int getPrimaryColor() {
            return real.getPrimaryColor();
        }

        public int getStatusBarColor() {
            return real.getStatusBarColor();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.app.ActivityManager.TaskDescription.Builder real;

            public Builder(android.app.ActivityManager.TaskDescription.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder wrap(android.app.ActivityManager.TaskDescription.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder(real);
            }

            public android.app.ActivityManager.TaskDescription.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.app.ActivityManager.TaskDescription.Builder());
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription build() {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setBackgroundColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(real.setBackgroundColor(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setIcon(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(real.setIcon(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setLabel(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(real.setLabel(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setNavigationBarColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(real.setNavigationBarColor(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setPrimaryColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(real.setPrimaryColor(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder setStatusBarColor(int arg0) {
                return com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription.Builder.wrap(real.setStatusBarColor(arg0));
            }

        }
    }
}
