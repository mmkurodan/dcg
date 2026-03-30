// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class NotificationChannel {
    private final android.app.NotificationChannel real;

    public NotificationChannel(android.app.NotificationChannel real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.NotificationChannel wrap(android.app.NotificationChannel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.NotificationChannel(real);
    }

    public android.app.NotificationChannel unwrap() {
        return real;
    }

    public NotificationChannel(java.lang.String arg0, java.lang.CharSequence arg1, int arg2) {
        this(new android.app.NotificationChannel(arg0, arg1, arg2));
    }

    public boolean canBubble() {
        return real.canBubble();
    }

    public boolean canBypassDnd() {
        return real.canBypassDnd();
    }

    public boolean canShowBadge() {
        return real.canShowBadge();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void enableLights(boolean arg0) {
        real.enableLights(arg0);
    }

    public void enableVibration(boolean arg0) {
        real.enableVibration(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(real.getAudioAttributes());
    }

    public java.lang.String getConversationId() {
        return real.getConversationId();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public java.lang.String getGroup() {
        return real.getGroup();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public int getImportance() {
        return real.getImportance();
    }

    public int getLightColor() {
        return real.getLightColor();
    }

    public int getLockscreenVisibility() {
        return real.getLockscreenVisibility();
    }

    public java.lang.CharSequence getName() {
        return real.getName();
    }

    public java.lang.String getParentChannelId() {
        return real.getParentChannelId();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSound() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getSound());
    }

    public com.micklab.dcg.wrapper.android.os.VibrationEffect getVibrationEffect() {
        return com.micklab.dcg.wrapper.android.os.VibrationEffect.wrap(real.getVibrationEffect());
    }

    public long[] getVibrationPattern() {
        return real.getVibrationPattern();
    }

    public boolean hasUserSetImportance() {
        return real.hasUserSetImportance();
    }

    public boolean hasUserSetSound() {
        return real.hasUserSetSound();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isBlockable() {
        return real.isBlockable();
    }

    public boolean isConversation() {
        return real.isConversation();
    }

    public boolean isDemoted() {
        return real.isDemoted();
    }

    public boolean isImportantConversation() {
        return real.isImportantConversation();
    }

    public void setAllowBubbles(boolean arg0) {
        real.setAllowBubbles(arg0);
    }

    public void setBlockable(boolean arg0) {
        real.setBlockable(arg0);
    }

    public void setBypassDnd(boolean arg0) {
        real.setBypassDnd(arg0);
    }

    public void setConversationId(java.lang.String arg0, java.lang.String arg1) {
        real.setConversationId(arg0, arg1);
    }

    public void setDescription(java.lang.String arg0) {
        real.setDescription(arg0);
    }

    public void setGroup(java.lang.String arg0) {
        real.setGroup(arg0);
    }

    public void setImportance(int arg0) {
        real.setImportance(arg0);
    }

    public void setLightColor(int arg0) {
        real.setLightColor(arg0);
    }

    public void setLockscreenVisibility(int arg0) {
        real.setLockscreenVisibility(arg0);
    }

    public void setName(java.lang.CharSequence arg0) {
        real.setName(arg0);
    }

    public void setShowBadge(boolean arg0) {
        real.setShowBadge(arg0);
    }

    public void setSound(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        real.setSound(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setVibrationEffect(com.micklab.dcg.wrapper.android.os.VibrationEffect arg0) {
        real.setVibrationEffect(arg0 == null ? null : arg0.unwrap());
    }

    public void setVibrationPattern(long[] arg0) {
        real.setVibrationPattern(arg0);
    }

    public boolean shouldShowLights() {
        return real.shouldShowLights();
    }

    public boolean shouldVibrate() {
        return real.shouldVibrate();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String DEFAULT_CHANNEL_ID = android.app.NotificationChannel.DEFAULT_CHANNEL_ID;
    public static final java.lang.String EDIT_CONVERSATION = android.app.NotificationChannel.EDIT_CONVERSATION;
    public static final java.lang.String EDIT_IMPORTANCE = android.app.NotificationChannel.EDIT_IMPORTANCE;
    public static final java.lang.String EDIT_LAUNCHER = android.app.NotificationChannel.EDIT_LAUNCHER;
    public static final java.lang.String EDIT_LOCKED_DEVICE = android.app.NotificationChannel.EDIT_LOCKED_DEVICE;
    public static final java.lang.String EDIT_SOUND = android.app.NotificationChannel.EDIT_SOUND;
    public static final java.lang.String EDIT_VIBRATION = android.app.NotificationChannel.EDIT_VIBRATION;
    public static final java.lang.String EDIT_ZEN = android.app.NotificationChannel.EDIT_ZEN;

}
