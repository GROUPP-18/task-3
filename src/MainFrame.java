import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("Grid Layout Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setLayout(new GridLayout(1,3));

        ColorPanel panel1 = new ColorPanel(Color.RED);
        ColorPanel panel2 = new ColorPanel(Color.white);
        ColorPanel panel3 = new ColorPanel(Color.black);

        add(panel1);
        add(panel2);
        add(panel3);

        setVisible(true);
    }

}
