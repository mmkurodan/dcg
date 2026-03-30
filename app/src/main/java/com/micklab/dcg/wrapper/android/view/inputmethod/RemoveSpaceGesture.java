// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class RemoveSpaceGesture {
    private final android.view.inputmethod.RemoveSpaceGesture real;

    public RemoveSpaceGesture(android.view.inputmethod.RemoveSpaceGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture wrap(android.view.inputmethod.RemoveSpaceGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture(real);
    }

    public android.view.inputmethod.RemoveSpaceGesture unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getEndPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(real.getEndPoint());
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getStartPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(real.getStartPoint());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.RemoveSpaceGesture.Builder real;

        public Builder(android.view.inputmethod.RemoveSpaceGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder wrap(android.view.inputmethod.RemoveSpaceGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder(real);
        }

        public android.view.inputmethod.RemoveSpaceGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.RemoveSpaceGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder setPoints(com.micklab.dcg.wrapper.android.graphics.PointF arg0, com.micklab.dcg.wrapper.android.graphics.PointF arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder.wrap(real.setPoints(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

    }
}
