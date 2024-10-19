package university.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main_page extends JFrame implements ActionListener {
    Main_page(){
        //background image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Home1.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1536, 800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        //menu bar
        JMenuBar menubar=new JMenuBar();
        menubar.setBackground(Color.WHITE);
        
        //newinformation
        JMenu newinfo=new JMenu("New-Info");
        newinfo.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(newinfo);
        
        JMenuItem newstudent=new JMenuItem("New Student");
        newinfo.add(newstudent);
        newstudent.setFont(new Font("Times new Roman",Font.ITALIC,10));
        newstudent.addActionListener(this);
        newstudent.setBackground(Color.WHITE);
        
        JMenuItem newfaculty=new JMenuItem("New Faculty");
        newinfo.add(newfaculty);
        newfaculty.setFont(new Font("Times new Roman",Font.ITALIC,10));
        newfaculty.addActionListener(this);
        newfaculty.setBackground(Color.WHITE);
        
        //view detail
        JMenu viewinfo=new JMenu("View-Info");
        viewinfo.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(viewinfo);
        
        JMenuItem studentinfo=new JMenuItem("View Student Detail");
        viewinfo.add(studentinfo);
        studentinfo.setFont(new Font("Times new Roman",Font.ITALIC,10));
        studentinfo.addActionListener(this);
        studentinfo.setBackground(Color.WHITE);
        
        JMenuItem facultyinfo=new JMenuItem("View Faculty Detail");
        viewinfo.add(facultyinfo);
        facultyinfo.setFont(new Font("Times new Roman",Font.ITALIC,10));
        facultyinfo.addActionListener(this);
        facultyinfo.setBackground(Color.WHITE);
        
        
        
        //leave
        JMenu applyleave=new JMenu("Apply Leave");
        applyleave.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(applyleave);
        
        JMenuItem student_leave=new JMenuItem("Student Leave");
        applyleave.add(student_leave);
        student_leave.setFont(new Font("Times new Roman",Font.ITALIC,10));
        student_leave.addActionListener(this);
        student_leave.setBackground(Color.WHITE);
        
        JMenuItem faculty_leave=new JMenuItem("Faculty Leave");
        applyleave.add(faculty_leave);
        faculty_leave.setFont(new Font("Times new Roman",Font.ITALIC,10));
        faculty_leave.addActionListener(this);
        faculty_leave.setBackground(Color.WHITE);
        
        //Examinaton
        JMenu Exam=new JMenu("Examination");
        Exam.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(Exam);
        
        JMenuItem result=new JMenuItem("Exam Result");
        Exam.add(result);
        result.setFont(new Font("Times new Roman",Font.ITALIC,10));
        result.addActionListener(this);
        result.setBackground(Color.WHITE);
        
        JMenuItem marks=new JMenuItem("Enter Marks");
        Exam.add(marks);
        marks.setFont(new Font("Times new Roman",Font.ITALIC,10));
        marks.addActionListener(this);
        marks.setBackground(Color.WHITE);
        
        //update
        JMenu update=new JMenu("Update");
        update.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(update);
        
        JMenuItem update_student=new JMenuItem("Update Student Info");
        update.add(update_student);
        update_student.setFont(new Font("Times new Roman",Font.ITALIC,10));
        update_student.addActionListener(this);
        update_student.setBackground(Color.WHITE);
        
        JMenuItem update_faculty=new JMenuItem("Update Faculty Info");
        update.add(update_faculty);
        update_faculty.setFont(new Font("Times new Roman",Font.ITALIC,10));
        update_faculty.addActionListener(this);
        update_faculty.setBackground(Color.WHITE);
        
        //fee
        JMenu fee=new JMenu("Fee");
        fee.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(fee);
        
        
        JMenuItem fee_structure=new JMenuItem("Fee Structure");
        fee.add(fee_structure);
        fee_structure.setFont(new Font("Times new Roman",Font.ITALIC,10));
        fee_structure.addActionListener(this);
        fee_structure.setBackground(Color.WHITE);
        
        JMenuItem fee_form=new JMenuItem("Student Fee Form");
        fee.add(fee_form);
        fee_form.setFont(new Font("Times new Roman",Font.ITALIC,10));
        fee_form.addActionListener(this);
        fee_form.setBackground(Color.WHITE);
        
        //utility
        JMenu utility=new JMenu("Utility");
        utility.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(utility);
        
        JMenuItem notepad=new JMenuItem("NotePad");
        utility.add(notepad);
        notepad.setFont(new Font("Times new Roman",Font.ITALIC,10));
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        
        JMenuItem calc=new JMenuItem("Calculator");
        utility.add(calc);
        calc.setFont(new Font("Times new Roman",Font.ITALIC,10));
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
       
        
        // about
        JMenu about = new JMenu("About");
        about.setFont(new Font("Times new Roman",Font.ITALIC,20));
        menubar.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.setFont(new Font("Times new Roman",Font.ITALIC,10));
        ab.addActionListener(this);
        about.add(ab);
        //exit
        
        
        
        
        setJMenuBar(menubar);
        
        setSize(1536,820);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                
            }
        }else if(msg.equals("NotePad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                
            }
        }else if(msg.equals("New Student")){
            new Newstudent();
        }else if(msg.equals("New Faculty")){
            new Newteacher();
        }else if(msg.equals("Student Leave")){
            new StudentLeave();
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }else if(msg.equals("Update Student Info")){
            new UpdateStudent();
        }else if(msg.equals("Update Faculty Info")){
            new UpdateTeacher();
        }else if(msg.equals("Enter Marks")){
            new EnterMarks();
        }else if(msg.equals("Exam Result")){
            new ExaminationDetails();
        }else if(msg.equals("View Student Detail")){
            new Studentdetail();
        }else if(msg.equals("View Faculty Detail")){
            new Teacherdetail();
        }else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }else if(msg.equals("About")){
            new About();
        }
    }
    
  
    
    public static void main(String []args){
        new Main_page();
        
    }
    
}
