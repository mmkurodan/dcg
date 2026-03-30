// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextBoundsInfo {
    private final android.view.inputmethod.TextBoundsInfo real;

    public TextBoundsInfo(android.view.inputmethod.TextBoundsInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo wrap(android.view.inputmethod.TextBoundsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo(real);
    }

    public android.view.inputmethod.TextBoundsInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getCharacterBidiLevel(int arg0) {
        return real.getCharacterBidiLevel(arg0);
    }

    public void getCharacterBounds(int arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        real.getCharacterBounds(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int getCharacterFlags(int arg0) {
        return real.getCharacterFlags(arg0);
    }

    public int getEndIndex() {
        return real.getEndIndex();
    }

    public com.micklab.dcg.wrapper.android.text.SegmentFinder getGraphemeSegmentFinder() {
        return com.micklab.dcg.wrapper.android.text.SegmentFinder.wrap(real.getGraphemeSegmentFinder());
    }

    public com.micklab.dcg.wrapper.android.text.SegmentFinder getLineSegmentFinder() {
        return com.micklab.dcg.wrapper.android.text.SegmentFinder.wrap(real.getLineSegmentFinder());
    }

    public void getMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.getMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public int getOffsetForPosition(float arg0, float arg1) {
        return real.getOffsetForPosition(arg0, arg1);
    }

    public int[] getRangeForRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.text.SegmentFinder arg1, com.micklab.dcg.wrapper.android.text.Layout.TextInclusionStrategy arg2) {
        return real.getRangeForRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public int getStartIndex() {
        return real.getStartIndex();
    }

    public com.micklab.dcg.wrapper.android.text.SegmentFinder getWordSegmentFinder() {
        return com.micklab.dcg.wrapper.android.text.SegmentFinder.wrap(real.getWordSegmentFinder());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_CHARACTER_LINEFEED = android.view.inputmethod.TextBoundsInfo.FLAG_CHARACTER_LINEFEED;
    public static final int FLAG_CHARACTER_PUNCTUATION = android.view.inputmethod.TextBoundsInfo.FLAG_CHARACTER_PUNCTUATION;
    public static final int FLAG_CHARACTER_WHITESPACE = android.view.inputmethod.TextBoundsInfo.FLAG_CHARACTER_WHITESPACE;
    public static final int FLAG_LINE_IS_RTL = android.view.inputmethod.TextBoundsInfo.FLAG_LINE_IS_RTL;

    public static final class Builder {
        private final android.view.inputmethod.TextBoundsInfo.Builder real;

        public Builder(android.view.inputmethod.TextBoundsInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder wrap(android.view.inputmethod.TextBoundsInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder(real);
        }

        public android.view.inputmethod.TextBoundsInfo.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1) {
            this(new android.view.inputmethod.TextBoundsInfo.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder clear() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.clear());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setCharacterBidiLevel(int[] arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setCharacterBidiLevel(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setCharacterBounds(float[] arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setCharacterBounds(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setCharacterFlags(int[] arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setCharacterFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setGraphemeSegmentFinder(com.micklab.dcg.wrapper.android.text.SegmentFinder arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setGraphemeSegmentFinder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setLineSegmentFinder(com.micklab.dcg.wrapper.android.text.SegmentFinder arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setLineSegmentFinder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setMatrix(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setStartAndEnd(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setStartAndEnd(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder setWordSegmentFinder(com.micklab.dcg.wrapper.android.text.SegmentFinder arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextBoundsInfo.Builder.wrap(real.setWordSegmentFinder(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
