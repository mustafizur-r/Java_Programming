package Assignment_01_P_12;

public class Rectangle {
    private float length=1,weight=1;

   float perimeter(){
       float result = 2*(length+weight);
       return result;
   }
   float area(){
       float res = length*weight;
       return res;
   }
    
    
    
    
    
    
    
    
    
    
    
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
