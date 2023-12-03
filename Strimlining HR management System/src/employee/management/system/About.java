package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(800, 600);
        setLocation(300, 50);
        getContentPane().setBackground(Color.PINK);
        

        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(120, 0, 500, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Name: YUVARAJ DEKHANE");
        name.setBounds(20, 80, 550, 30);
        name.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(name);
        
        JLabel rollno = new JLabel("About:   Div:A, Roll NO: 315");
        rollno.setBounds(20, 120, 550, 30);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 15));
       rollno.setForeground(Color.blue);

        add(rollno);

         JLabel name1 = new JLabel("Name: Umar farooq Azmi");
        name1.setBounds(500, 80, 550, 30);
        name1.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(name1);
        
        JLabel rollno1 = new JLabel("About:   Div:A, Roll NO: 303");
        rollno1.setBounds(500, 120, 550, 30);
        rollno1.setFont(new Font("Tahoma", Font.PLAIN, 15));
       rollno1.setForeground(Color.blue);

        add(rollno1);
        
        JLabel contact = new JLabel("Contact: yuvarajdekhane@gmail.com");
        contact.setBounds(20, 150, 550, 30);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contact.setForeground(Color.blue);
        add(contact);

        JLabel labelDetails = new JLabel("User Role:  1) Admin\n  2) Employee\n");
        labelDetails.setBounds(20, 200, 550, 30);
        labelDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
        labelDetails.setForeground(Color.black);
        add(labelDetails);
        
        JLabel lbelFeature = new JLabel("Aim OF Project:");
        lbelFeature.setBounds(10, 240, 550, 30);
        lbelFeature.setFont(new Font("Tahoma", Font.BOLD, 15));
        lbelFeature.setForeground(Color.RED);
        add(lbelFeature);

        JLabel lblfeatures = new JLabel("The Employee Management System (EMS) is a comprehensive software solution designed  ");
        lblfeatures.setBounds(100, 270, 750, 30);
        lblfeatures.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblfeatures.setForeground(Color.black);
        add(lblfeatures);

        JLabel blfeatures = new JLabel("to streamline and automate various aspects of employee administration within an");
        blfeatures.setBounds(100, 290, 750, 30);
        blfeatures.setFont(new Font("Tahoma", Font.PLAIN, 15));
        blfeatures.setForeground(Color.black);
        add(blfeatures);

        JLabel halfLabel = new JLabel("organization. The aim of an Employee Management System is to enhance efficiency");
        halfLabel.setBounds(100, 310, 750, 30);
        halfLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        halfLabel.setForeground(Color.black);
        add(halfLabel);

         JLabel j = new JLabel("accuracy, and transparency in managing human resources. Here's an abstract outlining the ");
        j.setBounds(100, 330, 750, 30);
        j.setFont(new Font("Tahoma", Font.PLAIN, 15));
        j.setForeground(Color.black);
        add(j);

         JLabel l = new JLabel("Here are the primary aims of a UMS project:");
        l.setBounds(100, 350, 750, 30);
        l.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l.setForeground(Color.black);
        add(l);

        //  JLabel r = new JLabel("Requirement Of Project:");
        // r.setBounds(10, 400, 550, 30);
        // r.setFont(new Font("Tahoma", Font.BOLD, 15));
        // r.setForeground(Color.black);
        // add(r);

        
         JLabel ld = new JLabel(" Software:");
        ld.setBounds(200, 400, 750, 30);
        ld.setFont(new Font("Tahoma", Font.BOLD, 15));
        ld.setForeground(Color.BLUE);
        add(ld);

        JLabel x = new JLabel("1) NetBeans / VS Code");
        x.setBounds(270, 430, 750, 30);
        x.setFont(new Font("Tahoma", Font.PLAIN, 15));
        x.setForeground(Color.blue);
        add(x);

        JLabel y = new JLabel("2)JAVA( Swing, AWT, Awt Event concept)");
        y.setBounds(270, 450, 750, 30);
        y.setFont(new Font("Tahoma", Font.PLAIN, 15));
        y.setForeground(Color.blue);
        add(y);

        JLabel z = new JLabel("3)Windows 11pro");
        z.setBounds(270, 470, 750, 30);
        z.setFont(new Font("Tahoma", Font.PLAIN, 15));
        z.setForeground(Color.blue);
        add(z);


          JLabel thanks = new JLabel("T H A N K   Y O U ....");
        thanks.setBounds(270, 520, 750, 40);
        thanks.setFont(new Font("Tahoma", Font.BOLD, 30));
        thanks.setForeground(Color.RED);
        add(thanks);

        


        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
