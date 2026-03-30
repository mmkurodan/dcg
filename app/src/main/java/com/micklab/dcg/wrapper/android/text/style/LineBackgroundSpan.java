// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LineBackgroundSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LineBackgroundSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan wrap(android.text.style.LineBackgroundSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.LineBackgroundSpan getReal() {
        return (android.text.style.LineBackgroundSpan) real;
    }

    public android.text.style.LineBackgroundSpan unwrap() {
        return getReal();
    }

    public void drawBackground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, int arg10) {
        ((android.text.style.LineBackgroundSpan) real).drawBackground(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static final class Standard {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Standard(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan.Standard wrap(android.text.style.LineBackgroundSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan.Standard(real, (__DcgwBridgeToken) null);
        }

        public android.text.style.LineBackgroundSpan.Standard getReal() {
            return (android.text.style.LineBackgroundSpan.Standard) real;
        }

        public android.text.style.LineBackgroundSpan.Standard unwrap() {
            return getReal();
        }

        public Standard(int arg0) {
            this(new android.text.style.LineBackgroundSpan.Standard(arg0), (__DcgwBridgeToken) null);
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.LineBackgroundSpan.Standard(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.text.style.LineBackgroundSpan.Standard) real).describeContents();
        }

        public void drawBackground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, int arg10) {
            ((android.text.style.LineBackgroundSpan.Standard) real).drawBackground(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
        }

        public int getColor() {
            return ((android.text.style.LineBackgroundSpan.Standard) real).getColor();
        }

        public int getSpanTypeId() {
            return ((android.text.style.LineBackgroundSpan.Standard) real).getSpanTypeId();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.text.style.LineBackgroundSpan.Standard) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
