// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.people;

public final class ConversationStatus {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConversationStatus(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.people.ConversationStatus wrap(android.app.people.ConversationStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.people.ConversationStatus(real, (__DcgwBridgeToken) null);
    }

    public android.app.people.ConversationStatus getReal() {
        return (android.app.people.ConversationStatus) real;
    }

    public android.app.people.ConversationStatus unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.people.ConversationStatus) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.people.ConversationStatus) real).equals(arg0);
    }

    public int getActivity() {
        return ((android.app.people.ConversationStatus) real).getActivity();
    }

    public int getAvailability() {
        return ((android.app.people.ConversationStatus) real).getAvailability();
    }

    public java.lang.CharSequence getDescription() {
        return ((android.app.people.ConversationStatus) real).getDescription();
    }

    public long getEndTimeMillis() {
        return ((android.app.people.ConversationStatus) real).getEndTimeMillis();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.people.ConversationStatus) real).getIcon());
    }

    public java.lang.String getId() {
        return ((android.app.people.ConversationStatus) real).getId();
    }

    public long getStartTimeMillis() {
        return ((android.app.people.ConversationStatus) real).getStartTimeMillis();
    }

    public int hashCode() {
        return ((android.app.people.ConversationStatus) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.people.ConversationStatus) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.people.ConversationStatus) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ACTIVITY_ANNIVERSARY = android.app.people.ConversationStatus.ACTIVITY_ANNIVERSARY;
    public static final int ACTIVITY_AUDIO = android.app.people.ConversationStatus.ACTIVITY_AUDIO;
    public static final int ACTIVITY_BIRTHDAY = android.app.people.ConversationStatus.ACTIVITY_BIRTHDAY;
    public static final int ACTIVITY_GAME = android.app.people.ConversationStatus.ACTIVITY_GAME;
    public static final int ACTIVITY_LOCATION = android.app.people.ConversationStatus.ACTIVITY_LOCATION;
    public static final int ACTIVITY_NEW_STORY = android.app.people.ConversationStatus.ACTIVITY_NEW_STORY;
    public static final int ACTIVITY_OTHER = android.app.people.ConversationStatus.ACTIVITY_OTHER;
    public static final int ACTIVITY_UPCOMING_BIRTHDAY = android.app.people.ConversationStatus.ACTIVITY_UPCOMING_BIRTHDAY;
    public static final int ACTIVITY_VIDEO = android.app.people.ConversationStatus.ACTIVITY_VIDEO;
    public static final int AVAILABILITY_AVAILABLE = android.app.people.ConversationStatus.AVAILABILITY_AVAILABLE;
    public static final int AVAILABILITY_BUSY = android.app.people.ConversationStatus.AVAILABILITY_BUSY;
    public static final int AVAILABILITY_OFFLINE = android.app.people.ConversationStatus.AVAILABILITY_OFFLINE;
    public static final int AVAILABILITY_UNKNOWN = android.app.people.ConversationStatus.AVAILABILITY_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder wrap(android.app.people.ConversationStatus.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.people.ConversationStatus.Builder getReal() {
            return (android.app.people.ConversationStatus.Builder) real;
        }

        public android.app.people.ConversationStatus.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, int arg1) {
            this(new android.app.people.ConversationStatus.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus build() {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.wrap(((android.app.people.ConversationStatus.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setAvailability(int arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(((android.app.people.ConversationStatus.Builder) real).setAvailability(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(((android.app.people.ConversationStatus.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setEndTimeMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(((android.app.people.ConversationStatus.Builder) real).setEndTimeMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(((android.app.people.ConversationStatus.Builder) real).setIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setStartTimeMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(((android.app.people.ConversationStatus.Builder) real).setStartTimeMillis(arg0));
        }

    }
}
