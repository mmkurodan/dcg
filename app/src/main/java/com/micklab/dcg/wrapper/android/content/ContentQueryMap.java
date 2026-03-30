// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentQueryMap {
    private final android.content.ContentQueryMap real;

    public ContentQueryMap(android.content.ContentQueryMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentQueryMap wrap(android.content.ContentQueryMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentQueryMap(real);
    }

    public android.content.ContentQueryMap unwrap() {
        return real;
    }

    public ContentQueryMap(com.micklab.dcg.wrapper.android.database.Cursor arg0, java.lang.String arg1, boolean arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        this(new android.content.ContentQueryMap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getValues(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.getValues(arg0));
    }

    public void requery() {
        real.requery();
    }

    public void setKeepUpdated(boolean arg0) {
        real.setKeepUpdated(arg0);
    }

}
