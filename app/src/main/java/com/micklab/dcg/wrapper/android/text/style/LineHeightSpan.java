// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LineHeightSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LineHeightSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineHeightSpan wrap(android.text.style.LineHeightSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineHeightSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.LineHeightSpan getReal() {
        return (android.text.style.LineHeightSpan) real;
    }

    public android.text.style.LineHeightSpan unwrap() {
        return getReal();
    }

    public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5) {
        ((android.text.style.LineHeightSpan) real).chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public static final class Standard {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Standard(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.Standard wrap(android.text.style.LineHeightSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.Standard(real, (__DcgwBridgeToken) null);
        }

        public android.text.style.LineHeightSpan.Standard getReal() {
            return (android.text.style.LineHeightSpan.Standard) real;
        }

        public android.text.style.LineHeightSpan.Standard unwrap() {
            return getReal();
        }

        public Standard(int arg0) {
            this(new android.text.style.LineHeightSpan.Standard(arg0), (__DcgwBridgeToken) null);
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.LineHeightSpan.Standard(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5) {
            ((android.text.style.LineHeightSpan.Standard) real).chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
        }

        public int describeContents() {
            return ((android.text.style.LineHeightSpan.Standard) real).describeContents();
        }

        public int getHeight() {
            return ((android.text.style.LineHeightSpan.Standard) real).getHeight();
        }

        public int getSpanTypeId() {
            return ((android.text.style.LineHeightSpan.Standard) real).getSpanTypeId();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.text.style.LineHeightSpan.Standard) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class WithDensity {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WithDensity(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.WithDensity wrap(android.text.style.LineHeightSpan.WithDensity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineHeightSpan.WithDensity(real, (__DcgwBridgeToken) null);
        }

        public android.text.style.LineHeightSpan.WithDensity getReal() {
            return (android.text.style.LineHeightSpan.WithDensity) real;
        }

        public android.text.style.LineHeightSpan.WithDensity unwrap() {
            return getReal();
        }

        public void chooseHeight(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Paint.FontMetricsInt arg5, com.micklab.dcg.wrapper.android.text.TextPaint arg6) {
            ((android.text.style.LineHeightSpan.WithDensity) real).chooseHeight(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
        }

    }
}
