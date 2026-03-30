// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class AutofillValue {
    private final android.view.autofill.AutofillValue real;

    public AutofillValue(android.view.autofill.AutofillValue real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillValue wrap(android.view.autofill.AutofillValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillValue(real);
    }

    public android.view.autofill.AutofillValue unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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
        return real.getDateValue();
    }

    public int getListValue() {
        return real.getListValue();
    }

    public java.lang.CharSequence getTextValue() {
        return real.getTextValue();
    }

    public boolean getToggleValue() {
        return real.getToggleValue();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isDate() {
        return real.isDate();
    }

    public boolean isList() {
        return real.isList();
    }

    public boolean isText() {
        return real.isText();
    }

    public boolean isToggle() {
        return real.isToggle();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
