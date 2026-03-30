// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class NotificationChannel {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NotificationChannel(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.NotificationChannel wrap(android.app.NotificationChannel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.NotificationChannel(real, (__DcgwBridgeToken) null);
    }

    public android.app.NotificationChannel getReal() {
        return (android.app.NotificationChannel) real;
    }

    public android.app.NotificationChannel unwrap() {
        return getReal();
    }

    public NotificationChannel(java.lang.String arg0, java.lang.CharSequence arg1, int arg2) {
        this(new android.app.NotificationChannel(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean canBubble() {
        return ((android.app.NotificationChannel) real).canBubble();
    }

    public boolean canBypassDnd() {
        return ((android.app.NotificationChannel) real).canBypassDnd();
    }

    public boolean canShowBadge() {
        return ((android.app.NotificationChannel) real).canShowBadge();
    }

    public int describeContents() {
        return ((android.app.NotificationChannel) real).describeContents();
    }

    public void enableLights(boolean arg0) {
        ((android.app.NotificationChannel) real).enableLights(arg0);
    }

    public void enableVibration(boolean arg0) {
        ((android.app.NotificationChannel) real).enableVibration(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.NotificationChannel) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(((android.app.NotificationChannel) real).getAudioAttributes());
    }

    public java.lang.String getConversationId() {
        return ((android.app.NotificationChannel) real).getConversationId();
    }

    public java.lang.String getDescription() {
        return ((android.app.NotificationChannel) real).getDescription();
    }

    public java.lang.String getGroup() {
        return ((android.app.NotificationChannel) real).getGroup();
    }

    public java.lang.String getId() {
        return ((android.app.NotificationChannel) real).getId();
    }

    public int getImportance() {
        return ((android.app.NotificationChannel) real).getImportance();
    }

    public int getLightColor() {
        return ((android.app.NotificationChannel) real).getLightColor();
    }

    public int getLockscreenVisibility() {
        return ((android.app.NotificationChannel) real).getLockscreenVisibility();
    }

    public java.lang.CharSequence getName() {
        return ((android.app.NotificationChannel) real).getName();
    }

    public java.lang.String getParentChannelId() {
        return ((android.app.NotificationChannel) real).getParentChannelId();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSound() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.NotificationChannel) real).getSound());
    }

    public com.micklab.dcg.wrapper.android.os.VibrationEffect getVibrationEffect() {
        return com.micklab.dcg.wrapper.android.os.VibrationEffect.wrap(((android.app.NotificationChannel) real).getVibrationEffect());
    }

    public long[] getVibrationPattern() {
        return ((android.app.NotificationChannel) real).getVibrationPattern();
    }

    public boolean hasUserSetImportance() {
        return ((android.app.NotificationChannel) real).hasUserSetImportance();
    }

    public boolean hasUserSetSound() {
        return ((android.app.NotificationChannel) real).hasUserSetSound();
    }

    public int hashCode() {
        return ((android.app.NotificationChannel) real).hashCode();
    }

    public boolean isBlockable() {
        return ((android.app.NotificationChannel) real).isBlockable();
    }

    public boolean isConversation() {
        return ((android.app.NotificationChannel) real).isConversation();
    }

    public boolean isDemoted() {
        return ((android.app.NotificationChannel) real).isDemoted();
    }

    public boolean isImportantConversation() {
        return ((android.app.NotificationChannel) real).isImportantConversation();
    }

    public void setAllowBubbles(boolean arg0) {
        ((android.app.NotificationChannel) real).setAllowBubbles(arg0);
    }

    public void setBlockable(boolean arg0) {
        ((android.app.NotificationChannel) real).setBlockable(arg0);
    }

    public void setBypassDnd(boolean arg0) {
        ((android.app.NotificationChannel) real).setBypassDnd(arg0);
    }

    public void setConversationId(java.lang.String arg0, java.lang.String arg1) {
        ((android.app.NotificationChannel) real).setConversationId(arg0, arg1);
    }

    public void setDescription(java.lang.String arg0) {
        ((android.app.NotificationChannel) real).setDescription(arg0);
    }

    public void setGroup(java.lang.String arg0) {
        ((android.app.NotificationChannel) real).setGroup(arg0);
    }

    public void setImportance(int arg0) {
        ((android.app.NotificationChannel) real).setImportance(arg0);
    }

    public void setLightColor(int arg0) {
        ((android.app.NotificationChannel) real).setLightColor(arg0);
    }

    public void setLockscreenVisibility(int arg0) {
        ((android.app.NotificationChannel) real).setLockscreenVisibility(arg0);
    }

    public void setName(java.lang.CharSequence arg0) {
        ((android.app.NotificationChannel) real).setName(arg0);
    }

    public void setShowBadge(boolean arg0) {
        ((android.app.NotificationChannel) real).setShowBadge(arg0);
    }

    public void setSound(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        ((android.app.NotificationChannel) real).setSound(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setVibrationEffect(com.micklab.dcg.wrapper.android.os.VibrationEffect arg0) {
        ((android.app.NotificationChannel) real).setVibrationEffect(arg0 == null ? null : arg0.getReal());
    }

    public void setVibrationPattern(long[] arg0) {
        ((android.app.NotificationChannel) real).setVibrationPattern(arg0);
    }

    public boolean shouldShowLights() {
        return ((android.app.NotificationChannel) real).shouldShowLights();
    }

    public boolean shouldVibrate() {
        return ((android.app.NotificationChannel) real).shouldVibrate();
    }

    public java.lang.String toString() {
        return ((android.app.NotificationChannel) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.NotificationChannel) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
