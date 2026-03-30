// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.inline;

public final class InlinePresentationSpec {
    private final android.widget.inline.InlinePresentationSpec real;

    public InlinePresentationSpec(android.widget.inline.InlinePresentationSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec wrap(android.widget.inline.InlinePresentationSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec(real);
    }

    public android.widget.inline.InlinePresentationSpec unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Size getMaxSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getMaxSize());
    }

    public com.micklab.dcg.wrapper.android.util.Size getMinSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getMinSize());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getStyle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getStyle());
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


    public static final class Builder {
        private final android.widget.inline.InlinePresentationSpec.Builder real;

        public Builder(android.widget.inline.InlinePresentationSpec.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder wrap(android.widget.inline.InlinePresentationSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder(real);
        }

        public android.widget.inline.InlinePresentationSpec.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.util.Size arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
            this(new android.widget.inline.InlinePresentationSpec.Builder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec build() {
            return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder setStyle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder.wrap(real.setStyle(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
