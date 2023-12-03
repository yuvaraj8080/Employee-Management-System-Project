package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove, about;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1320, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1280, 650);
        add(image);

        
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(650, 5, 600, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(550, 70, 150, 35);
        add.addActionListener(this);
        add.setForeground(Color.GREEN);
        add.setFont(new Font("Tahoma",Font.BOLD,13));
        image.add(add);
        
        about = new JButton("About Project");
        about.setBounds(900, 70, 150, 35);
        about.addActionListener(this);
        about.setForeground(Color.GREEN);
        about.setFont(new Font("Tahoma",Font.BOLD,13));
        image.add(about);
        
        view = new JButton("View Employees");
        view.setBounds(720, 70, 150, 35);
         view.setForeground(Color.GREEN);
        view.setFont(new Font("Tahoma",Font.BOLD,13));
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(550, 120, 150, 35);
         update.setForeground(Color.BLUE);
        update.setFont(new Font("Tahoma",Font.BOLD,11));
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(720, 120, 150, 35);
         remove.setForeground(Color.RED);
        remove.setFont(new Font("Tahoma",Font.BOLD,11));
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1290, 650);
        setLocation(0,0 );
        setVisible(true);

       }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            new AddEmployee();
        }
         else if (ae.getSource() == view) {
            new ViewEmployee();
        } 
        else if (ae.getSource() == update) {
            new ViewEmployee();
        }
         else if (ae.getSource() == remove) {
            new RemoveEmployee();
        }
        else{
            new About();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
