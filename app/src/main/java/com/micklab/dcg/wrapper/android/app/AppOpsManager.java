// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AppOpsManager {
    private final android.app.AppOpsManager real;

    public AppOpsManager(android.app.AppOpsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AppOpsManager wrap(android.app.AppOpsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AppOpsManager(real);
    }

    public android.app.AppOpsManager unwrap() {
        return real;
    }

    public int checkOp(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.checkOp(arg0, arg1, arg2);
    }

    public int checkOpNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.checkOpNoThrow(arg0, arg1, arg2);
    }

    public void checkPackage(int arg0, java.lang.String arg1) {
        real.checkPackage(arg0, arg1);
    }

    public void finishOp(java.lang.String arg0, int arg1, java.lang.String arg2) {
        real.finishOp(arg0, arg1, arg2);
    }

    public void finishOp(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3) {
        real.finishOp(arg0, arg1, arg2, arg3);
    }

    public void finishProxyOp(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3) {
        real.finishProxyOp(arg0, arg1, arg2, arg3);
    }

    public boolean isOpActive(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.isOpActive(arg0, arg1, arg2);
    }

    public int noteOp(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.noteOp(arg0, arg1, arg2);
    }

    public int noteOp(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.noteOp(arg0, arg1, arg2, arg3, arg4);
    }

    public int noteOpNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.noteOpNoThrow(arg0, arg1, arg2);
    }

    public int noteOpNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.noteOpNoThrow(arg0, arg1, arg2, arg3, arg4);
    }

    public int noteProxyOp(java.lang.String arg0, java.lang.String arg1) {
        return real.noteProxyOp(arg0, arg1);
    }

    public int noteProxyOp(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.noteProxyOp(arg0, arg1, arg2, arg3, arg4);
    }

    public int noteProxyOpNoThrow(java.lang.String arg0, java.lang.String arg1) {
        return real.noteProxyOpNoThrow(arg0, arg1);
    }

    public int noteProxyOpNoThrow(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.noteProxyOpNoThrow(arg0, arg1, arg2);
    }

    public int noteProxyOpNoThrow(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.noteProxyOpNoThrow(arg0, arg1, arg2, arg3, arg4);
    }

    public static java.lang.String permissionToOp(java.lang.String arg0) {
        return android.app.AppOpsManager.permissionToOp(arg0);
    }

    public void setOnOpNotedCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpNotedCallback arg1) {
        real.setOnOpNotedCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int startOp(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.startOp(arg0, arg1, arg2);
    }

    public int startOp(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.startOp(arg0, arg1, arg2, arg3, arg4);
    }

    public int startOpNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.startOpNoThrow(arg0, arg1, arg2);
    }

    public int startOpNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.startOpNoThrow(arg0, arg1, arg2, arg3, arg4);
    }

    public int startProxyOp(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.startProxyOp(arg0, arg1, arg2, arg3, arg4);
    }

    public int startProxyOpNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        return real.startProxyOpNoThrow(arg0, arg1, arg2, arg3, arg4);
    }

    public void startWatchingActive(java.lang.String[] arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpActiveChangedListener arg2) {
        real.startWatchingActive(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void startWatchingMode(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpChangedListener arg2) {
        real.startWatchingMode(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void startWatchingMode(java.lang.String arg0, java.lang.String arg1, int arg2, com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpChangedListener arg3) {
        real.startWatchingMode(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void stopWatchingActive(com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpActiveChangedListener arg0) {
        real.stopWatchingActive(arg0 == null ? null : arg0.unwrap());
    }

    public void stopWatchingMode(com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpChangedListener arg0) {
        real.stopWatchingMode(arg0 == null ? null : arg0.unwrap());
    }

    public int unsafeCheckOp(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.unsafeCheckOp(arg0, arg1, arg2);
    }

    public int unsafeCheckOpNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.unsafeCheckOpNoThrow(arg0, arg1, arg2);
    }

    public int unsafeCheckOpRaw(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.unsafeCheckOpRaw(arg0, arg1, arg2);
    }

    public int unsafeCheckOpRawNoThrow(java.lang.String arg0, int arg1, java.lang.String arg2) {
        return real.unsafeCheckOpRawNoThrow(arg0, arg1, arg2);
    }

    public static final int MODE_ALLOWED = android.app.AppOpsManager.MODE_ALLOWED;
    public static final int MODE_DEFAULT = android.app.AppOpsManager.MODE_DEFAULT;
    public static final int MODE_ERRORED = android.app.AppOpsManager.MODE_ERRORED;
    public static final int MODE_FOREGROUND = android.app.AppOpsManager.MODE_FOREGROUND;
    public static final int MODE_IGNORED = android.app.AppOpsManager.MODE_IGNORED;
    public static final java.lang.String OPSTR_ADD_VOICEMAIL = android.app.AppOpsManager.OPSTR_ADD_VOICEMAIL;
    public static final java.lang.String OPSTR_ANSWER_PHONE_CALLS = android.app.AppOpsManager.OPSTR_ANSWER_PHONE_CALLS;
    public static final java.lang.String OPSTR_BODY_SENSORS = android.app.AppOpsManager.OPSTR_BODY_SENSORS;
    public static final java.lang.String OPSTR_CALL_PHONE = android.app.AppOpsManager.OPSTR_CALL_PHONE;
    public static final java.lang.String OPSTR_CAMERA = android.app.AppOpsManager.OPSTR_CAMERA;
    public static final java.lang.String OPSTR_COARSE_LOCATION = android.app.AppOpsManager.OPSTR_COARSE_LOCATION;
    public static final java.lang.String OPSTR_FINE_LOCATION = android.app.AppOpsManager.OPSTR_FINE_LOCATION;
    public static final java.lang.String OPSTR_GET_USAGE_STATS = android.app.AppOpsManager.OPSTR_GET_USAGE_STATS;
    public static final java.lang.String OPSTR_MOCK_LOCATION = android.app.AppOpsManager.OPSTR_MOCK_LOCATION;
    public static final java.lang.String OPSTR_MONITOR_HIGH_POWER_LOCATION = android.app.AppOpsManager.OPSTR_MONITOR_HIGH_POWER_LOCATION;
    public static final java.lang.String OPSTR_MONITOR_LOCATION = android.app.AppOpsManager.OPSTR_MONITOR_LOCATION;
    public static final java.lang.String OPSTR_PICTURE_IN_PICTURE = android.app.AppOpsManager.OPSTR_PICTURE_IN_PICTURE;
    public static final java.lang.String OPSTR_PROCESS_OUTGOING_CALLS = android.app.AppOpsManager.OPSTR_PROCESS_OUTGOING_CALLS;
    public static final java.lang.String OPSTR_READ_CALENDAR = android.app.AppOpsManager.OPSTR_READ_CALENDAR;
    public static final java.lang.String OPSTR_READ_CALL_LOG = android.app.AppOpsManager.OPSTR_READ_CALL_LOG;
    public static final java.lang.String OPSTR_READ_CELL_BROADCASTS = android.app.AppOpsManager.OPSTR_READ_CELL_BROADCASTS;
    public static final java.lang.String OPSTR_READ_CONTACTS = android.app.AppOpsManager.OPSTR_READ_CONTACTS;
    public static final java.lang.String OPSTR_READ_EXTERNAL_STORAGE = android.app.AppOpsManager.OPSTR_READ_EXTERNAL_STORAGE;
    public static final java.lang.String OPSTR_READ_PHONE_NUMBERS = android.app.AppOpsManager.OPSTR_READ_PHONE_NUMBERS;
    public static final java.lang.String OPSTR_READ_PHONE_STATE = android.app.AppOpsManager.OPSTR_READ_PHONE_STATE;
    public static final java.lang.String OPSTR_READ_SMS = android.app.AppOpsManager.OPSTR_READ_SMS;
    public static final java.lang.String OPSTR_RECEIVE_MMS = android.app.AppOpsManager.OPSTR_RECEIVE_MMS;
    public static final java.lang.String OPSTR_RECEIVE_SMS = android.app.AppOpsManager.OPSTR_RECEIVE_SMS;
    public static final java.lang.String OPSTR_RECEIVE_WAP_PUSH = android.app.AppOpsManager.OPSTR_RECEIVE_WAP_PUSH;
    public static final java.lang.String OPSTR_RECORD_AUDIO = android.app.AppOpsManager.OPSTR_RECORD_AUDIO;
    public static final java.lang.String OPSTR_SEND_SMS = android.app.AppOpsManager.OPSTR_SEND_SMS;
    public static final java.lang.String OPSTR_SYSTEM_ALERT_WINDOW = android.app.AppOpsManager.OPSTR_SYSTEM_ALERT_WINDOW;
    public static final java.lang.String OPSTR_USE_FINGERPRINT = android.app.AppOpsManager.OPSTR_USE_FINGERPRINT;
    public static final java.lang.String OPSTR_USE_SIP = android.app.AppOpsManager.OPSTR_USE_SIP;
    public static final java.lang.String OPSTR_WRITE_CALENDAR = android.app.AppOpsManager.OPSTR_WRITE_CALENDAR;
    public static final java.lang.String OPSTR_WRITE_CALL_LOG = android.app.AppOpsManager.OPSTR_WRITE_CALL_LOG;
    public static final java.lang.String OPSTR_WRITE_CONTACTS = android.app.AppOpsManager.OPSTR_WRITE_CONTACTS;
    public static final java.lang.String OPSTR_WRITE_EXTERNAL_STORAGE = android.app.AppOpsManager.OPSTR_WRITE_EXTERNAL_STORAGE;
    public static final java.lang.String OPSTR_WRITE_SETTINGS = android.app.AppOpsManager.OPSTR_WRITE_SETTINGS;
    public static final int WATCH_FOREGROUND_CHANGES = android.app.AppOpsManager.WATCH_FOREGROUND_CHANGES;

    public static final class OnOpActiveChangedListener {
        private final android.app.AppOpsManager.OnOpActiveChangedListener real;

        public OnOpActiveChangedListener(android.app.AppOpsManager.OnOpActiveChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpActiveChangedListener wrap(android.app.AppOpsManager.OnOpActiveChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpActiveChangedListener(real);
        }

        public android.app.AppOpsManager.OnOpActiveChangedListener unwrap() {
            return real;
        }

        public void onOpActiveChanged(java.lang.String arg0, int arg1, java.lang.String arg2, boolean arg3) {
            real.onOpActiveChanged(arg0, arg1, arg2, arg3);
        }

        public void onOpActiveChanged(java.lang.String arg0, int arg1, java.lang.String arg2, java.lang.String arg3, int arg4, boolean arg5, int arg6, int arg7) {
            real.onOpActiveChanged(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }

    }
    public static final class OnOpChangedListener {
        private final android.app.AppOpsManager.OnOpChangedListener real;

        public OnOpChangedListener(android.app.AppOpsManager.OnOpChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpChangedListener wrap(android.app.AppOpsManager.OnOpChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpChangedListener(real);
        }

        public android.app.AppOpsManager.OnOpChangedListener unwrap() {
            return real;
        }

        public void onOpChanged(java.lang.String arg0, java.lang.String arg1) {
            real.onOpChanged(arg0, arg1);
        }

        public void onOpChanged(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3) {
            real.onOpChanged(arg0, arg1, arg2, arg3);
        }

    }
    public static final class OnOpNotedCallback {
        private final android.app.AppOpsManager.OnOpNotedCallback real;

        public OnOpNotedCallback(android.app.AppOpsManager.OnOpNotedCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpNotedCallback wrap(android.app.AppOpsManager.OnOpNotedCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AppOpsManager.OnOpNotedCallback(real);
        }

        public android.app.AppOpsManager.OnOpNotedCallback unwrap() {
            return real;
        }

        public void onAsyncNoted(com.micklab.dcg.wrapper.android.app.AsyncNotedAppOp arg0) {
            real.onAsyncNoted(arg0 == null ? null : arg0.unwrap());
        }

        public void onNoted(com.micklab.dcg.wrapper.android.app.SyncNotedAppOp arg0) {
            real.onNoted(arg0 == null ? null : arg0.unwrap());
        }

        public void onSelfNoted(com.micklab.dcg.wrapper.android.app.SyncNotedAppOp arg0) {
            real.onSelfNoted(arg0 == null ? null : arg0.unwrap());
        }

    }
}
