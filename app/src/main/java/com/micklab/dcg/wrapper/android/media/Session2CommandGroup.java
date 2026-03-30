// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Session2CommandGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Session2CommandGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Session2CommandGroup wrap(android.media.Session2CommandGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2CommandGroup(real, (__DcgwBridgeToken) null);
    }

    public android.media.Session2CommandGroup getReal() {
        return (android.media.Session2CommandGroup) real;
    }

    public android.media.Session2CommandGroup unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.Session2CommandGroup) real).describeContents();
    }

    public boolean hasCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0) {
        return ((android.media.Session2CommandGroup) real).hasCommand(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasCommand(int arg0) {
        return ((android.media.Session2CommandGroup) real).hasCommand(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.Session2CommandGroup) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder wrap(android.media.Session2CommandGroup.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.Session2CommandGroup.Builder getReal() {
            return (android.media.Session2CommandGroup.Builder) real;
        }

        public android.media.Session2CommandGroup.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.Session2CommandGroup.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.media.Session2CommandGroup arg0) {
            this(new android.media.Session2CommandGroup.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder addCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0) {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder.wrap(((android.media.Session2CommandGroup.Builder) real).addCommand(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup build() {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.wrap(((android.media.Session2CommandGroup.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder removeCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0) {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder.wrap(((android.media.Session2CommandGroup.Builder) real).removeCommand(arg0 == null ? null : arg0.getReal()));
        }

    }
}
