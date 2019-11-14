package Assignment_01_P_02;

public class Armstrong_Check {
   void armstrong(int n){
       int c=0,temp,a;
       temp = n;
       while (n>0){
           a = n%10;
           n = n/10;
           c = c + (a*a*a);
       }
       if (temp == c){
           System.out.printf("The %d Number is Armstrong\n",temp);
       }else {
           System.out.printf("The %d Number is Not Armstrong\n",temp);
       }

   }
}
