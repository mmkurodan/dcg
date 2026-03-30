// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class RemoteAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.RemoteAction wrap(android.app.RemoteAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.RemoteAction(real, (__DcgwBridgeToken) null);
    }

    public android.app.RemoteAction getReal() {
        return (android.app.RemoteAction) real;
    }

    public android.app.RemoteAction unwrap() {
        return getReal();
    }

    public RemoteAction(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2, com.micklab.dcg.wrapper.android.app.PendingIntent arg3) {
        this(new android.app.RemoteAction(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction clone() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(((android.app.RemoteAction) real).clone());
    }

    public int describeContents() {
        return ((android.app.RemoteAction) real).describeContents();
    }

    public void dump(java.lang.String arg0, java.io.PrintWriter arg1) {
        ((android.app.RemoteAction) real).dump(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.RemoteAction) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getActionIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.RemoteAction) real).getActionIntent());
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.app.RemoteAction) real).getContentDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.RemoteAction) real).getIcon());
    }

    public java.lang.CharSequence getTitle() {
        return ((android.app.RemoteAction) real).getTitle();
    }

    public int hashCode() {
        return ((android.app.RemoteAction) real).hashCode();
    }

    public boolean isEnabled() {
        return ((android.app.RemoteAction) real).isEnabled();
    }

    public void setEnabled(boolean arg0) {
        ((android.app.RemoteAction) real).setEnabled(arg0);
    }

    public void setShouldShowIcon(boolean arg0) {
        ((android.app.RemoteAction) real).setShouldShowIcon(arg0);
    }

    public boolean shouldShowIcon() {
        return ((android.app.RemoteAction) real).shouldShowIcon();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.RemoteAction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
