
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class Newstudent extends JFrame implements ActionListener{
    
    JTextField tfname,tffname,tfaddress,tfphone,tfmail,tfx,tfxii,tfaadhar;
    JLabel tfrollno;
    JComboBox tfcourse,tfbranch;
    JButton submit,cancel;
    Random ran=new Random();
    Long no=Math.abs((ran.nextLong()%9000L)+1000L);
    
    JDateChooser dobchooser;
    
    Newstudent(){
        setSize(900, 700);
        setLocation(350, 50);
        
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel("New Student Information");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("Times new Roman",Font.ITALIC,25));
        add(heading);
        
        //name label
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(70, 120, 150, 30);
        lblname.setFont(new Font("serif", Font.ITALIC, 20));
        add(lblname);
        
        //name taextfield
        tfname = new JTextField();
        tfname.setBounds(200, 120, 150, 30);
        tfname.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfname);
        
        
        //father name label
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 120, 200, 30);
        lblfname.setFont(new Font("serif", Font.ITALIC, 20));
        add(lblfname);
        
        //fathername textfield
        tffname = new JTextField();
        tffname.setBounds(600, 120, 150, 30);
        tffname.setFont(new Font("serif", Font.ITALIC, 18));
        add(tffname);
        
        //label rollno
        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setBounds(70, 170, 150, 30);
        lblrollno.setFont(new Font("serif",Font.ITALIC, 20));
        add(lblrollno);
        
        //labelrolllno
        tfrollno = new JLabel("1533" + no);
        tfrollno.setBounds(200, 170, 150, 30);
        tfrollno.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfrollno);
        
        //date of birth
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 170, 1500, 30);
        lbldob.setFont(new Font("serif", Font.ITALIC, 20));
        add(lbldob);
        
        //caleender chosser
        dobchooser=new JDateChooser();
        dobchooser.setBounds(600, 170, 150, 30);
        dobchooser.setFont(new Font("serif", Font.ITALIC, 18));
        add(dobchooser);
        
        //address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(70, 220, 150, 30);
        lbladdress.setFont(new Font("serif", Font.ITALIC, 20));
        add(lbladdress);
        
        //testfield address
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 220, 150, 30);
        tfaddress.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfaddress);
        
        //label phone
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400, 220, 150, 30);
        lblphone.setFont(new Font("serif", Font.ITALIC, 20));
        add(lblphone);
        
        //textfield phone
        tfphone = new JTextField();
        tfphone.setBounds(600, 220, 150, 30);
        tfphone.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfphone);
        
        //mail label
        JLabel lblmail = new JLabel("E-mail");
        lblmail.setBounds(70, 270, 150, 30);
        lblmail.setFont(new Font("serif", Font.ITALIC, 20));
        add(lblmail);
        
        //mail taextfield
        tfmail = new JTextField();
        tfmail.setBounds(200, 270, 150, 30);
        tfmail.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfmail);
        
        //class 10 label
        JLabel lblx = new JLabel("10th %");
        lblx.setBounds(400, 270, 200, 30);
        lblx.setFont(new Font("serif", Font.ITALIC, 20));
        add(lblx);
        
        //textfield class 10 textfield
        tfx = new JTextField();
        tfx.setBounds(600, 270, 150, 30);
        tfx.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfx);
        
        //class 12 label
        JLabel lblxii = new JLabel("12th %");
        lblxii.setBounds(70, 320, 150, 30);
        lblxii.setFont(new Font("serif",Font.ITALIC, 20));
        add(lblxii);
        
        //class 12 taextfield
        tfxii = new JTextField();
        tfxii.setBounds(200, 320, 150, 30);
        tfxii.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfxii);
        
        //aadhar label
        JLabel lblaadhar = new JLabel("Aadhar no.");
        lblaadhar.setBounds(400, 320, 200, 30);
        lblaadhar.setFont(new Font("serif",Font.ITALIC, 20));
        add(lblaadhar);
        
        //aadhartextfield
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 320, 150, 30);
        tfaadhar.setFont(new Font("serif", Font.ITALIC, 18));
        add(tfaadhar);
        
        //courcelabel
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(70, 370, 150, 30);
        lblcourse.setFont(new Font("serif", Font.ITALIC, 20));
        add(lblcourse);
        
        //course textfoeld

        String course[] = { "B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA" };
        tfcourse = new JComboBox(course);
        tfcourse.setBounds(200, 370, 150, 30);
        tfcourse.setBackground(Color.WHITE);
        tfcourse.setFont(new Font("serif", Font.ITALIC, 15));
        add(tfcourse);
        
        //branch label
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(400, 370, 150, 30);
        lblbranch.setFont(new Font("serif", Font.ITALIC, 20));
        add(lblbranch);
        
        //branck textfoeld

        String branch[] = { "Computer Science", "Electronics", "Mechanical", "Civil", "IT" };
        tfbranch = new JComboBox(branch);
        tfbranch.setBounds(600, 370, 150, 30);
        tfbranch.setBackground(Color.WHITE);
        tfbranch.setFont(new Font("serif", Font.ITALIC, 15));
        add(tfbranch);
        
        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.ITALIC, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.ITALIC, 15));
        add(cancel);
        
        
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = tfrollno.getText();
            String dob = ((JTextField) dobchooser.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfmail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String course = (String) tfcourse.getSelectedItem();
            String branch = (String) tfbranch.getSelectedItem();
            
            try {
                String query = "insert into student values('" + name + "', '" + fname + "', '" + rollno + "', '" + dob
                        + "', '" + address + "', '" + phone + "', '" + email + "', '" + x + "', '" + xii + "', '"
                        + aadhar + "', '" + course + "', '" + branch + "')";

                Conn con = new Conn();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
        
    }
    public static void main(String []args){
        new Newstudent();
        
        
    }
    
}