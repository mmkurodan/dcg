// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintJobInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintJobInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintJobInfo wrap(android.print.PrintJobInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJobInfo(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrintJobInfo getReal() {
        return (android.print.PrintJobInfo) real;
    }

    public android.print.PrintJobInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.print.PrintJobInfo) real).describeContents();
    }

    public int getAdvancedIntOption(java.lang.String arg0) {
        return ((android.print.PrintJobInfo) real).getAdvancedIntOption(arg0);
    }

    public java.lang.String getAdvancedStringOption(java.lang.String arg0) {
        return ((android.print.PrintJobInfo) real).getAdvancedStringOption(arg0);
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes getAttributes() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.wrap(((android.print.PrintJobInfo) real).getAttributes());
    }

    public int getCopies() {
        return ((android.print.PrintJobInfo) real).getCopies();
    }

    public long getCreationTime() {
        return ((android.print.PrintJobInfo) real).getCreationTime();
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobId getId() {
        return com.micklab.dcg.wrapper.android.print.PrintJobId.wrap(((android.print.PrintJobInfo) real).getId());
    }

    public java.lang.String getLabel() {
        return ((android.print.PrintJobInfo) real).getLabel();
    }

    public android.print.PageRange[] getPages() {
        return ((android.print.PrintJobInfo) real).getPages();
    }

    public com.micklab.dcg.wrapper.android.print.PrinterId getPrinterId() {
        return com.micklab.dcg.wrapper.android.print.PrinterId.wrap(((android.print.PrintJobInfo) real).getPrinterId());
    }

    public int getState() {
        return ((android.print.PrintJobInfo) real).getState();
    }

    public boolean hasAdvancedOption(java.lang.String arg0) {
        return ((android.print.PrintJobInfo) real).hasAdvancedOption(arg0);
    }

    public java.lang.String toString() {
        return ((android.print.PrintJobInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PrintJobInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STATE_BLOCKED = android.print.PrintJobInfo.STATE_BLOCKED;
    public static final int STATE_CANCELED = android.print.PrintJobInfo.STATE_CANCELED;
    public static final int STATE_COMPLETED = android.print.PrintJobInfo.STATE_COMPLETED;
    public static final int STATE_CREATED = android.print.PrintJobInfo.STATE_CREATED;
    public static final int STATE_FAILED = android.print.PrintJobInfo.STATE_FAILED;
    public static final int STATE_QUEUED = android.print.PrintJobInfo.STATE_QUEUED;
    public static final int STATE_STARTED = android.print.PrintJobInfo.STATE_STARTED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintJobInfo.Builder wrap(android.print.PrintJobInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJobInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintJobInfo.Builder getReal() {
            return (android.print.PrintJobInfo.Builder) real;
        }

        public android.print.PrintJobInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrintJobInfo arg0) {
            this(new android.print.PrintJobInfo.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.print.PrintJobInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrintJobInfo.wrap(((android.print.PrintJobInfo.Builder) real).build());
        }

        public void putAdvancedOption(java.lang.String arg0, java.lang.String arg1) {
            ((android.print.PrintJobInfo.Builder) real).putAdvancedOption(arg0, arg1);
        }

        public void putAdvancedOption(java.lang.String arg0, int arg1) {
            ((android.print.PrintJobInfo.Builder) real).putAdvancedOption(arg0, arg1);
        }

        public void setAttributes(com.micklab.dcg.wrapper.android.print.PrintAttributes arg0) {
            ((android.print.PrintJobInfo.Builder) real).setAttributes(arg0 == null ? null : arg0.getReal());
        }

        public void setCopies(int arg0) {
            ((android.print.PrintJobInfo.Builder) real).setCopies(arg0);
        }

        public void setPages(android.print.PageRange[] arg0) {
            ((android.print.PrintJobInfo.Builder) real).setPages(arg0);
        }

    }
}
