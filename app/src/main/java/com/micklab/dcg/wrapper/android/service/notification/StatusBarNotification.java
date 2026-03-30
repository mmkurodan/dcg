// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class StatusBarNotification {
    private final android.service.notification.StatusBarNotification real;

    public StatusBarNotification(android.service.notification.StatusBarNotification real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification wrap(android.service.notification.StatusBarNotification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification(real);
    }

    public android.service.notification.StatusBarNotification unwrap() {
        return real;
    }

    public StatusBarNotification(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.service.notification.StatusBarNotification(arg0 == null ? null : arg0.unwrap()));
    }

    public StatusBarNotification(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, int arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.app.Notification arg7, com.micklab.dcg.wrapper.android.os.UserHandle arg8, long arg9) {
        this(new android.service.notification.StatusBarNotification(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap(), arg8 == null ? null : arg8.unwrap(), arg9));
    }

    public com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification clone() {
        return com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification.wrap(real.clone());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getGroupKey() {
        return real.getGroupKey();
    }

    public int getId() {
        return real.getId();
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public com.micklab.dcg.wrapper.android.app.Notification getNotification() {
        return com.micklab.dcg.wrapper.android.app.Notification.wrap(real.getNotification());
    }

    public java.lang.String getOpPkg() {
        return real.getOpPkg();
    }

    public java.lang.String getOverrideGroupKey() {
        return real.getOverrideGroupKey();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public long getPostTime() {
        return real.getPostTime();
    }

    public java.lang.String getTag() {
        return real.getTag();
    }

    public int getUid() {
        return real.getUid();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUser() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(real.getUser());
    }

    public int getUserId() {
        return real.getUserId();
    }

    public boolean isAppGroup() {
        return real.isAppGroup();
    }

    public boolean isClearable() {
        return real.isClearable();
    }

    public boolean isGroup() {
        return real.isGroup();
    }

    public boolean isOngoing() {
        return real.isOngoing();
    }

    public void setOverrideGroupKey(java.lang.String arg0) {
        real.setOverrideGroupKey(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
