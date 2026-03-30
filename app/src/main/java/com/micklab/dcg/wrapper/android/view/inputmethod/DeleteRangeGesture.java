// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class DeleteRangeGesture {
    private final android.view.inputmethod.DeleteRangeGesture real;

    public DeleteRangeGesture(android.view.inputmethod.DeleteRangeGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture wrap(android.view.inputmethod.DeleteRangeGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture(real);
    }

    public android.view.inputmethod.DeleteRangeGesture unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getDeletionEndArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getDeletionEndArea());
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getDeletionStartArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getDeletionStartArea());
    }

    public int getGranularity() {
        return real.getGranularity();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.DeleteRangeGesture.Builder real;

        public Builder(android.view.inputmethod.DeleteRangeGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder wrap(android.view.inputmethod.DeleteRangeGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder(real);
        }

        public android.view.inputmethod.DeleteRangeGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.DeleteRangeGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setDeletionEndArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(real.setDeletionEndArea(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setDeletionStartArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(real.setDeletionStartArea(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(real.setGranularity(arg0));
        }

    }
}
