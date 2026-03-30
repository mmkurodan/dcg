// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActivityGroup {
    private final android.app.ActivityGroup real;

    public ActivityGroup(android.app.ActivityGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityGroup wrap(android.app.ActivityGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityGroup(real);
    }

    public android.app.ActivityGroup unwrap() {
        return real;
    }

    public ActivityGroup() {
        this(new android.app.ActivityGroup());
    }

    public ActivityGroup(boolean arg0) {
        this(new android.app.ActivityGroup(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.Activity getCurrentActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getCurrentActivity());
    }

    public com.micklab.dcg.wrapper.android.app.LocalActivityManager getLocalActivityManager() {
        return com.micklab.dcg.wrapper.android.app.LocalActivityManager.wrap(real.getLocalActivityManager());
    }

}
