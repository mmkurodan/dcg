// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentQueryMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentQueryMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentQueryMap wrap(android.content.ContentQueryMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentQueryMap(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContentQueryMap getReal() {
        return (android.content.ContentQueryMap) real;
    }

    public android.content.ContentQueryMap unwrap() {
        return getReal();
    }

    public ContentQueryMap(com.micklab.dcg.wrapper.android.database.Cursor arg0, java.lang.String arg1, boolean arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        this(new android.content.ContentQueryMap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.content.ContentQueryMap) real).close();
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues getValues(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.content.ContentQueryMap) real).getValues(arg0));
    }

    public void requery() {
        ((android.content.ContentQueryMap) real).requery();
    }

    public void setKeepUpdated(boolean arg0) {
        ((android.content.ContentQueryMap) real).setKeepUpdated(arg0);
    }

}
