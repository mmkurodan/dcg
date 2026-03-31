package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.wrapper.android.graphics.Bitmap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class OutputModel {
    private static final int SCHEMA_VERSION = 1;

    private Object contentView;
    private final List<Object> inlineNodes = new ArrayList<>();
    private final List<View> constructedViews = new ArrayList<>();

    void setContentView(Object contentView) {
        this.contentView = contentView;
        if (contentView instanceof View) {
            ((View) contentView).__dcgMarkAttachedRecursively();
        }
    }

    void appendInlineNode(Object node) {
        if (node == null) {
            return;
        }
        inlineNodes.add(node);
    }

    void registerConstructedView(View view) {
        if (view == null || constructedViews.contains(view)) {
            return;
        }
        constructedViews.add(view);
    }

    void markAttached(View view) {
    }

    Object buildSpec() {
        List<Object> nodes = new ArrayList<>();
        Set<Object> emitted = Collections.newSetFromMap(new IdentityHashMap<>());
        appendNode(nodes, contentView, emitted, true);
        for (Object node : inlineNodes) {
            appendNode(nodes, node, emitted, false);
        }
        for (View view : constructedViews) {
            appendNode(nodes, view, emitted, false);
        }
        return nodes.isEmpty() ? null : nodes;
    }

    String toJson() {
        Object spec = buildSpec();
        JSONObject root = new JSONObject();
        try {
            root.put("version", SCHEMA_VERSION);
            root.put("spec", toJsonElement(spec == null ? new ArrayList<>() : spec));
        } catch (JSONException exception) {
            throw new IllegalStateException("Failed to serialize pseudo output model.", exception);
        }
        return root.toString();
    }

    private void appendNode(List<Object> destination, Object node, Set<Object> emitted, boolean allowAttachedView) {
        if (node == null || !emitted.add(node)) {
            return;
        }
        if (node instanceof View && !allowAttachedView && ((View) node).__dcgIsAttached()) {
            return;
        }
        Object normalized = toSpecValue(node);
        if (normalized == null) {
            return;
        }
        if (normalized instanceof Collection<?>) {
            destination.addAll((Collection<?>) normalized);
            return;
        }
        destination.add(normalized);
    }

    private Object toSpecValue(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof View) {
            return ((View) value).__dcgToSpec();
        }
        if (value instanceof Bitmap) {
            return toImageNode((Bitmap) value);
        }
        if (value instanceof CharSequence || value instanceof Number || value instanceof Boolean) {
            return toTextNode(String.valueOf(value));
        }
        if (value instanceof Map<?, ?>) {
            Map<String, Object> normalized = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
                normalized.put(String.valueOf(entry.getKey()), toSpecValue(entry.getValue()));
            }
            return normalized;
        }
        if (value instanceof Collection<?>) {
            List<Object> normalized = new ArrayList<>();
            for (Object child : (Collection<?>) value) {
                normalized.add(toSpecValue(child));
            }
            return normalized;
        }
        if (value.getClass().isArray()) {
            int length = java.lang.reflect.Array.getLength(value);
            List<Object> normalized = new ArrayList<>(length);
            for (int index = 0; index < length; index++) {
                normalized.add(toSpecValue(java.lang.reflect.Array.get(value, index)));
            }
            return normalized;
        }
        return toTextNode(String.valueOf(value));
    }

    private JSONObject toJsonValue(Object value) throws JSONException {
        if (value instanceof Map<?, ?>) {
            JSONObject object = new JSONObject();
            for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
                object.put(String.valueOf(entry.getKey()), toJsonElement(entry.getValue()));
            }
            return object;
        }
        throw new JSONException("Expected a JSON object but received: " + value);
    }

    private Object toJsonElement(Object value) throws JSONException {
        if (value == null) {
            return JSONObject.NULL;
        }
        if (value instanceof Map<?, ?>) {
            return toJsonValue(value);
        }
        if (value instanceof Collection<?>) {
            JSONArray array = new JSONArray();
            for (Object child : (Collection<?>) value) {
                array.put(toJsonElement(child));
            }
            return array;
        }
        if (value.getClass().isArray()) {
            JSONArray array = new JSONArray();
            int length = java.lang.reflect.Array.getLength(value);
            for (int index = 0; index < length; index++) {
                array.put(toJsonElement(java.lang.reflect.Array.get(value, index)));
            }
            return array;
        }
        return value;
    }

    static Map<String, Object> toTextNode(String text) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "text");
        node.put("text", text == null ? "" : text);
        return node;
    }

    static Map<String, Object> toImageNode(Bitmap bitmap) {
        LinkedHashMap<String, Object> node = new LinkedHashMap<>();
        node.put("type", "image");
        node.put("imageBase64", encodeBitmap(bitmap));
        return node;
    }

    static String encodeBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.getReal() == null) {
            return "";
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        boolean compressed = bitmap.getReal().compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
        if (!compressed) {
            throw new IllegalStateException("Bitmap compression failed.");
        }
        return Base64.getEncoder().encodeToString(outputStream.toByteArray());
    }
}
