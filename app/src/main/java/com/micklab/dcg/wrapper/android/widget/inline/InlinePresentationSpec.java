// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.inline;

public final class InlinePresentationSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlinePresentationSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec wrap(android.widget.inline.InlinePresentationSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec(real, (__DcgwBridgeToken) null);
    }

    public android.widget.inline.InlinePresentationSpec getReal() {
        return (android.widget.inline.InlinePresentationSpec) real;
    }

    public android.widget.inline.InlinePresentationSpec unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.widget.inline.InlinePresentationSpec) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.widget.inline.InlinePresentationSpec) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Size getMaxSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(((android.widget.inline.InlinePresentationSpec) real).getMaxSize());
    }

    public com.micklab.dcg.wrapper.android.util.Size getMinSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(((android.widget.inline.InlinePresentationSpec) real).getMinSize());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getStyle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.widget.inline.InlinePresentationSpec) real).getStyle());
    }

    public int hashCode() {
        return ((android.widget.inline.InlinePresentationSpec) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.widget.inline.InlinePresentationSpec) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.widget.inline.InlinePresentationSpec) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder wrap(android.widget.inline.InlinePresentationSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.widget.inline.InlinePresentationSpec.Builder getReal() {
            return (android.widget.inline.InlinePresentationSpec.Builder) real;
        }

        public android.widget.inline.InlinePresentationSpec.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.util.Size arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
            this(new android.widget.inline.InlinePresentationSpec.Builder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec build() {
            return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(((android.widget.inline.InlinePresentationSpec.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder setStyle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.Builder.wrap(((android.widget.inline.InlinePresentationSpec.Builder) real).setStyle(arg0 == null ? null : arg0.getReal()));
        }

    }
}
