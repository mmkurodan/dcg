// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SavedDatasetsInfo {
    private final android.service.autofill.SavedDatasetsInfo real;

    public SavedDatasetsInfo(android.service.autofill.SavedDatasetsInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfo wrap(android.service.autofill.SavedDatasetsInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfo(real);
    }

    public android.service.autofill.SavedDatasetsInfo unwrap() {
        return real;
    }

    public SavedDatasetsInfo(java.lang.String arg0, int arg1) {
        this(new android.service.autofill.SavedDatasetsInfo(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getCount() {
        return real.getCount();
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final java.lang.String TYPE_OTHER = android.service.autofill.SavedDatasetsInfo.TYPE_OTHER;
    public static final java.lang.String TYPE_PASSWORDS = android.service.autofill.SavedDatasetsInfo.TYPE_PASSWORDS;

}
