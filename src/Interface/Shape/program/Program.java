package Interface.Shape.program;

import Interface.Shape.entities.AbstractShape;
import Interface.Shape.entities.Circle;
import Interface.Shape.entities.Rectangle;
import Interface.Shape.enums.Color;

public class Program {
    public static void main(String[] args) {
        AbstractShape abstractShape = new Circle(Color.BLACK, 2.0);
        AbstractShape abstractShape1 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: "+ abstractShape.getColor());
        System.out.println("Circle Area: "+ String.format("%.3f", abstractShape.area()));
        System.out.println("Rectangle color: "+abstractShape1.getColor());
        System.out.println("Rectangle area: "+String.format("%.3f",abstractShape1.area()));
    }
}
