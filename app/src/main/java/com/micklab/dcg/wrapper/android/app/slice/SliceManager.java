// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SliceManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceManager wrap(android.app.slice.SliceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.slice.SliceManager getReal() {
        return (android.app.slice.SliceManager) real;
    }

    public android.app.slice.SliceManager unwrap() {
        return getReal();
    }

    public int checkSlicePermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2) {
        return ((android.app.slice.SliceManager) real).checkSlicePermission(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void grantSlicePermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.app.slice.SliceManager) real).grantSlicePermission(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri mapIntentToUri(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.slice.SliceManager) real).mapIntentToUri(arg0 == null ? null : arg0.getReal()));
    }

    public void revokeSlicePermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.app.slice.SliceManager) real).revokeSlicePermission(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unpinSlice(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.app.slice.SliceManager) real).unpinSlice(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String CATEGORY_SLICE = android.app.slice.SliceManager.CATEGORY_SLICE;
    public static final java.lang.String SLICE_METADATA_KEY = android.app.slice.SliceManager.SLICE_METADATA_KEY;

}
