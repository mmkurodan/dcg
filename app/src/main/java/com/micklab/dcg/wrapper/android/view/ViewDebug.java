// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewDebug {
    private final android.view.ViewDebug real;

    public ViewDebug(android.view.ViewDebug real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewDebug wrap(android.view.ViewDebug real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug(real);
    }

    public android.view.ViewDebug unwrap() {
        return real;
    }

    public ViewDebug() {
        this(new android.view.ViewDebug());
    }

    public static void dumpCapturedView(java.lang.String arg0, java.lang.Object arg1) {
        android.view.ViewDebug.dumpCapturedView(arg0, arg1);
    }

    public static void startHierarchyTracing(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        android.view.ViewDebug.startHierarchyTracing(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static void startRecyclerTracing(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        android.view.ViewDebug.startRecyclerTracing(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static void stopHierarchyTracing() {
        android.view.ViewDebug.stopHierarchyTracing();
    }

    public static void stopRecyclerTracing() {
        android.view.ViewDebug.stopRecyclerTracing();
    }

    public static void trace(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType arg1) {
        android.view.ViewDebug.trace(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static void trace(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType arg1, int... arg2) {
        android.view.ViewDebug.trace(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final boolean TRACE_HIERARCHY = android.view.ViewDebug.TRACE_HIERARCHY;
    public static final boolean TRACE_RECYCLER = android.view.ViewDebug.TRACE_RECYCLER;

    public static final class CapturedViewProperty {
        private final android.view.ViewDebug.CapturedViewProperty real;

        public CapturedViewProperty(android.view.ViewDebug.CapturedViewProperty real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.CapturedViewProperty wrap(android.view.ViewDebug.CapturedViewProperty real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.CapturedViewProperty(real);
        }

        public android.view.ViewDebug.CapturedViewProperty unwrap() {
            return real;
        }

        public boolean retrieveReturn() {
            return real.retrieveReturn();
        }

    }
    public static final class ExportedProperty {
        private final android.view.ViewDebug.ExportedProperty real;

        public ExportedProperty(android.view.ViewDebug.ExportedProperty real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.ExportedProperty wrap(android.view.ViewDebug.ExportedProperty real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.ExportedProperty(real);
        }

        public android.view.ViewDebug.ExportedProperty unwrap() {
            return real;
        }

        public java.lang.String category() {
            return real.category();
        }

        public boolean deepExport() {
            return real.deepExport();
        }

        public android.view.ViewDebug.FlagToString[] flagMapping() {
            return real.flagMapping();
        }

        public boolean formatToHexString() {
            return real.formatToHexString();
        }

        public boolean hasAdjacentMapping() {
            return real.hasAdjacentMapping();
        }

        public android.view.ViewDebug.IntToString[] indexMapping() {
            return real.indexMapping();
        }

        public android.view.ViewDebug.IntToString[] mapping() {
            return real.mapping();
        }

        public java.lang.String prefix() {
            return real.prefix();
        }

        public boolean resolveId() {
            return real.resolveId();
        }

    }
    public static final class FlagToString {
        private final android.view.ViewDebug.FlagToString real;

        public FlagToString(android.view.ViewDebug.FlagToString real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.FlagToString wrap(android.view.ViewDebug.FlagToString real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.FlagToString(real);
        }

        public android.view.ViewDebug.FlagToString unwrap() {
            return real;
        }

        public int equals() {
            return real.equals();
        }

        public int mask() {
            return real.mask();
        }

        public java.lang.String name() {
            return real.name();
        }

        public boolean outputIf() {
            return real.outputIf();
        }

    }
    public static final class HierarchyTraceType {
        private final android.view.ViewDebug.HierarchyTraceType real;

        public HierarchyTraceType(android.view.ViewDebug.HierarchyTraceType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType wrap(android.view.ViewDebug.HierarchyTraceType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType(real);
        }

        public android.view.ViewDebug.HierarchyTraceType unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.valueOf(arg0));
        }

        public static android.view.ViewDebug.HierarchyTraceType[] values() {
            return android.view.ViewDebug.HierarchyTraceType.values();
        }

        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType BUILD_CACHE = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.BUILD_CACHE);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType DRAW = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.DRAW);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType INVALIDATE = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.INVALIDATE);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType INVALIDATE_CHILD = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.INVALIDATE_CHILD);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType INVALIDATE_CHILD_IN_PARENT = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.INVALIDATE_CHILD_IN_PARENT);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType ON_LAYOUT = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.ON_LAYOUT);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType ON_MEASURE = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.ON_MEASURE);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType REQUEST_LAYOUT = com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType.wrap(android.view.ViewDebug.HierarchyTraceType.REQUEST_LAYOUT);

    }
    public static final class IntToString {
        private final android.view.ViewDebug.IntToString real;

        public IntToString(android.view.ViewDebug.IntToString real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.IntToString wrap(android.view.ViewDebug.IntToString real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.IntToString(real);
        }

        public android.view.ViewDebug.IntToString unwrap() {
            return real;
        }

        public int from() {
            return real.from();
        }

        public java.lang.String to() {
            return real.to();
        }

    }
    public static final class RecyclerTraceType {
        private final android.view.ViewDebug.RecyclerTraceType real;

        public RecyclerTraceType(android.view.ViewDebug.RecyclerTraceType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType wrap(android.view.ViewDebug.RecyclerTraceType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType(real);
        }

        public android.view.ViewDebug.RecyclerTraceType unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType.wrap(android.view.ViewDebug.RecyclerTraceType.valueOf(arg0));
        }

        public static android.view.ViewDebug.RecyclerTraceType[] values() {
            return android.view.ViewDebug.RecyclerTraceType.values();
        }

        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType BIND_VIEW = com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType.wrap(android.view.ViewDebug.RecyclerTraceType.BIND_VIEW);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType MOVE_FROM_ACTIVE_TO_SCRAP_HEAP = com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType.wrap(android.view.ViewDebug.RecyclerTraceType.MOVE_FROM_ACTIVE_TO_SCRAP_HEAP);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType MOVE_TO_SCRAP_HEAP = com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType.wrap(android.view.ViewDebug.RecyclerTraceType.MOVE_TO_SCRAP_HEAP);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType NEW_VIEW = com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType.wrap(android.view.ViewDebug.RecyclerTraceType.NEW_VIEW);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType RECYCLE_FROM_ACTIVE_HEAP = com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType.wrap(android.view.ViewDebug.RecyclerTraceType.RECYCLE_FROM_ACTIVE_HEAP);
        public static final com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType RECYCLE_FROM_SCRAP_HEAP = com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType.wrap(android.view.ViewDebug.RecyclerTraceType.RECYCLE_FROM_SCRAP_HEAP);

    }
}
