package employee.management.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Loading extends JFrame implements Runnable{


    Thread t;
    JProgressBar bar;

    public void run(){
        try{
            for(int i=0; i<=101; i++){
                int max = bar.getMaximum();
                int value = bar.getValue();

                if(value < max){
                    bar.setValue(bar.getValue()+ 1);
                }
                else{
                    setVisible(false);
                    new Home();
                   
                }
                Thread.sleep(40);

            }
        }
        catch(Exception e){
         e.printStackTrace();
        }
    }


    Loading(){

        t = new Thread(this);

      setSize(550, 350);
      setLocation(380,100);

      getContentPane().setBackground(Color.PINK);
       setLayout(null);


     bar = new JProgressBar();
    bar.setBounds(80,150,400,25);
    bar.setStringPainted(true);

    add(bar);

    JLabel lbl = new JLabel("Loading please Wait...");
     lbl.setBounds(80,180,400,40);
     lbl.setFont(new Font("Tahoma",Font.BOLD,18));
     add(lbl);

      JLabel lblname = new JLabel("Employe Management System");
     lblname.setBounds(100,10,400,40);
     lblname.setFont(new Font("Tahoma",Font.BOLD,25));
     lblname.setForeground(Color.RED);
     add(lblname);
     
     t.start();

      setVisible(true);
    }


    public static void main(String[] args) {
        new Loading();

    }
    
}
