// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class TaskStackBuilder {
    private final android.app.TaskStackBuilder real;

    public TaskStackBuilder(android.app.TaskStackBuilder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.TaskStackBuilder wrap(android.app.TaskStackBuilder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.TaskStackBuilder(real);
    }

    public android.app.TaskStackBuilder unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.TaskStackBuilder addNextIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.app.TaskStackBuilder.wrap(real.addNextIntent(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.TaskStackBuilder addNextIntentWithParentStack(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.app.TaskStackBuilder.wrap(real.addNextIntentWithParentStack(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.TaskStackBuilder addParentStack(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return com.micklab.dcg.wrapper.android.app.TaskStackBuilder.wrap(real.addParentStack(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.TaskStackBuilder addParentStack(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.app.TaskStackBuilder.wrap(real.addParentStack(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.app.TaskStackBuilder create(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.app.TaskStackBuilder.wrap(android.app.TaskStackBuilder.create(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent editIntentAt(int arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.editIntentAt(arg0));
    }

    public int getIntentCount() {
        return real.getIntentCount();
    }

    public android.content.Intent[] getIntents() {
        return real.getIntents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getPendingIntent(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getPendingIntent(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getPendingIntent(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getPendingIntent(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public void startActivities() {
        real.startActivities();
    }

    public void startActivities(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.startActivities(arg0 == null ? null : arg0.unwrap());
    }

}
