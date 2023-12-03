package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername, tfpassword;
    
    Login() {
        
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 40, 100, 30);
        lblusername.setForeground(Color.BLUE);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 50, 150, 20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 100, 100, 30);
         lblpassword.setForeground(Color.BLUE);
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 105, 150, 20);
        add(tfpassword);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(150, 160, 150, 30);
        login.setBackground(Color.DARK_GRAY);
        login.setFont(new Font("Tahoma",Font.BOLD, 15));
        login.setForeground(Color.GREEN);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(340, 5, 250, 250);
        add(image);
        
        setSize(600, 300);
        setLocation(350, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                 new Loading();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid username or password!");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
