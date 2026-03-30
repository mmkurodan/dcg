// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class LayoutInflater {
    private final android.view.LayoutInflater real;

    public LayoutInflater(android.view.LayoutInflater real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.LayoutInflater wrap(android.view.LayoutInflater real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater(real);
    }

    public android.view.LayoutInflater unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater cloneInContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.cloneInContext(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View createView(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) throws java.lang.ClassNotFoundException, android.view.InflateException {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.createView(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View createView(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) throws java.lang.ClassNotFoundException, android.view.InflateException {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.createView(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.LayoutInflater from(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(android.view.LayoutInflater.from(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory getFactory() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory.wrap(real.getFactory());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2 getFactory2() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2.wrap(real.getFactory2());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter getFilter() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter.wrap(real.getFilter());
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(int arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.inflate(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(org.xmlpull.v1.XmlPullParser arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.inflate(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(int arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.inflate(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.view.View inflate(org.xmlpull.v1.XmlPullParser arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.inflate(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) throws java.lang.ClassNotFoundException {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public void setFactory(com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory arg0) {
        real.setFactory(arg0 == null ? null : arg0.unwrap());
    }

    public void setFactory2(com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2 arg0) {
        real.setFactory2(arg0 == null ? null : arg0.unwrap());
    }

    public void setFilter(com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter arg0) {
        real.setFilter(arg0 == null ? null : arg0.unwrap());
    }

    public static final class Factory {
        private final android.view.LayoutInflater.Factory real;

        public Factory(android.view.LayoutInflater.Factory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory wrap(android.view.LayoutInflater.Factory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory(real);
        }

        public android.view.LayoutInflater.Factory unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateView(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

    }
    public static final class Factory2 {
        private final android.view.LayoutInflater.Factory2 real;

        public Factory2(android.view.LayoutInflater.Factory2 real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2 wrap(android.view.LayoutInflater.Factory2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater.Factory2(real);
        }

        public android.view.LayoutInflater.Factory2 unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
        }

    }
    public static final class Filter {
        private final android.view.LayoutInflater.Filter real;

        public Filter(android.view.LayoutInflater.Filter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter wrap(android.view.LayoutInflater.Filter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.LayoutInflater.Filter(real);
        }

        public android.view.LayoutInflater.Filter unwrap() {
            return real;
        }

    }
}
