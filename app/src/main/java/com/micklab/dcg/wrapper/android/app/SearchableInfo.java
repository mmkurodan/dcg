// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class SearchableInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchableInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.SearchableInfo wrap(android.app.SearchableInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.SearchableInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.SearchableInfo getReal() {
        return (android.app.SearchableInfo) real;
    }

    public android.app.SearchableInfo unwrap() {
        return getReal();
    }

    public boolean autoUrlDetect() {
        return ((android.app.SearchableInfo) real).autoUrlDetect();
    }

    public int describeContents() {
        return ((android.app.SearchableInfo) real).describeContents();
    }

    public int getHintId() {
        return ((android.app.SearchableInfo) real).getHintId();
    }

    public int getImeOptions() {
        return ((android.app.SearchableInfo) real).getImeOptions();
    }

    public int getInputType() {
        return ((android.app.SearchableInfo) real).getInputType();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getSearchActivity() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.SearchableInfo) real).getSearchActivity());
    }

    public int getSettingsDescriptionId() {
        return ((android.app.SearchableInfo) real).getSettingsDescriptionId();
    }

    public java.lang.String getSuggestAuthority() {
        return ((android.app.SearchableInfo) real).getSuggestAuthority();
    }

    public java.lang.String getSuggestIntentAction() {
        return ((android.app.SearchableInfo) real).getSuggestIntentAction();
    }

    public java.lang.String getSuggestIntentData() {
        return ((android.app.SearchableInfo) real).getSuggestIntentData();
    }

    public java.lang.String getSuggestPackage() {
        return ((android.app.SearchableInfo) real).getSuggestPackage();
    }

    public java.lang.String getSuggestPath() {
        return ((android.app.SearchableInfo) real).getSuggestPath();
    }

    public java.lang.String getSuggestSelection() {
        return ((android.app.SearchableInfo) real).getSuggestSelection();
    }

    public int getSuggestThreshold() {
        return ((android.app.SearchableInfo) real).getSuggestThreshold();
    }

    public int getVoiceLanguageId() {
        return ((android.app.SearchableInfo) real).getVoiceLanguageId();
    }

    public int getVoiceLanguageModeId() {
        return ((android.app.SearchableInfo) real).getVoiceLanguageModeId();
    }

    public int getVoiceMaxResults() {
        return ((android.app.SearchableInfo) real).getVoiceMaxResults();
    }

    public int getVoicePromptTextId() {
        return ((android.app.SearchableInfo) real).getVoicePromptTextId();
    }

    public boolean getVoiceSearchEnabled() {
        return ((android.app.SearchableInfo) real).getVoiceSearchEnabled();
    }

    public boolean getVoiceSearchLaunchRecognizer() {
        return ((android.app.SearchableInfo) real).getVoiceSearchLaunchRecognizer();
    }

    public boolean getVoiceSearchLaunchWebSearch() {
        return ((android.app.SearchableInfo) real).getVoiceSearchLaunchWebSearch();
    }

    public boolean queryAfterZeroResults() {
        return ((android.app.SearchableInfo) real).queryAfterZeroResults();
    }

    public boolean shouldIncludeInGlobalSearch() {
        return ((android.app.SearchableInfo) real).shouldIncludeInGlobalSearch();
    }

    public boolean shouldRewriteQueryFromData() {
        return ((android.app.SearchableInfo) real).shouldRewriteQueryFromData();
    }

    public boolean shouldRewriteQueryFromText() {
        return ((android.app.SearchableInfo) real).shouldRewriteQueryFromText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.SearchableInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
