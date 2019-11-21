package Assignment_02_P_05;

public class FirstBase {
    String Name,Address,dept;
    private String Roll;

   FirstBase(String name,String address,String dept,String roll){
       Name = name;
       Address = address;
       this.dept = dept;
       Roll = roll;
   }
   void display(){
       System.out.println("     Students Details");
       System.out.println("===================================");
       System.out.println("Name        : "+Name);
       System.out.println("Address     : "+Address);
       System.out.println("Dept.       : "+dept);
       System.out.println("Roll        : "+Roll);
   }

    //Getter And Setter method
    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }
}
