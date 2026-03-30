// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class DirectAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DirectAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.DirectAction wrap(android.app.DirectAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.DirectAction(real, (__DcgwBridgeToken) null);
    }

    public android.app.DirectAction getReal() {
        return (android.app.DirectAction) real;
    }

    public android.app.DirectAction unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.DirectAction) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.DirectAction) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.DirectAction) real).getExtras());
    }

    public java.lang.String getId() {
        return ((android.app.DirectAction) real).getId();
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(((android.app.DirectAction) real).getLocusId());
    }

    public int hashCode() {
        return ((android.app.DirectAction) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.DirectAction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.DirectAction.Builder wrap(android.app.DirectAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.DirectAction.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.DirectAction.Builder getReal() {
            return (android.app.DirectAction.Builder) real;
        }

        public android.app.DirectAction.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.DirectAction.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.DirectAction build() {
            return com.micklab.dcg.wrapper.android.app.DirectAction.wrap(((android.app.DirectAction.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.DirectAction.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.DirectAction.Builder.wrap(((android.app.DirectAction.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.DirectAction.Builder setLocusId(com.micklab.dcg.wrapper.android.content.LocusId arg0) {
            return com.micklab.dcg.wrapper.android.app.DirectAction.Builder.wrap(((android.app.DirectAction.Builder) real).setLocusId(arg0 == null ? null : arg0.getReal()));
        }

    }
}
