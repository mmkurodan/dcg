// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.people;

public final class ConversationStatus {
    private final android.app.people.ConversationStatus real;

    public ConversationStatus(android.app.people.ConversationStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.people.ConversationStatus wrap(android.app.people.ConversationStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.people.ConversationStatus(real);
    }

    public android.app.people.ConversationStatus unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getActivity() {
        return real.getActivity();
    }

    public int getAvailability() {
        return real.getAvailability();
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public long getEndTimeMillis() {
        return real.getEndTimeMillis();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public long getStartTimeMillis() {
        return real.getStartTimeMillis();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.app.people.ConversationStatus.Builder real;

        public Builder(android.app.people.ConversationStatus.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder wrap(android.app.people.ConversationStatus.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder(real);
        }

        public android.app.people.ConversationStatus.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, int arg1) {
            this(new android.app.people.ConversationStatus.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus build() {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setAvailability(int arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(real.setAvailability(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setEndTimeMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(real.setEndTimeMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(real.setIcon(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder setStartTimeMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.people.ConversationStatus.Builder.wrap(real.setStartTimeMillis(arg0));
        }

    }
}
