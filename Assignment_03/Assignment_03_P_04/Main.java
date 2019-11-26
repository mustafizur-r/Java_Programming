package Assignment_03_P_04;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Main extends JFrame{
    private Container con;
    private JLabel stlabel,stRoll,StName,StDept,stSession;
    private  JTextField Troll,Tname,Tdept,Tsession;
    private JButton btAdd,btDel,btSearch,btClose;
            
    
    Main(){
        initcomponent();
    }
    void initcomponent(){
        con = this.getContentPane();
        con.setLayout(null);
        stlabel = new JLabel("Student Record");
        stlabel.setBounds(300,10,100,50);
        con.add(stlabel);
        //Label
        stRoll = new JLabel("Roll  : ");
        stRoll.setBounds(200,60,100,50);
        con.add(stRoll);
        
        StName = new JLabel("Name  : ");
        StName.setBounds(200,100,100,50);
        con.add(StName);
        StDept = new JLabel("Dept :");
        StDept.setBounds(200,140,100,50);
        con.add(StDept);
        stSession = new JLabel("Session :");
        stSession.setBounds(200,180,100,50);
        con.add(stSession);
        
        //TextField
        Troll = new JTextField();
        Troll.setBounds(260,75,150,20);
        con.add(Troll);
        Tname = new JTextField();
        Tname.setBounds(260,115,150,20);
        con.add(Tname);
        Tdept = new JTextField();
        Tdept.setBounds(260,155,150,20);
        con.add(Tdept);
        Tsession = new JTextField();
        Tsession.setBounds(260,195,150,20);
        con.add(Tsession);
        
        //Button
        btAdd = new JButton("Add");
        btAdd.setBounds(420,75,100,20);
        con.add(btAdd);
        
        btDel = new JButton("Del");
        btDel.setBounds(420,115,100,20);
        con.add(btDel);
        
        btSearch = new JButton("Search");
        btSearch.setBounds(420,155,100,20);
        con.add(btSearch);
        btClose = new JButton("Close");
        btClose.setBounds(420,195,100,20);
        con.add(btClose);
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        Main ob = new Main();
        ob.setBounds(400,200,700,500);
        ob.setTitle("Student");
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
