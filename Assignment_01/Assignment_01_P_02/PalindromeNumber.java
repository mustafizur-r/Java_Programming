package Assignment_01_P_02;

public class PalindromeNumber {
    //For Integer Check
    void palindrome(int n){
        int s=0,temp,r;
        temp = n;
        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if (temp == s){
            System.out.printf("The %d Number Is palindrome\n",temp);
        }else {
            System.out.printf("The %d Number Is Not Palindrome\n",temp);
        }
    }
    //For String Check
    void palindrome(String str){
        int length = str.length();
        String reverse = "";
        for(int i=length-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.printf("The String '%s' is Palindrome\n",str);
        }else {
            System.out.printf("The String '%s' is Not Palindrome\n",str);
        }
    }
}
