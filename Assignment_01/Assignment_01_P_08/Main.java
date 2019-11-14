package Assignment_01_P_08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FindMaximum ob = new FindMaximum();
            System.out.println("The Maximum Double Number Is: "+FindMaximum.maximum(10.5,15.2,5.3));
            System.out.println("The Maximum Integer Number Is: "+ob.maximum(10,2,30));
            System.out.println("The Maximum Character Is: "+ob.maximum('a','b'));


    }

}
