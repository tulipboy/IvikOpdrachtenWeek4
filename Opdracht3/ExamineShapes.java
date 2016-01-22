package Opdracht3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tulip on 20/01/2016.
 */
public class ExamineShapes extends Shape{


    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(5.7, 4.5));
        shapes.add(new Circle(39.4));
        shapes.add(new Square(5.4));
        shapes.add(new Triangle(4,6,9));

        System.out.println("perimeters ");
        for (Shape vorm : shapes){
            System.out.println(vorm.getPerimeter());
        }

        System.out.println("area's: ");
            for (Shape vorm: shapes){
                System.out.println(vorm.getArea());
        }
    }

}
