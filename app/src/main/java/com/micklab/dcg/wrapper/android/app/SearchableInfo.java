// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class SearchableInfo {
    private final android.app.SearchableInfo real;

    public SearchableInfo(android.app.SearchableInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.SearchableInfo wrap(android.app.SearchableInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.SearchableInfo(real);
    }

    public android.app.SearchableInfo unwrap() {
        return real;
    }

    public boolean autoUrlDetect() {
        return real.autoUrlDetect();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getHintId() {
        return real.getHintId();
    }

    public int getImeOptions() {
        return real.getImeOptions();
    }

    public int getInputType() {
        return real.getInputType();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getSearchActivity() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getSearchActivity());
    }

    public int getSettingsDescriptionId() {
        return real.getSettingsDescriptionId();
    }

    public java.lang.String getSuggestAuthority() {
        return real.getSuggestAuthority();
    }

    public java.lang.String getSuggestIntentAction() {
        return real.getSuggestIntentAction();
    }

    public java.lang.String getSuggestIntentData() {
        return real.getSuggestIntentData();
    }

    public java.lang.String getSuggestPackage() {
        return real.getSuggestPackage();
    }

    public java.lang.String getSuggestPath() {
        return real.getSuggestPath();
    }

    public java.lang.String getSuggestSelection() {
        return real.getSuggestSelection();
    }

    public int getSuggestThreshold() {
        return real.getSuggestThreshold();
    }

    public int getVoiceLanguageId() {
        return real.getVoiceLanguageId();
    }

    public int getVoiceLanguageModeId() {
        return real.getVoiceLanguageModeId();
    }

    public int getVoiceMaxResults() {
        return real.getVoiceMaxResults();
    }

    public int getVoicePromptTextId() {
        return real.getVoicePromptTextId();
    }

    public boolean getVoiceSearchEnabled() {
        return real.getVoiceSearchEnabled();
    }

    public boolean getVoiceSearchLaunchRecognizer() {
        return real.getVoiceSearchLaunchRecognizer();
    }

    public boolean getVoiceSearchLaunchWebSearch() {
        return real.getVoiceSearchLaunchWebSearch();
    }

    public boolean queryAfterZeroResults() {
        return real.queryAfterZeroResults();
    }

    public boolean shouldIncludeInGlobalSearch() {
        return real.shouldIncludeInGlobalSearch();
    }

    public boolean shouldRewriteQueryFromData() {
        return real.shouldRewriteQueryFromData();
    }

    public boolean shouldRewriteQueryFromText() {
        return real.shouldRewriteQueryFromText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
