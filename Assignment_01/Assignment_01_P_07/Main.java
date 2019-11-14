package Assignment_01_P_07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AscendingOrder ob = new AscendingOrder();
        DescendingOrder ob2 = new DescendingOrder();
        System.out.println("Enter The Array Size:");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.printf("Enter %d Element:\n",n);
        for(int i=0 ;i<n;i++){
            a[i] = input.nextInt();
        }
        System.out.printf("Your %d Elements Are:\n",n);
        
        for(int i=0 ;i<n;i++){
           System.out.printf("%d ",a[i]);
            
        }
        System.out.printf("\n");
        //For Ascending Order
        ob.Ascending(a);
        //For Descending Order
        ob2.Descending(a);
    }
            
       
}
