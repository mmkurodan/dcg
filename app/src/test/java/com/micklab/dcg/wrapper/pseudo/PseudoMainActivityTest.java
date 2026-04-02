package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.output.OutputModelJsonParser;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class PseudoMainActivityTest {
    @Test
    public void buildOutputSpecPlacesDslChildrenInsideRow() {
        Object spec = new RowDslActivity().renderSpec();

        assertTrue(spec instanceof List<?>);
        List<?> nodes = (List<?>) spec;
        assertEquals(2, nodes.size());

        Map<?, ?> row = (Map<?, ?>) nodes.get(0);
        assertEquals("row", row.get("type"));

        List<?> children = (List<?>) row.get("children");
        assertEquals(3, children.size());
        assertEquals("button", ((Map<?, ?>) children.get(0)).get("type"));
        assertEquals("text", ((Map<?, ?>) children.get(1)).get("type"));
        assertEquals("input", ((Map<?, ?>) children.get(2)).get("type"));

        Map<?, ?> trailingButton = (Map<?, ?>) nodes.get(1);
        assertEquals("button", trailingButton.get("type"));
        assertEquals("clear", trailingButton.get("action"));
    }

    @Test(expected = IllegalStateException.class)
    public void buildOutputSpecRejectsUnclosedRow() {
        new UnclosedRowActivity().renderSpec();
    }

    @Test
    public void buildOutputSpecSupportsTitlesLabelsSpacersAndReadOnlyInputs() {
        Object spec = new ExtendedDslActivity().renderSpec();

        assertTrue(spec instanceof List<?>);
        List<?> nodes = (List<?>) spec;
        assertEquals(3, nodes.size());

        Map<?, ?> title = (Map<?, ?>) nodes.get(0);
        assertEquals("title", title.get("type"));
        assertEquals("Calculator", title.get("text"));

        Map<?, ?> display = (Map<?, ?>) nodes.get(1);
        assertEquals("label", display.get("type"));
        assertEquals("display", display.get("key"));
        assertEquals("0", display.get("text"));

        Map<?, ?> row = (Map<?, ?>) nodes.get(2);
        assertEquals("row", row.get("type"));
        List<?> children = (List<?>) row.get("children");
        assertEquals(4, children.size());

        assertEquals("button", ((Map<?, ?>) children.get(0)).get("type"));
        assertEquals("label", ((Map<?, ?>) children.get(1)).get("type"));
        assertEquals("spacer", ((Map<?, ?>) children.get(2)).get("type"));

        Map<?, ?> input = (Map<?, ?>) children.get(3);
        assertEquals("input", input.get("type"));
        assertEquals(Boolean.FALSE, input.get("editable"));
        assertEquals("value", input.get("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setInputEditableRejectsUnknownKeys() {
        new MissingInputActivity().renderSpec();
    }

    @Test
    public void outputModelJsonIncludesImageNodesAndClickHandlers() {
        String json = new ImageDslActivity().renderJson();

        OutputModelJsonParser.OutputDocument document =
                OutputModelJsonParser.parseDocument(json);

        assertTrue(document.getSpec() instanceof List<?>);
        List<?> nodes = (List<?>) document.getSpec();
        assertEquals(2, nodes.size());

        Map<?, ?> row = (Map<?, ?>) nodes.get(0);
        assertEquals("row", row.get("type"));
        List<?> children = (List<?>) row.get("children");
        assertEquals(1, children.size());

        Map<?, ?> image = (Map<?, ?>) children.get(0);
        assertEquals("image", image.get("type"));
        assertEquals("board", image.get("key"));
        assertEquals("board.png", image.get("filename"));
        assertFalse(image.containsKey("imageBase64"));

        List<Map<String, Object>> commands = document.getCommands();
        assertEquals(1, commands.size());
        assertEquals("imageClick", commands.get(0).get("type"));
        assertEquals("board", commands.get(0).get("key"));
        assertEquals("onBoardClick", commands.get(0).get("handlerName"));
    }

    @Test
    public void outputModelJsonAllowsStaticDslHelpersDuringRenderLifecycle() {
        String json = new StaticImageDslActivity().renderJson();

        OutputModelJsonParser.OutputDocument document =
                OutputModelJsonParser.parseDocument(json);

        List<Map<String, Object>> commands = document.getCommands();
        assertEquals(1, commands.size());
        assertEquals("imageClick", commands.get(0).get("type"));
        assertEquals("board", commands.get(0).get("key"));

        assertTrue(document.getSpec() instanceof List<?>);
        List<?> nodes = (List<?>) document.getSpec();
        assertEquals(2, nodes.size());
        Map<?, ?> image = (Map<?, ?>) nodes.get(0);
        assertEquals("image", image.get("type"));
        assertEquals("board", image.get("key"));
        assertEquals("board.png", image.get("filename"));
        Map<?, ?> label = (Map<?, ?>) nodes.get(1);
        assertEquals("label", label.get("type"));
        assertEquals("status", label.get("key"));
        assertEquals("ready", label.get("text"));
    }

    @Test
    public void staticDslHelpersRejectCallsOutsideRenderLifecycle() {
        try {
            StaticImageDslActivity.recordImage();
            fail("Expected static pseudo helper calls outside render lifecycle to fail.");
        } catch (IllegalStateException exception) {
            assertEquals(
                    "PseudoMainActivity helpers can only be used while rendering onCreate().",
                    exception.getMessage());
        }
    }

    private static final class RowDslActivity extends PseudoMainActivity {
        private Object renderSpec() {
            __dcgRunOnCreateLifecycle();
            return __dcgBuildOutputSpec();
        }
        @Override
        protected void onCreate() {
            beginRow();
            addButton("7", "press7");
            addLabel("8");
            addInput("value", "Value");
            endRow();

            addButton("C", "clear");
        }
    }

    private static final class UnclosedRowActivity extends PseudoMainActivity {
        private Object renderSpec() {
            __dcgRunOnCreateLifecycle();
            return __dcgBuildOutputSpec();
        }

        @Override
        protected void onCreate() {
            beginRow();
            addButton("7", "press7");
        }
    }

    private static final class ExtendedDslActivity extends PseudoMainActivity {
        private Object renderSpec() {
            __dcgRunOnCreateLifecycle();
            return __dcgBuildOutputSpec();
        }

        @Override
        protected void onCreate() {
            addTitle("Calculator");
            addLabel("display", "0");
            beginRow();
            addButton("7", "press7");
            addLabel("status", "ready");
            addSpacer();
            addInput("value", "Value");
            setInputEditable("value", false);
            endRow();
        }
    }

    private static final class MissingInputActivity extends PseudoMainActivity {
        private Object renderSpec() {
            __dcgRunOnCreateLifecycle();
            return __dcgBuildOutputSpec();
        }

        @Override
        protected void onCreate() {
            setInputEditable("missing", false);
        }
    }

    private static final class ImageDslActivity extends PseudoMainActivity {
        private String renderJson() {
            __dcgRunOnCreateLifecycle();
            return __dcgGetOutputModelJson();
        }

        @Override
        protected void onCreate() {
            beginRow();
            addImage("board", "board.png");
            endRow();
            onImageClick("board", "onBoardClick");
            addLabel("done");
        }
    }

    private static final class StaticImageDslActivity extends PseudoMainActivity {
        private String renderJson() {
            __dcgRunOnCreateLifecycle();
            return __dcgGetOutputModelJson();
        }

        @Override
        protected void onCreate() {
            recordImage();
        }

        private static void recordImage() {
            addImage("board", "board.png");
            onImageClick("board", "onBoardClick");
            addLabel("status", "ready");
        }
    }
}
