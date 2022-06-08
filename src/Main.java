import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();

        jFrame.add(new MyComponent());


    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Image image = new ImageIcon("java.png").getImage();
            g2.drawImage(image, 0, 0, null);

        }
    }

    static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
        return jFrame;
    }
}