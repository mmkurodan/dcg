// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class ConversationAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConversationAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction wrap(android.view.textclassifier.ConversationAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.ConversationAction getReal() {
        return (android.view.textclassifier.ConversationAction) real;
    }

    public android.view.textclassifier.ConversationAction unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textclassifier.ConversationAction) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction getAction() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(((android.view.textclassifier.ConversationAction) real).getAction());
    }

    public float getConfidenceScore() {
        return ((android.view.textclassifier.ConversationAction) real).getConfidenceScore();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.ConversationAction) real).getExtras());
    }

    public java.lang.CharSequence getTextReply() {
        return ((android.view.textclassifier.ConversationAction) real).getTextReply();
    }

    public java.lang.String getType() {
        return ((android.view.textclassifier.ConversationAction) real).getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.ConversationAction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String TYPE_CALL_PHONE = android.view.textclassifier.ConversationAction.TYPE_CALL_PHONE;
    public static final java.lang.String TYPE_CREATE_REMINDER = android.view.textclassifier.ConversationAction.TYPE_CREATE_REMINDER;
    public static final java.lang.String TYPE_OPEN_URL = android.view.textclassifier.ConversationAction.TYPE_OPEN_URL;
    public static final java.lang.String TYPE_SEND_EMAIL = android.view.textclassifier.ConversationAction.TYPE_SEND_EMAIL;
    public static final java.lang.String TYPE_SEND_SMS = android.view.textclassifier.ConversationAction.TYPE_SEND_SMS;
    public static final java.lang.String TYPE_SHARE_LOCATION = android.view.textclassifier.ConversationAction.TYPE_SHARE_LOCATION;
    public static final java.lang.String TYPE_TEXT_REPLY = android.view.textclassifier.ConversationAction.TYPE_TEXT_REPLY;
    public static final java.lang.String TYPE_TRACK_FLIGHT = android.view.textclassifier.ConversationAction.TYPE_TRACK_FLIGHT;
    public static final java.lang.String TYPE_VIEW_CALENDAR = android.view.textclassifier.ConversationAction.TYPE_VIEW_CALENDAR;
    public static final java.lang.String TYPE_VIEW_MAP = android.view.textclassifier.ConversationAction.TYPE_VIEW_MAP;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder wrap(android.view.textclassifier.ConversationAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.ConversationAction.Builder getReal() {
            return (android.view.textclassifier.ConversationAction.Builder) real;
        }

        public android.view.textclassifier.ConversationAction.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.view.textclassifier.ConversationAction.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.wrap(((android.view.textclassifier.ConversationAction.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setAction(com.micklab.dcg.wrapper.android.app.RemoteAction arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(((android.view.textclassifier.ConversationAction.Builder) real).setAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setConfidenceScore(float arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(((android.view.textclassifier.ConversationAction.Builder) real).setConfidenceScore(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(((android.view.textclassifier.ConversationAction.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setTextReply(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(((android.view.textclassifier.ConversationAction.Builder) real).setTextReply(arg0));
        }

    }
}
