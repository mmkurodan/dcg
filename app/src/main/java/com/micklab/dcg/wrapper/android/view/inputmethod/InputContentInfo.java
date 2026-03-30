// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputContentInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputContentInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputContentInfo wrap(android.view.inputmethod.InputContentInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputContentInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputContentInfo getReal() {
        return (android.view.inputmethod.InputContentInfo) real;
    }

    public android.view.inputmethod.InputContentInfo unwrap() {
        return getReal();
    }

    public InputContentInfo(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ClipDescription arg1) {
        this(new android.view.inputmethod.InputContentInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public InputContentInfo(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ClipDescription arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        this(new android.view.inputmethod.InputContentInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.InputContentInfo) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getContentUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.view.inputmethod.InputContentInfo) real).getContentUri());
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(((android.view.inputmethod.InputContentInfo) real).getDescription());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getLinkUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.view.inputmethod.InputContentInfo) real).getLinkUri());
    }

    public void releasePermission() {
        ((android.view.inputmethod.InputContentInfo) real).releasePermission();
    }

    public void requestPermission() {
        ((android.view.inputmethod.InputContentInfo) real).requestPermission();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InputContentInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
