// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvContentRating {
    private final android.media.tv.TvContentRating real;

    public TvContentRating(android.media.tv.TvContentRating real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvContentRating wrap(android.media.tv.TvContentRating real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContentRating(real);
    }

    public android.media.tv.TvContentRating unwrap() {
        return real;
    }

    public boolean contains(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
        return real.contains(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvContentRating createRating(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String... arg3) {
        return com.micklab.dcg.wrapper.android.media.tv.TvContentRating.wrap(android.media.tv.TvContentRating.createRating(arg0, arg1, arg2, arg3));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String flattenToString() {
        return real.flattenToString();
    }

    public java.lang.String getDomain() {
        return real.getDomain();
    }

    public java.lang.String getMainRating() {
        return real.getMainRating();
    }

    public java.lang.String getRatingSystem() {
        return real.getRatingSystem();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvContentRating unflattenFromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.tv.TvContentRating.wrap(android.media.tv.TvContentRating.unflattenFromString(arg0));
    }

    public static final com.micklab.dcg.wrapper.android.media.tv.TvContentRating UNRATED = com.micklab.dcg.wrapper.android.media.tv.TvContentRating.wrap(android.media.tv.TvContentRating.UNRATED);

}
