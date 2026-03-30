// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceItem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SliceItem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceItem wrap(android.app.slice.SliceItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceItem(real, (__DcgwBridgeToken) null);
    }

    public android.app.slice.SliceItem getReal() {
        return (android.app.slice.SliceItem) real;
    }

    public android.app.slice.SliceItem unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.slice.SliceItem) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getAction() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.slice.SliceItem) real).getAction());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.slice.SliceItem) real).getBundle());
    }

    public java.lang.String getFormat() {
        return ((android.app.slice.SliceItem) real).getFormat();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.slice.SliceItem) real).getIcon());
    }

    public int getInt() {
        return ((android.app.slice.SliceItem) real).getInt();
    }

    public long getLong() {
        return ((android.app.slice.SliceItem) real).getLong();
    }

    public com.micklab.dcg.wrapper.android.app.RemoteInput getRemoteInput() {
        return com.micklab.dcg.wrapper.android.app.RemoteInput.wrap(((android.app.slice.SliceItem) real).getRemoteInput());
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(((android.app.slice.SliceItem) real).getSlice());
    }

    public java.lang.String getSubType() {
        return ((android.app.slice.SliceItem) real).getSubType();
    }

    public java.lang.CharSequence getText() {
        return ((android.app.slice.SliceItem) real).getText();
    }

    public boolean hasHint(java.lang.String arg0) {
        return ((android.app.slice.SliceItem) real).hasHint(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.slice.SliceItem) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String FORMAT_ACTION = android.app.slice.SliceItem.FORMAT_ACTION;
    public static final java.lang.String FORMAT_BUNDLE = android.app.slice.SliceItem.FORMAT_BUNDLE;
    public static final java.lang.String FORMAT_IMAGE = android.app.slice.SliceItem.FORMAT_IMAGE;
    public static final java.lang.String FORMAT_INT = android.app.slice.SliceItem.FORMAT_INT;
    public static final java.lang.String FORMAT_LONG = android.app.slice.SliceItem.FORMAT_LONG;
    public static final java.lang.String FORMAT_REMOTE_INPUT = android.app.slice.SliceItem.FORMAT_REMOTE_INPUT;
    public static final java.lang.String FORMAT_SLICE = android.app.slice.SliceItem.FORMAT_SLICE;
    public static final java.lang.String FORMAT_TEXT = android.app.slice.SliceItem.FORMAT_TEXT;

}
