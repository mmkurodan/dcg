package com.micklab.dcg.wrapper.pseudo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LinearLayout extends View {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    private final List<View> children = new ArrayList<>();
    private int orientation = VERTICAL;

    public LinearLayout(Object owner) {
        super(owner);
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation == HORIZONTAL ? HORIZONTAL : VERTICAL;
    }

    public int getOrientation() {
        return orientation;
    }

    public void addView(View child) {
        if (child == null) {
            return;
        }
        children.add(child);
        child.__dcgMarkAttachedRecursively();
    }

    @Override
    protected List<View> __dcgChildren() {
        return new ArrayList<>(children);
    }

    @Override
    Map<String, Object> __dcgToSpec() {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", orientation == HORIZONTAL ? "row" : "column");
        List<Object> childSpecs = new ArrayList<>(children.size());
        for (View child : children) {
            if (child != null) {
                childSpecs.add(child.__dcgToSpec());
            }
        }
        node.put("children", childSpecs);
        return node;
    }
}
