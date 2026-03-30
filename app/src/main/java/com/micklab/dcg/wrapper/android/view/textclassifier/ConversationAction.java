// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class ConversationAction {
    private final android.view.textclassifier.ConversationAction real;

    public ConversationAction(android.view.textclassifier.ConversationAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction wrap(android.view.textclassifier.ConversationAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction(real);
    }

    public android.view.textclassifier.ConversationAction unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction getAction() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(real.getAction());
    }

    public float getConfidenceScore() {
        return real.getConfidenceScore();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.CharSequence getTextReply() {
        return real.getTextReply();
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.view.textclassifier.ConversationAction.Builder real;

        public Builder(android.view.textclassifier.ConversationAction.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder wrap(android.view.textclassifier.ConversationAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder(real);
        }

        public android.view.textclassifier.ConversationAction.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.view.textclassifier.ConversationAction.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setAction(com.micklab.dcg.wrapper.android.app.RemoteAction arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(real.setAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setConfidenceScore(float arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(real.setConfidenceScore(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder setTextReply(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationAction.Builder.wrap(real.setTextReply(arg0));
        }

    }
}
