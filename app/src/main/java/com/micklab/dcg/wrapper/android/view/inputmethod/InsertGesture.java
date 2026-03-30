// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InsertGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InsertGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture wrap(android.view.inputmethod.InsertGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InsertGesture getReal() {
        return (android.view.inputmethod.InsertGesture) real;
    }

    public android.view.inputmethod.InsertGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.InsertGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InsertGesture) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getInsertionPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(((android.view.inputmethod.InsertGesture) real).getInsertionPoint());
    }

    public java.lang.String getTextToInsert() {
        return ((android.view.inputmethod.InsertGesture) real).getTextToInsert();
    }

    public int hashCode() {
        return ((android.view.inputmethod.InsertGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InsertGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder wrap(android.view.inputmethod.InsertGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.InsertGesture.Builder getReal() {
            return (android.view.inputmethod.InsertGesture.Builder) real;
        }

        public android.view.inputmethod.InsertGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.InsertGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.wrap(((android.view.inputmethod.InsertGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder.wrap(((android.view.inputmethod.InsertGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder setInsertionPoint(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder.wrap(((android.view.inputmethod.InsertGesture.Builder) real).setInsertionPoint(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder setTextToInsert(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertGesture.Builder.wrap(((android.view.inputmethod.InsertGesture.Builder) real).setTextToInsert(arg0));
        }

    }
}
