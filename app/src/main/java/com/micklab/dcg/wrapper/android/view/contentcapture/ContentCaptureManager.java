// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentCaptureManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureManager wrap(android.view.contentcapture.ContentCaptureManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.ContentCaptureManager getReal() {
        return (android.view.contentcapture.ContentCaptureManager) real;
    }

    public android.view.contentcapture.ContentCaptureManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getServiceComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.view.contentcapture.ContentCaptureManager) real).getServiceComponentName());
    }

    public boolean isContentCaptureEnabled() {
        return ((android.view.contentcapture.ContentCaptureManager) real).isContentCaptureEnabled();
    }

    public void removeData(com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest arg0) {
        ((android.view.contentcapture.ContentCaptureManager) real).removeData(arg0 == null ? null : arg0.getReal());
    }

    public void setContentCaptureEnabled(boolean arg0) {
        ((android.view.contentcapture.ContentCaptureManager) real).setContentCaptureEnabled(arg0);
    }

    public void shareData(com.micklab.dcg.wrapper.android.view.contentcapture.DataShareRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.view.contentcapture.DataShareWriteAdapter arg2) {
        ((android.view.contentcapture.ContentCaptureManager) real).shareData(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public static final int DATA_SHARE_ERROR_CONCURRENT_REQUEST = android.view.contentcapture.ContentCaptureManager.DATA_SHARE_ERROR_CONCURRENT_REQUEST;
    public static final int DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED = android.view.contentcapture.ContentCaptureManager.DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED;
    public static final int DATA_SHARE_ERROR_UNKNOWN = android.view.contentcapture.ContentCaptureManager.DATA_SHARE_ERROR_UNKNOWN;

}
