// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class PropertyPath {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PropertyPath(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath wrap(android.app.appsearch.PropertyPath real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.PropertyPath getReal() {
        return (android.app.appsearch.PropertyPath) real;
    }

    public android.app.appsearch.PropertyPath unwrap() {
        return getReal();
    }

    public PropertyPath(java.lang.String arg0) {
        this(new android.app.appsearch.PropertyPath(arg0), (__DcgwBridgeToken) null);
    }

    public PropertyPath(java.util.List arg0) {
        this(new android.app.appsearch.PropertyPath(arg0), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.PropertyPath) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment get(int arg0) {
        return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment.wrap(((android.app.appsearch.PropertyPath) real).get(arg0));
    }

    public int hashCode() {
        return ((android.app.appsearch.PropertyPath) real).hashCode();
    }

    public int size() {
        return ((android.app.appsearch.PropertyPath) real).size();
    }

    public java.lang.String toString() {
        return ((android.app.appsearch.PropertyPath) real).toString();
    }

    public static final class PathSegment {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PathSegment(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment wrap(android.app.appsearch.PropertyPath.PathSegment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.PropertyPath.PathSegment getReal() {
            return (android.app.appsearch.PropertyPath.PathSegment) real;
        }

        public android.app.appsearch.PropertyPath.PathSegment unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment create(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment.wrap(android.app.appsearch.PropertyPath.PathSegment.create(arg0));
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment create(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment.wrap(android.app.appsearch.PropertyPath.PathSegment.create(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.app.appsearch.PropertyPath.PathSegment) real).equals(arg0);
        }

        public int getPropertyIndex() {
            return ((android.app.appsearch.PropertyPath.PathSegment) real).getPropertyIndex();
        }

        public java.lang.String getPropertyName() {
            return ((android.app.appsearch.PropertyPath.PathSegment) real).getPropertyName();
        }

        public int hashCode() {
            return ((android.app.appsearch.PropertyPath.PathSegment) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.app.appsearch.PropertyPath.PathSegment) real).toString();
        }

        public static final int NON_REPEATED_CARDINALITY = android.app.appsearch.PropertyPath.PathSegment.NON_REPEATED_CARDINALITY;

    }
}
