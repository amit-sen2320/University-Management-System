 package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton Login;
    
    JButton Cancel;
    JTextField t1;
    JTextField t2;
    
    Login(){
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel l1=new JLabel("User-Name");
        l1.setBounds(100,65,100,20);
        l1.setFont(new Font("Times new Roman",Font.ITALIC,20));
        add(l1);
        t1=new JTextField();
        t1.setBounds(250,65,200,20);
        t1.setFont(new Font("Times new Roman",Font.ITALIC,16));
        add(t1);
                 
        
        JLabel l2=new JLabel("Password");
        l2.setBounds(100,95,100,20);
        l2.setFont(new Font("Times new Roman",Font.ITALIC,20));
        add(l2);
        t2=new JPasswordField();
        t2.setBounds(250,95,200,20);
        t2.setFont(new Font("Times new Roman",Font.ITALIC,16));
        add(t2);
        
        Login=new JButton("Login");
        Login.setBounds(150, 140, 100, 25);
        Login.setFont(new Font("Times new Roman",Font.ITALIC,15));
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        add(Login);
        Login.addActionListener(this);
                
        
        Cancel=new JButton("Cancel");
        Cancel.setBounds(270, 140, 100, 25);
        Cancel.setFont(new Font("Times new Roman",Font.ITALIC,15));
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        add(Cancel);
        Cancel.addActionListener(this);
        
        
        
        
        
        
        setSize(550,325);
        setLocation(495,162);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Login){
            String username=t1.getText();
            String password=t2.getText();
            
            String query = "select * from login where username='"+ username +"' and password='"+ password+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Main_page();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==Cancel){
            setVisible(false);
        }
        
    }
    public static void main(String []args){
        new Login();
        
    }
    
}
