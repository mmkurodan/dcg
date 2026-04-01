package com.micklab.dcg.wrapper.pseudo;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
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
}
