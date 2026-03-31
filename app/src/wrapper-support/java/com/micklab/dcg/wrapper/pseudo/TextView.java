package com.micklab.dcg.wrapper.pseudo;

import java.util.LinkedHashMap;
import java.util.Map;

public class TextView extends View {
    private CharSequence text = "";
    private String style = "";

    public TextView(Object owner) {
        super(owner);
    }

    public void setText(CharSequence text) {
        this.text = text == null ? "" : text;
    }

    public CharSequence getText() {
        return text;
    }

    public void setStyle(String style) {
        this.style = style == null ? "" : style;
    }

    @Override
    Map<String, Object> __dcgToSpec() {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "text");
        node.put("text", text == null ? "" : text.toString());
        if (!style.isEmpty()) {
            node.put("style", style);
        }
        return node;
    }
}
