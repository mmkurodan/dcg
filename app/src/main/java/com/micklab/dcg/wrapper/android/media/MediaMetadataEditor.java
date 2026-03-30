// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaMetadataEditor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaMetadataEditor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaMetadataEditor wrap(android.media.MediaMetadataEditor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMetadataEditor(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaMetadataEditor getReal() {
        return (android.media.MediaMetadataEditor) real;
    }

    public android.media.MediaMetadataEditor unwrap() {
        return getReal();
    }

    public void addEditableKey(int arg0) {
        ((android.media.MediaMetadataEditor) real).addEditableKey(arg0);
    }

    public void apply() {
        ((android.media.MediaMetadataEditor) real).apply();
    }

    public void clear() {
        ((android.media.MediaMetadataEditor) real).clear();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.media.MediaMetadataEditor) real).getBitmap(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public int[] getEditableKeys() {
        return ((android.media.MediaMetadataEditor) real).getEditableKeys();
    }

    public long getLong(int arg0, long arg1) throws java.lang.IllegalArgumentException {
        return ((android.media.MediaMetadataEditor) real).getLong(arg0, arg1);
    }

    public java.lang.Object getObject(int arg0, java.lang.Object arg1) throws java.lang.IllegalArgumentException {
        return ((android.media.MediaMetadataEditor) real).getObject(arg0, arg1);
    }

    public java.lang.String getString(int arg0, java.lang.String arg1) throws java.lang.IllegalArgumentException {
        return ((android.media.MediaMetadataEditor) real).getString(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putBitmap(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(((android.media.MediaMetadataEditor) real).putBitmap(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putLong(int arg0, long arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(((android.media.MediaMetadataEditor) real).putLong(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putObject(int arg0, java.lang.Object arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(((android.media.MediaMetadataEditor) real).putObject(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadataEditor putString(int arg0, java.lang.String arg1) throws java.lang.IllegalArgumentException {
        return com.micklab.dcg.wrapper.android.media.MediaMetadataEditor.wrap(((android.media.MediaMetadataEditor) real).putString(arg0, arg1));
    }

    public void removeEditableKeys() {
        ((android.media.MediaMetadataEditor) real).removeEditableKeys();
    }

    public static final int BITMAP_KEY_ARTWORK = android.media.MediaMetadataEditor.BITMAP_KEY_ARTWORK;
    public static final int RATING_KEY_BY_OTHERS = android.media.MediaMetadataEditor.RATING_KEY_BY_OTHERS;
    public static final int RATING_KEY_BY_USER = android.media.MediaMetadataEditor.RATING_KEY_BY_USER;

}
