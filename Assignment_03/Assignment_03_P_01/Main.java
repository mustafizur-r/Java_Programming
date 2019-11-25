package Assignment_03_P_01;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //a) Frame Class
//        Frame f = new Frame("MyFrame");
//        f.setSize(400,300);
//        f.setLocation(400,300);
//        f.setVisible(true);



       //b) JFrame Class

//        JFrame jf = new JFrame("MyFrame");
//        jf.setSize(400,300);
//        jf.setLocation(400,300);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setVisible(true);


     //c) Extends From JFrame
        MyFrame m = new MyFrame("My First GUI Frame");


    }
    //Only For (C)
    public static class MyFrame extends JFrame{
        MyFrame(String title){
            setTitle(title);
            setSize(400,300);
            setLocation(400,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

}
