package Assignment_02_P_01;

public class Box3d extends Box {
    Box3d(int length, int width, int height) {
        super(length, width, height);
    }
    int area(){
        return (length*width);
    }
    int volume(){
        return (length*width*height);
    }



}
