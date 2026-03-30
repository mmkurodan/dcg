// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class AutofillValue {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutofillValue(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillValue wrap(android.view.autofill.AutofillValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillValue(real, (__DcgwBridgeToken) null);
    }

    public android.view.autofill.AutofillValue getReal() {
        return (android.view.autofill.AutofillValue) real;
    }

    public android.view.autofill.AutofillValue unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.autofill.AutofillValue) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.autofill.AutofillValue) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillValue forDate(long arg0) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(android.view.autofill.AutofillValue.forDate(arg0));
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillValue forList(int arg0) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(android.view.autofill.AutofillValue.forList(arg0));
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillValue forText(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(android.view.autofill.AutofillValue.forText(arg0));
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillValue forToggle(boolean arg0) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(android.view.autofill.AutofillValue.forToggle(arg0));
    }

    public long getDateValue() {
        return ((android.view.autofill.AutofillValue) real).getDateValue();
    }

    public int getListValue() {
        return ((android.view.autofill.AutofillValue) real).getListValue();
    }

    public java.lang.CharSequence getTextValue() {
        return ((android.view.autofill.AutofillValue) real).getTextValue();
    }

    public boolean getToggleValue() {
        return ((android.view.autofill.AutofillValue) real).getToggleValue();
    }

    public int hashCode() {
        return ((android.view.autofill.AutofillValue) real).hashCode();
    }

    public boolean isDate() {
        return ((android.view.autofill.AutofillValue) real).isDate();
    }

    public boolean isList() {
        return ((android.view.autofill.AutofillValue) real).isList();
    }

    public boolean isText() {
        return ((android.view.autofill.AutofillValue) real).isText();
    }

    public boolean isToggle() {
        return ((android.view.autofill.AutofillValue) real).isToggle();
    }

    public java.lang.String toString() {
        return ((android.view.autofill.AutofillValue) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.autofill.AutofillValue) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
