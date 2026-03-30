// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class HeterogeneousExpandableList {
    private final android.widget.HeterogeneousExpandableList real;

    public HeterogeneousExpandableList(android.widget.HeterogeneousExpandableList real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.HeterogeneousExpandableList wrap(android.widget.HeterogeneousExpandableList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.HeterogeneousExpandableList(real);
    }

    public android.widget.HeterogeneousExpandableList unwrap() {
        return real;
    }

    public int getChildType(int arg0, int arg1) {
        return real.getChildType(arg0, arg1);
    }

    public int getChildTypeCount() {
        return real.getChildTypeCount();
    }

    public int getGroupType(int arg0) {
        return real.getGroupType(arg0);
    }

    public int getGroupTypeCount() {
        return real.getGroupTypeCount();
    }

}
