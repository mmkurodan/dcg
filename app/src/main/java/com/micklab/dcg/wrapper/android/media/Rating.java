// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Rating {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Rating(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Rating wrap(android.media.Rating real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Rating(real, (__DcgwBridgeToken) null);
    }

    public android.media.Rating getReal() {
        return (android.media.Rating) real;
    }

    public android.media.Rating unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.Rating) real).describeContents();
    }

    public float getPercentRating() {
        return ((android.media.Rating) real).getPercentRating();
    }

    public int getRatingStyle() {
        return ((android.media.Rating) real).getRatingStyle();
    }

    public float getStarRating() {
        return ((android.media.Rating) real).getStarRating();
    }

    public boolean hasHeart() {
        return ((android.media.Rating) real).hasHeart();
    }

    public boolean isRated() {
        return ((android.media.Rating) real).isRated();
    }

    public boolean isThumbUp() {
        return ((android.media.Rating) real).isThumbUp();
    }

    public static com.micklab.dcg.wrapper.android.media.Rating newHeartRating(boolean arg0) {
        return com.micklab.dcg.wrapper.android.media.Rating.wrap(android.media.Rating.newHeartRating(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.Rating newPercentageRating(float arg0) {
        return com.micklab.dcg.wrapper.android.media.Rating.wrap(android.media.Rating.newPercentageRating(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.Rating newStarRating(int arg0, float arg1) {
        return com.micklab.dcg.wrapper.android.media.Rating.wrap(android.media.Rating.newStarRating(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.Rating newThumbRating(boolean arg0) {
        return com.micklab.dcg.wrapper.android.media.Rating.wrap(android.media.Rating.newThumbRating(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.Rating newUnratedRating(int arg0) {
        return com.micklab.dcg.wrapper.android.media.Rating.wrap(android.media.Rating.newUnratedRating(arg0));
    }

    public java.lang.String toString() {
        return ((android.media.Rating) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.Rating) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int RATING_3_STARS = android.media.Rating.RATING_3_STARS;
    public static final int RATING_4_STARS = android.media.Rating.RATING_4_STARS;
    public static final int RATING_5_STARS = android.media.Rating.RATING_5_STARS;
    public static final int RATING_HEART = android.media.Rating.RATING_HEART;
    public static final int RATING_NONE = android.media.Rating.RATING_NONE;
    public static final int RATING_PERCENTAGE = android.media.Rating.RATING_PERCENTAGE;
    public static final int RATING_THUMB_UP_DOWN = android.media.Rating.RATING_THUMB_UP_DOWN;

}
