package Problem4;

public class Demo {
    public static void main(String[] args) {
        Shape2[] shapes = {
            new Circle2("Circle1", 5),
            new Ellipse2("Ellipse1", 7, 3),
            new Triangle2("Triangle1", 3, 4, 5),
            new EquilateralTriangle2("EquilateralTriangle1", 6)
        };

        System.out.println("Before scaling:");
        for (Shape2 shape : shapes) {
            System.out.println(shape);
        }

        scaleAll(shapes, 2);

        System.out.println("\nAfter scaling:");
        for (Shape2 shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
