package Opdracht3;

/**
 * Created by tulip on 19/01/2016.
 */
public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle (double a, double b){
        this.width = a;
        this.height = b;
    }

    public double getPerimeter(){
        return 2.0 * (this.width + this.height);
    }

    public double getArea(){
        return (this.height * this.width);
    }

}
