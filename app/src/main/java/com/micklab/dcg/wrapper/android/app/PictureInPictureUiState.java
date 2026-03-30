// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class PictureInPictureUiState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PictureInPictureUiState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.PictureInPictureUiState wrap(android.app.PictureInPictureUiState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.PictureInPictureUiState(real, (__DcgwBridgeToken) null);
    }

    public android.app.PictureInPictureUiState getReal() {
        return (android.app.PictureInPictureUiState) real;
    }

    public android.app.PictureInPictureUiState unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.PictureInPictureUiState) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.PictureInPictureUiState) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.app.PictureInPictureUiState) real).hashCode();
    }

    public boolean isStashed() {
        return ((android.app.PictureInPictureUiState) real).isStashed();
    }

    public boolean isTransitioningToPip() {
        return ((android.app.PictureInPictureUiState) real).isTransitioningToPip();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.PictureInPictureUiState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
