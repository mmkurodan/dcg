// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quicksettings;

public final class Tile {
    private final android.service.quicksettings.Tile real;

    public Tile(android.service.quicksettings.Tile real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quicksettings.Tile wrap(android.service.quicksettings.Tile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quicksettings.Tile(real);
    }

    public android.service.quicksettings.Tile unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getActivityLaunchForClick() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getActivityLaunchForClick());
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public int getState() {
        return real.getState();
    }

    public java.lang.CharSequence getStateDescription() {
        return real.getStateDescription();
    }

    public java.lang.CharSequence getSubtitle() {
        return real.getSubtitle();
    }

    public void setActivityLaunchForClick(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.setActivityLaunchForClick(arg0 == null ? null : arg0.unwrap());
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        real.setContentDescription(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setLabel(java.lang.CharSequence arg0) {
        real.setLabel(arg0);
    }

    public void setState(int arg0) {
        real.setState(arg0);
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        real.setStateDescription(arg0);
    }

    public void setSubtitle(java.lang.CharSequence arg0) {
        real.setSubtitle(arg0);
    }

    public void updateTile() {
        real.updateTile();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATE_ACTIVE = android.service.quicksettings.Tile.STATE_ACTIVE;
    public static final int STATE_INACTIVE = android.service.quicksettings.Tile.STATE_INACTIVE;
    public static final int STATE_UNAVAILABLE = android.service.quicksettings.Tile.STATE_UNAVAILABLE;

}
