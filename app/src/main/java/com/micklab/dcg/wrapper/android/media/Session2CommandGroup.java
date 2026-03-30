// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Session2CommandGroup {
    private final android.media.Session2CommandGroup real;

    public Session2CommandGroup(android.media.Session2CommandGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Session2CommandGroup wrap(android.media.Session2CommandGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2CommandGroup(real);
    }

    public android.media.Session2CommandGroup unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean hasCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0) {
        return real.hasCommand(arg0 == null ? null : arg0.unwrap());
    }

    public boolean hasCommand(int arg0) {
        return real.hasCommand(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.media.Session2CommandGroup.Builder real;

        public Builder(android.media.Session2CommandGroup.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder wrap(android.media.Session2CommandGroup.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder(real);
        }

        public android.media.Session2CommandGroup.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.Session2CommandGroup.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.media.Session2CommandGroup arg0) {
            this(new android.media.Session2CommandGroup.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder addCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0) {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder.wrap(real.addCommand(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup build() {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder removeCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0) {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.Builder.wrap(real.removeCommand(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
