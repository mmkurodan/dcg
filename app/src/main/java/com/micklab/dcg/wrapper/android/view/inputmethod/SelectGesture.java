// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class SelectGesture {
    private final android.view.inputmethod.SelectGesture real;

    public SelectGesture(android.view.inputmethod.SelectGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture wrap(android.view.inputmethod.SelectGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture(real);
    }

    public android.view.inputmethod.SelectGesture unwrap() {
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

    public com.micklab.dcg.wrapper.android.graphics.RectF getSelectionArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getSelectionArea());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.SelectGesture.Builder real;

        public Builder(android.view.inputmethod.SelectGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder wrap(android.view.inputmethod.SelectGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder(real);
        }

        public android.view.inputmethod.SelectGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.SelectGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder.wrap(real.setGranularity(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder setSelectionArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder.wrap(real.setSelectionArea(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
