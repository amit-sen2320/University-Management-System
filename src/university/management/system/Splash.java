package university.management.system;
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable {
    Splash(){
        Thread t=new Thread(this);
        t.start();
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/rgpv.jpg"));
       Image i2=i1.getImage().getScaledInstance(1100, 650, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       add(image);
        setVisible(true);
        
        setSize(1100,650);
        setLocation(220,40);

    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            //new frame
            new Login();
            
        }catch(Exception e){
            
        }
    }
    
    
    public static void main(String[]args){
        new Splash();
    }
    
}
