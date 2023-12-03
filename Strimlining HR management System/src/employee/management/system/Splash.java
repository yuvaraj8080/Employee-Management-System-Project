package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
	Thread t;

	Splash() {

		getContentPane().setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		JLabel internal = new JLabel("Internal Guide:");
		internal.setBounds(880, 530, 1200, 30);
		internal.setFont(new Font("Tahoma", Font.BOLD, 20));
		internal.setForeground(Color.BLACK);
		add(internal);

		JLabel guide = new JLabel("Frof. Priya Parathe");
		guide.setBounds(870, 565, 220, 30);
		guide.setFont(new Font("Tahoma", Font.BOLD, 20));
		guide.setForeground(Color.BLACK);
		add(guide);

		JLabel heading = new JLabel("      STREAMLING  HR  OPRATION");
		heading.setBounds(80, 5, 1200, 60);
		heading.setFont(new Font("Serif", Font.PLAIN, 60));
		heading.setForeground(Color.RED);
		add(heading);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(2, 63, 1150, 600);
		add(image);

		ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/college.png"));
        Image j2 = j1.getImage().getScaledInstance(500, 90, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel jimage = new JLabel(j3);
        jimage.setBounds(600, 0, 480, 100);
        image.add(jimage);

		JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
		clickhere.setBounds(400, 470, 300, 70);
		clickhere.setFont(new Font("Tahoma", Font.BOLD, 18));
		clickhere.setBackground(Color.DARK_GRAY);
		clickhere.setForeground(Color.GREEN);
		clickhere.addActionListener(this);
		image.add(clickhere);

		t = new Thread();
        t.start();
        // creating the frme and adjust the image icon
        setVisible(true);
        int x=1;
        for(int i=3; i<580; i+=4,x+=1){
        setLocation(350-i/2,290-i/2);
        setSize(i+4*x,i+x);

        try{
            Thread.sleep(20);
        }
        // next Frame open 
        catch(Exception e) {}
    }


		// setSize(1170, 700);
		// setLocation(70, 0);
		// setVisible(true);

		// for creating the dipple of the name:
		while (true) {
			heading.setVisible(false);
			try {
				Thread.sleep(400);
			} catch (Exception e) {

			}

			heading.setVisible(true);
			try {
				Thread.sleep(700);
			} catch (Exception e) {

			}
		}
	}

	//  automatically close this page \\

	
	// public void run(){
	// 	try{
	// 		   Thread.sleep(5000);
	// 		   setVisible(false);
	// 		   new Login();
	// 	}  
	//    catch(Exception e){
   
	// 	   }
	// 	}
   


	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}

	public static void main(String args[]) {
		new Splash();
	}
}
