package Opdracht3;

/**
 * Created by tulip on 19/01/2016.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter(){
        return (a + b + c);
    }

    public double getArea(){
        double p = (a + b + c) / 2;
        return (p * a * b * c);
    }

}
