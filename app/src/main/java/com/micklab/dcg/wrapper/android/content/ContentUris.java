// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentUris {
    private final android.content.ContentUris real;

    public ContentUris(android.content.ContentUris real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentUris wrap(android.content.ContentUris real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentUris(real);
    }

    public android.content.ContentUris unwrap() {
        return real;
    }

    public ContentUris() {
        this(new android.content.ContentUris());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri.Builder appendId(com.micklab.dcg.wrapper.android.net.Uri.Builder arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.Builder.wrap(android.content.ContentUris.appendId(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static long parseId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.content.ContentUris.parseId(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri removeId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.content.ContentUris.removeId(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri withAppendedId(com.micklab.dcg.wrapper.android.net.Uri arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.content.ContentUris.withAppendedId(arg0 == null ? null : arg0.unwrap(), arg1));
    }

}
