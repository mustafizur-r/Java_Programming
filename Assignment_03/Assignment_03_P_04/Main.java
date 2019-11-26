package Assignment_03_P_04;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
    private Container con;
    private Font font;
    private ImageIcon icon;
    private JLabel stlabel,stRoll,StName,StDept,stSession;
    private  JTextField Troll,Tname,Tdept,Tsession;
    private JButton btAdd,btDel,btSearch,btClose;
    private JMenuBar mb;
    private JMenu mfile,mopen,mview,medit;
    private JMenuItem openfile,save,saveas;
    
            
    
    Main(){
        initcomponent();
    }
    void initcomponent(){
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.DARK_GRAY);
        //For Font
        font = new Font("Arial",Font.BOLD,24);
        //For Icon
        icon = new ImageIcon("C:\\Users\\SAJU\\Documents\\saju\\src\\Assignment_03_P_04\\image.png");
        setIconImage(icon.getImage());


        stlabel = new JLabel("Student Record");
        stlabel.setForeground(Color.yellow);
        stlabel.setFont(font);
        stlabel.setBounds(250,10,200,50);
        con.add(stlabel);
        //Label
        stRoll = new JLabel("Roll  : ");
        stRoll.setForeground(Color.WHITE);
        stRoll.setBounds(200,60,100,50);
        con.add(stRoll);
        
        StName = new JLabel("Name  : ");
        StName.setForeground(Color.WHITE);
        StName.setBounds(200,100,100,50);
        con.add(StName);
        StDept = new JLabel("Dept :");
        StDept.setForeground(Color.WHITE);
        StDept.setBounds(200,140,100,50);
        con.add(StDept);
        stSession = new JLabel("Session :");
        stSession.setForeground(Color.WHITE);
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
        btAdd.setBackground(Color.green);
        con.add(btAdd);
        
        btDel = new JButton("Del");
        btDel.setBounds(420,115,100,20);
        btDel.setBackground(Color.green);
        con.add(btDel);
        
        btSearch = new JButton("Search");
        btSearch.setBounds(420,155,100,20);
        btSearch.setBackground(Color.green);
        con.add(btSearch);
        btClose = new JButton("Close");
        btClose.setBounds(420,195,100,20);
        btClose.setBackground(Color.green);
        con.add(btClose);
        //Menubar Add
        mb = new JMenuBar();
        mb.setBounds(5,1,700,20);
        mb.setBackground(Color.BLACK);
        con.add(mb);
        //Menubar Create
        mfile = new JMenu("File");
        mfile.setForeground(Color.blue);
        //for MenuItem
        openfile = new JMenuItem("Open File");
        mfile.add(openfile);
        save = new JMenuItem("Save File");
        mfile.add(save);
        saveas = new JMenuItem("Save As");
        mfile.add(saveas);
        mb.add(mfile);

        mopen = new JMenu("Open");
        mopen.setForeground(Color.blue);
        mb.add(mopen);
        medit = new JMenu("Edit");
        medit.setForeground(Color.blue);
        mb.add(medit);
        mview = new JMenu("View");
        mview.setForeground(Color.blue);
        mb.add(mview);
        
        
        
    }

    public static void main(String[] args) {
        Main ob = new Main();
        ob.setBounds(400,100,700,500);
        ob.setTitle("Student Details");
        ob.setResizable(false);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
