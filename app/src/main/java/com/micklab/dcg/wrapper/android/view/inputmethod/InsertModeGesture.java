// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InsertModeGesture {
    private final android.view.inputmethod.InsertModeGesture real;

    public InsertModeGesture(android.view.inputmethod.InsertModeGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture wrap(android.view.inputmethod.InsertModeGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture(real);
    }

    public android.view.inputmethod.InsertModeGesture unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.CancellationSignal getCancellationSignal() {
        return com.micklab.dcg.wrapper.android.os.CancellationSignal.wrap(real.getCancellationSignal());
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getInsertionPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(real.getInsertionPoint());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.InsertModeGesture.Builder real;

        public Builder(android.view.inputmethod.InsertModeGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder wrap(android.view.inputmethod.InsertModeGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder(real);
        }

        public android.view.inputmethod.InsertModeGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.InsertModeGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder setCancellationSignal(com.micklab.dcg.wrapper.android.os.CancellationSignal arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder.wrap(real.setCancellationSignal(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder setInsertionPoint(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder.wrap(real.setInsertionPoint(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
