package Assignment_01_P_03;

public class DisplayName {
    String name;
    DisplayName(){
        name = "Unknown";
    }
    DisplayName(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Student Name is "+name);
    }
}
