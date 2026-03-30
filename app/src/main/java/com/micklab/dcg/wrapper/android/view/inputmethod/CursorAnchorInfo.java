// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class CursorAnchorInfo {
    private final android.view.inputmethod.CursorAnchorInfo real;

    public CursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo wrap(android.view.inputmethod.CursorAnchorInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo(real);
    }

    public android.view.inputmethod.CursorAnchorInfo unwrap() {
        return real;
    }

    public CursorAnchorInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.inputmethod.CursorAnchorInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getCharacterBounds(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getCharacterBounds(arg0));
    }

    public int getCharacterBoundsFlags(int arg0) {
        return real.getCharacterBoundsFlags(arg0);
    }

    public java.lang.CharSequence getComposingText() {
        return real.getComposingText();
    }

    public int getComposingTextStart() {
        return real.getComposingTextStart();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo getEditorBoundsInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.wrap(real.getEditorBoundsInfo());
    }

    public float getInsertionMarkerBaseline() {
        return real.getInsertionMarkerBaseline();
    }

    public float getInsertionMarkerBottom() {
        return real.getInsertionMarkerBottom();
    }

    public int getInsertionMarkerFlags() {
        return real.getInsertionMarkerFlags();
    }

    public float getInsertionMarkerHorizontal() {
        return real.getInsertionMarkerHorizontal();
    }

    public float getInsertionMarkerTop() {
        return real.getInsertionMarkerTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(real.getMatrix());
    }

    public int getSelectionEnd() {
        return real.getSelectionEnd();
    }

    public int getSelectionStart() {
        return real.getSelectionStart();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo getTextAppearanceInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.wrap(real.getTextAppearanceInfo());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_HAS_INVISIBLE_REGION = android.view.inputmethod.CursorAnchorInfo.FLAG_HAS_INVISIBLE_REGION;
    public static final int FLAG_HAS_VISIBLE_REGION = android.view.inputmethod.CursorAnchorInfo.FLAG_HAS_VISIBLE_REGION;
    public static final int FLAG_IS_RTL = android.view.inputmethod.CursorAnchorInfo.FLAG_IS_RTL;

    public static final class Builder {
        private final android.view.inputmethod.CursorAnchorInfo.Builder real;

        public Builder(android.view.inputmethod.CursorAnchorInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder wrap(android.view.inputmethod.CursorAnchorInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder(real);
        }

        public android.view.inputmethod.CursorAnchorInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.CursorAnchorInfo.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(int arg0, float arg1, float arg2, float arg3, float arg4, int arg5) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.addCharacterBounds(arg0, arg1, arg2, arg3, arg4, arg5));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder addVisibleLineBounds(float arg0, float arg1, float arg2, float arg3) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.addVisibleLineBounds(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder clearVisibleLineBounds() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.clearVisibleLineBounds());
        }

        public void reset() {
            real.reset();
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setComposingText(int arg0, java.lang.CharSequence arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.setComposingText(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setEditorBoundsInfo(com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.setEditorBoundsInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setInsertionMarkerLocation(float arg0, float arg1, float arg2, float arg3, int arg4) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.setInsertionMarkerLocation(arg0, arg1, arg2, arg3, arg4));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.setMatrix(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setSelectionRange(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.setSelectionRange(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setTextAppearanceInfo(com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(real.setTextAppearanceInfo(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
