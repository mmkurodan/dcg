// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class DeleteGesture {
    private final android.view.inputmethod.DeleteGesture real;

    public DeleteGesture(android.view.inputmethod.DeleteGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture wrap(android.view.inputmethod.DeleteGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture(real);
    }

    public android.view.inputmethod.DeleteGesture unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getDeletionArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getDeletionArea());
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
        private final android.view.inputmethod.DeleteGesture.Builder real;

        public Builder(android.view.inputmethod.DeleteGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder wrap(android.view.inputmethod.DeleteGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder(real);
        }

        public android.view.inputmethod.DeleteGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.DeleteGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder setDeletionArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder.wrap(real.setDeletionArea(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder.wrap(real.setGranularity(arg0));
        }

    }
}
