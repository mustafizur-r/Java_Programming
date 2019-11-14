package Assignment_01_P_05;

public class Main {
    public static void main(String[] args) {
        GetDetails obj = new GetDetails();
        obj.getData();
        System.out.println("\t\t Employee Details");
        System.out.println("=====================================");
        EmployeeDetails em1 = new EmployeeDetails(obj.name,obj.serial_No);
        EmployeeDetails em2 = new EmployeeDetails(obj.age,obj.salary);
    }
}
