package Problem4;

public class EquilateralTriangle2 extends Triangle2 {
    private double side;

    public EquilateralTriangle2(String name, double side) {
        super(name, side, side, side);
        this.side = side;
    }

    @Override
    public double computeArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public void scale(double factor) {
        side *= factor;
        super.scale(factor);
    }

    @Override
    public String toString() {
        return super.toString() + ", Side: " + side;
    }
}

