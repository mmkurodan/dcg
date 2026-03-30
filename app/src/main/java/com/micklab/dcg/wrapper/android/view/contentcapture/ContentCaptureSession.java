// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureSession {
    private final android.view.contentcapture.ContentCaptureSession real;

    public ContentCaptureSession(android.view.contentcapture.ContentCaptureSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession wrap(android.view.contentcapture.ContentCaptureSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession(real);
    }

    public android.view.contentcapture.ContentCaptureSession unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession createContentCaptureSession(com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext arg0) {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession.wrap(real.createContentCaptureSession(arg0 == null ? null : arg0.unwrap()));
    }

    public void destroy() {
        real.destroy();
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext getContentCaptureContext() {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.wrap(real.getContentCaptureContext());
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId getContentCaptureSessionId() {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId.wrap(real.getContentCaptureSessionId());
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId newAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.newAutofillId(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure newViewStructure(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(real.newViewStructure(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure newVirtualViewStructure(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(real.newVirtualViewStructure(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void notifySessionPaused() {
        real.notifySessionPaused();
    }

    public void notifySessionResumed() {
        real.notifySessionResumed();
    }

    public void notifyViewAppeared(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        real.notifyViewAppeared(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyViewDisappeared(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
        real.notifyViewDisappeared(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyViewInsetsChanged(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
        real.notifyViewInsetsChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyViewTextChanged(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.lang.CharSequence arg1) {
        real.notifyViewTextChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void notifyViewsDisappeared(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, long[] arg1) {
        real.notifyViewsDisappeared(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setContentCaptureContext(com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext arg0) {
        real.setContentCaptureContext(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
