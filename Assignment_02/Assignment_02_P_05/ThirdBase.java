package Assignment_02_P_05;

public class ThirdBase extends SecondBase {
    private double Marks;

    ThirdBase(String name,String address,String dept,String roll,String s,String r,double m){
        super(name,address,dept,roll,s,r);
        Marks = m;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Marks       : "+Marks);
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double marks) {
        Marks = marks;
    }
}
