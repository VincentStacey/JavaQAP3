package Problem4;

public class Triangle2 extends Shape2 {
    private double side1, side2, side3;

    public Triangle2(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("The given sides do not form a valid triangle.");
        }
    }

    @Override
    public double computeArea() {
        double s = (side1 + side2 + side3) / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sides: [" + side1 + ", " + side2 + ", " + side3 + "]";
    }
}
