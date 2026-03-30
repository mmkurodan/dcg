// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class AutofillManager {
    private final android.view.autofill.AutofillManager real;

    public AutofillManager(android.view.autofill.AutofillManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillManager wrap(android.view.autofill.AutofillManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillManager(real);
    }

    public android.view.autofill.AutofillManager unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public void commit() {
        real.commit();
    }

    public void disableAutofillServices() {
        real.disableAutofillServices();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getAutofillServiceComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getAutofillServiceComponentName());
    }

    public java.lang.String getDefaultFieldClassificationAlgorithm() {
        return real.getDefaultFieldClassificationAlgorithm();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getNextAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.getNextAutofillId());
    }

    public com.micklab.dcg.wrapper.android.service.autofill.UserData getUserData() {
        return com.micklab.dcg.wrapper.android.service.autofill.UserData.wrap(real.getUserData());
    }

    public java.lang.String getUserDataId() {
        return real.getUserDataId();
    }

    public boolean hasEnabledAutofillServices() {
        return real.hasEnabledAutofillServices();
    }

    public boolean isAutofillSupported() {
        return real.isAutofillSupported();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isFieldClassificationEnabled() {
        return real.isFieldClassificationEnabled();
    }

    public void notifyValueChanged(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.notifyValueChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyValueChanged(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg2) {
        real.notifyValueChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void notifyViewClicked(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.notifyViewClicked(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyViewClicked(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.notifyViewClicked(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void notifyViewEntered(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.notifyViewEntered(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyViewEntered(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        real.notifyViewEntered(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void notifyViewExited(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.notifyViewExited(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyViewExited(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.notifyViewExited(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void notifyViewVisibilityChanged(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        real.notifyViewVisibilityChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void notifyViewVisibilityChanged(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, boolean arg2) {
        real.notifyViewVisibilityChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback arg0) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void requestAutofill(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.requestAutofill(arg0 == null ? null : arg0.unwrap());
    }

    public void requestAutofill(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        real.requestAutofill(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setUserData(com.micklab.dcg.wrapper.android.service.autofill.UserData arg0) {
        real.setUserData(arg0 == null ? null : arg0.unwrap());
    }

    public boolean showAutofillDialog(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.showAutofillDialog(arg0 == null ? null : arg0.unwrap());
    }

    public boolean showAutofillDialog(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return real.showAutofillDialog(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback arg0) {
        real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String EXTRA_ASSIST_STRUCTURE = android.view.autofill.AutofillManager.EXTRA_ASSIST_STRUCTURE;
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT = android.view.autofill.AutofillManager.EXTRA_AUTHENTICATION_RESULT;
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET = android.view.autofill.AutofillManager.EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET;
    public static final java.lang.String EXTRA_CLIENT_STATE = android.view.autofill.AutofillManager.EXTRA_CLIENT_STATE;
    public static final java.lang.String EXTRA_INLINE_SUGGESTIONS_REQUEST = android.view.autofill.AutofillManager.EXTRA_INLINE_SUGGESTIONS_REQUEST;

    public static final class AutofillCallback {
        private final android.view.autofill.AutofillManager.AutofillCallback real;

        public AutofillCallback(android.view.autofill.AutofillManager.AutofillCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback wrap(android.view.autofill.AutofillManager.AutofillCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillManager.AutofillCallback(real);
        }

        public android.view.autofill.AutofillManager.AutofillCallback unwrap() {
            return real;
        }

        public void onAutofillEvent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
            real.onAutofillEvent(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onAutofillEvent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
            real.onAutofillEvent(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public static final int EVENT_INPUT_HIDDEN = android.view.autofill.AutofillManager.AutofillCallback.EVENT_INPUT_HIDDEN;
        public static final int EVENT_INPUT_SHOWN = android.view.autofill.AutofillManager.AutofillCallback.EVENT_INPUT_SHOWN;
        public static final int EVENT_INPUT_UNAVAILABLE = android.view.autofill.AutofillManager.AutofillCallback.EVENT_INPUT_UNAVAILABLE;

    }
}
