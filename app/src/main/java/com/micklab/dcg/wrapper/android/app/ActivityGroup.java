// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActivityGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActivityGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityGroup wrap(android.app.ActivityGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityGroup(real, (__DcgwBridgeToken) null);
    }

    public android.app.ActivityGroup getReal() {
        return (android.app.ActivityGroup) real;
    }

    public android.app.ActivityGroup unwrap() {
        return getReal();
    }

    public ActivityGroup() {
        this(new android.app.ActivityGroup(), (__DcgwBridgeToken) null);
    }

    public ActivityGroup(boolean arg0) {
        this(new android.app.ActivityGroup(arg0), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.app.Activity getCurrentActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.ActivityGroup) real).getCurrentActivity());
    }

    public com.micklab.dcg.wrapper.android.app.LocalActivityManager getLocalActivityManager() {
        return com.micklab.dcg.wrapper.android.app.LocalActivityManager.wrap(((android.app.ActivityGroup) real).getLocalActivityManager());
    }

}
