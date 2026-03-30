// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls;

public final class Control {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Control(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.Control wrap(android.service.controls.Control real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.Control(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.Control getReal() {
        return (android.service.controls.Control) real;
    }

    public android.service.controls.Control unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.controls.Control) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getAppIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.service.controls.Control) real).getAppIntent());
    }

    public java.lang.String getControlId() {
        return ((android.service.controls.Control) real).getControlId();
    }

    public com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate getControlTemplate() {
        return com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate.wrap(((android.service.controls.Control) real).getControlTemplate());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getCustomColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.service.controls.Control) real).getCustomColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getCustomIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.service.controls.Control) real).getCustomIcon());
    }

    public int getDeviceType() {
        return ((android.service.controls.Control) real).getDeviceType();
    }

    public int getStatus() {
        return ((android.service.controls.Control) real).getStatus();
    }

    public java.lang.CharSequence getStatusText() {
        return ((android.service.controls.Control) real).getStatusText();
    }

    public java.lang.CharSequence getStructure() {
        return ((android.service.controls.Control) real).getStructure();
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.service.controls.Control) real).getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.service.controls.Control) real).getTitle();
    }

    public java.lang.CharSequence getZone() {
        return ((android.service.controls.Control) real).getZone();
    }

    public boolean isAuthRequired() {
        return ((android.service.controls.Control) real).isAuthRequired();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.controls.Control) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STATUS_DISABLED = android.service.controls.Control.STATUS_DISABLED;
    public static final int STATUS_ERROR = android.service.controls.Control.STATUS_ERROR;
    public static final int STATUS_NOT_FOUND = android.service.controls.Control.STATUS_NOT_FOUND;
    public static final int STATUS_OK = android.service.controls.Control.STATUS_OK;
    public static final int STATUS_UNKNOWN = android.service.controls.Control.STATUS_UNKNOWN;

    public static final class StatefulBuilder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StatefulBuilder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder wrap(android.service.controls.Control.StatefulBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder(real, (__DcgwBridgeToken) null);
        }

        public android.service.controls.Control.StatefulBuilder getReal() {
            return (android.service.controls.Control.StatefulBuilder) real;
        }

        public android.service.controls.Control.StatefulBuilder unwrap() {
            return getReal();
        }

        public StatefulBuilder(com.micklab.dcg.wrapper.android.service.controls.Control arg0) {
            this(new android.service.controls.Control.StatefulBuilder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public StatefulBuilder(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            this(new android.service.controls.Control.StatefulBuilder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control build() {
            return com.micklab.dcg.wrapper.android.service.controls.Control.wrap(((android.service.controls.Control.StatefulBuilder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setAppIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setAppIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setAuthRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setAuthRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setControlId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setControlId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setControlTemplate(com.micklab.dcg.wrapper.android.service.controls.templates.ControlTemplate arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setControlTemplate(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setCustomColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setCustomColor(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setCustomIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setCustomIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setDeviceType(int arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setDeviceType(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setStatus(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setStatusText(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setStatusText(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setStructure(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setStructure(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder setZone(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatefulBuilder.wrap(((android.service.controls.Control.StatefulBuilder) real).setZone(arg0));
        }

    }
    public static final class StatelessBuilder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StatelessBuilder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder wrap(android.service.controls.Control.StatelessBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder(real, (__DcgwBridgeToken) null);
        }

        public android.service.controls.Control.StatelessBuilder getReal() {
            return (android.service.controls.Control.StatelessBuilder) real;
        }

        public android.service.controls.Control.StatelessBuilder unwrap() {
            return getReal();
        }

        public StatelessBuilder(com.micklab.dcg.wrapper.android.service.controls.Control arg0) {
            this(new android.service.controls.Control.StatelessBuilder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public StatelessBuilder(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
            this(new android.service.controls.Control.StatelessBuilder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control build() {
            return com.micklab.dcg.wrapper.android.service.controls.Control.wrap(((android.service.controls.Control.StatelessBuilder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setAppIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setAppIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setControlId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setControlId(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setCustomColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setCustomColor(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setCustomIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setCustomIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setDeviceType(int arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setDeviceType(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setStructure(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setStructure(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder setZone(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.service.controls.Control.StatelessBuilder.wrap(((android.service.controls.Control.StatelessBuilder) real).setZone(arg0));
        }

    }
}
