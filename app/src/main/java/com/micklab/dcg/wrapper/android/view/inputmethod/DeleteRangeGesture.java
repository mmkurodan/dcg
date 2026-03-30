// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class DeleteRangeGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeleteRangeGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture wrap(android.view.inputmethod.DeleteRangeGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.DeleteRangeGesture getReal() {
        return (android.view.inputmethod.DeleteRangeGesture) real;
    }

    public android.view.inputmethod.DeleteRangeGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.DeleteRangeGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.DeleteRangeGesture) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getDeletionEndArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.DeleteRangeGesture) real).getDeletionEndArea());
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getDeletionStartArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.DeleteRangeGesture) real).getDeletionStartArea());
    }

    public int getGranularity() {
        return ((android.view.inputmethod.DeleteRangeGesture) real).getGranularity();
    }

    public int hashCode() {
        return ((android.view.inputmethod.DeleteRangeGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.DeleteRangeGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder wrap(android.view.inputmethod.DeleteRangeGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.DeleteRangeGesture.Builder getReal() {
            return (android.view.inputmethod.DeleteRangeGesture.Builder) real;
        }

        public android.view.inputmethod.DeleteRangeGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.DeleteRangeGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.wrap(((android.view.inputmethod.DeleteRangeGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setDeletionEndArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(((android.view.inputmethod.DeleteRangeGesture.Builder) real).setDeletionEndArea(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setDeletionStartArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(((android.view.inputmethod.DeleteRangeGesture.Builder) real).setDeletionStartArea(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(((android.view.inputmethod.DeleteRangeGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteRangeGesture.Builder.wrap(((android.view.inputmethod.DeleteRangeGesture.Builder) real).setGranularity(arg0));
        }

    }
}
