package Assignment_01_P_03;

public class Main {
    public static void main(String[] args) {
        String name = "Saju";
        //with parameters
        DisplayName obj1 = new DisplayName(name);
        obj1.display();
        //without parameters
        DisplayName obj2 = new DisplayName();
        obj2.display();

    }
}
