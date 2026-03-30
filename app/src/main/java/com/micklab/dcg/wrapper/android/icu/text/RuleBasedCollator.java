// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class RuleBasedCollator {
    private final android.icu.text.RuleBasedCollator real;

    public RuleBasedCollator(android.icu.text.RuleBasedCollator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator wrap(android.icu.text.RuleBasedCollator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator(real);
    }

    public android.icu.text.RuleBasedCollator unwrap() {
        return real;
    }

    public RuleBasedCollator(java.lang.String arg0) throws java.lang.Exception {
        this(new android.icu.text.RuleBasedCollator(arg0));
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(real.cloneAsThawed());
    }

    public int compare(java.lang.String arg0, java.lang.String arg1) {
        return real.compare(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(real.freeze());
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator getCollationElementIterator(java.text.CharacterIterator arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator.wrap(real.getCollationElementIterator(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator getCollationElementIterator(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator.wrap(real.getCollationElementIterator(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator getCollationElementIterator(com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator.wrap(real.getCollationElementIterator(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey getCollationKey(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(real.getCollationKey(arg0));
    }

    public void getContractionsAndExpansions(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg1, boolean arg2) throws java.lang.Exception {
        real.getContractionsAndExpansions(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public int getDecomposition() {
        return real.getDecomposition();
    }

    public int getMaxVariable() {
        return real.getMaxVariable();
    }

    public boolean getNumericCollation() {
        return real.getNumericCollation();
    }

    public int[] getReorderCodes() {
        return real.getReorderCodes();
    }

    public java.lang.String getRules() {
        return real.getRules();
    }

    public java.lang.String getRules(boolean arg0) {
        return real.getRules(arg0);
    }

    public int getStrength() {
        return real.getStrength();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getTailoredSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.getTailoredSet());
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getUCAVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(real.getUCAVersion());
    }

    public int getVariableTop() {
        return real.getVariableTop();
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(real.getVersion());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isAlternateHandlingShifted() {
        return real.isAlternateHandlingShifted();
    }

    public boolean isCaseLevel() {
        return real.isCaseLevel();
    }

    public boolean isFrenchCollation() {
        return real.isFrenchCollation();
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

    public boolean isLowerCaseFirst() {
        return real.isLowerCaseFirst();
    }

    public boolean isUpperCaseFirst() {
        return real.isUpperCaseFirst();
    }

    public void setAlternateHandlingDefault() {
        real.setAlternateHandlingDefault();
    }

    public void setAlternateHandlingShifted(boolean arg0) {
        real.setAlternateHandlingShifted(arg0);
    }

    public void setCaseFirstDefault() {
        real.setCaseFirstDefault();
    }

    public void setCaseLevel(boolean arg0) {
        real.setCaseLevel(arg0);
    }

    public void setCaseLevelDefault() {
        real.setCaseLevelDefault();
    }

    public void setDecomposition(int arg0) {
        real.setDecomposition(arg0);
    }

    public void setDecompositionDefault() {
        real.setDecompositionDefault();
    }

    public void setFrenchCollation(boolean arg0) {
        real.setFrenchCollation(arg0);
    }

    public void setFrenchCollationDefault() {
        real.setFrenchCollationDefault();
    }

    public void setLowerCaseFirst(boolean arg0) {
        real.setLowerCaseFirst(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator setMaxVariable(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(real.setMaxVariable(arg0));
    }

    public void setNumericCollation(boolean arg0) {
        real.setNumericCollation(arg0);
    }

    public void setNumericCollationDefault() {
        real.setNumericCollationDefault();
    }

    public void setReorderCodes(int... arg0) {
        real.setReorderCodes(arg0);
    }

    public void setStrength(int arg0) {
        real.setStrength(arg0);
    }

    public void setStrengthDefault() {
        real.setStrengthDefault();
    }

    public void setUpperCaseFirst(boolean arg0) {
        real.setUpperCaseFirst(arg0);
    }

}
