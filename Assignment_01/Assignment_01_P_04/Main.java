
package Assignment_01_P_04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator obj = new Calculator();
        System.out.println("Enter Two Integer Number:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The Sum Of Two Number = "+obj.addition(a, b));
        System.out.println("The Subtraction Of Two Number = "+obj.subtraction(a, b));
        System.out.println("The Multiplication Of Two Number = "+obj.multiplicatioin(a, b));
       
        
    }
}
