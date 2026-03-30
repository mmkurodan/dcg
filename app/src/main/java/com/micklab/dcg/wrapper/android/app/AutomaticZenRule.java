// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AutomaticZenRule {
    private final android.app.AutomaticZenRule real;

    public AutomaticZenRule(android.app.AutomaticZenRule real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AutomaticZenRule wrap(android.app.AutomaticZenRule real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AutomaticZenRule(real);
    }

    public android.app.AutomaticZenRule unwrap() {
        return real;
    }

    public AutomaticZenRule(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.app.AutomaticZenRule(arg0 == null ? null : arg0.unwrap()));
    }

    public AutomaticZenRule(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, int arg3, boolean arg4) {
        this(new android.app.AutomaticZenRule(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4));
    }

    public AutomaticZenRule(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.content.ComponentName arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, com.micklab.dcg.wrapper.android.service.notification.ZenPolicy arg4, int arg5, boolean arg6) {
        this(new android.app.AutomaticZenRule(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getConditionId() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getConditionId());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getConfigurationActivity() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getConfigurationActivity());
    }

    public long getCreationTime() {
        return real.getCreationTime();
    }

    public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects getDeviceEffects() {
        return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.wrap(real.getDeviceEffects());
    }

    public int getIconResId() {
        return real.getIconResId();
    }

    public int getInterruptionFilter() {
        return real.getInterruptionFilter();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getOwner() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getOwner());
    }

    public java.lang.String getTriggerDescription() {
        return real.getTriggerDescription();
    }

    public int getType() {
        return real.getType();
    }

    public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy getZenPolicy() {
        return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.wrap(real.getZenPolicy());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isManualInvocationAllowed() {
        return real.isManualInvocationAllowed();
    }

    public void setConditionId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.setConditionId(arg0 == null ? null : arg0.unwrap());
    }

    public void setConfigurationActivity(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.setConfigurationActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void setDeviceEffects(com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects arg0) {
        real.setDeviceEffects(arg0 == null ? null : arg0.unwrap());
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setInterruptionFilter(int arg0) {
        real.setInterruptionFilter(arg0);
    }

    public void setName(java.lang.String arg0) {
        real.setName(arg0);
    }

    public void setZenPolicy(com.micklab.dcg.wrapper.android.service.notification.ZenPolicy arg0) {
        real.setZenPolicy(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_BEDTIME = android.app.AutomaticZenRule.TYPE_BEDTIME;
    public static final int TYPE_DRIVING = android.app.AutomaticZenRule.TYPE_DRIVING;
    public static final int TYPE_IMMERSIVE = android.app.AutomaticZenRule.TYPE_IMMERSIVE;
    public static final int TYPE_MANAGED = android.app.AutomaticZenRule.TYPE_MANAGED;
    public static final int TYPE_OTHER = android.app.AutomaticZenRule.TYPE_OTHER;
    public static final int TYPE_SCHEDULE_CALENDAR = android.app.AutomaticZenRule.TYPE_SCHEDULE_CALENDAR;
    public static final int TYPE_SCHEDULE_TIME = android.app.AutomaticZenRule.TYPE_SCHEDULE_TIME;
    public static final int TYPE_THEATER = android.app.AutomaticZenRule.TYPE_THEATER;
    public static final int TYPE_UNKNOWN = android.app.AutomaticZenRule.TYPE_UNKNOWN;

    public static final class Builder {
        private final android.app.AutomaticZenRule.Builder real;

        public Builder(android.app.AutomaticZenRule.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder wrap(android.app.AutomaticZenRule.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder(real);
        }

        public android.app.AutomaticZenRule.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.app.AutomaticZenRule arg0) {
            this(new android.app.AutomaticZenRule.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            this(new android.app.AutomaticZenRule.Builder(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule build() {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setConditionId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setConditionId(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setConfigurationActivity(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setConfigurationActivity(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setDeviceEffects(com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setDeviceEffects(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setIconResId(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setIconResId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setInterruptionFilter(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setInterruptionFilter(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setManualInvocationAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setManualInvocationAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setOwner(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setOwner(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setTriggerDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setTriggerDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setZenPolicy(com.micklab.dcg.wrapper.android.service.notification.ZenPolicy arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(real.setZenPolicy(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
