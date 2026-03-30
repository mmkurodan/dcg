// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class DeleteGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeleteGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture wrap(android.view.inputmethod.DeleteGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.DeleteGesture getReal() {
        return (android.view.inputmethod.DeleteGesture) real;
    }

    public android.view.inputmethod.DeleteGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.DeleteGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.DeleteGesture) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getDeletionArea() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.view.inputmethod.DeleteGesture) real).getDeletionArea());
    }

    public int getGranularity() {
        return ((android.view.inputmethod.DeleteGesture) real).getGranularity();
    }

    public int hashCode() {
        return ((android.view.inputmethod.DeleteGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.DeleteGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder wrap(android.view.inputmethod.DeleteGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.DeleteGesture.Builder getReal() {
            return (android.view.inputmethod.DeleteGesture.Builder) real;
        }

        public android.view.inputmethod.DeleteGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.DeleteGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.wrap(((android.view.inputmethod.DeleteGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder setDeletionArea(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder.wrap(((android.view.inputmethod.DeleteGesture.Builder) real).setDeletionArea(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder.wrap(((android.view.inputmethod.DeleteGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder setGranularity(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.DeleteGesture.Builder.wrap(((android.view.inputmethod.DeleteGesture.Builder) real).setGranularity(arg0));
        }

    }
}
