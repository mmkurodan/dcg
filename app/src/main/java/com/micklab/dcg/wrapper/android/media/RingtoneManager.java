// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RingtoneManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RingtoneManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RingtoneManager wrap(android.media.RingtoneManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RingtoneManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.RingtoneManager getReal() {
        return (android.media.RingtoneManager) real;
    }

    public android.media.RingtoneManager unwrap() {
        return getReal();
    }

    public RingtoneManager(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        this(new android.media.RingtoneManager(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RingtoneManager(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.RingtoneManager(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getActualDefaultRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.RingtoneManager.getActualDefaultRingtoneUri(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getCursor() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.media.RingtoneManager) real).getCursor());
    }

    public static int getDefaultType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.RingtoneManager.getDefaultType(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getDefaultUri(int arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.RingtoneManager.getDefaultUri(arg0));
    }

    public boolean getIncludeDrm() {
        return ((android.media.RingtoneManager) real).getIncludeDrm();
    }

    public com.micklab.dcg.wrapper.android.media.Ringtone getRingtone(int arg0) {
        return com.micklab.dcg.wrapper.android.media.Ringtone.wrap(((android.media.RingtoneManager) real).getRingtone(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.Ringtone getRingtone(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.media.Ringtone.wrap(android.media.RingtoneManager.getRingtone(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public int getRingtonePosition(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.media.RingtoneManager) real).getRingtonePosition(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRingtoneUri(int arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.RingtoneManager) real).getRingtoneUri(arg0));
    }

    public boolean getStopPreviousRingtone() {
        return ((android.media.RingtoneManager) real).getStopPreviousRingtone();
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getValidRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.RingtoneManager.getValidRingtoneUri(arg0 == null ? null : arg0.getReal()));
    }

    public static boolean hasHapticChannels(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.RingtoneManager.hasHapticChannels(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasHapticChannels(int arg0) {
        return ((android.media.RingtoneManager) real).hasHapticChannels(arg0);
    }

    public static boolean hasHapticChannels(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return android.media.RingtoneManager.hasHapticChannels(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int inferStreamType() {
        return ((android.media.RingtoneManager) real).inferStreamType();
    }

    public static boolean isDefault(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.RingtoneManager.isDefault(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openDefaultRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(android.media.RingtoneManager.openDefaultRingtoneUri(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static void setActualDefaultRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        android.media.RingtoneManager.setActualDefaultRingtoneUri(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setIncludeDrm(boolean arg0) {
        ((android.media.RingtoneManager) real).setIncludeDrm(arg0);
    }

    public void setStopPreviousRingtone(boolean arg0) {
        ((android.media.RingtoneManager) real).setStopPreviousRingtone(arg0);
    }

    public void setType(int arg0) {
        ((android.media.RingtoneManager) real).setType(arg0);
    }

    public void stopPreviousRingtone() {
        ((android.media.RingtoneManager) real).stopPreviousRingtone();
    }

    public static final java.lang.String ACTION_RINGTONE_PICKER = android.media.RingtoneManager.ACTION_RINGTONE_PICKER;
    public static final java.lang.String EXTRA_RINGTONE_DEFAULT_URI = android.media.RingtoneManager.EXTRA_RINGTONE_DEFAULT_URI;
    public static final java.lang.String EXTRA_RINGTONE_EXISTING_URI = android.media.RingtoneManager.EXTRA_RINGTONE_EXISTING_URI;
    public static final java.lang.String EXTRA_RINGTONE_INCLUDE_DRM = android.media.RingtoneManager.EXTRA_RINGTONE_INCLUDE_DRM;
    public static final java.lang.String EXTRA_RINGTONE_PICKED_URI = android.media.RingtoneManager.EXTRA_RINGTONE_PICKED_URI;
    public static final java.lang.String EXTRA_RINGTONE_SHOW_DEFAULT = android.media.RingtoneManager.EXTRA_RINGTONE_SHOW_DEFAULT;
    public static final java.lang.String EXTRA_RINGTONE_SHOW_SILENT = android.media.RingtoneManager.EXTRA_RINGTONE_SHOW_SILENT;
    public static final java.lang.String EXTRA_RINGTONE_TITLE = android.media.RingtoneManager.EXTRA_RINGTONE_TITLE;
    public static final java.lang.String EXTRA_RINGTONE_TYPE = android.media.RingtoneManager.EXTRA_RINGTONE_TYPE;
    public static final int ID_COLUMN_INDEX = android.media.RingtoneManager.ID_COLUMN_INDEX;
    public static final int TITLE_COLUMN_INDEX = android.media.RingtoneManager.TITLE_COLUMN_INDEX;
    public static final int TYPE_ALARM = android.media.RingtoneManager.TYPE_ALARM;
    public static final int TYPE_ALL = android.media.RingtoneManager.TYPE_ALL;
    public static final int TYPE_NOTIFICATION = android.media.RingtoneManager.TYPE_NOTIFICATION;
    public static final int TYPE_RINGTONE = android.media.RingtoneManager.TYPE_RINGTONE;
    public static final int URI_COLUMN_INDEX = android.media.RingtoneManager.URI_COLUMN_INDEX;

}
