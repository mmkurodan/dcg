// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillEventHistory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FillEventHistory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory wrap(android.service.autofill.FillEventHistory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.FillEventHistory getReal() {
        return (android.service.autofill.FillEventHistory) real;
    }

    public android.service.autofill.FillEventHistory unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.FillEventHistory) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getClientState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.autofill.FillEventHistory) real).getClientState());
    }

    public int getSessionId() {
        return ((android.service.autofill.FillEventHistory) real).getSessionId();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.FillEventHistory) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.FillEventHistory) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Event {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Event(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory.Event wrap(android.service.autofill.FillEventHistory.Event real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillEventHistory.Event(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.FillEventHistory.Event getReal() {
            return (android.service.autofill.FillEventHistory.Event) real;
        }

        public android.service.autofill.FillEventHistory.Event unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getClientState() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.autofill.FillEventHistory.Event) real).getClientState());
        }

        public java.lang.String getDatasetId() {
            return ((android.service.autofill.FillEventHistory.Event) real).getDatasetId();
        }

        public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getFocusedId() {
            return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.service.autofill.FillEventHistory.Event) real).getFocusedId());
        }

        public int getNoSaveUiReason() {
            return ((android.service.autofill.FillEventHistory.Event) real).getNoSaveUiReason();
        }

        public int getType() {
            return ((android.service.autofill.FillEventHistory.Event) real).getType();
        }

        public int getUiType() {
            return ((android.service.autofill.FillEventHistory.Event) real).getUiType();
        }

        public java.lang.String toString() {
            return ((android.service.autofill.FillEventHistory.Event) real).toString();
        }

        public static final int NO_SAVE_UI_REASON_DATASET_MATCH = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_DATASET_MATCH;
        public static final int NO_SAVE_UI_REASON_FIELD_VALIDATION_FAILED = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_FIELD_VALIDATION_FAILED;
        public static final int NO_SAVE_UI_REASON_HAS_EMPTY_REQUIRED = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_HAS_EMPTY_REQUIRED;
        public static final int NO_SAVE_UI_REASON_NONE = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_NONE;
        public static final int NO_SAVE_UI_REASON_NO_SAVE_INFO = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_NO_SAVE_INFO;
        public static final int NO_SAVE_UI_REASON_NO_VALUE_CHANGED = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_NO_VALUE_CHANGED;
        public static final int NO_SAVE_UI_REASON_USING_CREDMAN = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_USING_CREDMAN;
        public static final int NO_SAVE_UI_REASON_WITH_DELAY_SAVE_FLAG = android.service.autofill.FillEventHistory.Event.NO_SAVE_UI_REASON_WITH_DELAY_SAVE_FLAG;
        public static final int TYPE_AUTHENTICATION_SELECTED = android.service.autofill.FillEventHistory.Event.TYPE_AUTHENTICATION_SELECTED;
        public static final int TYPE_CONTEXT_COMMITTED = android.service.autofill.FillEventHistory.Event.TYPE_CONTEXT_COMMITTED;
        public static final int TYPE_DATASETS_SHOWN = android.service.autofill.FillEventHistory.Event.TYPE_DATASETS_SHOWN;
        public static final int TYPE_DATASET_AUTHENTICATION_SELECTED = android.service.autofill.FillEventHistory.Event.TYPE_DATASET_AUTHENTICATION_SELECTED;
        public static final int TYPE_DATASET_SELECTED = android.service.autofill.FillEventHistory.Event.TYPE_DATASET_SELECTED;
        public static final int TYPE_SAVE_SHOWN = android.service.autofill.FillEventHistory.Event.TYPE_SAVE_SHOWN;
        public static final int TYPE_VIEW_REQUESTED_AUTOFILL = android.service.autofill.FillEventHistory.Event.TYPE_VIEW_REQUESTED_AUTOFILL;
        public static final int UI_TYPE_CREDENTIAL_MANAGER = android.service.autofill.FillEventHistory.Event.UI_TYPE_CREDENTIAL_MANAGER;
        public static final int UI_TYPE_DIALOG = android.service.autofill.FillEventHistory.Event.UI_TYPE_DIALOG;
        public static final int UI_TYPE_INLINE = android.service.autofill.FillEventHistory.Event.UI_TYPE_INLINE;
        public static final int UI_TYPE_MENU = android.service.autofill.FillEventHistory.Event.UI_TYPE_MENU;
        public static final int UI_TYPE_UNKNOWN = android.service.autofill.FillEventHistory.Event.UI_TYPE_UNKNOWN;

    }
}
