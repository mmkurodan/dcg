// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class EditorBoundsInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EditorBoundsInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo wrap(android.view.inputmethod.EditorBoundsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.EditorBoundsInfo getReal() {
        return (android.view.inputmethod.EditorBoundsInfo) real;
    }

    public android.view.inputmethod.EditorBoundsInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.EditorBoundsInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.EditorBoundsInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getEditorBounds() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.EditorBoundsInfo) real).getEditorBounds());
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getHandwritingBounds() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.EditorBoundsInfo) real).getHandwritingBounds());
    }

    public int hashCode() {
        return ((android.view.inputmethod.EditorBoundsInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.EditorBoundsInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.EditorBoundsInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder wrap(android.view.inputmethod.EditorBoundsInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.EditorBoundsInfo.Builder getReal() {
            return (android.view.inputmethod.EditorBoundsInfo.Builder) real;
        }

        public android.view.inputmethod.EditorBoundsInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.EditorBoundsInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.wrap(((android.view.inputmethod.EditorBoundsInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder setEditorBounds(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder.wrap(((android.view.inputmethod.EditorBoundsInfo.Builder) real).setEditorBounds(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder setHandwritingBounds(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder.wrap(((android.view.inputmethod.EditorBoundsInfo.Builder) real).setHandwritingBounds(arg0 == null ? null : arg0.getReal()));
        }

    }
}
