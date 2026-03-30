// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LeadingMarginSpan {
    private final android.text.style.LeadingMarginSpan real;

    public LeadingMarginSpan(android.text.style.LeadingMarginSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan wrap(android.text.style.LeadingMarginSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan(real);
    }

    public android.text.style.LeadingMarginSpan unwrap() {
        return real;
    }

    public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
        real.drawLeadingMargin(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.unwrap());
    }

    public int getLeadingMargin(boolean arg0) {
        return real.getLeadingMargin(arg0);
    }

    public static final class LeadingMarginSpan2 {
        private final android.text.style.LeadingMarginSpan.LeadingMarginSpan2 real;

        public LeadingMarginSpan2(android.text.style.LeadingMarginSpan.LeadingMarginSpan2 real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.LeadingMarginSpan2 wrap(android.text.style.LeadingMarginSpan.LeadingMarginSpan2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.LeadingMarginSpan2(real);
        }

        public android.text.style.LeadingMarginSpan.LeadingMarginSpan2 unwrap() {
            return real;
        }

        public int getLeadingMarginLineCount() {
            return real.getLeadingMarginLineCount();
        }

    }
    public static final class Standard {
        private final android.text.style.LeadingMarginSpan.Standard real;

        public Standard(android.text.style.LeadingMarginSpan.Standard real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.Standard wrap(android.text.style.LeadingMarginSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.Standard(real);
        }

        public android.text.style.LeadingMarginSpan.Standard unwrap() {
            return real;
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.LeadingMarginSpan.Standard(arg0 == null ? null : arg0.unwrap()));
        }

        public Standard(int arg0) {
            this(new android.text.style.LeadingMarginSpan.Standard(arg0));
        }

        public Standard(int arg0, int arg1) {
            this(new android.text.style.LeadingMarginSpan.Standard(arg0, arg1));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
            real.drawLeadingMargin(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.unwrap());
        }

        public int getLeadingMargin(boolean arg0) {
            return real.getLeadingMargin(arg0);
        }

        public int getSpanTypeId() {
            return real.getSpanTypeId();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
