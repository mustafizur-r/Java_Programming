package Assignment_01_P_10;

public class Main {
    public static void main(String[] args) {
        Complex comp1 = new Complex(5.5F,4.5F);
        Complex comp2 = new Complex(3.2F,1.5F);
        Complex results = new Complex();
        comp1.display();
        comp2.display();
        results = comp1.add(comp2);
        results.display();
        results = comp1.subtract(comp2);
        results.display();
        
        
    }
  
         
}
