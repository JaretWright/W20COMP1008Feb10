import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TestingShapes {
    public static void main(String[] args)
    {
        //Create a couple of different shape objects
        Rectangle rectangle = new Rectangle(20,30);
        Circle circle = new Circle(15);

        //let's store those shapes in a collection...let's use ArrayList
        ArrayList<Shape> funShapes = new ArrayList();
        funShapes.add(rectangle);
        funShapes.add(circle);
//        funShapes.add(new Scanner(System.in));


        //We want to display the shape type and area
        for (Shape shape: funShapes)
            System.out.printf("%s had an area of %.2f%n", shape.getClass(),
                                                              shape.getArea());
    }
}
