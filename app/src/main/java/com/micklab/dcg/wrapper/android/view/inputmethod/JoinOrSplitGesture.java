// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class JoinOrSplitGesture {
    private final android.view.inputmethod.JoinOrSplitGesture real;

    public JoinOrSplitGesture(android.view.inputmethod.JoinOrSplitGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture wrap(android.view.inputmethod.JoinOrSplitGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture(real);
    }

    public android.view.inputmethod.JoinOrSplitGesture unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getJoinOrSplitPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(real.getJoinOrSplitPoint());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.JoinOrSplitGesture.Builder real;

        public Builder(android.view.inputmethod.JoinOrSplitGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder wrap(android.view.inputmethod.JoinOrSplitGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder(real);
        }

        public android.view.inputmethod.JoinOrSplitGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.JoinOrSplitGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder setJoinOrSplitPoint(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder.wrap(real.setJoinOrSplitPoint(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
