package Assignment_02_P_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Length :");
        int l = input.nextInt();
        System.out.println("Enter The Width :");
        int w = input.nextInt();
        System.out.println("Enter The Height :");
        int h = input.nextInt();
        Box3d ob = new Box3d(l,w,h);
        //Now call object of Box3d class
        System.out.println("The Area is   = "+ob.area());
        System.out.println("The Volume is = "+ob.volume());
    }
}
