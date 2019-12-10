package Assignment_03_P_10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Degree_Conversion  extends JFrame{
    private Container con;
    private JTextField t1,t2;
    private JLabel l1,l2;
    private JButton bt;
    private JPanel panel;
    
    
    
     Degree_Conversion(){
        initcomponent();
    }
    void initcomponent(){
       con = this.getContentPane();
       con.setLayout(null);
       con.setBackground(Color.darkGray);
       
       l1 = new JLabel("Enter Fahrenheit Temperature:");
       l1.setBounds(10,50,200,20);
       l1.setForeground(Color.red);
       con.add(l1);
       t1 = new JTextField();
       t1.setBounds(200,50,200,20);
       con.add(t1);
       l2 = new JLabel("Temperature in Celsius:");
       l2.setBounds(10,85,200,20);
       l2.setForeground(Color.red);
       con.add(l2);
       t2 = new JTextField();
       t2.setBounds(200,85,200,20);
       con.add(t2);
       bt = new JButton("Convert");
       bt.setForeground(Color.red);
       bt.setBackground(Color.BLUE);
       bt.setBounds(300,120,100,20);
       con.add(bt);
      
       bt.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               double celsius, fahrenheit;
               fahrenheit = Double.parseDouble(t1.getText());
               celsius = 5*(fahrenheit-32)/9;
               t2.setText(String.valueOf(String.format("%.2f", celsius)));
             
            
           }
       });

       

    }
    public static void main(String[] args) {
        Degree_Conversion ob = new Degree_Conversion();
        ob.setBounds(400,100,700,500);
        ob.setTitle("Fahrenheit To Celsius");
        ob.setResizable(false);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
