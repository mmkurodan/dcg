// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class CursorAnchorInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CursorAnchorInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo wrap(android.view.inputmethod.CursorAnchorInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.CursorAnchorInfo getReal() {
        return (android.view.inputmethod.CursorAnchorInfo) real;
    }

    public android.view.inputmethod.CursorAnchorInfo unwrap() {
        return getReal();
    }

    public CursorAnchorInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.inputmethod.CursorAnchorInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.CursorAnchorInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getCharacterBounds(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.CursorAnchorInfo) real).getCharacterBounds(arg0));
    }

    public int getCharacterBoundsFlags(int arg0) {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getCharacterBoundsFlags(arg0);
    }

    public java.lang.CharSequence getComposingText() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getComposingText();
    }

    public int getComposingTextStart() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getComposingTextStart();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo getEditorBoundsInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.wrap(((android.view.inputmethod.CursorAnchorInfo) real).getEditorBoundsInfo());
    }

    public float getInsertionMarkerBaseline() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getInsertionMarkerBaseline();
    }

    public float getInsertionMarkerBottom() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getInsertionMarkerBottom();
    }

    public int getInsertionMarkerFlags() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getInsertionMarkerFlags();
    }

    public float getInsertionMarkerHorizontal() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getInsertionMarkerHorizontal();
    }

    public float getInsertionMarkerTop() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getInsertionMarkerTop();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(((android.view.inputmethod.CursorAnchorInfo) real).getMatrix());
    }

    public int getSelectionEnd() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getSelectionEnd();
    }

    public int getSelectionStart() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).getSelectionStart();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo getTextAppearanceInfo() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo.wrap(((android.view.inputmethod.CursorAnchorInfo) real).getTextAppearanceInfo());
    }

    public int hashCode() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.CursorAnchorInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.CursorAnchorInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_HAS_INVISIBLE_REGION = android.view.inputmethod.CursorAnchorInfo.FLAG_HAS_INVISIBLE_REGION;
    public static final int FLAG_HAS_VISIBLE_REGION = android.view.inputmethod.CursorAnchorInfo.FLAG_HAS_VISIBLE_REGION;
    public static final int FLAG_IS_RTL = android.view.inputmethod.CursorAnchorInfo.FLAG_IS_RTL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder wrap(android.view.inputmethod.CursorAnchorInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.CursorAnchorInfo.Builder getReal() {
            return (android.view.inputmethod.CursorAnchorInfo.Builder) real;
        }

        public android.view.inputmethod.CursorAnchorInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.CursorAnchorInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(int arg0, float arg1, float arg2, float arg3, float arg4, int arg5) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).addCharacterBounds(arg0, arg1, arg2, arg3, arg4, arg5));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder addVisibleLineBounds(float arg0, float arg1, float arg2, float arg3) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).addVisibleLineBounds(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder clearVisibleLineBounds() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).clearVisibleLineBounds());
        }

        public void reset() {
            ((android.view.inputmethod.CursorAnchorInfo.Builder) real).reset();
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setComposingText(int arg0, java.lang.CharSequence arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).setComposingText(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setEditorBoundsInfo(com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).setEditorBoundsInfo(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setInsertionMarkerLocation(float arg0, float arg1, float arg2, float arg3, int arg4) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).setInsertionMarkerLocation(arg0, arg1, arg2, arg3, arg4));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).setMatrix(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setSelectionRange(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).setSelectionRange(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder setTextAppearanceInfo(com.micklab.dcg.wrapper.android.view.inputmethod.TextAppearanceInfo arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.CursorAnchorInfo.Builder.wrap(((android.view.inputmethod.CursorAnchorInfo.Builder) real).setTextAppearanceInfo(arg0 == null ? null : arg0.getReal()));
        }

    }
}
