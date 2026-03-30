// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class DirectAction {
    private final android.app.DirectAction real;

    public DirectAction(android.app.DirectAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.DirectAction wrap(android.app.DirectAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.DirectAction(real);
    }

    public android.app.DirectAction unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(real.getLocusId());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.DirectAction.Builder real;

        public Builder(android.app.DirectAction.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.DirectAction.Builder wrap(android.app.DirectAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.DirectAction.Builder(real);
        }

        public android.app.DirectAction.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.DirectAction.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DirectAction build() {
            return com.micklab.dcg.wrapper.android.app.DirectAction.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.DirectAction.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.DirectAction.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.DirectAction.Builder setLocusId(com.micklab.dcg.wrapper.android.content.LocusId arg0) {
            return com.micklab.dcg.wrapper.android.app.DirectAction.Builder.wrap(real.setLocusId(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
