package com.micklab.dcg.model;

public final class ExecutionOutputItem {
    public enum Type {
        TEXT,
        IMAGE,
        INTERACTIVE
    }

    private final Type type;
    private final String label;
    private final String text;
    private final String imageBase64;
    private final DynamicUiRequest interactiveRequest;

    private ExecutionOutputItem(
            Type type,
            String label,
            String text,
            String imageBase64,
            DynamicUiRequest interactiveRequest) {
        this.type = type == null ? Type.TEXT : type;
        this.label = label == null ? "" : label;
        this.text = text == null ? "" : text;
        this.imageBase64 = imageBase64 == null ? "" : imageBase64;
        this.interactiveRequest = interactiveRequest;
    }

    public static ExecutionOutputItem text(String label, String text) {
        return new ExecutionOutputItem(Type.TEXT, label, text, "", null);
    }

    public static ExecutionOutputItem image(String label, String imageBase64) {
        return new ExecutionOutputItem(Type.IMAGE, label, "", imageBase64, null);
    }

    public static ExecutionOutputItem interactive(String label, DynamicUiRequest interactiveRequest) {
        return new ExecutionOutputItem(Type.INTERACTIVE, label, "", "", interactiveRequest);
    }

    public Type getType() {
        return type;
    }

    public String getLabel() {
        return label;
    }

    public String getText() {
        return text;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public DynamicUiRequest getInteractiveRequest() {
        return interactiveRequest;
    }
}
