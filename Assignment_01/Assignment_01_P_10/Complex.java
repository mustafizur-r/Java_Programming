package Assignment_01_P_10;

public class Complex {
    private float real,imag;



    Complex(){
        //Nothing 
    }
    public Complex(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }
    Complex add(Complex comp2){
        Complex temp = new Complex();
        
        temp.real = real + comp2.real;
        temp.imag = imag + comp2.imag;
        return temp;
    }
    Complex subtract(Complex comp2){
       Complex temp = new Complex();
        temp.real = real - comp2.real;
        temp.imag = imag - comp2.imag;
        
        return temp;
    }
    void display(){
        System.out.println(real+" +i "+imag);
    }
    
    //Getter and Setter methods
    
    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImag() {
        return imag;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }
}
