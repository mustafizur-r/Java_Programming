package Assignment_02_P_02;

public class MountainBike extends Bicyle {
    int seaHeight;
    MountainBike(int s, int g,int c,int h){
        super(s,g,c);
        seaHeight = h;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Bicyle Cadence is = "+seaHeight);
    }
}
