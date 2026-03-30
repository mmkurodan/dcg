// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class SelectGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SelectGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture wrap(android.view.inputmethod.SelectGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.SelectGesture getReal() {
        return (android.view.inputmethod.SelectGesture) real;
    }

    public android.view.inputmethod.SelectGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.SelectGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.SelectGesture) real).equals(arg0);
    }

    public int getGranularity() {
        return ((android.view.inputmethod.SelectGesture) real).getGranularity();
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getSelectionArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.SelectGesture) real).getSelectionArea());
    }

    public int hashCode() {
        return ((android.view.inputmethod.SelectGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.SelectGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder wrap(android.view.inputmethod.SelectGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.SelectGesture.Builder getReal() {
            return (android.view.inputmethod.SelectGesture.Builder) real;
        }

        public android.view.inputmethod.SelectGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.SelectGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.wrap(((android.view.inputmethod.SelectGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder.wrap(((android.view.inputmethod.SelectGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder.wrap(((android.view.inputmethod.SelectGesture.Builder) real).setGranularity(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder setSelectionArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectGesture.Builder.wrap(((android.view.inputmethod.SelectGesture.Builder) real).setSelectionArea(arg0 == null ? null : arg0.getReal()));
        }

    }
}
