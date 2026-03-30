// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewDebug {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewDebug(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewDebug wrap(android.view.ViewDebug real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewDebug getReal() {
        return (android.view.ViewDebug) real;
    }

    public android.view.ViewDebug unwrap() {
        return getReal();
    }

    public ViewDebug() {
        this(new android.view.ViewDebug(), (__DcgwBridgeToken) null);
    }

    public static void dumpCapturedView(java.lang.String arg0, java.lang.Object arg1) {
        android.view.ViewDebug.dumpCapturedView(arg0, arg1);
    }

    public static void startHierarchyTracing(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        android.view.ViewDebug.startHierarchyTracing(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static void startRecyclerTracing(java.lang.String arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        android.view.ViewDebug.startRecyclerTracing(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static void stopHierarchyTracing() {
        android.view.ViewDebug.stopHierarchyTracing();
    }

    public static void stopRecyclerTracing() {
        android.view.ViewDebug.stopRecyclerTracing();
    }

    public static void trace(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType arg1) {
        android.view.ViewDebug.trace(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static void trace(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType arg1, int... arg2) {
        android.view.ViewDebug.trace(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final boolean TRACE_HIERARCHY = android.view.ViewDebug.TRACE_HIERARCHY;
    public static final boolean TRACE_RECYCLER = android.view.ViewDebug.TRACE_RECYCLER;

    public static final class CapturedViewProperty {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CapturedViewProperty(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.CapturedViewProperty wrap(android.view.ViewDebug.CapturedViewProperty real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.CapturedViewProperty(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewDebug.CapturedViewProperty getReal() {
            return (android.view.ViewDebug.CapturedViewProperty) real;
        }

        public android.view.ViewDebug.CapturedViewProperty unwrap() {
            return getReal();
        }

        public boolean retrieveReturn() {
            return ((android.view.ViewDebug.CapturedViewProperty) real).retrieveReturn();
        }

    }
    public static final class ExportedProperty {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ExportedProperty(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.ExportedProperty wrap(android.view.ViewDebug.ExportedProperty real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.ExportedProperty(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewDebug.ExportedProperty getReal() {
            return (android.view.ViewDebug.ExportedProperty) real;
        }

        public android.view.ViewDebug.ExportedProperty unwrap() {
            return getReal();
        }

        public java.lang.String category() {
            return ((android.view.ViewDebug.ExportedProperty) real).category();
        }

        public boolean deepExport() {
            return ((android.view.ViewDebug.ExportedProperty) real).deepExport();
        }

        public android.view.ViewDebug.FlagToString[] flagMapping() {
            return ((android.view.ViewDebug.ExportedProperty) real).flagMapping();
        }

        public boolean formatToHexString() {
            return ((android.view.ViewDebug.ExportedProperty) real).formatToHexString();
        }

        public boolean hasAdjacentMapping() {
            return ((android.view.ViewDebug.ExportedProperty) real).hasAdjacentMapping();
        }

        public android.view.ViewDebug.IntToString[] indexMapping() {
            return ((android.view.ViewDebug.ExportedProperty) real).indexMapping();
        }

        public android.view.ViewDebug.IntToString[] mapping() {
            return ((android.view.ViewDebug.ExportedProperty) real).mapping();
        }

        public java.lang.String prefix() {
            return ((android.view.ViewDebug.ExportedProperty) real).prefix();
        }

        public boolean resolveId() {
            return ((android.view.ViewDebug.ExportedProperty) real).resolveId();
        }

    }
    public static final class FlagToString {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FlagToString(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.FlagToString wrap(android.view.ViewDebug.FlagToString real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.FlagToString(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewDebug.FlagToString getReal() {
            return (android.view.ViewDebug.FlagToString) real;
        }

        public android.view.ViewDebug.FlagToString unwrap() {
            return getReal();
        }

        public int equals() {
            return ((android.view.ViewDebug.FlagToString) real).equals();
        }

        public int mask() {
            return ((android.view.ViewDebug.FlagToString) real).mask();
        }

        public java.lang.String name() {
            return ((android.view.ViewDebug.FlagToString) real).name();
        }

        public boolean outputIf() {
            return ((android.view.ViewDebug.FlagToString) real).outputIf();
        }

    }
    public static final class HierarchyTraceType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HierarchyTraceType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType wrap(android.view.ViewDebug.HierarchyTraceType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.HierarchyTraceType(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewDebug.HierarchyTraceType getReal() {
            return (android.view.ViewDebug.HierarchyTraceType) real;
        }

        public android.view.ViewDebug.HierarchyTraceType unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private IntToString(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.IntToString wrap(android.view.ViewDebug.IntToString real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.IntToString(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewDebug.IntToString getReal() {
            return (android.view.ViewDebug.IntToString) real;
        }

        public android.view.ViewDebug.IntToString unwrap() {
            return getReal();
        }

        public int from() {
            return ((android.view.ViewDebug.IntToString) real).from();
        }

        public java.lang.String to() {
            return ((android.view.ViewDebug.IntToString) real).to();
        }

    }
    public static final class RecyclerTraceType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RecyclerTraceType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType wrap(android.view.ViewDebug.RecyclerTraceType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewDebug.RecyclerTraceType(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewDebug.RecyclerTraceType getReal() {
            return (android.view.ViewDebug.RecyclerTraceType) real;
        }

        public android.view.ViewDebug.RecyclerTraceType unwrap() {
            return getReal();
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
