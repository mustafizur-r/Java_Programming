package Assignment_03_P_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_Color_Change extends JFrame {

    private Container con;
    private JButton btnred,btngreen;

    Button_Color_Change(){
        initComponents();
    }
    public void initComponents() {
        con = this.getContentPane();
        con.setLayout(null);

        //For Button
        btnred = new JButton("Red");
        btnred.setBounds(250, 20, 100, 50);
        btnred.setBackground(Color.RED);
        con.add(btnred);

        btngreen = new JButton("Green");
        btngreen.setBounds(355, 20, 100, 50);
        btngreen.setBackground(Color.GREEN);
        con.add(btngreen);

        //For Btn Action
        btnred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.setBackground(Color.RED);
            }
        });
        btngreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.setBackground(Color.GREEN);
            }
        });

    }



    public static void main(String[] args) {
        Button_Color_Change ob = new Button_Color_Change();
        ob.setTitle("Button Color Change Example");
        ob.setBounds(400,100,700,500);
        ob.setVisible(true);
        ob.setResizable(false);
        ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
    }
}
