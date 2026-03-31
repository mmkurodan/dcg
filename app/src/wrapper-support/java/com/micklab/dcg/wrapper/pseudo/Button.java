package com.micklab.dcg.wrapper.pseudo;

import java.util.LinkedHashMap;
import java.util.Map;

public class Button extends TextView {
    private String action = "";

    public Button(Object owner) {
        super(owner);
    }

    public void setAction(String action) {
        this.action = action == null ? "" : action;
    }

    public void setOnClickAction(String action) {
        setAction(action);
    }

    public String getAction() {
        return action;
    }

    @Override
    Map<String, Object> __dcgToSpec() {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "button");
        node.put("text", getText() == null ? "" : getText().toString());
        if (!action.isEmpty()) {
            node.put("action", action);
        }
        return node;
    }
}
