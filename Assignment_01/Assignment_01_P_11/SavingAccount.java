package Assignment_01_P_11;

public class SavingAccount {
       static double in;
       private double sdollar1,sdollar2;
    double interest(double sdollar){
        double result = sdollar+(sdollar*in)/(12*100);
        return result;
    }

    public double getSdollar1() {
        return sdollar1;
    }

    public double getSdollar2() {
        return sdollar2;
    }

    
    public void setSdollar1(double sdollar1) {
        this.sdollar1 = sdollar1;
    }
    public void setSdollar2(double sdollar2) {
        this.sdollar2 = sdollar2;
    }
    
}
