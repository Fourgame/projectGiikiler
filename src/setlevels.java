import java.awt.*;
import java.awt.Color;
import java.time.Year;
public class setlevels extends game {
    game hi = new game();
    public setlevels(){
        this(1,true);
    }

    public setlevels(int a,boolean b){
        Start.setText("level "+a);
            switch (a) {
                case 1:
                if(b){
                    setBackground(null);
                b1.setBackground(Color.decode("#d81b60") ); b2.setBackground(Color.decode("#9c27b0")); b3.setBackground(Color.decode("#673ab7") ); b4.setBackground(Color.decode("#3949ab"));
                b5.setBackground(Color.blue); b6.setBackground(Color.blue); b7.setBackground(Color.orange ); b8.setBackground(Color.decode("#4e6cef")); 
                b9.setBackground(Color.blue); b10.setBackground(Color.blue); b11.setBackground(Color.orange); b12.setBackground(Color.decode("#039be5"));
                b13.setBackground(Color.white); b14.setBackground(Color.white); b15.setBackground(Color.decode("#00acc1") ); b16.setBackground(Color.decode("#00897b"));
                b17.setBackground(Color.decode("#0a8f08")); b18.setBackground(Color.decode("#c0ca33")); b19.setBackground(Color.decode("#7cb342")); b20.setBackground(Color.decode("#d4e157"));
                    next.setBackground(Color.blue);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.black);
                    finish.setBackground(Color.black);
                    finish2.setBackground(Color.black);
                }else{
                    setBackground(Color.black);
                    b1.setBackground(Color.decode("#d81b60") ); b2.setBackground(Color.decode("#9c27b0")); b3.setBackground(Color.decode("#673ab7") ); b4.setBackground(Color.decode("#3949ab"));
                    b5.setBackground(Color.blue); b6.setBackground(Color.blue); b7.setBackground(Color.orange ); b8.setBackground(Color.decode("#4e6cef")); 
                    b9.setBackground(Color.blue); b10.setBackground(Color.blue); b11.setBackground(Color.orange); b12.setBackground(Color.decode("#039be5"));
                    b13.setBackground(Color.lightGray); b14.setBackground(Color.lightGray); b15.setBackground(Color.decode("#00acc1") ); b16.setBackground(Color.decode("#00897b"));
                    b17.setBackground(Color.decode("#0a8f08")); b18.setBackground(Color.decode("#c0ca33")); b19.setBackground(Color.decode("#7cb342")); b20.setBackground(Color.decode("#d4e157"));
                    next.setBackground(Color.darkGray);
                    next.setForeground(Color.white);
                    base.setBackground(Color.lightGray);
                    Start.setForeground(Color.white);
                    finish.setBackground(Color.red);
                    finish2.setBackground(Color.red);
                    }
                    break;
                case 2:
                if(b){
                    setBackground(null);
                b1.setBackground(Color.decode("#d81b60") ); b2.setBackground(Color.blue); b3.setBackground(Color.blue ); b4.setBackground(Color.decode("#3949ab"));
                b5.setBackground(Color.decode("#673ab7") ); b6.setBackground(Color.blue); b7.setBackground(Color.blue ); b8.setBackground(Color.decode("#4e6cef")); 
                b9.setBackground(Color.decode("#0a8f08")); b10.setBackground(Color.decode("#00eecd")); b11.setBackground(Color.white); b12.setBackground(Color.decode("#039be5"));
                b13.setBackground(Color.decode("#7cb342")); b14.setBackground(Color.orange); b15.setBackground(Color.decode("#00acc1") ); b16.setBackground(Color.decode("#00897b"));
                b17.setBackground(Color.white); b18.setBackground(Color.orange); b19.setBackground(Color.decode("#c0ca33")); b20.setBackground(Color.decode("#d4e157"));
                    next.setBackground(Color.blue);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.black);
                    finish.setBackground(Color.black);
                    finish2.setBackground(Color.black);
                }else{
                    setBackground(Color.black);
                    b1.setBackground(Color.decode("#d81b60") ); b2.setBackground(Color.blue); b3.setBackground(Color.blue ); b4.setBackground(Color.decode("#3949ab"));
                b5.setBackground(Color.decode("#673ab7") ); b6.setBackground(Color.blue); b7.setBackground(Color.blue ); b8.setBackground(Color.decode("#4e6cef")); 
                b9.setBackground(Color.decode("#0a8f08")); b10.setBackground(Color.decode("#00eecd")); b11.setBackground(Color.white); b12.setBackground(Color.decode("#039be5"));
                b13.setBackground(Color.decode("#7cb342")); b14.setBackground(Color.orange); b15.setBackground(Color.decode("#00acc1") ); b16.setBackground(Color.decode("#00897b"));
                b17.setBackground(Color.white); b18.setBackground(Color.orange); b19.setBackground(Color.decode("#c0ca33")); b20.setBackground(Color.decode("#d4e157"));
                    next.setBackground(Color.darkGray);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.white);
                    finish.setBackground(Color.red);
                    finish2.setBackground(Color.red);
                    }
                    break;
                case 3:
                if(b){
                    setBackground(null);
                b1.setBackground(Color.decode("#673ab7")); b2.setBackground(Color.white); b3.setBackground(Color.decode("#0a8f08") ); b4.setBackground(Color.decode("#00eecd"));
                b5.setBackground(Color.decode("#039be5") ); b6.setBackground(Color.decode("#3949ab")); b7.setBackground(Color.white ); b8.setBackground(Color.decode("#7cb342")); 
                b9.setBackground(Color.blue); b10.setBackground(Color.blue); b11.setBackground(Color.decode("#c0ca33")); b12.setBackground(Color.decode("#4e6cef"));
                b13.setBackground(Color.blue); b14.setBackground(Color.blue); b15.setBackground(Color.decode("#00acc1") ); b16.setBackground(Color.decode("#00897b"));
                b17.setBackground(Color.decode("#d4e157")); b18.setBackground(Color.decode("#d81b60")); b19.setBackground(Color.orange); b20.setBackground(Color.orange);
                    next.setBackground(Color.blue);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.black);
                    finish.setBackground(Color.black);
                    finish2.setBackground(Color.black);
                }else{
                    setBackground(Color.black);
                    b1.setBackground(Color.decode("#673ab7")); b2.setBackground(Color.white); b3.setBackground(Color.decode("#0a8f08") ); b4.setBackground(Color.decode("#00eecd"));
                    b5.setBackground(Color.decode("#039be5") ); b6.setBackground(Color.decode("#3949ab")); b7.setBackground(Color.white ); b8.setBackground(Color.decode("#7cb342")); 
                    b9.setBackground(Color.blue); b10.setBackground(Color.blue); b11.setBackground(Color.decode("#c0ca33")); b12.setBackground(Color.decode("#4e6cef"));
                    b13.setBackground(Color.blue); b14.setBackground(Color.blue); b15.setBackground(Color.decode("#00acc1") ); b16.setBackground(Color.decode("#00897b"));
                    b17.setBackground(Color.decode("#d4e157")); b18.setBackground(Color.decode("#d81b60")); b19.setBackground(Color.orange); b20.setBackground(Color.orange);
                    next.setBackground(Color.darkGray);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.white);
                    finish.setBackground(Color.red);
                    finish2.setBackground(Color.red);
                    }
                    break;
                case 4:
                if(b){
                    setBackground(null);
                    b1.setBackground(Color.decode("#673ab7")); b2.setBackground(Color.blue); b3.setBackground(Color.blue); b4.setBackground(Color.decode("#00eecd"));
                b5.setBackground(Color.white ); b6.setBackground(Color.blue); b7.setBackground(Color.blue); b8.setBackground(Color.white); 
                b9.setBackground(Color.decode("#039be5")); b10.setBackground(Color.decode("#3949ab")); b11.setBackground(Color.decode("#7cb342")); b12.setBackground(Color.decode("#4e6cef"));
                b13.setBackground(Color.decode("#d4e157")); b14.setBackground(Color.orange); b15.setBackground(Color.orange); b16.setBackground(Color.decode("#00897b"));
                b17.setBackground(Color.decode("#00acc1")); b18.setBackground(Color.decode("#d81b60")); b19.setBackground(Color.decode("#0a8f08")); b20.setBackground(Color.decode("#c0ca33"));
                    next.setBackground(Color.blue);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.black);
                    finish.setBackground(Color.black);
                    finish2.setBackground(Color.black);
                }else{
                    setBackground(Color.black);
                    b1.setBackground(Color.decode("#673ab7")); b2.setBackground(Color.blue); b3.setBackground(Color.blue); b4.setBackground(Color.decode("#00eecd"));
                b5.setBackground(Color.white ); b6.setBackground(Color.blue); b7.setBackground(Color.blue); b8.setBackground(Color.white); 
                b9.setBackground(Color.decode("#039be5")); b10.setBackground(Color.decode("#3949ab")); b11.setBackground(Color.decode("#7cb342")); b12.setBackground(Color.decode("#4e6cef"));
                b13.setBackground(Color.decode("#d4e157")); b14.setBackground(Color.orange); b15.setBackground(Color.orange); b16.setBackground(Color.decode("#00897b"));
                b17.setBackground(Color.decode("#00acc1")); b18.setBackground(Color.decode("#d81b60")); b19.setBackground(Color.decode("#0a8f08")); b20.setBackground(Color.decode("#c0ca33"));
                    next.setBackground(Color.darkGray);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.white);
                    finish.setBackground(Color.red);
                    finish2.setBackground(Color.red);
                    }
                    break;

                case 5:
                
                if(b){
                    setBackground(null);
                b1.setBackground(Color.blue); b2.setBackground(Color.blue); b3.setBackground(Color.pink); b4.setBackground(Color.cyan);
                b5.setBackground(Color.blue ); b6.setBackground(Color.blue); b7.setBackground(Color.decode("#0a8f08")); b8.setBackground(Color.cyan); 
                b9.setBackground(Color.decode("#00897b")); b10.setBackground(Color.decode("#7cb342")); b11.setBackground(Color.magenta); b12.setBackground(Color.orange);
                b13.setBackground(Color.decode("#4e6cef")); b14.setBackground(Color.decode("#c0ca33")); b15.setBackground(Color.magenta); b16.setBackground(Color.orange);
                b17.setBackground(Color.decode("#00acc1")); b18.setBackground(Color.decode("#d81b60")); b19.setBackground(Color.white); b20.setBackground(Color.white);
                    next.setBackground(Color.blue);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.black);
                    finish.setBackground(Color.black);
                    finish2.setBackground(Color.black);
                }else{
                    setBackground(Color.black);
                    b1.setBackground(Color.blue); b2.setBackground(Color.blue); b3.setBackground(Color.pink); b4.setBackground(Color.cyan);
                    b5.setBackground(Color.blue ); b6.setBackground(Color.blue); b7.setBackground(Color.decode("#0a8f08")); b8.setBackground(Color.cyan); 
                    b9.setBackground(Color.decode("#00897b")); b10.setBackground(Color.decode("#7cb342")); b11.setBackground(Color.magenta); b12.setBackground(Color.orange);
                    b13.setBackground(Color.decode("#4e6cef")); b14.setBackground(Color.decode("#c0ca33")); b15.setBackground(Color.magenta); b16.setBackground(Color.orange);
                    b17.setBackground(Color.decode("#00acc1")); b18.setBackground(Color.decode("#d81b60")); b19.setBackground(Color.white); b20.setBackground(Color.white);
                    next.setBackground(Color.darkGray);
                    next.setForeground(Color.white);
                    base.setBackground(Color.white);
                    Start.setForeground(Color.white);
                    finish.setBackground(Color.red);
                    finish2.setBackground(Color.red);
                    }
                    break;

                
                default:
                    throw new AssertionError();
            }
        }
    }
        

