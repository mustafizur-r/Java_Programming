package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Practice extends JFrame {
    Container con;
    JTextField t1,t2,t3,t4,t5;
    JComboBox comb;
    JRadioButton rb1,rb2;
    JLabel l1,l2,l3;
    JButton bt,bt2,bt3,bt4;
    ButtonGroup rbg;
    JCheckBox chb,chb2;
    JMenuBar mb;
    JMenu file,edit,view,code;
    JMenuItem New,open,recent;
    String st[] = {"Select one","Rupi","Dollar"};
    GUI_Practice(){
      initComponents();
    }
    void initComponents(){
        con = this.getContentPane();
        con.setLayout(null);
        //con.setBackground(Color.DARK_GRAY);

        //Menu Bar
        mb = new JMenuBar();
        mb.setBounds(0,0,700,30);
        mb.setBackground(Color.BLUE);
        con.add(mb);

        //Menu
        file = new JMenu("File");

        edit = new JMenu("Edit");
        view = new JMenu("View");
        code = new JMenu("Code");
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        mb.add(code);
        //MenuItem
        New = new JMenuItem("New");
        New.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JTextArea area=new JTextArea("Hi, I am Saju. I am From University Of Rajshahi");
                area.setBounds(50,30, 200,200);

                f.setBounds(50,30,300,300);
                f.setVisible(true);
                f.setLayout(null);
                f.add(area);
            }
        });
        open = new JMenuItem("Open");
        recent = new JMenuItem("Recent File");
        file.add(New);
        file.add(open);
        file.add(recent);



        l1 = new JLabel("Input Taka");
        l1.setBounds(50,20,200,30);
        l1.setForeground(Color.GREEN);
        con.add(l1);
        l2 = new JLabel("Output Currency");
        l2.setBounds(50,90,100,30);
        l2.setForeground(Color.GREEN);
        con.add(l2);

        t1 = new JTextField();
        t1.setBounds(50,50,100,30);
        con.add(t1);
        t2 = new JTextField();
        t2.setBounds(50,130,100,30);
        con.add(t2);

        comb = new JComboBox(st);
        comb.setBounds(160,50,100,30);
        con.add(comb);

        bt = new JButton("Convert");
        bt.setBounds(270,50,100,30);
        con.add(bt);

        bt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               if(e.getSource() == bt){
                    if(comb.getSelectedIndex()==1){
                       double currency = Double.parseDouble(t1.getText());
                       double curr = (currency/1.5);
                       t2.setText(String.valueOf(String.format("%.2f",curr)));

                   }
                    if(comb.getSelectedIndex()==2){
                       double currency = Double.parseDouble(t1.getText());
                       double curr = (currency/80);
                       t2.setText(String.valueOf(String.format("%.2f",curr)));

                   }
                }
            }
        });
         rbg = new ButtonGroup();
        rb1 = new JRadioButton("4 Slice");
        rb1.setBounds(50,180,100,30);
        con.add(rb1);
        rb2 = new JRadioButton("8 Slice");
        rb2.setBounds(160,180,100,30);
        con.add(rb2);
        rbg.add(rb1);
        rbg.add(rb2);
        bt2 = new JButton("Selected");
        bt2.setBounds(270,180,100,30);
        con.add(bt2);
        bt2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               String selected=null;
               if(rb1.isSelected()){
                 selected = rb1.getText();
               }
               if(rb2.isSelected()){
                   selected = rb2.getText();
               }
               t3.setText(selected);
           }
        });


        bt3 = new JButton("Selected");
        bt3.setBounds(270,220,100,30);
        con.add(bt3);
        bt3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String selected=null;
                if(chb.isSelected()){
                    selected = chb.getText();
                }
                if(chb2.isSelected()){
                    selected = chb2.getText();
                }
                t3.setText(selected);
            }
        });

        chb = new JCheckBox("Male");
        chb.setBounds(50,220,100,30);
        con.add(chb);
        rbg.add(chb);
        chb2 = new JCheckBox("FeMale");
        chb2.setBounds(160,220,100,30);
        con.add(chb2);
        rbg.add(chb2);

        t3 = new JTextField();
        t3.setBounds(50,260,100,30);
        con.add(t3);

        //For farenhait
        l3 = new JLabel("Enter The Factorial Number");
        l3.setBounds(50,300,200,30);
        con.add(l3);
        t4 = new JTextField();
        t4.setBounds(50,340,100,30);
        con.add(t4);
        t5 = new JTextField();
        t5.setBounds(50,390,100,30);
        con.add(t5);
        bt4 = new JButton("Convert");
        bt4.setBounds(160,340,100,30);
        con.add(bt4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int f=1;
                int n = Integer.parseInt(t4.getText());
                if(n<0){
                    JOptionPane.showMessageDialog(null,"Error! Factorial of a negative number doesn't exist.");
                }
                else {
                for(int i=1;i<=n;i++){

                    f = f*i;
                }
                t5.setText(String.valueOf(f));
            }}
        });


    }

    public static void main(String[] args) {
        GUI_Practice ob = new GUI_Practice();
        ob.setTitle("Calculate Factorial");
        ob.setBounds(350,100,700,500);
        ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ob.setVisible(true);
    }
}
