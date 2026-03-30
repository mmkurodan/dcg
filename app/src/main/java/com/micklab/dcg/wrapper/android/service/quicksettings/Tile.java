// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quicksettings;

public final class Tile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Tile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quicksettings.Tile wrap(android.service.quicksettings.Tile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quicksettings.Tile(real, (__DcgwBridgeToken) null);
    }

    public android.service.quicksettings.Tile getReal() {
        return (android.service.quicksettings.Tile) real;
    }

    public android.service.quicksettings.Tile unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.quicksettings.Tile) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getActivityLaunchForClick() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.service.quicksettings.Tile) real).getActivityLaunchForClick());
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.service.quicksettings.Tile) real).getContentDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.service.quicksettings.Tile) real).getIcon());
    }

    public java.lang.CharSequence getLabel() {
        return ((android.service.quicksettings.Tile) real).getLabel();
    }

    public int getState() {
        return ((android.service.quicksettings.Tile) real).getState();
    }

    public java.lang.CharSequence getStateDescription() {
        return ((android.service.quicksettings.Tile) real).getStateDescription();
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.service.quicksettings.Tile) real).getSubtitle();
    }

    public void setActivityLaunchForClick(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.service.quicksettings.Tile) real).setActivityLaunchForClick(arg0 == null ? null : arg0.getReal());
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        ((android.service.quicksettings.Tile) real).setContentDescription(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        ((android.service.quicksettings.Tile) real).setIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setLabel(java.lang.CharSequence arg0) {
        ((android.service.quicksettings.Tile) real).setLabel(arg0);
    }

    public void setState(int arg0) {
        ((android.service.quicksettings.Tile) real).setState(arg0);
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        ((android.service.quicksettings.Tile) real).setStateDescription(arg0);
    }

    public void setSubtitle(java.lang.CharSequence arg0) {
        ((android.service.quicksettings.Tile) real).setSubtitle(arg0);
    }

    public void updateTile() {
        ((android.service.quicksettings.Tile) real).updateTile();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.quicksettings.Tile) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STATE_ACTIVE = android.service.quicksettings.Tile.STATE_ACTIVE;
    public static final int STATE_INACTIVE = android.service.quicksettings.Tile.STATE_INACTIVE;
    public static final int STATE_UNAVAILABLE = android.service.quicksettings.Tile.STATE_UNAVAILABLE;

}
