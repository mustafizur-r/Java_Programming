package Assignment_01_P_08;

public class FindMaximum {
    int maximum(int a, int b, int c){
        if(a>b && a>c) return a;
        else if(b>c && b>a) return b;
        else
            return c;
    }
    static double maximum(double a,double b,double c){
        if(a>b && a>c)
            return a;
        else if(b>c && b>a)
            return b;
        else
            return c;
    }
    char maximum(char a, char b){
        if(a>b)
            return a;
        else
            return b;
    }
}
