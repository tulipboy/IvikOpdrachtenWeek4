package Opdracht3;

import java.lang.Math;
/**
 * Created by tulip on 19/01/2016.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double r){
        this.radius = r;
    }


    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public double getArea(){
        return (Math.PI * (this.radius * 2));
    }
}
