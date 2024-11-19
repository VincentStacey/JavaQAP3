package Problem4;

public class Ellipse2 extends Shape2 {
    private double majorAxis;
    private double minorAxis;

    public Ellipse2(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) -
                Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
}

