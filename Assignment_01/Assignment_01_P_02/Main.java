package Assignment_01_P_02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Integer Number/String:");
        //For Armstrong Check
        Armstrong_Check a = new Armstrong_Check();
        //For Palindrome Check
        PalindromeNumber p = new PalindromeNumber();
        if(input.hasNextInt()) {

            int n = input.nextInt();
            a.armstrong(n);
            //For Palindrome Check
            //For Integer Value Check
            p.palindrome(n);
        }else {
            //For String Value Check
            String str = input.nextLine();
            p.palindrome(str);
        }





    }
}
