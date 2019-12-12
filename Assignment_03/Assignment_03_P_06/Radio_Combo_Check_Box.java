package Assignment_03_P_06;

import javax.swing.*;
import java.awt.*;

public class Radio_Combo_Check_Box extends JFrame {
    private Container con;
    private JLabel rlabel1,chlabel2,comlabel3;
    private JRadioButton rbtn1,rbtn2;
    private ButtonGroup btg;
    private JCheckBox checkBox1,checkBox2;
    private JComboBox comboBox1;
    private String[] animal = {"Select One","Bird","Cat","Dog","Rabbit","Cow"};

    Radio_Combo_Check_Box(){
        initComponents();
    }

    public void initComponents(){
        con = this.getContentPane();
        con.setBackground(Color.white);
        con.setLayout(null);
        //For Labels
        rlabel1 = new JLabel("Radio Button");
        rlabel1.setForeground(Color.BLUE);
        rlabel1.setBounds(10,10,100,20);
        con.add(rlabel1);

        //for Radio Button
        btg = new ButtonGroup();

        rbtn1 = new JRadioButton("4_Slices");
        rbtn1.setForeground(Color.green);
        rbtn1.setBackground(Color.white);
        rbtn1.setBounds(115,10,100,20);
        con.add(rbtn1);
        rbtn2 = new JRadioButton("8_Slices");
        rbtn2.setForeground(Color.green);
        rbtn2.setBackground(Color.white);
        rbtn2.setBounds(220,10,100,20);
        con.add(rbtn2);
        btg.add(rbtn1);
        btg.add(rbtn2);

        //For Check Boxes
        chlabel2 = new JLabel("Check Boxes");
        chlabel2.setForeground(Color.BLUE);
        chlabel2.setBounds(10,50,100,20);
        con.add(chlabel2);

        checkBox1 = new JCheckBox("Anchovies");
        checkBox1.setForeground(Color.green);
        checkBox1.setBackground(Color.white);
        checkBox1.setBounds(115,50,100,20);
        con.add(checkBox1);

        checkBox2 = new JCheckBox("Garlic");
        checkBox2.setForeground(Color.green);
        checkBox2.setBackground(Color.white);
        checkBox2.setBounds(220,50,100,20);
        con.add(checkBox2);
        btg.add(checkBox1);
        btg.add(checkBox2);

        //For ComboBox
        comlabel3 = new JLabel("Select Animal");
        comlabel3.setForeground(Color.BLUE);
        comlabel3.setBounds(10,100,100,20);
        con.add(comlabel3);


        comboBox1 = new JComboBox(animal);
        comboBox1.setBounds(120,100,100,20);
        con.add(comboBox1);


    }


    public static void main(String[] args) {
        Radio_Combo_Check_Box ob = new Radio_Combo_Check_Box();
        ob.setTitle("Radio/Combo/Check Box Example");
        ob.setBounds(400,100,700,500);
        ob.setVisible(true);
        ob.setResizable(false);
        ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
    }
}

