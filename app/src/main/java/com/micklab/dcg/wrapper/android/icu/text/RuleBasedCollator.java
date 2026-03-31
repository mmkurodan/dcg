// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class RuleBasedCollator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RuleBasedCollator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator wrap(android.icu.text.RuleBasedCollator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.RuleBasedCollator getReal() {
        return (android.icu.text.RuleBasedCollator) real;
    }

    public android.icu.text.RuleBasedCollator unwrap() {
        return getReal();
    }

    public RuleBasedCollator(java.lang.String arg0) throws java.lang.Exception {
        this(new android.icu.text.RuleBasedCollator(arg0), (__DcgwBridgeToken) null);
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return ((android.icu.text.RuleBasedCollator) real).clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(((android.icu.text.RuleBasedCollator) real).cloneAsThawed());
    }

    public int compare(java.lang.String arg0, java.lang.String arg1) {
        return ((android.icu.text.RuleBasedCollator) real).compare(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.RuleBasedCollator) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(((android.icu.text.RuleBasedCollator) real).freeze());
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator getCollationElementIterator(com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator.wrap(((android.icu.text.RuleBasedCollator) real).getCollationElementIterator(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator getCollationElementIterator(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator.wrap(((android.icu.text.RuleBasedCollator) real).getCollationElementIterator(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator getCollationElementIterator(java.text.CharacterIterator arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator.wrap(((android.icu.text.RuleBasedCollator) real).getCollationElementIterator(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey getCollationKey(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(((android.icu.text.RuleBasedCollator) real).getCollationKey(arg0));
    }

    public void getContractionsAndExpansions(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg1, boolean arg2) throws java.lang.Exception {
        ((android.icu.text.RuleBasedCollator) real).getContractionsAndExpansions(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int getDecomposition() {
        return ((android.icu.text.RuleBasedCollator) real).getDecomposition();
    }

    public int getMaxVariable() {
        return ((android.icu.text.RuleBasedCollator) real).getMaxVariable();
    }

    public boolean getNumericCollation() {
        return ((android.icu.text.RuleBasedCollator) real).getNumericCollation();
    }

    public int[] getReorderCodes() {
        return ((android.icu.text.RuleBasedCollator) real).getReorderCodes();
    }

    public java.lang.String getRules() {
        return ((android.icu.text.RuleBasedCollator) real).getRules();
    }

    public java.lang.String getRules(boolean arg0) {
        return ((android.icu.text.RuleBasedCollator) real).getRules(arg0);
    }

    public int getStrength() {
        return ((android.icu.text.RuleBasedCollator) real).getStrength();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getTailoredSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.RuleBasedCollator) real).getTailoredSet());
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getUCAVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(((android.icu.text.RuleBasedCollator) real).getUCAVersion());
    }

    public int getVariableTop() {
        return ((android.icu.text.RuleBasedCollator) real).getVariableTop();
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(((android.icu.text.RuleBasedCollator) real).getVersion());
    }

    public int hashCode() {
        return ((android.icu.text.RuleBasedCollator) real).hashCode();
    }

    public boolean isAlternateHandlingShifted() {
        return ((android.icu.text.RuleBasedCollator) real).isAlternateHandlingShifted();
    }

    public boolean isCaseLevel() {
        return ((android.icu.text.RuleBasedCollator) real).isCaseLevel();
    }

    public boolean isFrenchCollation() {
        return ((android.icu.text.RuleBasedCollator) real).isFrenchCollation();
    }

    public boolean isFrozen() {
        return ((android.icu.text.RuleBasedCollator) real).isFrozen();
    }

    public boolean isLowerCaseFirst() {
        return ((android.icu.text.RuleBasedCollator) real).isLowerCaseFirst();
    }

    public boolean isUpperCaseFirst() {
        return ((android.icu.text.RuleBasedCollator) real).isUpperCaseFirst();
    }

    public void setAlternateHandlingDefault() {
        ((android.icu.text.RuleBasedCollator) real).setAlternateHandlingDefault();
    }

    public void setAlternateHandlingShifted(boolean arg0) {
        ((android.icu.text.RuleBasedCollator) real).setAlternateHandlingShifted(arg0);
    }

    public void setCaseFirstDefault() {
        ((android.icu.text.RuleBasedCollator) real).setCaseFirstDefault();
    }

    public void setCaseLevel(boolean arg0) {
        ((android.icu.text.RuleBasedCollator) real).setCaseLevel(arg0);
    }

    public void setCaseLevelDefault() {
        ((android.icu.text.RuleBasedCollator) real).setCaseLevelDefault();
    }

    public void setDecomposition(int arg0) {
        ((android.icu.text.RuleBasedCollator) real).setDecomposition(arg0);
    }

    public void setDecompositionDefault() {
        ((android.icu.text.RuleBasedCollator) real).setDecompositionDefault();
    }

    public void setFrenchCollation(boolean arg0) {
        ((android.icu.text.RuleBasedCollator) real).setFrenchCollation(arg0);
    }

    public void setFrenchCollationDefault() {
        ((android.icu.text.RuleBasedCollator) real).setFrenchCollationDefault();
    }

    public void setLowerCaseFirst(boolean arg0) {
        ((android.icu.text.RuleBasedCollator) real).setLowerCaseFirst(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator setMaxVariable(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(((android.icu.text.RuleBasedCollator) real).setMaxVariable(arg0));
    }

    public void setNumericCollation(boolean arg0) {
        ((android.icu.text.RuleBasedCollator) real).setNumericCollation(arg0);
    }

    public void setNumericCollationDefault() {
        ((android.icu.text.RuleBasedCollator) real).setNumericCollationDefault();
    }

    public void setReorderCodes(int... arg0) {
        ((android.icu.text.RuleBasedCollator) real).setReorderCodes(arg0);
    }

    public void setStrength(int arg0) {
        ((android.icu.text.RuleBasedCollator) real).setStrength(arg0);
    }

    public void setStrengthDefault() {
        ((android.icu.text.RuleBasedCollator) real).setStrengthDefault();
    }

    public void setUpperCaseFirst(boolean arg0) {
        ((android.icu.text.RuleBasedCollator) real).setUpperCaseFirst(arg0);
    }

}
