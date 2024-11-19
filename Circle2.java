package Problem4;

public class Circle2 extends Shape2 {
    private double radius;

    public Circle2(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}

