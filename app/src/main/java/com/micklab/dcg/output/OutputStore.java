package com.micklab.dcg.output;

import com.micklab.dcg.model.ExecutionResult;

import java.util.concurrent.CopyOnWriteArrayList;

public final class OutputStore {
    public interface Listener {
        void onOutputChanged(ExecutionResult result);
    }

    private static final CopyOnWriteArrayList<Listener> LISTENERS = new CopyOnWriteArrayList<>();

    private static volatile ExecutionResult latestResult = ExecutionResult.idle(
            "Output ready",
            "Run a snippet to render stdout, images, and interactive UI here.");

    private OutputStore() {
    }

    public static ExecutionResult getLatestResult() {
        return latestResult;
    }

    public static void publish(ExecutionResult result) {
        if (result == null) {
            return;
        }
        latestResult = result;
        for (Listener listener : LISTENERS) {
            listener.onOutputChanged(result);
        }
    }

    public static void addListener(Listener listener) {
        if (listener == null) {
            return;
        }
        LISTENERS.addIfAbsent(listener);
    }

    public static void removeListener(Listener listener) {
        if (listener == null) {
            return;
        }
        LISTENERS.remove(listener);
    }
}
