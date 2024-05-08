import java.awt.Image;
import java.awt.Toolkit;

public class IconUtil {

    public static void setIconImage(javax.swing.JFrame frame) {
        try {
            String imagePath = "/Image/Logo.png";
            Image iconImage = Toolkit.getDefaultToolkit().getImage(IconUtil.class.getResource(imagePath));
            if (iconImage == null) {
                System.err.println("Icon image resource not found!");
            } else {
                frame.setIconImage(iconImage);
                System.out.println("Icon image set successfully.");
            }
        } catch (Exception e) {
            System.err.println("Error setting icon: " + e.getMessage());
        }
    }
}
