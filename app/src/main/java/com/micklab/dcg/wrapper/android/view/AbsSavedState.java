// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class AbsSavedState {
    private final android.view.AbsSavedState real;

    public AbsSavedState(android.view.AbsSavedState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.AbsSavedState wrap(android.view.AbsSavedState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.AbsSavedState(real);
    }

    public android.view.AbsSavedState unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable getSuperState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.getSuperState());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.view.AbsSavedState EMPTY_STATE = com.micklab.dcg.wrapper.android.view.AbsSavedState.wrap(android.view.AbsSavedState.EMPTY_STATE);

}
