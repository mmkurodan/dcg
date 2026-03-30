// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RouteListingPreference {
    private final android.media.RouteListingPreference real;

    public RouteListingPreference(android.media.RouteListingPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RouteListingPreference wrap(android.media.RouteListingPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference(real);
    }

    public android.media.RouteListingPreference unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getLinkedItemComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getLinkedItemComponentName());
    }

    public boolean getUseSystemOrdering() {
        return real.getUseSystemOrdering();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String ACTION_TRANSFER_MEDIA = android.media.RouteListingPreference.ACTION_TRANSFER_MEDIA;
    public static final java.lang.String EXTRA_ROUTE_ID = android.media.RouteListingPreference.EXTRA_ROUTE_ID;

    public static final class Builder {
        private final android.media.RouteListingPreference.Builder real;

        public Builder(android.media.RouteListingPreference.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder wrap(android.media.RouteListingPreference.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder(real);
        }

        public android.media.RouteListingPreference.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.RouteListingPreference.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.RouteListingPreference build() {
            return com.micklab.dcg.wrapper.android.media.RouteListingPreference.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder setLinkedItemComponentName(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder.wrap(real.setLinkedItemComponentName(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder setUseSystemOrdering(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder.wrap(real.setUseSystemOrdering(arg0));
        }

    }
    public static final class Item {
        private final android.media.RouteListingPreference.Item real;

        public Item(android.media.RouteListingPreference.Item real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item wrap(android.media.RouteListingPreference.Item real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item(real);
        }

        public android.media.RouteListingPreference.Item unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.CharSequence getCustomSubtextMessage() {
            return real.getCustomSubtextMessage();
        }

        public int getFlags() {
            return real.getFlags();
        }

        public java.lang.String getRouteId() {
            return real.getRouteId();
        }

        public int getSelectionBehavior() {
            return real.getSelectionBehavior();
        }

        public int getSubText() {
            return real.getSubText();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int FLAG_ONGOING_SESSION = android.media.RouteListingPreference.Item.FLAG_ONGOING_SESSION;
        public static final int FLAG_ONGOING_SESSION_MANAGED = android.media.RouteListingPreference.Item.FLAG_ONGOING_SESSION_MANAGED;
        public static final int FLAG_SUGGESTED = android.media.RouteListingPreference.Item.FLAG_SUGGESTED;
        public static final int SELECTION_BEHAVIOR_GO_TO_APP = android.media.RouteListingPreference.Item.SELECTION_BEHAVIOR_GO_TO_APP;
        public static final int SELECTION_BEHAVIOR_NONE = android.media.RouteListingPreference.Item.SELECTION_BEHAVIOR_NONE;
        public static final int SELECTION_BEHAVIOR_TRANSFER = android.media.RouteListingPreference.Item.SELECTION_BEHAVIOR_TRANSFER;
        public static final int SUBTEXT_AD_ROUTING_DISALLOWED = android.media.RouteListingPreference.Item.SUBTEXT_AD_ROUTING_DISALLOWED;
        public static final int SUBTEXT_CUSTOM = android.media.RouteListingPreference.Item.SUBTEXT_CUSTOM;
        public static final int SUBTEXT_DEVICE_LOW_POWER = android.media.RouteListingPreference.Item.SUBTEXT_DEVICE_LOW_POWER;
        public static final int SUBTEXT_DOWNLOADED_CONTENT_ROUTING_DISALLOWED = android.media.RouteListingPreference.Item.SUBTEXT_DOWNLOADED_CONTENT_ROUTING_DISALLOWED;
        public static final int SUBTEXT_ERROR_UNKNOWN = android.media.RouteListingPreference.Item.SUBTEXT_ERROR_UNKNOWN;
        public static final int SUBTEXT_NONE = android.media.RouteListingPreference.Item.SUBTEXT_NONE;
        public static final int SUBTEXT_SUBSCRIPTION_REQUIRED = android.media.RouteListingPreference.Item.SUBTEXT_SUBSCRIPTION_REQUIRED;
        public static final int SUBTEXT_TRACK_UNSUPPORTED = android.media.RouteListingPreference.Item.SUBTEXT_TRACK_UNSUPPORTED;
        public static final int SUBTEXT_UNAUTHORIZED = android.media.RouteListingPreference.Item.SUBTEXT_UNAUTHORIZED;

        public static final class Builder {
            private final android.media.RouteListingPreference.Item.Builder real;

            public Builder(android.media.RouteListingPreference.Item.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder wrap(android.media.RouteListingPreference.Item.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder(real);
            }

            public android.media.RouteListingPreference.Item.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.String arg0) {
                this(new android.media.RouteListingPreference.Item.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item build() {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setCustomSubtextMessage(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(real.setCustomSubtextMessage(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setFlags(int arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(real.setFlags(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setSelectionBehavior(int arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(real.setSelectionBehavior(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setSubText(int arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(real.setSubText(arg0));
            }

        }
    }
}
