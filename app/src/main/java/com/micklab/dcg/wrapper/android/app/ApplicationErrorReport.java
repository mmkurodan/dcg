// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ApplicationErrorReport {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ApplicationErrorReport(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport wrap(android.app.ApplicationErrorReport real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport(real, (__DcgwBridgeToken) null);
    }

    public android.app.ApplicationErrorReport getReal() {
        return (android.app.ApplicationErrorReport) real;
    }

    public android.app.ApplicationErrorReport unwrap() {
        return getReal();
    }

    public ApplicationErrorReport() {
        this(new android.app.ApplicationErrorReport(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.ApplicationErrorReport) real).describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        ((android.app.ApplicationErrorReport) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName getErrorReportReceiver(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.app.ApplicationErrorReport.getErrorReportReceiver(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.app.ApplicationErrorReport) real).readFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.ApplicationErrorReport) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_ANR = android.app.ApplicationErrorReport.TYPE_ANR;
    public static final int TYPE_BATTERY = android.app.ApplicationErrorReport.TYPE_BATTERY;
    public static final int TYPE_CRASH = android.app.ApplicationErrorReport.TYPE_CRASH;
    public static final int TYPE_NONE = android.app.ApplicationErrorReport.TYPE_NONE;
    public static final int TYPE_RUNNING_SERVICE = android.app.ApplicationErrorReport.TYPE_RUNNING_SERVICE;

    public static final class AnrInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnrInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.AnrInfo wrap(android.app.ApplicationErrorReport.AnrInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.AnrInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ApplicationErrorReport.AnrInfo getReal() {
            return (android.app.ApplicationErrorReport.AnrInfo) real;
        }

        public android.app.ApplicationErrorReport.AnrInfo unwrap() {
            return getReal();
        }

        public AnrInfo() {
            this(new android.app.ApplicationErrorReport.AnrInfo(), (__DcgwBridgeToken) null);
        }

        public AnrInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.AnrInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            ((android.app.ApplicationErrorReport.AnrInfo) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ApplicationErrorReport.AnrInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class BatteryInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BatteryInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.BatteryInfo wrap(android.app.ApplicationErrorReport.BatteryInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.BatteryInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ApplicationErrorReport.BatteryInfo getReal() {
            return (android.app.ApplicationErrorReport.BatteryInfo) real;
        }

        public android.app.ApplicationErrorReport.BatteryInfo unwrap() {
            return getReal();
        }

        public BatteryInfo() {
            this(new android.app.ApplicationErrorReport.BatteryInfo(), (__DcgwBridgeToken) null);
        }

        public BatteryInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.BatteryInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            ((android.app.ApplicationErrorReport.BatteryInfo) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ApplicationErrorReport.BatteryInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class CrashInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CrashInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.CrashInfo wrap(android.app.ApplicationErrorReport.CrashInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.CrashInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ApplicationErrorReport.CrashInfo getReal() {
            return (android.app.ApplicationErrorReport.CrashInfo) real;
        }

        public android.app.ApplicationErrorReport.CrashInfo unwrap() {
            return getReal();
        }

        public CrashInfo() {
            this(new android.app.ApplicationErrorReport.CrashInfo(), (__DcgwBridgeToken) null);
        }

        public CrashInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.CrashInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public CrashInfo(java.lang.Throwable arg0) {
            this(new android.app.ApplicationErrorReport.CrashInfo(arg0), (__DcgwBridgeToken) null);
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            ((android.app.ApplicationErrorReport.CrashInfo) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ApplicationErrorReport.CrashInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class RunningServiceInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RunningServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.RunningServiceInfo wrap(android.app.ApplicationErrorReport.RunningServiceInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.ApplicationErrorReport.RunningServiceInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.ApplicationErrorReport.RunningServiceInfo getReal() {
            return (android.app.ApplicationErrorReport.RunningServiceInfo) real;
        }

        public android.app.ApplicationErrorReport.RunningServiceInfo unwrap() {
            return getReal();
        }

        public RunningServiceInfo() {
            this(new android.app.ApplicationErrorReport.RunningServiceInfo(), (__DcgwBridgeToken) null);
        }

        public RunningServiceInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.app.ApplicationErrorReport.RunningServiceInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
            ((android.app.ApplicationErrorReport.RunningServiceInfo) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.ApplicationErrorReport.RunningServiceInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
