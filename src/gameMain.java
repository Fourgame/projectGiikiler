import java.awt.*;
import javax.swing.*;
public class gameMain {
    
    public static void about() {
        Icon icon = new ImageIcon("picture/dp.png");
        JOptionPane.showMessageDialog(null,
                "Nattapol Prairuenrom \n6530300155\nnattapol.prai@ku.th",
                "Developer",
                JOptionPane.PLAIN_MESSAGE, icon);}
    public static MenuItem level_1 = new MenuItem("Level 1");
    public static MenuItem level_2 = new MenuItem("Level 2");
    public static MenuItem level_3 = new MenuItem("Level 3");
    public static MenuItem level_4 = new MenuItem("Level 4");
    public static MenuItem level_5 = new MenuItem("Level 5");
    public static boolean theme = true;
    public static game lv1,lv2,lv3,lv4,lv5;
    public static boolean b = true;
public static void main(String[] args){
    JFrame a = new JFrame();
      lv1 = new setlevels(1,b);
      lv2 = new setlevels(2,b);
      lv3 = new setlevels(3,b);
      lv4 = new setlevels(4,b);
      lv5 = new setlevels(5,b);
    MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("Themes");
        Menu menu2 = new Menu("Levels");
        Menu menu3 = new Menu("About");
        MenuItem menu_theme1 = new MenuItem("Light");
        MenuItem menu_theme2 = new MenuItem("Dark");
        MenuItem about_1 = new MenuItem("Developer");
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menu1.add(menu_theme1);
        menu1.add(menu_theme2);
        menu2.add(level_1);
        menu2.add(level_2);
        menu2.add(level_3);
        menu2.add(level_4);
        menu2.add(level_5);
        menu3.add(about_1);
        menu_theme1.addActionListener(action -> {
        b=true;
        a.getContentPane().removeAll();
            lv1 = new setlevels(1,b);
            a.add(lv1);
            lv1.setVisible(true);
            lv2.setVisible(false);
            lv3.setVisible(false);
            lv4.setVisible(false);
            lv5.setVisible(false);
            a.revalidate();
            a.repaint();
        });
        menu_theme2.addActionListener(action -> {
            b=false;
            a.getContentPane().removeAll();
                lv1 = new setlevels(1,b);
                a.add(lv1);
                lv1.setVisible(true);
                lv2.setVisible(false);
                lv3.setVisible(false);
                lv4.setVisible(false);
                lv5.setVisible(false);
                
                a.revalidate();
                a.repaint();
            });

        
        level_1.addActionListener(action -> {
            a.getContentPane().removeAll();
            lv1 = new setlevels(1,b);
            a.add(lv1);
            lv1.setVisible(true);
            lv2.setVisible(false);
            lv3.setVisible(false);
            lv4.setVisible(false);
            lv5.setVisible(false);
            a.revalidate();
            a.repaint();
        });

        level_2.addActionListener(action -> {
            a.getContentPane().removeAll();
            lv2 = new setlevels(2,b);
            a.add(lv2);
            lv1.setVisible(false);
            lv2.setVisible(true);
            lv3.setVisible(false);
            lv4.setVisible(false);
            lv5.setVisible(false);
            a.revalidate();
            a.repaint();
        });

        level_3.addActionListener(action -> {
            a.getContentPane().removeAll();
            lv3 = new setlevels(3,b);
            a.add(lv3);
            lv1.setVisible(false);
            lv2.setVisible(false);
            lv3.setVisible(true);
            lv4.setVisible(false);
            lv5.setVisible(false);
            a.revalidate();
            a.repaint();
        });

        level_4.addActionListener(action -> {
            a.getContentPane().removeAll();
            lv4 = new setlevels(4,b);
            a.add(lv4);
            lv1.setVisible(false);
            lv2.setVisible(false);
            lv3.setVisible(false);
            lv4.setVisible(true);
            lv5.setVisible(false);
            a.revalidate();
            a.repaint();
        });

        level_5.addActionListener(action -> {
            a.getContentPane().removeAll();
            lv5 = new setlevels(5,b);
            a.add(lv5);
            lv1.setVisible(false);
            lv2.setVisible(false);
            lv3.setVisible(false);
            lv4.setVisible(false);
            lv5.setVisible(true);
            a.revalidate();
            a.repaint();
            });

            about_1.addActionListener(action -> {
                about();
            });
        
    
    a.setBounds(500,25,600,850);
    a.setMenuBar(menuBar);
        a.add(lv1);
        a.add(lv2);
        a.add(lv3);
        a.add(lv4);
        a.add(lv5);
        
    a.setLayout(null);
    a.setVisible(true);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
}
