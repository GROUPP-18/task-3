
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

public class MainFrameTest {

    @Test
    void testFrameInitialization() {
        MainFrame frame = new MainFrame();
        assertEquals("Grid Layout Example", frame.getTitle(), "Title should match");
        assertTrue(frame.isVisible(), "Frame should be visible");
    }

    @Test
    void testLayoutType() {
        MainFrame frame = new MainFrame();
        LayoutManager layout = frame.getContentPane().getLayout();
        assertTrue(layout instanceof GridLayout, "The layout manager should be GridLayout");

        GridLayout gridLayout = (GridLayout) layout;
        assertEquals(1, gridLayout.getRows(), "Should have 1 row");
        assertEquals(3, gridLayout.getColumns(), "Should have 3 columns");
    }

    @Test
    void testPanelColors() {
        MainFrame frame = new MainFrame();
        Component[] components = frame.getContentPane().getComponents();

        assertEquals(3, components.length, "Should have 3 ColorPanels added");

        assertEquals(Color.RED, components[0].getBackground(), "First panel should be RED");
        assertEquals(Color.WHITE, components[1].getBackground(), "Second panel should be WHITE");
        assertEquals(Color.BLACK, components[2].getBackground(), "Third panel should be BLACK");
    }
}