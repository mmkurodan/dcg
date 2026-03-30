// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class JoinOrSplitGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JoinOrSplitGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture wrap(android.view.inputmethod.JoinOrSplitGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.JoinOrSplitGesture getReal() {
        return (android.view.inputmethod.JoinOrSplitGesture) real;
    }

    public android.view.inputmethod.JoinOrSplitGesture unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.JoinOrSplitGesture) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.JoinOrSplitGesture) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getJoinOrSplitPoint() {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(((android.view.inputmethod.JoinOrSplitGesture) real).getJoinOrSplitPoint());
    }

    public int hashCode() {
        return ((android.view.inputmethod.JoinOrSplitGesture) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.JoinOrSplitGesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder wrap(android.view.inputmethod.JoinOrSplitGesture.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.JoinOrSplitGesture.Builder getReal() {
            return (android.view.inputmethod.JoinOrSplitGesture.Builder) real;
        }

        public android.view.inputmethod.JoinOrSplitGesture.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.JoinOrSplitGesture.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.wrap(((android.view.inputmethod.JoinOrSplitGesture.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder setFallbackText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder.wrap(((android.view.inputmethod.JoinOrSplitGesture.Builder) real).setFallbackText(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder setJoinOrSplitPoint(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.JoinOrSplitGesture.Builder.wrap(((android.view.inputmethod.JoinOrSplitGesture.Builder) real).setJoinOrSplitPoint(arg0 == null ? null : arg0.getReal()));
        }

    }
}
