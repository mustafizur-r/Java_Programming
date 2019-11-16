package Assignment_02_P_02;

public class Bicyle {
    int speed,gear,cadence;
    Bicyle(int s,int g,int c){
        speed = s;
        gear = g;
        cadence = c;
    }
    void display(){
        System.out.println("Bicyle speed is = "+speed);
        System.out.println("Bicyle Gear is = "+gear);
        System.out.println("Bicyle Cadence is = "+cadence);
    }
}
