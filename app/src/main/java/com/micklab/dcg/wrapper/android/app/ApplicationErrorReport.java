// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ApplicationErrorReport {
    private final android.app.ApplicationErrorReport real;

    public ApplicationErrorReport(android.app.ApplicationErrorReport real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport wrap(android.app.ApplicationErrorReport real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport(real);
    }

    public android.app.ApplicationErrorReport unwrap() {
        return real;
    }

    public ApplicationErrorReport() {
        this(new android.app.ApplicationErrorReport());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName getErrorReportReceiver(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.app.ApplicationErrorReport.getErrorReportReceiver(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_ANR = android.app.ApplicationErrorReport.TYPE_ANR;
    public static final int TYPE_BATTERY = android.app.ApplicationErrorReport.TYPE_BATTERY;
    public static final int TYPE_CRASH = android.app.ApplicationErrorReport.TYPE_CRASH;
    public static final int TYPE_NONE = android.app.ApplicationErrorReport.TYPE_NONE;
    public static final int TYPE_RUNNING_SERVICE = android.app.ApplicationErrorReport.TYPE_RUNNING_SERVICE;

    public static final class AnrInfo {
        private final android.app.ApplicationErrorReport.AnrInfo real;

        public AnrInfo(android.app.ApplicationErrorReport.AnrInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.AnrInfo wrap(android.app.ApplicationErrorReport.AnrInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.AnrInfo(real);
        }

        public android.app.ApplicationErrorReport.AnrInfo unwrap() {
            return real;
        }

        public AnrInfo() {
            this(new android.app.ApplicationErrorReport.AnrInfo());
        }

        public AnrInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.AnrInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class BatteryInfo {
        private final android.app.ApplicationErrorReport.BatteryInfo real;

        public BatteryInfo(android.app.ApplicationErrorReport.BatteryInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.BatteryInfo wrap(android.app.ApplicationErrorReport.BatteryInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.BatteryInfo(real);
        }

        public android.app.ApplicationErrorReport.BatteryInfo unwrap() {
            return real;
        }

        public BatteryInfo() {
            this(new android.app.ApplicationErrorReport.BatteryInfo());
        }

        public BatteryInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.BatteryInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class CrashInfo {
        private final android.app.ApplicationErrorReport.CrashInfo real;

        public CrashInfo(android.app.ApplicationErrorReport.CrashInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.CrashInfo wrap(android.app.ApplicationErrorReport.CrashInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.CrashInfo(real);
        }

        public android.app.ApplicationErrorReport.CrashInfo unwrap() {
            return real;
        }

        public CrashInfo() {
            this(new android.app.ApplicationErrorReport.CrashInfo());
        }

        public CrashInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.CrashInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public CrashInfo(java.lang.Throwable arg0) {
            this(new android.app.ApplicationErrorReport.CrashInfo(arg0));
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class RunningServiceInfo {
        private final android.app.ApplicationErrorReport.RunningServiceInfo real;

        public RunningServiceInfo(android.app.ApplicationErrorReport.RunningServiceInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.RunningServiceInfo wrap(android.app.ApplicationErrorReport.RunningServiceInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.RunningServiceInfo(real);
        }

        public android.app.ApplicationErrorReport.RunningServiceInfo unwrap() {
            return real;
        }

        public RunningServiceInfo() {
            this(new android.app.ApplicationErrorReport.RunningServiceInfo());
        }

        public RunningServiceInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.RunningServiceInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
