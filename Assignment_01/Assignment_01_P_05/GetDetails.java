package Assignment_01_P_05;
import java.util.Scanner;

public class GetDetails {
    Scanner input = new Scanner(System.in);
    String name,serial_No;
    int age; double salary;
    void getData(){
        //String input
        System.out.println("Enter The Employee Name:");
        name = input.nextLine();
        System.out.println("Enter The Employee Serial No :");
        serial_No = input.nextLine();
       //Integer Input
        System.out.println("Enter The Employee Age :");
        age = input.nextInt();
        System.out.println("Enter The Employee Salary :");
        salary = input.nextDouble();
    }


}
