// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class AbsSavedState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AbsSavedState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.AbsSavedState wrap(android.view.AbsSavedState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.AbsSavedState(real, (__DcgwBridgeToken) null);
    }

    public android.view.AbsSavedState getReal() {
        return (android.view.AbsSavedState) real;
    }

    public android.view.AbsSavedState unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.AbsSavedState) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable getSuperState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.view.AbsSavedState) real).getSuperState());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.AbsSavedState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.view.AbsSavedState EMPTY_STATE = com.micklab.dcg.wrapper.android.view.AbsSavedState.wrap(android.view.AbsSavedState.EMPTY_STATE);

}
