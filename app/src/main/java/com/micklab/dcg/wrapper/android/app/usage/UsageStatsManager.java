// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageStatsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsageStatsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageStatsManager wrap(android.app.usage.UsageStatsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageStatsManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.UsageStatsManager getReal() {
        return (android.app.usage.UsageStatsManager) real;
    }

    public android.app.usage.UsageStatsManager unwrap() {
        return getReal();
    }

    public int getAppStandbyBucket() {
        return ((android.app.usage.UsageStatsManager) real).getAppStandbyBucket();
    }

    public boolean isAppInactive(java.lang.String arg0) {
        return ((android.app.usage.UsageStatsManager) real).isAppInactive(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.usage.UsageEvents queryEvents(com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery arg0) {
        return com.micklab.dcg.wrapper.android.app.usage.UsageEvents.wrap(((android.app.usage.UsageStatsManager) real).queryEvents(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.usage.UsageEvents queryEvents(long arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.app.usage.UsageEvents.wrap(((android.app.usage.UsageStatsManager) real).queryEvents(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.usage.UsageEvents queryEventsForSelf(long arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.app.usage.UsageEvents.wrap(((android.app.usage.UsageStatsManager) real).queryEventsForSelf(arg0, arg1));
    }

    public static final java.lang.String EXTRA_EVENT_ACTION = android.app.usage.UsageStatsManager.EXTRA_EVENT_ACTION;
    public static final java.lang.String EXTRA_EVENT_CATEGORY = android.app.usage.UsageStatsManager.EXTRA_EVENT_CATEGORY;
    public static final int INTERVAL_BEST = android.app.usage.UsageStatsManager.INTERVAL_BEST;
    public static final int INTERVAL_DAILY = android.app.usage.UsageStatsManager.INTERVAL_DAILY;
    public static final int INTERVAL_MONTHLY = android.app.usage.UsageStatsManager.INTERVAL_MONTHLY;
    public static final int INTERVAL_WEEKLY = android.app.usage.UsageStatsManager.INTERVAL_WEEKLY;
    public static final int INTERVAL_YEARLY = android.app.usage.UsageStatsManager.INTERVAL_YEARLY;
    public static final int STANDBY_BUCKET_ACTIVE = android.app.usage.UsageStatsManager.STANDBY_BUCKET_ACTIVE;
    public static final int STANDBY_BUCKET_FREQUENT = android.app.usage.UsageStatsManager.STANDBY_BUCKET_FREQUENT;
    public static final int STANDBY_BUCKET_RARE = android.app.usage.UsageStatsManager.STANDBY_BUCKET_RARE;
    public static final int STANDBY_BUCKET_RESTRICTED = android.app.usage.UsageStatsManager.STANDBY_BUCKET_RESTRICTED;
    public static final int STANDBY_BUCKET_WORKING_SET = android.app.usage.UsageStatsManager.STANDBY_BUCKET_WORKING_SET;

}
