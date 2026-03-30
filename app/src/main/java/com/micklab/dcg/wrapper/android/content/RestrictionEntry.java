// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class RestrictionEntry {
    private final android.content.RestrictionEntry real;

    public RestrictionEntry(android.content.RestrictionEntry real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.RestrictionEntry wrap(android.content.RestrictionEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.RestrictionEntry(real);
    }

    public android.content.RestrictionEntry unwrap() {
        return real;
    }

    public RestrictionEntry(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.RestrictionEntry(arg0 == null ? null : arg0.unwrap()));
    }

    public RestrictionEntry(java.lang.String arg0, int arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1));
    }

    public RestrictionEntry(java.lang.String arg0, java.lang.String[] arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1));
    }

    public RestrictionEntry(int arg0, java.lang.String arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1));
    }

    public RestrictionEntry(java.lang.String arg0, java.lang.String arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1));
    }

    public RestrictionEntry(java.lang.String arg0, boolean arg1) {
        this(new android.content.RestrictionEntry(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.RestrictionEntry createBundleArrayEntry(java.lang.String arg0, android.content.RestrictionEntry[] arg1) {
        return com.micklab.dcg.wrapper.android.content.RestrictionEntry.wrap(android.content.RestrictionEntry.createBundleArrayEntry(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.RestrictionEntry createBundleEntry(java.lang.String arg0, android.content.RestrictionEntry[] arg1) {
        return com.micklab.dcg.wrapper.android.content.RestrictionEntry.wrap(android.content.RestrictionEntry.createBundleEntry(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String[] getAllSelectedStrings() {
        return real.getAllSelectedStrings();
    }

    public java.lang.String[] getChoiceEntries() {
        return real.getChoiceEntries();
    }

    public java.lang.String[] getChoiceValues() {
        return real.getChoiceValues();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public int getIntValue() {
        return real.getIntValue();
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public android.content.RestrictionEntry[] getRestrictions() {
        return real.getRestrictions();
    }

    public boolean getSelectedState() {
        return real.getSelectedState();
    }

    public java.lang.String getSelectedString() {
        return real.getSelectedString();
    }

    public java.lang.String getTitle() {
        return real.getTitle();
    }

    public int getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setAllSelectedStrings(java.lang.String[] arg0) {
        real.setAllSelectedStrings(arg0);
    }

    public void setChoiceEntries(java.lang.String[] arg0) {
        real.setChoiceEntries(arg0);
    }

    public void setChoiceEntries(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setChoiceEntries(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setChoiceValues(java.lang.String[] arg0) {
        real.setChoiceValues(arg0);
    }

    public void setChoiceValues(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setChoiceValues(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setDescription(java.lang.String arg0) {
        real.setDescription(arg0);
    }

    public void setIntValue(int arg0) {
        real.setIntValue(arg0);
    }

    public void setRestrictions(android.content.RestrictionEntry[] arg0) {
        real.setRestrictions(arg0);
    }

    public void setSelectedState(boolean arg0) {
        real.setSelectedState(arg0);
    }

    public void setSelectedString(java.lang.String arg0) {
        real.setSelectedString(arg0);
    }

    public void setTitle(java.lang.String arg0) {
        real.setTitle(arg0);
    }

    public void setType(int arg0) {
        real.setType(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
