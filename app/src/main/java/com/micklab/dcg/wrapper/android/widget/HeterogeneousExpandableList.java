// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class HeterogeneousExpandableList {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HeterogeneousExpandableList(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.HeterogeneousExpandableList wrap(android.widget.HeterogeneousExpandableList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.HeterogeneousExpandableList(real, (__DcgwBridgeToken) null);
    }

    public android.widget.HeterogeneousExpandableList getReal() {
        return (android.widget.HeterogeneousExpandableList) real;
    }

    public android.widget.HeterogeneousExpandableList unwrap() {
        return getReal();
    }

    public int getChildType(int arg0, int arg1) {
        return ((android.widget.HeterogeneousExpandableList) real).getChildType(arg0, arg1);
    }

    public int getChildTypeCount() {
        return ((android.widget.HeterogeneousExpandableList) real).getChildTypeCount();
    }

    public int getGroupType(int arg0) {
        return ((android.widget.HeterogeneousExpandableList) real).getGroupType(arg0);
    }

    public int getGroupTypeCount() {
        return ((android.widget.HeterogeneousExpandableList) real).getGroupTypeCount();
    }

}
