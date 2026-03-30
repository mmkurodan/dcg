// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputContentInfo {
    private final android.view.inputmethod.InputContentInfo real;

    public InputContentInfo(android.view.inputmethod.InputContentInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputContentInfo wrap(android.view.inputmethod.InputContentInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputContentInfo(real);
    }

    public android.view.inputmethod.InputContentInfo unwrap() {
        return real;
    }

    public InputContentInfo(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ClipDescription arg1) {
        this(new android.view.inputmethod.InputContentInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public InputContentInfo(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ClipDescription arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        this(new android.view.inputmethod.InputContentInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getContentUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getContentUri());
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(real.getDescription());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getLinkUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getLinkUri());
    }

    public void releasePermission() {
        real.releasePermission();
    }

    public void requestPermission() {
        real.requestPermission();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
