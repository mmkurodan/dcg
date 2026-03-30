// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class AutofillManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutofillManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillManager wrap(android.view.autofill.AutofillManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.autofill.AutofillManager getReal() {
        return (android.view.autofill.AutofillManager) real;
    }

    public android.view.autofill.AutofillManager unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.view.autofill.AutofillManager) real).cancel();
    }

    public void commit() {
        ((android.view.autofill.AutofillManager) real).commit();
    }

    public void disableAutofillServices() {
        ((android.view.autofill.AutofillManager) real).disableAutofillServices();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getAutofillServiceComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.view.autofill.AutofillManager) real).getAutofillServiceComponentName());
    }

    public java.lang.String getDefaultFieldClassificationAlgorithm() {
        return ((android.view.autofill.AutofillManager) real).getDefaultFieldClassificationAlgorithm();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getNextAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.view.autofill.AutofillManager) real).getNextAutofillId());
    }

    public com.micklab.dcg.wrapper.android.service.autofill.UserData getUserData() {
        return com.micklab.dcg.wrapper.android.service.autofill.UserData.wrap(((android.view.autofill.AutofillManager) real).getUserData());
    }

    public java.lang.String getUserDataId() {
        return ((android.view.autofill.AutofillManager) real).getUserDataId();
    }

    public boolean hasEnabledAutofillServices() {
        return ((android.view.autofill.AutofillManager) real).hasEnabledAutofillServices();
    }

    public boolean isAutofillSupported() {
        return ((android.view.autofill.AutofillManager) real).isAutofillSupported();
    }

    public boolean isEnabled() {
        return ((android.view.autofill.AutofillManager) real).isEnabled();
    }

    public boolean isFieldClassificationEnabled() {
        return ((android.view.autofill.AutofillManager) real).isFieldClassificationEnabled();
    }

    public void notifyValueChanged(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.autofill.AutofillManager) real).notifyValueChanged(arg0 == null ? null : arg0.getReal());
    }

    public void notifyValueChanged(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg2) {
        ((android.view.autofill.AutofillManager) real).notifyValueChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void notifyViewClicked(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.autofill.AutofillManager) real).notifyViewClicked(arg0 == null ? null : arg0.getReal());
    }

    public void notifyViewClicked(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.autofill.AutofillManager) real).notifyViewClicked(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void notifyViewEntered(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.autofill.AutofillManager) real).notifyViewEntered(arg0 == null ? null : arg0.getReal());
    }

    public void notifyViewEntered(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        ((android.view.autofill.AutofillManager) real).notifyViewEntered(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void notifyViewExited(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.autofill.AutofillManager) real).notifyViewExited(arg0 == null ? null : arg0.getReal());
    }

    public void notifyViewExited(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.autofill.AutofillManager) real).notifyViewExited(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void notifyViewVisibilityChanged(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        ((android.view.autofill.AutofillManager) real).notifyViewVisibilityChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void notifyViewVisibilityChanged(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, boolean arg2) {
        ((android.view.autofill.AutofillManager) real).notifyViewVisibilityChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback arg0) {
        ((android.view.autofill.AutofillManager) real).registerCallback(arg0 == null ? null : arg0.getReal());
    }

    public void requestAutofill(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.autofill.AutofillManager) real).requestAutofill(arg0 == null ? null : arg0.getReal());
    }

    public void requestAutofill(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        ((android.view.autofill.AutofillManager) real).requestAutofill(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setUserData(com.micklab.dcg.wrapper.android.service.autofill.UserData arg0) {
        ((android.view.autofill.AutofillManager) real).setUserData(arg0 == null ? null : arg0.getReal());
    }

    public boolean showAutofillDialog(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.autofill.AutofillManager) real).showAutofillDialog(arg0 == null ? null : arg0.getReal());
    }

    public boolean showAutofillDialog(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return ((android.view.autofill.AutofillManager) real).showAutofillDialog(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback arg0) {
        ((android.view.autofill.AutofillManager) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String EXTRA_ASSIST_STRUCTURE = android.view.autofill.AutofillManager.EXTRA_ASSIST_STRUCTURE;
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT = android.view.autofill.AutofillManager.EXTRA_AUTHENTICATION_RESULT;
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET = android.view.autofill.AutofillManager.EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET;
    public static final java.lang.String EXTRA_CLIENT_STATE = android.view.autofill.AutofillManager.EXTRA_CLIENT_STATE;
    public static final java.lang.String EXTRA_INLINE_SUGGESTIONS_REQUEST = android.view.autofill.AutofillManager.EXTRA_INLINE_SUGGESTIONS_REQUEST;

    public static final class AutofillCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AutofillCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback wrap(android.view.autofill.AutofillManager.AutofillCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback(real, (__DcgwBridgeToken) null);
        }

        public android.view.autofill.AutofillManager.AutofillCallback getReal() {
            return (android.view.autofill.AutofillManager.AutofillCallback) real;
        }

        public android.view.autofill.AutofillManager.AutofillCallback unwrap() {
            return getReal();
        }

        public void onAutofillEvent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
            ((android.view.autofill.AutofillManager.AutofillCallback) real).onAutofillEvent(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onAutofillEvent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
            ((android.view.autofill.AutofillManager.AutofillCallback) real).onAutofillEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static final int EVENT_INPUT_HIDDEN = android.view.autofill.AutofillManager.AutofillCallback.EVENT_INPUT_HIDDEN;
        public static final int EVENT_INPUT_SHOWN = android.view.autofill.AutofillManager.AutofillCallback.EVENT_INPUT_SHOWN;
        public static final int EVENT_INPUT_UNAVAILABLE = android.view.autofill.AutofillManager.AutofillCallback.EVENT_INPUT_UNAVAILABLE;

    }
}
