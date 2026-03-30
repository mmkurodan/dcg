// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class EditorBoundsInfo {
    private final android.view.inputmethod.EditorBoundsInfo real;

    public EditorBoundsInfo(android.view.inputmethod.EditorBoundsInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo wrap(android.view.inputmethod.EditorBoundsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo(real);
    }

    public android.view.inputmethod.EditorBoundsInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getEditorBounds() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getEditorBounds());
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getHandwritingBounds() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getHandwritingBounds());
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


    public static final class Builder {
        private final android.view.inputmethod.EditorBoundsInfo.Builder real;

        public Builder(android.view.inputmethod.EditorBoundsInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder wrap(android.view.inputmethod.EditorBoundsInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder(real);
        }

        public android.view.inputmethod.EditorBoundsInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.EditorBoundsInfo.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder setEditorBounds(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder.wrap(real.setEditorBounds(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder setHandwritingBounds(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.EditorBoundsInfo.Builder.wrap(real.setHandwritingBounds(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
