package ma.zebgha;

import java.net.URL;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {

         ZebghaJFrame a= new ZebghaJFrame();
         a.setExtendedState(JFrame.MAXIMIZED_BOTH);
         a.setVisible(true);
         a.setResizable(false);
         a.setTitle("Zebgha");
    }
}
