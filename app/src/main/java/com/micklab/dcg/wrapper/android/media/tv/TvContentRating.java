// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvContentRating {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvContentRating(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvContentRating wrap(android.media.tv.TvContentRating real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContentRating(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TvContentRating getReal() {
        return (android.media.tv.TvContentRating) real;
    }

    public android.media.tv.TvContentRating unwrap() {
        return getReal();
    }

    public boolean contains(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
        return ((android.media.tv.TvContentRating) real).contains(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvContentRating createRating(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String... arg3) {
        return com.micklab.dcg.wrapper.android.media.tv.TvContentRating.wrap(android.media.tv.TvContentRating.createRating(arg0, arg1, arg2, arg3));
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.tv.TvContentRating) real).equals(arg0);
    }

    public java.lang.String flattenToString() {
        return ((android.media.tv.TvContentRating) real).flattenToString();
    }

    public java.lang.String getDomain() {
        return ((android.media.tv.TvContentRating) real).getDomain();
    }

    public java.lang.String getMainRating() {
        return ((android.media.tv.TvContentRating) real).getMainRating();
    }

    public java.lang.String getRatingSystem() {
        return ((android.media.tv.TvContentRating) real).getRatingSystem();
    }

    public int hashCode() {
        return ((android.media.tv.TvContentRating) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvContentRating unflattenFromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.tv.TvContentRating.wrap(android.media.tv.TvContentRating.unflattenFromString(arg0));
    }

    public static final com.micklab.dcg.wrapper.android.media.tv.TvContentRating UNRATED = com.micklab.dcg.wrapper.android.media.tv.TvContentRating.wrap(android.media.tv.TvContentRating.UNRATED);

}
