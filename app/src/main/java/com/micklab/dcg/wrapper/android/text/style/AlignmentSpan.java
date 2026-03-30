// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class AlignmentSpan {
    private final android.text.style.AlignmentSpan real;

    public AlignmentSpan(android.text.style.AlignmentSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.AlignmentSpan wrap(android.text.style.AlignmentSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.AlignmentSpan(real);
    }

    public android.text.style.AlignmentSpan unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.text.Layout.Alignment getAlignment() {
        return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(real.getAlignment());
    }

    public static final class Standard {
        private final android.text.style.AlignmentSpan.Standard real;

        public Standard(android.text.style.AlignmentSpan.Standard real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.AlignmentSpan.Standard wrap(android.text.style.AlignmentSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.AlignmentSpan.Standard(real);
        }

        public android.text.style.AlignmentSpan.Standard unwrap() {
            return real;
        }

        public Standard(com.micklab.dcg.wrapper.android.text.Layout.Alignment arg0) {
            this(new android.text.style.AlignmentSpan.Standard(arg0 == null ? null : arg0.unwrap()));
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.AlignmentSpan.Standard(arg0 == null ? null : arg0.unwrap()));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.text.Layout.Alignment getAlignment() {
            return com.micklab.dcg.wrapper.android.text.Layout.Alignment.wrap(real.getAlignment());
        }

        public int getSpanTypeId() {
            return real.getSpanTypeId();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
