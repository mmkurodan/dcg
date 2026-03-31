package com.micklab.dcg.wrapper.pseudo;

import java.util.LinkedHashMap;
import java.util.Map;

public class EditText extends TextView {
    private String id = "";
    private String hint = "";
    private boolean numeric;

    public EditText(Object owner) {
        super(owner);
    }

    public void setId(String id) {
        this.id = id == null ? "" : id;
    }

    public void setHint(String hint) {
        this.hint = hint == null ? "" : hint;
    }

    public void setNumeric(boolean numeric) {
        this.numeric = numeric;
    }

    public void setInputType(int inputType) {
        this.numeric = inputType != 0;
    }

    @Override
    Map<String, Object> __dcgToSpec() {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "input");
        if (!id.isEmpty()) {
            node.put("id", id);
        }
        if (!hint.isEmpty()) {
            node.put("hint", hint);
        }
        node.put("value", getText() == null ? "" : getText().toString());
        if (numeric) {
            node.put("numeric", true);
        }
        return node;
    }
}
