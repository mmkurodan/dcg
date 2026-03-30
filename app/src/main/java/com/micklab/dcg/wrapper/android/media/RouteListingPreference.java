// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RouteListingPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RouteListingPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RouteListingPreference wrap(android.media.RouteListingPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference(real, (__DcgwBridgeToken) null);
    }

    public android.media.RouteListingPreference getReal() {
        return (android.media.RouteListingPreference) real;
    }

    public android.media.RouteListingPreference unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.RouteListingPreference) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.RouteListingPreference) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getLinkedItemComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.media.RouteListingPreference) real).getLinkedItemComponentName());
    }

    public boolean getUseSystemOrdering() {
        return ((android.media.RouteListingPreference) real).getUseSystemOrdering();
    }

    public int hashCode() {
        return ((android.media.RouteListingPreference) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.RouteListingPreference) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String ACTION_TRANSFER_MEDIA = android.media.RouteListingPreference.ACTION_TRANSFER_MEDIA;
    public static final java.lang.String EXTRA_ROUTE_ID = android.media.RouteListingPreference.EXTRA_ROUTE_ID;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder wrap(android.media.RouteListingPreference.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.RouteListingPreference.Builder getReal() {
            return (android.media.RouteListingPreference.Builder) real;
        }

        public android.media.RouteListingPreference.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.RouteListingPreference.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.RouteListingPreference build() {
            return com.micklab.dcg.wrapper.android.media.RouteListingPreference.wrap(((android.media.RouteListingPreference.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder setLinkedItemComponentName(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder.wrap(((android.media.RouteListingPreference.Builder) real).setLinkedItemComponentName(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder setUseSystemOrdering(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Builder.wrap(((android.media.RouteListingPreference.Builder) real).setUseSystemOrdering(arg0));
        }

    }
    public static final class Item {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Item(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item wrap(android.media.RouteListingPreference.Item real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item(real, (__DcgwBridgeToken) null);
        }

        public android.media.RouteListingPreference.Item getReal() {
            return (android.media.RouteListingPreference.Item) real;
        }

        public android.media.RouteListingPreference.Item unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.media.RouteListingPreference.Item) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.RouteListingPreference.Item) real).equals(arg0);
        }

        public java.lang.CharSequence getCustomSubtextMessage() {
            return ((android.media.RouteListingPreference.Item) real).getCustomSubtextMessage();
        }

        public int getFlags() {
            return ((android.media.RouteListingPreference.Item) real).getFlags();
        }

        public java.lang.String getRouteId() {
            return ((android.media.RouteListingPreference.Item) real).getRouteId();
        }

        public int getSelectionBehavior() {
            return ((android.media.RouteListingPreference.Item) real).getSelectionBehavior();
        }

        public int getSubText() {
            return ((android.media.RouteListingPreference.Item) real).getSubText();
        }

        public int hashCode() {
            return ((android.media.RouteListingPreference.Item) real).hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.RouteListingPreference.Item) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder wrap(android.media.RouteListingPreference.Item.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.media.RouteListingPreference.Item.Builder getReal() {
                return (android.media.RouteListingPreference.Item.Builder) real;
            }

            public android.media.RouteListingPreference.Item.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.String arg0) {
                this(new android.media.RouteListingPreference.Item.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item build() {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.wrap(((android.media.RouteListingPreference.Item.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setCustomSubtextMessage(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(((android.media.RouteListingPreference.Item.Builder) real).setCustomSubtextMessage(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setFlags(int arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(((android.media.RouteListingPreference.Item.Builder) real).setFlags(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setSelectionBehavior(int arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(((android.media.RouteListingPreference.Item.Builder) real).setSelectionBehavior(arg0));
            }

            public com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder setSubText(int arg0) {
                return com.micklab.dcg.wrapper.android.media.RouteListingPreference.Item.Builder.wrap(((android.media.RouteListingPreference.Item.Builder) real).setSubText(arg0));
            }

        }
    }
}
