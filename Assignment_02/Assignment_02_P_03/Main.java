package Assignment_02_P_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumMain ob = new NumMain();
        System.out.println(ob.st);
        System.out.print("Enter The Character Which is Check = ");
        ob.ch = input.next().charAt(0);
        
        System.out.printf("Number of %c Occurs =",ob.ch );
        System.out.println(" "+ob.calNumOfOccur(ob.ch));
    }
}
