package com.micklab.dcg.wrapper.pseudo;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class View {
    private final PseudoMainActivity owner;
    private boolean attached;

    protected View(Object ownerCandidate) {
        this.owner = ownerCandidate instanceof PseudoMainActivity
                ? (PseudoMainActivity) ownerCandidate
                : null;
        if (owner != null) {
            owner.__dcgRegisterConstructedView(this);
        }
    }

    final void __dcgMarkAttachedRecursively() {
        attached = true;
        if (owner != null) {
            owner.__dcgMarkAttached(this);
        }
        for (View child : __dcgChildren()) {
            if (child != null) {
                child.__dcgMarkAttachedRecursively();
            }
        }
    }

    final boolean __dcgIsAttached() {
        return attached;
    }

    protected List<View> __dcgChildren() {
        return Collections.emptyList();
    }

    abstract Map<String, Object> __dcgToSpec();
}
