package Assignment_02_P_05;

public class SecondBase extends FirstBase {
   protected String session,reg_No;

    SecondBase(String name,String address,String dept,String roll,String s,String r){
        super(name,address,dept,roll);
        session = s;
        reg_No = r;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Sesssion    : "+session);
        System.out.println("Reg. No     : "+reg_No);
    }
}
