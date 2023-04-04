
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class game extends JPanel implements ActionListener{
int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0,a12=0,a13=0,a14=0,a15=0,a16=0,a17=0,a18=0,a19=0,a20=0;
int i=1,check=0;
JLabel setsize;
String s=null;
JButton b1 = new JButton("");
JButton b2 = new JButton("");
JButton b3 = new JButton("");
JButton b4 = new JButton("");
JButton b5 = new JButton("");
JButton b6 = new JButton("");
JButton b7 = new JButton("");
JButton b8 = new JButton("");
JButton b9 = new JButton("");
JButton b10 = new JButton("");
JButton b11 = new JButton("");
JButton b12 = new JButton("");
JButton b13 = new JButton("");
JButton b14 = new JButton("");
JButton b15 = new JButton("");
JButton b16 = new JButton("");
JButton b17 = new JButton("");
JButton b18 = new JButton("");
JButton b19 = new JButton("");
JButton b20 = new JButton("");
JButton ba = new JButton("");
JButton base = new JButton("base");
JButton next = new JButton("guide");
JPanel finish = new JPanel();
JPanel finish2 = new JPanel();
JLabel Start=new JLabel();
Icon iconguide = new ImageIcon("picture/guide.png");
Icon iconwin = new ImageIcon("picture/win.png");
game(){

 
 Start.setFont(new Font("Courier New", Font.BOLD, 40));
 
 setsize =new JLabel();
 
finish.setBounds(187,458,234,234);
finish2.setBounds(190,461,220,220);
b1.setBounds(74,116,114,114);
b2.setBounds(189,116,114,114);
b3.setBounds(304,116,114,114);
b4.setBounds(419,116,114,114);
b5.setBounds(74,231,114,114);
b6.setBounds(189,231,114,114);
b7.setBounds(304,231,114,114);
b8.setBounds(419,231,114,114);
b9.setBounds(74,346,114,114);
b10.setBounds(189,346,114,114);
b11.setBounds(304,346,114,114);
b12.setBounds(419,346,114,114);
b13.setBounds(74,461,114,114);
b14.setBounds(189,462,114,114);
b15.setBounds(304,462,114,114);
b16.setBounds(419,461,114,114);
b17.setBounds(74,576,114,114);
b18.setBounds(189,576,114,114);
b19.setBounds(304,576,114,114);
b20.setBounds(419,576,114,114);
next.setBounds(75, 698,459,61);
Start.setBounds(75, 19,459,74);

add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);add(b18);add(b19);add(b20);add(next);add(Start);
add(finish2);
add(finish);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
next.addActionListener(this);

setSize(600,800);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
    if(i==3){i=1;a1=0;a2=0;a3=0;a4=0;a5=0;a6=0;a7=0;a8=0;a9=0;a10=0;a11=0;a12=0;a13=0;a14=0;a15=0;a16=0;a17=0;a18=0;a19=0;a20=0;
    }
            if(e.getSource()==b1){
            a1=i;
            }
            if(e.getSource()==b2){
            a2=i;
            }
            if(e.getSource()==b3){
            a3=i;
            }
            if(e.getSource()==b4){
            a4=i;
            }
            if(e.getSource()==b5){
            a5=i;
            }
            if(e.getSource()==b5){
            a5=i;
            }
            if(e.getSource()==b6){
            a6=i;
            }
            if(e.getSource()==b7){
            a7=i;
            }
            if(e.getSource()==b8){
            a8=i;
            }if(e.getSource()==b9){
            a9=i;
            }if(e.getSource()==b10){
            a10=i;
            }if(e.getSource()==b11){
            a11=i;
            }
            if(e.getSource()==b12){
            a12=i;
            }
            if(e.getSource()==b13){
            a13=i;
            }
            if(e.getSource()==b14){
            a14=i;
            }
            if(e.getSource()==b15){
            a15=i;
            }
            if(e.getSource()==b16){
            a16=i;
            }
            if(e.getSource()==b17){
            a17=i;
            }
            if(e.getSource()==b18){
            a18=i;
            }
            if(e.getSource()==b19){
            a19=i;
            }
            if(e.getSource()==b20){
            a20=i;
            }
            if(e.getSource()==next){
                
                JOptionPane.showMessageDialog(null,
                "",
                "Guide",
                JOptionPane.PLAIN_MESSAGE,iconguide);
            }

            if((b14.getBackground()==b15.getBackground())&&(b18.getBackground()==b19.getBackground())&&(b14.getBackground()!=base.getBackground())&&(b15.getBackground()!=base.getBackground())&&(b18.getBackground()!=base.getBackground())&&(b19.getBackground()!=base.getBackground())){
                JOptionPane.showMessageDialog(null,"","win",JOptionPane.PLAIN_MESSAGE, iconwin);}

            if((((b1.getBackground()==b2.getBackground())&&(b5.getBackground()==b6.getBackground()))&&(a1==1||a2==1||a1==2||a2==2||a5==1||a5==2||a6==1||a6==2))&&((b1.getBackground()!=base.getBackground())&&(b2.getBackground()!=base.getBackground())&&(b5.getBackground()!=base.getBackground())&&(b6.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b1.getBackground());b1.setBackground(Color.red);b2.setBackground(Color.red);b5.setBackground(Color.red);b6.setBackground(Color.red);}
            if(i==2){b1.setBackground(ba.getBackground());b2.setBackground(ba.getBackground());b5.setBackground(ba.getBackground());b6.setBackground(ba.getBackground());}
            if((a3==2||a7==2)&&(b3.getBackground().equals(base.getBackground())&&b7.getBackground().equals(base.getBackground()))){  b3.setBackground(ba.getBackground()); b7.setBackground(ba.getBackground()); b1.setBackground(base.getBackground());b5.setBackground(base.getBackground());}
            if((a9==2||a10==2)&&(b9.getBackground().equals(base.getBackground())&&b10.getBackground().equals(base.getBackground()))){  b9.setBackground(ba.getBackground()); b10.setBackground(ba.getBackground()); b1.setBackground(base.getBackground());b2.setBackground(base.getBackground());}
            }   
            else if((((b2.getBackground()==b3.getBackground())&&(b6.getBackground()==b7.getBackground()))&&(a2==1||a3==1||a2==2||a3==2||a6==1||a6==2||a7==1||a7==2))&&((b2.getBackground()!=base.getBackground())&&(b3.getBackground()!=base.getBackground())&&(b6.getBackground()!=base.getBackground())&&(b7.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b2.getBackground());b2.setBackground(Color.red);b3.setBackground(Color.red);b6.setBackground(Color.red);b7.setBackground(Color.red);}
            if(i==2){b2.setBackground(ba.getBackground());b3.setBackground(ba.getBackground());b6.setBackground(ba.getBackground());b7.setBackground(ba.getBackground());}
            if((a1==2||a5==2)&&(b1.getBackground().equals(base.getBackground())&&b5.getBackground().equals(base.getBackground()))){  b1.setBackground(ba.getBackground()); b5.setBackground(ba.getBackground()); b3.setBackground(base.getBackground());b7.setBackground(base.getBackground());}
            if((a4==2||a8==2)&&(b4.getBackground().equals(base.getBackground())&&b8.getBackground().equals(base.getBackground()))){  b4.setBackground(ba.getBackground()); b8.setBackground(ba.getBackground()); b2.setBackground(base.getBackground());b6.setBackground(base.getBackground());}
            if((a10==2||a11==2)&&(b10.getBackground().equals(base.getBackground())&&b11.getBackground().equals(base.getBackground()))){  b10.setBackground(ba.getBackground()); b11.setBackground(ba.getBackground()); b2.setBackground(base.getBackground());b3.setBackground(base.getBackground());}
            }
            else if((((b3.getBackground()==b4.getBackground())&&(b7.getBackground()==b8.getBackground()))&&(a3==1||a3==1||a4==2||a4==2||a7==1||a7==2||a8==1||a8==2))&&((b3.getBackground()!=base.getBackground())&&(b4.getBackground()!=base.getBackground())&&(b7.getBackground()!=base.getBackground())&&(b8.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b3.getBackground());b3.setBackground(Color.red);b4.setBackground(Color.red);b7.setBackground(Color.red);b8.setBackground(Color.red);}
            if(i==2){b3.setBackground(ba.getBackground());b4.setBackground(ba.getBackground());b7.setBackground(ba.getBackground());b8.setBackground(ba.getBackground());}
            if((a2==2||a6==2)&&(b2.getBackground().equals(base.getBackground())&&b6.getBackground().equals(base.getBackground()))){  b2.setBackground(ba.getBackground()); b6.setBackground(ba.getBackground()); b4.setBackground(base.getBackground());b8.setBackground(base.getBackground());}
            if((a11==2||a12==2)&&(b11.getBackground().equals(base.getBackground())&&b12.getBackground().equals(base.getBackground()))){  b11.setBackground(ba.getBackground()); b12.setBackground(ba.getBackground()); b3.setBackground(base.getBackground());b4.setBackground(base.getBackground());}
            }
            else if((((b5.getBackground()==b6.getBackground())&&(b9.getBackground()==b10.getBackground()))&&(a5==1||a5==2||a6==1||a6==2||a9==1||a9==2||a10==1||a10==2))&&((b5.getBackground()!=base.getBackground())&&(b6.getBackground()!=base.getBackground())&&(b9.getBackground()!=base.getBackground())&&(b10.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b5.getBackground());b5.setBackground(Color.red);b6.setBackground(Color.red);b9.setBackground(Color.red);b10.setBackground(Color.red);}
            if(i==2){b5.setBackground(ba.getBackground());b6.setBackground(ba.getBackground());b9.setBackground(ba.getBackground());b10.setBackground(ba.getBackground());}
            if((a1==2||a2==2)&&(b1.getBackground().equals(base.getBackground())&&b2.getBackground().equals(base.getBackground()))){ b1.setBackground(ba.getBackground()); b2.setBackground(ba.getBackground()); b9.setBackground(base.getBackground());b10.setBackground(base.getBackground());}
            if((a7==2||a11==2)&&(b7.getBackground().equals(base.getBackground())&&b11.getBackground().equals(base.getBackground()))){ b7.setBackground(ba.getBackground()); b11.setBackground(ba.getBackground()); b5.setBackground(base.getBackground());b9.setBackground(base.getBackground());}
            if((a13==2||a14==2)&&(b13.getBackground().equals(base.getBackground())&&b14.getBackground().equals(base.getBackground()))){ b13.setBackground(ba.getBackground()); b14.setBackground(ba.getBackground()); b5.setBackground(base.getBackground());b6.setBackground(base.getBackground());}
            }
            else if((((b6.getBackground()==b7.getBackground())&&(b10.getBackground()==b11.getBackground()))&&(a6==1||a6==2||a7==1||a7==2||a10==1||a10==2||a11==1||a11==2))&&((b6.getBackground()!=base.getBackground())&&(b7.getBackground()!=base.getBackground())&&(b10.getBackground()!=base.getBackground())&&(b11.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b6.getBackground());b6.setBackground(Color.red);b7.setBackground(Color.red);b10.setBackground(Color.red);b11.setBackground(Color.red);}
            if(i==2){b6.setBackground(ba.getBackground());b7.setBackground(ba.getBackground());b10.setBackground(ba.getBackground());b11.setBackground(ba.getBackground());}
            if((a2==2||a3==2)&&(b2.getBackground().equals(base.getBackground())&&b3.getBackground().equals(base.getBackground()))){ b2.setBackground(ba.getBackground()); b3.setBackground(ba.getBackground()); b10.setBackground(base.getBackground());b11.setBackground(base.getBackground());}
            if((a5==2||a9==2)&&(b5.getBackground().equals(base.getBackground())&&b9.getBackground().equals(base.getBackground()))){ b5.setBackground(ba.getBackground()); b9.setBackground(ba.getBackground()); b7.setBackground(base.getBackground());b11.setBackground(base.getBackground());}
            if((a8==2||a12==2)&&(b8.getBackground().equals(base.getBackground())&&b12.getBackground().equals(base.getBackground()))){ b8.setBackground(ba.getBackground()); b12.setBackground(ba.getBackground()); b6.setBackground(base.getBackground());b10.setBackground(base.getBackground());}
            if((a14==2||a15==2)&&(b14.getBackground().equals(base.getBackground())&&b15.getBackground().equals(base.getBackground()))){ b14.setBackground(ba.getBackground()); b15.setBackground(ba.getBackground()); b7.setBackground(base.getBackground());b6.setBackground(base.getBackground());}
            }
            else if((((b7.getBackground()==b8.getBackground())&&(b11.getBackground()==b12.getBackground()))&&(a7==1||a7==2||a8==1||a8==2||a11==1||a11==2||a12==1||a12==2))&&((b7.getBackground()!=base.getBackground())&&(b8.getBackground()!=base.getBackground())&&(b11.getBackground()!=base.getBackground())&&(b12.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b7.getBackground());b7.setBackground(Color.red);b8.setBackground(Color.red);b11.setBackground(Color.red);b12.setBackground(Color.red);}
            if(i==2){b7.setBackground(ba.getBackground());b8.setBackground(ba.getBackground());b11.setBackground(ba.getBackground());b12.setBackground(ba.getBackground());}
            if((a3==2||a4==2)&&(b3.getBackground().equals(base.getBackground())&&b4.getBackground().equals(base.getBackground()))){ b3.setBackground(ba.getBackground()); b4.setBackground(ba.getBackground()); b11.setBackground(base.getBackground());b12.setBackground(base.getBackground());}
            if((a6==2||a10==2)&&(b6.getBackground().equals(base.getBackground())&&b10.getBackground().equals(base.getBackground()))){ b6.setBackground(ba.getBackground()); b10.setBackground(ba.getBackground()); b8.setBackground(base.getBackground());b12.setBackground(base.getBackground());}
            if((a15==2||a16==2)&&(b15.getBackground().equals(base.getBackground())&&b16.getBackground().equals(base.getBackground()))){ b15.setBackground(ba.getBackground()); b16.setBackground(ba.getBackground()); b7.setBackground(base.getBackground());b8.setBackground(base.getBackground());}
            }
            else if((((b9.getBackground()==b10.getBackground())&&(b13.getBackground()==b14.getBackground()))&&(a10==1||a10==2||a9==1||a9==2||a14==1||a14==2||a13==1||a13==2))&&((b9.getBackground()!=base.getBackground())&&(b10.getBackground()!=base.getBackground())&&(b13.getBackground()!=base.getBackground())&&(b14.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b9.getBackground());b9.setBackground(Color.red);b10.setBackground(Color.red);b13.setBackground(Color.red);b14.setBackground(Color.red);}
            if(i==2){b9.setBackground(ba.getBackground());b10.setBackground(ba.getBackground());b13.setBackground(ba.getBackground());b14.setBackground(ba.getBackground());}
            if((a5==2||a6==2)&&(b5.getBackground().equals(base.getBackground())&&b6.getBackground().equals(base.getBackground()))){ b5.setBackground(ba.getBackground()); b6.setBackground(ba.getBackground()); b13.setBackground(base.getBackground());b14.setBackground(base.getBackground());}
            if((a11==2||a15==2)&&(b11.getBackground().equals(base.getBackground())&&b15.getBackground().equals(base.getBackground()))){ b11.setBackground(ba.getBackground()); b15.setBackground(ba.getBackground()); b9.setBackground(base.getBackground());b13.setBackground(base.getBackground());}
            if((a17==2||a18==2)&&(b17.getBackground().equals(base.getBackground())&&b18.getBackground().equals(base.getBackground()))){ b17.setBackground(ba.getBackground()); b18.setBackground(ba.getBackground()); b9.setBackground(base.getBackground());b10.setBackground(base.getBackground());}
            }
            else if((((b10.getBackground()==b11.getBackground())&&(b14.getBackground()==b15.getBackground()))&&(a11==1||a11==2||a10==1||a10==2||a15==1||a15==2||a14==1||a14==2))&&((b10.getBackground()!=base.getBackground())&&(b11.getBackground()!=base.getBackground())&&(b14.getBackground()!=base.getBackground())&&(b15.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b10.getBackground());b10.setBackground(Color.red);b11.setBackground(Color.red);b14.setBackground(Color.red);b15.setBackground(Color.red);}
            if(i==2){b10.setBackground(ba.getBackground());b11.setBackground(ba.getBackground());b14.setBackground(ba.getBackground());b15.setBackground(ba.getBackground());}
            if((a6==2||a7==2)&&(b6.getBackground().equals(base.getBackground())&&b7.getBackground().equals(base.getBackground()))){ b6.setBackground(ba.getBackground()); b7.setBackground(ba.getBackground()); b14.setBackground(base.getBackground());b15.setBackground(base.getBackground());}
            if((a9==2||a13==2)&&(b9.getBackground().equals(base.getBackground())&&b13.getBackground().equals(base.getBackground()))){ b9.setBackground(ba.getBackground()); b13.setBackground(ba.getBackground()); b11.setBackground(base.getBackground());b15.setBackground(base.getBackground());}
            if((a12==2||a16==2)&&(b12.getBackground().equals(base.getBackground())&&b16.getBackground().equals(base.getBackground()))){ b12.setBackground(ba.getBackground()); b16.setBackground(ba.getBackground()); b10.setBackground(base.getBackground());b14.setBackground(base.getBackground());}
            if((a18==2||a19==2)&&(b18.getBackground().equals(base.getBackground())&&b19.getBackground().equals(base.getBackground()))){ b18.setBackground(ba.getBackground()); b19.setBackground(ba.getBackground()); b10.setBackground(base.getBackground());b11.setBackground(base.getBackground());}
            }
            else if((((b11.getBackground()==b12.getBackground())&&(b15.getBackground()==b16.getBackground()))&&(a12==1||a12==2||a11==1||a11==2||a16==1||a16==2||a15==1||a15==2))&&((b11.getBackground()!=base.getBackground())&&(b12.getBackground()!=base.getBackground())&&(b15.getBackground()!=base.getBackground())&&(b16.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b11.getBackground());b11.setBackground(Color.red);b12.setBackground(Color.red);b15.setBackground(Color.red);b16.setBackground(Color.red);}
            if(i==2){b11.setBackground(ba.getBackground());b12.setBackground(ba.getBackground());b15.setBackground(ba.getBackground());b16.setBackground(ba.getBackground());}
            if((a7==2||a8==2)&&(b7.getBackground().equals(base.getBackground())&&b8.getBackground().equals(base.getBackground()))){ b7.setBackground(ba.getBackground()); b8.setBackground(ba.getBackground()); b15.setBackground(base.getBackground());b16.setBackground(base.getBackground());}
            if((a10==2||a14==2)&&(b10.getBackground().equals(base.getBackground())&&b14.getBackground().equals(base.getBackground()))){ b10.setBackground(ba.getBackground()); b14.setBackground(ba.getBackground()); b12.setBackground(base.getBackground());b16.setBackground(base.getBackground());}
            if((a19==2||a20==2)&&(b19.getBackground().equals(base.getBackground())&&b20.getBackground().equals(base.getBackground()))){ b19.setBackground(ba.getBackground()); b20.setBackground(ba.getBackground()); b11.setBackground(base.getBackground());b12.setBackground(base.getBackground());}
            }
            else if((((b13.getBackground()==b14.getBackground())&&(b17.getBackground()==b18.getBackground()))&&(a14==1||a14==2||a13==1||a13==2||a18==1||a18==2||a17==1||a17==2))&&((b13.getBackground()!=base.getBackground())&&(b14.getBackground()!=base.getBackground())&&(b17.getBackground()!=base.getBackground())&&(b18.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b13.getBackground());b13.setBackground(Color.red);b14.setBackground(Color.red);b17.setBackground(Color.red);b18.setBackground(Color.red);}
            if(i==2){b13.setBackground(ba.getBackground());b14.setBackground(ba.getBackground());b17.setBackground(ba.getBackground());b18.setBackground(ba.getBackground());}
            if((a9==2||a10==2)&&(b9.getBackground().equals(base.getBackground())&&b10.getBackground().equals(base.getBackground()))){ b9.setBackground(ba.getBackground()); b10.setBackground(ba.getBackground()); b17.setBackground(base.getBackground());b18.setBackground(base.getBackground());}
            if((a15==2||a19==2)&&(b15.getBackground().equals(base.getBackground())&&b19.getBackground().equals(base.getBackground()))){ b15.setBackground(ba.getBackground()); b19.setBackground(ba.getBackground()); b13.setBackground(base.getBackground());b17.setBackground(base.getBackground());}
            }
            else if((((b14.getBackground()==b15.getBackground())&&(b18.getBackground()==b19.getBackground()))&&(a15==1||a15==2||a14==1||a14==2||a19==1||a19==2||a18==1||a18==2))&&((b14.getBackground()!=base.getBackground())&&(b15.getBackground()!=base.getBackground())&&(b18.getBackground()!=base.getBackground())&&(b19.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b14.getBackground());b14.setBackground(Color.red);b15.setBackground(Color.red);b18.setBackground(Color.red);b19.setBackground(Color.red);}
            if(i==2){b14.setBackground(ba.getBackground());b15.setBackground(ba.getBackground());b18.setBackground(ba.getBackground());b19.setBackground(ba.getBackground());}
            if((a10==2||a11==2)&&(b10.getBackground().equals(base.getBackground())&&b11.getBackground().equals(base.getBackground()))){ b10.setBackground(ba.getBackground()); b11.setBackground(ba.getBackground()); b18.setBackground(base.getBackground());b19.setBackground(base.getBackground());}
            if((a13==2||a17==2)&&(b13.getBackground().equals(base.getBackground())&&b17.getBackground().equals(base.getBackground()))){ b13.setBackground(ba.getBackground()); b17.setBackground(ba.getBackground()); b15.setBackground(base.getBackground());b19.setBackground(base.getBackground());}
            if((a16==2||a20==2)&&(b16.getBackground().equals(base.getBackground())&&b20.getBackground().equals(base.getBackground()))){ b16.setBackground(ba.getBackground()); b20.setBackground(ba.getBackground()); b14.setBackground(base.getBackground());b18.setBackground(base.getBackground());}
            }
            else if((((b15.getBackground()==b16.getBackground())&&(b19.getBackground()==b20.getBackground()))&&(a16==1||a16==2||a15==1||a15==2||a20==1||a20==2||a19==1||a19==2))&&((b15.getBackground()!=base.getBackground())&&(b16.getBackground()!=base.getBackground())&&(b19.getBackground()!=base.getBackground())&&(b20.getBackground()!=base.getBackground()))){
            if(i==1){ba.setBackground(b15.getBackground());b15.setBackground(Color.red);b16.setBackground(Color.red);b19.setBackground(Color.red);b20.setBackground(Color.red);}
            if(i==2){b15.setBackground(ba.getBackground());b16.setBackground(ba.getBackground());b19.setBackground(ba.getBackground());b20.setBackground(ba.getBackground());}
            if((a14==2||a18==2)&&(b14.getBackground().equals(base.getBackground())&&b18.getBackground().equals(base.getBackground()))){ b14.setBackground(ba.getBackground()); b18.setBackground(ba.getBackground()); b16.setBackground(base.getBackground());b20.setBackground(base.getBackground());}
            if((a11==2||a12==2)&&(b11.getBackground().equals(base.getBackground())&&b12.getBackground().equals(base.getBackground()))){ b11.setBackground(ba.getBackground()); b12.setBackground(ba.getBackground()); b19.setBackground(base.getBackground());b20.setBackground(base.getBackground());}
            }


    //row


    else if(((b1.getBackground()==b2.getBackground())&&(a1==1||a2==1||a1==2||a2==2))&&((b1.getBackground()!=base.getBackground())&&(b2.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b1.getBackground());b1.setBackground(Color.red);b2.setBackground(Color.red);}
    if(i==2){b1.setBackground(ba.getBackground());b2.setBackground(ba.getBackground());}
    if(a3==2&&b3.getBackground().equals(base.getBackground())){  b3.setBackground(ba.getBackground()); b1.setBackground(base.getBackground());  }
    if((a5==2||a6==2)&&(b5.getBackground().equals(base.getBackground())&&b6.getBackground().equals(base.getBackground()))){  b5.setBackground(ba.getBackground()); b6.setBackground(ba.getBackground()); b1.setBackground(base.getBackground());b2.setBackground(base.getBackground());}
    }
    else if(((b2.getBackground()==b3.getBackground())&&(a2==1||a3==1||a2==2||a3==2))&&((b2.getBackground()!=base.getBackground())&&(b3.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b2.getBackground());b2.setBackground(Color.red);b3.setBackground(Color.red);}
    if(i==2){b2.setBackground(ba.getBackground());b3.setBackground(ba.getBackground());}
    if(a1==2&&b1.getBackground().equals(base.getBackground())){  b1.setBackground(ba.getBackground()); b3.setBackground(base.getBackground());  }
    if(a4==2&&b4.getBackground().equals(base.getBackground())){  b4.setBackground(ba.getBackground()); b2.setBackground(base.getBackground());  }
    if((a6==2||a7==2)&&(b6.getBackground().equals(base.getBackground())&&b7.getBackground().equals(base.getBackground()))){  b6.setBackground(ba.getBackground()); b7.setBackground(ba.getBackground()); b2.setBackground(base.getBackground());b3.setBackground(base.getBackground());}
    }
    else if(((b3.getBackground()==b4.getBackground())&&(a3==1||a4==1||a3==2||a4==2))&&((b3.getBackground()!=base.getBackground())&&(b4.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b3.getBackground());b3.setBackground(Color.red);b4.setBackground(Color.red);}
    if(i==2){b3.setBackground(ba.getBackground());b4.setBackground(ba.getBackground());}
    if(a2==2&&b2.getBackground().equals(base.getBackground())){  b2.setBackground(ba.getBackground()); b4.setBackground(base.getBackground());  }
    if((a7==2||a8==2)&&(b7.getBackground().equals(base.getBackground())&&b8.getBackground().equals(base.getBackground()))){  b7.setBackground(ba.getBackground()); b8.setBackground(ba.getBackground()); b3.setBackground(base.getBackground());b4.setBackground(base.getBackground());}
    }
    else if(((b5.getBackground()==b6.getBackground())&&(a5==1||a6==1||a5==2||a6==2))&&((b5.getBackground()!=base.getBackground())&&(b6.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b5.getBackground());b5.setBackground(Color.red);b6.setBackground(Color.red);}
    if(i==2){b5.setBackground(ba.getBackground());b6.setBackground(ba.getBackground());}
    if(a7==2&&b7.getBackground().equals(base.getBackground())){  b7.setBackground(ba.getBackground()); b5.setBackground(base.getBackground());  }
    if((a9==2||a10==2)&&(b9.getBackground().equals(base.getBackground())&&b10.getBackground().equals(base.getBackground()))){  b9.setBackground(ba.getBackground()); b10.setBackground(ba.getBackground()); b5.setBackground(base.getBackground());b6.setBackground(base.getBackground());}
    if((a1==2||a2==2)&&(b1.getBackground().equals(base.getBackground())&&b2.getBackground().equals(base.getBackground()))){  b1.setBackground(ba.getBackground()); b2.setBackground(ba.getBackground()); b5.setBackground(base.getBackground());b6.setBackground(base.getBackground());}
    }
    else if(((b6.getBackground()==b7.getBackground())&&(a6==1||a7==1||a6==2||a7==2))&&((b6.getBackground()!=base.getBackground())&&(b7.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b6.getBackground());b6.setBackground(Color.red);b7.setBackground(Color.red);}
    if(i==2){b6.setBackground(ba.getBackground());b7.setBackground(ba.getBackground());}
    if(a8==2&&b8.getBackground().equals(base.getBackground())){ b8.setBackground(ba.getBackground()); b6.setBackground(base.getBackground()); }
    if(a5==2&&b5.getBackground().equals(base.getBackground())){ b5.setBackground(ba.getBackground()); b7.setBackground(base.getBackground()); }
    if((a10==2||a11==2)&&(b10.getBackground().equals(base.getBackground())&&b11.getBackground().equals(base.getBackground()))){ b10.setBackground(ba.getBackground()); b11.setBackground(ba.getBackground()); b6.setBackground(base.getBackground());b7.setBackground(base.getBackground());}
    if((a2==2||a3==2)&&(b2.getBackground().equals(base.getBackground())&&b3.getBackground().equals(base.getBackground()))){ b2.setBackground(ba.getBackground()); b3.setBackground(ba.getBackground()); b6.setBackground(base.getBackground());b7.setBackground(base.getBackground());}
    }
    else if(((b7.getBackground()==b8.getBackground())&&(a7==1||a8==1||a7==2||a8==2))&&((b7.getBackground()!=base.getBackground())&&(b8.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b7.getBackground());b7.setBackground(Color.red);b8.setBackground(Color.red);}
    if(i==2){b7.setBackground(ba.getBackground());b8.setBackground(ba.getBackground());}
    if(a9==2&&b9.getBackground().equals(base.getBackground())){ b9.setBackground(ba.getBackground()); b7.setBackground(base.getBackground()); }
    if(a6==2&&b6.getBackground().equals(base.getBackground())){ b6.setBackground(ba.getBackground()); b8.setBackground(base.getBackground()); }
    if((a11==2||a12==2)&&(b11.getBackground().equals(base.getBackground())&&b12.getBackground().equals(base.getBackground()))){ b11.setBackground(ba.getBackground()); b12.setBackground(ba.getBackground()); b7.setBackground(base.getBackground());b8.setBackground(base.getBackground());}
    if((a3==2||a4==2)&&(b3.getBackground().equals(base.getBackground())&&b4.getBackground().equals(base.getBackground()))){ b3.setBackground(ba.getBackground()); b4.setBackground(ba.getBackground()); b7.setBackground(base.getBackground());b8.setBackground(base.getBackground());}
    }
    else if(((b9.getBackground()==b10.getBackground())&&(a9==1||a10==1||a9==2||a10==2))&&((b9.getBackground()!=base.getBackground())&&(b10.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b9.getBackground());b9.setBackground(Color.red);b10.setBackground(Color.red);}
    if(i==2){b9.setBackground(ba.getBackground());b10.setBackground(ba.getBackground());}
    if(a11==2&&b11.getBackground().equals(base.getBackground())){ b11.setBackground(ba.getBackground()); b9.setBackground(base.getBackground()); }
    if((a5==2||a6==2)&&(b5.getBackground().equals(base.getBackground())&&b6.getBackground().equals(base.getBackground()))){ b5.setBackground(ba.getBackground()); b6.setBackground(ba.getBackground()); b9.setBackground(base.getBackground());b10.setBackground(base.getBackground());}
    if((a13==2||a14==2)&&(b13.getBackground().equals(base.getBackground())&&b14.getBackground().equals(base.getBackground()))){ b13.setBackground(ba.getBackground()); b14.setBackground(ba.getBackground()); b9.setBackground(base.getBackground());b10.setBackground(base.getBackground());}
    }
    else if(((b10.getBackground()==b11.getBackground())&&(a10==1||a11==1||a10==2||a11==2))&&((b10.getBackground()!=base.getBackground())&&(b11.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b10.getBackground());b10.setBackground(Color.red);b11.setBackground(Color.red);}
    if(i==2){b10.setBackground(ba.getBackground());b11.setBackground(ba.getBackground());}
    if(a9==2&&b9.getBackground().equals(base.getBackground())){ b9.setBackground(ba.getBackground()); b11.setBackground(base.getBackground()); }
    if(a12==2&&b12.getBackground().equals(base.getBackground())){ b12.setBackground(ba.getBackground()); b10.setBackground(base.getBackground()); }
    if((a6==2||a7==2)&&(b6.getBackground().equals(base.getBackground())&&b7.getBackground().equals(base.getBackground()))){ b6.setBackground(ba.getBackground()); b7.setBackground(ba.getBackground()); b10.setBackground(base.getBackground());b11.setBackground(base.getBackground());}
    if((a14==2||a15==2)&&(b14.getBackground().equals(base.getBackground())&&b15.getBackground().equals(base.getBackground()))){ b14.setBackground(ba.getBackground()); b15.setBackground(ba.getBackground()); b10.setBackground(base.getBackground());b11.setBackground(base.getBackground());}
    }
    else if(((b11.getBackground()==b12.getBackground())&&(a11==1||a12==1||a11==2||a12==2))&&((b11.getBackground()!=base.getBackground())&&(b12.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b11.getBackground());b11.setBackground(Color.red);b12.setBackground(Color.red);}
    if(i==2){b11.setBackground(ba.getBackground());b12.setBackground(ba.getBackground());}
    if(a10==2&&b10.getBackground().equals(base.getBackground())){ b10.setBackground(ba.getBackground()); b12.setBackground(base.getBackground()); }
    if((a7==2||a8==2)&&(b7.getBackground().equals(base.getBackground())&&b8.getBackground().equals(base.getBackground()))){ b7.setBackground(ba.getBackground()); b8.setBackground(ba.getBackground()); b11.setBackground(base.getBackground());b12.setBackground(base.getBackground());}
    if((a15==2||a16==2)&&(b15.getBackground().equals(base.getBackground())&&b16.getBackground().equals(base.getBackground()))){ b15.setBackground(ba.getBackground()); b16.setBackground(ba.getBackground()); b11.setBackground(base.getBackground());b12.setBackground(base.getBackground());}
    }
    else if(((b13.getBackground()==b14.getBackground())&&(a13==1||a14==1||a13==2||a14==2))&&((b13.getBackground()!=base.getBackground())&&(b14.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b13.getBackground());b13.setBackground(Color.red);b14.setBackground(Color.red);}
    if(i==2){b13.setBackground(ba.getBackground());b14.setBackground(ba.getBackground());}
    if(a15==2&&b15.getBackground().equals(base.getBackground())){ b15.setBackground(ba.getBackground()); b13.setBackground(base.getBackground()); }
    if((a9==2||a10==2)&&(b9.getBackground().equals(base.getBackground())&&b10.getBackground().equals(base.getBackground()))){ b9.setBackground(ba.getBackground()); b10.setBackground(ba.getBackground()); b13.setBackground(base.getBackground());b14.setBackground(base.getBackground());}
    if((a17==2||a18==2)&&(b17.getBackground().equals(base.getBackground())&&b18.getBackground().equals(base.getBackground()))){ b17.setBackground(ba.getBackground()); b18.setBackground(ba.getBackground()); b13.setBackground(base.getBackground());b14.setBackground(base.getBackground());}
    }
    else if(((b14.getBackground()==b15.getBackground())&&(a14==1||a15==1||a14==2||a15==2))&&((b14.getBackground()!=base.getBackground())&&(b15.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b14.getBackground());b14.setBackground(Color.red);b15.setBackground(Color.red);}
    if(i==2){b14.setBackground(ba.getBackground());b15.setBackground(ba.getBackground());}
    if(a13==2&&b13.getBackground().equals(base.getBackground())){ b13.setBackground(ba.getBackground()); b15.setBackground(base.getBackground()); }
    if(a16==2&&b16.getBackground().equals(base.getBackground())){ b16.setBackground(ba.getBackground()); b14.setBackground(base.getBackground()); }
    if((a10==2||a11==2)&&(b10.getBackground().equals(base.getBackground())&&b11.getBackground().equals(base.getBackground()))){ b10.setBackground(ba.getBackground()); b11.setBackground(ba.getBackground()); b14.setBackground(base.getBackground());b15.setBackground(base.getBackground());}
    if((a18==2||a19==2)&&(b18.getBackground().equals(base.getBackground())&&b19.getBackground().equals(base.getBackground()))){ b18.setBackground(ba.getBackground()); b19.setBackground(ba.getBackground()); b14.setBackground(base.getBackground());b15.setBackground(base.getBackground());}
    }
    else if(((b15.getBackground()==b16.getBackground())&&(a15==1||a16==1||a15==2||a16==2))&&((b15.getBackground()!=base.getBackground())&&(b16.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b15.getBackground());b15.setBackground(Color.red);b16.setBackground(Color.red);}
    if(i==2){b15.setBackground(ba.getBackground());b16.setBackground(ba.getBackground());}
    if(a14==2&&b14.getBackground().equals(base.getBackground())){ b14.setBackground(ba.getBackground()); b16.setBackground(base.getBackground()); }
    if((a11==2||a12==2)&&(b11.getBackground().equals(base.getBackground())&&b12.getBackground().equals(base.getBackground()))){ b11.setBackground(ba.getBackground()); b12.setBackground(ba.getBackground()); b15.setBackground(base.getBackground());b16.setBackground(base.getBackground());}
    if((a19==2||a20==2)&&(b19.getBackground().equals(base.getBackground())&&b20.getBackground().equals(base.getBackground()))){ b19.setBackground(ba.getBackground()); b20.setBackground(ba.getBackground()); b15.setBackground(base.getBackground());b16.setBackground(base.getBackground());}
    }
    else if(((b17.getBackground()==b18.getBackground())&&(a17==1||a18==1||a17==2||a18==2))&&((b17.getBackground()!=base.getBackground())&&(b18.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b17.getBackground());b17.setBackground(Color.red);b18.setBackground(Color.red);}
    if(i==2){b17.setBackground(ba.getBackground());b18.setBackground(ba.getBackground());}
    if(a19==2&&b19.getBackground().equals(base.getBackground())){ b19.setBackground(ba.getBackground()); b17.setBackground(base.getBackground()); }
    if((a13==2||a14==2)&&(b13.getBackground().equals(base.getBackground())&&b14.getBackground().equals(base.getBackground()))){ b13.setBackground(ba.getBackground()); b14.setBackground(ba.getBackground()); b17.setBackground(base.getBackground());b18.setBackground(base.getBackground());}
    }
    else if(((b18.getBackground()==b19.getBackground())&&(a18==1||a19==1||a18==2||a19==2))&&((b18.getBackground()!=base.getBackground())&&(b19.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b18.getBackground());b18.setBackground(Color.red);b19.setBackground(Color.red);}
    if(i==2){b18.setBackground(ba.getBackground());b19.setBackground(ba.getBackground());}
    if(a17==2&&b17.getBackground().equals(base.getBackground())){ b17.setBackground(ba.getBackground()); b19.setBackground(base.getBackground()); }
    if(a20==2&&b20.getBackground().equals(base.getBackground())){ b20.setBackground(ba.getBackground()); b18.setBackground(base.getBackground()); }
    if((a14==2||a15==2)&&(b14.getBackground().equals(base.getBackground())&&b15.getBackground().equals(base.getBackground()))){ b14.setBackground(ba.getBackground()); b15.setBackground(ba.getBackground()); b18.setBackground(base.getBackground());b19.setBackground(base.getBackground());}
    }
    else if(((b19.getBackground()==b20.getBackground())&&(a19==1||a20==1||a19==2||a20==2))&&((b19.getBackground()!=base.getBackground())&&(b20.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b19.getBackground());b19.setBackground(Color.red);b20.setBackground(Color.red);}
    if(i==2){b19.setBackground(ba.getBackground());b20.setBackground(ba.getBackground());}
    if(a18==2&&b18.getBackground().equals(base.getBackground())){ b18.setBackground(ba.getBackground()); b20.setBackground(base.getBackground()); }
    if((a15==2||a16==2)&&(b15.getBackground().equals(base.getBackground())&&b16.getBackground().equals(base.getBackground()))){ b15.setBackground(ba.getBackground()); b16.setBackground(ba.getBackground()); b19.setBackground(base.getBackground());b20.setBackground(base.getBackground());}
    }


    //high


    else if(((b1.getBackground()==b5.getBackground())&&(a1==1||a5==1||a1==2||a5==2))&&((b1.getBackground()!=base.getBackground())&&(b5.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b1.getBackground());b1.setBackground(Color.red);b5.setBackground(Color.red);}
    if(i==2){b1.setBackground(ba.getBackground());b5.setBackground(ba.getBackground());}
    if(a9==2&&b9.getBackground().equals(base.getBackground())){b9.setBackground(ba.getBackground());b1.setBackground(base.getBackground());}
    if((a2==2||a6==2)&&(b2.getBackground().equals(base.getBackground())&&b6.getBackground().equals(base.getBackground()))){b2.setBackground(ba.getBackground());b6.setBackground(ba.getBackground());b1.setBackground(base.getBackground());b5.setBackground(base.getBackground());}
    }
    else if(((b5.getBackground()==b9.getBackground())&&(a5==1||a9==1||a5==2||a9==2))&&((b5.getBackground()!=base.getBackground())&&(b9.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b5.getBackground());b5.setBackground(Color.red);b9.setBackground(Color.red);}
    if(i==2){b5.setBackground(ba.getBackground());b9.setBackground(ba.getBackground());}
    if(a1==2&&b1.getBackground().equals(base.getBackground())){b1.setBackground(ba.getBackground());b9.setBackground(base.getBackground());}
    if(a13==2&&b13.getBackground().equals(base.getBackground())){b13.setBackground(ba.getBackground());b5.setBackground(base.getBackground());}
    if((a6==2||a10==2)&&(b6.getBackground().equals(base.getBackground())&&b10.getBackground().equals(base.getBackground()))){b6.setBackground(ba.getBackground());b10.setBackground(ba.getBackground());b5.setBackground(base.getBackground());b9.setBackground(base.getBackground());}
    }
    else if(((b9.getBackground()==b13.getBackground())&&(a9==1||a13==1||a9==2||a13==2))&&((b9.getBackground()!=base.getBackground())&&(b13.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b9.getBackground());b9.setBackground(Color.red);b13.setBackground(Color.red);}
    if(i==2){b9.setBackground(ba.getBackground());b13.setBackground(ba.getBackground());}
    if(a5==2&&b5.getBackground().equals(base.getBackground())){b5.setBackground(ba.getBackground());b13.setBackground(base.getBackground());}
    if(a17==2&&b17.getBackground().equals(base.getBackground())){b17.setBackground(ba.getBackground());b9.setBackground(base.getBackground());}
    if((a10==2||a14==2)&&(b10.getBackground().equals(base.getBackground())&&b14.getBackground().equals(base.getBackground()))){b10.setBackground(ba.getBackground());b14.setBackground(ba.getBackground());b9.setBackground(base.getBackground());b13.setBackground(base.getBackground());}
    }
    else if(((b13.getBackground()==b17.getBackground())&&(a13==1||a17==1||a13==2||a17==2))&&((b13.getBackground()!=base.getBackground())&&(b17.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b13.getBackground());b13.setBackground(Color.red);b17.setBackground(Color.red);}
    if(i==2){b13.setBackground(ba.getBackground());b17.setBackground(ba.getBackground());}
    if(a9==2&&b9.getBackground().equals(base.getBackground())){b9.setBackground(ba.getBackground());b17.setBackground(base.getBackground());}
    if((a14==2||a18==2)&&(b14.getBackground().equals(base.getBackground())&&b18.getBackground().equals(base.getBackground()))){b14.setBackground(ba.getBackground());b18.setBackground(ba.getBackground());b13.setBackground(base.getBackground());b17.setBackground(base.getBackground());}
    }
    else if(((b2.getBackground()==b6.getBackground())&&(a2==1||a6==1||a2==2||a6==2))&&((b2.getBackground()!=base.getBackground())&&(b6.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b2.getBackground());b2.setBackground(Color.red);b6.setBackground(Color.red);}
    if(i==2){b2.setBackground(ba.getBackground());b6.setBackground(ba.getBackground());}
    if(a10==2&&b10.getBackground().equals(base.getBackground())){b10.setBackground(ba.getBackground());b2.setBackground(base.getBackground());}
    if((a1==2||a5==2)&&(b1.getBackground().equals(base.getBackground())&&b5.getBackground().equals(base.getBackground()))){b1.setBackground(ba.getBackground());b5.setBackground(ba.getBackground());b2.setBackground(base.getBackground());b6.setBackground(base.getBackground());}
    if((a3==2||a7==2)&&(b3.getBackground().equals(base.getBackground())&&b7.getBackground().equals(base.getBackground()))){b3.setBackground(ba.getBackground());b7.setBackground(ba.getBackground());b2.setBackground(base.getBackground());b6.setBackground(base.getBackground());}
    }
    else if(((b6.getBackground()==b10.getBackground())&&(a6==1||a10==1||a6==2||a10==2))&&((b6.getBackground()!=base.getBackground())&&(b10.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b6.getBackground());b6.setBackground(Color.red);b10.setBackground(Color.red);}
    if(i==2){b6.setBackground(ba.getBackground());b10.setBackground(ba.getBackground());}
    if(a2==2&&b2.getBackground().equals(base.getBackground())){b2.setBackground(ba.getBackground());b10.setBackground(base.getBackground());}
    if(a14==2&&b14.getBackground().equals(base.getBackground())){b14.setBackground(ba.getBackground());b6.setBackground(base.getBackground());}
    if((a5==2||a9==2)&&(b5.getBackground().equals(base.getBackground())&&b9.getBackground().equals(base.getBackground()))){b5.setBackground(ba.getBackground());b9.setBackground(ba.getBackground());b6.setBackground(base.getBackground());b10.setBackground(base.getBackground());}
    if((a7==2||a11==2)&&(b7.getBackground().equals(base.getBackground())&&b11.getBackground().equals(base.getBackground()))){b7.setBackground(ba.getBackground());b11.setBackground(ba.getBackground());b6.setBackground(base.getBackground());b10.setBackground(base.getBackground());}
    }
    else if(((b10.getBackground()==b14.getBackground())&&(a10==1||a14==1||a10==2||a14==2))&&((b10.getBackground()!=base.getBackground())&&(b14.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b10.getBackground());b10.setBackground(Color.red);b14.setBackground(Color.red);}
    if(i==2){b10.setBackground(ba.getBackground());b14.setBackground(ba.getBackground());}
    if(a6==2&&b6.getBackground().equals(base.getBackground())){b6.setBackground(ba.getBackground());b14.setBackground(base.getBackground());}
    if(a18==2&&b18.getBackground().equals(base.getBackground())){b18.setBackground(ba.getBackground());b10.setBackground(base.getBackground());}
    if((a9==2||a13==2)&&(b9.getBackground().equals(base.getBackground())&&b13.getBackground().equals(base.getBackground()))){b9.setBackground(ba.getBackground());b13.setBackground(ba.getBackground());b10.setBackground(base.getBackground());b14.setBackground(base.getBackground());}
    if((a11==2||a15==2)&&(b11.getBackground().equals(base.getBackground())&&b15.getBackground().equals(base.getBackground()))){b11.setBackground(ba.getBackground());b15.setBackground(ba.getBackground());b10.setBackground(base.getBackground());b14.setBackground(base.getBackground());}
    }
    else if(((b14.getBackground()==b18.getBackground())&&(a14==1||a18==1||a14==2||a18==2))&&((b14.getBackground()!=base.getBackground())&&(b18.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b14.getBackground());b14.setBackground(Color.red);b18.setBackground(Color.red);}
    if(i==2){b14.setBackground(ba.getBackground());b18.setBackground(ba.getBackground());}
    if(a10==2&&b10.getBackground().equals(base.getBackground())){b10.setBackground(ba.getBackground());b18.setBackground(base.getBackground());}
    if((a13==2||a17==2)&&(b13.getBackground().equals(base.getBackground())&&b17.getBackground().equals(base.getBackground()))){b13.setBackground(ba.getBackground());b17.setBackground(ba.getBackground());b14.setBackground(base.getBackground());b18.setBackground(base.getBackground());}
    if((a15==2||a19==2)&&(b15.getBackground().equals(base.getBackground())&&b19.getBackground().equals(base.getBackground()))){b15.setBackground(ba.getBackground());b19.setBackground(ba.getBackground());b14.setBackground(base.getBackground());b18.setBackground(base.getBackground());}
    }
    else if(((b3.getBackground()==b7.getBackground())&&(a3==1||a7==1||a3==2||a7==2))&&((b3.getBackground()!=base.getBackground())&&(b7.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b3.getBackground());b3.setBackground(Color.red);b7.setBackground(Color.red);}
    if(i==2){b3.setBackground(ba.getBackground());b7.setBackground(ba.getBackground());}
    if(a11==2&&b11.getBackground().equals(base.getBackground())){b11.setBackground(ba.getBackground());b3.setBackground(base.getBackground());}
    if((a2==2||a6==2)&&(b2.getBackground().equals(base.getBackground())&&b6.getBackground().equals(base.getBackground()))){b2.setBackground(ba.getBackground());b6.setBackground(ba.getBackground());b3.setBackground(base.getBackground());b7.setBackground(base.getBackground());}
    if((a4==2||a8==2)&&(b4.getBackground().equals(base.getBackground())&&b8.getBackground().equals(base.getBackground()))){b4.setBackground(ba.getBackground());b8.setBackground(ba.getBackground());b3.setBackground(base.getBackground());b7.setBackground(base.getBackground());}
    }
    else if(((b7.getBackground()==b11.getBackground())&&(a7==1||a11==1||a7==2||a11==2))&&((b7.getBackground()!=base.getBackground())&&(b11.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b7.getBackground());b7.setBackground(Color.red);b11.setBackground(Color.red);}
    if(i==2){b7.setBackground(ba.getBackground());b11.setBackground(ba.getBackground());}
    if(a3==2&&b3.getBackground().equals(base.getBackground())){b3.setBackground(ba.getBackground());b11.setBackground(base.getBackground());}
    if(a15==2&&b15.getBackground().equals(base.getBackground())){b15.setBackground(ba.getBackground());b7.setBackground(base.getBackground());}
    if((a6==2||a10==2)&&(b6.getBackground().equals(base.getBackground())&&b10.getBackground().equals(base.getBackground()))){b6.setBackground(ba.getBackground());b10.setBackground(ba.getBackground());b7.setBackground(base.getBackground());b11.setBackground(base.getBackground());}
    if((a8==2||a12==2)&&(b8.getBackground().equals(base.getBackground())&&b12.getBackground().equals(base.getBackground()))){b8.setBackground(ba.getBackground());b12.setBackground(ba.getBackground());b7.setBackground(base.getBackground());b11.setBackground(base.getBackground());}
    }
    else if(((b11.getBackground()==b15.getBackground())&&(a11==1||a15==1||a11==2||a15==2))&&((b11.getBackground()!=base.getBackground())&&(b15.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b11.getBackground());b11.setBackground(Color.red);b15.setBackground(Color.red);}
    if(i==2){b11.setBackground(ba.getBackground());b15.setBackground(ba.getBackground());}
    if(a19==2&&b19.getBackground().equals(base.getBackground())){b19.setBackground(ba.getBackground());b11.setBackground(base.getBackground());}
    if(a7==2&&b7.getBackground().equals(base.getBackground())){b7.setBackground(ba.getBackground());b15.setBackground(base.getBackground());}
    if((a10==2||a14==2)&&(b10.getBackground().equals(base.getBackground())&&b14.getBackground().equals(base.getBackground()))){b10.setBackground(ba.getBackground());b14.setBackground(ba.getBackground());b11.setBackground(base.getBackground());b15.setBackground(base.getBackground());}
    if((a12==2||a16==2)&&(b12.getBackground().equals(base.getBackground())&&b16.getBackground().equals(base.getBackground()))){b12.setBackground(ba.getBackground());b16.setBackground(ba.getBackground());b11.setBackground(base.getBackground());b15.setBackground(base.getBackground());}
    }
    else if(((b15.getBackground()==b19.getBackground())&&(a15==1||a19==1||a15==2||a19==2))&&((b15.getBackground()!=base.getBackground())&&(b19.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b15.getBackground());b15.setBackground(Color.red);b19.setBackground(Color.red);}
    if(i==2){b15.setBackground(ba.getBackground());b19.setBackground(ba.getBackground());}
    if(a11==2&&b11.getBackground().equals(base.getBackground())){b11.setBackground(ba.getBackground());b19.setBackground(base.getBackground());}
    if((a14==2||a18==2)&&(b14.getBackground().equals(base.getBackground())&&b18.getBackground().equals(base.getBackground()))){b14.setBackground(ba.getBackground());b18.setBackground(ba.getBackground());b15.setBackground(base.getBackground());b19.setBackground(base.getBackground());}
    if((a16==2||a20==2)&&(b16.getBackground().equals(base.getBackground())&&b20.getBackground().equals(base.getBackground()))){b16.setBackground(ba.getBackground());b20.setBackground(ba.getBackground());b15.setBackground(base.getBackground());b19.setBackground(base.getBackground());}
    }
    else if(((b4.getBackground()==b8.getBackground())&&(a4==1||a8==1||a4==2||a8==2))&&((b4.getBackground()!=base.getBackground())&&(b8.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b4.getBackground());b4.setBackground(Color.red);b8.setBackground(Color.red);}
    if(i==2){b4.setBackground(ba.getBackground());b8.setBackground(ba.getBackground());}
    if(a12==2&&b12.getBackground().equals(base.getBackground())){b12.setBackground(ba.getBackground());b4.setBackground(base.getBackground());}
    if((a3==2||a7==2)&&(b7.getBackground().equals(base.getBackground())&&b3.getBackground().equals(base.getBackground()))){b7.setBackground(ba.getBackground());b3.setBackground(ba.getBackground());b4.setBackground(base.getBackground());b8.setBackground(base.getBackground());}
    }
    else if(((b8.getBackground()==b12.getBackground())&&(a8==1||a12==1||a8==2||a12==2))&&((b8.getBackground()!=base.getBackground())&&(b12.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b8.getBackground());b8.setBackground(Color.red);b12.setBackground(Color.red);}
    if(i==2){b8.setBackground(ba.getBackground());b12.setBackground(ba.getBackground());}
    if(a4==2&&b4.getBackground().equals(base.getBackground())){b4.setBackground(ba.getBackground());b12.setBackground(base.getBackground());}
    if(a16==2&&b16.getBackground().equals(base.getBackground())){b16.setBackground(ba.getBackground());b8.setBackground(base.getBackground());}
    if((a7==2||a11==2)&&(b7.getBackground().equals(base.getBackground())&&b11.getBackground().equals(base.getBackground()))){b7.setBackground(ba.getBackground());b11.setBackground(ba.getBackground());b8.setBackground(base.getBackground());b12.setBackground(base.getBackground());}
    }
    else if(((b12.getBackground()==b16.getBackground())&&(a12==1||a16==1||a12==2||a16==2))&&((b12.getBackground()!=base.getBackground())&&(b16.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b12.getBackground());b12.setBackground(Color.red);b16.setBackground(Color.red);}
    if(i==2){b12.setBackground(ba.getBackground());b16.setBackground(ba.getBackground());}
    if(a8==2&&b8.getBackground().equals(base.getBackground())){b8.setBackground(ba.getBackground());b16.setBackground(base.getBackground());}
    if(a20==2&&b20.getBackground().equals(base.getBackground())){b20.setBackground(ba.getBackground());b12.setBackground(base.getBackground());}
    if((a11==2||a15==2)&&(b11.getBackground().equals(base.getBackground())&&b15.getBackground().equals(base.getBackground()))){b11.setBackground(ba.getBackground());b15.setBackground(ba.getBackground());b12.setBackground(base.getBackground());b16.setBackground(base.getBackground());}
    }
    else if(((b16.getBackground()==b20.getBackground())&&(a16==1||a20==1||a16==2||a20==2))&&((b16.getBackground()!=base.getBackground())&&(b20.getBackground()!=base.getBackground()))){
    if(i==1){ba.setBackground(b16.getBackground());b16.setBackground(Color.red);b20.setBackground(Color.red);}
    if(i==2){b16.setBackground(ba.getBackground());b20.setBackground(ba.getBackground());}
    if(a12==2&&b12.getBackground().equals(base.getBackground())){b12.setBackground(ba.getBackground());b20.setBackground(base.getBackground());}
    if((a15==2||a19==2)&&(b15.getBackground().equals(base.getBackground())&&b19.getBackground().equals(base.getBackground()))){b15.setBackground(ba.getBackground());b19.setBackground(ba.getBackground());b16.setBackground(base.getBackground());b20.setBackground(base.getBackground());}
    }
    else if ((a1 == 1 || a1 == 2)&&b1.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b1.getBackground()); b1.setBackground(Color.red);}
    if (i == 2) {b1.setBackground(ba.getBackground());}
    if (a2 == 2 && b2.getBackground().equals(base.getBackground())) {b2.setBackground(ba.getBackground());b1.setBackground(base.getBackground());}
    if (a5 == 2 && b5.getBackground().equals(base.getBackground())) {b5.setBackground(ba.getBackground());b1.setBackground(base.getBackground());}
    }
    else if ((a2 == 1 || a2 == 2)&&b2.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b2.getBackground()); b2.setBackground(Color.red);}
    if (i == 2) {b2.setBackground(ba.getBackground());}
    if (a1 == 2 && b1.getBackground().equals(base.getBackground())) {b1.setBackground(ba.getBackground());b2.setBackground(base.getBackground());}
    if (a3 == 2 && b3.getBackground().equals(base.getBackground())) {b3.setBackground(ba.getBackground());b2.setBackground(base.getBackground());}
    if (a6 == 2 && b6.getBackground().equals(base.getBackground())) {b6.setBackground(ba.getBackground());b2.setBackground(base.getBackground());}
    }
    else if ((a3 == 1 || a3 == 2)&&b3.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b3.getBackground()); b3.setBackground(Color.red);}
    if (i == 2) {b3.setBackground(ba.getBackground());}
    if (a2 == 2 && b2.getBackground().equals(base.getBackground())) {b2.setBackground(ba.getBackground());b3.setBackground(base.getBackground());}
    if (a4 == 2 && b4.getBackground().equals(base.getBackground())) {b4.setBackground(ba.getBackground());b3.setBackground(base.getBackground());}
    if (a7 == 2 && b7.getBackground().equals(base.getBackground())) {b7.setBackground(ba.getBackground());b3.setBackground(base.getBackground());
    }
    }
    else if ((a4 == 1 || a4 == 2)&&b4.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b4.getBackground()); b4.setBackground(Color.red);}
    if (i == 2) {b4.setBackground(ba.getBackground());}
    if (a3 == 2 && b3.getBackground().equals(base.getBackground())) {b3.setBackground(ba.getBackground());b4.setBackground(base.getBackground());}
    if (a8 == 2 && b8.getBackground().equals(base.getBackground())) {b8.setBackground(ba.getBackground());b4.setBackground(base.getBackground());}
    }
    else if ((a5 == 1 || a5 == 2)&&b5.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b5.getBackground()); b5.setBackground(Color.red);}
    if (i == 2) {b5.setBackground(ba.getBackground());}
    if (a1 == 2 && b1.getBackground().equals(base.getBackground())) {b1.setBackground(ba.getBackground());b5.setBackground(base.getBackground());}
    if (a6 == 2 && b6.getBackground().equals(base.getBackground())) {b6.setBackground(ba.getBackground());b5.setBackground(base.getBackground());}
    if (a9 == 2 && b9.getBackground().equals(base.getBackground())) {b9.setBackground(ba.getBackground());b5.setBackground(base.getBackground());}
    }
    else if ((a6 == 1 || a6 == 2)&&b6.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b6.getBackground()); b6.setBackground(Color.red);}
    if (i == 2) {b6.setBackground(ba.getBackground());}
    if (a2 == 2 && b2.getBackground().equals(base.getBackground())) {b2.setBackground(ba.getBackground());b6.setBackground(base.getBackground());}
    if (a5 == 2 && b5.getBackground().equals(base.getBackground())) {b5.setBackground(ba.getBackground());b6.setBackground(base.getBackground());}
    if (a7 == 2 && b7.getBackground().equals(base.getBackground())) {b7.setBackground(ba.getBackground());b6.setBackground(base.getBackground());}
    if (a10 == 2 && b10.getBackground().equals(base.getBackground())) {b10.setBackground(ba.getBackground());b6.setBackground(base.getBackground());}
    }
    else if ((a7 == 1 || a7 == 2)&&b7.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b7.getBackground()); b7.setBackground(Color.red);}
    if (i == 2) {b7.setBackground(ba.getBackground());}
    if (a3 == 2 && b3.getBackground().equals(base.getBackground())) {b3.setBackground(ba.getBackground());b7.setBackground(base.getBackground());}
    if (a6 == 2 && b6.getBackground().equals(base.getBackground())) {b6.setBackground(ba.getBackground());b7.setBackground(base.getBackground());}
    if (a8 == 2 && b8.getBackground().equals(base.getBackground())) {b8.setBackground(ba.getBackground());b7.setBackground(base.getBackground());}
    if (a11 == 2 && b11.getBackground().equals(base.getBackground())) {b11.setBackground(ba.getBackground());b7.setBackground(base.getBackground());}
    }
    else if ((a8 == 1 || a8 == 2)&&b8.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b8.getBackground()); b8.setBackground(Color.red);}
    if (i == 2) {b8.setBackground(ba.getBackground());}
    if (a4 == 2 && b4.getBackground().equals(base.getBackground())) {b4.setBackground(ba.getBackground());b8.setBackground(base.getBackground());}
    if (a7 == 2 && b7.getBackground().equals(base.getBackground())) {b7.setBackground(ba.getBackground());b8.setBackground(base.getBackground());}
    if (a12 == 2 && b12.getBackground().equals(base.getBackground())) {b12.setBackground(ba.getBackground());b8.setBackground(base.getBackground());}
    }
    else if ((a9 == 1 || a9 == 2)&&b9.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b9.getBackground()); b9.setBackground(Color.red);}
    if (i == 2) {b9.setBackground(ba.getBackground());}
    if (a5 == 2 && b5.getBackground().equals(base.getBackground())) {b5.setBackground(ba.getBackground());b9.setBackground(base.getBackground());}
    if (a10 == 2 && b10.getBackground().equals(base.getBackground())) {b10.setBackground(ba.getBackground());b9.setBackground(base.getBackground());}
    if (a13 == 2 && b13.getBackground().equals(base.getBackground())) {b13.setBackground(ba.getBackground());b9.setBackground(base.getBackground());}
    }
    else if ((a10 == 1 || a10 == 2)&&b10.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b10.getBackground()); b10.setBackground(Color.red);}
    if (i == 2) {b10.setBackground(ba.getBackground());}
    if (a6 == 2 && b6.getBackground().equals(base.getBackground())) {b6.setBackground(ba.getBackground());b10.setBackground(base.getBackground());}
    if (a9 == 2 && b9.getBackground().equals(base.getBackground())) {b9.setBackground(ba.getBackground());b10.setBackground(base.getBackground());}
    if (a11 == 2 && b11.getBackground().equals(base.getBackground())) {b11.setBackground(ba.getBackground());b10.setBackground(base.getBackground());}
    if (a14 == 2 && b14.getBackground().equals(base.getBackground())) {b14.setBackground(ba.getBackground());b10.setBackground(base.getBackground());}
    }
    else if ((a11 == 1 || a11 == 2)&&b11.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b11.getBackground()); b11.setBackground(Color.red);}
    if (i == 2) {b11.setBackground(ba.getBackground());}
    if (a7 == 2 && b7.getBackground().equals(base.getBackground())) {b7.setBackground(ba.getBackground());b11.setBackground(base.getBackground());}
    if (a10 == 2 && b10.getBackground().equals(base.getBackground())) {b10.setBackground(ba.getBackground());b11.setBackground(base.getBackground());}
    if (a12 == 2 && b12.getBackground().equals(base.getBackground())) {b12.setBackground(ba.getBackground());b11.setBackground(base.getBackground());}
    if (a15 == 2 && b15.getBackground().equals(base.getBackground())) {b15.setBackground(ba.getBackground());b11.setBackground(base.getBackground());}
    }
    else if ((a12 == 1 || a12 == 2)&&b12.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b12.getBackground()); b12.setBackground(Color.red);}
    if (i == 2) {b12.setBackground(ba.getBackground());}
    if (a8 == 2 && b8.getBackground().equals(base.getBackground())) {b8.setBackground(ba.getBackground());b12.setBackground(base.getBackground());}
    if (a11 == 2 && b11.getBackground().equals(base.getBackground())) {b11.setBackground(ba.getBackground());b12.setBackground(base.getBackground());}
    if (a16 == 2 && b16.getBackground().equals(base.getBackground())) {b16.setBackground(ba.getBackground());b12.setBackground(base.getBackground());}
    }
    else if ((a13 == 1 || a13 == 2)&&b13.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b13.getBackground()); b13.setBackground(Color.red);}
    if (i == 2) {b13.setBackground(ba.getBackground());}
    if (a9 == 2 && b9.getBackground().equals(base.getBackground())) {b9.setBackground(ba.getBackground());b13.setBackground(base.getBackground());}
    if (a14 == 2 && b14.getBackground().equals(base.getBackground())) {b14.setBackground(ba.getBackground());b13.setBackground(base.getBackground());}
    if (a17 == 2 && b17.getBackground().equals(base.getBackground())) {b17.setBackground(ba.getBackground());b13.setBackground(base.getBackground());}
    }
    else if ((a14 == 1 || a14 == 2)&&b14.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b14.getBackground()); b14.setBackground(Color.red);}
    if (i == 2) {b14.setBackground(ba.getBackground());}
    if (a10 == 2 && b10.getBackground().equals(base.getBackground())) {b10.setBackground(ba.getBackground());b14.setBackground(base.getBackground());}
    if (a13 == 2 && b13.getBackground().equals(base.getBackground())) {b13.setBackground(ba.getBackground());b14.setBackground(base.getBackground());}
    if (a15 == 2 && b15.getBackground().equals(base.getBackground())) {b15.setBackground(ba.getBackground());b14.setBackground(base.getBackground());}
    if (a18 == 2 && b18.getBackground().equals(base.getBackground())) {b18.setBackground(ba.getBackground());b14.setBackground(base.getBackground());}
    }
    else if ((a15 == 1 || a15 == 2)&&b15.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b15.getBackground()); b15.setBackground(Color.red);}
    if (i == 2) {b15.setBackground(ba.getBackground());}
    if (a11 == 2 && b11.getBackground().equals(base.getBackground())) {b11.setBackground(ba.getBackground());b15.setBackground(base.getBackground());}
    if (a14 == 2 && b14.getBackground().equals(base.getBackground())) {b14.setBackground(ba.getBackground());b15.setBackground(base.getBackground());}
    if (a16 == 2 && b16.getBackground().equals(base.getBackground())) {b16.setBackground(ba.getBackground());b15.setBackground(base.getBackground());}
    if (a19 == 2 && b19.getBackground().equals(base.getBackground())) {b19.setBackground(ba.getBackground());b15.setBackground(base.getBackground());}
    }
    else if ((a16 == 1 || a16 == 2)&&b16.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b16.getBackground()); b16.setBackground(Color.red);}
    if (i == 2) {b16.setBackground(ba.getBackground());}
    if (a12 == 2 && b12.getBackground().equals(base.getBackground())) {b12.setBackground(ba.getBackground());b16.setBackground(base.getBackground());}
    if (a15 == 2 && b15.getBackground().equals(base.getBackground())) {b15.setBackground(ba.getBackground());b16.setBackground(base.getBackground());}
    if (a20 == 2 && b20.getBackground().equals(base.getBackground())) {b20.setBackground(ba.getBackground());b16.setBackground(base.getBackground());}
    }
    else if ((a17 == 1 || a17 == 2)&&b17.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b17.getBackground()); b17.setBackground(Color.red);}
    if (i == 2) {b17.setBackground(ba.getBackground());}
    if (a13 == 2 && b13.getBackground().equals(base.getBackground())) {b13.setBackground(ba.getBackground());b17.setBackground(base.getBackground());}
    if (a18 == 2 && b18.getBackground().equals(base.getBackground())) {b18.setBackground(ba.getBackground());b17.setBackground(base.getBackground());}
    }
    else if ((a18 == 1 || a18 == 2)&&b18.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b18.getBackground()); b18.setBackground(Color.red);}
    if (i == 2) {b18.setBackground(ba.getBackground());}
    if (a14 == 2 && b14.getBackground().equals(base.getBackground())) {b14.setBackground(ba.getBackground());b18.setBackground(base.getBackground());}
    if (a17 == 2 && b17.getBackground().equals(base.getBackground())) {b17.setBackground(ba.getBackground());b18.setBackground(base.getBackground());}
    if (a19 == 2 && b19.getBackground().equals(base.getBackground())) {b19.setBackground(ba.getBackground());b18.setBackground(base.getBackground());}
    }
    else if ((a19 == 1 || a19 == 2)&&b19.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b19.getBackground()); b19.setBackground(Color.red);}
    if (i == 2) {b19.setBackground(ba.getBackground());}
    if (a15 == 2 && b15.getBackground().equals(base.getBackground())) {b15.setBackground(ba.getBackground());b19.setBackground(base.getBackground());}
    if (a18 == 2 && b18.getBackground().equals(base.getBackground())) {b18.setBackground(ba.getBackground());b19.setBackground(base.getBackground());}
    if (a20 == 2 && b20.getBackground().equals(base.getBackground())) {b20.setBackground(ba.getBackground());b19.setBackground(base.getBackground());}
    }
    else if ((a20 == 1 || a20 == 2)&&b20.getBackground()!=base.getBackground()) {
    if (i == 1) {ba.setBackground(b20.getBackground()); b20.setBackground(Color.red);}
    if (i == 2) {b20.setBackground(ba.getBackground());}
    if (a16 == 2 && b16.getBackground().equals(base.getBackground())) {b16.setBackground(ba.getBackground());b20.setBackground(base.getBackground());}
    if (a19 == 2 && b19.getBackground().equals(base.getBackground())) {b19.setBackground(ba.getBackground());b20.setBackground(base.getBackground());}
    }
    if(e.getSource()!=next){++i;}
}
}