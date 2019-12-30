
package assignment_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Person_Details extends JFrame {
    private Container c;
    public Connection conn;
    private JLabel plabel,idlabel,flabel,mlabel,Llabel,elabel,phlabel;
    public JTextField idtxt,ftxt,mtxt,ltxt,etxt,phtxt;
    public JButton newbtn,upbtn,delbtn,firstbtn,prebtn,nextbtn,lastbtn;
    Person_Details(){
        initComponents();
        create_Connection();
    }
    public void create_Connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/person","root","");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        plabel = new JLabel("<html><u>Person Details</u></html>");
        plabel.setBounds(320,10,250,30);
        plabel.setForeground(Color.BLUE);
        plabel.setFont(new Font("Arial", Font.BOLD, 32));
        c.add(plabel);

        //for Details label
        idlabel = new JLabel("ID");
        idlabel.setBounds(150,80,150,30);
        idlabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(idlabel);

        idtxt = new JTextField();
        idtxt.setBounds(310,80,300,30);
        c.add(idtxt);

        flabel = new JLabel("First Name");
        flabel.setBounds(150,120,150,30);
        flabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(flabel);

        ftxt = new JTextField();
        ftxt.setBounds(310,120,300,30);
        c.add(ftxt);

        mlabel = new JLabel("Middle Name ");
        mlabel.setBounds(150,160,150,30);
        mlabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(mlabel);

        mtxt = new JTextField();
        mtxt.setBounds(310,160,300,30);
        c.add(mtxt);

        Llabel = new JLabel("Last Name");
        Llabel.setBounds(150,200,150,30);
        Llabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(Llabel);

        ltxt = new JTextField();
        ltxt.setBounds(310,200,300,30);
        c.add(ltxt);

        elabel = new JLabel("Email");
        elabel.setBounds(150,240,150,30);
        elabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(elabel);

        etxt = new JTextField();
        etxt.setBounds(310,240,300,30);
        c.add(etxt);

        phlabel = new JLabel("Phone");
        phlabel.setBounds(150,280,150,30);
        phlabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(phlabel);

        phtxt = new JTextField();
        phtxt.setBounds(310,280,300,30);
        c.add(phtxt);
        //For Button
        newbtn = new JButton("New");
        newbtn.setBackground(Color.BLACK);
        newbtn.setForeground(Color.GREEN);
        newbtn.setBounds(50,400,110,30);
        newbtn.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(newbtn);
        //For NewButton Action
        newbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String sql = "insert into persondetails value (?, ?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1,Integer.parseInt(idtxt.getText()));
                    pstmt.setString(2,ftxt.getText());
                    pstmt.setString(3,mtxt.getText());
                    pstmt.setString(4,ltxt.getText());
                    pstmt.setString(5,etxt.getText());
                    pstmt.setString(6,phtxt.getText());

                    //For executeUpdate
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Inserted Person Details Successfully");
                    //conn.close();
                    idtxt.setText("");
                    ftxt.setText("");
                    mtxt.setText("");
                    ltxt.setText("");
                    etxt.setText("");
                    phtxt.setText("");
                }catch (Exception f){
                    JOptionPane.showMessageDialog(null,"Please Fill All The TextField");
                }

            }
        });


        upbtn = new JButton("Update");
        upbtn.setBackground(Color.BLACK);
        upbtn.setForeground(Color.GREEN);
        upbtn.setBounds(160,400,110,30);
        upbtn.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(upbtn);
        upbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sql = "update persondetails set FirstName=?,MiddleName=?,LastName=?,Email=?,Phone=? where id=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(6,Integer.parseInt(idtxt.getText()));
                    pstmt.setString(1,ftxt.getText());
                    pstmt.setString(2,mtxt.getText());
                    pstmt.setString(3,ltxt.getText());
                    pstmt.setString(4,etxt.getText());
                    pstmt.setString(5,phtxt.getText());

                    //For executeUpdate
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Updated Person Details Successfully");
                    //conn.close();
                    idtxt.setText("");
                    ftxt.setText("");
                    mtxt.setText("");
                    ltxt.setText("");
                    etxt.setText("");
                    phtxt.setText("");
                }
                catch (Exception u) {
                    JOptionPane.showMessageDialog(null,"Please Fill All The TextField");
                }
            }
        });

        delbtn = new JButton("Delete");
        delbtn.setBackground(Color.BLACK);
        delbtn.setForeground(Color.GREEN);
        delbtn.setBounds(270,400,110,30);
        delbtn.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(delbtn);
        delbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sql = "delete from persondetails where id=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1,Integer.parseInt(idtxt.getText()));
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Person Details Delete Successfully");
                    //conn.close();
                    idtxt.setText("");
                    ftxt.setText("");
                    mtxt.setText("");
                    ltxt.setText("");
                    etxt.setText("");
                    phtxt.setText("");
                } catch (Exception d) {
                    JOptionPane.showMessageDialog(null,"Please Fill All The TextField");
                }
            }   
        });


        firstbtn = new JButton("First");
        firstbtn.setBackground(Color.BLACK);
        firstbtn.setForeground(Color.GREEN);
        firstbtn.setBounds(380,400,110,30);
        firstbtn.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(firstbtn);
        firstbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sql = "select * from persondetails where id=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1,Integer.parseInt(idtxt.getText()));
                    ResultSet rs = pstmt.executeQuery();
//                    Statement st = null;
//                    ResultSet rs = st.executeQuery(sql);
                    if(rs.next()){
                        ftxt.setText(rs.getString("FirstName"));
                        mtxt.setText(rs.getString("MiddleName"));
                        ltxt.setText(rs.getString("LastName"));
                        etxt.setText(rs.getString("Email"));
                        phtxt.setText(rs.getString("Phone"));
                    }
                }catch (Exception f){
                    JOptionPane.showMessageDialog(null,"Please Fill All The TextField");
                }
            }
        });

        prebtn = new JButton("Prev");
        prebtn.setBackground(Color.BLACK);
        prebtn.setForeground(Color.GREEN);
        prebtn.setBounds(490,400,110,30);
        prebtn.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(prebtn);

        nextbtn = new JButton("Next");
        nextbtn.setBackground(Color.BLACK);
        nextbtn.setForeground(Color.GREEN);
        nextbtn.setBounds(600,400,110,30);
        nextbtn.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(nextbtn);

        lastbtn = new JButton("Last");
        lastbtn.setBackground(Color.BLACK);
        lastbtn.setForeground(Color.GREEN);
        lastbtn.setBounds(710,400,110,30);
        lastbtn.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(lastbtn);

      JLabel my = new JLabel("\u00A9"+" Developed By MMRSAJU");
      my.setForeground(Color.black);
      my.setBounds(675,530,250,30);
      my.setFont(new Font("Arial", Font.BOLD, 15));
      c.add(my);
    }
    public static void main(String[] args) {
        Person_Details ob = new Person_Details();
        ob.setTitle("Person Details");
        ob.setVisible(true);
        ob.setBounds(350,50,900,600);
        ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
        ob.setResizable(false);
    }

}
