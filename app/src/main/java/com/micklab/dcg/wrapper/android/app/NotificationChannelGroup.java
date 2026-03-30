// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class NotificationChannelGroup {
    private final android.app.NotificationChannelGroup real;

    public NotificationChannelGroup(android.app.NotificationChannelGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.NotificationChannelGroup wrap(android.app.NotificationChannelGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.NotificationChannelGroup(real);
    }

    public android.app.NotificationChannelGroup unwrap() {
        return real;
    }

    public NotificationChannelGroup(java.lang.String arg0, java.lang.CharSequence arg1) {
        this(new android.app.NotificationChannelGroup(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.NotificationChannelGroup clone() {
        return com.micklab.dcg.wrapper.android.app.NotificationChannelGroup.wrap(real.clone());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.lang.CharSequence getName() {
        return real.getName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isBlocked() {
        return real.isBlocked();
    }

    public void setDescription(java.lang.String arg0) {
        real.setDescription(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
