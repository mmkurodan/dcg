// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.assist;

public final class AssistContent {
    private final android.app.assist.AssistContent real;

    public AssistContent(android.app.assist.AssistContent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.assist.AssistContent wrap(android.app.assist.AssistContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistContent(real);
    }

    public android.app.assist.AssistContent unwrap() {
        return real;
    }

    public AssistContent() {
        this(new android.app.assist.AssistContent());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClipData() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(real.getClipData());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
    }

    public java.lang.String getStructuredData() {
        return real.getStructuredData();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getWebUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getWebUri());
    }

    public boolean isAppProvidedIntent() {
        return real.isAppProvidedIntent();
    }

    public boolean isAppProvidedWebUri() {
        return real.isAppProvidedWebUri();
    }

    public void setClipData(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
        real.setClipData(arg0 == null ? null : arg0.unwrap());
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setIntent(arg0 == null ? null : arg0.unwrap());
    }

    public void setStructuredData(java.lang.String arg0) {
        real.setStructuredData(arg0);
    }

    public void setWebUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.setWebUri(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
