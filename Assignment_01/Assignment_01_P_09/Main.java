package Assignment_01_P_09;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentDetails ob = new StudentDetails();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Name: ");
        String name = input.nextLine();
        ob.name = name;
        System.out.println("Enter The Roll: ");
        String roll = input.nextLine();
        ob.setRoll(roll);
        System.out.println("Enter The Address:");
        String address = input.nextLine();
        ob.address = address;
        System.out.println("Enter The Reg_No : ");
        String reg_no = input.nextLine();
        ob.reg_No = reg_no;
        System.out.println("Enter The Department Name : ");
        String dept = input.nextLine();
        ob.dept = dept;
        System.out.println("Enter The Session : ");
        String session = input.nextLine();
        ob.session = session;
        System.out.println("Enter The Marks : ");
        double marks = input.nextDouble();
        ob.setMarks(marks);

        //For Calling StudentsDetails
            System.out.println("\t Student Details");
            System.out.println("================================");
            System.out.println("Name        : "+ob.name);
            System.out.println("Roll        : "+ob.getRoll());
            System.out.println("Address     : "+ob.address);
            System.out.println("Reg_No      : "+ob.reg_No);
            System.out.println("Deptartment : "+ob.dept);
            System.out.println("Session     : "+ob.session);
            System.out.println("Marks       : "+ob.getMarks());

    }
}
