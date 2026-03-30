// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SpellCheckerSubtype {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpellCheckerSubtype(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype wrap(android.view.textservice.SpellCheckerSubtype real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype(real, (__DcgwBridgeToken) null);
    }

    public android.view.textservice.SpellCheckerSubtype getReal() {
        return (android.view.textservice.SpellCheckerSubtype) real;
    }

    public android.view.textservice.SpellCheckerSubtype unwrap() {
        return getReal();
    }

    public SpellCheckerSubtype(int arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.view.textservice.SpellCheckerSubtype(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean containsExtraValueKey(java.lang.String arg0) {
        return ((android.view.textservice.SpellCheckerSubtype) real).containsExtraValueKey(arg0);
    }

    public int describeContents() {
        return ((android.view.textservice.SpellCheckerSubtype) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.textservice.SpellCheckerSubtype) real).equals(arg0);
    }

    public java.lang.CharSequence getDisplayName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg2) {
        return ((android.view.textservice.SpellCheckerSubtype) real).getDisplayName(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.String getExtraValue() {
        return ((android.view.textservice.SpellCheckerSubtype) real).getExtraValue();
    }

    public java.lang.String getExtraValueOf(java.lang.String arg0) {
        return ((android.view.textservice.SpellCheckerSubtype) real).getExtraValueOf(arg0);
    }

    public java.lang.String getLanguageTag() {
        return ((android.view.textservice.SpellCheckerSubtype) real).getLanguageTag();
    }

    public java.lang.String getLocale() {
        return ((android.view.textservice.SpellCheckerSubtype) real).getLocale();
    }

    public int getNameResId() {
        return ((android.view.textservice.SpellCheckerSubtype) real).getNameResId();
    }

    public int hashCode() {
        return ((android.view.textservice.SpellCheckerSubtype) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textservice.SpellCheckerSubtype) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
