// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AutomaticZenRule {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutomaticZenRule(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AutomaticZenRule wrap(android.app.AutomaticZenRule real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AutomaticZenRule(real, (__DcgwBridgeToken) null);
    }

    public android.app.AutomaticZenRule getReal() {
        return (android.app.AutomaticZenRule) real;
    }

    public android.app.AutomaticZenRule unwrap() {
        return getReal();
    }

    public AutomaticZenRule(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.app.AutomaticZenRule(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AutomaticZenRule(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, int arg3, boolean arg4) {
        this(new android.app.AutomaticZenRule(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4), (__DcgwBridgeToken) null);
    }

    public AutomaticZenRule(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.content.ComponentName arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, com.micklab.dcg.wrapper.android.service.notification.ZenPolicy arg4, int arg5, boolean arg6) {
        this(new android.app.AutomaticZenRule(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.AutomaticZenRule) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.AutomaticZenRule) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getConditionId() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.AutomaticZenRule) real).getConditionId());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getConfigurationActivity() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.AutomaticZenRule) real).getConfigurationActivity());
    }

    public long getCreationTime() {
        return ((android.app.AutomaticZenRule) real).getCreationTime();
    }

    public com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects getDeviceEffects() {
        return com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects.wrap(((android.app.AutomaticZenRule) real).getDeviceEffects());
    }

    public int getIconResId() {
        return ((android.app.AutomaticZenRule) real).getIconResId();
    }

    public int getInterruptionFilter() {
        return ((android.app.AutomaticZenRule) real).getInterruptionFilter();
    }

    public java.lang.String getName() {
        return ((android.app.AutomaticZenRule) real).getName();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getOwner() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.AutomaticZenRule) real).getOwner());
    }

    public java.lang.String getTriggerDescription() {
        return ((android.app.AutomaticZenRule) real).getTriggerDescription();
    }

    public int getType() {
        return ((android.app.AutomaticZenRule) real).getType();
    }

    public com.micklab.dcg.wrapper.android.service.notification.ZenPolicy getZenPolicy() {
        return com.micklab.dcg.wrapper.android.service.notification.ZenPolicy.wrap(((android.app.AutomaticZenRule) real).getZenPolicy());
    }

    public int hashCode() {
        return ((android.app.AutomaticZenRule) real).hashCode();
    }

    public boolean isEnabled() {
        return ((android.app.AutomaticZenRule) real).isEnabled();
    }

    public boolean isManualInvocationAllowed() {
        return ((android.app.AutomaticZenRule) real).isManualInvocationAllowed();
    }

    public void setConditionId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.app.AutomaticZenRule) real).setConditionId(arg0 == null ? null : arg0.getReal());
    }

    public void setConfigurationActivity(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.app.AutomaticZenRule) real).setConfigurationActivity(arg0 == null ? null : arg0.getReal());
    }

    public void setDeviceEffects(com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects arg0) {
        ((android.app.AutomaticZenRule) real).setDeviceEffects(arg0 == null ? null : arg0.getReal());
    }

    public void setEnabled(boolean arg0) {
        ((android.app.AutomaticZenRule) real).setEnabled(arg0);
    }

    public void setInterruptionFilter(int arg0) {
        ((android.app.AutomaticZenRule) real).setInterruptionFilter(arg0);
    }

    public void setName(java.lang.String arg0) {
        ((android.app.AutomaticZenRule) real).setName(arg0);
    }

    public void setZenPolicy(com.micklab.dcg.wrapper.android.service.notification.ZenPolicy arg0) {
        ((android.app.AutomaticZenRule) real).setZenPolicy(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.app.AutomaticZenRule) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.AutomaticZenRule) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder wrap(android.app.AutomaticZenRule.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.AutomaticZenRule.Builder getReal() {
            return (android.app.AutomaticZenRule.Builder) real;
        }

        public android.app.AutomaticZenRule.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.app.AutomaticZenRule arg0) {
            this(new android.app.AutomaticZenRule.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            this(new android.app.AutomaticZenRule.Builder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule build() {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.wrap(((android.app.AutomaticZenRule.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setConditionId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setConditionId(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setConfigurationActivity(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setConfigurationActivity(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setDeviceEffects(com.micklab.dcg.wrapper.android.service.notification.ZenDeviceEffects arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setDeviceEffects(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setIconResId(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setIconResId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setInterruptionFilter(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setInterruptionFilter(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setManualInvocationAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setManualInvocationAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setOwner(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setOwner(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setTriggerDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setTriggerDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setType(int arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder setZenPolicy(com.micklab.dcg.wrapper.android.service.notification.ZenPolicy arg0) {
            return com.micklab.dcg.wrapper.android.app.AutomaticZenRule.Builder.wrap(((android.app.AutomaticZenRule.Builder) real).setZenPolicy(arg0 == null ? null : arg0.getReal()));
        }

    }
}
