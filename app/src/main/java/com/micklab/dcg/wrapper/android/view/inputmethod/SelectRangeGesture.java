// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class SelectRangeGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SelectRangeGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture wrap(android.view.inputmethod.SelectRangeGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.SelectRangeGesture getReal() {
        return (android.view.inputmethod.SelectRangeGesture) real;
    }

    public android.view.inputmethod.SelectRangeGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.SelectRangeGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.SelectRangeGesture) real).equals(arg0);
    }

    public int getGranularity() {
        return ((android.view.inputmethod.SelectRangeGesture) real).getGranularity();
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getSelectionEndArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.SelectRangeGesture) real).getSelectionEndArea());
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getSelectionStartArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.SelectRangeGesture) real).getSelectionStartArea());
    }

    public int hashCode() {
        return ((android.view.inputmethod.SelectRangeGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.SelectRangeGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder wrap(android.view.inputmethod.SelectRangeGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.SelectRangeGesture.Builder getReal() {
            return (android.view.inputmethod.SelectRangeGesture.Builder) real;
        }

        public android.view.inputmethod.SelectRangeGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.SelectRangeGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.wrap(((android.view.inputmethod.SelectRangeGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(((android.view.inputmethod.SelectRangeGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(((android.view.inputmethod.SelectRangeGesture.Builder) real).setGranularity(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setSelectionEndArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(((android.view.inputmethod.SelectRangeGesture.Builder) real).setSelectionEndArea(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder setSelectionStartArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.SelectRangeGesture.Builder.wrap(((android.view.inputmethod.SelectRangeGesture.Builder) real).setSelectionStartArea(arg0 == null ? null : arg0.getReal()));
        }

    }
}
