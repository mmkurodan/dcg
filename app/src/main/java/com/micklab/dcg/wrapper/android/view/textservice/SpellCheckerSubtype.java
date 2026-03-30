// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SpellCheckerSubtype {
    private final android.view.textservice.SpellCheckerSubtype real;

    public SpellCheckerSubtype(android.view.textservice.SpellCheckerSubtype real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype wrap(android.view.textservice.SpellCheckerSubtype real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype(real);
    }

    public android.view.textservice.SpellCheckerSubtype unwrap() {
        return real;
    }

    public SpellCheckerSubtype(int arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.view.textservice.SpellCheckerSubtype(arg0, arg1, arg2));
    }

    public boolean containsExtraValueKey(java.lang.String arg0) {
        return real.containsExtraValueKey(arg0);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.CharSequence getDisplayName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg2) {
        return real.getDisplayName(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.String getExtraValue() {
        return real.getExtraValue();
    }

    public java.lang.String getExtraValueOf(java.lang.String arg0) {
        return real.getExtraValueOf(arg0);
    }

    public java.lang.String getLanguageTag() {
        return real.getLanguageTag();
    }

    public java.lang.String getLocale() {
        return real.getLocale();
    }

    public int getNameResId() {
        return real.getNameResId();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
