// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class DataShareWriteAdapter {
    private final android.view.contentcapture.DataShareWriteAdapter real;

    public DataShareWriteAdapter(android.view.contentcapture.DataShareWriteAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.DataShareWriteAdapter wrap(android.view.contentcapture.DataShareWriteAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataShareWriteAdapter(real);
    }

    public android.view.contentcapture.DataShareWriteAdapter unwrap() {
        return real;
    }

    public void onError(int arg0) {
        real.onError(arg0);
    }

    public void onRejected() {
        real.onRejected();
    }

    public void onWrite(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        real.onWrite(arg0 == null ? null : arg0.unwrap());
    }

}
