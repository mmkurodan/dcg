// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class ActiveProcessingPicture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActiveProcessingPicture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.ActiveProcessingPicture wrap(android.media.quality.ActiveProcessingPicture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.ActiveProcessingPicture(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.ActiveProcessingPicture getReal() {
        return (android.media.quality.ActiveProcessingPicture) real;
    }

    public android.media.quality.ActiveProcessingPicture unwrap() {
        return getReal();
    }

    public ActiveProcessingPicture(int arg0, java.lang.String arg1) {
        this(new android.media.quality.ActiveProcessingPicture(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.quality.ActiveProcessingPicture) real).describeContents();
    }

    public int getId() {
        return ((android.media.quality.ActiveProcessingPicture) real).getId();
    }

    public java.lang.String getProfileId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.quality.ActiveProcessingPicture#getProfileId()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.quality.ActiveProcessingPicture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
