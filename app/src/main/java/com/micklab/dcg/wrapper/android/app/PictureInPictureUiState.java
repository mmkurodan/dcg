// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class PictureInPictureUiState {
    private final android.app.PictureInPictureUiState real;

    public PictureInPictureUiState(android.app.PictureInPictureUiState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.PictureInPictureUiState wrap(android.app.PictureInPictureUiState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.PictureInPictureUiState(real);
    }

    public android.app.PictureInPictureUiState unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isStashed() {
        return real.isStashed();
    }

    public boolean isTransitioningToPip() {
        return real.isTransitioningToPip();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
