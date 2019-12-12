package Assignment_03_P_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncrementButtonClick extends JFrame {
     private Container con;
     private JButton btn;
     private JTextField textField;
    int count = 0;

    IncrementButtonClick() {
        initComponents();
    }

    public void initComponents() {
        con = this.getContentPane();
        con.setBackground(Color.orange);
        con.setLayout(null);

        //For TextField
        textField = new JTextField();
        textField.setBounds(200,50,200,30);
        con.add(textField);
        //For Button
        btn = new JButton("  Click Me  ");
        btn.setForeground(Color.yellow);
        btn.setBackground(Color.BLUE);
        btn.setBounds(80,50,100,30);
        con.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                  count++;
                  textField.setText("Button Clicked  " +count);


            }
        });
    }
        public static void main(String[] args) {
            IncrementButtonClick ob = new IncrementButtonClick();
            ob.setTitle("Button Click Example");
            ob.setBounds(400,100,700,500);
            ob.setVisible(true);
            ob.setResizable(false);
            ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
        }

}
