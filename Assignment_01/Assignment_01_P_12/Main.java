package Assignment_01_P_12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Rectangle ob = new Rectangle();
        System.out.println("Enter The Length = ");
        float length = input.nextFloat();
        System.out.println("Enter The Weight = ");
        float weight = input.nextFloat();
        if((length > 0 && length<=20) && (weight > 0 && weight <=20)){
            ob.setLength(length);
            ob.setWeight(weight);
            System.out.println("Perimeter Of the Rectangle = "+ob.perimeter());
            System.out.println("Area Of the Rectangle      = "+ob.area());
        }else
        {
            System.out.println("Invalid Length & Weight");
        }
        
        
    }
}
