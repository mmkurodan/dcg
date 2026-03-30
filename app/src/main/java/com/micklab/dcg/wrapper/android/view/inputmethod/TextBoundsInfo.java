// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextBoundsInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextBoundsInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo wrap(android.view.inputmethod.TextBoundsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.TextBoundsInfo getReal() {
        return (android.view.inputmethod.TextBoundsInfo) real;
    }

    public android.view.inputmethod.TextBoundsInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.TextBoundsInfo) real).describeContents();
    }

    public int getCharacterBidiLevel(int arg0) {
        return ((android.view.inputmethod.TextBoundsInfo) real).getCharacterBidiLevel(arg0);
    }

    public void getCharacterBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        ((android.view.inputmethod.TextBoundsInfo) real).getCharacterBounds(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int getCharacterFlags(int arg0) {
        return ((android.view.inputmethod.TextBoundsInfo) real).getCharacterFlags(arg0);
    }

    public int getEndIndex() {
        return ((android.view.inputmethod.TextBoundsInfo) real).getEndIndex();
    }

    public com.micklab.dcg.wrapper.android.text.SegmentFinder getGraphemeSegmentFinder() {
        return com.micklab.dcg.wrapper.android.text.SegmentFinder.wrap(((android.view.inputmethod.TextBoundsInfo) real).getGraphemeSegmentFinder());
    }

    public com.micklab.dcg.wrapper.android.text.SegmentFinder getLineSegmentFinder() {
        return com.micklab.dcg.wrapper.android.text.SegmentFinder.wrap(((android.view.inputmethod.TextBoundsInfo) real).getLineSegmentFinder());
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.view.inputmethod.TextBoundsInfo) real).getMatrix(arg0 == null ? null : arg0.getReal());
    }

    public int getOffsetForPosition(float arg0, float arg1) {
        return ((android.view.inputmethod.TextBoundsInfo) real).getOffsetForPosition(arg0, arg1);
    }

    public int[] getRangeForRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.text.SegmentFinder arg1, com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy arg2) {
        return ((android.view.inputmethod.TextBoundsInfo) real).getRangeForRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int getStartIndex() {
        return ((android.view.inputmethod.TextBoundsInfo) real).getStartIndex();
    }

    public com.micklab.dcg.wrapper.android.text.SegmentFinder getWordSegmentFinder() {
        return com.micklab.dcg.wrapper.android.text.SegmentFinder.wrap(((android.view.inputmethod.TextBoundsInfo) real).getWordSegmentFinder());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.TextBoundsInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_CHARACTER_LINEFEED = android.view.inputmethod.TextBoundsInfo.FLAG_CHARACTER_LINEFEED;
    public static final int FLAG_CHARACTER_PUNCTUATION = android.view.inputmethod.TextBoundsInfo.FLAG_CHARACTER_PUNCTUATION;
    public static final int FLAG_CHARACTER_WHITESPACE = android.view.inputmethod.TextBoundsInfo.FLAG_CHARACTER_WHITESPACE;
    public static final int FLAG_LINE_IS_RTL = android.view.inputmethod.TextBoundsInfo.FLAG_LINE_IS_RTL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder wrap(android.view.inputmethod.TextBoundsInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.TextBoundsInfo.Builder getReal() {
            return (android.view.inputmethod.TextBoundsInfo.Builder) real;
        }

        public android.view.inputmethod.TextBoundsInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1) {
            this(new android.view.inputmethod.TextBoundsInfo.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder clear() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).clear());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setCharacterBidiLevel(int[] arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setCharacterBidiLevel(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setCharacterBounds(float[] arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setCharacterBounds(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setCharacterFlags(int[] arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setCharacterFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setGraphemeSegmentFinder(com.micklab.dcg.wrapper.android.text.SegmentFinder arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setGraphemeSegmentFinder(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setLineSegmentFinder(com.micklab.dcg.wrapper.android.text.SegmentFinder arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setLineSegmentFinder(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setMatrix(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setStartAndEnd(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setStartAndEnd(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setWordSegmentFinder(com.micklab.dcg.wrapper.android.text.SegmentFinder arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(((android.view.inputmethod.TextBoundsInfo.Builder) real).setWordSegmentFinder(arg0 == null ? null : arg0.getReal()));
        }

    }
}
