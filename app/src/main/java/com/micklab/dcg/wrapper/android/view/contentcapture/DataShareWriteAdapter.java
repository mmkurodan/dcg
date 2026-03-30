// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class DataShareWriteAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataShareWriteAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.DataShareWriteAdapter wrap(android.view.contentcapture.DataShareWriteAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataShareWriteAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.DataShareWriteAdapter getReal() {
        return (android.view.contentcapture.DataShareWriteAdapter) real;
    }

    public android.view.contentcapture.DataShareWriteAdapter unwrap() {
        return getReal();
    }

    public void onError(int arg0) {
        ((android.view.contentcapture.DataShareWriteAdapter) real).onError(arg0);
    }

    public void onRejected() {
        ((android.view.contentcapture.DataShareWriteAdapter) real).onRejected();
    }

    public void onWrite(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        ((android.view.contentcapture.DataShareWriteAdapter) real).onWrite(arg0 == null ? null : arg0.getReal());
    }

}
