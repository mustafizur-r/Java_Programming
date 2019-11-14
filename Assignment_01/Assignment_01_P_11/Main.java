package Assignment_01_P_11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SavingAccount ob = new SavingAccount();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Saver1 Balance = ");
        double saver1 = input.nextDouble();
        ob.setSdollar1(saver1);
        System.out.println("Enter The Saver2 Balance = ");
        double saver2 = input.nextDouble();
        ob.setSdollar2(saver2);
        System.out.println("Enter The Annual Interest(%)rate= ");
        double in = input.nextDouble();
        SavingAccount.in = in;
        //Call SavingAccount
        
        System.out.println("Saver1 Saving Balance is                 = "+saver1);
        System.out.println("Saver1 New Balance With Monthly Interest = "+ob.interest(ob.getSdollar1()));
        System.out.println("Saver2 Saving Balance is                 = "+saver2);
        System.out.println("Saver2 New Balance With Monthly Interest = "+ob.interest(ob.getSdollar2()));
        
    }
}
