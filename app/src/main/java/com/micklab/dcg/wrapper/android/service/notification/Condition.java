// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.notification;

public final class Condition {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Condition(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.notification.Condition wrap(android.service.notification.Condition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.notification.Condition(real, (__DcgwBridgeToken) null);
    }

    public android.service.notification.Condition getReal() {
        return (android.service.notification.Condition) real;
    }

    public android.service.notification.Condition unwrap() {
        return getReal();
    }

    public Condition(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.service.notification.Condition(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Condition(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, int arg2) {
        this(new android.service.notification.Condition(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public Condition(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, int arg2, int arg3) {
        this(new android.service.notification.Condition(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public Condition(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, int arg6) {
        this(new android.service.notification.Condition(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public Condition(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, int arg6, int arg7) {
        this(new android.service.notification.Condition(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.service.notification.Condition copy() {
        return com.micklab.dcg.wrapper.android.service.notification.Condition.wrap(((android.service.notification.Condition) real).copy());
    }

    public int describeContents() {
        return ((android.service.notification.Condition) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.notification.Condition) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.service.notification.Condition) real).hashCode();
    }

    public static boolean isValidId(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return android.service.notification.Condition.isValidId(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static com.micklab.dcg.wrapper.android.net.Uri.Builder newId(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.Builder.wrap(android.service.notification.Condition.newId(arg0 == null ? null : arg0.getReal()));
    }

    public static java.lang.String relevanceToString(int arg0) {
        return android.service.notification.Condition.relevanceToString(arg0);
    }

    public static java.lang.String stateToString(int arg0) {
        return android.service.notification.Condition.stateToString(arg0);
    }

    public java.lang.String toString() {
        return ((android.service.notification.Condition) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.notification.Condition) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_RELEVANT_ALWAYS = android.service.notification.Condition.FLAG_RELEVANT_ALWAYS;
    public static final int FLAG_RELEVANT_NOW = android.service.notification.Condition.FLAG_RELEVANT_NOW;
    public static final java.lang.String SCHEME = android.service.notification.Condition.SCHEME;
    public static final int SOURCE_CONTEXT = android.service.notification.Condition.SOURCE_CONTEXT;
    public static final int SOURCE_SCHEDULE = android.service.notification.Condition.SOURCE_SCHEDULE;
    public static final int SOURCE_UNKNOWN = android.service.notification.Condition.SOURCE_UNKNOWN;
    public static final int SOURCE_USER_ACTION = android.service.notification.Condition.SOURCE_USER_ACTION;
    public static final int STATE_ERROR = android.service.notification.Condition.STATE_ERROR;
    public static final int STATE_FALSE = android.service.notification.Condition.STATE_FALSE;
    public static final int STATE_TRUE = android.service.notification.Condition.STATE_TRUE;
    public static final int STATE_UNKNOWN = android.service.notification.Condition.STATE_UNKNOWN;

}
