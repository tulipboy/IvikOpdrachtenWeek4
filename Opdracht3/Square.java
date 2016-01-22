package Opdracht3;

/**
 * Created by tulip on 19/01/2016.
 */
public class Square extends Shape {
    private double width;

    public Square (double a){
        this.width = a;

    }

    public double getPerimeter(){
        return 2.0 * (this.width * 2);
    }

    public double getArea(){
        return (this.width * 2);
    }
}
