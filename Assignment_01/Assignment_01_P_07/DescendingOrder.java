package Assignment_01_P_07;

public class DescendingOrder {
    void Descending(int a[]){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                }
            }
        }
        System.out.println("Descending Order:");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.println("\n");
        
    }
}
