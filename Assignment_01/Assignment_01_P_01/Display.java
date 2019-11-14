package Assign_01_p_1;

public class Display {
    String name = "Mustakim";
    //No return type and No parameter
    void display(){
        System.out.println("Hi, This is SAJU");
    }
    //No return type and with parameter list
    void display(String name){
        System.out.println("Hi, This is "+name);
    }
    String Concatination(){
       return ("Hi, This is "+name);
    }
    String Concatination(String name){
        return ("Hi,This is "+name);
    }
}
