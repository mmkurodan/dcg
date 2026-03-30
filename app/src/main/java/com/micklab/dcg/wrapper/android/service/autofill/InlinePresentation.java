// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class InlinePresentation {
    private final android.service.autofill.InlinePresentation real;

    public InlinePresentation(android.service.autofill.InlinePresentation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation wrap(android.service.autofill.InlinePresentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation(real);
    }

    public android.service.autofill.InlinePresentation unwrap() {
        return real;
    }

    public InlinePresentation(com.micklab.dcg.wrapper.android.app.slice.Slice arg0, com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg1, boolean arg2) {
        this(new android.service.autofill.InlinePresentation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation createTooltipPresentation(com.micklab.dcg.wrapper.android.app.slice.Slice arg0, com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec arg1) {
        return com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation.wrap(android.service.autofill.InlinePresentation.createTooltipPresentation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec getInlinePresentationSpec() {
        return com.micklab.dcg.wrapper.android.widget.inline.InlinePresentationSpec.wrap(real.getInlinePresentationSpec());
    }

    public com.micklab.dcg.wrapper.android.app.slice.Slice getSlice() {
        return com.micklab.dcg.wrapper.android.app.slice.Slice.wrap(real.getSlice());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isPinned() {
        return real.isPinned();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
