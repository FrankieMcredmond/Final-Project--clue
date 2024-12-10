import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Display  {
    public static void main(String avg[]) throws IOException
    {
        Display image=new Display();
    }

    public Display() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("ClueBoard.png"));
        Image newImage = img.getScaledInstance(720, 720, Image.SCALE_DEFAULT);
        ImageIcon icon=new ImageIcon(newImage);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(720,720);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
