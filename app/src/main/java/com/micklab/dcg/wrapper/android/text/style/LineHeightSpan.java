// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LineHeightSpan {
    private final android.text.style.LineHeightSpan real;

    public LineHeightSpan(android.text.style.LineHeightSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineHeightSpan wrap(android.text.style.LineHeightSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineHeightSpan(real);
    }

    public android.text.style.LineHeightSpan unwrap() {
        return real;
    }

    public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5) {
        real.chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public static final class Standard {
        private final android.text.style.LineHeightSpan.Standard real;

        public Standard(android.text.style.LineHeightSpan.Standard real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.Standard wrap(android.text.style.LineHeightSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.Standard(real);
        }

        public android.text.style.LineHeightSpan.Standard unwrap() {
            return real;
        }

        public Standard(int arg0) {
            this(new android.text.style.LineHeightSpan.Standard(arg0));
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.LineHeightSpan.Standard(arg0 == null ? null : arg0.unwrap()));
        }

        public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5) {
            real.chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public int getHeight() {
            return real.getHeight();
        }

        public int getSpanTypeId() {
            return real.getSpanTypeId();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class WithDensity {
        private final android.text.style.LineHeightSpan.WithDensity real;

        public WithDensity(android.text.style.LineHeightSpan.WithDensity real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.WithDensity wrap(android.text.style.LineHeightSpan.WithDensity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.WithDensity(real);
        }

        public android.text.style.LineHeightSpan.WithDensity unwrap() {
            return real;
        }

        public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5, com.micklab.dcg.wrapper.android.text.TextPaint arg6) {
            real.chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
        }

    }
}
