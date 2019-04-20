package Generics.BoundedWildcards.Shapes.program;

import Generics.BoundedWildcards.Shapes.entities.Circle;
import Generics.BoundedWildcards.Shapes.entities.Rectangle;
import Generics.BoundedWildcards.Shapes.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Rectangle(3.0, 2.0));
        System.out.println("Total area: "+totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(3.0));
        myCircles.add(new Circle(5.0));
        System.out.println("Total area: "+totalArea(myCircles));
    }

    private static double totalArea(List<? extends Shape> myShapes) {
        double sum = 0.0;
        for (Shape s : myShapes){
            sum += s.area();
        }
        return sum;
    }
}
