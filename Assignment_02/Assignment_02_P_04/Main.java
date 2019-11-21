package Assignment_02_P_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Areas ob ;
        ob = new Shapes();
        System.out.print("Enter The length = ");
        ob.length = input.nextInt();
        System.out.print("Enter The Width = ");
        ob.width = input.nextInt();
        System.out.print("Enter The Height = ");
        ob.height = input.nextInt();
        //for display
        System.out.println("Area of Rectangle is = "+ob.Rectangle());
        System.out.println("Area of Triangle is  = "+ob.Triangle());
        System.out.println("Area of Square is    = "+ob.Square());
    }
}
