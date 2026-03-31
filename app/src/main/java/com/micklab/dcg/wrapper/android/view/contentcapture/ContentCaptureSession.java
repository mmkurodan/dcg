// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentCaptureSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession wrap(android.view.contentcapture.ContentCaptureSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.ContentCaptureSession getReal() {
        return (android.view.contentcapture.ContentCaptureSession) real;
    }

    public android.view.contentcapture.ContentCaptureSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.view.contentcapture.ContentCaptureSession) real).close();
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession createContentCaptureSession(com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext arg0) {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession.wrap(((android.view.contentcapture.ContentCaptureSession) real).createContentCaptureSession(arg0 == null ? null : arg0.getReal()));
    }

    public void destroy() {
        ((android.view.contentcapture.ContentCaptureSession) real).destroy();
    }

    public void flush() {
        ((android.view.contentcapture.ContentCaptureSession) real).flush();
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext getContentCaptureContext() {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.wrap(((android.view.contentcapture.ContentCaptureSession) real).getContentCaptureContext());
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId getContentCaptureSessionId() {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId.wrap(((android.view.contentcapture.ContentCaptureSession) real).getContentCaptureSessionId());
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId newAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.view.contentcapture.ContentCaptureSession) real).newAutofillId(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure newViewStructure(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(((android.view.contentcapture.ContentCaptureSession) real).newViewStructure(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure newVirtualViewStructure(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(((android.view.contentcapture.ContentCaptureSession) real).newVirtualViewStructure(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void notifySessionPaused() {
        ((android.view.contentcapture.ContentCaptureSession) real).notifySessionPaused();
    }

    public void notifySessionResumed() {
        ((android.view.contentcapture.ContentCaptureSession) real).notifySessionResumed();
    }

    public void notifyViewAppeared(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        ((android.view.contentcapture.ContentCaptureSession) real).notifyViewAppeared(arg0 == null ? null : arg0.getReal());
    }

    public void notifyViewDisappeared(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
        ((android.view.contentcapture.ContentCaptureSession) real).notifyViewDisappeared(arg0 == null ? null : arg0.getReal());
    }

    public void notifyViewInsetsChanged(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
        ((android.view.contentcapture.ContentCaptureSession) real).notifyViewInsetsChanged(arg0 == null ? null : arg0.getReal());
    }

    public void notifyViewTextChanged(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.lang.CharSequence arg1) {
        ((android.view.contentcapture.ContentCaptureSession) real).notifyViewTextChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void notifyViewsDisappeared(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long[] arg1) {
        ((android.view.contentcapture.ContentCaptureSession) real).notifyViewsDisappeared(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setContentCaptureContext(com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext arg0) {
        ((android.view.contentcapture.ContentCaptureSession) real).setContentCaptureContext(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.view.contentcapture.ContentCaptureSession) real).toString();
    }

}
