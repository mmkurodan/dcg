package com.micklab.dcg.executor.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaSourceParserTest {
    @Test
    public void parseBuildsQualifiedClassName() {
        String source = "package demo.app;\npublic class SampleRunner { }\n";
        JavaSourceParser.ParsedJavaSource parsed = JavaSourceParser.parse(source, "SampleRunner");
        assertEquals("demo.app.SampleRunner", parsed.getQualifiedClassName());
        assertEquals("demo/app/SampleRunner.java", parsed.getRelativeSourcePath());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseRejectsMissingTypeDeclaration() {
        JavaSourceParser.parse("package demo;\n", "Missing");
    }

    @Test
    public void prepareForCompilationRewritesAndroidImportsAndQualifiedTypes() {
        String source = "import android.graphics.Bitmap;\n"
                + "public class HelloJava {\n"
                + "  public static String run() {\n"
                + "    android.graphics.Bitmap bmp = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);\n"
                + "    return String.valueOf(bmp.getWidth());\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.graphics.Bitmap;"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.graphics.Bitmap bmp"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.graphics.Bitmap.createBitmap"));
        assertTrue(prepared.hadAndroidReferences());
        assertTrue(prepared.getRewriteCount() > 0);
        assertEquals("HelloJava", prepared.getParsedSource().getQualifiedClassName());
    }

    @Test
    public void prepareForCompilationPreservesNestedWrapperReferences() {
        String source = "public class HelloJava {\n"
                + "  public static String run() {\n"
                + "    return String.valueOf(android.graphics.Bitmap.Config.ARGB_8888);\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.ARGB_8888"));
        assertTrue(prepared.hadAndroidReferences());
        assertTrue(prepared.getRewriteCount() > 0);
    }

    @Test
    public void prepareForCompilationRewritesAndroidGraphicsWildcardImport() {
        String source = "import android.graphics.*;\n"
                + "public class HelloJava {\n"
                + "  public static String run() {\n"
                + "    Bitmap bmp = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);\n"
                + "    Canvas canvas = new Canvas(bmp);\n"
                + "    Paint paint = new Paint();\n"
                + "    paint.setColor(Color.RED);\n"
                + "    canvas.drawRect(0, 0, 1, 1, paint);\n"
                + "    return \"ok\";\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.graphics.*;"));
        assertTrue(prepared.hadAndroidReferences());
        assertTrue(prepared.getRewriteCount() > 0);
    }

    @Test
    public void prepareForCompilationRewritesBuildImportToWrapperBuild() {
        String source = "import android.os.Build;\n"
                + "public class HelloJava {\n"
                + "  public static String run() {\n"
                + "    return Build.MODEL + \":\" + Build.VERSION.SDK_INT;\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.os.Build;"));
        assertFalse(rewritten.contains("import android.os.Build;"));
        assertTrue(prepared.hadAndroidReferences());
        assertTrue(prepared.getRewriteCount() > 0);
    }

    @Test
    public void prepareForCompilationRewritesQualifiedBuildReferencesForPseudoMainActivity() {
        String source = "public class HelloJava {\n"
                + "  protected void onCreate(android.os.Bundle savedInstanceState) {\n"
                + "    StringBuilder sb = new StringBuilder();\n"
                + "    sb.append(android.os.Build.MODEL);\n"
                + "    sb.append(android.os.Build.VERSION.RELEASE);\n"
                + "    sb.append(android.os.Build.VERSION.SDK_INT);\n"
                + "    println(sb.toString());\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("protected void onCreate(com.micklab.dcg.wrapper.android.os.Bundle savedInstanceState)"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.os.Build.MODEL"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.os.Build.VERSION.RELEASE"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.os.Build.VERSION.SDK_INT"));
        assertFalse(rewritten.contains("sb.append(android.os.Build.MODEL);"));
        assertFalse(rewritten.contains("sb.append(android.os.Build.VERSION.RELEASE);"));
        assertFalse(rewritten.contains("sb.append(android.os.Build.VERSION.SDK_INT);"));
    }

    @Test
    public void prepareForCompilationLeavesNonAndroidSourceUntouched() {
        String source = "public class HelloJava {\n"
                + "  public static String run() {\n"
                + "    return \"ok\";\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        assertEquals(source, prepared.getRewrittenSource());
        assertEquals(0, prepared.getRewriteCount());
    }

    @Test
    public void prepareForCompilationRewritesPseudoMainActivitySource() {
        String source = "import androidx.appcompat.app.AppCompatActivity;\n"
                + "import android.os.Bundle;\n"
                + "import android.widget.ImageView;\n"
                + "public class MainActivity extends AppCompatActivity {\n"
                + "  protected void onCreate(Bundle savedInstanceState) {\n"
                + "    println(\"Hi\");\n"
                + "    ImageView imageView = new ImageView(this);\n"
                + "    setContentView(imageView);\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "MainActivity");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("extends com.micklab.dcg.wrapper.pseudo.PseudoMainActivity"));
        assertFalse(rewritten.contains("androidx.appcompat.app.AppCompatActivity"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.pseudo.ImageView;"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.os.Bundle;"));
        assertTrue(rewritten.contains("public static Object buildOutput()"));
        assertTrue(rewritten.contains("public static String __dcgGetPseudoOutputModelJson()"));
        assertFalse(rewritten.contains("__dcgActivity.onCreate((com.micklab.dcg.wrapper.android.os.Bundle) null);"));
    }

    @Test
    public void prepareForCompilationRewritesQualifiedBundleForPseudoMainActivity() {
        String source = "public class HelloJava {\n"
                + "  protected void onCreate(android.os.Bundle savedInstanceState) {\n"
                + "    println(\"Hi\");\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("protected void onCreate(com.micklab.dcg.wrapper.android.os.Bundle savedInstanceState)"));
        assertTrue(rewritten.contains("__dcgActivity.onCreate(null);"));
        assertFalse(rewritten.contains("protected void onCreate(android.os.Bundle"));
        assertFalse(rewritten.contains("import android.os.Bundle;"));
    }

    @Test
    public void prepareForCompilationAddsBundleImportForPseudoMainActivityWithoutAndroidImport() {
        String source = "public class HelloJava {\n"
                + "  protected void onCreate(Bundle savedInstanceState) {\n"
                + "    println(\"Hi\");\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.os.Bundle;"));
        assertTrue(rewritten.contains("protected void onCreate(Bundle savedInstanceState)"));
    }

    @Test
    public void prepareForCompilationDoesNotDoubleWrapBundleImports() {
        String source = "import android.os.Bundle;\n"
                + "public class HelloJava {\n"
                + "  protected void onCreate(Bundle savedInstanceState) {\n"
                + "    println(\"Hi\");\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.os.Bundle;"));
        assertTrue(rewritten.contains("protected void onCreate(Bundle savedInstanceState)"));
        assertFalse(rewritten.contains("com.micklab.dcg.wrapper.com.micklab.dcg.wrapper.android.os.Bundle"));
    }

    @Test
    public void prepareForCompilationSupportsDirectPseudoMainActivitySubclassWithoutBundleOnCreate() {
        String source = "public class HelloJava extends PseudoMainActivity {\n"
                + "  @Override\n"
                + "  protected void onCreate() {\n"
                + "    Bitmap bmp = Bitmap.createBitmap(400, 300, Bitmap.Config.ARGB_8888);\n"
                + "    Canvas canvas = new Canvas(bmp);\n"
                + "    canvas.drawColor(Color.WHITE);\n"
                + "    Paint paint = new Paint();\n"
                + "    drawBitmap(bmp);\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("extends com.micklab.dcg.wrapper.pseudo.PseudoMainActivity"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.pseudo.PseudoMainActivity;"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.pseudo.ImageView;"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.graphics.*;"));
        assertTrue(rewritten.contains("protected void onCreate()"));
        assertTrue(rewritten.contains("Bitmap bmp = Bitmap.createBitmap(400, 300, Bitmap.Config.ARGB_8888);"));
    }

    @Test
    public void prepareForCompilationRecognizesImportedAndroidActivitySubclass() {
        String source = "import android.app.ListActivity;\n"
                + "public class MainActivity extends ListActivity {\n"
                + "  protected void onCreate(android.os.Bundle savedInstanceState) {\n"
                + "    println(\"Hi\");\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "MainActivity");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("extends com.micklab.dcg.wrapper.pseudo.PseudoMainActivity"));
        assertTrue(rewritten.contains("protected void onCreate(com.micklab.dcg.wrapper.android.os.Bundle savedInstanceState)"));
    }

    @Test
    public void prepareForCompilationRecognizesRowDslHelpersAsPseudoMainActivity() {
        String source = "public class HelloJava {\n"
                + "  protected void onCreate() {\n"
                + "    beginRow();\n"
                + "    addLabel(\"7\");\n"
                + "    addButton(\"8\", \"press8\");\n"
                + "    endRow();\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("extends com.micklab.dcg.wrapper.pseudo.PseudoMainActivity"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.pseudo.TextView;"));
        assertTrue(rewritten.contains("public static String __dcgGetPseudoOutputModelJson()"));
    }

    @Test
    public void prepareForCompilationRecognizesTitleDslAndRewritesAndroidOsWildcardImport() {
        String source = "import android.os.*;\n"
                + "public class HelloJava {\n"
                + "  protected void onCreate(Bundle savedInstanceState) {\n"
                + "    addTitle(\"Calculator\");\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("extends com.micklab.dcg.wrapper.pseudo.PseudoMainActivity"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.os.*;"));
        assertTrue(rewritten.contains("protected void onCreate(Bundle savedInstanceState)"));
    }

    @Test
    public void prepareForCompilationRecognizesEditableAndSpacerDslHelpersAsPseudoMainActivity() {
        String source = "public class HelloJava {\n"
                + "  protected void onCreate() {\n"
                + "    setInputEditable(\"value\", false);\n"
                + "    addSpacer();\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("extends com.micklab.dcg.wrapper.pseudo.PseudoMainActivity"));
        assertTrue(rewritten.contains("public static String __dcgGetPseudoOutputModelJson()"));
    }

    @Test
    public void prepareForCompilationRecognizesImageDslHelpersAsPseudoMainActivity() {
        String source = "public class HelloJava {\n"
                + "  protected void onCreate() {\n"
                + "    saveBitmap(\"chart.png\", null);\n"
                + "    addImage(\"chart\", \"chart.png\");\n"
                + "    onImageClick(\"chart\", \"handleTap\");\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("extends com.micklab.dcg.wrapper.pseudo.PseudoMainActivity"));
        assertTrue(rewritten.contains("public static String __dcgGetPseudoOutputModelJson()"));
    }

    @Test
    public void prepareForCompilationKeepsGenericWrapperWildcardImportsForPseudoSource() {
        String source = "import android.app.Activity;\n"
                + "import android.view.*;\n"
                + "import android.widget.*;\n"
                + "public class MainActivity extends Activity {\n"
                + "  protected void onCreate(android.os.Bundle savedInstanceState) {\n"
                + "    TextView textView = new TextView(this);\n"
                + "    LinearLayout layout = new LinearLayout(this);\n"
                + "    layout.setOrientation(android.widget.LinearLayout.VERTICAL);\n"
                + "    android.view.ViewGroup.LayoutParams params = null;\n"
                + "    setContentView(layout);\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "MainActivity");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(prepared.isPseudoMainActivity());
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.view.*;"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.widget.*;"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.pseudo.TextView;"));
        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.pseudo.LinearLayout;"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.widget.LinearLayout.VERTICAL"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams params"));
        assertFalse(rewritten.contains("import com.micklab.dcg.wrapper.pseudo.*;"));
    }
}
