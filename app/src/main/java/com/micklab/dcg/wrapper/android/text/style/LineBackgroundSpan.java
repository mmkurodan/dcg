// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LineBackgroundSpan {
    private final android.text.style.LineBackgroundSpan real;

    public LineBackgroundSpan(android.text.style.LineBackgroundSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan wrap(android.text.style.LineBackgroundSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan(real);
    }

    public android.text.style.LineBackgroundSpan unwrap() {
        return real;
    }

    public void drawBackground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, int arg10) {
        real.drawBackground(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static final class Standard {
        private final android.text.style.LineBackgroundSpan.Standard real;

        public Standard(android.text.style.LineBackgroundSpan.Standard real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan.Standard wrap(android.text.style.LineBackgroundSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineBackgroundSpan.Standard(real);
        }

        public android.text.style.LineBackgroundSpan.Standard unwrap() {
            return real;
        }

        public Standard(int arg0) {
            this(new android.text.style.LineBackgroundSpan.Standard(arg0));
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.LineBackgroundSpan.Standard(arg0 == null ? null : arg0.unwrap()));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void drawBackground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, int arg10) {
            real.drawBackground(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
        }

        public int getColor() {
            return real.getColor();
        }

        public int getSpanTypeId() {
            return real.getSpanTypeId();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
