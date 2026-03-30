// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintJobInfo {
    private final android.print.PrintJobInfo real;

    public PrintJobInfo(android.print.PrintJobInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintJobInfo wrap(android.print.PrintJobInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJobInfo(real);
    }

    public android.print.PrintJobInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAdvancedIntOption(java.lang.String arg0) {
        return real.getAdvancedIntOption(arg0);
    }

    public java.lang.String getAdvancedStringOption(java.lang.String arg0) {
        return real.getAdvancedStringOption(arg0);
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes getAttributes() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.wrap(real.getAttributes());
    }

    public int getCopies() {
        return real.getCopies();
    }

    public long getCreationTime() {
        return real.getCreationTime();
    }

    public com.micklab.dcg.wrapper.android.print.PrintJobId getId() {
        return com.micklab.dcg.wrapper.android.print.PrintJobId.wrap(real.getId());
    }

    public java.lang.String getLabel() {
        return real.getLabel();
    }

    public android.print.PageRange[] getPages() {
        return real.getPages();
    }

    public com.micklab.dcg.wrapper.android.print.PrinterId getPrinterId() {
        return com.micklab.dcg.wrapper.android.print.PrinterId.wrap(real.getPrinterId());
    }

    public int getState() {
        return real.getState();
    }

    public boolean hasAdvancedOption(java.lang.String arg0) {
        return real.hasAdvancedOption(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATE_BLOCKED = android.print.PrintJobInfo.STATE_BLOCKED;
    public static final int STATE_CANCELED = android.print.PrintJobInfo.STATE_CANCELED;
    public static final int STATE_COMPLETED = android.print.PrintJobInfo.STATE_COMPLETED;
    public static final int STATE_CREATED = android.print.PrintJobInfo.STATE_CREATED;
    public static final int STATE_FAILED = android.print.PrintJobInfo.STATE_FAILED;
    public static final int STATE_QUEUED = android.print.PrintJobInfo.STATE_QUEUED;
    public static final int STATE_STARTED = android.print.PrintJobInfo.STATE_STARTED;

    public static final class Builder {
        private final android.print.PrintJobInfo.Builder real;

        public Builder(android.print.PrintJobInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintJobInfo.Builder wrap(android.print.PrintJobInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintJobInfo.Builder(real);
        }

        public android.print.PrintJobInfo.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrintJobInfo arg0) {
            this(new android.print.PrintJobInfo.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.print.PrintJobInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrintJobInfo.wrap(real.build());
        }

        public void putAdvancedOption(java.lang.String arg0, int arg1) {
            real.putAdvancedOption(arg0, arg1);
        }

        public void putAdvancedOption(java.lang.String arg0, java.lang.String arg1) {
            real.putAdvancedOption(arg0, arg1);
        }

        public void setAttributes(com.micklab.dcg.wrapper.android.print.PrintAttributes arg0) {
            real.setAttributes(arg0 == null ? null : arg0.unwrap());
        }

        public void setCopies(int arg0) {
            real.setCopies(arg0);
        }

        public void setPages(android.print.PageRange[] arg0) {
            real.setPages(arg0);
        }

    }
}
