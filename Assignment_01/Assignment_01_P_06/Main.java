package Assignment_01_P_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PasswordCheck obj = new PasswordCheck();
        System.out.print("Please enter a Password: ");
        String password = input.next();
        if (obj.isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        //Built in method
        
//        Builtin_method_passwordcheck built = new Builtin_method_passwordcheck();
//        System.out.print("Please enter a Password: ");
//        String pass = input.next();
//        if (built.isValid(pass)) {
//            System.out.println("Valid Password");
//        } else {
//            System.out.println("Invalid Password");
//        }
    }

}
