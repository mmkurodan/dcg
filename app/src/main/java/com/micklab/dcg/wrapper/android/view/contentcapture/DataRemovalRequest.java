// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class DataRemovalRequest {
    private final android.view.contentcapture.DataRemovalRequest real;

    public DataRemovalRequest(android.view.contentcapture.DataRemovalRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest wrap(android.view.contentcapture.DataRemovalRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest(real);
    }

    public android.view.contentcapture.DataRemovalRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public boolean isForEverything() {
        return real.isForEverything();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_IS_PREFIX = android.view.contentcapture.DataRemovalRequest.FLAG_IS_PREFIX;

    public static final class Builder {
        private final android.view.contentcapture.DataRemovalRequest.Builder real;

        public Builder(android.view.contentcapture.DataRemovalRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder wrap(android.view.contentcapture.DataRemovalRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder(real);
        }

        public android.view.contentcapture.DataRemovalRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.contentcapture.DataRemovalRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder addLocusId(com.micklab.dcg.wrapper.android.content.LocusId arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder.wrap(real.addLocusId(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest build() {
            return com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder forEverything() {
            return com.micklab.dcg.wrapper.android.view.contentcapture.DataRemovalRequest.Builder.wrap(real.forEverything());
        }

    }
}
