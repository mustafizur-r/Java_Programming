
package Assignment_02_P_01;

public class Box3d extends Box {
    int height;
    Box3d(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
    int volume(){
        return (length*width*height);
    }



}
