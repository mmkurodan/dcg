// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class StatusBarNotification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StatusBarNotification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification wrap(android.service.notification.StatusBarNotification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification(real, (__DcgwBridgeToken) null);
    }

    public android.service.notification.StatusBarNotification getReal() {
        return (android.service.notification.StatusBarNotification) real;
    }

    public android.service.notification.StatusBarNotification unwrap() {
        return getReal();
    }

    public StatusBarNotification(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.service.notification.StatusBarNotification(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public StatusBarNotification(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, int arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.app.Notification arg7, com.micklab.dcg.wrapper.android.os.UserHandle arg8, long arg9) {
        this(new android.service.notification.StatusBarNotification(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.getReal(), arg8 == null ? null : arg8.getReal(), arg9), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification clone() {
        return com.micklab.dcg.wrapper.android.service.notification.StatusBarNotification.wrap(((android.service.notification.StatusBarNotification) real).clone());
    }

    public int describeContents() {
        return ((android.service.notification.StatusBarNotification) real).describeContents();
    }

    public java.lang.String getGroupKey() {
        return ((android.service.notification.StatusBarNotification) real).getGroupKey();
    }

    public int getId() {
        return ((android.service.notification.StatusBarNotification) real).getId();
    }

    public java.lang.String getKey() {
        return ((android.service.notification.StatusBarNotification) real).getKey();
    }

    public com.micklab.dcg.wrapper.android.app.Notification getNotification() {
        return com.micklab.dcg.wrapper.android.app.Notification.wrap(((android.service.notification.StatusBarNotification) real).getNotification());
    }

    public java.lang.String getOpPkg() {
        return ((android.service.notification.StatusBarNotification) real).getOpPkg();
    }

    public java.lang.String getOverrideGroupKey() {
        return ((android.service.notification.StatusBarNotification) real).getOverrideGroupKey();
    }

    public java.lang.String getPackageName() {
        return ((android.service.notification.StatusBarNotification) real).getPackageName();
    }

    public long getPostTime() {
        return ((android.service.notification.StatusBarNotification) real).getPostTime();
    }

    public java.lang.String getTag() {
        return ((android.service.notification.StatusBarNotification) real).getTag();
    }

    public int getUid() {
        return ((android.service.notification.StatusBarNotification) real).getUid();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUser() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(((android.service.notification.StatusBarNotification) real).getUser());
    }

    public int getUserId() {
        return ((android.service.notification.StatusBarNotification) real).getUserId();
    }

    public boolean isAppGroup() {
        return ((android.service.notification.StatusBarNotification) real).isAppGroup();
    }

    public boolean isClearable() {
        return ((android.service.notification.StatusBarNotification) real).isClearable();
    }

    public boolean isGroup() {
        return ((android.service.notification.StatusBarNotification) real).isGroup();
    }

    public boolean isOngoing() {
        return ((android.service.notification.StatusBarNotification) real).isOngoing();
    }

    public void setOverrideGroupKey(java.lang.String arg0) {
        ((android.service.notification.StatusBarNotification) real).setOverrideGroupKey(arg0);
    }

    public java.lang.String toString() {
        return ((android.service.notification.StatusBarNotification) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.notification.StatusBarNotification) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
