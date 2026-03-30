// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class RemoveSpaceGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoveSpaceGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture wrap(android.view.inputmethod.RemoveSpaceGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.RemoveSpaceGesture getReal() {
        return (android.view.inputmethod.RemoveSpaceGesture) real;
    }

    public android.view.inputmethod.RemoveSpaceGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.RemoveSpaceGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.RemoveSpaceGesture) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getEndPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(((android.view.inputmethod.RemoveSpaceGesture) real).getEndPoint());
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getStartPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(((android.view.inputmethod.RemoveSpaceGesture) real).getStartPoint());
    }

    public int hashCode() {
        return ((android.view.inputmethod.RemoveSpaceGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.RemoveSpaceGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder wrap(android.view.inputmethod.RemoveSpaceGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.RemoveSpaceGesture.Builder getReal() {
            return (android.view.inputmethod.RemoveSpaceGesture.Builder) real;
        }

        public android.view.inputmethod.RemoveSpaceGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.RemoveSpaceGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.wrap(((android.view.inputmethod.RemoveSpaceGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder.wrap(((android.view.inputmethod.RemoveSpaceGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder setPoints(com.micklab.dcg.wrapper.android.graphics.PointF arg0, com.micklab.dcg.wrapper.android.graphics.PointF arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.RemoveSpaceGesture.Builder.wrap(((android.view.inputmethod.RemoveSpaceGesture.Builder) real).setPoints(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

    }
}
