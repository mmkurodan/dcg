// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class AlignmentSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlignmentSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.AlignmentSpan wrap(android.text.style.AlignmentSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.AlignmentSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.AlignmentSpan getReal() {
        return (android.text.style.AlignmentSpan) real;
    }

    public android.text.style.AlignmentSpan unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Alignment getAlignment() {
        return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(((android.text.style.AlignmentSpan) real).getAlignment());
    }

    public static final class Standard {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Standard(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.AlignmentSpan.Standard wrap(android.text.style.AlignmentSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.AlignmentSpan.Standard(real, (__DcgwBridgeToken) null);
        }

        public android.text.style.AlignmentSpan.Standard getReal() {
            return (android.text.style.AlignmentSpan.Standard) real;
        }

        public android.text.style.AlignmentSpan.Standard unwrap() {
            return getReal();
        }

        public Standard(com.micklab.dcg.wrapper.android.text.Layout.Alignment arg0) {
            this(new android.text.style.AlignmentSpan.Standard(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.AlignmentSpan.Standard(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.text.style.AlignmentSpan.Standard) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Alignment getAlignment() {
            return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(((android.text.style.AlignmentSpan.Standard) real).getAlignment());
        }

        public int getSpanTypeId() {
            return ((android.text.style.AlignmentSpan.Standard) real).getSpanTypeId();
        }

        public java.lang.String toString() {
            return ((android.text.style.AlignmentSpan.Standard) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.text.style.AlignmentSpan.Standard) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
