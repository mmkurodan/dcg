// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class LayoutInflater {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LayoutInflater(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.LayoutInflater wrap(android.view.LayoutInflater real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater(real, (__DcgwBridgeToken) null);
    }

    public android.view.LayoutInflater getReal() {
        return (android.view.LayoutInflater) real;
    }

    public android.view.LayoutInflater unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater cloneInContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.view.LayoutInflater) real).cloneInContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View createView(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) throws java.lang.ClassNotFoundException, android.view.InflateException {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater) real).createView(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View createView(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) throws java.lang.ClassNotFoundException, android.view.InflateException {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater) real).createView(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.view.LayoutInflater from(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(android.view.LayoutInflater.from(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.view.LayoutInflater) real).getContext());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory getFactory() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory.wrap(((android.view.LayoutInflater) real).getFactory());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2 getFactory2() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2.wrap(((android.view.LayoutInflater) real).getFactory2());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter.wrap(((android.view.LayoutInflater) real).getFilter());
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(int arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater) real).inflate(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(org.xmlpull.v1.XmlPullParser arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater) real).inflate(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(int arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater) real).inflate(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(org.xmlpull.v1.XmlPullParser arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater) real).inflate(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) throws java.lang.ClassNotFoundException {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

    public void setFactory(com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory arg0) {
        ((android.view.LayoutInflater) real).setFactory(arg0 == null ? null : arg0.getReal());
    }

    public void setFactory2(com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2 arg0) {
        ((android.view.LayoutInflater) real).setFactory2(arg0 == null ? null : arg0.getReal());
    }

    public void setFilter(com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter arg0) {
        ((android.view.LayoutInflater) real).setFilter(arg0 == null ? null : arg0.getReal());
    }

    public static final class Factory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Factory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory wrap(android.view.LayoutInflater.Factory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory(real, (__DcgwBridgeToken) null);
        }

        public android.view.LayoutInflater.Factory getReal() {
            return (android.view.LayoutInflater.Factory) real;
        }

        public android.view.LayoutInflater.Factory unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateView(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater.Factory) real).onCreateView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

    }
    public static final class Factory2 {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Factory2(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2 wrap(android.view.LayoutInflater.Factory2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2(real, (__DcgwBridgeToken) null);
        }

        public android.view.LayoutInflater.Factory2 getReal() {
            return (android.view.LayoutInflater.Factory2) real;
        }

        public android.view.LayoutInflater.Factory2 unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.LayoutInflater.Factory2) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
        }

    }
    public static final class Filter {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Filter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter wrap(android.view.LayoutInflater.Filter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter(real, (__DcgwBridgeToken) null);
        }

        public android.view.LayoutInflater.Filter getReal() {
            return (android.view.LayoutInflater.Filter) real;
        }

        public android.view.LayoutInflater.Filter unwrap() {
            return getReal();
        }

    }
}
