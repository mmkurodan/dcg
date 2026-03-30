// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class UsageStatsManager {
    private final android.app.usage.UsageStatsManager real;

    public UsageStatsManager(android.app.usage.UsageStatsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.UsageStatsManager wrap(android.app.usage.UsageStatsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.UsageStatsManager(real);
    }

    public android.app.usage.UsageStatsManager unwrap() {
        return real;
    }

    public int getAppStandbyBucket() {
        return real.getAppStandbyBucket();
    }

    public boolean isAppInactive(java.lang.String arg0) {
        return real.isAppInactive(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.usage.UsageEvents queryEvents(com.micklab.dcg.wrapper.android.app.usage.UsageEventsQuery arg0) {
        return com.micklab.dcg.wrapper.android.app.usage.UsageEvents.wrap(real.queryEvents(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.usage.UsageEvents queryEvents(long arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.app.usage.UsageEvents.wrap(real.queryEvents(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.usage.UsageEvents queryEventsForSelf(long arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.app.usage.UsageEvents.wrap(real.queryEventsForSelf(arg0, arg1));
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
