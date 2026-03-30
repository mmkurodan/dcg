// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceManager {
    private final android.app.slice.SliceManager real;

    public SliceManager(android.app.slice.SliceManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceManager wrap(android.app.slice.SliceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceManager(real);
    }

    public android.app.slice.SliceManager unwrap() {
        return real;
    }

    public int checkSlicePermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2) {
        return real.checkSlicePermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void grantSlicePermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.grantSlicePermission(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri mapIntentToUri(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.mapIntentToUri(arg0 == null ? null : arg0.unwrap()));
    }

    public void revokeSlicePermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.revokeSlicePermission(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void unpinSlice(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.unpinSlice(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String CATEGORY_SLICE = android.app.slice.SliceManager.CATEGORY_SLICE;
    public static final java.lang.String SLICE_METADATA_KEY = android.app.slice.SliceManager.SLICE_METADATA_KEY;

}
