package electricity.billing.system;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame {
    Splash() {
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon.splash/Splash.jpg"));
        Image image1 = imageIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image1);
        JLabel imageLabel = new JLabel(imageIcon1);
        add(imageLabel);

        this.setSize(600, 400);
        this.setLocation(500, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Splash();
    }
}

