// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SavedDatasetsInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SavedDatasetsInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfo wrap(android.service.autofill.SavedDatasetsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfo(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.SavedDatasetsInfo getReal() {
        return (android.service.autofill.SavedDatasetsInfo) real;
    }

    public android.service.autofill.SavedDatasetsInfo unwrap() {
        return getReal();
    }

    public SavedDatasetsInfo(java.lang.String arg0, int arg1) {
        this(new android.service.autofill.SavedDatasetsInfo(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.autofill.SavedDatasetsInfo) real).equals(arg0);
    }

    public int getCount() {
        return ((android.service.autofill.SavedDatasetsInfo) real).getCount();
    }

    public java.lang.String getType() {
        return ((android.service.autofill.SavedDatasetsInfo) real).getType();
    }

    public int hashCode() {
        return ((android.service.autofill.SavedDatasetsInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.SavedDatasetsInfo) real).toString();
    }

    public static final java.lang.String TYPE_OTHER = android.service.autofill.SavedDatasetsInfo.TYPE_OTHER;
    public static final java.lang.String TYPE_PASSWORDS = android.service.autofill.SavedDatasetsInfo.TYPE_PASSWORDS;

}
