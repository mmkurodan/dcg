// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class PhoneAccount {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PhoneAccount(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.PhoneAccount wrap(android.telecom.PhoneAccount real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.PhoneAccount(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.PhoneAccount getReal() {
        return (android.telecom.PhoneAccount) real;
    }

    public android.telecom.PhoneAccount unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder builder(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(android.telecom.PhoneAccount.builder(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public int describeContents() {
        return ((android.telecom.PhoneAccount) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.telecom.PhoneAccount) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle getAccountHandle() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle.wrap(((android.telecom.PhoneAccount) real).getAccountHandle());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.PhoneAccount) real).getAddress());
    }

    public int getCapabilities() {
        return ((android.telecom.PhoneAccount) real).getCapabilities();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.telecom.PhoneAccount) real).getExtras());
    }

    public int getHighlightColor() {
        return ((android.telecom.PhoneAccount) real).getHighlightColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.telecom.PhoneAccount) real).getIcon());
    }

    public java.lang.CharSequence getLabel() {
        return ((android.telecom.PhoneAccount) real).getLabel();
    }

    public java.lang.CharSequence getShortDescription() {
        return ((android.telecom.PhoneAccount) real).getShortDescription();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSubscriptionAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.PhoneAccount) real).getSubscriptionAddress());
    }

    public boolean hasCapabilities(int arg0) {
        return ((android.telecom.PhoneAccount) real).hasCapabilities(arg0);
    }

    public boolean hasSimultaneousCallingRestriction() {
        return ((android.telecom.PhoneAccount) real).hasSimultaneousCallingRestriction();
    }

    public int hashCode() {
        return ((android.telecom.PhoneAccount) real).hashCode();
    }

    public boolean isEnabled() {
        return ((android.telecom.PhoneAccount) real).isEnabled();
    }

    public boolean supportsUriScheme(java.lang.String arg0) {
        return ((android.telecom.PhoneAccount) real).supportsUriScheme(arg0);
    }

    public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder toBuilder() {
        return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount) real).toBuilder());
    }

    public java.lang.String toString() {
        return ((android.telecom.PhoneAccount) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.PhoneAccount) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CAPABILITY_ADHOC_CONFERENCE_CALLING = android.telecom.PhoneAccount.CAPABILITY_ADHOC_CONFERENCE_CALLING;
    public static final int CAPABILITY_CALL_COMPOSER = android.telecom.PhoneAccount.CAPABILITY_CALL_COMPOSER;
    public static final int CAPABILITY_CALL_PROVIDER = android.telecom.PhoneAccount.CAPABILITY_CALL_PROVIDER;
    public static final int CAPABILITY_CALL_SUBJECT = android.telecom.PhoneAccount.CAPABILITY_CALL_SUBJECT;
    public static final int CAPABILITY_CONNECTION_MANAGER = android.telecom.PhoneAccount.CAPABILITY_CONNECTION_MANAGER;
    public static final int CAPABILITY_PLACE_EMERGENCY_CALLS = android.telecom.PhoneAccount.CAPABILITY_PLACE_EMERGENCY_CALLS;
    public static final int CAPABILITY_RTT = android.telecom.PhoneAccount.CAPABILITY_RTT;
    public static final int CAPABILITY_SELF_MANAGED = android.telecom.PhoneAccount.CAPABILITY_SELF_MANAGED;
    public static final int CAPABILITY_SIM_SUBSCRIPTION = android.telecom.PhoneAccount.CAPABILITY_SIM_SUBSCRIPTION;
    public static final int CAPABILITY_SUPPORTS_CALL_STREAMING = android.telecom.PhoneAccount.CAPABILITY_SUPPORTS_CALL_STREAMING;
    public static final int CAPABILITY_SUPPORTS_TRANSACTIONAL_OPERATIONS = android.telecom.PhoneAccount.CAPABILITY_SUPPORTS_TRANSACTIONAL_OPERATIONS;
    public static final int CAPABILITY_SUPPORTS_VIDEO_CALLING = android.telecom.PhoneAccount.CAPABILITY_SUPPORTS_VIDEO_CALLING;
    public static final int CAPABILITY_SUPPORTS_VOICE_CALLING_INDICATIONS = android.telecom.PhoneAccount.CAPABILITY_SUPPORTS_VOICE_CALLING_INDICATIONS;
    public static final int CAPABILITY_VIDEO_CALLING = android.telecom.PhoneAccount.CAPABILITY_VIDEO_CALLING;
    public static final int CAPABILITY_VIDEO_CALLING_RELIES_ON_PRESENCE = android.telecom.PhoneAccount.CAPABILITY_VIDEO_CALLING_RELIES_ON_PRESENCE;
    public static final int CAPABILITY_VOICE_CALLING_AVAILABLE = android.telecom.PhoneAccount.CAPABILITY_VOICE_CALLING_AVAILABLE;
    public static final java.lang.String EXTRA_ADD_SELF_MANAGED_CALLS_TO_INCALLSERVICE = android.telecom.PhoneAccount.EXTRA_ADD_SELF_MANAGED_CALLS_TO_INCALLSERVICE;
    public static final java.lang.String EXTRA_ALWAYS_USE_VOIP_AUDIO_MODE = android.telecom.PhoneAccount.EXTRA_ALWAYS_USE_VOIP_AUDIO_MODE;
    public static final java.lang.String EXTRA_CALL_SUBJECT_CHARACTER_ENCODING = android.telecom.PhoneAccount.EXTRA_CALL_SUBJECT_CHARACTER_ENCODING;
    public static final java.lang.String EXTRA_CALL_SUBJECT_MAX_LENGTH = android.telecom.PhoneAccount.EXTRA_CALL_SUBJECT_MAX_LENGTH;
    public static final java.lang.String EXTRA_LOG_SELF_MANAGED_CALLS = android.telecom.PhoneAccount.EXTRA_LOG_SELF_MANAGED_CALLS;
    public static final java.lang.String EXTRA_SUPPORTS_HANDOVER_FROM = android.telecom.PhoneAccount.EXTRA_SUPPORTS_HANDOVER_FROM;
    public static final java.lang.String EXTRA_SUPPORTS_HANDOVER_TO = android.telecom.PhoneAccount.EXTRA_SUPPORTS_HANDOVER_TO;
    public static final int NO_HIGHLIGHT_COLOR = android.telecom.PhoneAccount.NO_HIGHLIGHT_COLOR;
    public static final int NO_RESOURCE_ID = android.telecom.PhoneAccount.NO_RESOURCE_ID;
    public static final java.lang.String SCHEME_SIP = android.telecom.PhoneAccount.SCHEME_SIP;
    public static final java.lang.String SCHEME_TEL = android.telecom.PhoneAccount.SCHEME_TEL;
    public static final java.lang.String SCHEME_VOICEMAIL = android.telecom.PhoneAccount.SCHEME_VOICEMAIL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder wrap(android.telecom.PhoneAccount.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.PhoneAccount.Builder getReal() {
            return (android.telecom.PhoneAccount.Builder) real;
        }

        public android.telecom.PhoneAccount.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.telecom.PhoneAccount arg0) {
            this(new android.telecom.PhoneAccount.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle arg0, java.lang.CharSequence arg1) {
            this(new android.telecom.PhoneAccount.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder addSupportedUriScheme(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).addSupportedUriScheme(arg0));
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount build() {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.wrap(((android.telecom.PhoneAccount.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder clearSimultaneousCallingRestriction() {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).clearSimultaneousCallingRestriction());
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder setAddress(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).setAddress(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder setCapabilities(int arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).setCapabilities(arg0));
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder setHighlightColor(int arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).setHighlightColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).setIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder setShortDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).setShortDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder setSubscriptionAddress(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.telecom.PhoneAccount.Builder.wrap(((android.telecom.PhoneAccount.Builder) real).setSubscriptionAddress(arg0 == null ? null : arg0.getReal()));
        }

    }
}
