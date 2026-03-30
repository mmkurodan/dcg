// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class PropertyPath {
    private final android.app.appsearch.PropertyPath real;

    public PropertyPath(android.app.appsearch.PropertyPath real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath wrap(android.app.appsearch.PropertyPath real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath(real);
    }

    public android.app.appsearch.PropertyPath unwrap() {
        return real;
    }

    public PropertyPath(java.util.List arg0) {
        this(new android.app.appsearch.PropertyPath(arg0));
    }

    public PropertyPath(java.lang.String arg0) {
        this(new android.app.appsearch.PropertyPath(arg0));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment get(int arg0) {
        return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment.wrap(real.get(arg0));
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int size() {
        return real.size();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class PathSegment {
        private final android.app.appsearch.PropertyPath.PathSegment real;

        public PathSegment(android.app.appsearch.PropertyPath.PathSegment real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment wrap(android.app.appsearch.PropertyPath.PathSegment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment(real);
        }

        public android.app.appsearch.PropertyPath.PathSegment unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment create(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment.wrap(android.app.appsearch.PropertyPath.PathSegment.create(arg0));
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment create(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.PathSegment.wrap(android.app.appsearch.PropertyPath.PathSegment.create(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getPropertyIndex() {
            return real.getPropertyIndex();
        }

        public java.lang.String getPropertyName() {
            return real.getPropertyName();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public static final int NON_REPEATED_CARDINALITY = android.app.appsearch.PropertyPath.PathSegment.NON_REPEATED_CARDINALITY;

    }
}
