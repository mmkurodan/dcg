// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class SelectRangeGesture {
    private final android.view.inputmethod.SelectRangeGesture real;

    public SelectRangeGesture(android.view.inputmethod.SelectRangeGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture wrap(android.view.inputmethod.SelectRangeGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture(real);
    }

    public android.view.inputmethod.SelectRangeGesture unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getGranularity() {
        return real.getGranularity();
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getSelectionEndArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getSelectionEndArea());
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getSelectionStartArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getSelectionStartArea());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.SelectRangeGesture.Builder real;

        public Builder(android.view.inputmethod.SelectRangeGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder wrap(android.view.inputmethod.SelectRangeGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder(real);
        }

        public android.view.inputmethod.SelectRangeGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.SelectRangeGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(real.setGranularity(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setSelectionEndArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(real.setSelectionEndArea(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setSelectionStartArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(real.setSelectionStartArea(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
