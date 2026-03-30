// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class NotificationChannelGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NotificationChannelGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.NotificationChannelGroup wrap(android.app.NotificationChannelGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.NotificationChannelGroup(real, (__DcgwBridgeToken) null);
    }

    public android.app.NotificationChannelGroup getReal() {
        return (android.app.NotificationChannelGroup) real;
    }

    public android.app.NotificationChannelGroup unwrap() {
        return getReal();
    }

    public NotificationChannelGroup(java.lang.String arg0, java.lang.CharSequence arg1) {
        this(new android.app.NotificationChannelGroup(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.app.NotificationChannelGroup clone() {
        return com.micklab.dcg.wrapper.android.app.NotificationChannelGroup.wrap(((android.app.NotificationChannelGroup) real).clone());
    }

    public int describeContents() {
        return ((android.app.NotificationChannelGroup) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.NotificationChannelGroup) real).equals(arg0);
    }

    public java.lang.String getDescription() {
        return ((android.app.NotificationChannelGroup) real).getDescription();
    }

    public java.lang.String getId() {
        return ((android.app.NotificationChannelGroup) real).getId();
    }

    public java.lang.CharSequence getName() {
        return ((android.app.NotificationChannelGroup) real).getName();
    }

    public int hashCode() {
        return ((android.app.NotificationChannelGroup) real).hashCode();
    }

    public boolean isBlocked() {
        return ((android.app.NotificationChannelGroup) real).isBlocked();
    }

    public void setDescription(java.lang.String arg0) {
        ((android.app.NotificationChannelGroup) real).setDescription(arg0);
    }

    public java.lang.String toString() {
        return ((android.app.NotificationChannelGroup) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.NotificationChannelGroup) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
