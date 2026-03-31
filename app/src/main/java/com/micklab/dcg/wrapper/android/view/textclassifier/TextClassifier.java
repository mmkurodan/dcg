// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextClassifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier wrap(android.view.textclassifier.TextClassifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextClassifier getReal() {
        return (android.view.textclassifier.TextClassifier) real;
    }

    public android.view.textclassifier.TextClassifier unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification classifyText(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.wrap(((android.view.textclassifier.TextClassifier) real).classifyText(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification classifyText(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.os.LocaleList arg3) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.wrap(((android.view.textclassifier.TextClassifier) real).classifyText(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public void destroy() {
        ((android.view.textclassifier.TextClassifier) real).destroy();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage detectLanguage(com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.wrap(((android.view.textclassifier.TextClassifier) real).detectLanguage(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks generateLinks(com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.wrap(((android.view.textclassifier.TextClassifier) real).generateLinks(arg0 == null ? null : arg0.getReal()));
    }

    public int getMaxGenerateLinksTextLength() {
        return ((android.view.textclassifier.TextClassifier) real).getMaxGenerateLinksTextLength();
    }

    public boolean isDestroyed() {
        return ((android.view.textclassifier.TextClassifier) real).isDestroyed();
    }

    public void onSelectionEvent(com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent arg0) {
        ((android.view.textclassifier.TextClassifier) real).onSelectionEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onTextClassifierEvent(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifierEvent arg0) {
        ((android.view.textclassifier.TextClassifier) real).onTextClassifierEvent(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions suggestConversationActions(com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.wrap(((android.view.textclassifier.TextClassifier) real).suggestConversationActions(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection suggestSelection(com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.Request arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.wrap(((android.view.textclassifier.TextClassifier) real).suggestSelection(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection suggestSelection(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.os.LocaleList arg3) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection.wrap(((android.view.textclassifier.TextClassifier) real).suggestSelection(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static final java.lang.String EXTRA_FROM_TEXT_CLASSIFIER = android.view.textclassifier.TextClassifier.EXTRA_FROM_TEXT_CLASSIFIER;
    public static final java.lang.String EXTRA_TEXT_ORIGIN_PACKAGE = android.view.textclassifier.TextClassifier.EXTRA_TEXT_ORIGIN_PACKAGE;
    public static final java.lang.String HINT_TEXT_IS_EDITABLE = android.view.textclassifier.TextClassifier.HINT_TEXT_IS_EDITABLE;
    public static final java.lang.String HINT_TEXT_IS_NOT_EDITABLE = android.view.textclassifier.TextClassifier.HINT_TEXT_IS_NOT_EDITABLE;
    public static final com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier NO_OP = com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(android.view.textclassifier.TextClassifier.NO_OP);
    public static final java.lang.String TYPE_ADDRESS = android.view.textclassifier.TextClassifier.TYPE_ADDRESS;
    public static final java.lang.String TYPE_DATE = android.view.textclassifier.TextClassifier.TYPE_DATE;
    public static final java.lang.String TYPE_DATE_TIME = android.view.textclassifier.TextClassifier.TYPE_DATE_TIME;
    public static final java.lang.String TYPE_EMAIL = android.view.textclassifier.TextClassifier.TYPE_EMAIL;
    public static final java.lang.String TYPE_FLIGHT_NUMBER = android.view.textclassifier.TextClassifier.TYPE_FLIGHT_NUMBER;
    public static final java.lang.String TYPE_OTHER = android.view.textclassifier.TextClassifier.TYPE_OTHER;
    public static final java.lang.String TYPE_OTP = android.view.textclassifier.TextClassifier.TYPE_OTP;
    public static final java.lang.String TYPE_PHONE = android.view.textclassifier.TextClassifier.TYPE_PHONE;
    public static final java.lang.String TYPE_UNKNOWN = android.view.textclassifier.TextClassifier.TYPE_UNKNOWN;
    public static final java.lang.String TYPE_URL = android.view.textclassifier.TextClassifier.TYPE_URL;
    public static final java.lang.String WIDGET_TYPE_CLIPBOARD = android.view.textclassifier.TextClassifier.WIDGET_TYPE_CLIPBOARD;
    public static final java.lang.String WIDGET_TYPE_CUSTOM_EDITTEXT = android.view.textclassifier.TextClassifier.WIDGET_TYPE_CUSTOM_EDITTEXT;
    public static final java.lang.String WIDGET_TYPE_CUSTOM_TEXTVIEW = android.view.textclassifier.TextClassifier.WIDGET_TYPE_CUSTOM_TEXTVIEW;
    public static final java.lang.String WIDGET_TYPE_CUSTOM_UNSELECTABLE_TEXTVIEW = android.view.textclassifier.TextClassifier.WIDGET_TYPE_CUSTOM_UNSELECTABLE_TEXTVIEW;
    public static final java.lang.String WIDGET_TYPE_EDITTEXT = android.view.textclassifier.TextClassifier.WIDGET_TYPE_EDITTEXT;
    public static final java.lang.String WIDGET_TYPE_EDIT_WEBVIEW = android.view.textclassifier.TextClassifier.WIDGET_TYPE_EDIT_WEBVIEW;
    public static final java.lang.String WIDGET_TYPE_NOTIFICATION = android.view.textclassifier.TextClassifier.WIDGET_TYPE_NOTIFICATION;
    public static final java.lang.String WIDGET_TYPE_TEXTVIEW = android.view.textclassifier.TextClassifier.WIDGET_TYPE_TEXTVIEW;
    public static final java.lang.String WIDGET_TYPE_UNKNOWN = android.view.textclassifier.TextClassifier.WIDGET_TYPE_UNKNOWN;
    public static final java.lang.String WIDGET_TYPE_UNSELECTABLE_TEXTVIEW = android.view.textclassifier.TextClassifier.WIDGET_TYPE_UNSELECTABLE_TEXTVIEW;
    public static final java.lang.String WIDGET_TYPE_WEBVIEW = android.view.textclassifier.TextClassifier.WIDGET_TYPE_WEBVIEW;

    public static final class EntityConfig {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EntityConfig(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig wrap(android.view.textclassifier.TextClassifier.EntityConfig real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextClassifier.EntityConfig getReal() {
            return (android.view.textclassifier.TextClassifier.EntityConfig) real;
        }

        public android.view.textclassifier.TextClassifier.EntityConfig unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.TextClassifier.EntityConfig) real).describeContents();
        }

        public boolean shouldIncludeTypesFromTextClassifier() {
            return ((android.view.textclassifier.TextClassifier.EntityConfig) real).shouldIncludeTypesFromTextClassifier();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.TextClassifier.EntityConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.Builder wrap(android.view.textclassifier.TextClassifier.EntityConfig.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textclassifier.TextClassifier.EntityConfig.Builder getReal() {
                return (android.view.textclassifier.TextClassifier.EntityConfig.Builder) real;
            }

            public android.view.textclassifier.TextClassifier.EntityConfig.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.view.textclassifier.TextClassifier.EntityConfig.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.wrap(((android.view.textclassifier.TextClassifier.EntityConfig.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.Builder includeTypesFromTextClassifier(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.Builder.wrap(((android.view.textclassifier.TextClassifier.EntityConfig.Builder) real).includeTypesFromTextClassifier(arg0));
            }

        }
    }
}
