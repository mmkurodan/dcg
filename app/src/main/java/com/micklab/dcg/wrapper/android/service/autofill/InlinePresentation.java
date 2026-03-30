// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class InlinePresentation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlinePresentation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation wrap(android.service.autofill.InlinePresentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.InlinePresentation getReal() {
        return (android.service.autofill.InlinePresentation) real;
    }

    public android.service.autofill.InlinePresentation unwrap() {
        return getReal();
    }

    public InlinePresentation(com.micklab.dcg.wrapper.android.app.slice.Slice arg0, com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg1, boolean arg2) {
        this(new android.service.autofill.InlinePresentation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation createTooltipPresentation(com.micklab.dcg.wrapper.android.app.slice.Slice arg0, com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg1) {
        return com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation.wrap(android.service.autofill.InlinePresentation.createTooltipPresentation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public int describeContents() {
        return ((android.service.autofill.InlinePresentation) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.service.autofill.InlinePresentation) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec getInlinePresentationSpec() {
        return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(((android.service.autofill.InlinePresentation) real).getInlinePresentationSpec());
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(((android.service.autofill.InlinePresentation) real).getSlice());
    }

    public int hashCode() {
        return ((android.service.autofill.InlinePresentation) real).hashCode();
    }

    public boolean isPinned() {
        return ((android.service.autofill.InlinePresentation) real).isPinned();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.InlinePresentation) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.InlinePresentation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
