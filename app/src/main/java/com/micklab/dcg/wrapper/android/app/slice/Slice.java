// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class Slice {
    private final android.app.slice.Slice real;

    public Slice(android.app.slice.Slice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.Slice wrap(android.app.slice.Slice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.Slice(real);
    }

    public android.app.slice.Slice unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.slice.SliceSpec getSpec() {
        return com.micklab.dcg.wrapper.android.app.slice.SliceSpec.wrap(real.getSpec());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public boolean isCallerNeeded() {
        return real.isCallerNeeded();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String EXTRA_RANGE_VALUE = android.app.slice.Slice.EXTRA_RANGE_VALUE;
    public static final java.lang.String EXTRA_TOGGLE_STATE = android.app.slice.Slice.EXTRA_TOGGLE_STATE;
    public static final java.lang.String HINT_ACTIONS = android.app.slice.Slice.HINT_ACTIONS;
    public static final java.lang.String HINT_ERROR = android.app.slice.Slice.HINT_ERROR;
    public static final java.lang.String HINT_HORIZONTAL = android.app.slice.Slice.HINT_HORIZONTAL;
    public static final java.lang.String HINT_KEYWORDS = android.app.slice.Slice.HINT_KEYWORDS;
    public static final java.lang.String HINT_LARGE = android.app.slice.Slice.HINT_LARGE;
    public static final java.lang.String HINT_LAST_UPDATED = android.app.slice.Slice.HINT_LAST_UPDATED;
    public static final java.lang.String HINT_LIST = android.app.slice.Slice.HINT_LIST;
    public static final java.lang.String HINT_LIST_ITEM = android.app.slice.Slice.HINT_LIST_ITEM;
    public static final java.lang.String HINT_NO_TINT = android.app.slice.Slice.HINT_NO_TINT;
    public static final java.lang.String HINT_PARTIAL = android.app.slice.Slice.HINT_PARTIAL;
    public static final java.lang.String HINT_PERMISSION_REQUEST = android.app.slice.Slice.HINT_PERMISSION_REQUEST;
    public static final java.lang.String HINT_SEE_MORE = android.app.slice.Slice.HINT_SEE_MORE;
    public static final java.lang.String HINT_SELECTED = android.app.slice.Slice.HINT_SELECTED;
    public static final java.lang.String HINT_SHORTCUT = android.app.slice.Slice.HINT_SHORTCUT;
    public static final java.lang.String HINT_SUMMARY = android.app.slice.Slice.HINT_SUMMARY;
    public static final java.lang.String HINT_TITLE = android.app.slice.Slice.HINT_TITLE;
    public static final java.lang.String HINT_TTL = android.app.slice.Slice.HINT_TTL;
    public static final java.lang.String SUBTYPE_COLOR = android.app.slice.Slice.SUBTYPE_COLOR;
    public static final java.lang.String SUBTYPE_CONTENT_DESCRIPTION = android.app.slice.Slice.SUBTYPE_CONTENT_DESCRIPTION;
    public static final java.lang.String SUBTYPE_LAYOUT_DIRECTION = android.app.slice.Slice.SUBTYPE_LAYOUT_DIRECTION;
    public static final java.lang.String SUBTYPE_MAX = android.app.slice.Slice.SUBTYPE_MAX;
    public static final java.lang.String SUBTYPE_MESSAGE = android.app.slice.Slice.SUBTYPE_MESSAGE;
    public static final java.lang.String SUBTYPE_MILLIS = android.app.slice.Slice.SUBTYPE_MILLIS;
    public static final java.lang.String SUBTYPE_PRIORITY = android.app.slice.Slice.SUBTYPE_PRIORITY;
    public static final java.lang.String SUBTYPE_RANGE = android.app.slice.Slice.SUBTYPE_RANGE;
    public static final java.lang.String SUBTYPE_SOURCE = android.app.slice.Slice.SUBTYPE_SOURCE;
    public static final java.lang.String SUBTYPE_TOGGLE = android.app.slice.Slice.SUBTYPE_TOGGLE;
    public static final java.lang.String SUBTYPE_VALUE = android.app.slice.Slice.SUBTYPE_VALUE;

    public static final class Builder {
        private final android.app.slice.Slice.Builder real;

        public Builder(android.app.slice.Slice.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.slice.Slice.Builder wrap(android.app.slice.Slice.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.Slice.Builder(real);
        }

        public android.app.slice.Slice.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.app.slice.Slice.Builder arg0) {
            this(new android.app.slice.Slice.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.app.slice.SliceSpec arg1) {
            this(new android.app.slice.Slice.Builder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.slice.Slice.Builder addAction(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.app.slice.Slice arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.app.slice.Slice.Builder.wrap(real.addAction(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public com.micklab.dcg.wrapper.android.app.slice.Slice.Builder addSubSlice(com.micklab.dcg.wrapper.android.app.slice.Slice arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.app.slice.Slice.Builder.wrap(real.addSubSlice(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.app.slice.Slice build() {
            return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.slice.Slice.Builder setCallerNeeded(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.slice.Slice.Builder.wrap(real.setCallerNeeded(arg0));
        }

    }
}
