// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.assist;

public final class AssistContent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssistContent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.assist.AssistContent wrap(android.app.assist.AssistContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistContent(real, (__DcgwBridgeToken) null);
    }

    public android.app.assist.AssistContent getReal() {
        return (android.app.assist.AssistContent) real;
    }

    public android.app.assist.AssistContent unwrap() {
        return getReal();
    }

    public AssistContent() {
        this(new android.app.assist.AssistContent(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.assist.AssistContent) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClipData() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(((android.app.assist.AssistContent) real).getClipData());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.assist.AssistContent) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.assist.AssistContent) real).getIntent());
    }

    public java.lang.String getStructuredData() {
        return ((android.app.assist.AssistContent) real).getStructuredData();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getWebUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.assist.AssistContent) real).getWebUri());
    }

    public boolean isAppProvidedIntent() {
        return ((android.app.assist.AssistContent) real).isAppProvidedIntent();
    }

    public boolean isAppProvidedWebUri() {
        return ((android.app.assist.AssistContent) real).isAppProvidedWebUri();
    }

    public void setClipData(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
        ((android.app.assist.AssistContent) real).setClipData(arg0 == null ? null : arg0.getReal());
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.app.assist.AssistContent) real).setIntent(arg0 == null ? null : arg0.getReal());
    }

    public void setStructuredData(java.lang.String arg0) {
        ((android.app.assist.AssistContent) real).setStructuredData(arg0);
    }

    public void setWebUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.app.assist.AssistContent) real).setWebUri(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.assist.AssistContent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
