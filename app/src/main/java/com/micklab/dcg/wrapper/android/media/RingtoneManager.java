// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RingtoneManager {
    private final android.media.RingtoneManager real;

    public RingtoneManager(android.media.RingtoneManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RingtoneManager wrap(android.media.RingtoneManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RingtoneManager(real);
    }

    public android.media.RingtoneManager unwrap() {
        return real;
    }

    public RingtoneManager(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        this(new android.media.RingtoneManager(arg0 == null ? null : arg0.unwrap()));
    }

    public RingtoneManager(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.RingtoneManager(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getActualDefaultRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.RingtoneManager.getActualDefaultRingtoneUri(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor getCursor() {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.getCursor());
    }

    public static int getDefaultType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.RingtoneManager.getDefaultType(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getDefaultUri(int arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.RingtoneManager.getDefaultUri(arg0));
    }

    public boolean getIncludeDrm() {
        return real.getIncludeDrm();
    }

    public com.micklab.dcg.wrapper.android.media.Ringtone getRingtone(int arg0) {
        return com.micklab.dcg.wrapper.android.media.Ringtone.wrap(real.getRingtone(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.Ringtone getRingtone(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.media.Ringtone.wrap(android.media.RingtoneManager.getRingtone(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int getRingtonePosition(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.getRingtonePosition(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getRingtoneUri(int arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getRingtoneUri(arg0));
    }

    public boolean getStopPreviousRingtone() {
        return real.getStopPreviousRingtone();
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getValidRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.RingtoneManager.getValidRingtoneUri(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean hasHapticChannels(int arg0) {
        return real.hasHapticChannels(arg0);
    }

    public static boolean hasHapticChannels(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.RingtoneManager.hasHapticChannels(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean hasHapticChannels(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return android.media.RingtoneManager.hasHapticChannels(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int inferStreamType() {
        return real.inferStreamType();
    }

    public static boolean isDefault(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.RingtoneManager.isDefault(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openDefaultRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(android.media.RingtoneManager.openDefaultRingtoneUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static void setActualDefaultRingtoneUri(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        android.media.RingtoneManager.setActualDefaultRingtoneUri(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setIncludeDrm(boolean arg0) {
        real.setIncludeDrm(arg0);
    }

    public void setStopPreviousRingtone(boolean arg0) {
        real.setStopPreviousRingtone(arg0);
    }

    public void setType(int arg0) {
        real.setType(arg0);
    }

    public void stopPreviousRingtone() {
        real.stopPreviousRingtone();
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
