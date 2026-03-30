// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class RestrictionEntry {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RestrictionEntry(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.RestrictionEntry wrap(android.content.RestrictionEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.RestrictionEntry(real, (__DcgwBridgeToken) null);
    }

    public android.content.RestrictionEntry getReal() {
        return (android.content.RestrictionEntry) real;
    }

    public android.content.RestrictionEntry unwrap() {
        return getReal();
    }

    public RestrictionEntry(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.RestrictionEntry(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RestrictionEntry(java.lang.String arg0, int arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public RestrictionEntry(java.lang.String arg0, java.lang.String[] arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public RestrictionEntry(int arg0, java.lang.String arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public RestrictionEntry(java.lang.String arg0, java.lang.String arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public RestrictionEntry(java.lang.String arg0, boolean arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.content.RestrictionEntry createBundleArrayEntry(java.lang.String arg0, android.content.RestrictionEntry[] arg1) {
        return com.micklab.dcg.wrapper.android.content.RestrictionEntry.wrap(android.content.RestrictionEntry.createBundleArrayEntry(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.RestrictionEntry createBundleEntry(java.lang.String arg0, android.content.RestrictionEntry[] arg1) {
        return com.micklab.dcg.wrapper.android.content.RestrictionEntry.wrap(android.content.RestrictionEntry.createBundleEntry(arg0, arg1));
    }

    public int describeContents() {
        return ((android.content.RestrictionEntry) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.RestrictionEntry) real).equals(arg0);
    }

    public java.lang.String[] getAllSelectedStrings() {
        return ((android.content.RestrictionEntry) real).getAllSelectedStrings();
    }

    public java.lang.String[] getChoiceEntries() {
        return ((android.content.RestrictionEntry) real).getChoiceEntries();
    }

    public java.lang.String[] getChoiceValues() {
        return ((android.content.RestrictionEntry) real).getChoiceValues();
    }

    public java.lang.String getDescription() {
        return ((android.content.RestrictionEntry) real).getDescription();
    }

    public int getIntValue() {
        return ((android.content.RestrictionEntry) real).getIntValue();
    }

    public java.lang.String getKey() {
        return ((android.content.RestrictionEntry) real).getKey();
    }

    public android.content.RestrictionEntry[] getRestrictions() {
        return ((android.content.RestrictionEntry) real).getRestrictions();
    }

    public boolean getSelectedState() {
        return ((android.content.RestrictionEntry) real).getSelectedState();
    }

    public java.lang.String getSelectedString() {
        return ((android.content.RestrictionEntry) real).getSelectedString();
    }

    public java.lang.String getTitle() {
        return ((android.content.RestrictionEntry) real).getTitle();
    }

    public int getType() {
        return ((android.content.RestrictionEntry) real).getType();
    }

    public int hashCode() {
        return ((android.content.RestrictionEntry) real).hashCode();
    }

    public void setAllSelectedStrings(java.lang.String[] arg0) {
        ((android.content.RestrictionEntry) real).setAllSelectedStrings(arg0);
    }

    public void setChoiceEntries(java.lang.String[] arg0) {
        ((android.content.RestrictionEntry) real).setChoiceEntries(arg0);
    }

    public void setChoiceEntries(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.content.RestrictionEntry) real).setChoiceEntries(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setChoiceValues(java.lang.String[] arg0) {
        ((android.content.RestrictionEntry) real).setChoiceValues(arg0);
    }

    public void setChoiceValues(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.content.RestrictionEntry) real).setChoiceValues(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setDescription(java.lang.String arg0) {
        ((android.content.RestrictionEntry) real).setDescription(arg0);
    }

    public void setIntValue(int arg0) {
        ((android.content.RestrictionEntry) real).setIntValue(arg0);
    }

    public void setRestrictions(android.content.RestrictionEntry[] arg0) {
        ((android.content.RestrictionEntry) real).setRestrictions(arg0);
    }

    public void setSelectedState(boolean arg0) {
        ((android.content.RestrictionEntry) real).setSelectedState(arg0);
    }

    public void setSelectedString(java.lang.String arg0) {
        ((android.content.RestrictionEntry) real).setSelectedString(arg0);
    }

    public void setTitle(java.lang.String arg0) {
        ((android.content.RestrictionEntry) real).setTitle(arg0);
    }

    public void setType(int arg0) {
        ((android.content.RestrictionEntry) real).setType(arg0);
    }

    public java.lang.String toString() {
        return ((android.content.RestrictionEntry) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.RestrictionEntry) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_BOOLEAN = android.content.RestrictionEntry.TYPE_BOOLEAN;
    public static final int TYPE_BUNDLE = android.content.RestrictionEntry.TYPE_BUNDLE;
    public static final int TYPE_BUNDLE_ARRAY = android.content.RestrictionEntry.TYPE_BUNDLE_ARRAY;
    public static final int TYPE_CHOICE = android.content.RestrictionEntry.TYPE_CHOICE;
    public static final int TYPE_INTEGER = android.content.RestrictionEntry.TYPE_INTEGER;
    public static final int TYPE_MULTI_SELECT = android.content.RestrictionEntry.TYPE_MULTI_SELECT;
    public static final int TYPE_NULL = android.content.RestrictionEntry.TYPE_NULL;
    public static final int TYPE_STRING = android.content.RestrictionEntry.TYPE_STRING;

}
