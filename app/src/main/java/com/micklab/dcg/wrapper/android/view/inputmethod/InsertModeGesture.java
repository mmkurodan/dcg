// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InsertModeGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InsertModeGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture wrap(android.view.inputmethod.InsertModeGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InsertModeGesture getReal() {
        return (android.view.inputmethod.InsertModeGesture) real;
    }

    public android.view.inputmethod.InsertModeGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.InsertModeGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InsertModeGesture) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.CancellationSignal getCancellationSignal() {
        return com.micklab.dcg.wrapper.android.os.CancellationSignal.wrap(((android.view.inputmethod.InsertModeGesture) real).getCancellationSignal());
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getInsertionPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(((android.view.inputmethod.InsertModeGesture) real).getInsertionPoint());
    }

    public int hashCode() {
        return ((android.view.inputmethod.InsertModeGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InsertModeGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder wrap(android.view.inputmethod.InsertModeGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.InsertModeGesture.Builder getReal() {
            return (android.view.inputmethod.InsertModeGesture.Builder) real;
        }

        public android.view.inputmethod.InsertModeGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.InsertModeGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.wrap(((android.view.inputmethod.InsertModeGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder setCancellationSignal(com.micklab.dcg.wrapper.android.os.CancellationSignal arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder.wrap(((android.view.inputmethod.InsertModeGesture.Builder) real).setCancellationSignal(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder.wrap(((android.view.inputmethod.InsertModeGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder setInsertionPoint(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InsertModeGesture.Builder.wrap(((android.view.inputmethod.InsertModeGesture.Builder) real).setInsertionPoint(arg0 == null ? null : arg0.getReal()));
        }

    }
}
