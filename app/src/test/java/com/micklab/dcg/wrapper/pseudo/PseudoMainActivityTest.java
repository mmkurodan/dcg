package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.output.OutputModelJsonParser;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        assertEquals("chart", image.get("key"));
        assertEquals("charts/chart.png", image.get("filename"));
        assertFalse(image.containsKey("imageBase64"));

        List<Map<String, Object>> commands = document.getCommands();
        assertEquals(1, commands.size());
        assertEquals("imageClick", commands.get(0).get("type"));
        assertEquals("chart", commands.get(0).get("key"));
        assertEquals("handleChartTap", commands.get(0).get("handlerName"));
    }

    private static final class RowDslActivity extends PseudoMainActivity {
        private Object renderSpec() {
            onCreate();
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
            onCreate();
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
            onCreate();
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
            onCreate();
            return __dcgBuildOutputSpec();
        }

        @Override
        protected void onCreate() {
            setInputEditable("missing", false);
        }
    }

    private static final class ImageDslActivity extends PseudoMainActivity {
        private String renderJson() {
            onCreate();
            return __dcgGetOutputModelJson();
        }

        @Override
        protected void onCreate() {
            beginRow();
            addImage("chart", "charts/chart.png");
            endRow();
            onImageClick("chart", "handleChartTap");
            addLabel("done");
        }
    }
}
