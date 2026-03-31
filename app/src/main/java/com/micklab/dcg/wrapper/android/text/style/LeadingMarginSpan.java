// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LeadingMarginSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LeadingMarginSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan wrap(android.text.style.LeadingMarginSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.LeadingMarginSpan getReal() {
        return (android.text.style.LeadingMarginSpan) real;
    }

    public android.text.style.LeadingMarginSpan unwrap() {
        return getReal();
    }

    public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
        ((android.text.style.LeadingMarginSpan) real).drawLeadingMargin(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.getReal());
    }

    public int getLeadingMargin(boolean arg0) {
        return ((android.text.style.LeadingMarginSpan) real).getLeadingMargin(arg0);
    }

    public static final class LeadingMarginSpan2 {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LeadingMarginSpan2(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.LeadingMarginSpan2 wrap(android.text.style.LeadingMarginSpan.LeadingMarginSpan2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.LeadingMarginSpan2(real, (__DcgwBridgeToken) null);
        }

        public android.text.style.LeadingMarginSpan.LeadingMarginSpan2 getReal() {
            return (android.text.style.LeadingMarginSpan.LeadingMarginSpan2) real;
        }

        public android.text.style.LeadingMarginSpan.LeadingMarginSpan2 unwrap() {
            return getReal();
        }

        public int getLeadingMarginLineCount() {
            return ((android.text.style.LeadingMarginSpan.LeadingMarginSpan2) real).getLeadingMarginLineCount();
        }

    }
    public static final class Standard {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Standard(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.Standard wrap(android.text.style.LeadingMarginSpan.Standard real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LeadingMarginSpan.Standard(real, (__DcgwBridgeToken) null);
        }

        public android.text.style.LeadingMarginSpan.Standard getReal() {
            return (android.text.style.LeadingMarginSpan.Standard) real;
        }

        public android.text.style.LeadingMarginSpan.Standard unwrap() {
            return getReal();
        }

        public Standard(int arg0) {
            this(new android.text.style.LeadingMarginSpan.Standard(arg0), (__DcgwBridgeToken) null);
        }

        public Standard(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.text.style.LeadingMarginSpan.Standard(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Standard(int arg0, int arg1) {
            this(new android.text.style.LeadingMarginSpan.Standard(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.text.style.LeadingMarginSpan.Standard) real).describeContents();
        }

        public void drawLeadingMargin(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.lang.CharSequence arg7, int arg8, int arg9, boolean arg10, com.micklab.dcg.wrapper.android.text.Layout arg11) {
            ((android.text.style.LeadingMarginSpan.Standard) real).drawLeadingMargin(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 == null ? null : arg11.getReal());
        }

        public int getLeadingMargin(boolean arg0) {
            return ((android.text.style.LeadingMarginSpan.Standard) real).getLeadingMargin(arg0);
        }

        public int getSpanTypeId() {
            return ((android.text.style.LeadingMarginSpan.Standard) real).getSpanTypeId();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.text.style.LeadingMarginSpan.Standard) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
