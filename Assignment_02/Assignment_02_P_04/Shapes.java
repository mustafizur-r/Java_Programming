package Assignment_02_P_04;

public class Shapes extends Areas {

    @Override
    int Rectangle(){
        return (length*width);
    }
    @Override
    double Triangle(){
        return (.5*length*height);
    }
    @Override
    int Square(){
        return (length*length);
    }
}
