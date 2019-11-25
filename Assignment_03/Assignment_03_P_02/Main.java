package Assignment_03_P_02;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame master = new JFrame("Click to close Everything");
        master.setSize(400,400);
        master.setDefaultCloseOperation(master.EXIT_ON_CLOSE);
        master.setVisible(true);
        JFrame frame2 = new JFrame("Click to close Just this");
        frame2.setSize(400,300);
        frame2.setLocation(200,100);
        frame2.setDefaultCloseOperation(frame2.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);

    }
}
