package ma.zebgha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
/* import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane; */


public class ZebghaJFrame extends JFrame {
   /* Color c= Color.white;
    int x;
    int y;
   int choix;
    int diam=10;
    int selectx;
    int selecty;
    int selectx1;
    int selecty1; */

    public ZebghaJFrame() {
       initComponents();
        setIcon();
    }
  @SuppressWarnings("unchecked")
   private void initComponents()
    {
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton11;
        private javax.swing.JButton jButton12;
        private javax.swing.JButton jButton13;
        private javax.swing.JButton jButton14;
        private javax.swing.JButton jButton15;
        private javax.swing.JButton jButton16;
        private javax.swing.JButton jButton17;
        private javax.swing.JButton jButton18;
        private javax.swing.JButton jButton19;
        private javax.swing.JButton jButton20;
        private javax.swing.JButton jButton21;
        private javax.swing.JButton jButton22;
        private javax.swing.JButton jButton23;
        private javax.swing.JButton jButton24;
        private javax.swing.JButton jButton25;
        private javax.swing.JButton jButton26;
        private javax.swing.JButton jButton27;
        private javax.swing.JButton jButton28;
        private javax.swing.JButton jButton29;
        private javax.swing.JButton jButton30;
        private javax.swing.JButton jButton31;
        private javax.swing.JButton jButton32;
        private javax.swing.JButton jButton33;
        private javax.swing.JButton jButton34;
        private javax.swing.JLabel  jLabel1;
        private javax.swing.JLabel  jLabel2;
        private javax.swing.JLabel  jLabel3;
        private javax.swing.JMenu   jMenu;
        private javax.swing.JMenuBar  jMenuBar;
        private javax.swing.JMenuItem jMenuItem1;
        private javax.swing.JMenuItem jMenuItem2;
        private javax.swing.JMenuItem jMenuItem3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JSlider jSlider;

        jButton1= new javax.swing.JButton();
        jButton2= new javax.swing.JButton();
        jButton3= new javax.swing.JButton();
        jButton4= new javax.swing.JButton();
        jButton5= new javax.swing.JButton();
        jButton6= new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider = new javax.swing.JSlider();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu= new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255,255,255));
        setIconImage(null);
        setName("Zebgha");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
                          }
        );
        jButton1.setText("Colors");
        jButton1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255,255,255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter(){
             public void MouseDragged(java.awt.event.MouseEvent evt){
                 jPanelMouseDragged(evt);
             }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mousePressed(java.awt.event.MouseEvent evt){
                jPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.evnt.MouseEvent evt){
                jPanelMouseReleased(evt);
    });
        jPanel1.setLayout(new java.awt.GridLayout(1.0)));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ma/zebgha/ligne.png")));
        jButton2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jButton2ActionPerformed(evt);
                }
        }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ma/zebgha/Rectangle.png")));
        jButton3.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jButton3ActionPerformed(evt);
            }
        }
    });
         jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ma/zebgha/.png")));
         jButton4.addActionListener(new java.awt.event.ActionListener(){
              public void actionPerformed(java.awt.event.ActionEvent evt){
            jButton4ActionPerformed(evt);
        }
    }
     });
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ma/zebgha/.png")));
        jButton5.addActionListener(new java.awt.event.ActionListener(){
public void actionPerformed(java.awt.event.ActionEvent evt){
        jButtonActionPerformed(evt);
        }
        }
        });






    }

    private void setIcon()
    {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Zebghalogo.png")));
    }

}
