// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureManager {
    private final android.view.contentcapture.ContentCaptureManager real;

    public ContentCaptureManager(android.view.contentcapture.ContentCaptureManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureManager wrap(android.view.contentcapture.ContentCaptureManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureManager(real);
    }

    public android.view.contentcapture.ContentCaptureManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getServiceComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getServiceComponentName());
    }

    public boolean isContentCaptureEnabled() {
        return real.isContentCaptureEnabled();
    }

    public void removeData(com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest arg0) {
        real.removeData(arg0 == null ? null : arg0.unwrap());
    }

    public void setContentCaptureEnabled(boolean arg0) {
        real.setContentCaptureEnabled(arg0);
    }

    public void shareData(com.micklab.dcg.wrapper.android.view.contentcapture.DataShareRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.view.contentcapture.DataShareWriteAdapter arg2) {
        real.shareData(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static final int DATA_SHARE_ERROR_CONCURRENT_REQUEST = android.view.contentcapture.ContentCaptureManager.DATA_SHARE_ERROR_CONCURRENT_REQUEST;
    public static final int DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED = android.view.contentcapture.ContentCaptureManager.DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED;
    public static final int DATA_SHARE_ERROR_UNKNOWN = android.view.contentcapture.ContentCaptureManager.DATA_SHARE_ERROR_UNKNOWN;

}
