// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InsertGesture {
    private final android.view.inputmethod.InsertGesture real;

    public InsertGesture(android.view.inputmethod.InsertGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture wrap(android.view.inputmethod.InsertGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture(real);
    }

    public android.view.inputmethod.InsertGesture unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getInsertionPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(real.getInsertionPoint());
    }

    public java.lang.String getTextToInsert() {
        return real.getTextToInsert();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.InsertGesture.Builder real;

        public Builder(android.view.inputmethod.InsertGesture.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder wrap(android.view.inputmethod.InsertGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder(real);
        }

        public android.view.inputmethod.InsertGesture.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.InsertGesture.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder.wrap(real.setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder setInsertionPoint(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder.wrap(real.setInsertionPoint(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder setTextToInsert(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder.wrap(real.setTextToInsert(arg0));
        }

    }
}
