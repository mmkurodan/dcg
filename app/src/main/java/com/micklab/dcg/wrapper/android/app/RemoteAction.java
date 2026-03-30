// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class RemoteAction {
    private final android.app.RemoteAction real;

    public RemoteAction(android.app.RemoteAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.RemoteAction wrap(android.app.RemoteAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.RemoteAction(real);
    }

    public android.app.RemoteAction unwrap() {
        return real;
    }

    public RemoteAction(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        this(new android.app.RemoteAction(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction clone() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(real.clone());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void dump(java.lang.String arg0, java.io.PrintWriter arg1) {
        real.dump(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getActionIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getActionIntent());
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setShouldShowIcon(boolean arg0) {
        real.setShouldShowIcon(arg0);
    }

    public boolean shouldShowIcon() {
        return real.shouldShowIcon();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
