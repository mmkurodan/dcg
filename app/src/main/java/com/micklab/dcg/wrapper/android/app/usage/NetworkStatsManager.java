// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class NetworkStatsManager {
    private final android.app.usage.NetworkStatsManager real;

    public NetworkStatsManager(android.app.usage.NetworkStatsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.NetworkStatsManager wrap(android.app.usage.NetworkStatsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.NetworkStatsManager(real);
    }

    public android.app.usage.NetworkStatsManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.usage.NetworkStats queryDetails(int arg0, java.lang.String arg1, long arg2, long arg3) throws android.os.RemoteException, java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.usage.NetworkStats.wrap(real.queryDetails(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.app.usage.NetworkStats queryDetailsForUid(int arg0, java.lang.String arg1, long arg2, long arg3, int arg4) throws java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.usage.NetworkStats.wrap(real.queryDetailsForUid(arg0, arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.app.usage.NetworkStats queryDetailsForUidTag(int arg0, java.lang.String arg1, long arg2, long arg3, int arg4, int arg5) throws java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.usage.NetworkStats.wrap(real.queryDetailsForUidTag(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public com.micklab.dcg.wrapper.android.app.usage.NetworkStats queryDetailsForUidTagState(int arg0, java.lang.String arg1, long arg2, long arg3, int arg4, int arg5, int arg6) throws java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.usage.NetworkStats.wrap(real.queryDetailsForUidTagState(arg0, arg1, arg2, arg3, arg4, arg5, arg6));
    }

    public com.micklab.dcg.wrapper.android.app.usage.NetworkStats querySummary(int arg0, java.lang.String arg1, long arg2, long arg3) throws android.os.RemoteException, java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.usage.NetworkStats.wrap(real.querySummary(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket querySummaryForDevice(int arg0, java.lang.String arg1, long arg2, long arg3) throws android.os.RemoteException, java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket.wrap(real.querySummaryForDevice(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket querySummaryForUser(int arg0, java.lang.String arg1, long arg2, long arg3) throws android.os.RemoteException, java.lang.SecurityException {
        return com.micklab.dcg.wrapper.android.app.usage.NetworkStats.Bucket.wrap(real.querySummaryForUser(arg0, arg1, arg2, arg3));
    }

    public void registerUsageCallback(int arg0, java.lang.String arg1, long arg2, com.micklab.dcg.wrapper.android.app.usage.NetworkStatsManager.UsageCallback arg3) {
        real.registerUsageCallback(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void registerUsageCallback(int arg0, java.lang.String arg1, long arg2, com.micklab.dcg.wrapper.android.app.usage.NetworkStatsManager.UsageCallback arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        real.registerUsageCallback(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public void unregisterUsageCallback(com.micklab.dcg.wrapper.android.app.usage.NetworkStatsManager.UsageCallback arg0) {
        real.unregisterUsageCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class UsageCallback {
        private final android.app.usage.NetworkStatsManager.UsageCallback real;

        public UsageCallback(android.app.usage.NetworkStatsManager.UsageCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.usage.NetworkStatsManager.UsageCallback wrap(android.app.usage.NetworkStatsManager.UsageCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.NetworkStatsManager.UsageCallback(real);
        }

        public android.app.usage.NetworkStatsManager.UsageCallback unwrap() {
            return real;
        }

        public void onThresholdReached(int arg0, java.lang.String arg1) {
            real.onThresholdReached(arg0, arg1);
        }

    }
}
